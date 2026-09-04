package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum RtcMode {
    RTC_MODE_GENERAL(0),
    RTC_MODE_LOCAL_AUDIO(1);

    private int value;

    RtcMode(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
