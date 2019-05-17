package com.jyoti.NoFoodWastage;

import java.io.Serializable;

public class LatLong implements Serializable {
    private Double latitude;
    private Double longitude;

    public LatLong() {}

    public LatLong(Double latitude , Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
