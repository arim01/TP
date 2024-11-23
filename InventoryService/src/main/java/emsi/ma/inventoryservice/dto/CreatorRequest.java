package emsi.ma.inventoryservice.dto;

import emsi.ma.inventoryservice.Entities.Video;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class CreatorRequest {

    String name;
    String email;

}
