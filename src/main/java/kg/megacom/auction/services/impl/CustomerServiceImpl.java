package kg.megacom.auction.services.impl;

import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.models.dto.CustomerDto;
import kg.megacom.auction.models.entity.Customer;
import kg.megacom.auction.repositories.CustomerRepository;
import kg.megacom.auction.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer customer = ClassMapper.INSTANCE.customerDtoToCustomer(customerDto);
        customerRepository.save(customer);
        customerDto = ClassMapper.INSTANCE.customerToCustomerDto(customer);
        return customerDto;
    }
}
