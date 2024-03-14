package com.sb.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.model.Settlement;

@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Integer>{

}
