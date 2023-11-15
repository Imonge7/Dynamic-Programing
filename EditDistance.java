//Makaluza
//Imonge
//4008241
//CSC212 2022 Practical 4 Term 2
//Question3.java

package com.company;

public class EditDistance {


    public int editDistDP(String str1, String str2) {

        int m  = str1.length();
        int n = str2.length();
        //Table of subproblems
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    dp[i][j] = j;

                else if (j == 0)
                    dp[i][j] = i;

                //compare char of both String in the index to see if they are equal
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                // consider all possibilities and find the minimum
                else
                    dp[i][j] = 1
                            + min(dp[i][j - 1], // Insert
                            dp[i - 1][j], // Remove
                            dp[i - 1][j - 1]); // Replace
            }
        }

        return dp[m][n];
    }
    //compares tree integers and returns the smallest of them
    private int min(int x, int y, int z)
    {
        if (x <= y && x <= z)
            return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }

}
