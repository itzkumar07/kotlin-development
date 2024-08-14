class BankAccount(val accountNumber: String, val accountHolder: String) {
    var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount
                println("Withdrew $$amount")
            } else {
                println("Insufficient funds")
            }
        } else {
            println("Withdrawal amount must be positive.")
        }
    }

    fun displayBalance() {
        println("Balance: $$balance")
    }
}

fun main() {
    // Creating a BankAccount object
    val account = BankAccount("123456789", "John Doe")
    
    // Depositing money into the account
    account.deposit(500.0)
    account.displayBalance()  // Output: Balance: $500.0

    // Withdrawing money from the account
    account.withdraw(200.0)
    account.displayBalance()  // Output: Balance: $300.0

    // Trying to withdraw more than the balance
    account.withdraw(400.0)   // Output: Insufficient funds
    account.displayBalance()  // Output: Balance: $300.0
}
