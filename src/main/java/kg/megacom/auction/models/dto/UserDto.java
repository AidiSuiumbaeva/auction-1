package kg.megacom.auction.models.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String login;
    private String password;
    private boolean active;
}
