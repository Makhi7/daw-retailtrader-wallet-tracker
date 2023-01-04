package com.devatwork.traderwallettracker.investment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository
extends JpaRepository<Investment,Long> {
}
