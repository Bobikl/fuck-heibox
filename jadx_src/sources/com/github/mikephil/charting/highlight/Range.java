package com.github.mikephil.charting.highlight;

/* JADX INFO: loaded from: classes6.dex */
public final class Range {
    public float from;
    public float to;

    public Range(float f10, float f11) {
        this.from = f10;
        this.to = f11;
    }

    public boolean contains(float f10) {
        return f10 > this.from && f10 <= this.to;
    }

    public boolean isLarger(float f10) {
        return f10 > this.to;
    }

    public boolean isSmaller(float f10) {
        return f10 < this.from;
    }
}
