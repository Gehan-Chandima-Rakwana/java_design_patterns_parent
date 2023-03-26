package com.example;

public class ApplicationMainFactory {
    private Button button;

    public ApplicationMainFactory(UIFactory factory) {
        this.button = factory.createButton();
    }

    public void paint(){
        button.paint();
    }
}
