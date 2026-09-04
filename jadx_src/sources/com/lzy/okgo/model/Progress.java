package com.lzy.okgo.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Progress implements Serializable {
    public static final int A = 5;
    public static final String B = "tag";
    public static final String C = "url";
    public static final String D = "folder";
    public static final String E = "filePath";
    public static final String F = "fileName";
    public static final String G = "fraction";
    public static final String H = "totalSize";
    public static final String I = "currentSize";
    public static final String J = "status";
    public static final String K = "priority";
    public static final String L = "date";
    public static final String M = "request";
    public static final String N = "extra1";
    public static final String O = "extra2";
    public static final String P = "extra3";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6353658567594109891L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f64771v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f64772w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f64773x = 2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f64774y = 3;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f64775z = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f64779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f64781g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f64783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient long f64784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f64785k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Request<?, ? extends Request> f64788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Serializable f64789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Serializable f64790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Serializable f64791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Throwable f64792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient long f64793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient long f64794t = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f64782h = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f64786l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f64787m = System.currentTimeMillis();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private transient List<Long> f64795u = new ArrayList();

    public interface a {
        void a(Progress progress);
    }

    private long a(long j10) {
        Object[] objArr = {new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.f30607e9, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        this.f64795u.add(Long.valueOf(j10));
        if (this.f64795u.size() > 10) {
            this.f64795u.remove(0);
        }
        long jLongValue = 0;
        Iterator<Long> it = this.f64795u.iterator();
        while (it.hasNext()) {
            jLongValue = (long) (jLongValue + it.next().longValue());
        }
        return jLongValue / ((long) this.f64795u.size());
    }

    public static ContentValues b(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, null, changeQuickRedirect, true, bb.c.b.f30630f9, new Class[]{Progress.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", progress.f64776b);
        contentValues.put("url", progress.f64777c);
        contentValues.put(D, progress.f64778d);
        contentValues.put(E, progress.f64779e);
        contentValues.put(F, progress.f64780f);
        contentValues.put(G, Float.valueOf(progress.f64781g));
        contentValues.put(H, Long.valueOf(progress.f64782h));
        contentValues.put(I, Long.valueOf(progress.f64783i));
        contentValues.put("status", Integer.valueOf(progress.f64785k));
        contentValues.put("priority", Integer.valueOf(progress.f64786l));
        contentValues.put(L, Long.valueOf(progress.f64787m));
        contentValues.put("request", la.c.F(progress.f64788n));
        contentValues.put(N, la.c.F(progress.f64789o));
        contentValues.put(O, la.c.F(progress.f64790p));
        contentValues.put(P, la.c.F(progress.f64791q));
        return contentValues;
    }

    public static ContentValues c(Progress progress) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress}, null, changeQuickRedirect, true, bb.c.b.f30653g9, new Class[]{Progress.class}, ContentValues.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentValues) patchProxyResultProxy.result;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(G, Float.valueOf(progress.f64781g));
        contentValues.put(H, Long.valueOf(progress.f64782h));
        contentValues.put(I, Long.valueOf(progress.f64783i));
        contentValues.put("status", Integer.valueOf(progress.f64785k));
        contentValues.put("priority", Integer.valueOf(progress.f64786l));
        contentValues.put(L, Long.valueOf(progress.f64787m));
        return contentValues;
    }

    public static Progress d(Progress progress, long j10, long j11, a aVar) {
        Object[] objArr = {progress, new Long(j10), new Long(j11), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.b.f30584d9, new Class[]{Progress.class, cls, cls, a.class}, Progress.class);
        if (patchProxyResultProxy.isSupported) {
            return (Progress) patchProxyResultProxy.result;
        }
        progress.f64782h = j11;
        progress.f64783i += j10;
        progress.f64793s += j10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = progress.f64794t;
        if ((jElapsedRealtime - j12 >= com.lzy.okgo.b.f64624j) || progress.f64783i == j11) {
            long j13 = jElapsedRealtime - j12;
            if (j13 == 0) {
                j13 = 1;
            }
            progress.f64781g = (progress.f64783i * 1.0f) / j11;
            progress.f64784j = progress.a((progress.f64793s * 1000) / j13);
            progress.f64794t = jElapsedRealtime;
            progress.f64793s = 0L;
            if (aVar != null) {
                aVar.a(progress);
            }
        }
        return progress;
    }

    public static Progress e(Progress progress, long j10, a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{progress, new Long(j10), aVar}, null, changeQuickRedirect, true, bb.c.b.f30560c9, new Class[]{Progress.class, Long.TYPE, a.class}, Progress.class);
        return patchProxyResultProxy.isSupported ? (Progress) patchProxyResultProxy.result : d(progress, j10, progress.f64782h, aVar);
    }

    public static Progress g(Cursor cursor) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cursor}, null, changeQuickRedirect, true, bb.c.b.f30676h9, new Class[]{Cursor.class}, Progress.class);
        if (patchProxyResultProxy.isSupported) {
            return (Progress) patchProxyResultProxy.result;
        }
        Progress progress = new Progress();
        progress.f64776b = cursor.getString(cursor.getColumnIndex("tag"));
        progress.f64777c = cursor.getString(cursor.getColumnIndex("url"));
        progress.f64778d = cursor.getString(cursor.getColumnIndex(D));
        progress.f64779e = cursor.getString(cursor.getColumnIndex(E));
        progress.f64780f = cursor.getString(cursor.getColumnIndex(F));
        progress.f64781g = cursor.getFloat(cursor.getColumnIndex(G));
        progress.f64782h = cursor.getLong(cursor.getColumnIndex(H));
        progress.f64783i = cursor.getLong(cursor.getColumnIndex(I));
        progress.f64785k = cursor.getInt(cursor.getColumnIndex("status"));
        progress.f64786l = cursor.getInt(cursor.getColumnIndex("priority"));
        progress.f64787m = cursor.getLong(cursor.getColumnIndex(L));
        progress.f64788n = (Request) la.c.M(cursor.getBlob(cursor.getColumnIndex("request")));
        progress.f64789o = (Serializable) la.c.M(cursor.getBlob(cursor.getColumnIndex(N)));
        progress.f64790p = (Serializable) la.c.M(cursor.getBlob(cursor.getColumnIndex(O)));
        progress.f64791q = (Serializable) la.c.M(cursor.getBlob(cursor.getColumnIndex(P)));
        return progress;
    }

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.f30699i9, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f64776b;
        String str2 = ((Progress) obj).f64776b;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public void f(Progress progress) {
        this.f64782h = progress.f64782h;
        this.f64783i = progress.f64783i;
        this.f64781g = progress.f64781g;
        this.f64784j = progress.f64784j;
        this.f64794t = progress.f64794t;
        this.f64793s = progress.f64793s;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30722j9, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f64776b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30745k9, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Progress{fraction=" + this.f64781g + ", totalSize=" + this.f64782h + ", currentSize=" + this.f64783i + ", speed=" + this.f64784j + ", status=" + this.f64785k + ", priority=" + this.f64786l + ", folder=" + this.f64778d + ", filePath=" + this.f64779e + ", fileName=" + this.f64780f + ", tag=" + this.f64776b + ", url=" + this.f64777c + '}';
    }
}
