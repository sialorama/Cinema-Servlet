package com.example.controller;

import com.example.model.ActeurDAO;
import com.example.model.entity.Acteur;

import java.util.List;

public class ActeurController {

        ActeurDAO acteurDao = new ActeurDAO();

        public List<Acteur> getActeurs() {
                List<Acteur> acteurs = acteurDao.getActeurs();
                return acteurs;
        }
}
