package emsi.ma.inventoryservice.service;

import emsi.ma.inventoryservice.Entities.Video;
import emsi.ma.inventoryservice.dto.VideoRequest;

import java.util.List;

public interface VideoService
{
    public List<VideoRequest> listVideo();
    public VideoRequest saveVideo(VideoRequest vd);
}
