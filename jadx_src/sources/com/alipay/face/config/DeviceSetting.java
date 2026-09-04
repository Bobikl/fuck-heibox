package com.alipay.face.config;

import bb.c;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceSetting {
    boolean displayAuto = true;
    int displayAngle = 90;
    boolean cameraAuto = true;
    int cameraID = 1;
    boolean algorithmAuto = true;
    int algorithmAngle = 270;
    boolean widthAuto = true;
    int width = c.b.f30883q9;
    int zoom = 0;
    int maxApiLevel = 100;
    int minApiLevel = 0;
    boolean isp = false;
    boolean slir = false;

    public int getAlgorithmAngle() {
        return this.algorithmAngle;
    }

    public int getCameraID() {
        return this.cameraID;
    }

    public int getDisplayAngle() {
        return this.displayAngle;
    }

    public int getMaxApiLevel() {
        return this.maxApiLevel;
    }

    public int getMinApiLevel() {
        return this.minApiLevel;
    }

    public int getWidth() {
        return this.width;
    }

    public int getZoom() {
        return this.zoom;
    }

    public boolean isAlgorithmAuto() {
        return this.algorithmAuto;
    }

    public boolean isCameraAuto() {
        return this.cameraAuto;
    }

    public boolean isDisplayAuto() {
        return this.displayAuto;
    }

    public boolean isIsp() {
        return this.isp;
    }

    public boolean isSlir() {
        return this.slir;
    }

    public boolean isWidthAuto() {
        return this.widthAuto;
    }

    public void setAlgorithmAngle(int i10) {
        this.algorithmAngle = i10;
    }

    public void setAlgorithmAuto(boolean z10) {
        this.algorithmAuto = z10;
    }

    public void setCameraAuto(boolean z10) {
        this.cameraAuto = z10;
    }

    public void setCameraID(int i10) {
        this.cameraID = i10;
    }

    public void setDisplayAngle(int i10) {
        this.displayAngle = i10;
    }

    public void setDisplayAuto(boolean z10) {
        this.displayAuto = z10;
    }

    public void setIsp(boolean z10) {
        this.isp = z10;
    }

    public void setMaxApiLevel(int i10) {
        this.maxApiLevel = i10;
    }

    public void setMinApiLevel(int i10) {
        this.minApiLevel = i10;
    }

    public void setSlir(boolean z10) {
        this.slir = z10;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public void setWidthAuto(boolean z10) {
        this.widthAuto = z10;
    }

    public void setZoom(int i10) {
        this.zoom = i10;
    }

    public String toString() {
        return "DeviceSetting{displayAuto=" + this.displayAuto + ", displayAngle=" + this.displayAngle + ", cameraAuto=" + this.cameraAuto + ", cameraID=" + this.cameraID + ", algorithmAuto=" + this.algorithmAuto + ", algorithmAngle=" + this.algorithmAngle + ", widthAuto=" + this.widthAuto + ", width=" + this.width + ", zoom=" + this.zoom + ", maxApiLevel=" + this.maxApiLevel + ", minApiLevel=" + this.minApiLevel + ", isp=" + this.isp + ", slir=" + this.slir + '}';
    }
}
