package com.example.minnewman.listbuilder;

import java.util.ArrayList;

/**
 * Created by knotm on 9/11/2017.
 */

public class Faction {

    private String name;
    private ArrayList<Unit> hq;
    private ArrayList<Unit> elites;
    private ArrayList<Unit> troops;
    private ArrayList<Unit> heavySupport;
    private ArrayList<Unit> fastAttack;
    private ArrayList<Unit> flyer;
    private ArrayList<Unit> transport;
    private ArrayList<Unit> lordOfWar;

    public Faction(String name, ArrayList<Unit> hq, ArrayList<Unit> elites, ArrayList<Unit> troops, ArrayList<Unit> heavySupport, ArrayList<Unit> fastAttack, ArrayList<Unit> flyer, ArrayList<Unit> transport, ArrayList<Unit> lordOfWar) {
        this.name = name;
        this.hq = hq;
        this.elites = elites;
        this.troops = troops;
        this.heavySupport = heavySupport;
        this.fastAttack = fastAttack;
        this.flyer = flyer;
        this.transport = transport;
        this.lordOfWar = lordOfWar;
    }

    public Faction(String name){
        setName(name);
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

    public ArrayList<Unit> getHq() {
        return hq;
    }

    public void setHq(ArrayList<Unit> hq) {
        this.hq = hq;
    }

    public ArrayList<Unit> getElites() {
        return elites;
    }

    public void setElites(ArrayList<Unit> elites) {
        this.elites = elites;
    }

    public ArrayList<Unit> getTroops() {
        return troops;
    }

    public void setTroops(ArrayList<Unit> troops) {
        this.troops = troops;
    }

    public ArrayList<Unit> getHeavySupport() {
        return heavySupport;
    }

    public void setHeavySupport(ArrayList<Unit> heavySupport) {
        this.heavySupport = heavySupport;
    }

    public ArrayList<Unit> getFastAttack() {
        return fastAttack;
    }

    public void setFastAttack(ArrayList<Unit> fastAttack) {
        this.fastAttack = fastAttack;
    }

    public ArrayList<Unit> getFlyer() {
        return flyer;
    }

    public void setFlyer(ArrayList<Unit> flyer) {
        this.flyer = flyer;
    }

    public ArrayList<Unit> getTransport() {
        return transport;
    }

    public void setTransport(ArrayList<Unit> transport) {
        this.transport = transport;
    }

    public ArrayList<Unit> getLordOfWar() {
        return lordOfWar;
    }

    public void setLordOfWar(ArrayList<Unit> lordOfWar) {
        this.lordOfWar = lordOfWar;
    }
}
