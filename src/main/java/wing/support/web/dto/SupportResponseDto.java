package wing.support.web.dto;

import lombok.Getter;
import wing.support.domain.Support;

@Getter
public class SupportResponseDto {

    private final String artistName;
    private final String name;
    private final Long amount;
    private final String datetime;

    public SupportResponseDto(Support support) {
        this.artistName = support.getArtistName();
        this.name = support.getName();
        this.amount = support.getAmount();
        this.datetime = support.getDatetime();
    }
}
