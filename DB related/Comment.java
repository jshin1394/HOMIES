/**
 * Comment class object to pass Comment info entity
 *
 */

public class Comment {
    public String commentId;
    public String memberId;
    public String content;
    public String postId;

    public Comment() {
    } // end of default Comment constructor

    public Comment(String commentId, String memberId, String content, String postId) {
        this.commentId = commentId;
        this.memberId = memberId;
        this.content = content;
        this.postId = postId;
    } // end of Comment constructor

} // end of Comment class
