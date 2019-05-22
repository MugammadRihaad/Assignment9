package ac.za.cput.controller.StockDeliveries;

import ac.za.cput.domain.StockDeliveries.Deliveries;
import ac.za.cput.factory.StockDeliveries.FactoryDeliveries;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class DeliveryControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/credLedger";

    @Ignore
    public void testGetAccountantById() {
        Deliveries credLedger = restTemplate.getForObject(baseURL + "/credLedger/1", Deliveries.class);
        System.out.println(credLedger.getDelivId());
        assertNotNull(credLedger);
    }


    @Ignore
    @Test
    public void create() {
        Deliveries creditorsLedger = FactoryDeliveries.getDeliveries("di234","Mike",
                5,300);



        ResponseEntity<Deliveries> postResponse = restTemplate.postForEntity(baseURL + "/create", creditorsLedger, Deliveries.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }
    @Ignore
    @Test
    public void update() {
        int id = 1;
        Deliveries creditorsLedger = restTemplate.getForObject(baseURL + "/credLedger/" + id, Deliveries.class);

        restTemplate.put(baseURL + "/credLedger/" + id, creditorsLedger);
        Deliveries creditorsLedger1 = restTemplate.getForObject(baseURL + "/credLedger/" + id, Deliveries.class);
        assertNotNull(creditorsLedger);
    }
    @Ignore
    @Test
    public void delete() {
        int id = 2;
        Deliveries creditorsLedger = restTemplate.getForObject(baseURL + "/credLedger/" + id, Deliveries.class);
        assertNotNull(creditorsLedger);
        restTemplate.delete(baseURL + "/cakes/" + id);
        try {
            creditorsLedger = restTemplate.getForObject(baseURL + "/credLedger/" + id, Deliveries.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);

        }
    }

    @Test
    public void read() {
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }

}