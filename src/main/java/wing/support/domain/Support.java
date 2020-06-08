package wing.support.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "support")
public class Support {
    @Id
    private String id;
    private String userId;
    private String artistId;
    private Long amount;
    private String datetime;
    private String uid;

    @Transient
    private String name = "";

    @Transient
    private String artistName = "";

    public Support withName(String name) {
        this.setName(name);
        return this;
    }

    public Support withArtistName(String artistName) {
        this.setArtistName(artistName);
        return this;
    }

    @Builder
    public Support(String userId, String artistId, Long amount, String datetime, String uid) {
        this.userId = userId;
        this.artistId = artistId;
        this.amount = amount;
        this.datetime = datetime;
        this.uid = uid;
    }
}
