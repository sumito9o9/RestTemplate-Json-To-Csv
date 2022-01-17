package com.example.assignment.Entity;

public class Freegeoip {

    private String ip;
    private String country_code;
    private String country_name;
    private String region_code;
    private String region_name;
    private String city;
    private String zip_code;
    private String time_zone;
    private String latitude;
    private String longitude;
    private String metro_code;

    public Freegeoip() {
        super();
    }

    public Freegeoip(String ip, String country_code, String country_name, String region_code, String region_name, String city, String zip_code, String time_zone, String latitude, String longitude, String metro_code) {
        this.ip = ip;
        this.country_code = country_code;
        this.country_name = country_name;
        this.region_code = region_code;
        this.region_name = region_name;
        this.city = city;
        this.zip_code = zip_code;
        this.time_zone = time_zone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.metro_code = metro_code;
    }

    public String getIp() {
        return ip;
    }

    public String getCountry_code() {
        return country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public String getCity() {
        return city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getMetro_code() {
        return metro_code;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setMetro_code(String metro_code) {
        this.metro_code = metro_code;
    }

    @Override
    public String toString() {
        return "Freegeoip{" +
                "ip='" + ip + '\'' +
                ", country_code='" + country_code + '\'' +
                ", country_name='" + country_name + '\'' +
                ", region_code='" + region_code + '\'' +
                ", region_name='" + region_name + '\'' +
                ", city='" + city + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", metro_code='" + metro_code + '\'' +
                '}';
    }
}
