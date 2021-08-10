package br.com.delazari.springMongo.entity.enumerated;

/**
 * 
 * @author delazari
 * 
 */

public enum Gender {
    MALE(0, "Male"), FEMALE(1, "Female");

    private Integer index;
    private String description;

    private Gender(Integer index, String description) {
        this.index = index;
        this.description = description;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
