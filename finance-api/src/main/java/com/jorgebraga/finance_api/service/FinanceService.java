package com.jorgebraga.finance_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgebraga.finance_api.model.Expense;
import com.jorgebraga.finance_api.model.Income;
import com.jorgebraga.finance_api.repository.ExpenseRepository;
import com.jorgebraga.finance_api.repository.IncomeRepository;

import java.util.List;

@Service
public class FinanceService {
    @Autowired
    private IncomeRepository incomeRepository;

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Income saveIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}
