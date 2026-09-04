package com.max.xiaoheihe.bean.game.recommend;

import androidx.compose.runtime.internal.o;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CouponNewcomerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class NewcomerCouponReceiveResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<MallCouponObj> coupon_list;

    @e
    private String deadline_ts;

    @e
    private String to_look;

    @e
    private String to_wallet;

    public NewcomerCouponReceiveResult(@e String str, @e String str2, @e String str3, @e ArrayList<MallCouponObj> arrayList) {
        this.deadline_ts = str;
        this.to_wallet = str2;
        this.to_look = str3;
        this.coupon_list = arrayList;
    }

    public static /* synthetic */ NewcomerCouponReceiveResult copy$default(NewcomerCouponReceiveResult newcomerCouponReceiveResult, String str, String str2, String str3, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerCouponReceiveResult, str, str2, str3, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 15396, new Class[]{NewcomerCouponReceiveResult.class, String.class, String.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, NewcomerCouponReceiveResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewcomerCouponReceiveResult) patchProxyResultProxy.result;
        }
        return newcomerCouponReceiveResult.copy((i10 & 1) != 0 ? newcomerCouponReceiveResult.deadline_ts : str, (i10 & 2) != 0 ? newcomerCouponReceiveResult.to_wallet : str2, (i10 & 4) != 0 ? newcomerCouponReceiveResult.to_look : str3, (i10 & 8) != 0 ? newcomerCouponReceiveResult.coupon_list : arrayList);
    }

    @e
    public final String component1() {
        return this.deadline_ts;
    }

    @e
    public final String component2() {
        return this.to_wallet;
    }

    @e
    public final String component3() {
        return this.to_look;
    }

    @e
    public final ArrayList<MallCouponObj> component4() {
        return this.coupon_list;
    }

    @d
    public final NewcomerCouponReceiveResult copy(@e String str, @e String str2, @e String str3, @e ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, arrayList}, this, changeQuickRedirect, false, 15395, new Class[]{String.class, String.class, String.class, ArrayList.class}, NewcomerCouponReceiveResult.class);
        return patchProxyResultProxy.isSupported ? (NewcomerCouponReceiveResult) patchProxyResultProxy.result : new NewcomerCouponReceiveResult(str, str2, str3, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15399, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewcomerCouponReceiveResult)) {
            return false;
        }
        NewcomerCouponReceiveResult newcomerCouponReceiveResult = (NewcomerCouponReceiveResult) obj;
        return f0.g(this.deadline_ts, newcomerCouponReceiveResult.deadline_ts) && f0.g(this.to_wallet, newcomerCouponReceiveResult.to_wallet) && f0.g(this.to_look, newcomerCouponReceiveResult.to_look) && f0.g(this.coupon_list, newcomerCouponReceiveResult.coupon_list);
    }

    @e
    public final ArrayList<MallCouponObj> getCoupon_list() {
        return this.coupon_list;
    }

    @e
    public final String getDeadline_ts() {
        return this.deadline_ts;
    }

    @e
    public final String getTo_look() {
        return this.to_look;
    }

    @e
    public final String getTo_wallet() {
        return this.to_wallet;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15398, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.deadline_ts;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to_wallet;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.to_look;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<MallCouponObj> arrayList = this.coupon_list;
        return iHashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setCoupon_list(@e ArrayList<MallCouponObj> arrayList) {
        this.coupon_list = arrayList;
    }

    public final void setDeadline_ts(@e String str) {
        this.deadline_ts = str;
    }

    public final void setTo_look(@e String str) {
        this.to_look = str;
    }

    public final void setTo_wallet(@e String str) {
        this.to_wallet = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15397, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewcomerCouponReceiveResult(deadline_ts=" + this.deadline_ts + ", to_wallet=" + this.to_wallet + ", to_look=" + this.to_look + ", coupon_list=" + this.coupon_list + ')';
    }
}
