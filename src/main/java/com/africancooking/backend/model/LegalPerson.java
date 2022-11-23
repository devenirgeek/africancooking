package com.africancooking.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Set;



public class LegalPerson extends Person {

    private String companyName;
    private String legalForm;
    private Set<String> companyDirectors;

    public LegalPerson(String companyName, String legalForm, Set<String> companyDirectors) {
        this.companyName = companyName;
        this.legalForm = legalForm;
        this.companyDirectors = companyDirectors;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    public Set<String> getCompanyDirectors() {
        return companyDirectors;
    }

    public void setCompanyDirectors(Set<String> companyDirectors) {
        this.companyDirectors = companyDirectors;
    }
}
