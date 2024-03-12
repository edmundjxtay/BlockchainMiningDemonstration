package com.Bells.Course3Project;

public class Miner
{
    private double reward;

    public void mine(Block block, Blockchain blockchain) {
        while (notGoldenHash(block)) {
            //generating the block hash
            block.generateHash();
            block.incrementNonce();
        }
        System.out.println(block + " had been mined successfully!");
        System.out.println("Hash is: " + block.getHash());
        //appending the block to the blockchain
        blockchain.addBlock(block);
        //Reward miner
        reward += Constants.minerReward;
    }

    //To generate hash values until the right one is found to match the difficulty
    public boolean notGoldenHash(Block block)
    {
        //Create a String with an empty char array to create String object of leading zeros. Size of array determined by difficulty level.
        //Fill in the array with character "0"
        String leadingZeros = new String(new char[Constants.difficulty]).replace('\0','0');
        //check the substring of the hash from the beginning to difficulty-1 in the char array for zeros.
        return !block.getHash().substring(0,Constants.difficulty).equals(leadingZeros);//return true if hash does not contain required leading zeros
    }
    public double getReward()
    {
        return this.reward;
    }
}
