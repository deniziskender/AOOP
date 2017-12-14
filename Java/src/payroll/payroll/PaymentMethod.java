package payroll;

public interface PaymentMethod {

    void sendPayment(double netPay);
}

class HoldMethod implements PaymentMethod {
    @Override
    public String toString() {
        return "Hold";
    }

    @Override
    public void sendPayment(double netPay) {
        System.out.println("Holding payment at the HR office.");
    }
}

class MailMethod implements PaymentMethod {
    String address;

    public MailMethod(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mail";
    }

    @Override
    public void sendPayment(double netPay) {
        System.out.println("Mailing payment to " + address);
    }
}

class DirectTransferMethod implements PaymentMethod {
    String bank;
    int accountNumber;

    public DirectTransferMethod(String bank, int accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Direct";
    }

    @Override
    public void sendPayment(double netPay) {
        System.out.println("Tranferring payment to '" + bank + "' account " + accountNumber);
    }
}