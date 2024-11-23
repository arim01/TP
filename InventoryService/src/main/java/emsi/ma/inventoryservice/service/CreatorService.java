package emsi.ma.inventoryservice.service;

import emsi.ma.inventoryservice.dto.CreatorRequest;
import emsi.ma.inventoryservice.dto.VideoRequest;

public interface CreatorService {

    public CreatorRequest findCreatorbyId(Long id);

    public CreatorRequest saveCreator(CreatorRequest creator);

}
