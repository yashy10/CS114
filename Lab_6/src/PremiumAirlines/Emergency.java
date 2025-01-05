package PremiumAirlines;

import java.util.Arrays;
import java.util.Scanner;

public class Emergency {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Hi, 911 how can I help you");
        System.out.println("Please give me information in this format");
        System.out.println("Hello, my name is NAME. I need to report EVENT. Please come to WHERE.");

        String info = input.nextLine().toLowerCase();//input is Hello, my name is Yash.
        String[] nameSplit = info.split("hello, my name is ");
        String nameEtc = nameSplit[1];

        String[] eventSplit = nameEtc.split("i need to report a ");
        String name = eventSplit[0];
        String event = eventSplit[1];

        String[] locationSplit = event.split("Please come to ");
        String location = locationSplit[0];

        System.out.println(name + event + location);


    }
}
