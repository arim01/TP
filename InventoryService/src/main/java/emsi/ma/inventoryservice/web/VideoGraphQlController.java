package emsi.ma.inventoryservice.web;

import emsi.ma.inventoryservice.Entities.Creator;
import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.Repository.CreatorRepository;
import emsi.ma.inventoryservice.Repository.VideoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;
    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }
    @QueryMapping
    public List<Video> videoList(){
        //return videoRepository.findAll();
        List<Video> videos = videoRepository.findAll();
        System.out.println(videos.toString());

        // Parcourir et afficher chaque vidéo
        /*for (Video video : videos) {
            System.out.println("Video ID: " + video.getId());
            System.out.println("Name: " + video.getName());
            System.out.println("URL: " + video.getUrl());
            System.out.println("Description: " + video.getDescription());
            System.out.println("Date Publication: " + video.getDatePublication());
            System.out.println("Creator: " + (video.getCreator() != null ? video.getCreator().getName() : "No Creator"));
            System.out.println("-------------------------------");
        }*/

        return videos;
    }
    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }


}