package emsi.ma.inventoryservice.web;

import emsi.ma.inventoryservice.Entities.Creator;
import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.Repository.CreatorRepository;
import emsi.ma.inventoryservice.Repository.VideoRepository;
import emsi.ma.inventoryservice.dto.CreatorRequest;
import emsi.ma.inventoryservice.dto.VideoRequest;
import emsi.ma.inventoryservice.service.CreatorServiceImp;
import emsi.ma.inventoryservice.service.VideoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;

    @Autowired
    private CreatorServiceImp creatorService;

    @Autowired
    private VideoServiceImp videoService;


    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }
    @QueryMapping
    public List<VideoRequest> videoList(){
        //return videoRepository.findAll();
        //List<Video> videos = videoRepository.findAll();
        //System.out.println(videos.toString());

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

        //return videos;

        return videoService.listVideo();
    }
    @QueryMapping
    public CreatorRequest creatorById(@Argument Long id) {
        /*return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id))); */
        return creatorService.findCreatorbyId(id);
    }

    @MutationMapping
    public CreatorRequest saveCreator(@Argument CreatorRequest creator){

        //return creatorRepository.save(creator) ;
        return creatorService.saveCreator(creator);
    }
    @MutationMapping
    public VideoRequest saveVideo(@Argument VideoRequest video){
        //return videoRepository.save(video) ;
        return videoService.saveVideo(video);
    }


}