package emsi.ma.inventoryservice.Repository;

import emsi.ma.inventoryservice.Entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
