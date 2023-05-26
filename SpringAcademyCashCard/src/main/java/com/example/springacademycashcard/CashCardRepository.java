package com.example.springacademycashcard;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CashCardRepository extends PagingAndSortingRepository<CashCard, Long>, CrudRepository<CashCard, Long> {
}
