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
public final class NewcomerCouponObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer coupon_type;

    @e
    private String description;

    @e
    private String sub_title;

    @e
    private String value;

    public NewcomerCouponObj(@e String str, @e Integer num, @e String str2, @e String str3) {
        this.sub_title = str;
        this.coupon_type = num;
        this.value = str2;
        this.description = str3;
    }

    public static /* synthetic */ NewcomerCouponObj copy$default(NewcomerCouponObj newcomerCouponObj, String str, Integer num, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerCouponObj, str, num, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15522, new Class[]{NewcomerCouponObj.class, String.class, Integer.class, String.class, String.class, Integer.TYPE, Object.class}, NewcomerCouponObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewcomerCouponObj) patchProxyResultProxy.result;
        }
        return newcomerCouponObj.copy((i10 & 1) != 0 ? newcomerCouponObj.sub_title : str, (i10 & 2) != 0 ? newcomerCouponObj.coupon_type : num, (i10 & 4) != 0 ? newcomerCouponObj.value : str2, (i10 & 8) != 0 ? newcomerCouponObj.description : str3);
    }

    @e
    public final String component1() {
        return this.sub_title;
    }

    @e
    public final Integer component2() {
        return this.coupon_type;
    }

    @e
    public final String component3() {
        return this.value;
    }

    @e
    public final String component4() {
        return this.description;
    }

    @d
    public final NewcomerCouponObj copy(@e String str, @e Integer num, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num, str2, str3}, this, changeQuickRedirect, false, 15521, new Class[]{String.class, Integer.class, String.class, String.class}, NewcomerCouponObj.class);
        return patchProxyResultProxy.isSupported ? (NewcomerCouponObj) patchProxyResultProxy.result : new NewcomerCouponObj(str, num, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15525, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewcomerCouponObj)) {
            return false;
        }
        NewcomerCouponObj newcomerCouponObj = (NewcomerCouponObj) obj;
        return f0.g(this.sub_title, newcomerCouponObj.sub_title) && f0.g(this.coupon_type, newcomerCouponObj.coupon_type) && f0.g(this.value, newcomerCouponObj.value) && f0.g(this.description, newcomerCouponObj.description);
    }

    @e
    public final Integer getCoupon_type() {
        return this.coupon_type;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final String getSub_title() {
        return this.sub_title;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15524, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sub_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.coupon_type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCoupon_type(@e Integer num) {
        this.coupon_type = num;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setSub_title(@e String str) {
        this.sub_title = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15523, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewcomerCouponObj(sub_title=" + this.sub_title + ", coupon_type=" + this.coupon_type + ", value=" + this.value + ", description=" + this.description + ')';
    }
}
