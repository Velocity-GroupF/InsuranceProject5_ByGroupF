
package com.sb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
