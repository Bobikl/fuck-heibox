package com.xiaomi.push;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class bw implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106897a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ bv f222a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f223a;

    bw(bv bvVar, Context context, String str) {
        this.f222a = bvVar;
        this.f106897a = context;
        this.f223a = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(jx.a(this.f106897a, this.f223a));
    }
}
