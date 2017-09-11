package com.example.minnewman.listbuilder;

import java.util.List;

/**
 * Created by knotm on 9/7/2017.
 */

public class Unit {

    private String name;
    private Integer points;
    private Integer power;
    private List keywords;
    private List factionKeywords;

    public Unit(String name, Integer points, Integer power, List keywords, List factionKeywords) {
        this.name = name;
        this.points = points;
        this.power = power;
        this.keywords = keywords;
        this.factionKeywords = factionKeywords;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public List getKeywords() {
        return keywords;
    }

    public void setKeywords(List keywords) {
        this.keywords = keywords;
    }

    public List getFactionKeywords() {
        return factionKeywords;
    }

    public void setFactionKeywords(List factionKeywords) {
        this.factionKeywords = factionKeywords;
    }
}
