package com.ss.bytertc.engine.type;

import com.ss.bytertc.engine.InternalNetworkQualityInfo;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkQualityStats {
    public double fractionLost;
    public int rtt;
    public int rxQuality;
    public int totalBandwidth;
    public int txQuality;
    public String uid;

    public NetworkQualityStats(InternalNetworkQualityInfo internalNetworkQualityInfo) {
        this.uid = internalNetworkQualityInfo.uid;
        this.fractionLost = internalNetworkQualityInfo.fractionLost;
        this.rtt = internalNetworkQualityInfo.rtt;
        this.totalBandwidth = internalNetworkQualityInfo.totalBandwidth;
        this.txQuality = internalNetworkQualityInfo.txNetQuality;
        this.rxQuality = internalNetworkQualityInfo.rxNetQuality;
    }

    public NetworkQualityStats(String str, double d10, int i10, int i11, int i12, int i13) {
        this.uid = str;
        this.fractionLost = d10;
        this.rtt = i10;
        this.totalBandwidth = i11;
        this.txQuality = i12;
        this.rxQuality = i13;
    }

    public String toString() {
        return "uid=" + this.uid + ",fractionLost=" + this.fractionLost + ",rtt=" + this.rtt + ",totalBandwidth=" + this.totalBandwidth + ",txQuality=" + this.txQuality + ",rxQuality=" + this.rxQuality;
    }
}
