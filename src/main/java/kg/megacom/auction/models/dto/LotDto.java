package kg.megacom.auction.models.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LotDto {
    private Long id;
    private String name;
    private double minPrice;
    private double maxPrice;
    private double step;
    private LocalDate startDate;
    private LocalDate endDate;

    private StatusDto statusDto;
}
