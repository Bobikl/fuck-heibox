package com.lzy.okgo.cache;

import android.content.ContentValues;
import android.database.Cursor;
import bb.c;
import com.lzy.okgo.model.HttpHeaders;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class CacheEntity<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f64634g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64635h = "key";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64636i = "localExpire";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64637j = "head";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64638k = "data";
    private static final long serialVersionUID = -4337711009801627866L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f64639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f64640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpHeaders f64641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private T f64642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64643f;

    public static <T> ContentValues b(CacheEntity<T> cacheEntity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cacheEntity}, null, changeQuickRedirect, true, c.b.L3, new Class[]{CacheEntity.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", cacheEntity.d());
        contentValues.put(f64636i, Long.valueOf(cacheEntity.e()));
        contentValues.put("head", la.c.F(cacheEntity.f()));
        contentValues.put("data", la.c.F(cacheEntity.c()));
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> CacheEntity<T> h(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, c.b.M3, new Class[]{Cursor.class}, CacheEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheEntity) patchProxyResultProxy.result;
        }
        CacheEntity<T> cacheEntity = (CacheEntity<T>) new CacheEntity();
        cacheEntity.k(cursor.getString(cursor.getColumnIndex("key")));
        cacheEntity.l(cursor.getLong(cursor.getColumnIndex(f64636i)));
        cacheEntity.m((HttpHeaders) la.c.M(cursor.getBlob(cursor.getColumnIndex("head"))));
        cacheEntity.i(la.c.M(cursor.getBlob(cursor.getColumnIndex("data"))));
        return cacheEntity;
    }

    public boolean a(CacheMode cacheMode, long j10, long j11) {
        Object[] objArr = {cacheMode, new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.b.K3, new Class[]{CacheMode.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (cacheMode == CacheMode.DEFAULT) {
            return e() < j11;
        }
        return j10 != -1 && e() + j10 < j11;
    }

    public T c() {
        return this.f64642e;
    }

    public String d() {
        return this.f64639b;
    }

    public long e() {
        return this.f64640c;
    }

    public HttpHeaders f() {
        return this.f64641d;
    }

    public boolean g() {
        return this.f64643f;
    }

    public void i(T t10) {
        this.f64642e = t10;
    }

    public void j(boolean z10) {
        this.f64643f = z10;
    }

    public void k(String str) {
        this.f64639b = str;
    }

    public void l(long j10) {
        this.f64640c = j10;
    }

    public void m(HttpHeaders httpHeaders) {
        this.f64641d = httpHeaders;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.N3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CacheEntity{key='" + this.f64639b + "', responseHeaders=" + this.f64641d + ", data=" + this.f64642e + ", localExpire=" + this.f64640c + '}';
    }
}
