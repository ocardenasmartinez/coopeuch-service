package cl.coopeuch.controllers.entities;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class EditRequest {

    @NotNull
    private int id;

    @NotNull
    @NotEmpty(message = "Please enter description")
    private String description;

    @NotNull
    private boolean current;

}
