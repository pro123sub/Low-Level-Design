import java.io.File;
import java.util.Date;

public class PdfManager
{
    private String pdfId;
    private String title;
    private String author;
    private Date date;
    private double price;
    private String description;
    private String filePath;
    private User user;

    public PdfManager(String pdfId, String title, String author, Date date, double price, String description, String filePath, User user) {
        this.pdfId = pdfId;
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
        this.description = description;
        this.filePath = filePath;
        this.user = user;
    }

    public String getPdfId() {
        return pdfId;
    }

    public void setPdfId(String pdfId) {
        this.pdfId = pdfId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void downloadPdf(User user)
    {
        if(hasUserPurchased(user))
        {
            provideDownloadLink();
        }
        else
        {
            throw  new IllegalStateException("User purchase failed");
        }
    }
    public void purchasePDF(User user) {
        // Logic to handle purchase
        processPayment(user);
        grantAccess(user);
    }
    private String uploadFile(File file) {
        // Logic to save file to server or cloud storage
        return "/path/to/pdf/" + file.getName();
    }

    private void grantAccess(User user)
    {
        System.out.println(user);
    }

    private void processPayment(User user)
    {
        System.out.println(user);
    }

    private boolean hasUserPurchased(User user) {
        // Check if the user has purchased the PDF
        return true; // Placeholder for actual check
    }
    private void provideDownloadLink()
    {
        System.out.println("Link");
        // Provide download link to user
    }
}
