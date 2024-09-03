import java.util.Date;

public class Comment
{
    private String commentId;
    private String content;
    private User author;
    private Date timestamp;

    public Comment(String commentId, String content, User author, Date timestamp) {
        this.commentId = commentId;
        this.content = content;
        this.author = author;
        this.timestamp = timestamp;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
