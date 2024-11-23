package emsi.ma.inventoryservice.service;

import emsi.ma.inventoryservice.Entities.Creator;
import emsi.ma.inventoryservice.Repository.CreatorRepository;
import emsi.ma.inventoryservice.dto.CreatorRequest;
import emsi.ma.inventoryservice.mappers.CreatorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CreatorServiceImp implements CreatorService
{
    @Autowired
    private CreatorRepository creatorRepository;

    @Autowired
    private CreatorMapper mapper;

    @Override
    public CreatorRequest findCreatorbyId(Long id) {
        return mapper.fromCreatorToCreatorDTO(creatorRepository.findById(id).get());
    }

    @Override
    public CreatorRequest saveCreator(CreatorRequest creatordto) {
        Creator cr=mapper.fromCreatorDtoToCreator(creatordto);
        cr=creatorRepository.save(cr);
        return mapper.fromCreatorToCreatorDTO(cr);
    }
}
