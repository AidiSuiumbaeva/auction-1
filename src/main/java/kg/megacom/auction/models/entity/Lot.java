package kg.megacom.auction.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue
    @Column(name = "lot_id")
    private Long id;
    private String name;
    private double minPrice;
    private double maxPrice;
    private double step;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate endDate;


    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
