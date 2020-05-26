package customerapi.services;

import com.yoshallc.customerapi.dtos.Customer;
import com.yoshallc.customerapi.repositories.CustomerRepository;
import com.yoshallc.customerapi.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class CustomerServiceTest {


    @InjectMocks
    private CustomerService customerService;

    @MockBean
    CustomerRepository customerRepository = mock(CustomerRepository.class);

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllCustomers_ReturnsAllCustomers(){
        when(customerRepository.findAll()).thenReturn(null);
        customerService.getAllCustomers();
        verify(customerRepository, times(1)).findAll();
    }

    @Test
    public void UserWithFullSex_ReturnsUserWithFullSex(){
        Customer customer = new Customer((long)1001,"bob","marley","m");
        assertEquals("Male",customerService.UserWithFullSex(customer).getSex());
    }


}
