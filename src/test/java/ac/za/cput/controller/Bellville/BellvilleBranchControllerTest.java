package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.BellvilleBranch;
import ac.za.cput.factory.Bellville.FactoryBellvilleBranch;
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

public class BellvilleBranchControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/baker";

    @Ignore
    public void testGetAccountantById() {
        BellvilleBranch bellBaker = restTemplate.getForObject(baseURL + "/baker/1", BellvilleBranch.class);
        System.out.println(bellBaker.getBellBrId());
        assertNotNull(bellBaker);
    }


    @Ignore
    @Test
    public void create() {
        BellvilleBranch bellBranch = FactoryBellvilleBranch.getBellvillBranch("bbr345","bs457");

        ResponseEntity<BellvilleBranch> postResponse = restTemplate.postForEntity(baseURL + "/create", bellBranch, BellvilleBranch.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }
    @Ignore
    @Test
    public void update() {
        int id = 1;
        BellvilleBranch bellvilleBranch = restTemplate.getForObject(baseURL + "/baker/" + id, BellvilleBranch.class);

        restTemplate.put(baseURL + "/baker/" + id, bellvilleBranch);
        BellvilleBranch bellBranch = restTemplate.getForObject(baseURL + "/baker/" + id, BellvilleBranch.class);
        assertNotNull(bellBranch);
    }
    @Ignore
    @Test
    public void delete() {
        int id = 2;
        BellvilleBranch bellvilleBranch = restTemplate.getForObject(baseURL + "/baker/" + id, BellvilleBranch.class);
        assertNotNull(bellvilleBranch);
        restTemplate.delete(baseURL + "/baker/" + id);
        try {
            bellvilleBranch = restTemplate.getForObject(baseURL + "/baker/" + id, BellvilleBranch.class);
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