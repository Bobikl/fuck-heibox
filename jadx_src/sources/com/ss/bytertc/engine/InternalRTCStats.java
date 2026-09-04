package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalRTCStats {
    public double cpuAppUsage;
    public double cpuTotalUsage;
    public int rtt;
    public int rxAudioKBitRate;
    public int rxBytes;
    public int rxCellularKBitrate;
    public int rxJitter;
    public int rxKBitRate;
    public double rxLostrate;
    public int rxScreenKBitRate;
    public int rxVideoKBitRate;
    public int totalDuration;
    public int txAudioKBitRate;
    public int txBytes;
    public int txCellularKBitrate;
    public int txJitter;
    public int txKBitRate;
    public double txLostrate;
    public int txScreenKBitRate;
    public int txVideoKBitRate;
    public int users;

    public InternalRTCStats() {
    }

    public InternalRTCStats(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, double d10, double d11, double d12, double d13, int i22, int i23, int i24, int i25, int i26) {
        this.totalDuration = i10;
        this.txBytes = i11;
        this.rxBytes = i12;
        this.txKBitRate = i13;
        this.rxKBitRate = i14;
        this.txAudioKBitRate = i15;
        this.rxAudioKBitRate = i16;
        this.txVideoKBitRate = i17;
        this.rxVideoKBitRate = i18;
        this.txScreenKBitRate = i19;
        this.rxScreenKBitRate = i20;
        this.users = i21;
        this.cpuTotalUsage = d10;
        this.cpuAppUsage = d11;
        this.rxLostrate = d13;
        this.txLostrate = d12;
        this.rtt = i22;
        this.txJitter = i23;
        this.rxJitter = i24;
        this.txCellularKBitrate = i25;
        this.rxCellularKBitrate = i26;
    }

    @CalledByNative
    private static InternalRTCStats create(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, double d10, double d11, double d12, double d13, int i22, int i23, int i24, int i25, int i26) {
        return new InternalRTCStats(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, d10, d11, d12, d13, i22, i23, i24, i25, i26);
    }

    public void reset() {
        this.totalDuration = 0;
        this.txBytes = 0;
        this.rxBytes = 0;
        this.txKBitRate = 0;
        this.rxKBitRate = 0;
        this.txAudioKBitRate = 0;
        this.rxAudioKBitRate = 0;
        this.txVideoKBitRate = 0;
        this.rxVideoKBitRate = 0;
        this.txScreenKBitRate = 0;
        this.rxScreenKBitRate = 0;
        this.users = 0;
        this.cpuTotalUsage = 0.0d;
        this.cpuAppUsage = 0.0d;
        this.rxLostrate = 0.0d;
        this.txLostrate = 0.0d;
        this.rtt = 0;
        this.txJitter = 0;
        this.rxJitter = 0;
        this.txCellularKBitrate = 0;
        this.rxCellularKBitrate = 0;
    }

    public String toString() {
        return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", txScreenKBitRate=" + this.txScreenKBitRate + ", rxScreenKBitRate=" + this.rxScreenKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + ", txLostrate=" + this.txLostrate + ", rxLostrate=" + this.rxLostrate + ", rtt=" + this.rtt + ", txJitter=" + this.txJitter + ", rxJitter=" + this.rxJitter + ", txCellularKBitrate=" + this.txCellularKBitrate + ", rxCellularKBitrate=" + this.rxCellularKBitrate + '}';
    }
}
