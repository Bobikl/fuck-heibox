package com.sankuai.waimai.router.core;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: UriRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96500f = "com.sankuai.waimai.router.core.CompleteListener";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96501g = "com.sankuai.waimai.router.core.result";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f96502h = "com.sankuai.waimai.router.core.error.msg";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final Context f96503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private Uri f96504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private final HashMap<String, Object> f96505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f96506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f96507e;

    public i(@n0 Context context, Uri uri) {
        this(context, uri, (HashMap<String, Object>) new HashMap());
    }

    public i(@n0 Context context, Uri uri, HashMap<String, Object> map) {
        this.f96506d = false;
        this.f96507e = null;
        this.f96503a = context;
        this.f96504b = uri == null ? Uri.EMPTY : uri;
        this.f96505c = map == null ? new HashMap<>() : map;
    }

    public i(@n0 Context context, String str) {
        this(context, r(str), (HashMap<String, Object>) new HashMap());
    }

    public i(@n0 Context context, String str, HashMap<String, Object> map) {
        this(context, r(str), map);
    }

    private static Uri r(@p0 String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    public void A() {
        hg.b.u(this);
    }

    public String B() {
        StringBuilder sb2 = new StringBuilder(this.f96504b.toString());
        sb2.append(", fields = {");
        boolean z10 = true;
        for (Map.Entry<String, Object> entry : this.f96505c.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(" = ");
            sb2.append(entry.getValue());
        }
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }

    public boolean a(@n0 String str, boolean z10) {
        return ((Boolean) e(Boolean.class, str, Boolean.valueOf(z10))).booleanValue();
    }

    @n0
    public Context b() {
        return this.f96503a;
    }

    public String c() {
        return l(f96502h, "");
    }

    public <T> T d(@n0 Class<T> cls, @n0 String str) {
        return (T) e(cls, str, null);
    }

    public <T> T e(@n0 Class<T> cls, @n0 String str, T t10) {
        Object obj = this.f96505c.get(str);
        if (obj != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e10) {
                c.e(e10);
            }
        }
        return t10;
    }

    @n0
    public HashMap<String, Object> f() {
        return this.f96505c;
    }

    public int g(@n0 String str, int i10) {
        return ((Integer) e(Integer.class, str, Integer.valueOf(i10))).intValue();
    }

    public long h(@n0 String str, long j10) {
        return ((Long) e(Long.class, str, Long.valueOf(j10))).longValue();
    }

    public d i() {
        return (d) d(d.class, f96500f);
    }

    public int j() {
        return g(f96501g, 500);
    }

    public String k(@n0 String str) {
        return (String) e(String.class, str, null);
    }

    public String l(@n0 String str, String str2) {
        return (String) e(String.class, str, str2);
    }

    @n0
    public Uri m() {
        return this.f96504b;
    }

    public boolean n(@n0 String str) {
        return this.f96505c.containsKey(str);
    }

    public boolean o() {
        return this.f96506d;
    }

    public boolean p() {
        return Uri.EMPTY.equals(this.f96504b);
    }

    public i q(d dVar) {
        s(f96500f, dVar);
        return this;
    }

    public <T> i s(@n0 String str, T t10) {
        if (t10 != null) {
            this.f96505c.put(str, t10);
        }
        return this;
    }

    public synchronized <T> i t(@n0 String str, T t10) {
        if (t10 != null) {
            if (!this.f96505c.containsKey(str)) {
                this.f96505c.put(str, t10);
            }
        }
        return this;
    }

    public String toString() {
        return this.f96504b.toString();
    }

    public i u(HashMap<String, Object> map) {
        if (map != null) {
            this.f96505c.putAll(map);
        }
        return this;
    }

    public String v() {
        if (this.f96507e == null) {
            this.f96507e = com.sankuai.waimai.router.utils.f.d(m());
        }
        return this.f96507e;
    }

    public i w(String str) {
        s(f96502h, str);
        return this;
    }

    public i x(int i10) {
        s(f96501g, Integer.valueOf(i10));
        return this;
    }

    public void y(@n0 Uri uri) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            c.d("UriRequest.setUri不应该传入空值", new Object[0]);
        } else {
            this.f96504b = uri;
            this.f96507e = null;
        }
    }

    public i z() {
        this.f96506d = true;
        return this;
    }
}
