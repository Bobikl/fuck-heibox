package com.alipay.zoloz.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: AbstractRpcCaller.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Method f39611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected byte[] f39612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f39613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f39614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f39615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f39616f;

    public a(Method method, int i10, String str, byte[] bArr, String str2, boolean z10) {
        this.f39611a = method;
        this.f39614d = i10;
        this.f39613c = str;
        this.f39612b = bArr;
        this.f39615e = str2;
        this.f39616f = z10;
    }
}
