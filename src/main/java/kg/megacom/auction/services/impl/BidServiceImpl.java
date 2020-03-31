package kg.megacom.auction.services.impl;

import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dto.BidDto;
import kg.megacom.auction.models.entity.Bid;
import kg.megacom.auction.repositories.BidRepository;
import kg.megacom.auction.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidServiceImpl implements BidService {


    @Autowired
    private BidRepository bidRepository;

    @Override
    public BidDto saveBid(BidDto bidDto) {
        Bid bid = ClassMapper.INSTANCE.bidDtoToBid(bidDto);
        bidRepository.save(bid);
        bidDto = ClassMapper.INSTANCE.bidToBidDto(bid);
        return bidDto;
    }
}
