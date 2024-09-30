package com.example.practos2;

public class State {
    private String name;
    private String capital;
    private int flagResource;

    // Конструктор
    public State(String name, String capital, int flagResource) {
        this.name = name;
        this.capital = capital;
        this.flagResource = flagResource;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getFlagResource() {
        return flagResource;
    }

    // Сеттеры (если они нужны)
    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}