package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import elements.Elements;

public class Main {

	public static void main(String[] args) {
		
		Elements line = new Elements();
		
		//MODELOS DE FORMATAÇÃO
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("GMT"));
		
		///////////////////////
		//FORMATOS SIMPLES DE DATAS COM BASE NO SISTEMA
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		
		line.makeLine();
	
		/////////////////////////
		//FORMATOS DE DATA COM ESPECIFICAÇÃO DE VALOR
		
		LocalDate d04 = LocalDate.parse("2024-08-30");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-30T19:46:30");
		Instant d06 = Instant.parse("2024-08-30T19:46:30Z");
		Instant d07 = Instant.parse("2024-08-30T01:30:00-03:00");
		
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		
		line.makeLine();
		/////////////////////////
		//FORMATAÇÃO DE DATAS
		
		LocalDate d08 = LocalDate.parse("22/03/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("22/03/2024 22:30", fmt2);
		
		System.out.println(d08);
		System.out.println(d09);
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d07 = " + fmt3.format(d07));
		
		System.out.println("d03 no sistema local = " + fmt3.format(d03));
		System.out.println("d03 no Meridiano de Greenwich = " + fmt4.format(d03));
		
		line.makeLine();
		////////////////////
		//CONVERTENDO HORÁRIO GLOBAL PARA LOCAL
		
		LocalDate r1 = LocalDate.ofInstant(d07, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d07, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d07, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d07, ZoneId.of("Portugal"));
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		line.makeLine();
		//////////////////////
		//OBTENDO CADA ELEMENTO DA DATA
		
		System.out.println("Ano: " + r3.getYear());
		System.out.println("Mês: " + r3.getMonth());
		System.out.println("Dia: " + r3.getDayOfMonth());
		System.out.println("Hora: " + r3.getHour());
		System.out.println("Minuto: " + r3.getMinute());
		System.out.println("Segundo: " + r3.getSecond());
		
		line.makeLine();
		/////////////////////
		//CÁLCULOS COM DATA E HORA
		
		LocalDate x01 = LocalDate.parse("2024-08-25");
		
		System.out.println("x01 = " + x01.format(fmt1));
		
		LocalDate localDateX01 = x01.minusDays(7);
		LocalDate localDateX01Plus = x01.plusDays(7);
		
		System.out.println("localDateX01 = " + localDateX01.format(fmt1));
		System.out.println("localDateX01Plus = " + localDateX01Plus.format(fmt1));
		
		LocalDateTime x02 = LocalDateTime.parse("2024-08-20T01:30:23");
		
		System.out.println("x02 = " + x02.format(fmt2));
		
		LocalDateTime minusX02 = x02.minusHours(4);
		LocalDateTime plusX02 = x02.plusHours(4);
		LocalDateTime minusSecX02 = x02.minusSeconds(35);
		LocalDateTime plusSecX02 = x02.plusSeconds(40);
		
		System.out.println("minusX02 = " + minusX02.format(fmt2) );
		System.out.println("plusX02 = " + plusX02.format(fmt2) );
		System.out.println("minusSecX02 = " + minusSecX02.format(fmt2));
		System.out.println("plusSecX02 = " + plusSecX02.format(fmt2));

		Instant x03 = Instant.parse("2024-08-20T20:30:00Z");
		
		System.out.println("x03 = " + fmt4.format(x03));
		
		Instant minusX03 = x03.minus(7, ChronoUnit.DAYS);
		Instant plusX03 = x03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("minusX03 = " + fmt4.format(minusX03));
		System.out.println("plusX03 = " + fmt4.format(plusX03));
		
		line.makeLine();
		//////////////////
		//OBTENDO A DIFERENÇA ENTRE DUAS DATAS
		
		Duration t1 = Duration.between(minusX03, plusX03);
		Duration t2 = Duration.between(x01.atStartOfDay(), x02);
		Duration t3 = Duration.between(x03, d07);
		
		System.out.println("t1 = " + t1.toDays());
		System.out.println("t2 = " + t2.toDays());
		System.out.println("t3 = " + t3.toDays());
		
	}

}
