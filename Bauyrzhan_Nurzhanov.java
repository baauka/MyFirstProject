import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;


public class Bauyrzhan_Nurzhanov{

    public static final Scanner scan = new Scanner(System.in);

    public static void greeting(){
        String name;
        String city;
        System.out.println("Durystadym");
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: "); name = scan.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        city = scan.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");

    }

    public static void travelTimeBudget(){
        Scanner scan = new Scanner(System.in);
        int days,hours,minutes,seconds;
        double money;
        String currency;
        String rate;

        System.out.print("How many days are you going to spend travelling? "); days = scan.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: "); money = scan.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? "); scan.nextLine();
        currency = scan.nextLine().toUpperCase();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        rate = scan.nextLine();
        double main_rate = Double.parseDouble(rate.replace(',','.'));

        hours = days * 24;
        minutes = hours * 60;
        seconds = minutes * 60;
        String day_print = "";
        if(days == 1)
            day_print = "day";
        else
            day_print = "days";

        double daily_waste = (double)(money / days);



        DecimalFormat decfor = new DecimalFormat("#.##");
        decfor.setRoundingMode(RoundingMode.DOWN);


        System.out.println("If you are traveling for " + days + " " + day_print + " that is same as " + hours + " hours or " +
                minutes + " minutes or " + seconds + " seconds.");

        System.out.println("If you are going to spend $" + (double)money + " USD that means per day you can spend up to $" +
                decfor.format(daily_waste).replace(',','.') + " USD");

        double con_money = money * main_rate;
        double con_per_day = con_money / days;

        System.out.println("Your total budget in " + currency + " is " + con_money + " " + currency +
                " which per day is " + decfor.format(con_per_day).replace(',','.') + " " + currency);





    }

    public static void timeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? " );
        int time_dif = scan.nextInt();
        int midnight = 24;
        int noon = 12;

        int minus_midnight = (midnight - (Math.abs(midnight - time_dif)) % 24);
        if(minus_midnight == 24)
            minus_midnight = 0;

        int minus_noon = Math.abs(midnight - (Math.abs(noon - time_dif) % 24));
        if(minus_noon == 24)
            minus_noon = 0;



        if(time_dif >= 0){
            System.out.println("That means that when it is midnight at home it will be " + (((midnight + time_dif) % 24))
                    + ":00 in your travel destination and when it's noon at home it will be " + ((noon + time_dif) % 24) +
                    ":00");
        }else if(time_dif <= 0)
            System.out.println("That means that when it is midnight at home it will be " +
                    minus_midnight +
                    ":00 in your travel destination and when it's noon at home it will be " +
                    minus_noon + ":00");



    }

    public static void countryArea(){
        double miles_km =  0.38610215854245;
        double area_km;
        System.out.print("What is square area of your destination country in km2? ");
        area_km = scan.nextDouble();
        double area_miles = area_km * miles_km;
        DecimalFormat decfor = new DecimalFormat("#.##");
        decfor.setRoundingMode(RoundingMode.DOWN);
        System.out.println("In miles2 that is " + decfor.format(area_miles).replace(',','.'));
    }

    public static void nextDestination(){

        System.out.print("How many places you traveled to : ");
        int number;
        number = scan.nextInt();

        String[] arr = new String[number];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the name: ");
            arr[i] = scan.next();
        }

        System.out.println();

        String[] wanted_countries = {"Italy" , "England", "Netherlands" , "Germany", "France"};

        System.out.println("Next place you want to travel to :");
        System.out.println();

        for(int i = 0; i < wanted_countries.length; i++){

            System.out.println(i + ": " + wanted_countries[i]);

        }

        System.out.print("Your input should be -> ");
        int wanted_one = scan.nextInt();

        System.out.println("Thank you, Your next location is : " + wanted_countries[wanted_one - 1]);





    }


    public static void main(String[] args) {

//        greeting();
//        travelTimeBudget();
//        timeDifference();
//        countryArea();
//        nextDestination();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<String> grid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String gridItem = scan.next();
            grid.add(gridItem);
        }


    }
}

