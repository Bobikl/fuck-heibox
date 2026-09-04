package nd;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import okhttp3.u;
import okhttp3.z;
import xh.m;

/* JADX INFO: compiled from: ServiceGenerator.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f132071a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static z f132072b = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private static a f132073c;
    public static ChangeQuickRedirect changeQuickRedirect;

    private b() {
    }

    @e
    @m
    public static final a a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33592h9, new Class[0], a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if (f132073c == null) {
            com.max.hbcommon.network.b bVarG = com.max.hbcommon.network.b.g();
            f132073c = (a) bVarG.n(bVarG.l(), bVarG.j(f132072b, true, new u[0])).g(a.class);
        }
        return f132073c;
    }

    @d
    public final z b() {
        return f132072b;
    }

    public final void c(@d z zVar) {
        if (PatchProxy.proxy(new Object[]{zVar}, this, changeQuickRedirect, false, c.k.f33569g9, new Class[]{z.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(zVar, "<set-?>");
        f132072b = zVar;
    }
}
