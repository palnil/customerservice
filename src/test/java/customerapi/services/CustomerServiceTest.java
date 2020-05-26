package customerapi.services;

import com.yoshallc.customerapi.repositories.CustomerRepository;
import com.yoshallc.customerapi.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@Slf4j
public class CustomerServiceTest {


    @InjectMocks
    private CustomerService customerService;

    @MockBean
    CustomerRepository customerRepository;

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


}
