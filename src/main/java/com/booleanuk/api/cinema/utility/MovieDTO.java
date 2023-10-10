package com.booleanuk.api.cinema.utility;

import com.booleanuk.api.cinema.model.Screening;

import java.util.List;

public record MovieDTO(String title, String rating, String description, Integer runtimeMins, List<Screening> screenings) {
}
