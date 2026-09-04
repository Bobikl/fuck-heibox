package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RollItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RollItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private String coupon_id;

    @e
    private String description;

    @e
    private String image;

    @e
    private String name;

    @e
    private String price;

    @e
    private String protocol;

    @e
    private String time_desc;

    public RollItemObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        this.price = str;
        this.image = str2;
        this.name = str3;
        this.description = str4;
        this.appid = str5;
        this.protocol = str6;
        this.time_desc = str7;
        this.coupon_id = str8;
    }

    public static /* synthetic */ RollItemObj copy$default(RollItemObj rollItemObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rollItemObj, str, str2, str3, str4, str5, str6, str7, str8, new Integer(i10), obj}, null, changeQuickRedirect, true, 14989, new Class[]{RollItemObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, RollItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RollItemObj) patchProxyResultProxy.result;
        }
        return rollItemObj.copy((i10 & 1) != 0 ? rollItemObj.price : str, (i10 & 2) != 0 ? rollItemObj.image : str2, (i10 & 4) != 0 ? rollItemObj.name : str3, (i10 & 8) != 0 ? rollItemObj.description : str4, (i10 & 16) != 0 ? rollItemObj.appid : str5, (i10 & 32) != 0 ? rollItemObj.protocol : str6, (i10 & 64) != 0 ? rollItemObj.time_desc : str7, (i10 & 128) != 0 ? rollItemObj.coupon_id : str8);
    }

    @e
    public final String component1() {
        return this.price;
    }

    @e
    public final String component2() {
        return this.image;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component4() {
        return this.description;
    }

    @e
    public final String component5() {
        return this.appid;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @e
    public final String component7() {
        return this.time_desc;
    }

    @e
    public final String component8() {
        return this.coupon_id;
    }

    @d
    public final RollItemObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8}, this, changeQuickRedirect, false, 14988, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, RollItemObj.class);
        return patchProxyResultProxy.isSupported ? (RollItemObj) patchProxyResultProxy.result : new RollItemObj(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14992, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RollItemObj)) {
            return false;
        }
        RollItemObj rollItemObj = (RollItemObj) obj;
        return f0.g(this.price, rollItemObj.price) && f0.g(this.image, rollItemObj.image) && f0.g(this.name, rollItemObj.name) && f0.g(this.description, rollItemObj.description) && f0.g(this.appid, rollItemObj.appid) && f0.g(this.protocol, rollItemObj.protocol) && f0.g(this.time_desc, rollItemObj.time_desc) && f0.g(this.coupon_id, rollItemObj.coupon_id);
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final String getCoupon_id() {
        return this.coupon_id;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTime_desc() {
        return this.time_desc;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14991, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.time_desc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.coupon_id;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setCoupon_id(@e String str) {
        this.coupon_id = str;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTime_desc(@e String str) {
        this.time_desc = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14990, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RollItemObj(price=" + this.price + ", image=" + this.image + ", name=" + this.name + ", description=" + this.description + ", appid=" + this.appid + ", protocol=" + this.protocol + ", time_desc=" + this.time_desc + ", coupon_id=" + this.coupon_id + ')';
    }
}
