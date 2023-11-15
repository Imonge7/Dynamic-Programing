//Makaluza
//Imonge
//4008241
//CSC212 2022 Practical 4 Term 2
//Question2.java

package com.company;

public class MakingChange {

    public int change (int amount , int[] coins) {

        //Table of Sub problems
        int[] numberOfCombinations = new int[amount+1];

        numberOfCombinations[0] = 1;
        for (int coin : coins){
            for(int i = 1; i < numberOfCombinations.length; i++){

                if(i >= coin)
                    numberOfCombinations[i] += numberOfCombinations[i -coin];
            }
        }
        return numberOfCombinations[amount];
    }
}
