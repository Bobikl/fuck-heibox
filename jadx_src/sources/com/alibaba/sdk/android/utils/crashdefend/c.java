package com.alibaba.sdk.android.utils.crashdefend;

import android.util.Log;

/* JADX INFO: compiled from: CrashDefendSDKInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38048a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public long f63a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f65a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38049b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public long f66b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public String f67b;
    public int crashCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38050c = 0;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public volatile boolean f68c = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public SDKMessageCallback f64a = null;

    public Object clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException e10) {
            Log.e("CrashSDK", "clone fail:", e10);
            return null;
        }
    }
}
