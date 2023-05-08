package cl.coopeuch.business;

import cl.coopeuch.business.entities.User;
import cl.coopeuch.external.database.entities.Users;
import cl.coopeuch.external.database.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ApplicationBusinessImpl implements ApplicationBusiness {

    private final UsersRepository usersRepository;

    @Override
    public String add(String description, boolean current) {
        Users users = new Users();
        users.setDescription(description);
        users.setCurrent(current);
        usersRepository.save(users);
        return "ok";
    }

    @Override
    public String edit(int id, String description, boolean current) {
        Users user = usersRepository.findById(id).orElse(null);
        user.setDescription(description);
        user.setCurrent(current);
        usersRepository.save(user);
        return "ok";
    }

    @Override
    public List<User> get() {
        List<User> userList = new ArrayList<>();
        usersRepository.findAll().forEach(users -> {
            userList.add(User.builder()
                    .description(users.getDescription())
                    .current(users.isCurrent())
                    .id(users.getId()).build());
        });
        return userList;
    }
}
