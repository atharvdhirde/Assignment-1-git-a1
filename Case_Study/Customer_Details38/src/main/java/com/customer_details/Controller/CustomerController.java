package com.customer_details.Controller;

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

import com.customer_details.Models.Customers;
import com.customer_details.Models.ReviewAndRating;
import com.customer_details.Services.CustomerService;
import com.customer_details.Services.ReviewAndRatingService;


@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	private CustomerService  customerService;
	
	@Autowired
	private ReviewAndRatingService reviewAndRatingService;
	
	
    @GetMapping("/get-all-customer")
    public ResponseEntity<List<Customers>> getAllCustomers() {
        List<Customers> list = customerService.getAllCustomers();

        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));

    }


	
	@PostMapping("/add-customer")
	public ResponseEntity<Customers> addCustomer(@RequestBody Customers customers)
	{
		try {
			System.out.println(customers);
			customerService.setCustomers(customers);
			return ResponseEntity.ok(customers);
			}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@GetMapping("/customer-id/{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable("id") int id) {

        try {
            Customers customer = customerService.getCustomerById(id);
            return ResponseEntity.of(Optional.of(customer));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
	
    @PutMapping("/update-profile/{id}")
    public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customer, @PathVariable("id") int id) {
        Customers customer1 = null;
        try {
            customer = customerService.updateCustomerById(customer);
            return ResponseEntity.ok().body(customer1);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Customers> deleteCustomer(@PathVariable("id") int id) {
        try {
            Customers customer = customerService.getCustomerById(id);
            customerService.deleteCustomerById(id);
            return ResponseEntity.ok().body(customer);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    //For Rating
    
    @GetMapping("/ratings")
    public ResponseEntity<List<ReviewAndRating>> getAllRating() {
    	try {
    	List<ReviewAndRating> list = reviewAndRatingService.giveRatingAndReview();
        return ResponseEntity.of(Optional.of(list));
    } catch(Exception e)
    	{
    		e.printStackTrace();
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    }
    
    @PostMapping("/rating")
	public ResponseEntity<ReviewAndRating> addRating(@RequestBody ReviewAndRating ratings)
	{
		try {
				reviewAndRatingService.addRating(ratings);
				return ResponseEntity.ok().body(ratings);
			}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
    
    
        

    



}