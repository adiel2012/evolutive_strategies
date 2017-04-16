/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author adiel
 */
public abstract class EvolutiveAlgorithm {
    
    protected ArrayList<Individual> population = new ArrayList<>();
    
    public abstract void evolve();

    /**
     * @return the population
     */
    public ArrayList<Individual> getPopulation() {
        return population;
    }
}
