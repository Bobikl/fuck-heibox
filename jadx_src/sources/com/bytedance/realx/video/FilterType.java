package com.bytedance.realx.video;

/* JADX INFO: loaded from: classes6.dex */
public enum FilterType {
    Origin(9),
    Bilinear(10),
    Bicubic(11),
    BOX(12);

    private final int value;

    FilterType(int i10) {
        this.value = i10;
    }

    public static FilterType fromValue(int i10) {
        switch (i10) {
            case 10:
                return Bilinear;
            case 11:
                return Bicubic;
            case 12:
                return BOX;
            default:
                return Origin;
        }
    }

    public int toInt() {
        return this.value;
    }
}
