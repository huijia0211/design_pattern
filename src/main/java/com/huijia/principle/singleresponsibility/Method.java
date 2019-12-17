package com.huijia.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "huijia";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        userName = "huijia";
//        address = "beijing";
    }

    private void updateUsername(String userName) {
        userName = "huijia";

    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "huijia";
        address = "beijing";
    }

}
