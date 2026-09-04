package com.ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class InternalNetworkQualityInfo {
    public double fractionLost;
    public int rtt;
    public int rxNetQuality;
    public int totalBandwidth;
    public int txNetQuality;
    public String uid;

    public InternalNetworkQualityInfo(double d10, int i10, int i11, int i12, int i13) {
        this.uid = "";
        this.fractionLost = d10;
        this.rtt = i10;
        this.totalBandwidth = i11;
        this.txNetQuality = i12;
        this.rxNetQuality = i13;
    }

    public InternalNetworkQualityInfo(String str, double d10, int i10, int i11, int i12, int i13) {
        this.uid = str;
        this.fractionLost = d10;
        this.rtt = i10;
        this.totalBandwidth = i11;
        this.txNetQuality = i12;
        this.rxNetQuality = i13;
    }

    @CalledByNative
    private static InternalNetworkQualityInfo create(String str, double d10, int i10, int i11, int i12, int i13) {
        return new InternalNetworkQualityInfo(str, d10, i10, i11, i12, i13);
    }

    public String toString() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",txNetQuality=" + this.txNetQuality + ",rxNetQuality=" + this.rxNetQuality;
    }
}
