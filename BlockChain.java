

public class BlockChain{
    public INSERT RETURN VALUE main(){
        //read the 3 blocks from bitcoinBank.txt and add the blocks into an ArrayList
    }
    public static BlockChain fromFile(String fileName){}
    public void toFile(String fileName){}
    public boolean validateBlockchain(){
        //You must then validate the blockchain by checking all the hashes, making sure they
        //correspond to the values in the corresponding block. You must also check that all the
        //index and previousHash attributes are consistent. In addition, we also ask you to
        //validate all the transactions to make sure that noone spent bitcoins they do not have
        //(this validation is similar to the validation described in step 3).
    }
    public int getBalance(String username){
        //If the blockchain is valid, then you ask a user to enter a new transaction by specifying a
        //sender, a receiver and a bitcoin amount. To accept the transaction, you must verify that
        //the sender has enough money to proceed with the transaction. To do this, you must go
        //through all the blocks and accumulate the bitcoins assigned to this user minus the ones
        //that have been spent by this user.
    }
    public void add(Block block){
        //If the transaction is found to be valid, then a block containing this transaction is added to
        //the block chain.
            //a. As proof of work, the hash of each inserted block chain must start with 5 zeros
            //(in hexadecimal notation). Your program must therefore find (by trial and error) a
            //nonce that will make the hash code to meet this condition. 
    }

    public void saveBlockChain(){
        //Once the session is ended, you then save the updated blockchain into a text file (even if
        //no new block has been created). To identify your file, we ask you to use a ‘miner’ id
        //made of your uottawa email username. You then append to the filename your id
        //preceded by an ‘_’. For example if the filename is blockchain.txt and your uottawa
        //email is jsmit001@uottawa.ca, then the saved filename will be
        //blockchain_jsmit001.txt
    }

    public String toString(){
        return;
    }

}