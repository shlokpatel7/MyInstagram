package com.example.shlokpatel.myinstagram;

public class my_feed {
    String circleImage,mainImage,userName;
    int btn1,btn2,btn3;

    public my_feed(String circleImage, String mainImage, String userName, int btn1, int btn2, int btn3) {

        this.circleImage = circleImage;
        this.mainImage = mainImage;
        this.userName = userName;
        this.btn1 = btn1;
        this.btn2 = btn2;
        this.btn3 = btn3;
    }
    public String getCircleImage() {
        return circleImage;
    }

    public void setCircleImage(String circleImage) {
        this.circleImage = circleImage;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBtn1() {
        return btn1;
    }

    public void setBtn1(int btn1) {
        this.btn1 = btn1;
    }

    public int getBtn2() {
        return btn2;
    }

    public void setBtn2(int btn2) {
        this.btn2 = btn2;
    }

    public int getBtn3() {
        return btn3;
    }

    public void setBtn3(int btn3) {
        this.btn3 = btn3;
    }


}
