package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.ax;

/* JADX INFO: loaded from: classes4.dex */
public enum Gender implements ax {
    MALE(0),
    FEMALE(1),
    UNKNOWN(2);

    private final int value;

    Gender(int i10) {
        this.value = i10;
    }

    public static Gender findByValue(int i10) {
        if (i10 == 0) {
            return MALE;
        }
        if (i10 == 1) {
            return FEMALE;
        }
        if (i10 != 2) {
            return null;
        }
        return UNKNOWN;
    }

    @Override // com.umeng.analytics.pro.ax
    public int getValue() {
        return this.value;
    }
}
