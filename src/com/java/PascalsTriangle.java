package com.java;

import java.util.Scanner;

public class PascalsTriangle
{
    public static void main(String args[])
    {
        int i, k, number=1, j;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number of Pascals : ");
        int input = scan.nextInt();

        for(i=0;i<input;i++)
        {
            for(k=input; k>i; k--)
            {
                System.out.print(" ");
            }
            number = 1;
            for(j=0;j<=i;j++)
            {
                System.out.print(number+ " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which line of Pascal's Triangle? ");
        int row = scanner.nextInt();
        System.out.print("Line " +row+" of Pascal's Triangle is:\n");
        computeRow(row);
    }

    public static void computeRow(int n) {
        int counter;
        for (int i = 0; i < n; i++) {
            // only output the line if it be the last one
            if (i == n-1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(pascalValue(i, j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static int pascalValue(double i, double j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascalValue(i - 1, j - 1) + pascalValue(i - 1, j);
        }
    }
}