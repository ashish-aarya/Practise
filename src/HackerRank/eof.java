package HackerRank;

import java.util.Scanner;

public class eof {
	public static void main(String[] args) {

		Scanner scr= new Scanner (System.in);
		
	int line=1;;
		while (true)
		{
			String str = scr.nextLine();
			System.out.println(line+" "+str);
			line++;
			if (!scr.hasNext())
			{
				break;
			}
		}

	}

}
