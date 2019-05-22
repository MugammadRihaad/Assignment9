package ac.za.cput.controller.Bellville;

import ac.za.cput.domain.Bellville.ProductCakes;
import ac.za.cput.factory.Bellville.FactoryProductCakes;
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

public class ProductCakesControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/cakes";

    @Ignore
    public void testGetAccountantById() {
        ProductCakes cakes = restTemplate.getForObject(baseURL + "/cakes/1", ProductCakes.class);
        System.out.println(cakes.getProductCakeId());
        assertNotNull(cakes);
    }


    @Ignore
    @Test
    public void create() {
        ProductCakes bellStaff = FactoryProductCakes.getProductCakes("pc345","chocolate",3000);

        ResponseEntity<ProductCakes> postResponse = restTemplate.postForEntity(baseURL + "/create", bellStaff, ProductCakes.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }
    @Ignore
    @Test
    public void update() {
        int id = 1;
        ProductCakes prodCakes = restTemplate.getForObject(baseURL + "/cakes/" + id, ProductCakes.class);

        restTemplate.put(baseURL + "/cakes/" + id, prodCakes);
        ProductCakes cakes = restTemplate.getForObject(baseURL + "/cakes/" + id, ProductCakes.class);
        assertNotNull(cakes);
    }
    @Ignore
    @Test
    public void delete() {
        int id = 2;
        ProductCakes prodCakes = restTemplate.getForObject(baseURL + "/cakes/" + id, ProductCakes.class);
        assertNotNull(prodCakes);
        restTemplate.delete(baseURL + "/cakes/" + id);
        try {
            prodCakes = restTemplate.getForObject(baseURL + "/cakes/" + id, ProductCakes.class);
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