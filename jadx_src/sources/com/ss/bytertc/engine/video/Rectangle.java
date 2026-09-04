package com.ss.bytertc.engine.video;

/* JADX INFO: loaded from: classes4.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f98040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f98041y;

    public Rectangle(int i10, int i11, int i12, int i13) {
        this.f98040x = i10;
        this.f98041y = i11;
        this.width = i12;
        this.height = i13;
    }

    public String toString() {
        return "Rectangle{x=" + this.f98040x + ", y=" + this.f98041y + ", width=" + this.width + ", height=" + this.height + '}';
    }
}
