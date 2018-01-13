package com.example.ameerhamza.gerapro.model;

import java.io.Serializable;

/**
 * Created by AmeerHamza on 1/13/2018.
 */

public class item implements Serializable {
    private int id;
    private int userId;
    private String name;
    private String image;
    private String address;
    private String website;
    private String description;
    private String qr;
    private String phone;

    public item(int id, int userId, String name, String image, String address, String website, String description, String qr,String phone) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.image = image;
        this.address = address;
        this.website = website;
        this.description = description;
        this.qr = qr;
        this.phone=phone;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }

    public String getDescription() {
        return description;
    }

    public String getQr() {
        return qr;
    }

    public String getPhone() {
        return phone;
    }
}
