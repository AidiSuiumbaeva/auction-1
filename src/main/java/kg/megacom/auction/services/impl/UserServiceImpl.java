package kg.megacom.auction.services.impl;

import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dto.UserDto;
import kg.megacom.auction.models.entity.User;
import kg.megacom.auction.repositories.UserRepository;
import kg.megacom.auction.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = ClassMapper.INSTANCE.userDtoToUser(userDto);
        userRepository.save(user);
        userDto = ClassMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }
}
