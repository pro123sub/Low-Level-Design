import java.util.Date;

public class Transaction
{
    private String transactionId;
    private User user;
    private PdfManager pdf;
    private double amount;
    private Date transactionDate;
    public Transaction(String transactionId, User user, PdfManager pdf, double amount, Date transactionDate)
    {
        this.transactionId = transactionId;
        this.user = user;
        this.pdf = pdf;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PdfManager getPdf() {
        return pdf;
    }

    public void setPdf(PdfManager pdf) {
        this.pdf = pdf;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    private void processTransaction()
    {
        // Logic to handle payment
        // Interaction with Payment Gateway API
        System.out.println("process");
    }

    public void generateInvoice() {
        // Logic to generate invoice
        System.out.println("process");
    }

    public void refund()
    {
        // Logic to handle refunds
        System.out.println("process transaction");
    }
}
