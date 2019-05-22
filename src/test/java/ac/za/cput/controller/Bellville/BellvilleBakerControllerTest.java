package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.bellvilleBaker;
import ac.za.cput.factory.Bellville.FactoryBellvilleBaker;
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
public class BellvilleBakerControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/baker";

    @Ignore
    public void testGetAccountantById() {
        bellvilleBaker bellBaker = restTemplate.getForObject(baseURL + "/baker/1", bellvilleBaker.class);
        System.out.println(bellBaker.getBellBakerId());
        assertNotNull(bellBaker);
    }


    @Ignore
    @Test
    public void create() {
        bellvilleBaker bellBaker = FactoryBellvilleBaker.getBellvilleBaker("bb234","James"
                ,5000);

        ResponseEntity<bellvilleBaker> postResponse = restTemplate.postForEntity(baseURL + "/create", bellBaker, bellvilleBaker.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }
    @Ignore
    @Test
    public void update() {
        int id = 1;
        bellvilleBaker bellBaker = restTemplate.getForObject(baseURL + "/baker/" + id, bellvilleBaker.class);

        restTemplate.put(baseURL + "/baker/" + id, bellBaker);
        bellvilleBaker bellAccounts = restTemplate.getForObject(baseURL + "/baker/" + id, bellvilleBaker.class);
        assertNotNull(bellAccounts);
    }
    @Ignore
    @Test
    public void delete() {
        int id = 2;
        bellvilleBaker bellAccount = restTemplate.getForObject(baseURL + "/baker/" + id, bellvilleBaker.class);
        assertNotNull(bellAccount);
        restTemplate.delete(baseURL + "/baker/" + id);
        try {
            bellAccount = restTemplate.getForObject(baseURL + "/baker/" + id, bellvilleBaker.class);
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