package uz.team.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.servlet.http.HttpServletRequest;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BasketDTO {

    private String name;
    private int price;
    private boolean is_deleted;

    public static BasketDTO toDto(HttpServletRequest basket){
        return BasketDTO.builder()
                .name(basket.getParameter("name"))
                .price(Integer.parseInt(basket.getParameter("price")))
                .is_deleted(false)
                .build();
    }



}
