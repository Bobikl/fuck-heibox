package com.ss.bytertc.engine.device;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceState {
    INIT(0),
    START(1),
    STOP(2),
    REMOVE(3);

    int type;

    DeviceState(int i10) {
        this.type = i10;
    }

    public static DeviceState fromId(int i10) {
        for (DeviceState deviceState : values()) {
            if (deviceState.getId() == i10) {
                return deviceState;
            }
        }
        return null;
    }

    public int getId() {
        return this.type;
    }
}
