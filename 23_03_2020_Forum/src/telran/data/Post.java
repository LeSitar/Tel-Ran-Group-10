package telran.data;

public class Post {
    private User author;
    private int postID;
    private String title;
    private String content;
    private int likes = 0;

    public Post(User author, int postID, String title, String content) {
        this.author = author;
        this.postID = postID;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public int getPostID() {
        return postID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post ID" + postID +
                ", posted by " + author +
                   title.toUpperCase() + ": "
                + content +  "\n" +
                "likes: " + likes +
                "\n";
    }

    public int addLike(){
        return likes++;
    }

    public int disLike(){
        return (likes<1)? 0:likes--;
    }
}
