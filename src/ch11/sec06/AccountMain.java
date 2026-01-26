package ch11.sec06;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(20_000);
//        System.out.println("예금액: " + account.getBalance());
        account.checkBalance(); // 20,000원
        try{
        account.withdraw(25001);
        } catch (InsufficientException e) {
            System.out.println("Insufficient 예외: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array 예외: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
        account.checkBalance(); // Insufficient 예외: 잔고 부족5001원이 부족함
    }
}
