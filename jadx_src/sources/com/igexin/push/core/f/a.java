package com.igexin.push.core.f;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Long f63737a = Long.valueOf(System.currentTimeMillis());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Activity f63738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f63739c;

    public Long a() {
        return this.f63737a;
    }

    public void a(Long l10) {
        this.f63737a = l10;
    }

    public void a(String str) {
        this.f63739c = str;
    }

    public String b() {
        return this.f63739c;
    }

    public abstract void c();
}
