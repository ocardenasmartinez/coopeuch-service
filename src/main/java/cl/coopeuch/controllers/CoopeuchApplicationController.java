package cl.coopeuch.controllers;

import cl.coopeuch.controllers.entities.AddRequest;
import cl.coopeuch.business.ApplicationBusiness;
import cl.coopeuch.controllers.entities.EditRequest;
import cl.coopeuch.controllers.entities.GetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoopeuchApplicationController {

    private final ApplicationBusiness applicationBusiness;

    @RequestMapping( path = "add", method = RequestMethod.POST)
    public ResponseEntity<String> add(@Valid @RequestBody AddRequest addRequest){
        return new ResponseEntity<>(applicationBusiness.add(addRequest.getDescription(), addRequest.isCurrent()), HttpStatus.OK);
    }

    @RequestMapping( path = "edit", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> edit(@Valid @RequestBody EditRequest editRequest){
        return new ResponseEntity<>(applicationBusiness.edit(editRequest.getId(), editRequest.getDescription(), editRequest.isCurrent()), HttpStatus.OK);
    }

    @RequestMapping( path = "get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GetResponse>> get(){
        List<GetResponse> response = new ArrayList<>();
        applicationBusiness.get().forEach(user -> {
            response.add(GetResponse.builder()
                    .description(user.getDescription())
                    .current(user.isCurrent())
                    .id(user.getId()).build());
        });
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
