package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: EpicOrderGameObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicOrderGameObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private Long createdAtMillis;

    @e
    private String description;

    @e
    private String errorMsg;
    private boolean isGetSuccess;

    @e
    private String name;

    @e
    private String namespace;

    @e
    private String offerId;

    @e
    private String orderId;

    @e
    private Integer playTime;

    @e
    private Integer price;

    @e
    private String type;

    @e
    private String url;

    public EpicOrderGameObj(@e String str, @e Integer num, @e String str2, @e Long l10, @e String str3, @e Integer num2, @e String str4, @e String str5, @e String str6, boolean z10, @e String str7, @e String str8, @e String str9) {
        this.description = str;
        this.price = num;
        this.offerId = str2;
        this.createdAtMillis = l10;
        this.orderId = str3;
        this.playTime = num2;
        this.namespace = str4;
        this.name = str5;
        this.appid = str6;
        this.isGetSuccess = z10;
        this.errorMsg = str7;
        this.type = str8;
        this.url = str9;
    }

    public /* synthetic */ EpicOrderGameObj(String str, Integer num, String str2, Long l10, String str3, Integer num2, String str4, String str5, String str6, boolean z10, String str7, String str8, String str9, int i10, u uVar) {
        this(str, num, str2, l10, str3, num2, str4, str5, str6, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? null : str7, str8, str9);
    }

    public static /* synthetic */ EpicOrderGameObj copy$default(EpicOrderGameObj epicOrderGameObj, String str, Integer num, String str2, Long l10, String str3, Integer num2, String str4, String str5, String str6, boolean z10, String str7, String str8, String str9, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicOrderGameObj, str, num, str2, l10, str3, num2, str4, str5, str6, new Byte(z10 ? (byte) 1 : (byte) 0), str7, str8, str9, new Integer(i10), obj}, null, changeQuickRedirect, true, 15195, new Class[]{EpicOrderGameObj.class, String.class, Integer.class, String.class, Long.class, String.class, Integer.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, Object.class}, EpicOrderGameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicOrderGameObj) patchProxyResultProxy.result;
        }
        return epicOrderGameObj.copy((i10 & 1) != 0 ? epicOrderGameObj.description : str, (i10 & 2) != 0 ? epicOrderGameObj.price : num, (i10 & 4) != 0 ? epicOrderGameObj.offerId : str2, (i10 & 8) != 0 ? epicOrderGameObj.createdAtMillis : l10, (i10 & 16) != 0 ? epicOrderGameObj.orderId : str3, (i10 & 32) != 0 ? epicOrderGameObj.playTime : num2, (i10 & 64) != 0 ? epicOrderGameObj.namespace : str4, (i10 & 128) != 0 ? epicOrderGameObj.name : str5, (i10 & 256) != 0 ? epicOrderGameObj.appid : str6, (i10 & 512) != 0 ? epicOrderGameObj.isGetSuccess : z10 ? 1 : 0, (i10 & 1024) != 0 ? epicOrderGameObj.errorMsg : str7, (i10 & 2048) != 0 ? epicOrderGameObj.type : str8, (i10 & 4096) != 0 ? epicOrderGameObj.url : str9);
    }

    @e
    public final String component1() {
        return this.description;
    }

    public final boolean component10() {
        return this.isGetSuccess;
    }

    @e
    public final String component11() {
        return this.errorMsg;
    }

    @e
    public final String component12() {
        return this.type;
    }

    @e
    public final String component13() {
        return this.url;
    }

    @e
    public final Integer component2() {
        return this.price;
    }

    @e
    public final String component3() {
        return this.offerId;
    }

    @e
    public final Long component4() {
        return this.createdAtMillis;
    }

    @e
    public final String component5() {
        return this.orderId;
    }

    @e
    public final Integer component6() {
        return this.playTime;
    }

    @e
    public final String component7() {
        return this.namespace;
    }

    @e
    public final String component8() {
        return this.name;
    }

    @e
    public final String component9() {
        return this.appid;
    }

    @d
    public final EpicOrderGameObj copy(@e String str, @e Integer num, @e String str2, @e Long l10, @e String str3, @e Integer num2, @e String str4, @e String str5, @e String str6, boolean z10, @e String str7, @e String str8, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num, str2, l10, str3, num2, str4, str5, str6, new Byte(z10 ? (byte) 1 : (byte) 0), str7, str8, str9}, this, changeQuickRedirect, false, 15194, new Class[]{String.class, Integer.class, String.class, Long.class, String.class, Integer.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class}, EpicOrderGameObj.class);
        return patchProxyResultProxy.isSupported ? (EpicOrderGameObj) patchProxyResultProxy.result : new EpicOrderGameObj(str, num, str2, l10, str3, num2, str4, str5, str6, z10, str7, str8, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15198, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicOrderGameObj)) {
            return false;
        }
        EpicOrderGameObj epicOrderGameObj = (EpicOrderGameObj) obj;
        return f0.g(this.description, epicOrderGameObj.description) && f0.g(this.price, epicOrderGameObj.price) && f0.g(this.offerId, epicOrderGameObj.offerId) && f0.g(this.createdAtMillis, epicOrderGameObj.createdAtMillis) && f0.g(this.orderId, epicOrderGameObj.orderId) && f0.g(this.playTime, epicOrderGameObj.playTime) && f0.g(this.namespace, epicOrderGameObj.namespace) && f0.g(this.name, epicOrderGameObj.name) && f0.g(this.appid, epicOrderGameObj.appid) && this.isGetSuccess == epicOrderGameObj.isGetSuccess && f0.g(this.errorMsg, epicOrderGameObj.errorMsg) && f0.g(this.type, epicOrderGameObj.type) && f0.g(this.url, epicOrderGameObj.url);
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getNamespace() {
        return this.namespace;
    }

    @e
    public final String getOfferId() {
        return this.offerId;
    }

    @e
    public final String getOrderId() {
        return this.orderId;
    }

    @e
    public final Integer getPlayTime() {
        return this.playTime;
    }

    @e
    public final Integer getPrice() {
        return this.price;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v46 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15197, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.price;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.offerId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.createdAtMillis;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.playTime;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.namespace;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appid;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z10 = this.isGetSuccess;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode9 + r10) * 31;
        String str7 = this.errorMsg;
        int iHashCode10 = (i10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isGetSuccess() {
        return this.isGetSuccess;
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setCreatedAtMillis(@e Long l10) {
        this.createdAtMillis = l10;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setErrorMsg(@e String str) {
        this.errorMsg = str;
    }

    public final void setGetSuccess(boolean z10) {
        this.isGetSuccess = z10;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setNamespace(@e String str) {
        this.namespace = str;
    }

    public final void setOfferId(@e String str) {
        this.offerId = str;
    }

    public final void setOrderId(@e String str) {
        this.orderId = str;
    }

    public final void setPlayTime(@e Integer num) {
        this.playTime = num;
    }

    public final void setPrice(@e Integer num) {
        this.price = num;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15196, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicOrderGameObj(description=" + this.description + ", price=" + this.price + ", offerId=" + this.offerId + ", createdAtMillis=" + this.createdAtMillis + ", orderId=" + this.orderId + ", playTime=" + this.playTime + ", namespace=" + this.namespace + ", name=" + this.name + ", appid=" + this.appid + ", isGetSuccess=" + this.isGetSuccess + ", errorMsg=" + this.errorMsg + ", type=" + this.type + ", url=" + this.url + ')';
    }
}
