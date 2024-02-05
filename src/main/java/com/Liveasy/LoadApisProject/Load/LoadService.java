package com.Liveasy.LoadApisProject.Load;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

	@Autowired
    private LoadRepository loadRepository;

	public List<Load> getAllLoadsByShipperId(long shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    public Load getLoadById(Long loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    public Load addLoad(Load load) {
        return loadRepository.save(load);
    }

    public Load updateLoad(Long loadId, Load updatedLoad) {
        Load existingLoad = loadRepository.findById(loadId).orElse(null);
        if (existingLoad != null) {
            // Update fields based on your requirement
            existingLoad.setLoadingPoint(updatedLoad.getLoadingPoint());
            existingLoad.setUnloadingPoint(updatedLoad.getUnloadingPoint());
            existingLoad.setProductType(updatedLoad.getProductType());
            existingLoad.setTruckType(updatedLoad.getTruckType());
            existingLoad.setNoOfTrucks(updatedLoad.getNoOfTrucks());
            existingLoad.setWeight(updatedLoad.getWeight());
            existingLoad.setComment(updatedLoad.getComment());
            existingLoad.setDate(updatedLoad.getDate());

            return loadRepository.save(existingLoad);
        }
        return null;
    }

    public void deleteLoad(Long loadId) {
        loadRepository.deleteById(loadId);
    }
}
