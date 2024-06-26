package com.java.interviewprograms.stream;

import java.io.Serializable;
import java.util.Objects;

public class Pokemon implements Serializable, Comparable<Pokemon>{
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int hp;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;

    public Pokemon() {
    }

    public Pokemon(int id, String name, String type1, String type2, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }


    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }


    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon pokemon)) return false;
        return getId() == pokemon.getId() && getHp() == pokemon.getHp() && getAttack() == pokemon.getAttack() && getDefense() == pokemon.getDefense() && getSpecialAttack() == pokemon.getSpecialAttack() && getSpecialDefense() == pokemon.getSpecialDefense() && getSpeed() == pokemon.getSpeed() && Objects.equals(getName(), pokemon.getName()) && Objects.equals(getType1(), pokemon.getType1()) && Objects.equals(getType2(), pokemon.getType2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType1(), getType2(), getHp(), getAttack(), getDefense(), getSpecialAttack(), getSpecialDefense(), getSpeed());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", type2='" + type2 + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                ", specialAttack=" + specialAttack +
                ", specialDefense=" + specialDefense +
                ", speed=" + speed +
                '}';


    }

   @Override
   public int compareTo(Pokemon args) {
        return this.name.compareTo(args.name);
    }

}

