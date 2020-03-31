package kg.megacom.auction.services.impl;

import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dto.LotDto;
import kg.megacom.auction.models.entity.Lot;
import kg.megacom.auction.repositories.LotRepository;
import kg.megacom.auction.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotServiceImpl implements LotService {

    @Autowired
    private LotRepository lotRepository;

    @Override
    public LotDto saveLot(LotDto lotDto) {
        Lot lot = ClassMapper.INSTANCE.lotDtoToLot(lotDto);
        lotRepository.save(lot);
        lotDto = ClassMapper.INSTANCE.lotToLotDto(lot);
        return lotDto;
    }
}
