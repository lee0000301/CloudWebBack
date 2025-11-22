package org.example.community.dto;

public class ReviewRequest {

    private String userId;
    private String courseId;
    private Byte rating;
    private String content;

    // Getter & Setter
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public Byte getRating() { return rating; }
    public void setRating(Byte rating) { this.rating = rating; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
