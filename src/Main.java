import models.Calculator;

public class Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 54;
        int soucet = num1+num2;
        System.out.println("Součet:" + soucet);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        Calculator calc = new Calculator();
        int sum = calc.Sum(54,15);
        sum += 10;
        System.out.println(sum);
        System.out.println("posledni soucet: " + calc.getLastSum());

        calc.setLastSum(420);

        System.out.println("posledni soucet: " + calc.getLastSum());


        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();

        if(calc2 == calc3){
            System.out.println("calc jsou stejné");
        }
        else{
            System.out.println("calc nejsou stejné");
        }

        Calculator calc4 = calc2;
        if (calc2 == calc4){
            System.out.println("calc jsou stejné");
        }

        calc2.Sum(111,15);
        System.out.println(calc4);
    }
}