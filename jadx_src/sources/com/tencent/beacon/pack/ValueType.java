package com.tencent.beacon.pack;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ValueType implements Serializable {
    public static final int BYTE_VAL = 1;
    public static final int MAP_VAL = 0;
    public static final int UNKNOWN_VAL = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f99251t;
    private int value;
    public static final ValueType MAP = new ValueType(0, 0, "MAP");
    public static final ValueType BYTE = new ValueType(1, 1, "BYTE");
    public static final ValueType UNKNOWN = new ValueType(2, 2, "UNKNOWN");
    private static ValueType[] values = new ValueType[3];

    private ValueType(int i10, int i11, String str) {
        this.f99251t = str;
        this.value = i11;
        values[i10] = this;
    }

    public static ValueType convert(int i10) {
        for (ValueType valueType : values) {
            if (valueType.value() == i10) {
                return valueType;
            }
        }
        return null;
    }

    public static ValueType convert(String str) {
        for (ValueType valueType : values) {
            if (valueType.toString().equals(str)) {
                return valueType;
            }
        }
        return null;
    }

    public String toString() {
        return this.f99251t;
    }

    public int value() {
        return this.value;
    }
}
