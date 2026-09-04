package com.ss.bytertc.engine.device;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceType {
    MICROPHONE(0),
    SPEAKER(1),
    CAMERA(2);

    int type;

    DeviceType(int i10) {
        this.type = i10;
    }

    public static DeviceType fromId(int i10) {
        for (DeviceType deviceType : values()) {
            if (deviceType.getId() == i10) {
                return deviceType;
            }
        }
        return null;
    }

    int getId() {
        return this.type;
    }
}
