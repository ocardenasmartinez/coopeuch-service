package cl.coopeuch.controllers;

import cl.coopeuch.controllers.entities.AddRequest;
import cl.coopeuch.controllers.entities.EditRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CoopeuchApplicationControllerTest {

    @Autowired
    private CoopeuchApplicationController controller;

    @Test
    public void addController() {
        AddRequest addRequest = new AddRequest();
        addRequest.setCurrent(true);
        addRequest.setDescription("description");
        String response =  controller.add(addRequest).getBody();
        assertEquals(response, "ok");
    }

    @Test
    public void editController() {

        AddRequest addRequest = new AddRequest();
        addRequest.setCurrent(true);
        addRequest.setDescription("description");
        controller.add(addRequest);

        EditRequest editRequest = new EditRequest();
        editRequest.setId(1);
        editRequest.setCurrent(false);
        editRequest.setDescription("description1");
        String response = controller.edit(editRequest).getBody();
        assertEquals(response, "ok");
    }

}
