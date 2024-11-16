package emsi.ma.inventoryservice;

import emsi.ma.inventoryservice.Entities.Creator;
import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.Repository.CreatorRepository;
import emsi.ma.inventoryservice.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Autowired
    CreatorRepository creatorRepository;
    @Autowired
    VideoRepository videoRepository;

    @Bean
    CommandLineRunner start() {
        return args -> {
            List<Creator> creators = List.of(
                    Creator.builder().name("x").email("x@gmail.com").build(),
                    Creator.builder().name("y").email("y@gmail.com").build(),
                    Creator.builder().name("z").email("z@gmail.com").build());
            creatorRepository.saveAll(creators);
            List<Video> videos = List.of(
                    Video.builder().name("v1").creator(creators.get(1)).url("url1").description("blabla").datePublication(new Date()).build(),
                    Video.builder().name("v2").creator(creators.get(2)).url("url2").description("bloblo").datePublication(new Date()).build());
            videoRepository.saveAll(videos);
        };
    }
}