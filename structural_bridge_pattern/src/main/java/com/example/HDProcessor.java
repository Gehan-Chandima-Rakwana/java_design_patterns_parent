package com.example;

public class HDProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile+" Video Playing with HD");
    }
}
