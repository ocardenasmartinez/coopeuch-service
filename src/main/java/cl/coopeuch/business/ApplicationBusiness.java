package cl.coopeuch.business;

import cl.coopeuch.business.entities.User;

import java.util.List;

public interface  ApplicationBusiness {

    String add(String description, boolean current);
    String edit(int id, String description, boolean current);
    List<User> get();

}
