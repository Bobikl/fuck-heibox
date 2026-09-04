package androidx.compose.ui.draw;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: renamed from: androidx.compose.ui.draw.h, reason: from toString */
/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\u001a\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012HÆ\u0003J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Landroidx/compose/ui/draw/h;", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/c;", "params", "Lkotlin/b2;", "F0", "Landroidx/compose/ui/graphics/drawscope/d;", RXScreenCaptureService.KEY_WIDTH, "", "other", "", "equals", "", "hashCode", "Landroidx/compose/ui/draw/CacheDrawScope;", ak.av, "Lkotlin/Function1;", "Landroidx/compose/ui/draw/k;", "Lkotlin/t;", ak.aF, "cacheDrawScope", "onBuildDrawCache", "d", "", "toString", "b", "Landroidx/compose/ui/draw/CacheDrawScope;", "f", "()Landroidx/compose/ui/draw/CacheDrawScope;", "Lyh/l;", "g", "()Lyh/l;", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DrawContentCacheModifier implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final CacheDrawScope cacheDrawScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @dl.d
    private final yh.l<CacheDrawScope, k> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawContentCacheModifier(@dl.d CacheDrawScope cacheDrawScope, @dl.d yh.l<? super CacheDrawScope, k> onBuildDrawCache) {
        f0.p(cacheDrawScope, "cacheDrawScope");
        f0.p(onBuildDrawCache, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope;
        this.onBuildDrawCache = onBuildDrawCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawContentCacheModifier e(DrawContentCacheModifier drawContentCacheModifier, CacheDrawScope cacheDrawScope, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheDrawScope = drawContentCacheModifier.cacheDrawScope;
        }
        if ((i10 & 2) != 0) {
            lVar = drawContentCacheModifier.onBuildDrawCache;
        }
        return drawContentCacheModifier.d(cacheDrawScope, lVar);
    }

    @Override // androidx.compose.ui.draw.g
    public void F0(@dl.d c params) {
        f0.p(params, "params");
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        cacheDrawScope.j(params);
        cacheDrawScope.k(null);
        this.onBuildDrawCache.invoke(cacheDrawScope);
        if (cacheDrawScope.getDrawResult() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.d
    public final yh.l<CacheDrawScope, k> c() {
        return this.onBuildDrawCache;
    }

    @dl.d
    public final DrawContentCacheModifier d(@dl.d CacheDrawScope cacheDrawScope, @dl.d yh.l<? super CacheDrawScope, k> onBuildDrawCache) {
        f0.p(cacheDrawScope, "cacheDrawScope");
        f0.p(onBuildDrawCache, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope, onBuildDrawCache);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) other;
        return f0.g(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && f0.g(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache);
    }

    @dl.d
    public final CacheDrawScope f() {
        return this.cacheDrawScope;
    }

    @dl.d
    public final yh.l<CacheDrawScope, k> g() {
        return this.onBuildDrawCache;
    }

    public int hashCode() {
        return (this.cacheDrawScope.hashCode() * 31) + this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.draw.j
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        f0.p(dVar, "<this>");
        k drawResult = this.cacheDrawScope.getDrawResult();
        f0.m(drawResult);
        drawResult.a().invoke(dVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
