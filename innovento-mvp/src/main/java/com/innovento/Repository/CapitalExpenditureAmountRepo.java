package com.innovento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innovento.model.CapitalExpenditureAmount;

@Repository
public interface CapitalExpenditureAmountRepo extends JpaRepository<CapitalExpenditureAmount, Long> {

}
