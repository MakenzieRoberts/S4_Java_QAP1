/*
    2.  Write a test program called TestAccount (in another source file called TestAccount.java) which uses
        the Account class.
*/
public class TestAccount {

    public static void main(String[] args){
        /*
              3.    Create two accounts
            3.a.    Acc1 with balance of $5000 and Acc2 with balance of $4000 by using parameterised
                    constructors defined in Account class.
        */
        Account acc1 = new Account("1a2b3c", "John Doe", 5000);
        Account acc2 = new Account("7x8y9z", "Jane Doe", 4000);

        /*
            3.b.	Display balance of both accounts using getBalance() method.
        */
        System.out.println("\n" + "3.b. Display balance of both accounts using getBalance() method." + "\n");
        System.out.println("\tAcc1: $" + acc1.getBalance());
        System.out.println("\tAcc2: $" + acc2.getBalance() + "\n");

        /*
            3.c.    Transfer $1000.00 from account 1 to account 2.
        */
        System.out.println("3.c. Transfer $1000.00 from account 1 to account 2." + "\n");
        acc1.transferTo(acc2, 1000);
        System.out.println("\tTransfer Complete." + "\n");

        /*
            3.d.    Display balance of both accounts using getBalance() method again.
        */
        System.out.println("3.d. Display balance of both accounts using getBalance() method again." + "\n");
        System.out.println("\tAcc1: $" + acc1.getBalance());
        System.out.println("\tAcc2: $" + acc2.getBalance() + "\n");
    }
}
