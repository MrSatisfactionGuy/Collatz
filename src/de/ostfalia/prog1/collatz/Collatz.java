package de.ostfalia.prog1.collatz;

import java.util.Scanner;

// ist num gerade, rechne: num = num / 2;
// ist num ungerade, rechne: num = 3 * num + 1;

public class Collatz {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();
        s.close();

        int counter = 0;

        while (num != 1)
        {
            if (num % 2 == 0) num = num /2;
            if (num % 2 != 0) num = (3 * num) + 1;

            counter++;
            System.out.println(num);

        }

        //Ihre Lösung hier

        System.out.printf("Es hat %d Schritte gebraucht, um die 1 zu erreichen.", counter);
        
    }
}
