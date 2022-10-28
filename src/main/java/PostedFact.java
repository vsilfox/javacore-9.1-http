import com.fasterxml.jackson.annotation.JsonProperty;

public class PostedFact {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upVotes;

    public PostedFact(@JsonProperty("id") String id,
                      @JsonProperty("text") String text,
                      @JsonProperty("type") String type,
                      @JsonProperty("user") String user,
                      @JsonProperty("upvotes") Integer upVotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upVotes = upVotes;
    }

    @Override
    public String toString() {
        return "PostedFact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upVotes=" + upVotes +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpVotes() {
        return upVotes;
    }
}
