package com.igexin.push.d;

import android.content.Context;
import com.igexin.a.a.b.a.a.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.igexin.a.a.d.a.a<String, Integer, com.igexin.a.a.b.b, com.igexin.a.a.b.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f63799a;

    public a(Context context) {
        this.f63799a = context;
    }

    @Override // com.igexin.a.a.d.a.a
    public com.igexin.a.a.b.d a(String str, Integer num, com.igexin.a.a.b.b bVar) {
        if (str.startsWith("socket") && com.igexin.push.core.d.f63673g) {
            return new m(str, bVar);
        }
        return null;
    }
}
