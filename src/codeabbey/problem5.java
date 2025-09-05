package codeabbey;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0 ; i < num ; i++){
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            int input3 = sc.nextInt();
            int min = Math.min(input1, input2);
            min = Math.min(min, input3);
            System.out.println(min + " ");
        }
    }
}
