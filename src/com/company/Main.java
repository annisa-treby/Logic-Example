package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        bilanganPrima(1000);
        selisihMatrix();
        matrixKebalikan();
    }

    public static void bilanganPrima(Integer num){
        for(int i = 1; i < num; i++){
            if(i <= 5){
                if(i % 2 != 0){
                    System.out.print(i + " ");
                }
            } else {
                if(i % i == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                    System.out.print(i + " ");
                }
            }

        }
    }

    public static void selisihMatrix(){
        Integer[][] matrix = {{3,5,7},{8,2,1},{6,9,2}};

        Integer diagonal1 = 0;
        Integer diagonal2 = 0;
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                if (i == j) {
                    diagonal1 += matrix[i][j];
                }
                 if (2-i == j){
                    diagonal2 += matrix[i][j];
                }
            }
        }
        System.out.println(diagonal1);
        System.out.println(diagonal2);
        System.out.println(Math.abs(diagonal1-diagonal2));
    }

    public static void matrixKebalikan(){
        Integer[][] matrix = {{2,6,9},{1,5,8},{7,2,7}};
        Integer[][] result = new Integer[3][3];
        for (int i=0; i< 3; i++){
            for(int j=0; j < 3; j++){
                result[i][j]= matrix[j][2-i];
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
