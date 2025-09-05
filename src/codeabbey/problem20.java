package codeabbey;

import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < num; i++){
            String input = sc.nextLine();
            int vowel = 0;
            for(int j = 0 ; j < input.length() ; j++){
                if(input.substring(j,j+1).equals("a") || input.substring(j,j+1).equals("e")
                || input.substring(j, j+1).equals("i") || input.substring(j,j+1).equals("o")
                || input.substring(j,j+1).equals("u") || input.substring(j,j+1).equals("y")){
                    vowel++;
                }
            }
            System.out.println(vowel + " ");
        }
    }
}
