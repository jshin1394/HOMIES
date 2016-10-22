package com.example.jsk.hophacks17;

/**
 * Post class object to pass Post info entity
 *
 */

public class Post {
    public String postId;
    public String memberId;
    public String content;

    public Post() {
    } // end of default Post constructor

    public Post(String postId, String memberId, String content) {
        this.postId = postId;
        this.memberId = memberId;
        this.content = content;
    } // end of Post constructor

} // end of Post class
