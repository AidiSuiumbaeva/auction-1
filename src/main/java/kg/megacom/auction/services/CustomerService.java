package kg.megacom.auction.services;

import kg.megacom.auction.models.dto.CustomerDto;

public interface CustomerService {
    CustomerDto saveCustomer(CustomerDto customerDto);
}
