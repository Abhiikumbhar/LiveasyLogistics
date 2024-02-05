package com.Liveasy.LoadApisProject.Load;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadRepository extends JpaRepository<Load, Long>{

	List<Load> findByShipperId(Long shipperId);
}

