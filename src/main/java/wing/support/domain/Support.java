package wing.support.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Getter
@Setter
@Document(collection = "support")
public class Support {
    @Id
    private String id;
    private HashMap<String, String> user;
    private HashMap<String, String> artist;
    private Long amount;
    private String datetime;
    private String uid;
}
