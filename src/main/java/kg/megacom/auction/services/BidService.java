package kg.megacom.auction.services;

import kg.megacom.auction.models.dto.BidDto;

public interface BidService {
    BidDto saveBid(BidDto bidDto);
}
