package com.Bells.Course3Project;
import java.util.ArrayList;
import java.util.List;
public class Blockchain
{
    //Instantiating the list of blocks
    private List<Block> blockchain;

    public Blockchain()//Constructor
    {
        this.blockchain = new ArrayList<>();
    }
    public void addBlock(Block block)//Add a block into the blockchain
    {
        this.blockchain.add(block);
    }
    public List<Block> getBlockchain()
    {
        return this.blockchain;
    }
    public int size()
    {
        return this.blockchain.size();
    }
    public String showAllTransactions()
    {
        String blockchain = "";
        for(Block block : this.blockchain)
            blockchain+=block.showTransaction()+"\n";
        return blockchain;
    }
}
