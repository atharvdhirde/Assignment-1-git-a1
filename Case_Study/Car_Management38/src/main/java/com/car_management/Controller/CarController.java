package com.car_management.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
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

import com.car_management.Models.Rating;
import com.car_management.Models.Washpack;
import com.car_management.Services.RatingService;
import com.car_management.Services.WashpackService;
import com.car_management.Utilities.GlobalResources;



//import com.car_management.utilities.GlobalResources;

@RestController
@RequestMapping("/management")
@CrossOrigin("*")
public class CarController {
	
	@Autowired
	private WashpackService  washpackService;
	
	@Autowired
	private RatingService ratingService;
	
	//LOGGER
		private Logger logger = GlobalResources.getLogger(CarController.class);
		
		//TO GET ALL WASHPACK
		@GetMapping("/get-all-washpack")
	    public ResponseEntity<List<Washpack>> getAllWashPack() {
	        List<Washpack> list = washpackService.getAllWashPack();
	        String methodName = "(GetWashPack)";
			logger.info(methodName + "Called");

	        if (list.size() <= 0) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }
	        return ResponseEntity.of(Optional.of(list));

	    }
	
		//TO GET WASHPACK BY NAME
		@GetMapping("/{name}")
	    public ResponseEntity<Washpack> findByName(@PathVariable("name") String name) {

	        try {
	        	String methodName = "(GetWashPackByName)";
				logger.info(methodName + "Called");
				System.out.println(name);
	            Washpack washpack =washpackService.findByName(name);
	            return ResponseEntity.of(Optional.of(washpack));
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }

	    }
		
		//TO ADD NEW WASHPACK
		
		@PostMapping("/")
		public ResponseEntity<Washpack> addNewWashPack(@RequestBody Washpack pack)
		{
			try {
				String methodName = "(addWashPack)";
				logger.info(methodName + "Called");
				
				System.out.println(pack);
				washpackService.addNewWashPack(pack);
				return ResponseEntity.ok(pack);
				}
			catch(Exception e){
				e.printStackTrace();
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//TO UPDAT WASHPACK
		
		 @PutMapping("/{name}")
		    public ResponseEntity<Washpack> updateWashPack(@RequestBody Washpack pack, @PathVariable("name") String name) {
		        Washpack pack1 = null;
		        try {
		        	String methodName = "(updateWashPackByName)";
					logger.info(methodName + "Called");
					System.out.println(name);
		            pack = washpackService.updateWashPackByName(pack);
		            return ResponseEntity.ok().body(pack1);
		        } catch (Exception e) {
		            e.printStackTrace();
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		        }
		    }
		// To delete WashPack
		 @DeleteMapping("/{id}")
		    public void deleteById(@PathVariable("id") int id) {
		        this.washpackService.deleteById(id);
		    }
		 
		 @PutMapping("/")
		    public ResponseEntity<Washpack> updateWashPack(@RequestBody Washpack washpacks)
		    {
		        String methodName = "(updateWashPack)";
		        try {
		            logger.info(methodName + "Called");
		            return ResponseEntity.ok(this.washpackService.updateWashPack(washpacks));
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		            logger.error(methodName,"Something went wrong!!!!");
		            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		        }
		    }
		 
		 @GetMapping(("/getwashpack/{id}"))

		    public ResponseEntity<Washpack> getWashPackById(@PathVariable("id") int id) {
				 String methodName="(Get Data  Of WashPAck by id)";
			        logger.info(methodName+"Called");

		        try {
		            Washpack wash = washpackService.getWashPackByid(id);
		            return ResponseEntity.of(Optional.of(wash));
		        } catch (Exception e) {
		            e.printStackTrace();
		            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		        }

		    }
		 
	

   
  //For Rating
    //Method of Fetching all the Ratings
    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>> getAllRating() {
//    	String methodName="(Data for getting Rating ";
//		logger.info(methodName+" is called.........)");
    	try {
    	List<Rating> list = ratingService.giveRating();
        return ResponseEntity.of(Optional.of(list));
    } catch(Exception e)
    	{
    		e.printStackTrace();
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    }
    
    //Method of Adding of the Ratings
    @PostMapping("/rating")
	public ResponseEntity<Rating> addRating(@RequestBody Rating rating)
	{
//    	String methodName="(Data for adding Rating ";
//		logger.info(methodName+" is called.........)");
		try {
				ratingService.addRating(rating);
				return ResponseEntity.ok().body(rating);
			}
		catch(Exception e){
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}


}