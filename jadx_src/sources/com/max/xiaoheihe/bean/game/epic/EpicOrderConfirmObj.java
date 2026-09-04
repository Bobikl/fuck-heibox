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

/* JADX INFO: compiled from: EpicOrderConfirmObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicOrderConfirmObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String affiliateId;
    private boolean canQuickPurchase;

    @e
    private String captchaToken;

    @e
    private String country;

    @e
    private String countryName;

    @e
    private String creatorSource;

    @e
    private String eulaId;
    private boolean includeAccountBalance;

    @e
    private String lineOffers;

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

    @e
    private String threeDSToken;

    @e
    private Integer totalAmount;
    private boolean useDefault;
    private boolean useDefaultBillingAccount;

    @e
    private String voucherCode;

    public EpicOrderConfirmObj(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<String> list, @e String str8, @e String str9, boolean z12, @e Integer num, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16, boolean z13, boolean z14) {
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
        this.captchaToken = str9;
        this.includeAccountBalance = z12;
        this.totalAmount = num;
        this.affiliateId = str10;
        this.creatorSource = str11;
        this.threeDSToken = str12;
        this.voucherCode = str13;
        this.syncToken = str14;
        this.eulaId = str15;
        this.lineOffers = str16;
        this.useDefaultBillingAccount = z13;
        this.canQuickPurchase = z14;
    }

    public static /* synthetic */ EpicOrderConfirmObj copy$default(EpicOrderConfirmObj epicOrderConfirmObj, boolean z10, boolean z11, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, boolean z12, Integer num, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z13, boolean z14, int i10, Object obj) {
        boolean z15 = z10;
        boolean z16 = z11;
        Object[] objArr = {epicOrderConfirmObj, new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, list, str8, str9, new Byte(z12 ? (byte) 1 : (byte) 0), num, str10, str11, str12, str13, str14, str15, str16, new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15190, new Class[]{EpicOrderConfirmObj.class, cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, Integer.TYPE, Object.class}, EpicOrderConfirmObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicOrderConfirmObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z15 = epicOrderConfirmObj.useDefault;
        }
        if ((i10 & 2) != 0) {
            z16 = epicOrderConfirmObj.setDefault;
        }
        return epicOrderConfirmObj.copy(z15, z16, (i10 & 4) != 0 ? epicOrderConfirmObj.namespace : str, (i10 & 8) != 0 ? epicOrderConfirmObj.country : str2, (i10 & 16) != 0 ? epicOrderConfirmObj.countryName : str3, (i10 & 32) != 0 ? epicOrderConfirmObj.orderId : str4, (i10 & 64) != 0 ? epicOrderConfirmObj.orderComplete : str5, (i10 & 128) != 0 ? epicOrderConfirmObj.orderError : str6, (i10 & 256) != 0 ? epicOrderConfirmObj.orderPending : str7, (i10 & 512) != 0 ? epicOrderConfirmObj.offers : list, (i10 & 1024) != 0 ? epicOrderConfirmObj.offerPrice : str8, (i10 & 2048) != 0 ? epicOrderConfirmObj.captchaToken : str9, (i10 & 4096) != 0 ? epicOrderConfirmObj.includeAccountBalance : z12 ? 1 : 0, (i10 & 8192) != 0 ? epicOrderConfirmObj.totalAmount : num, (i10 & 16384) != 0 ? epicOrderConfirmObj.affiliateId : str10, (i10 & 32768) != 0 ? epicOrderConfirmObj.creatorSource : str11, (i10 & 65536) != 0 ? epicOrderConfirmObj.threeDSToken : str12, (i10 & 131072) != 0 ? epicOrderConfirmObj.voucherCode : str13, (i10 & 262144) != 0 ? epicOrderConfirmObj.syncToken : str14, (i10 & 524288) != 0 ? epicOrderConfirmObj.eulaId : str15, (i10 & 1048576) != 0 ? epicOrderConfirmObj.lineOffers : str16, (i10 & 2097152) != 0 ? epicOrderConfirmObj.useDefaultBillingAccount : z13 ? 1 : 0, (i10 & 4194304) != 0 ? epicOrderConfirmObj.canQuickPurchase : z14 ? 1 : 0);
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
        return this.captchaToken;
    }

    public final boolean component13() {
        return this.includeAccountBalance;
    }

    @e
    public final Integer component14() {
        return this.totalAmount;
    }

    @e
    public final String component15() {
        return this.affiliateId;
    }

    @e
    public final String component16() {
        return this.creatorSource;
    }

    @e
    public final String component17() {
        return this.threeDSToken;
    }

    @e
    public final String component18() {
        return this.voucherCode;
    }

    @e
    public final String component19() {
        return this.syncToken;
    }

    public final boolean component2() {
        return this.setDefault;
    }

    @e
    public final String component20() {
        return this.eulaId;
    }

    @e
    public final String component21() {
        return this.lineOffers;
    }

    public final boolean component22() {
        return this.useDefaultBillingAccount;
    }

    public final boolean component23() {
        return this.canQuickPurchase;
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
    public final EpicOrderConfirmObj copy(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e List<String> list, @e String str8, @e String str9, boolean z12, @e Integer num, @e String str10, @e String str11, @e String str12, @e String str13, @e String str14, @e String str15, @e String str16, boolean z13, boolean z14) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, str4, str5, str6, str7, list, str8, str9, new Byte(z12 ? (byte) 1 : (byte) 0), num, str10, str11, str12, str13, str14, str15, str16, new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15189, new Class[]{cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, cls, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls}, EpicOrderConfirmObj.class);
        return patchProxyResultProxy.isSupported ? (EpicOrderConfirmObj) patchProxyResultProxy.result : new EpicOrderConfirmObj(z10, z11, str, str2, str3, str4, str5, str6, str7, list, str8, str9, z12, num, str10, str11, str12, str13, str14, str15, str16, z13, z14);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15193, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicOrderConfirmObj)) {
            return false;
        }
        EpicOrderConfirmObj epicOrderConfirmObj = (EpicOrderConfirmObj) obj;
        return this.useDefault == epicOrderConfirmObj.useDefault && this.setDefault == epicOrderConfirmObj.setDefault && f0.g(this.namespace, epicOrderConfirmObj.namespace) && f0.g(this.country, epicOrderConfirmObj.country) && f0.g(this.countryName, epicOrderConfirmObj.countryName) && f0.g(this.orderId, epicOrderConfirmObj.orderId) && f0.g(this.orderComplete, epicOrderConfirmObj.orderComplete) && f0.g(this.orderError, epicOrderConfirmObj.orderError) && f0.g(this.orderPending, epicOrderConfirmObj.orderPending) && f0.g(this.offers, epicOrderConfirmObj.offers) && f0.g(this.offerPrice, epicOrderConfirmObj.offerPrice) && f0.g(this.captchaToken, epicOrderConfirmObj.captchaToken) && this.includeAccountBalance == epicOrderConfirmObj.includeAccountBalance && f0.g(this.totalAmount, epicOrderConfirmObj.totalAmount) && f0.g(this.affiliateId, epicOrderConfirmObj.affiliateId) && f0.g(this.creatorSource, epicOrderConfirmObj.creatorSource) && f0.g(this.threeDSToken, epicOrderConfirmObj.threeDSToken) && f0.g(this.voucherCode, epicOrderConfirmObj.voucherCode) && f0.g(this.syncToken, epicOrderConfirmObj.syncToken) && f0.g(this.eulaId, epicOrderConfirmObj.eulaId) && f0.g(this.lineOffers, epicOrderConfirmObj.lineOffers) && this.useDefaultBillingAccount == epicOrderConfirmObj.useDefaultBillingAccount && this.canQuickPurchase == epicOrderConfirmObj.canQuickPurchase;
    }

    @e
    public final String getAffiliateId() {
        return this.affiliateId;
    }

    public final boolean getCanQuickPurchase() {
        return this.canQuickPurchase;
    }

    @e
    public final String getCaptchaToken() {
        return this.captchaToken;
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
    public final String getCreatorSource() {
        return this.creatorSource;
    }

    @e
    public final String getEulaId() {
        return this.eulaId;
    }

    public final boolean getIncludeAccountBalance() {
        return this.includeAccountBalance;
    }

    @e
    public final String getLineOffers() {
        return this.lineOffers;
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

    @e
    public final String getThreeDSToken() {
        return this.threeDSToken;
    }

    @e
    public final Integer getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean getUseDefault() {
        return this.useDefault;
    }

    public final boolean getUseDefaultBillingAccount() {
        return this.useDefaultBillingAccount;
    }

    @e
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15192, new Class[0], Integer.TYPE);
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
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
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
        String str9 = this.captchaToken;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z12 = this.includeAccountBalance;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (iHashCode10 + r12) * 31;
        Integer num = this.totalAmount;
        int iHashCode11 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.affiliateId;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.creatorSource;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.threeDSToken;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.voucherCode;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.syncToken;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.eulaId;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.lineOffers;
        int iHashCode18 = (iHashCode17 + (str16 != null ? str16.hashCode() : 0)) * 31;
        boolean z13 = this.useDefaultBillingAccount;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode18 + r13) * 31;
        boolean z14 = this.canQuickPurchase;
        return i13 + (z14 ? 1 : z14);
    }

    public final void setAffiliateId(@e String str) {
        this.affiliateId = str;
    }

    public final void setCanQuickPurchase(boolean z10) {
        this.canQuickPurchase = z10;
    }

    public final void setCaptchaToken(@e String str) {
        this.captchaToken = str;
    }

    public final void setCountry(@e String str) {
        this.country = str;
    }

    public final void setCountryName(@e String str) {
        this.countryName = str;
    }

    public final void setCreatorSource(@e String str) {
        this.creatorSource = str;
    }

    public final void setEulaId(@e String str) {
        this.eulaId = str;
    }

    public final void setIncludeAccountBalance(boolean z10) {
        this.includeAccountBalance = z10;
    }

    public final void setLineOffers(@e String str) {
        this.lineOffers = str;
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

    public final void setThreeDSToken(@e String str) {
        this.threeDSToken = str;
    }

    public final void setTotalAmount(@e Integer num) {
        this.totalAmount = num;
    }

    public final void setUseDefault(boolean z10) {
        this.useDefault = z10;
    }

    public final void setUseDefaultBillingAccount(boolean z10) {
        this.useDefaultBillingAccount = z10;
    }

    public final void setVoucherCode(@e String str) {
        this.voucherCode = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15191, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicOrderConfirmObj(useDefault=" + this.useDefault + ", setDefault=" + this.setDefault + ", namespace=" + this.namespace + ", country=" + this.country + ", countryName=" + this.countryName + ", orderId=" + this.orderId + ", orderComplete=" + this.orderComplete + ", orderError=" + this.orderError + ", orderPending=" + this.orderPending + ", offers=" + this.offers + ", offerPrice=" + this.offerPrice + ", captchaToken=" + this.captchaToken + ", includeAccountBalance=" + this.includeAccountBalance + ", totalAmount=" + this.totalAmount + ", affiliateId=" + this.affiliateId + ", creatorSource=" + this.creatorSource + ", threeDSToken=" + this.threeDSToken + ", voucherCode=" + this.voucherCode + ", syncToken=" + this.syncToken + ", eulaId=" + this.eulaId + ", lineOffers=" + this.lineOffers + ", useDefaultBillingAccount=" + this.useDefaultBillingAccount + ", canQuickPurchase=" + this.canQuickPurchase + ')';
    }
}
