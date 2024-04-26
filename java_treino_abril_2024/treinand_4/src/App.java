import comments.Comment;
import comments.Post;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    LocalDateTime local1 = LocalDateTime.of(2018, 06, 21, 13, 05, 44);
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDate = fmt1.format(local1);

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow that's awesome");
    Post p1 = new Post(
      local1,
      "Traveling to New Zealand",
      "I'm going to visit this wonderful country",
      12
    );
    p1.addComment(c1);
    p1.addComment(c2);

    Comment c3 = new Comment("Good Night");
    Comment c4 = new Comment("May the Force be with you");
    Post p2 = new Post(local1, "Good night guys", "See you tomorrow", 5);

    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p1);

    System.out.println("---------------");
    System.out.println(p2);

    sc.close();
  }
}
