package com.huijia.creational.simplefactory;

/**
 * @author Admin
 */
public class Test {
//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
