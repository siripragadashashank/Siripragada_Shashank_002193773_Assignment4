/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sirip
 */
public class VitalSigns {
    private double temperature;
    private int pulse;
    private double sbp;
    private double dbp;
    private int respirationRate;
    private double spo2;
    private double bmi;

    public VitalSigns(double temperature, int pulse, double sbp, double dbp, int respirationRate, double spo2, double bmi) {
        this.temperature = temperature;
        this.pulse = pulse;
        this.sbp = sbp;
        this.dbp = dbp;
        this.respirationRate = respirationRate;
        this.spo2 = spo2;
        this.bmi = bmi;
    }
    
    public VitalSigns() {
        
    }
    
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public double getSbp() {
        return sbp;
    }

    public void setSbp(double sbp) {
        this.sbp = sbp;
    }

    public double getDbp() {
        return dbp;
    }

    public void setDbp(double dbp) {
        this.dbp = dbp;
    }

    public int getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(int respirationRate) {
        this.respirationRate = respirationRate;
    }

    public double getSpo2() {
        return spo2;
    }

    public void setSpo2(double spo2) {
        this.spo2 = spo2;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    
    @Override
    public String toString() {
        return String.valueOf(temperature);
    }
    
}
