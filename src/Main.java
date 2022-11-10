public class Main {
    public static void main(String[] args) {
       //Problem 6
       System.out.println("Problem 6");

       var boxer = 78.2;
       System.out.println(boxer);
       var boxer2 =82.7;
       System.out.println(boxer2);
       var boxerWeight = boxer + boxer2;
       System.out.println("combine weight of two boxers is "  +boxerWeight+  "kg'" );

       var odds = boxer2 - boxer;
       System.out.println("one boxer bigger then other on " +odds+ "kg");



       //problem 7
       System.out.println("Problem 7");
       var weightDifference = boxer2 - boxer;
       System.out.println("First weight differance is: "+weightDifference+ "kg");
       var weight2 = boxer2 % boxer;
       System.out.println("Second Weight differences is:"  +weight2+ "kg");


       //problem 8
       System.out.println("Problem 8");
       var allTogetherTime = 640;
       System.out.println(allTogetherTime);
       var personalTime  = 8;
       System.out.println(personalTime);
       var workers = 640 / 8;
       System.out.println("all Together in company working "  +workers+  "people ");

       var workers2 = 80;
       System.out.println(workers2);
       var workers3 = 94;
       System.out.println(workers3);
       var newWorkers = workers2 + workers3;
       System.out.println(newWorkers);
       var newHours = newWorkers * personalTime;
       System.out.println("If in this company working " +newWorkers+ "workers , workers  will work " +newHours+ "amount of hours  ");

    }
}



