package com.jorgebraga.finance_api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jorgebraga.finance_api.model.Expense;
import com.jorgebraga.finance_api.model.Income;
import com.jorgebraga.finance_api.service.FinanceService;

import java.util.List;

@RestController
@RequestMapping("/api/finance")
public class FinanceController {
    @Autowired
    private FinanceService financeService;

    @GetMapping("/incomes")
    public List<Income> getAllIncomes() {
        return financeService.getAllIncomes();
    }

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return financeService.getAllExpenses();
    }

    @PostMapping("/incomes")
    public Income createIncome(@RequestBody Income income) {
        return financeService.saveIncome(income);
    }

    @PostMapping("/expenses")
    public Expense createExpense(@RequestBody Expense expense) {
        return financeService.saveExpense(expense);
    }

    @DeleteMapping("/incomes/{id}")
    public void deleteIncome(@PathVariable Long id) {
        financeService.deleteIncome(id);
    }

    @DeleteMapping("/expenses/{id}")
    public void deleteExpense(@PathVariable Long id) {
        financeService.deleteExpense(id);
    }
}

