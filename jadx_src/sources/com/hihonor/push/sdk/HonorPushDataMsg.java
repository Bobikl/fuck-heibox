package com.hihonor.push.sdk;

/* JADX INFO: loaded from: classes7.dex */
public class HonorPushDataMsg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59995a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59996b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f59997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f59998d;

    public String getData() {
        return this.f59998d;
    }

    public long getMsgId() {
        return this.f59997c;
    }

    public int getType() {
        return this.f59996b;
    }

    public int getVersion() {
        return this.f59995a;
    }

    public void setData(String str) {
        this.f59998d = str;
    }

    public void setMsgId(long j10) {
        this.f59997c = j10;
    }

    public void setType(int i10) {
        this.f59996b = i10;
    }

    public void setVersion(int i10) {
        this.f59995a = i10;
    }
}
