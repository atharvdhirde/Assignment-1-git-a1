package com.washerdetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.washerdetails.Models.Washer;
import com.washerdetails.Services.WasherService;



@RestController
@RequestMapping("/washer")
@CrossOrigin("*")
public class WasherController {
	
	@Autowired
	private WasherService  washerService;
	
	
	
    @GetMapping("/")
    public ResponseEntity<List<Washer>> getAllWasher() {
        List<Washer> list = washerService.getAllWasher();

        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }


	
	@PostMapping("/")
	public ResponseEntity<Washer> addWasher(@RequestBody Washer washer)
	{
		try {
			System.out.println(washer);
			washerService.setWasher(washer);
			return ResponseEntity.ok(washer);
			}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Washer> getWasherById(@PathVariable("id") int id) {

        try {
        	Washer washer = washerService.getWasherById(id);
            return ResponseEntity.of(Optional.of(washer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
	
    @PutMapping("/{id}")
    public ResponseEntity<Washer> updateWasher(@RequestBody Washer washer, @PathVariable("id") int id) {
    	Washer washer1 = null;
        try {
        	washer = washerService.updateWasherById(washer);
            return ResponseEntity.ok().body(washer1);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Washer> deleteWasher(@PathVariable("id") int id) {
        try {
        	Washer washer = washerService.getWasherById(id);
            washerService.deleteWasherById(id);
            return ResponseEntity.ok().body(washer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
   
    
    
    
    
	
    
    
        

    



}