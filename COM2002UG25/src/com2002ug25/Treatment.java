package com2002ug25;

/**
 *
 * @author aca14jg
 */
public class Treatment {
    
    int treatmentId;
    String name;
    String type;
    int cost;
    
//constructor
    public Treatment (int treatmentId, String name, String type, int cost){
        this.treatmentId = treatmentId;
        this.name = name;
        this.type = type;
        this.cost = cost;
    }
    
        public int getTreatmentId() {
        return treatmentId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public void setTreatmentId(int treatmentId) {
        this.treatmentId = treatmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
