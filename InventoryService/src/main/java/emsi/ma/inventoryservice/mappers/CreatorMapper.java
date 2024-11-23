package emsi.ma.inventoryservice.mappers;

import emsi.ma.inventoryservice.Entities.Creator;
import emsi.ma.inventoryservice.dto.CreatorRequest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {
    private ModelMapper modelMapper= new ModelMapper();


    // from CreatorDTO to creator normal
    public Creator fromCreatorDtoToCreator(CreatorRequest creatorDTO){
        return this.modelMapper.map(creatorDTO,Creator.class);
    }

    // from Creator to CreatorDTO
    public CreatorRequest fromCreatorToCreatorDTO(Creator creator){
        return this.modelMapper.map(creator, CreatorRequest.class);
    }
}
