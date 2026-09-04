package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardObjV2 implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountInfoObj account_info;

    @e
    private Integer appid;

    @e
    private ColorInfoObj background_color;

    @e
    private CardBottomInfoObj bottom_info;

    @e
    private String card_id;

    @e
    private Long create_time;

    @e
    private String img;

    @e
    private String img_src;

    @e
    private Integer initial_price;

    @e
    private String is_dark_theme;

    @e
    private String name;

    @e
    private Integer pay_price;

    @e
    private PayPriceDescObj pay_price_desc;

    @e
    private Integer sku_id;

    @e
    private String top_desc;

    @e
    private String topic_id;

    public CardObjV2(@e Integer num, @e String str, @e Long l10, @e Integer num2, @e String str2, @e String str3, @e String str4, @e String str5, @e ColorInfoObj colorInfoObj, @e String str6, @e Integer num3, @e Integer num4, @e PayPriceDescObj payPriceDescObj, @e AccountInfoObj accountInfoObj, @e CardBottomInfoObj cardBottomInfoObj, @e String str7) {
        this.sku_id = num;
        this.card_id = str;
        this.create_time = l10;
        this.appid = num2;
        this.name = str2;
        this.topic_id = str3;
        this.img = str4;
        this.img_src = str5;
        this.background_color = colorInfoObj;
        this.top_desc = str6;
        this.initial_price = num3;
        this.pay_price = num4;
        this.pay_price_desc = payPriceDescObj;
        this.account_info = accountInfoObj;
        this.bottom_info = cardBottomInfoObj;
        this.is_dark_theme = str7;
    }

    public static /* synthetic */ CardObjV2 copy$default(CardObjV2 cardObjV2, Integer num, String str, Long l10, Integer num2, String str2, String str3, String str4, String str5, ColorInfoObj colorInfoObj, String str6, Integer num3, Integer num4, PayPriceDescObj payPriceDescObj, AccountInfoObj accountInfoObj, CardBottomInfoObj cardBottomInfoObj, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cardObjV2, num, str, l10, num2, str2, str3, str4, str5, colorInfoObj, str6, num3, num4, payPriceDescObj, accountInfoObj, cardBottomInfoObj, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Dj, new Class[]{CardObjV2.class, Integer.class, String.class, Long.class, Integer.class, String.class, String.class, String.class, String.class, ColorInfoObj.class, String.class, Integer.class, Integer.class, PayPriceDescObj.class, AccountInfoObj.class, CardBottomInfoObj.class, String.class, Integer.TYPE, Object.class}, CardObjV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardObjV2) patchProxyResultProxy.result;
        }
        return cardObjV2.copy((i10 & 1) != 0 ? cardObjV2.sku_id : num, (i10 & 2) != 0 ? cardObjV2.card_id : str, (i10 & 4) != 0 ? cardObjV2.create_time : l10, (i10 & 8) != 0 ? cardObjV2.appid : num2, (i10 & 16) != 0 ? cardObjV2.name : str2, (i10 & 32) != 0 ? cardObjV2.topic_id : str3, (i10 & 64) != 0 ? cardObjV2.img : str4, (i10 & 128) != 0 ? cardObjV2.img_src : str5, (i10 & 256) != 0 ? cardObjV2.background_color : colorInfoObj, (i10 & 512) != 0 ? cardObjV2.top_desc : str6, (i10 & 1024) != 0 ? cardObjV2.initial_price : num3, (i10 & 2048) != 0 ? cardObjV2.pay_price : num4, (i10 & 4096) != 0 ? cardObjV2.pay_price_desc : payPriceDescObj, (i10 & 8192) != 0 ? cardObjV2.account_info : accountInfoObj, (i10 & 16384) != 0 ? cardObjV2.bottom_info : cardBottomInfoObj, (i10 & 32768) != 0 ? cardObjV2.is_dark_theme : str7);
    }

    @e
    public final Integer component1() {
        return this.sku_id;
    }

    @e
    public final String component10() {
        return this.top_desc;
    }

    @e
    public final Integer component11() {
        return this.initial_price;
    }

    @e
    public final Integer component12() {
        return this.pay_price;
    }

    @e
    public final PayPriceDescObj component13() {
        return this.pay_price_desc;
    }

    @e
    public final AccountInfoObj component14() {
        return this.account_info;
    }

    @e
    public final CardBottomInfoObj component15() {
        return this.bottom_info;
    }

    @e
    public final String component16() {
        return this.is_dark_theme;
    }

    @e
    public final String component2() {
        return this.card_id;
    }

    @e
    public final Long component3() {
        return this.create_time;
    }

    @e
    public final Integer component4() {
        return this.appid;
    }

    @e
    public final String component5() {
        return this.name;
    }

    @e
    public final String component6() {
        return this.topic_id;
    }

    @e
    public final String component7() {
        return this.img;
    }

    @e
    public final String component8() {
        return this.img_src;
    }

    @e
    public final ColorInfoObj component9() {
        return this.background_color;
    }

    @d
    public final CardObjV2 copy(@e Integer num, @e String str, @e Long l10, @e Integer num2, @e String str2, @e String str3, @e String str4, @e String str5, @e ColorInfoObj colorInfoObj, @e String str6, @e Integer num3, @e Integer num4, @e PayPriceDescObj payPriceDescObj, @e AccountInfoObj accountInfoObj, @e CardBottomInfoObj cardBottomInfoObj, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num, str, l10, num2, str2, str3, str4, str5, colorInfoObj, str6, num3, num4, payPriceDescObj, accountInfoObj, cardBottomInfoObj, str7}, this, changeQuickRedirect, false, c.b.Cj, new Class[]{Integer.class, String.class, Long.class, Integer.class, String.class, String.class, String.class, String.class, ColorInfoObj.class, String.class, Integer.class, Integer.class, PayPriceDescObj.class, AccountInfoObj.class, CardBottomInfoObj.class, String.class}, CardObjV2.class);
        return patchProxyResultProxy.isSupported ? (CardObjV2) patchProxyResultProxy.result : new CardObjV2(num, str, l10, num2, str2, str3, str4, str5, colorInfoObj, str6, num3, num4, payPriceDescObj, accountInfoObj, cardBottomInfoObj, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Gj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardObjV2)) {
            return false;
        }
        CardObjV2 cardObjV2 = (CardObjV2) obj;
        return f0.g(this.sku_id, cardObjV2.sku_id) && f0.g(this.card_id, cardObjV2.card_id) && f0.g(this.create_time, cardObjV2.create_time) && f0.g(this.appid, cardObjV2.appid) && f0.g(this.name, cardObjV2.name) && f0.g(this.topic_id, cardObjV2.topic_id) && f0.g(this.img, cardObjV2.img) && f0.g(this.img_src, cardObjV2.img_src) && f0.g(this.background_color, cardObjV2.background_color) && f0.g(this.top_desc, cardObjV2.top_desc) && f0.g(this.initial_price, cardObjV2.initial_price) && f0.g(this.pay_price, cardObjV2.pay_price) && f0.g(this.pay_price_desc, cardObjV2.pay_price_desc) && f0.g(this.account_info, cardObjV2.account_info) && f0.g(this.bottom_info, cardObjV2.bottom_info) && f0.g(this.is_dark_theme, cardObjV2.is_dark_theme);
    }

    @e
    public final AccountInfoObj getAccount_info() {
        return this.account_info;
    }

    @e
    public final Integer getAppid() {
        return this.appid;
    }

    @e
    public final ColorInfoObj getBackground_color() {
        return this.background_color;
    }

    @e
    public final CardBottomInfoObj getBottom_info() {
        return this.bottom_info;
    }

    @e
    public final String getCard_id() {
        return this.card_id;
    }

    @e
    public final Long getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final String getImg_src() {
        return this.img_src;
    }

    @e
    public final Integer getInitial_price() {
        return this.initial_price;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final Integer getPay_price() {
        return this.pay_price;
    }

    @e
    public final PayPriceDescObj getPay_price_desc() {
        return this.pay_price_desc;
    }

    @e
    public final Integer getSku_id() {
        return this.sku_id;
    }

    @e
    public final String getTop_desc() {
        return this.top_desc;
    }

    @e
    public final String getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Fj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.sku_id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.card_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.create_time;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.appid;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topic_id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.img;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img_src;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ColorInfoObj colorInfoObj = this.background_color;
        int iHashCode9 = (iHashCode8 + (colorInfoObj == null ? 0 : colorInfoObj.hashCode())) * 31;
        String str6 = this.top_desc;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.initial_price;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.pay_price;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PayPriceDescObj payPriceDescObj = this.pay_price_desc;
        int iHashCode13 = (iHashCode12 + (payPriceDescObj == null ? 0 : payPriceDescObj.hashCode())) * 31;
        AccountInfoObj accountInfoObj = this.account_info;
        int iHashCode14 = (iHashCode13 + (accountInfoObj == null ? 0 : accountInfoObj.hashCode())) * 31;
        CardBottomInfoObj cardBottomInfoObj = this.bottom_info;
        int iHashCode15 = (iHashCode14 + (cardBottomInfoObj == null ? 0 : cardBottomInfoObj.hashCode())) * 31;
        String str7 = this.is_dark_theme;
        return iHashCode15 + (str7 != null ? str7.hashCode() : 0);
    }

    @e
    public final String is_dark_theme() {
        return this.is_dark_theme;
    }

    public final void setAccount_info(@e AccountInfoObj accountInfoObj) {
        this.account_info = accountInfoObj;
    }

    public final void setAppid(@e Integer num) {
        this.appid = num;
    }

    public final void setBackground_color(@e ColorInfoObj colorInfoObj) {
        this.background_color = colorInfoObj;
    }

    public final void setBottom_info(@e CardBottomInfoObj cardBottomInfoObj) {
        this.bottom_info = cardBottomInfoObj;
    }

    public final void setCard_id(@e String str) {
        this.card_id = str;
    }

    public final void setCreate_time(@e Long l10) {
        this.create_time = l10;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setImg_src(@e String str) {
        this.img_src = str;
    }

    public final void setInitial_price(@e Integer num) {
        this.initial_price = num;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPay_price(@e Integer num) {
        this.pay_price = num;
    }

    public final void setPay_price_desc(@e PayPriceDescObj payPriceDescObj) {
        this.pay_price_desc = payPriceDescObj;
    }

    public final void setSku_id(@e Integer num) {
        this.sku_id = num;
    }

    public final void setTop_desc(@e String str) {
        this.top_desc = str;
    }

    public final void setTopic_id(@e String str) {
        this.topic_id = str;
    }

    public final void set_dark_theme(@e String str) {
        this.is_dark_theme = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Ej, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CardObjV2(sku_id=" + this.sku_id + ", card_id=" + this.card_id + ", create_time=" + this.create_time + ", appid=" + this.appid + ", name=" + this.name + ", topic_id=" + this.topic_id + ", img=" + this.img + ", img_src=" + this.img_src + ", background_color=" + this.background_color + ", top_desc=" + this.top_desc + ", initial_price=" + this.initial_price + ", pay_price=" + this.pay_price + ", pay_price_desc=" + this.pay_price_desc + ", account_info=" + this.account_info + ", bottom_info=" + this.bottom_info + ", is_dark_theme=" + this.is_dark_theme + ')';
    }
}
