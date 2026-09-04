package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeOfferObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeOfferObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private String create_time;

    @e
    private String desc;

    @e
    private String img_url;

    @e
    private String name;

    @e
    private String rarity_color;

    @e
    private Integer special;

    @e
    private String toid;

    @e
    private String trade_url;

    @e
    private String type;

    public TradeOfferObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e Integer num, @e String str9) {
        this.create_time = str;
        this.desc = str2;
        this.name = str3;
        this.rarity_color = str4;
        this.img_url = str5;
        this.trade_url = str6;
        this.count = str7;
        this.toid = str8;
        this.special = num;
        this.type = str9;
    }

    public static /* synthetic */ TradeOfferObj copy$default(TradeOfferObj tradeOfferObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeOfferObj, str, str2, str3, str4, str5, str6, str7, str8, num, str9, new Integer(i10), obj}, null, changeQuickRedirect, true, 16116, new Class[]{TradeOfferObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Integer.TYPE, Object.class}, TradeOfferObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeOfferObj) patchProxyResultProxy.result;
        }
        return tradeOfferObj.copy((i10 & 1) != 0 ? tradeOfferObj.create_time : str, (i10 & 2) != 0 ? tradeOfferObj.desc : str2, (i10 & 4) != 0 ? tradeOfferObj.name : str3, (i10 & 8) != 0 ? tradeOfferObj.rarity_color : str4, (i10 & 16) != 0 ? tradeOfferObj.img_url : str5, (i10 & 32) != 0 ? tradeOfferObj.trade_url : str6, (i10 & 64) != 0 ? tradeOfferObj.count : str7, (i10 & 128) != 0 ? tradeOfferObj.toid : str8, (i10 & 256) != 0 ? tradeOfferObj.special : num, (i10 & 512) != 0 ? tradeOfferObj.type : str9);
    }

    @e
    public final String component1() {
        return this.create_time;
    }

    @e
    public final String component10() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component4() {
        return this.rarity_color;
    }

    @e
    public final String component5() {
        return this.img_url;
    }

    @e
    public final String component6() {
        return this.trade_url;
    }

    @e
    public final String component7() {
        return this.count;
    }

    @e
    public final String component8() {
        return this.toid;
    }

    @e
    public final Integer component9() {
        return this.special;
    }

    @d
    public final TradeOfferObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e Integer num, @e String str9) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, num, str9}, this, changeQuickRedirect, false, 16115, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class}, TradeOfferObj.class);
        return patchProxyResultProxy.isSupported ? (TradeOfferObj) patchProxyResultProxy.result : new TradeOfferObj(str, str2, str3, str4, str5, str6, str7, str8, num, str9);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16119, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOfferObj)) {
            return false;
        }
        TradeOfferObj tradeOfferObj = (TradeOfferObj) obj;
        return f0.g(this.create_time, tradeOfferObj.create_time) && f0.g(this.desc, tradeOfferObj.desc) && f0.g(this.name, tradeOfferObj.name) && f0.g(this.rarity_color, tradeOfferObj.rarity_color) && f0.g(this.img_url, tradeOfferObj.img_url) && f0.g(this.trade_url, tradeOfferObj.trade_url) && f0.g(this.count, tradeOfferObj.count) && f0.g(this.toid, tradeOfferObj.toid) && f0.g(this.special, tradeOfferObj.special) && f0.g(this.type, tradeOfferObj.type);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getRarity_color() {
        return this.rarity_color;
    }

    @e
    public final Integer getSpecial() {
        return this.special;
    }

    @e
    public final String getToid() {
        return this.toid;
    }

    @e
    public final String getTrade_url() {
        return this.trade_url;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16118, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.create_time;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rarity_color;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img_url;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.trade_url;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.count;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.toid;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.special;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.type;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setRarity_color(@e String str) {
        this.rarity_color = str;
    }

    public final void setSpecial(@e Integer num) {
        this.special = num;
    }

    public final void setToid(@e String str) {
        this.toid = str;
    }

    public final void setTrade_url(@e String str) {
        this.trade_url = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16117, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeOfferObj(create_time=" + this.create_time + ", desc=" + this.desc + ", name=" + this.name + ", rarity_color=" + this.rarity_color + ", img_url=" + this.img_url + ", trade_url=" + this.trade_url + ", count=" + this.count + ", toid=" + this.toid + ", special=" + this.special + ", type=" + this.type + ')';
    }
}
