package com.heb.pairedprogramming.stringreversal;

import com.heb.pairedprogramming.PairedProgrammingApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.hamcrest.Matchers.is;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@SpringBootTest(classes = {PairedProgrammingApplication.class})
class StringReversalController_IntegrationTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mvc;

    @BeforeEach
    public void setup() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    // Sample Notes for test expansion.
    // In hamcrest - Pulling a value from returned JSON is done as follows :
    // .andExpect(jsonPath("$.fieldName", is("ExpectedFalue")))

    @Test
    public void createPrice() throws Exception {
        mvc.perform(get("/api/v1/string/reverse"))
                .andExpect(status().isOk());
    }
}
