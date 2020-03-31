package kg.megacom.auction.mappers;

import kg.megacom.auction.models.dto.*;
import kg.megacom.auction.models.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClassMapper {
    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);

    Status statusDtoToStatus(StatusDto statusDto);
    StatusDto statusToStatusDto(Status status);

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);

    Bid bidDtoToBid(BidDto bidDto);
    BidDto bidToBidDto(Bid bid);

    Lot lotDtoToLot(LotDto lotDto);
    LotDto lotToLotDto(Lot lot);
}
