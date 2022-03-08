package com.structualPattern.adapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "hello.mp3");
        audioPlayer.play("mp4", "rainy.mp4");
        audioPlayer.play("vlc", "mama.vlc");
        audioPlayer.play("avi", "earth.avi");
    }
}
