package tp.ensim.TPINFO2.model;

import java.util.Date;

public class Forecast {
    public String insee;
    public int cp;
    public double latitude;
    public double longitude;
    public int day;
    public Date datetime;
    public int wind10m;
    public int gust10m;
    public int dirwind10m;
    public double rr10;
    public double rr1;
    public int probarain;
    public int weather;
    public int tmin;
    public int tmax;
    public int sunHours;
    public double etp;
    public int probafrost;
    public int probafog;
    public int probawind70;
    public int probawind100;
    public  int gustx;

    public String getInsee() {
        return insee;
    }

    public void setInsee(String insee) {
        this.insee = insee;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getWind10m() {
        return wind10m;
    }

    public void setWind10m(int wind10m) {
        this.wind10m = wind10m;
    }

    public int getGust10m() {
        return gust10m;
    }

    public void setGust10m(int gust10m) {
        this.gust10m = gust10m;
    }

    public int getDirwind10m() {
        return dirwind10m;
    }

    public void setDirwind10m(int dirwind10m) {
        this.dirwind10m = dirwind10m;
    }

    public double getRr10() {
        return rr10;
    }

    public void setRr10(double rr10) {
        this.rr10 = rr10;
    }

    public double getRr1() {
        return rr1;
    }

    public void setRr1(double rr1) {
        this.rr1 = rr1;
    }

    public int getProbarain() {
        return probarain;
    }

    public void setProbarain(int probarain) {
        this.probarain = probarain;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTmin() {
        return tmin;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public int getSunHours() {
        return sunHours;
    }

    public void setSunHours(int sunHours) {
        this.sunHours = sunHours;
    }

    public double getEtp() {
        return etp;
    }

    public void setEtp(double etp) {
        this.etp = etp;
    }

    public int getProbafrost() {
        return probafrost;
    }

    public void setProbafrost(int probafrost) {
        this.probafrost = probafrost;
    }

    public int getProbafog() {
        return probafog;
    }

    public void setProbafog(int probafog) {
        this.probafog = probafog;
    }

    public int getProbawind70() {
        return probawind70;
    }

    public void setProbawind70(int probawind70) {
        this.probawind70 = probawind70;
    }

    public int getProbawind100() {
        return probawind100;
    }

    public void setProbawind100(int probawind100) {
        this.probawind100 = probawind100;
    }

    public int getGustx() {
        return gustx;
    }

    public void setGustx(int gustx) {
        this.gustx = gustx;
    }
}
