package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.BellvilleAccountant;
import ac.za.cput.factory.Bellville.FactoryBellvilleAccountant;
import org.junit.Before;
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
public class BellvilleAccountControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/accountant";

    @Ignore
    public void testGetAccountantById() {
        BellvilleAccountant bellAccount = restTemplate.getForObject(baseURL + "/accountant/1", BellvilleAccountant.class);
        System.out.println(bellAccount.getBellAccountId());
        assertNotNull(bellAccount);
    }


    @Ignore
    @Test
    public void create() {
        BellvilleAccountant bellAccount = FactoryBellvilleAccountant.getBellvilleAccountant("BA132","BL234"
                ,"BB2342","BF12232","BC2352");

        ResponseEntity<BellvilleAccountant> postResponse = restTemplate.postForEntity(baseURL + "/create", bellAccount, BellvilleAccountant.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }
    @Ignore
    @Test
    public void update() {
        int id = 1;
        BellvilleAccountant bellAccount = restTemplate.getForObject(baseURL + "/accountant/" + id, BellvilleAccountant.class);

        restTemplate.put(baseURL + "/students/" + id, bellAccount);
        BellvilleAccountant bellAccounts = restTemplate.getForObject(baseURL + "/accountant/" + id, BellvilleAccountant.class);
        assertNotNull(bellAccounts);
    }
    @Ignore
    @Test
    public void delete() {
        int id = 2;
        BellvilleAccountant bellAccount = restTemplate.getForObject(baseURL + "/accountant/" + id, BellvilleAccountant.class);
        assertNotNull(bellAccount);
        restTemplate.delete(baseURL + "/accountant/" + id);
        try {
            bellAccount = restTemplate.getForObject(baseURL + "/students/" + id, BellvilleAccountant.class);
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