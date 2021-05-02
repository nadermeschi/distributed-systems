package de.hse.persistent_crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JPAController {

    @Autowired
    private StringRepository stringRepository;
    private Logger logger = LoggerFactory.getLogger(JPAController.class);
    List<String> listOfStrings = new ArrayList<String>();
    
    @GetMapping("/strings")
	public String readAllStrings(){
		logger.info("String being returned {}", listOfStrings.toString());
        
        for (StringEntity data : stringRepository.findAll()) {
            listOfStrings.add(data.getData());  
        }

		return listOfStrings.toString();
	}

	@PostMapping("/strings/{input}")
	public String createString(@PathVariable String input){

		logger.error("String to add {}", input);

        stringRepository.save(new StringEntity(input));
		//listOfStrings.add(input);
		//logger.debug("Current List of Strings {}", listOfStrings); // set up in application properties to see them
		return input + " wurde zur Liste hinzugefügt.";
	}

	@PutMapping("/strings/{oldString}/{newString}")
	public String updateString(@PathVariable String newString){
		return "Nothing happened.";
	}

	@DeleteMapping("/strings/{deleteInput}")
	public String deleteString(@PathVariable String deleteInput){

		logger.info("String to delete: {}", deleteInput);

		//listOfStrings.remove(deleteInput);
		//logger.debug("Current List of Strings {}", listOfStrings); // set up in application properties to see them
		return deleteInput + " wurde aus der Liste entfernt.";
	} 

}