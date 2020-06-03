package wing.support.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "support")
public class Support {
    @Id
    private String id;
    private String userId;
    private String userName;
    private String artistId;
    private String artistName;
    private Long amount;
    private String datetime;
    private String uid;
}
