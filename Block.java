package com.Bells.Course3Project;
import java.util.Date;
public class Block
{
    private int id;//
    private int nonce;
    private long timeStamp;//variable is used to store the timestamp of the block in milliseconds.
    private String hash;//variable hash will contain the hash of the block
    private String previousHash;//variable previousHash contains the hash of the previous block
    private String transaction;//variable transaction contains the description of the transaction taken place
    public Block(int id, String transaction, String previousHash)
    {
        this.id = id;
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        generateHash();
    }

    public void generateHash()
    {
        String strToBeHash = Integer.toString(id)+previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + transaction;
        //String hashValue = HashHelper.generateHash(dataToHash);
        this.hash = HashHelper.generateHash(strToBeHash);
    }
    public String getHash()
    {
        return this.hash;
    }
    public void setHash(String hash)
    {
        this.hash = hash;
    }
    public String getPreviousHash()
    {
        return this.previousHash;
    }
    public void setPreviousHash(String previousHash)
    {
        this.previousHash = previousHash;
    }
    public void incrementNonce()
    {
        this.nonce++;
    }
    public String showTransaction()
    {
        return this.id+" | "+this.transaction+" | "+this.hash+" | "+this.previousHash;
    }
}
