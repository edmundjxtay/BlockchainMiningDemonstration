package com.Bells.Course3Project;

public class BlockchainProgram
{
    public static void main(String[] args)
    {
        //Instantiate the Blockchain class
        Blockchain blockchain = new Blockchain();
        System.out.println("\n"+"Blockchain Program: "+blockchain+"\n");

        //Instantiate the Miner class
        Miner miner = new Miner();

        //Create Genesis block or block0
        Block block0 = new Block(0,"transaction1",Constants.genesisPreviousHash);

        //miner will take the transaction and mine the block until the ideal hash value is achieved and append the block to the blockchain
        miner.mine(block0, blockchain);
        System.out.println(block0.showTransaction());
        System.out.println("Miner's reward: "+miner.getReward());
        System.out.println();

        //Create next new block1
        Block block1 = new Block(1,"transaction2", blockchain.getBlockchain().get(blockchain.size()-1).getHash());
        miner.mine(block1,blockchain);
        System.out.println(block1.showTransaction());
        System.out.println("Miner's reward: "+miner.getReward());
        System.out.println();

        //Create next new block2
        Block block2 = new Block(2, "transaction3", blockchain.getBlockchain().get(blockchain.size()-1).getHash());
        miner.mine(block2,blockchain);
        System.out.println(block2.showTransaction());
        System.out.println("Miner's reward: "+miner.getReward());
        System.out.println();
        //System.out.println(" ");
        System.out.println(blockchain.showAllTransactions());

    }
}
