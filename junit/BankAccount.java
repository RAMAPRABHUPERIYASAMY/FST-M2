package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class BankAccount {

// Create a constructor
public BankAccount(Integer initialBalance) {
    Integer balance = initialBalance;
        }

// Add method to calculate
// balance amount after withdrawal
public Integer withdraw(Integer amount) {
    Integer balance = null;
    if (balance < amount) {
        throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
        }
    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);

        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
        }
