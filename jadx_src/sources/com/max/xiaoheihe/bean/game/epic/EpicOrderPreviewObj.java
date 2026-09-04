package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicOrderPreviewObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicOrderPreviewObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String country;

    @e
    private String countryName;

    @e
    private String namespace;

    @e
    private String offerPrice;

    @e
    private List<String> offers;

    @e
    private String orderComplete;

    @e
    private String orderError;

    @e
    private String orderId;

    @e
    private String orderPending;
    private boolean setDefault;

    @e
    private String syncToken;
    private boolean useDefault;

    public EpicOrderPreviewObj(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<String> list, @e String str8, @e String str9) {
        this.useDefault = z10;
        this.setDefault = z11;
        this.namespace = str;
        this.country = str2;
        this.countryName = str3;
        this.orderId = str4;
        this.orderComplete = str5;
        this.orderError = str6;
        this.orderPending = str7;
        this.offers = list;
        this.offerPrice = str8;
        this.syncToken = str9;
    }

    public static /* synthetic */ EpicOrderPreviewObj copy$default(EpicOrderPreviewObj epicOrderPreviewObj, boolean z10, boolean z11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, int i10, Object obj) {
        Object[] objArr = {epicOrderPreviewObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, list, str8, str9, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15200, new Class[]{EpicOrderPreviewObj.class, cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, EpicOrderPreviewObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicOrderPreviewObj) patchProxyResultProxy.result;
        }
        return epicOrderPreviewObj.copy((i10 & 1) != 0 ? epicOrderPreviewObj.useDefault : z10 ? 1 : 0, (i10 & 2) != 0 ? epicOrderPreviewObj.setDefault : z11 ? 1 : 0, (i10 & 4) != 0 ? epicOrderPreviewObj.namespace : str, (i10 & 8) != 0 ? epicOrderPreviewObj.country : str2, (i10 & 16) != 0 ? epicOrderPreviewObj.countryName : str3, (i10 & 32) != 0 ? epicOrderPreviewObj.orderId : str4, (i10 & 64) != 0 ? epicOrderPreviewObj.orderComplete : str5, (i10 & 128) != 0 ? epicOrderPreviewObj.orderError : str6, (i10 & 256) != 0 ? epicOrderPreviewObj.orderPending : str7, (i10 & 512) != 0 ? epicOrderPreviewObj.offers : list, (i10 & 1024) != 0 ? epicOrderPreviewObj.offerPrice : str8, (i10 & 2048) != 0 ? epicOrderPreviewObj.syncToken : str9);
    }

    public final boolean component1() {
        return this.useDefault;
    }

    @e
    public final List<String> component10() {
        return this.offers;
    }

    @e
    public final String component11() {
        return this.offerPrice;
    }

    @e
    public final String component12() {
        return this.syncToken;
    }

    public final boolean component2() {
        return this.setDefault;
    }

    @e
    public final String component3() {
        return this.namespace;
    }

    @e
    public final String component4() {
        return this.country;
    }

    @e
    public final String component5() {
        return this.countryName;
    }

    @e
    public final String component6() {
        return this.orderId;
    }

    @e
    public final String component7() {
        return this.orderComplete;
    }

    @e
    public final String component8() {
        return this.orderError;
    }

    @e
    public final String component9() {
        return this.orderPending;
    }

    @d
    public final EpicOrderPreviewObj copy(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<String> list, @e String str8, @e String str9) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, list, str8, str9};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15199, new Class[]{cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class}, EpicOrderPreviewObj.class);
        return patchProxyResultProxy.isSupported ? (EpicOrderPreviewObj) patchProxyResultProxy.result : new EpicOrderPreviewObj(z10, z11, str, str2, str3, str4, str5, str6, str7, list, str8, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15203, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicOrderPreviewObj)) {
            return false;
        }
        EpicOrderPreviewObj epicOrderPreviewObj = (EpicOrderPreviewObj) obj;
        return this.useDefault == epicOrderPreviewObj.useDefault && this.setDefault == epicOrderPreviewObj.setDefault && f0.g(this.namespace, epicOrderPreviewObj.namespace) && f0.g(this.country, epicOrderPreviewObj.country) && f0.g(this.countryName, epicOrderPreviewObj.countryName) && f0.g(this.orderId, epicOrderPreviewObj.orderId) && f0.g(this.orderComplete, epicOrderPreviewObj.orderComplete) && f0.g(this.orderError, epicOrderPreviewObj.orderError) && f0.g(this.orderPending, epicOrderPreviewObj.orderPending) && f0.g(this.offers, epicOrderPreviewObj.offers) && f0.g(this.offerPrice, epicOrderPreviewObj.offerPrice) && f0.g(this.syncToken, epicOrderPreviewObj.syncToken);
    }

    @e
    public final String getCountry() {
        return this.country;
    }

    @e
    public final String getCountryName() {
        return this.countryName;
    }

    @e
    public final String getNamespace() {
        return this.namespace;
    }

    @e
    public final String getOfferPrice() {
        return this.offerPrice;
    }

    @e
    public final List<String> getOffers() {
        return this.offers;
    }

    @e
    public final String getOrderComplete() {
        return this.orderComplete;
    }

    @e
    public final String getOrderError() {
        return this.orderError;
    }

    @e
    public final String getOrderId() {
        return this.orderId;
    }

    @e
    public final String getOrderPending() {
        return this.orderPending;
    }

    public final boolean getSetDefault() {
        return this.setDefault;
    }

    @e
    public final String getSyncToken() {
        return this.syncToken;
    }

    public final boolean getUseDefault() {
        return this.useDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v41 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15202, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.useDefault;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        boolean z11 = this.setDefault;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str = this.namespace;
        int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderComplete;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderError;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orderPending;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list = this.offers;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.offerPrice;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.syncToken;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setCountry(@e String str) {
        this.country = str;
    }

    public final void setCountryName(@e String str) {
        this.countryName = str;
    }

    public final void setNamespace(@e String str) {
        this.namespace = str;
    }

    public final void setOfferPrice(@e String str) {
        this.offerPrice = str;
    }

    public final void setOffers(@e List<String> list) {
        this.offers = list;
    }

    public final void setOrderComplete(@e String str) {
        this.orderComplete = str;
    }

    public final void setOrderError(@e String str) {
        this.orderError = str;
    }

    public final void setOrderId(@e String str) {
        this.orderId = str;
    }

    public final void setOrderPending(@e String str) {
        this.orderPending = str;
    }

    public final void setSetDefault(boolean z10) {
        this.setDefault = z10;
    }

    public final void setSyncToken(@e String str) {
        this.syncToken = str;
    }

    public final void setUseDefault(boolean z10) {
        this.useDefault = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15201, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicOrderPreviewObj(useDefault=" + this.useDefault + ", setDefault=" + this.setDefault + ", namespace=" + this.namespace + ", country=" + this.country + ", countryName=" + this.countryName + ", orderId=" + this.orderId + ", orderComplete=" + this.orderComplete + ", orderError=" + this.orderError + ", orderPending=" + this.orderPending + ", offers=" + this.offers + ", offerPrice=" + this.offerPrice + ", syncToken=" + this.syncToken + ')';
    }
}
