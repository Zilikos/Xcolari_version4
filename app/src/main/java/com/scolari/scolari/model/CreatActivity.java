package com.scolari.scolari.model;

/**
 * Created by zilikos on 18/10/17.
 */

public class CreatActivity {

    private int pictureAct;
    private String titleA;
    private int menuA;

    public CreatActivity(int pictureAct, String titleA, int menuA) {
        this.pictureAct = pictureAct;
        this.titleA = titleA;
        this.menuA = menuA;
    }

    public int getPictureAct() {
        return pictureAct;
    }

    public void setPictureAct(int pictureAct) {
        this.pictureAct = pictureAct;
    }

    public String getTitleA() {
        return titleA;
    }

    public void setTitleA(String titleA) {
        this.titleA = titleA;
    }

    public int getMenuA() {
        return menuA;
    }

    public void setMenuA(int menuA) {
        this.menuA = menuA;
    }
}
