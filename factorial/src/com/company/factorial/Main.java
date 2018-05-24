package com.company.factorial;

public class Main {

    public static void main(String[] args) {
        int answer1 = recursiveFactorial(6);
        int answer2 = iterativeFactorial(5);
        System.out.println(answer1);
        System.out.println(answer2);


    }

    public static int recursiveFactorial(int num){
        if(num==0){
            return 1;
        }

        return num*recursiveFactorial(num-1);

    }



//solution 2
    public static int iterativeFactorial(int num){
        if (num==0){return 1;}

        int factorial = 1;
        for(int i =1;i<= num;i++){

            factorial *= i;
        }

        return factorial;
    }
}
