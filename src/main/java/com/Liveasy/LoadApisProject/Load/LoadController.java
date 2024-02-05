package com.Liveasy.LoadApisProject.Load;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadController {

	 @Autowired
	    private LoadService loadService;

	    @PostMapping
	    public String addLoad(@RequestBody Load load) {
	        loadService.addLoad(load);
	        return "Load details added successfully";
	    }

	    @GetMapping
	    public List<Load> getAllLoadsByShipperId(@RequestParam Long shipperId) {
	        return loadService.getAllLoadsByShipperId(shipperId);
	    }
	    
	    @GetMapping("/{loadId}")
	    public Load getLoadById(@PathVariable Long loadId) {
	        return loadService.getLoadById(loadId);
	    }

	    @PutMapping("/{loadId}")
	    public Load updateLoad(@PathVariable Long loadId, @RequestBody Load updatedLoad) {
	        return loadService.updateLoad(loadId, updatedLoad);
	        
	    }

	    @DeleteMapping("/{loadId}")
	    public void deleteLoad(@PathVariable Long loadId) {
	        loadService.deleteLoad(loadId);
	    }
}
