package com.max.hbcommon.analytics;

import android.os.SystemClock;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WebStayReporter.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d.f f66598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f66599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f66600c;

    public p(@dl.d d.f page) {
        f0.p(page, "page");
        this.f66598a = page;
        this.f66599b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(String str, Long l10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, l10, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.bu, new Class[]{String.class, Long.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setPath(this.f66598a.getPagePath());
        try {
            String pageAdditional = this.f66598a.getPageAdditional();
            if ((pageAdditional == null || pageAdditional.length() == 0) == false) {
                pageEventObj.setAddition((JsonObject) com.max.hbutils.utils.k.a(this.f66598a.getPageAdditional(), JsonObject.class));
            }
        } catch (Exception unused) {
        }
        pageEventObj.setType(str);
        ArrayList<ArrayList<PathSrcNode>> arrayListG = l.f66572a.g();
        if (!(arrayListG == null || arrayListG.isEmpty())) {
            pageEventObj.setSrc(arrayListG);
        }
        if (l10 != null) {
            long jLongValue = l10.longValue();
            pageEventObj.setStay_duration(String.valueOf((int) ((jLongValue / 1000.0f) + 0.5f)));
            pageEventObj.setStay_duration_ms(String.valueOf(jLongValue));
        }
        com.max.hbcommon.utils.d.b("zzzzwebpagestay", "addpageEvent reportEvent:" + new Gson().toJson(pageEventObj));
        d.c(pageEventObj, z10);
    }

    private final void f(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.au, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z10) {
            this.f66599b = jElapsedRealtime;
            return;
        }
        long j10 = this.f66599b;
        if (j10 > 0) {
            a("2", Long.valueOf(jElapsedRealtime - j10), true);
            return;
        }
        throw new RuntimeException(this.f66598a.getPagePath() + " never show??");
    }

    public final long b() {
        return this.f66599b;
    }

    public final boolean c() {
        return this.f66600c;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Zt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzwebpagestay", "onPageHide=" + this.f66598a.getPagePath());
        if (this.f66600c) {
            this.f66600c = false;
            f(false);
        }
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Yt, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzwebpagestay", "onPageShow=" + this.f66598a.getPagePath());
        if (this.f66600c) {
            return;
        }
        this.f66600c = true;
        f(true);
    }

    public final void g(long j10) {
        this.f66599b = j10;
    }

    public final void h(boolean z10) {
        this.f66600c = z10;
    }
}
