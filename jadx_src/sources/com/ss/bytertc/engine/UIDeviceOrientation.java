package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public enum UIDeviceOrientation {
    Portrait(0),
    LandscapeLeft(90),
    PortraitUpsidedown(180),
    LandscapeRight(270);

    private int value;

    UIDeviceOrientation() {
        this.value = 0;
    }

    UIDeviceOrientation(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
