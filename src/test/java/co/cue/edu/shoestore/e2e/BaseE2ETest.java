package co.cue.edu.shoestore.e2e;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class BaseE2ETest {

    @Autowired
    protected MockMvc mockMvc; // permite simular peticiones HTTP como Postman

    @Autowired
    protected ObjectMapper objectMapper; // serializa/deserializa JSON
}
