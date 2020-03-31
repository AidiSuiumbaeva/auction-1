package kg.megacom.auction.services.impl;

import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dto.StatusDto;
import kg.megacom.auction.models.entity.Status;
import kg.megacom.auction.repositories.StatusRepository;
import kg.megacom.auction.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public StatusDto saveStatus(StatusDto statusDto) {
        Status status = ClassMapper.INSTANCE.statusDtoToStatus(statusDto);
        statusRepository.save(status);
        statusDto = ClassMapper.INSTANCE.statusToStatusDto(status);
        return statusDto;
    }
}
