package com.tencent.msdk.dns.core.stat;

import android.os.SystemClock;
import k.a;
import k.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsStatistics implements g.c {
    public String[] ips = a.f124360a;
    public boolean isGetEmptyResponse = false;
    public int costTimeMills = 0;
    public long startLookupTimeMills = 0;

    public void endLookup() {
        this.costTimeMills = (int) (SystemClock.elapsedRealtime() - this.startLookupTimeMills);
    }

    @Override // k.g.c
    public boolean lookupFailed() {
        return this.isGetEmptyResponse;
    }

    public boolean lookupNeedRetry() {
        return (lookupSuccess() || lookupFailed()) ? false : true;
    }

    @Override // k.g.c
    public boolean lookupPartCached() {
        return false;
    }

    @Override // k.g.c
    public boolean lookupSuccess() {
        return a.f124360a != this.ips;
    }

    public void startLookup() {
        this.startLookupTimeMills = SystemClock.elapsedRealtime();
    }
}
