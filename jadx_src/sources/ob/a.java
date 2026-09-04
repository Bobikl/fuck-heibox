package ob;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import pb.f;
import pb.g;
import pb.h;
import pb.i;
import pb.j;
import pb.k;
import pb.l;
import pb.m;
import pb.n;
import pb.o;
import pb.p;

/* JADX INFO: compiled from: RouterServiceManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f132240a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private static n f132241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private static h f132242c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private static m f132243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private static pb.b f132244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private static l f132245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private static pb.d f132246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private static f f132247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private static i f132248i;

    private a() {
    }

    @d
    @xh.m
    public static final pb.a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31776ef, new Class[0], pb.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (pb.a) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(pb.a.class, b.f132255g);
        f0.o(objJ, "getService(...)");
        return (pb.a) objJ;
    }

    @d
    @xh.m
    public static final pb.b b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4354, new Class[0], pb.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (pb.b) patchProxyResultProxy.result;
        }
        if (f132244e == null) {
            f132244e = (pb.b) hg.b.j(pb.b.class, b.f132251c);
        }
        pb.b bVar = f132244e;
        f0.m(bVar);
        return bVar;
    }

    @d
    @xh.m
    public static final pb.c c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31759df, new Class[0], pb.c.class);
        if (patchProxyResultProxy.isSupported) {
            return (pb.c) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(pb.c.class, "device");
        f0.o(objJ, "getService(...)");
        return (pb.c) objJ;
    }

    @d
    @xh.m
    public static final pb.e d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31810gf, new Class[0], pb.e.class);
        if (patchProxyResultProxy.isSupported) {
            return (pb.e) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(pb.e.class, "game");
        f0.o(objJ, "getService(...)");
        return (pb.e) objJ;
    }

    @e
    @xh.m
    public static final pb.d e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31928nf, new Class[0], pb.d.class);
        if (patchProxyResultProxy.isSupported) {
            return (pb.d) patchProxyResultProxy.result;
        }
        if (f132246g == null) {
            f132246g = (pb.d) hg.b.j(pb.d.class, b.f132264p);
        }
        return f132246g;
    }

    @e
    @xh.m
    public static final h f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31877kf, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f132242c == null) {
            f132242c = (h) hg.b.j(h.class, b.f132261m);
        }
        return f132242c;
    }

    @e
    @xh.m
    public static final l g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31911mf, new Class[0], l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        if (f132245f == null) {
            f132245f = (l) hg.b.j(l.class, "share");
        }
        return f132245f;
    }

    @e
    @xh.m
    public static final m h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31894lf, new Class[0], m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        if (f132243d == null) {
            f132243d = (m) hg.b.j(m.class, b.f132262n);
        }
        return f132243d;
    }

    @e
    @xh.m
    public static final f i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31945of, new Class[0], f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        if (f132247h == null) {
            f132247h = (f) hg.b.j(f.class, b.f132265q);
        }
        return f132247h;
    }

    @d
    @xh.m
    public static final g j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f4if, new Class[0], g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(g.class, b.f132259k);
        f0.o(objJ, "getService(...)");
        return (g) objJ;
    }

    @d
    @xh.m
    public static final i k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4355, new Class[0], i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        if (f132248i == null) {
            f132248i = (i) hg.b.j(i.class, "request");
        }
        i iVar = f132248i;
        f0.m(iVar);
        return iVar;
    }

    @d
    @xh.m
    public static final j l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4356, new Class[0], j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(j.class, b.f132253e);
        f0.o(objJ, "getService(...)");
        return (j) objJ;
    }

    @d
    @xh.m
    public static final k m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31827hf, new Class[0], k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(k.class, "search");
        f0.o(objJ, "getService(...)");
        return (k) objJ;
    }

    @e
    @xh.m
    public static final n n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31860jf, new Class[0], n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        if (f132241b == null) {
            f132241b = (n) hg.b.j(n.class, b.f132260l);
        }
        return f132241b;
    }

    @d
    @xh.m
    public static final o o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4353, new Class[0], o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(o.class, "user");
        f0.o(objJ, "getService(...)");
        return (o) objJ;
    }

    @d
    @xh.m
    public static final p p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.e.f31793ff, new Class[0], p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        Object objJ = hg.b.j(p.class, "web");
        f0.o(objJ, "getService(...)");
        return (p) objJ;
    }
}
