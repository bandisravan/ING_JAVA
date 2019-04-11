package com.ing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.domain.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Integer>{
	
}
