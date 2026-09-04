package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CardObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountInfoObj account_info;

    @e
    private Integer appid;

    @e
    private String card_id;

    @e
    private ColorInfoObj color_v2;

    @e
    private Long create_time;

    @e
    private List<DescObj> descs;

    @e
    private String img;

    @e
    private String img_src;

    @e
    private String name;

    @e
    private Double price;

    @e
    private Integer sku_id;

    @e
    private String topic_id;

    public CardObj(@e String str, @e Integer num, @e String str2, @e String str3, @e List<DescObj> list, @e ColorInfoObj colorInfoObj, @e Double d10, @e Long l10, @e Integer num2, @e String str4, @e AccountInfoObj accountInfoObj, @e String str5) {
        this.card_id = str;
        this.sku_id = num;
        this.name = str2;
        this.img = str3;
        this.descs = list;
        this.color_v2 = colorInfoObj;
        this.price = d10;
        this.create_time = l10;
        this.appid = num2;
        this.topic_id = str4;
        this.account_info = accountInfoObj;
        this.img_src = str5;
    }

    public static /* synthetic */ CardObj copy$default(CardObj cardObj, String str, Integer num, String str2, String str3, List list, ColorInfoObj colorInfoObj, Double d10, Long l10, Integer num2, String str4, AccountInfoObj accountInfoObj, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cardObj, str, num, str2, str3, list, colorInfoObj, d10, l10, num2, str4, accountInfoObj, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.f31069yj, new Class[]{CardObj.class, String.class, Integer.class, String.class, String.class, List.class, ColorInfoObj.class, Double.class, Long.class, Integer.class, String.class, AccountInfoObj.class, String.class, Integer.TYPE, Object.class}, CardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardObj) patchProxyResultProxy.result;
        }
        return cardObj.copy((i10 & 1) != 0 ? cardObj.card_id : str, (i10 & 2) != 0 ? cardObj.sku_id : num, (i10 & 4) != 0 ? cardObj.name : str2, (i10 & 8) != 0 ? cardObj.img : str3, (i10 & 16) != 0 ? cardObj.descs : list, (i10 & 32) != 0 ? cardObj.color_v2 : colorInfoObj, (i10 & 64) != 0 ? cardObj.price : d10, (i10 & 128) != 0 ? cardObj.create_time : l10, (i10 & 256) != 0 ? cardObj.appid : num2, (i10 & 512) != 0 ? cardObj.topic_id : str4, (i10 & 1024) != 0 ? cardObj.account_info : accountInfoObj, (i10 & 2048) != 0 ? cardObj.img_src : str5);
    }

    @e
    public final String component1() {
        return this.card_id;
    }

    @e
    public final String component10() {
        return this.topic_id;
    }

    @e
    public final AccountInfoObj component11() {
        return this.account_info;
    }

    @e
    public final String component12() {
        return this.img_src;
    }

    @e
    public final Integer component2() {
        return this.sku_id;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component4() {
        return this.img;
    }

    @e
    public final List<DescObj> component5() {
        return this.descs;
    }

    @e
    public final ColorInfoObj component6() {
        return this.color_v2;
    }

    @e
    public final Double component7() {
        return this.price;
    }

    @e
    public final Long component8() {
        return this.create_time;
    }

    @e
    public final Integer component9() {
        return this.appid;
    }

    @d
    public final CardObj copy(@e String str, @e Integer num, @e String str2, @e String str3, @e List<DescObj> list, @e ColorInfoObj colorInfoObj, @e Double d10, @e Long l10, @e Integer num2, @e String str4, @e AccountInfoObj accountInfoObj, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num, str2, str3, list, colorInfoObj, d10, l10, num2, str4, accountInfoObj, str5}, this, changeQuickRedirect, false, c.b.f31047xj, new Class[]{String.class, Integer.class, String.class, String.class, List.class, ColorInfoObj.class, Double.class, Long.class, Integer.class, String.class, AccountInfoObj.class, String.class}, CardObj.class);
        return patchProxyResultProxy.isSupported ? (CardObj) patchProxyResultProxy.result : new CardObj(str, num, str2, str3, list, colorInfoObj, d10, l10, num2, str4, accountInfoObj, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Bj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardObj)) {
            return false;
        }
        CardObj cardObj = (CardObj) obj;
        return f0.g(this.card_id, cardObj.card_id) && f0.g(this.sku_id, cardObj.sku_id) && f0.g(this.name, cardObj.name) && f0.g(this.img, cardObj.img) && f0.g(this.descs, cardObj.descs) && f0.g(this.color_v2, cardObj.color_v2) && f0.g(this.price, cardObj.price) && f0.g(this.create_time, cardObj.create_time) && f0.g(this.appid, cardObj.appid) && f0.g(this.topic_id, cardObj.topic_id) && f0.g(this.account_info, cardObj.account_info) && f0.g(this.img_src, cardObj.img_src);
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
    public final String getCard_id() {
        return this.card_id;
    }

    @e
    public final ColorInfoObj getColor_v2() {
        return this.color_v2;
    }

    @e
    public final Long getCreate_time() {
        return this.create_time;
    }

    @e
    public final List<DescObj> getDescs() {
        return this.descs;
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
    public final String getName() {
        return this.name;
    }

    @e
    public final Double getPrice() {
        return this.price;
    }

    @e
    public final Integer getSku_id() {
        return this.sku_id;
    }

    @e
    public final String getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Aj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.card_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sku_id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DescObj> list = this.descs;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ColorInfoObj colorInfoObj = this.color_v2;
        int iHashCode6 = (iHashCode5 + (colorInfoObj == null ? 0 : colorInfoObj.hashCode())) * 31;
        Double d10 = this.price;
        int iHashCode7 = (iHashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Long l10 = this.create_time;
        int iHashCode8 = (iHashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.appid;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.topic_id;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AccountInfoObj accountInfoObj = this.account_info;
        int iHashCode11 = (iHashCode10 + (accountInfoObj == null ? 0 : accountInfoObj.hashCode())) * 31;
        String str5 = this.img_src;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAccount_info(@e AccountInfoObj accountInfoObj) {
        this.account_info = accountInfoObj;
    }

    public final void setAppid(@e Integer num) {
        this.appid = num;
    }

    public final void setCard_id(@e String str) {
        this.card_id = str;
    }

    public final void setColor_v2(@e ColorInfoObj colorInfoObj) {
        this.color_v2 = colorInfoObj;
    }

    public final void setCreate_time(@e Long l10) {
        this.create_time = l10;
    }

    public final void setDescs(@e List<DescObj> list) {
        this.descs = list;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setImg_src(@e String str) {
        this.img_src = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPrice(@e Double d10) {
        this.price = d10;
    }

    public final void setSku_id(@e Integer num) {
        this.sku_id = num;
    }

    public final void setTopic_id(@e String str) {
        this.topic_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f31091zj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CardObj(card_id=" + this.card_id + ", sku_id=" + this.sku_id + ", name=" + this.name + ", img=" + this.img + ", descs=" + this.descs + ", color_v2=" + this.color_v2 + ", price=" + this.price + ", create_time=" + this.create_time + ", appid=" + this.appid + ", topic_id=" + this.topic_id + ", account_info=" + this.account_info + ", img_src=" + this.img_src + ')';
    }
}
