package com.example.tomatoapp.model;

import lombok.Builder;
import lombok.Data;

import java.util.Calendar;

@Data
@Builder
public class PlanningPlantation {

    private Calendar dateSemis;

    private Calendar dateRecolte;

}
