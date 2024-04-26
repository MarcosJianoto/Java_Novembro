package comments;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;

public class Post {

  private static LocalDateTime local1 = LocalDateTime.of(
    2018,
    06,
    21,
    13,
    05,
    44
  );

  private LocalDateTime moment;
  private String title;
  private String content;
  private Integer likes;
  private List<Comment> comments = new ArrayList<>();

  public Post() {}

  public Post(
    LocalDateTime moment,
    String title,
    String content,
    Integer likes
  ) {
    this.moment = moment;
    this.title = title;
    this.content = content;
    this.likes = likes;
  }

  public LocalDateTime getDate() {
    return this.moment;
  }

  public void setDate(LocalDateTime date) {
    this.moment = date;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Integer getLikes() {
    return this.likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public List<Comment> getPost() {
    return this.comments;
  }

  public void addComment(Comment comment) {
    comments.add(comment);
  }

  public void removeComment(Comment comment) {
    comments.remove(comment);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(title + "\n");
    sb.append(likes);
    sb.append(" Likes - ");
    sb.append(local1 + "\n");
    sb.append(content + "\n");
    sb.append("Comments:\n");
    for (Comment c : comments) {
      sb.append(c.getText() + " \n");
    }
    return sb.toString();
  }
}
