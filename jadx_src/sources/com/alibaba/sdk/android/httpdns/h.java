package com.alibaba.sdk.android.httpdns;

/* JADX INFO: loaded from: classes6.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37963b;

    public h(int i10, String str) {
        super(str);
        this.f37963b = i10;
    }

    public int getErrorCode() {
        return this.f37963b;
    }
}
