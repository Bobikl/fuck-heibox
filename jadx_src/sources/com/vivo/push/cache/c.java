package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.g;
import com.vivo.push.util.p;
import com.vivo.push.util.w;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ICacheSettings.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Object f106521a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<T> f106522b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f106523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f106524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f106525e;

    protected c(Context context) {
        this.f106523c = ContextDelegate.getContext(context);
        w wVarB = w.b();
        wVarB.a(this.f106523c);
        this.f106524d = wVarB.c();
        this.f106525e = wVarB.d();
        c();
    }

    private String b() {
        return y.b(this.f106523c).a(a(), null);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            p.d("CacheSettings", "ClientManager init " + a() + " strApps empty.");
            return;
        }
        if (str.length() > 10000) {
            p.d("CacheSettings", "sync " + a() + " strApps lenght too large");
            d();
            return;
        }
        try {
            p.d("CacheSettings", "ClientManager init " + a() + " strApps : " + str);
            List<T> listA = a(b(str));
            if (listA != null) {
                this.f106522b.addAll(listA);
            }
        } catch (Exception e10) {
            d();
            p.d("CacheSettings", p.a(e10));
        }
    }

    private void d(String str) {
        y.b(this.f106523c).b(a(), str);
    }

    protected abstract String a();

    protected abstract List<T> a(String str);

    abstract String b(String str) throws Exception;

    public final void c() {
        synchronized (f106521a) {
            g.a(a());
            this.f106522b.clear();
            c(b());
        }
    }

    public final void d() {
        synchronized (f106521a) {
            this.f106522b.clear();
            d("");
            p.d("CacheSettings", "clear " + a() + " strApps");
        }
    }

    protected final byte[] e() {
        byte[] bArr = this.f106524d;
        return (bArr == null || bArr.length <= 0) ? w.b().c() : bArr;
    }

    protected final byte[] f() {
        byte[] bArr = this.f106525e;
        return (bArr == null || bArr.length <= 0) ? w.b().d() : bArr;
    }
}
