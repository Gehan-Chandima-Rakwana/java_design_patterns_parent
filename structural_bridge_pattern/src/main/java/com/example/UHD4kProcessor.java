package com.example;

public class UHD4kProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(videoFile+" Video Playing with UHD4k");
    }
}
