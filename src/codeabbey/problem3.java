package codeabbey;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] answer  =  new int[num];
        for(int i = 0 ; i < num ; i++){
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            answer[i] = input1 + input2;
        }
        for(int i = 0 ; i < answer.length ; i++){
            System.out.println(answer[i] + " ");
        }
    }
}
