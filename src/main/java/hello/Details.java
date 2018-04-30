package hello;

/**
 * Created by Arka on 30-Apr-18.
 */
public class Details {
    private final long id;
    private final String content;

    public Details(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
