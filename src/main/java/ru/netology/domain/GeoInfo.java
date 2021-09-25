package ru.netology.domain;

public class GeoInfo {

    private String type; // поле из документации
    private String coordinates; // поле из документации
    private PlaceInfo placeInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс PlaceInfo

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PlaceInfo getPlaceInfo() {
        return placeInfo;
    }

    public void setPlaceInfo(PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
    }
}
