package com.max.hbcommon.analytics;

import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbutils.core.BaseApplication;
import com.max.xiaoheihe.bean.analytics.PageEventConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PageEventReporter.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final d.f f66558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f66560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private PageEventConfig f66561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f66562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f66563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f66564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f66565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f66566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f66568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f66569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f66570m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public j(@dl.d d.f page) {
        this(page, false, 2, null);
        f0.p(page, "page");
    }

    @xh.i
    public j(@dl.d d.f page, boolean z10) {
        f0.p(page, "page");
        this.f66558a = page;
        this.f66559b = z10;
        this.f66564g = true;
        this.f66561d = page instanceof h ? (((h) page).n0() || ((h) page).Y2()) ? new PageEventConfig(Boolean.valueOf(true ^ ((h) page).m2()), Boolean.valueOf(((h) page).Y2()), Boolean.valueOf(((h) page).n0())) : null : d.o().get(page.getPagePath());
    }

    public /* synthetic */ j(d.f fVar, boolean z10, int i10, u uVar) {
        this(fVar, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(String str, Long l10, Long l11, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, l10, l11, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Ts, new Class[]{String.class, Long.class, Long.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        pageEventObj.setPath(this.f66558a.getPagePath());
        try {
            String pageAdditional = this.f66558a.getPageAdditional();
            if ((pageAdditional == null || pageAdditional.length() == 0) == false) {
                pageEventObj.setAddition((JsonObject) com.max.hbutils.utils.k.a(this.f66558a.getPageAdditional(), JsonObject.class));
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
            pageEventObj.setStay_duration(String.valueOf((long) ((jLongValue / 1000.0f) + 0.5f)));
            pageEventObj.setStay_duration_ms(String.valueOf(jLongValue));
        }
        if (l11 != null) {
            pageEventObj.setTotal_stay_duration_ms(String.valueOf(l11.longValue()));
        }
        d.c(pageEventObj, z10);
    }

    private final void l(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Ss, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z10) {
            PageEventConfig pageEventConfig = this.f66561d;
            f0.m(pageEventConfig);
            Boolean show = pageEventConfig.getShow();
            Boolean bool = Boolean.TRUE;
            if (f0.g(show, bool)) {
                PageEventConfig pageEventConfig2 = this.f66561d;
                f0.m(pageEventConfig2);
                a("1", null, null, f0.g(pageEventConfig2.getBatch_report(), bool));
                return;
            }
            return;
        }
        long j10 = jElapsedRealtime - this.f66560c;
        PageEventConfig pageEventConfig3 = this.f66561d;
        f0.m(pageEventConfig3);
        Boolean duration = pageEventConfig3.getDuration();
        Boolean bool2 = Boolean.TRUE;
        if (f0.g(duration, bool2)) {
            Long lValueOf = Long.valueOf(j10);
            PageEventConfig pageEventConfig4 = this.f66561d;
            f0.m(pageEventConfig4);
            a("2", lValueOf, null, f0.g(pageEventConfig4.getBatch_report(), bool2));
        }
    }

    @dl.e
    public final PageEventConfig b() {
        return this.f66561d;
    }

    public final long c() {
        return this.f66560c;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Rs, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PageEventConfig pageEventConfig = this.f66561d;
        if (pageEventConfig != null ? f0.g(pageEventConfig.getDuration(), Boolean.TRUE) : false) {
            Long lValueOf = Long.valueOf(this.f66568k);
            PageEventConfig pageEventConfig2 = this.f66561d;
            f0.m(pageEventConfig2);
            a("5", null, lValueOf, f0.g(pageEventConfig2.getBatch_report(), Boolean.TRUE));
        }
    }

    public final void e() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qs, new Class[0], Void.TYPE).isSupported && this.f66560c > 0) {
            if (this.f66561d != null) {
                com.max.hbcommon.utils.d.b("zzzzreport", "onPageHide=" + this.f66558a.getPagePath());
                l(false);
            }
            l.f66572a.j(this.f66558a);
            this.f66560c = 0L;
        }
    }

    public final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ks, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l.f66572a.v(this.f66558a);
        this.f66560c = SystemClock.elapsedRealtime();
        this.f66570m = true;
        if (this.f66564g) {
            this.f66564g = false;
            j();
        }
        if (this.f66561d == null) {
            return;
        }
        try {
            com.max.hbcommon.utils.d.b("zzzzreport", "[onPageShow] pagePath: " + this.f66558a.getPagePath() + ", pageAdditional: " + this.f66558a.getPageAdditional());
        } catch (Throwable th2) {
            com.max.hbcommon.utils.d.d("zzzzreport", "[onPageShow] pagePath: " + this.f66558a.getPagePath() + ", error: " + th2.getMessage());
        }
        l(true);
        l.f66572a.w(this.f66558a);
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Os, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66569l = System.currentTimeMillis();
    }

    public final void h() {
        JsonObject jsonObject;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ps, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66568k += System.currentTimeMillis() - this.f66569l;
        com.max.heybox.hblog.g.f74531b.M("PageEventReporter, onPageVisitEnd,  " + hashCode() + " ignoreVisitReport = " + this.f66559b + ", isPageVisited = " + this.f66558a.isPageVisited() + ", pagePath = " + this.f66558a.getPagePath() + ", onPageShow = " + this.f66570m + "  visitSuccess = " + this.f66567j + ' ');
        if (this.f66559b || !this.f66558a.isPageVisited() || this.f66558a.getPagePath() == null || !this.f66570m) {
            return;
        }
        this.f66570m = false;
        this.f66558a.setPageVisited(false);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f66565h;
        float f10 = ((jElapsedRealtime - j10) / 1000.0f) + 0.5f;
        Object objValueOf = this.f66567j ? Float.valueOf(((this.f66566i - j10) / 1000.0f) + 0.5f) : -1L;
        JsonObject jsonObject2 = new JsonObject();
        try {
            String pageAdditional = this.f66558a.getPageAdditional();
            if (pageAdditional == null || pageAdditional.length() == 0) {
                jsonObject = new JsonObject();
            } else {
                Object objA = com.max.hbutils.utils.k.a(this.f66558a.getPageAdditional(), JsonObject.class);
                f0.o(objA, "deserialize(...)");
                jsonObject = (JsonObject) objA;
            }
            jsonObject2 = jsonObject;
        } catch (Throwable unused) {
        }
        jsonObject2.addProperty("visit_total_time", String.valueOf((int) f10));
        jsonObject2.addProperty("visit_success", this.f66567j ? "1" : "0");
        if (this.f66562e) {
            float f11 = ((this.f66563f - this.f66565h) / 1000.0f) + 0.5f;
            jsonObject2.addProperty("has_error", "1");
            jsonObject2.addProperty("error_time", Float.valueOf(f11));
        }
        if (this.f66567j) {
            jsonObject2.addProperty("visit_success_time", String.valueOf(objValueOf.intValue()));
        } else {
            jsonObject2.addProperty("network_available", com.max.hbcommon.utils.i.c(BaseApplication.a()) ? "1" : "0");
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setTime(String.valueOf(jCurrentTimeMillis));
        pageEventObj.setPath("/visit" + this.f66558a.getPagePath());
        pageEventObj.setType("1");
        pageEventObj.setAddition(jsonObject2);
        ArrayList<ArrayList<PathSrcNode>> arrayListG = l.f66572a.g();
        if (!(arrayListG == null || arrayListG.isEmpty())) {
            pageEventObj.setSrc(arrayListG);
        }
        com.max.heybox.hblog.g.f74531b.M("PageEventReporter, onPageVisitEnd,  " + hashCode() + " isPageVisited = " + this.f66558a.isPageVisited() + ", pagePath = " + this.f66558a.getPagePath() + ", onPageShow = " + this.f66570m + "  visitSuccess = " + this.f66567j + "  reportEvent: " + com.max.hbutils.utils.k.p(pageEventObj));
        d.F(pageEventObj.toEntity());
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ns, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("PageEventReporter, onPageVisitError, isPageVisited = " + this.f66558a.isPageVisited() + ", pagePath = " + this.f66558a.getPagePath() + ", visitStartTime = " + this.f66565h);
        if (this.f66562e) {
            return;
        }
        this.f66562e = true;
        this.f66563f = SystemClock.elapsedRealtime();
    }

    public final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ls, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66565h = SystemClock.elapsedRealtime();
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ms, new Class[0], Void.TYPE).isSupported || this.f66567j) {
            return;
        }
        this.f66567j = true;
        this.f66566i = SystemClock.elapsedRealtime();
        try {
            com.max.heybox.hblog.g.f74531b.M("PageEventReporter, onPageVisitSuccess,  " + hashCode() + " pagePath = " + this.f66558a.getPagePath() + ' ' + this.f66558a.getPageAdditional());
        } catch (Throwable th2) {
            com.max.heybox.hblog.g.f74531b.v("PageEventReporter, onPageVisitSuccess, " + hashCode() + " pagePath = " + this.f66558a.getPagePath() + "  error: " + th2.getMessage());
        }
    }

    public final void m(@dl.e PageEventConfig pageEventConfig) {
        this.f66561d = pageEventConfig;
    }

    public final void n(long j10) {
        this.f66560c = j10;
    }
}
