package com.tencent.custom.customcapture.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Size {
    public int height;
    public int width;

    public Size() {
    }

    public Size(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public void swap() {
        int i10 = this.width;
        this.width = this.height;
        this.height = i10;
    }
}
