package machine;


public class Methods {
    static void makeCoffee(){
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }
    static  void putInd(){
        System.out.println("Write how many ml of water the coffee machine has:");
        second.water+=second.scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        second.milk+=second.scanner.nextInt();
        System.out.println("Write how many g of coffee beans the coffee machine has:");
        second.beans+=second.scanner.nextInt();
        System.out.println("Write how many cups the coffee machine has:");
        second.dispcups+=second.scanner.nextInt();


//        second.cups=Math.min(second.water/200,Math.min(second.milk/50,second.beans/15));
//        ingredients();

    }
    static void details(){
        System.out.println("\nThe coffee machine has:");
        System.out.println(second.water+" ml of water");
        System.out.println(second.milk+" ml of milk");
        System.out.println(second.beans+" g of coffee beans");
        System.out.println(second.dispcups+" disposable cups");
        System.out.println("$"+second.cash+" of money");
    }
    static void buy() throws NumberFormatException{
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back-to main menu:");
        String choi=second.scanner.next().trim();
        int cash=0;
        int water=0;
        int beans=0;
        int milk=second.milk;
        switch (choi){
            case "back":
                return;
            case "1":
                cash=4;
                water=second.water-250;
                beans=second.beans-16;
                break;
            case "2":
                cash=7;
                water=second.water-350;
                beans=second.beans-20;
                milk=second.milk-75;
                break;
            case "3":
                cash=6;
                water=second.water-200;
                beans=second.beans-12;
                milk=second.milk-100;
                break;
        }
        if(water<0){
            System.out.println("Sorry, not enough water!");
        }
        else if(milk<0){
            System.out.println("Sorry, not enough milk!");
        }
        else if(beans<0){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else if((second.dispcups-1)<0){
            System.out.println("Sorry, not enough disposable cups");
        }
        else if (water>=0 & beans>=0 & milk>=0 & (second.dispcups-1)>=0 ){
            second.cash+=cash;
            second.water=water;
            second.milk=milk;
            second.beans=beans;
            second.dispcups--;
            System.out.println("I have enough resources, making you a coffee!");

        }



    }

    static void actions(){

        System.out.println("\nWrite action (buy,fill,take,remaining,exit):");
        String str=second.scanner.next();
        switch (str){
            case "buy":
                buy();
                break;
            case "fill":
                putInd();
                break;
            case  "take":
                System.out.println("I gave You $"+second.cash);
                second.cash=0;
                break;
            case "remaining":
                details();
                break;
            case "exit":
                System.exit(0);
        }
//        details();
    }


    static void ingredients(){
        System.out.println("Write how many cups of coffee you will need:");
        int cups=CoffeeMachine.scanner.nextInt();
        int water=cups*200;
        int milk=cups*50;
        int coffee=cups*15;
        int diff=second.cups-cups;
        if(diff>0){
            System.out.println("Yes, I can male that amount of coffee ( and even "+diff+" more than that)");
        }
        else if(diff==0){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else{
            System.out.println("No, I can make only "+second.cups+" cup(s) of coffee");
        }
//


    }
}
