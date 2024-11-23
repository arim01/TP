package emsi.ma.inventoryservice.mappers;

import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.dto.VideoRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class VideoMapper {

    private ModelMapper modelMapper= new ModelMapper();

    //from dto TO normal
    public Video fromVideoDtoToVideo(VideoRequest videoDTO){
        return this.modelMapper.map(videoDTO,Video.class);
    }

    //from normal to DTO
    public VideoRequest fromVideotoVideoDto(Video video){
        return this.modelMapper.map(video,VideoRequest.class);
    }

    // Convert a list of Video to a list of VideoRequest
    public List<VideoRequest> fromVideolisttoVideoDto(List<Video> videos) {
        return videos.stream()
                .map(this::fromVideotoVideoDto) // Utilisation de la méthode existante
                .collect(Collectors.toList());
    }

    

}
