package com.jorgebraga.finance_api.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jorgebraga.finance_api.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}

