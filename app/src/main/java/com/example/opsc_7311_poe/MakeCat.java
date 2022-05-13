package com.example.opsc_7311_poe;

public class MakeCat {
    private Integer CatID;
    private String CatName;
    private Integer CatGoals;

    public MakeCat(Integer catID, String catName, Integer catGoals) {
        CatID = catID;
        CatName = catName;
        CatGoals = catGoals;
    }

    public Integer getCatID() {
        return CatID;
    }

    public void setCatID(Integer catID) {
        CatID = catID;
    }

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }

    public Integer getCatGoals() {
        return CatGoals;
    }

    public void setCatGoals(Integer catGoals) {
        CatGoals = catGoals;
    }
}
