package cl.coopeuch.controllers.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetResponse {

    private int id;
    private String description;
    private boolean current;

}
