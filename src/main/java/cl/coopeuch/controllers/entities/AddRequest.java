package cl.coopeuch.controllers.entities;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AddRequest {

    @NotNull(message = "Description can not be null")
    @NotEmpty(message = "Please enter description")
    private String description;

    @NotNull(message = "Current can not be null")
    private boolean current;

}
