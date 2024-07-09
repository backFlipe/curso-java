package demoStringBuild;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Comment cmt1 = new Comment("Have a nice trip!");
		Comment cmt2 = new Comment("Wow, that's awesome!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post pst1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland", "I'm going to visit this beautiful country!", 12);

		pst1.addComments(cmt1);
		pst1.addComments(cmt2);
		
		System.out.println(pst1);
		
		Post pst2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		Comment cmt3 = new Comment("Good night");
		Comment cmt4 = new Comment("May the force be with you");
		
		pst2.addComments(cmt3);
		pst2.addComments(cmt4);
		
		System.out.println(pst2);
		
	}

}
