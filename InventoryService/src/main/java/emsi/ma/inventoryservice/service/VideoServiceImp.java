package emsi.ma.inventoryservice.service;

import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.Repository.VideoRepository;
import emsi.ma.inventoryservice.dto.VideoRequest;
import emsi.ma.inventoryservice.mappers.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImp implements VideoService
{
    @Autowired
    private VideoRepository videoRepository;

    @Autowired
    private VideoMapper mapper;
    @Override
    public List<VideoRequest> listVideo() {
        List<Video> videos= videoRepository.findAll();
        return mapper.fromVideolisttoVideoDto(videos);

    }

    @Override
    public VideoRequest saveVideo(VideoRequest vd) {
        Video video= mapper.fromVideoDtoToVideo(vd);
       video=videoRepository.save(video);
       //return video;
        return mapper.fromVideotoVideoDto(video);

    }
}
