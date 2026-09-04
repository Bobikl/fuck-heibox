package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerNotifyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class NewcomerNotifyObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background;

    @e
    private NewcomerCouponObj coupon;

    @e
    private NewcomerGameObj game;

    @e
    private String location;

    @e
    private String notify;

    @e
    private NewcomerNofityV2Obj notify_v2;

    @e
    private String protocol;

    public NewcomerNotifyObj(@e String str, @e String str2, @e String str3, @e String str4, @e NewcomerCouponObj newcomerCouponObj, @e NewcomerGameObj newcomerGameObj, @e NewcomerNofityV2Obj newcomerNofityV2Obj) {
        this.protocol = str;
        this.notify = str2;
        this.background = str3;
        this.location = str4;
        this.coupon = newcomerCouponObj;
        this.game = newcomerGameObj;
        this.notify_v2 = newcomerNofityV2Obj;
    }

    public static /* synthetic */ NewcomerNotifyObj copy$default(NewcomerNotifyObj newcomerNotifyObj, String str, String str2, String str3, String str4, NewcomerCouponObj newcomerCouponObj, NewcomerGameObj newcomerGameObj, NewcomerNofityV2Obj newcomerNofityV2Obj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerNotifyObj, str, str2, str3, str4, newcomerCouponObj, newcomerGameObj, newcomerNofityV2Obj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15537, new Class[]{NewcomerNotifyObj.class, String.class, String.class, String.class, String.class, NewcomerCouponObj.class, NewcomerGameObj.class, NewcomerNofityV2Obj.class, Integer.TYPE, Object.class}, NewcomerNotifyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewcomerNotifyObj) patchProxyResultProxy.result;
        }
        return newcomerNotifyObj.copy((i10 & 1) != 0 ? newcomerNotifyObj.protocol : str, (i10 & 2) != 0 ? newcomerNotifyObj.notify : str2, (i10 & 4) != 0 ? newcomerNotifyObj.background : str3, (i10 & 8) != 0 ? newcomerNotifyObj.location : str4, (i10 & 16) != 0 ? newcomerNotifyObj.coupon : newcomerCouponObj, (i10 & 32) != 0 ? newcomerNotifyObj.game : newcomerGameObj, (i10 & 64) != 0 ? newcomerNotifyObj.notify_v2 : newcomerNofityV2Obj);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.notify;
    }

    @e
    public final String component3() {
        return this.background;
    }

    @e
    public final String component4() {
        return this.location;
    }

    @e
    public final NewcomerCouponObj component5() {
        return this.coupon;
    }

    @e
    public final NewcomerGameObj component6() {
        return this.game;
    }

    @e
    public final NewcomerNofityV2Obj component7() {
        return this.notify_v2;
    }

    @d
    public final NewcomerNotifyObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e NewcomerCouponObj newcomerCouponObj, @e NewcomerGameObj newcomerGameObj, @e NewcomerNofityV2Obj newcomerNofityV2Obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, newcomerCouponObj, newcomerGameObj, newcomerNofityV2Obj}, this, changeQuickRedirect, false, 15536, new Class[]{String.class, String.class, String.class, String.class, NewcomerCouponObj.class, NewcomerGameObj.class, NewcomerNofityV2Obj.class}, NewcomerNotifyObj.class);
        return patchProxyResultProxy.isSupported ? (NewcomerNotifyObj) patchProxyResultProxy.result : new NewcomerNotifyObj(str, str2, str3, str4, newcomerCouponObj, newcomerGameObj, newcomerNofityV2Obj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15540, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewcomerNotifyObj)) {
            return false;
        }
        NewcomerNotifyObj newcomerNotifyObj = (NewcomerNotifyObj) obj;
        return f0.g(this.protocol, newcomerNotifyObj.protocol) && f0.g(this.notify, newcomerNotifyObj.notify) && f0.g(this.background, newcomerNotifyObj.background) && f0.g(this.location, newcomerNotifyObj.location) && f0.g(this.coupon, newcomerNotifyObj.coupon) && f0.g(this.game, newcomerNotifyObj.game) && f0.g(this.notify_v2, newcomerNotifyObj.notify_v2);
    }

    @e
    public final String getBackground() {
        return this.background;
    }

    @e
    public final NewcomerCouponObj getCoupon() {
        return this.coupon;
    }

    @e
    public final NewcomerGameObj getGame() {
        return this.game;
    }

    @e
    public final String getLocation() {
        return this.location;
    }

    @e
    public final String getNotify() {
        return this.notify;
    }

    @e
    public final NewcomerNofityV2Obj getNotify_v2() {
        return this.notify_v2;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15539, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notify;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.background;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NewcomerCouponObj newcomerCouponObj = this.coupon;
        int iHashCode5 = (iHashCode4 + (newcomerCouponObj == null ? 0 : newcomerCouponObj.hashCode())) * 31;
        NewcomerGameObj newcomerGameObj = this.game;
        int iHashCode6 = (iHashCode5 + (newcomerGameObj == null ? 0 : newcomerGameObj.hashCode())) * 31;
        NewcomerNofityV2Obj newcomerNofityV2Obj = this.notify_v2;
        return iHashCode6 + (newcomerNofityV2Obj != null ? newcomerNofityV2Obj.hashCode() : 0);
    }

    public final void setBackground(@e String str) {
        this.background = str;
    }

    public final void setCoupon(@e NewcomerCouponObj newcomerCouponObj) {
        this.coupon = newcomerCouponObj;
    }

    public final void setGame(@e NewcomerGameObj newcomerGameObj) {
        this.game = newcomerGameObj;
    }

    public final void setLocation(@e String str) {
        this.location = str;
    }

    public final void setNotify(@e String str) {
        this.notify = str;
    }

    public final void setNotify_v2(@e NewcomerNofityV2Obj newcomerNofityV2Obj) {
        this.notify_v2 = newcomerNofityV2Obj;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15538, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewcomerNotifyObj(protocol=" + this.protocol + ", notify=" + this.notify + ", background=" + this.background + ", location=" + this.location + ", coupon=" + this.coupon + ", game=" + this.game + ", notify_v2=" + this.notify_v2 + ')';
    }
}
