package ru.netology.domain;

public class Donut {

    private boolean isDonut; // поле из документации
    private int paidDuration; // поле из документации
    private PlaceHolder placeHolder; // в документации он типа object, под такой тип объекта мы создали отдельный класс PlaceHolder
    private boolean canPublishFreeCopy; // поле из документации
    private String editMode; // поле из документации

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public PlaceHolder getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(PlaceHolder placeHolder) {
        this.placeHolder = placeHolder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
