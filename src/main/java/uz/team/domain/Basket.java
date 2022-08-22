package uz.team.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import uz.team.dto.BasketDTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private boolean is_deleted;


    public static Basket toDomain(BasketDTO dto){
        return Basket.builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .is_deleted(dto.is_deleted())
                .build();
    }

}
