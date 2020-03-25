package pl.bykowski.spring.security.sample.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class QuatationApi {

    private List<Quatation> quatations;

    public QuatationApi(List<Quatation> quatations) {
        this.quatations = new ArrayList<>();
        quatations.add(new Quatation("To, że milczę, nie znaczy, że nie mam nic do powiedzenia.","Jonathan Carroll"));
        quatations.add(new Quatation("Lepiej zaliczać się do niektórych, niż do wszystkich","Andrzej Sapkowski"));
    }

    @GetMapping("/api")
    public List<Quatation> main(String[] args) {
        return quatations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quatation quatation){
        return quatations.add(quatation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index){
        quatations.remove(index);
    }

}
