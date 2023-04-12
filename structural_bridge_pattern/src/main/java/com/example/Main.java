package com.example;

public class Main {
    public static void main(String[] args) {

        Video youtubeVideo = new YoutubeVideo(new HDProcessor());
        youtubeVideo.play("Avatar");

        Video netflixVideo = new NetflixVideo(new UHD4kProcessor());
        netflixVideo.play("Avatar");
    }
}