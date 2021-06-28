package com.victorhgb.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorhgb.hrworker.entities.Worker;


public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
