package telran.dao;

import telran.data.Post;

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

}
