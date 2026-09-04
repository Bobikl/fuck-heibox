package com.alibaba.sdk.android.httpdns.probe;

/* JADX INFO: loaded from: classes6.dex */
public interface IPProbeService {

    public enum a {
        NO_PROBING,
        PROBING
    }

    a getProbeStatus(String str);

    void launchIPProbeTask(String str, int i10, String[] strArr);

    void setIPListUpdateCallback(b bVar);

    boolean stopIPProbeTask(String str);
}
