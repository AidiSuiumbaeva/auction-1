package kg.megacom.auction.mappers;

import kg.megacom.auction.models.dto.CustomerDto;
import kg.megacom.auction.models.dto.StatusDto;
import kg.megacom.auction.models.dto.UserDto;
import kg.megacom.auction.models.entity.Customer;
import kg.megacom.auction.models.entity.Status;
import kg.megacom.auction.models.entity.User;
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
}
