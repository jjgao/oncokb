package org.mskcc.cbio.oncokb.model;
// Generated Dec 19, 2013 1:33:26 AM by Hibernate Tools 3.2.1.GA

import java.util.List;


/**
 * TumorType generated by hbm2java
 */
public class EvidenceQueryRes implements java.io.Serializable {
    private String id; //Optional, This id is passed from request. The identifier used to distinguish the query
    private Query query;
    private Gene gene;
    private List<Alteration> alterations;
    private List<TumorType> tumorTypes;
    private List<Evidence> evidences;

    public EvidenceQueryRes() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Gene getGene() {
        return gene;
    }

    public void setGene(Gene gene) {
        this.gene = gene;
    }

    public List<Alteration> getAlterations() {
        return alterations;
    }

    public void setAlterations(List<Alteration> alterations) {
        this.alterations = alterations;
    }

    public List<TumorType> getTumorTypes() {
        return tumorTypes;
    }

    public void setTumorTypes(List<TumorType> tumorTypes) {
        this.tumorTypes = tumorTypes;
    }

    public List<Evidence> getEvidences() {
        return evidences;
    }

    public void setEvidences(List<Evidence> evidences) {
        this.evidences = evidences;
    }
}


