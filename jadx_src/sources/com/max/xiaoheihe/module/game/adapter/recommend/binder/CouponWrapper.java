package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.NewcomerCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerCouponVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class CouponWrapper implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86025d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private GameObj f86026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final NewcomerCouponObj f86027c;

    public CouponWrapper(@dl.e GameObj gameObj, @dl.e NewcomerCouponObj newcomerCouponObj) {
        this.f86026b = gameObj;
        this.f86027c = newcomerCouponObj;
    }

    public static /* synthetic */ CouponWrapper d(CouponWrapper couponWrapper, GameObj gameObj, NewcomerCouponObj newcomerCouponObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{couponWrapper, gameObj, newcomerCouponObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 35942, new Class[]{CouponWrapper.class, GameObj.class, NewcomerCouponObj.class, Integer.TYPE, Object.class}, CouponWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (CouponWrapper) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            gameObj = couponWrapper.f86026b;
        }
        if ((i10 & 2) != 0) {
            newcomerCouponObj = couponWrapper.f86027c;
        }
        return couponWrapper.c(gameObj, newcomerCouponObj);
    }

    @dl.e
    public final GameObj a() {
        return this.f86026b;
    }

    @dl.e
    public final NewcomerCouponObj b() {
        return this.f86027c;
    }

    @dl.d
    public final CouponWrapper c(@dl.e GameObj gameObj, @dl.e NewcomerCouponObj newcomerCouponObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj, newcomerCouponObj}, this, changeQuickRedirect, false, 35941, new Class[]{GameObj.class, NewcomerCouponObj.class}, CouponWrapper.class);
        return patchProxyResultProxy.isSupported ? (CouponWrapper) patchProxyResultProxy.result : new CouponWrapper(gameObj, newcomerCouponObj);
    }

    @dl.e
    public final NewcomerCouponObj e() {
        return this.f86027c;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 35945, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponWrapper)) {
            return false;
        }
        CouponWrapper couponWrapper = (CouponWrapper) obj;
        return f0.g(this.f86026b, couponWrapper.f86026b) && f0.g(this.f86027c, couponWrapper.f86027c);
    }

    @dl.e
    public final GameObj f() {
        return this.f86026b;
    }

    public final void g(@dl.e GameObj gameObj) {
        this.f86026b = gameObj;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35944, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        GameObj gameObj = this.f86026b;
        int iHashCode = (gameObj == null ? 0 : gameObj.hashCode()) * 31;
        NewcomerCouponObj newcomerCouponObj = this.f86027c;
        return iHashCode + (newcomerCouponObj != null ? newcomerCouponObj.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35943, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CouponWrapper(game=" + this.f86026b + ", coupon=" + this.f86027c + ')';
    }
}
