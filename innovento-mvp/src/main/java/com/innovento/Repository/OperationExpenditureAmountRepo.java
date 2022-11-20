package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.OperationExpenditureAmount;

@Repository
public interface OperationExpenditureAmountRepo extends JpaRepository<OperationExpenditureAmount, Long>{

}
