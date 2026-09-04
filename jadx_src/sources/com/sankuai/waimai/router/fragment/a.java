package com.sankuai.waimai.router.fragment;

import android.content.Context;
import androidx.annotation.d0;
import androidx.annotation.n0;

/* JADX INFO: compiled from: AbsFragmentTransactionUriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f96514m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f96515n = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f96516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f96517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f96518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f96519l;

    public a(@n0 Context context, String str) {
        super(context, str);
        this.f96516i = 1;
    }

    public a R(@d0 int i10) {
        this.f96517j = i10;
        this.f96516i = 1;
        return this;
    }

    public a S() {
        this.f96518k = true;
        return this;
    }

    public a T(@d0 int i10) {
        this.f96517j = i10;
        this.f96516i = 2;
        return this;
    }

    public a U(String str) {
        this.f96519l = str;
        return this;
    }
}
