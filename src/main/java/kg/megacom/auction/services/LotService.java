package kg.megacom.auction.services;

import kg.megacom.auction.models.dto.LotDto;

public interface LotService {
    LotDto saveLot(LotDto lotDto);
}
