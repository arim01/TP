package emsi.ma.inventoryservice.Repository;

import emsi.ma.inventoryservice.Entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository  extends JpaRepository<Creator, Long> {
}
