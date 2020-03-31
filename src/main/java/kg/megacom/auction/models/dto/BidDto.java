package kg.megacom.auction.models.dto;

import kg.megacom.auction.models.entity.Customer;
import kg.megacom.auction.models.entity.Lot;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
