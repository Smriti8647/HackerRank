import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[][][] possiblePermutations = {
            {{8,1,6},{3,5,7},{4,9,2}},{{6,1,8},{7,5,3},{2,9,4}},{{4,9,2},{3,5,7},{8,1,6}},{{2,9,4},{7,5,3},{6,1,8}},{{8,3,4},{1,5,9},{6,7,2}},
            {{4,3,8},{9,5,1},{2,7,6}},{{6,7,2},{1,5,9},{8,3,4}},
            {{2,7,6},{9,5,1},{4,3,8}},};

        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
                matrix[i][j] = input.nextInt();
        }

        int minCost = Integer.MAX_VALUE;
        for (int permutation = 0; permutation < 8; permutation++) 
        {
            int permutationCost = 0;
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++)
                    permutationCost += Math.abs(matrix[i][j] - possiblePermutations[permutation][i][j]);
            }
            minCost = Math.min(minCost, permutationCost);
        }
        System.out.println(minCost);
    }
}