package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public enum DataMessageSourceType {
    DATA_MESSAGE_SOURCE_TYPE_DEFAULT(0),
    DATA_MESSAGE_SOURCE_TYPE_SYSTEM(1);

    private int value;

    DataMessageSourceType(int i10) {
        this.value = i10;
    }

    public static DataMessageSourceType fromId(int i10) {
        for (DataMessageSourceType dataMessageSourceType : values()) {
            if (dataMessageSourceType.value() == i10) {
                return dataMessageSourceType;
            }
        }
        return null;
    }

    public int value() {
        return this.value;
    }
}
