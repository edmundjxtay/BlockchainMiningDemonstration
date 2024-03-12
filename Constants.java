package com.Bells.Course3Project;

public class Constants
{
    private Constants()
    {

    }
    //Difficulty in mining is defined by the leading zeros
    //Difficulty is set to 1 so it will have 1 leading zero 0
    public static final int difficulty = 1;
    public static final double minerReward = 10;

    //Previous hash value is all 64 zeros (represented in Hex. 1 Hex = 4 bits. SHA256 have 256 bits)
    //because it is the Genesis block, block0, which has no previous block hash to reference to.
    public static final String genesisPreviousHash = "0000000000000000000000000000000000000000000000000000000000000000";
}
