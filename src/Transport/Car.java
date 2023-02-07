package Transport;

import javax.swing.*;

public class Car {

    private class Key {

        private final boolean isRemoteEngineStart;
        private final boolean isKeylessEntry;

        public Key(boolean isRemoteEngineStart, boolean isKeylessEntry) {
            this.isRemoteEngineStart = isRemoteEngineStart;
            this.isKeylessEntry = isKeylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return isKeylessEntry;
        }
    }
    private final String brand;
    private final String model;
    private Float engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private int regNumber;
    private final int numberOfSeats;
    private boolean tyresType;

    private final Key key;


    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя " + engineVolume +
                ", цвет " + color +
                ", год выпуска " + productionYear +
                ", сборка в: " + productionCountry +
                ", коробка передач " + transmission +
                ", кузов " + bodyType +
                ", регистрационный номер " + regNumber +
                ", количество мест - " + numberOfSeats +
                ", тип резины: " + getTyresType() +
                ", Удаленный запуск двигателя: " + key.isRemoteEngineStart() +
                ", Бесключевой доступ: " + key.isKeylessEntry();
    }

    public Car(String brand,
               String model,
               String color,
               Float engineVolume,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               int regNumber,
               int numberOfSeats,
               boolean tyresType,
               boolean isRemoteEngineStart,
               boolean isKeylessEntry) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);

        setColor(color);

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        setRegNumber(regNumber);

        if (numberOfSeats < 0) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.tyresType = tyresType;

        key = new Key(isRemoteEngineStart, isKeylessEntry);
    }

    public void changeTyres(int month) {

        tyresType = month < 4 || month > 9;  //зимняя резина
    }

    public String getTyresType() {
        if (tyresType) {
            return "Зимняя резина";
        } else {
            return "Летняя резина";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTyresType() {
        return tyresType;
    }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 0f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegNumber(int regNumber) {
        if (regNumber < 0) {
            this.regNumber = 0;
        } else {
            this.regNumber = regNumber;
        }
    }

    public void setTyresType(boolean tyresType) {
        this.tyresType = tyresType;
    }
}
