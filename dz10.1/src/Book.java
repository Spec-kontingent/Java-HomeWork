import java.io.Serializable;

public class Book  {
    private String name;
    private String authorName;
    private String text;

    Book (){}
    Book (String name){
        this.name=name;
    }
     Book(String name, String authorName) {
        this(name);
        this.authorName=authorName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
