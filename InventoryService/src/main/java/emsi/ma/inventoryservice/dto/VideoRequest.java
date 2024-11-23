package emsi.ma.inventoryservice.dto;

import emsi.ma.inventoryservice.Entities.Creator;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class VideoRequest {


    String name;
    String url;
    String description;
    Date datePublication;
    @ManyToOne
    Creator creator;


}
