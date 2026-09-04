package od;

import com.max.hbstory.config.StoryRootViewBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: StoryConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    public static final a a(@dl.d l<? super a, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Ne, new Class[]{l.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        a aVar = new a();
        init.invoke(aVar);
        return aVar;
    }

    @dl.d
    public static final c b(@dl.d l<? super c, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Re, new Class[]{l.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        c cVar = new c();
        init.invoke(cVar);
        return cVar;
    }

    @dl.d
    public static final StoryRootViewBuilder c(@dl.d l<? super StoryRootViewBuilder, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Se, new Class[]{l.class}, StoryRootViewBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryRootViewBuilder) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        StoryRootViewBuilder storyRootViewBuilder = new StoryRootViewBuilder();
        init.invoke(storyRootViewBuilder);
        return storyRootViewBuilder;
    }

    @dl.d
    public static final d d(@dl.d l<? super d, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Qe, new Class[]{l.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        d dVar = new d();
        init.invoke(dVar);
        return dVar;
    }

    @dl.d
    public static final e e(@dl.d l<? super e, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Pe, new Class[]{l.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        e eVar = new e();
        init.invoke(eVar);
        return eVar;
    }

    @dl.d
    public static final g f(@dl.d l<? super g, b2> init) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{init}, null, changeQuickRedirect, true, bb.c.k.Oe, new Class[]{l.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        f0.p(init, "init");
        g gVar = new g();
        init.invoke(gVar);
        return gVar;
    }
}
