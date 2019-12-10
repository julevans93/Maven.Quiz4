package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List<BankAccount> bankAccounts;

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        for (int i = 0; i < bankAccounts.size(); i++){
            if (i == indexNumber){
                bankAccounts.remove(i);

            }
        }
        return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        //throw new UnsupportedOperationException("Method not yet implemented");
        for (int i = 0; i < bankAccounts.size(); i++){
            if (bankAccounts.get(i) == bankAccount){
                return true;
            }
        }
        return false;
    }
}
