package codeabbey;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = max;
        for(int i = 1 ; i < 300 ; i++){
            int input = sc.nextInt();
            max = Math.max(max, input);
            min = Math.min(min, input);
        }
        System.out.println(max);
        System.out.println(" ");
        System.out.println(min);
    }
}
