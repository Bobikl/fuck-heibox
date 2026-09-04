package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.foundation.b0;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CouponNewcomerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CouponNewcomerObj extends GameRecommendBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<NewcomerCouponObj> coupons;

    @e
    private String deadline_ts;

    @e
    private ArrayList<GameObj> games;
    private boolean has_get;

    @e
    private String prot;

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15337, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(CouponNewcomerObj.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.recommend.CouponNewcomerObj");
        CouponNewcomerObj couponNewcomerObj = (CouponNewcomerObj) obj;
        return f0.g(this.games, couponNewcomerObj.games) && f0.g(this.deadline_ts, couponNewcomerObj.deadline_ts) && f0.g(this.coupons, couponNewcomerObj.coupons) && this.has_get == couponNewcomerObj.has_get && f0.g(this.prot, couponNewcomerObj.prot);
    }

    @e
    public final ArrayList<NewcomerCouponObj> getCoupons() {
        return this.coupons;
    }

    @e
    public final String getDeadline_ts() {
        return this.deadline_ts;
    }

    @e
    public final ArrayList<GameObj> getGames() {
        return this.games;
    }

    public final boolean getHas_get() {
        return this.has_get;
    }

    @e
    public final String getProt() {
        return this.prot;
    }

    @Override // com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15338, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = super.hashCode() * 31;
        ArrayList<GameObj> arrayList = this.games;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str = this.deadline_ts;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ArrayList<NewcomerCouponObj> arrayList2 = this.coupons;
        int iHashCode4 = (((iHashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31) + b0.a(this.has_get)) * 31;
        String str2 = this.prot;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCoupons(@e ArrayList<NewcomerCouponObj> arrayList) {
        this.coupons = arrayList;
    }

    public final void setDeadline_ts(@e String str) {
        this.deadline_ts = str;
    }

    public final void setGames(@e ArrayList<GameObj> arrayList) {
        this.games = arrayList;
    }

    public final void setHas_get(boolean z10) {
        this.has_get = z10;
    }

    public final void setProt(@e String str) {
        this.prot = str;
    }
}
