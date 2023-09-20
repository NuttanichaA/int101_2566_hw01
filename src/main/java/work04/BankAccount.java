/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author User
 */
public class BankAccount {
    
    /*4.2 Create a public class named "BankAccount" in package named "work04".
          This class contains the following field and methods.
          4.2.1 a private "number" field of type "int".
          4.2.1 a private "owner" field of type "Person".
          4.2.2 a private "balance" field of type "double".*/
    private int number;
    private Person owner;
    private double balance;
    
    /*4.2.3 a public constructor that receives a "number" parameter and
                an "owner" parameter to set the "number" and "owner" fields.*/
    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }
    
          //4.2.4 public getter methods for "owner" and "balance" fields.
     public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
          /*4.2.5 a public "deposit" method that receives an "amount" 
                parameter of type "double" and returns a "double". 
                This method adds the "amount" to the "balance" to set
                the new value of the "balance" and returns this new value.*/
    public double deposit(double amount){
        balance += amount;
        return balance;
    }
    
          /*4.2.6 a public "withdraw" method that receives an "amount"
                parameter of type "double" and returns a "double".
                This method substracts the "amount" to the "balance" to set
                the new value of the "balance" and returns this new value.*/
    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
          /*4.2.7 a public "transfer" method that receives an "amount" 
                parameter of type "double" and an "account" parameter of 
                type "BankAccount". This method "withdraws" the "amount" 
                from the "balance" of this object and "deposits" 
                the "amount" to the "balance" of the "account" object 
                (in the parameter). This methods returns nothing.*/
    public void transfer(double amount, BankAccount account){
        withdraw(amount);
        account.deposit(amount);
    }
    
          /*4.2.8 @Override a public "toString" method that 
                returns a "String" of value "BankAccount(id,)" 
                where "id" is the "id" field.*/
    @Override
    public String toString(){
        return String.valueOf(owner.getId());
    }


    
    
    
}
