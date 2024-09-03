import org.w3c.dom.Comment;

import java.sql.Date;
import java.util.List;

public class Post
{
    private String postId;
    private String content;
    private User author;
    private List<Comment> comments;
    private int likes;
    private Date timestamp;
    public Post(String postId, String content, User author, List<Comment> comments, int likes, Date timestamp) {
        this.postId = postId;
        this.content = content;
        this.author = author;
        this.comments = comments;
        this.likes = likes;
        this.timestamp = timestamp;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void likePost() {
        this.likes++;
    }
}
