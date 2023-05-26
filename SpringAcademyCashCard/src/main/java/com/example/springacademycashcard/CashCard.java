package com.example.springacademycashcard;

import org.springframework.data.annotation.Id;

public record CashCard(@Id long id, double amount) {

}
