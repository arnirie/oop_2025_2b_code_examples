package codeabbey;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < num; i++){
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            System.out.println(Math.min(input1, input2) + " ");
        }
    }
}
