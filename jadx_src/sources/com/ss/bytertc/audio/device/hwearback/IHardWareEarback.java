package com.ss.bytertc.audio.device.hwearback;

/* JADX INFO: loaded from: classes10.dex */
public interface IHardWareEarback {
    int close();

    int getLatency();

    int init();

    boolean isSupport();

    void onEvent(int i10, int i11);

    int open();

    int release();

    int setEffect(int i10);

    int setEqualizer(int i10);

    int setVolume(int i10);
}
