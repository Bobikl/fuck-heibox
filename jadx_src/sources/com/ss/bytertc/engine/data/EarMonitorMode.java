package com.ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public enum EarMonitorMode {
    EAR_MONITOR_MODE_OFF(0),
    EAR_MONITOR_MODE_ON(1);

    private int value;

    EarMonitorMode(int i10) {
        this.value = i10;
    }

    @CalledByNative
    public static EarMonitorMode fromId(int i10) {
        for (EarMonitorMode earMonitorMode : values()) {
            if (earMonitorMode.value() == i10) {
                return earMonitorMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == EAR_MONITOR_MODE_ON ? "kEarMonitorModeOn" : "kEarMonitorModeOff";
    }

    public int value() {
        return this.value;
    }
}
