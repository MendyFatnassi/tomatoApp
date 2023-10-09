package com.example.tomatoapp.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Data
@Builder
public class Legume {

    private Integer id;

    private String nom;

    private List<Categories> categories;

    private String description;

    private PlanningPlantation planningPlantation;


}
