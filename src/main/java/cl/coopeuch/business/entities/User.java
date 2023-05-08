package cl.coopeuch.business.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private int id;
    private String description;
    private boolean current;

}
