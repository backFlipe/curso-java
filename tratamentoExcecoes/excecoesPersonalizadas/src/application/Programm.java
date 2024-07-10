package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Programm {

	public static void main(String[] args) throws ParseException {
		
		//ESSA SOLUÇÃO DE PROBLEMA É PÉSSIMA PORQUE A CLASSE "Programm" ESTÁ RESOLVENDO UM PROBLEMA QUE A CLASSE "Reservation" DEVERIA RESOLVER
		
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Check-out date must be after check-in date!");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation.toString());
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Reservation dates for update must be future dates!");
			}
			else if(!checkOut.after(checkIn)) {
				System.out.println("Check-out date must be after check-in date!");
			}
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		
		}
		
		sc.close();
	}

}
