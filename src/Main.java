import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Punkt 1
        if(6>3){
            System.out.println("Hello, World!");
        }

        //Punkt 2+3
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv användarnman");
        String userName = sc.nextLine();
        System.out.println("Skriv lösen");
        String pass = sc.nextLine();
        if(userName.equals("noname") && pass.equals("nopass")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Wrong username or password");
        }

        //Punkt 4
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World");
        }

        //Punkt 5
        String key;
        boolean locked = true;
        while(locked){
            System.out.println("Skriv rätt lösen");
            key = sc.nextLine();
            if(key.equals("fel")){
                locked = false;
            }
        }
        //Punkt 6
        for (int i = 0; i < 5; i++) {
            System.out.println("Skriv ett tal");
            String num = sc.nextLine();
            try{
                int checknum = Integer.parseInt(num);
                if(checknum > 5){
                    System.out.println("högre än 5!");
                }
            }catch (Exception e){
                System.out.println("ett tal dumbo");
            }

        }
        //Punkt 7
        boolean dumbo = true;
        while(dumbo){
            System.out.println("Skriv ett tal");
            String num = sc.nextLine();
            try {
                int checknum = Integer.parseInt(num);
                dumbo = false;
            }catch (Exception e){
                System.out.println("ett tal dumbo");
            }
        }
        //Punkt 8 / slutövning
        Random rand = new Random();
        int correctNum = rand.nextInt(10);
        boolean falseGuess = true;
        while(falseGuess){
            System.out.println("Skriv ett tal");
            String num = sc.nextLine();
            try{
                int checknum = Integer.parseInt(num);
                if(checknum == correctNum){
                    System.out.println("Rätt!");
                    falseGuess = false;
                } else if (checknum > correctNum) {
                    System.out.println("För högt");
                } else if (checknum < correctNum) {
                    System.out.println("För lågt");
                }
            }catch (Exception e){
                System.out.println("ett tal dumbo");
            }
        }


    }
}