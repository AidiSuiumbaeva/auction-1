package kg.megacom.auction.models.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class BidDto {
    private Long id;
    private LocalDate addDate;
    private double bidValue;
    private boolean active;

    private LotDto lotDto;

    private CustomerDto customerDto;
}
