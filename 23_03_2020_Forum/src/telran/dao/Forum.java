package telran.dao;

import telran.data.Post;
import telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {

    private Post[] posts;
    private int size;

    public Forum (int capacity){
        posts = new Post[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post){
        if(size<posts.length){
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    public boolean deletePost(int id){
        for (int i = 0; i <size ; i++) {
            if (posts[i].getPostID()==id){
                posts[i] = posts[size-1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayPost(){
        for (int i = 0; i <size ; i++) {
            System.out.println(posts[i]);
        }
    }

    public Post[] getPostsByAuthor(String author, int numberOfPost){
        Post[] authorsPosts = new Post[numberOfPost];
        int j =0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getUserName().equalsIgnoreCase(author) && j<numberOfPost){
                authorsPosts[j] = posts[i];
                j++;
            }
        }
        return authorsPosts;
    }

    public int getCountLikes(String title){
        for (int i = 0; i <size; i++) {
            if(posts[i].getTitle().equalsIgnoreCase(title)){
                System.out.println("User " + posts[i].getAuthor().getUserName() + " has " + posts[i].getLikes() + " likes");
                return posts[i].getLikes();
            }
        }
        return 0;
    }

    public boolean checkPassword() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getClass().getSimpleName().equalsIgnoreCase("UserAdmin")) {
                UserAdmin admin = (UserAdmin) posts[i].getAuthor();
                int count = 3;
                while (count > 0) {
                    System.out.println("Enter password, please");
                    String password = scanner.nextLine();
                    if (admin.getPassword().equals(password)) {
                        return true;
                    } else {
                        count--;
                    }
                }

            }
        }
        return false;
    }

    public void updatePostByAdmin(int postId){
        Scanner scanner = new Scanner(System.in);
        if(checkPassword()){
            for (int i = 0; i <size ; i++) {
                if(posts[i].getPostID() == postId){
                    System.out.println("Enter new content");
                    String newContent = scanner.nextLine();
                    posts[i].setContent(newContent);
                    System.out.println(postId + " content change to: " + posts[i].getContent());
                }

            }
        }else{
            System.out.println("access is denied");
        }
    }

}
