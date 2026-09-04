package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.StateObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeSteamInventoryObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TradeSteamInventoryObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String amount;

    @e
    private StateObj bargain_state;

    @e
    private String btn_desc;

    @e
    private String buy_state;
    private boolean checked;

    @e
    private String create_time;

    @e
    private String delta;

    @e
    private ArrayList<TradeItemTag> desc_tags;

    @e
    private List<TradeItemFlagObj> flags;

    @e
    private String float_value;

    @e
    private String high_purchase_price;

    @e
    private String img_url;

    @e
    private ItemQuickPriceObj local_quick_price;

    @e
    private String market_hash_name;

    @e
    private TradeSteamInventoryGroup merged_info;

    @e
    private String name;

    @e
    private String order_id;

    @e
    private String price;

    @e
    private String put_on_price;

    @e
    private String quick_price;

    @e
    private String rarity_color;

    @e
    private String sell_desc;

    @e
    private String sku_id;

    @e
    private Integer special;

    @e
    private String spu;

    @e
    private String spu_id;

    @e
    private String state;

    @e
    private String state_desc;

    @e
    private String state_desc_color;

    @e
    private List<ItemStickerObj> stickers;

    @e
    private String time_left;

    @e
    private TradeInfoObj trade_info;

    @e
    private String trade_url;

    public TradeSteamInventoryObj(@e String str, @e String str2, @e String str3, @e String str4, @e Integer num, @e String str5, @e String str6, @e String str7, @e String str8, @e List<ItemStickerObj> list, @e TradeInfoObj tradeInfoObj, @e List<TradeItemFlagObj> list2, @e String str9, @e String str10, @e String str11, boolean z10, @e String str12, @e ItemQuickPriceObj itemQuickPriceObj, @e String str13, @e String str14, @e String str15, @e String str16, @e String str17, @e String str18, @e String str19, @e String str20, @e TradeSteamInventoryGroup tradeSteamInventoryGroup, @e String str21, @e ArrayList<TradeItemTag> arrayList, @e String str22, @e String str23, @e StateObj stateObj, @e String str24) {
        this.market_hash_name = str;
        this.name = str2;
        this.img_url = str3;
        this.float_value = str4;
        this.special = num;
        this.price = str5;
        this.high_purchase_price = str6;
        this.quick_price = str7;
        this.rarity_color = str8;
        this.stickers = list;
        this.trade_info = tradeInfoObj;
        this.flags = list2;
        this.time_left = str9;
        this.sku_id = str10;
        this.spu_id = str11;
        this.checked = z10;
        this.spu = str12;
        this.local_quick_price = itemQuickPriceObj;
        this.put_on_price = str13;
        this.buy_state = str14;
        this.sell_desc = str15;
        this.order_id = str16;
        this.state = str17;
        this.state_desc = str18;
        this.state_desc_color = str19;
        this.trade_url = str20;
        this.merged_info = tradeSteamInventoryGroup;
        this.delta = str21;
        this.desc_tags = arrayList;
        this.amount = str22;
        this.create_time = str23;
        this.bargain_state = stateObj;
        this.btn_desc = str24;
    }

    public /* synthetic */ TradeSteamInventoryObj(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, List list, TradeInfoObj tradeInfoObj, List list2, String str9, String str10, String str11, boolean z10, String str12, ItemQuickPriceObj itemQuickPriceObj, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, TradeSteamInventoryGroup tradeSteamInventoryGroup, String str21, ArrayList arrayList, String str22, String str23, StateObj stateObj, String str24, int i10, int i11, u uVar) {
        this(str, str2, str3, str4, num, str5, str6, str7, str8, list, tradeInfoObj, list2, str9, str10, str11, (i10 & 32768) != 0 ? false : z10, str12, itemQuickPriceObj, str13, str14, str15, str16, str17, str18, str19, str20, tradeSteamInventoryGroup, str21, arrayList, str22, str23, stateObj, str24);
    }

    public static /* synthetic */ TradeSteamInventoryObj copy$default(TradeSteamInventoryObj tradeSteamInventoryObj, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, List list, TradeInfoObj tradeInfoObj, List list2, String str9, String str10, String str11, boolean z10, String str12, ItemQuickPriceObj itemQuickPriceObj, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, TradeSteamInventoryGroup tradeSteamInventoryGroup, String str21, ArrayList arrayList, String str22, String str23, StateObj stateObj, String str24, int i10, int i11, Object obj) {
        Object[] objArr = {tradeSteamInventoryObj, str, str2, str3, str4, num, str5, str6, str7, str8, list, tradeInfoObj, list2, str9, str10, str11, new Byte(z10 ? (byte) 1 : (byte) 0), str12, itemQuickPriceObj, str13, str14, str15, str16, str17, str18, str19, str20, tradeSteamInventoryGroup, str21, arrayList, str22, str23, stateObj, str24, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 16184, new Class[]{TradeSteamInventoryObj.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, List.class, TradeInfoObj.class, List.class, String.class, String.class, String.class, Boolean.TYPE, String.class, ItemQuickPriceObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, TradeSteamInventoryGroup.class, String.class, ArrayList.class, String.class, String.class, StateObj.class, String.class, cls, cls, Object.class}, TradeSteamInventoryObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TradeSteamInventoryObj) patchProxyResultProxy.result;
        }
        return tradeSteamInventoryObj.copy((i10 & 1) != 0 ? tradeSteamInventoryObj.market_hash_name : str, (i10 & 2) != 0 ? tradeSteamInventoryObj.name : str2, (i10 & 4) != 0 ? tradeSteamInventoryObj.img_url : str3, (i10 & 8) != 0 ? tradeSteamInventoryObj.float_value : str4, (i10 & 16) != 0 ? tradeSteamInventoryObj.special : num, (i10 & 32) != 0 ? tradeSteamInventoryObj.price : str5, (i10 & 64) != 0 ? tradeSteamInventoryObj.high_purchase_price : str6, (i10 & 128) != 0 ? tradeSteamInventoryObj.quick_price : str7, (i10 & 256) != 0 ? tradeSteamInventoryObj.rarity_color : str8, (i10 & 512) != 0 ? tradeSteamInventoryObj.stickers : list, (i10 & 1024) != 0 ? tradeSteamInventoryObj.trade_info : tradeInfoObj, (i10 & 2048) != 0 ? tradeSteamInventoryObj.flags : list2, (i10 & 4096) != 0 ? tradeSteamInventoryObj.time_left : str9, (i10 & 8192) != 0 ? tradeSteamInventoryObj.sku_id : str10, (i10 & 16384) != 0 ? tradeSteamInventoryObj.spu_id : str11, (i10 & 32768) != 0 ? tradeSteamInventoryObj.checked : z10 ? 1 : 0, (i10 & 65536) != 0 ? tradeSteamInventoryObj.spu : str12, (i10 & 131072) != 0 ? tradeSteamInventoryObj.local_quick_price : itemQuickPriceObj, (i10 & 262144) != 0 ? tradeSteamInventoryObj.put_on_price : str13, (i10 & 524288) != 0 ? tradeSteamInventoryObj.buy_state : str14, (i10 & 1048576) != 0 ? tradeSteamInventoryObj.sell_desc : str15, (i10 & 2097152) != 0 ? tradeSteamInventoryObj.order_id : str16, (i10 & 4194304) != 0 ? tradeSteamInventoryObj.state : str17, (i10 & 8388608) != 0 ? tradeSteamInventoryObj.state_desc : str18, (i10 & 16777216) != 0 ? tradeSteamInventoryObj.state_desc_color : str19, (i10 & 33554432) != 0 ? tradeSteamInventoryObj.trade_url : str20, (i10 & 67108864) != 0 ? tradeSteamInventoryObj.merged_info : tradeSteamInventoryGroup, (i10 & 134217728) != 0 ? tradeSteamInventoryObj.delta : str21, (i10 & 268435456) != 0 ? tradeSteamInventoryObj.desc_tags : arrayList, (i10 & 536870912) != 0 ? tradeSteamInventoryObj.amount : str22, (i10 & 1073741824) != 0 ? tradeSteamInventoryObj.create_time : str23, (i10 & Integer.MIN_VALUE) != 0 ? tradeSteamInventoryObj.bargain_state : stateObj, (i11 & 1) != 0 ? tradeSteamInventoryObj.btn_desc : str24);
    }

    @e
    public final String component1() {
        return this.market_hash_name;
    }

    @e
    public final List<ItemStickerObj> component10() {
        return this.stickers;
    }

    @e
    public final TradeInfoObj component11() {
        return this.trade_info;
    }

    @e
    public final List<TradeItemFlagObj> component12() {
        return this.flags;
    }

    @e
    public final String component13() {
        return this.time_left;
    }

    @e
    public final String component14() {
        return this.sku_id;
    }

    @e
    public final String component15() {
        return this.spu_id;
    }

    public final boolean component16() {
        return this.checked;
    }

    @e
    public final String component17() {
        return this.spu;
    }

    @e
    public final ItemQuickPriceObj component18() {
        return this.local_quick_price;
    }

    @e
    public final String component19() {
        return this.put_on_price;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component20() {
        return this.buy_state;
    }

    @e
    public final String component21() {
        return this.sell_desc;
    }

    @e
    public final String component22() {
        return this.order_id;
    }

    @e
    public final String component23() {
        return this.state;
    }

    @e
    public final String component24() {
        return this.state_desc;
    }

    @e
    public final String component25() {
        return this.state_desc_color;
    }

    @e
    public final String component26() {
        return this.trade_url;
    }

    @e
    public final TradeSteamInventoryGroup component27() {
        return this.merged_info;
    }

    @e
    public final String component28() {
        return this.delta;
    }

    @e
    public final ArrayList<TradeItemTag> component29() {
        return this.desc_tags;
    }

    @e
    public final String component3() {
        return this.img_url;
    }

    @e
    public final String component30() {
        return this.amount;
    }

    @e
    public final String component31() {
        return this.create_time;
    }

    @e
    public final StateObj component32() {
        return this.bargain_state;
    }

    @e
    public final String component33() {
        return this.btn_desc;
    }

    @e
    public final String component4() {
        return this.float_value;
    }

    @e
    public final Integer component5() {
        return this.special;
    }

    @e
    public final String component6() {
        return this.price;
    }

    @e
    public final String component7() {
        return this.high_purchase_price;
    }

    @e
    public final String component8() {
        return this.quick_price;
    }

    @e
    public final String component9() {
        return this.rarity_color;
    }

    @d
    public final TradeSteamInventoryObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e Integer num, @e String str5, @e String str6, @e String str7, @e String str8, @e List<ItemStickerObj> list, @e TradeInfoObj tradeInfoObj, @e List<TradeItemFlagObj> list2, @e String str9, @e String str10, @e String str11, boolean z10, @e String str12, @e ItemQuickPriceObj itemQuickPriceObj, @e String str13, @e String str14, @e String str15, @e String str16, @e String str17, @e String str18, @e String str19, @e String str20, @e TradeSteamInventoryGroup tradeSteamInventoryGroup, @e String str21, @e ArrayList<TradeItemTag> arrayList, @e String str22, @e String str23, @e StateObj stateObj, @e String str24) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, num, str5, str6, str7, str8, list, tradeInfoObj, list2, str9, str10, str11, new Byte(z10 ? (byte) 1 : (byte) 0), str12, itemQuickPriceObj, str13, str14, str15, str16, str17, str18, str19, str20, tradeSteamInventoryGroup, str21, arrayList, str22, str23, stateObj, str24}, this, changeQuickRedirect, false, 16183, new Class[]{String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, List.class, TradeInfoObj.class, List.class, String.class, String.class, String.class, Boolean.TYPE, String.class, ItemQuickPriceObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, TradeSteamInventoryGroup.class, String.class, ArrayList.class, String.class, String.class, StateObj.class, String.class}, TradeSteamInventoryObj.class);
        return patchProxyResultProxy.isSupported ? (TradeSteamInventoryObj) patchProxyResultProxy.result : new TradeSteamInventoryObj(str, str2, str3, str4, num, str5, str6, str7, str8, list, tradeInfoObj, list2, str9, str10, str11, z10, str12, itemQuickPriceObj, str13, str14, str15, str16, str17, str18, str19, str20, tradeSteamInventoryGroup, str21, arrayList, str22, str23, stateObj, str24);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16182, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(TradeSteamInventoryObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj");
        return f0.g(this.sku_id, ((TradeSteamInventoryObj) obj).sku_id);
    }

    @e
    public final String getAmount() {
        return this.amount;
    }

    @e
    public final StateObj getBargain_state() {
        return this.bargain_state;
    }

    @e
    public final String getBtn_desc() {
        return this.btn_desc;
    }

    @e
    public final String getBuy_state() {
        return this.buy_state;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @e
    public final String getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getDelta() {
        return this.delta;
    }

    @e
    public final ArrayList<TradeItemTag> getDesc_tags() {
        return this.desc_tags;
    }

    @e
    public final List<TradeItemFlagObj> getFlags() {
        return this.flags;
    }

    @e
    public final String getFloat_value() {
        return this.float_value;
    }

    @e
    public final String getHigh_purchase_price() {
        return this.high_purchase_price;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    @e
    public final ItemQuickPriceObj getLocal_quick_price() {
        return this.local_quick_price;
    }

    @e
    public final String getMarket_hash_name() {
        return this.market_hash_name;
    }

    @e
    public final TradeSteamInventoryGroup getMerged_info() {
        return this.merged_info;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getOrder_id() {
        return this.order_id;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getPut_on_price() {
        return this.put_on_price;
    }

    @e
    public final String getQuick_price() {
        return this.quick_price;
    }

    @e
    public final String getRarity_color() {
        return this.rarity_color;
    }

    @e
    public final String getSell_desc() {
        return this.sell_desc;
    }

    @e
    public final String getSku_id() {
        return this.sku_id;
    }

    @e
    public final Integer getSpecial() {
        return this.special;
    }

    @e
    public final String getSpu() {
        return this.spu;
    }

    @e
    public final String getSpu_id() {
        return this.spu_id;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getState_desc() {
        return this.state_desc;
    }

    @e
    public final String getState_desc_color() {
        return this.state_desc_color;
    }

    @e
    public final List<ItemStickerObj> getStickers() {
        return this.stickers;
    }

    @e
    public final String getTime_left() {
        return this.time_left;
    }

    @e
    public final TradeInfoObj getTrade_info() {
        return this.trade_info;
    }

    @e
    public final String getTrade_url() {
        return this.trade_url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16186, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.market_hash_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.float_value;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.special;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.price;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.high_purchase_price;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.quick_price;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.rarity_color;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<ItemStickerObj> list = this.stickers;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        TradeInfoObj tradeInfoObj = this.trade_info;
        int iHashCode11 = (iHashCode10 + (tradeInfoObj == null ? 0 : tradeInfoObj.hashCode())) * 31;
        List<TradeItemFlagObj> list2 = this.flags;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str9 = this.time_left;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sku_id;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.spu_id;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        boolean z10 = this.checked;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode15 + r10) * 31;
        String str12 = this.spu;
        int iHashCode16 = (i10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        ItemQuickPriceObj itemQuickPriceObj = this.local_quick_price;
        int iHashCode17 = (iHashCode16 + (itemQuickPriceObj == null ? 0 : itemQuickPriceObj.hashCode())) * 31;
        String str13 = this.put_on_price;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.buy_state;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sell_desc;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.order_id;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.state;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.state_desc;
        int iHashCode23 = (iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.state_desc_color;
        int iHashCode24 = (iHashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.trade_url;
        int iHashCode25 = (iHashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        TradeSteamInventoryGroup tradeSteamInventoryGroup = this.merged_info;
        int iHashCode26 = (iHashCode25 + (tradeSteamInventoryGroup == null ? 0 : tradeSteamInventoryGroup.hashCode())) * 31;
        String str21 = this.delta;
        int iHashCode27 = (iHashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        ArrayList<TradeItemTag> arrayList = this.desc_tags;
        int iHashCode28 = (iHashCode27 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str22 = this.amount;
        int iHashCode29 = (iHashCode28 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.create_time;
        int iHashCode30 = (iHashCode29 + (str23 == null ? 0 : str23.hashCode())) * 31;
        StateObj stateObj = this.bargain_state;
        int iHashCode31 = (iHashCode30 + (stateObj == null ? 0 : stateObj.hashCode())) * 31;
        String str24 = this.btn_desc;
        return iHashCode31 + (str24 != null ? str24.hashCode() : 0);
    }

    public final void setAmount(@e String str) {
        this.amount = str;
    }

    public final void setBargain_state(@e StateObj stateObj) {
        this.bargain_state = stateObj;
    }

    public final void setBtn_desc(@e String str) {
        this.btn_desc = str;
    }

    public final void setBuy_state(@e String str) {
        this.buy_state = str;
    }

    public final void setChecked(boolean z10) {
        this.checked = z10;
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setDelta(@e String str) {
        this.delta = str;
    }

    public final void setDesc_tags(@e ArrayList<TradeItemTag> arrayList) {
        this.desc_tags = arrayList;
    }

    public final void setFlags(@e List<TradeItemFlagObj> list) {
        this.flags = list;
    }

    public final void setFloat_value(@e String str) {
        this.float_value = str;
    }

    public final void setHigh_purchase_price(@e String str) {
        this.high_purchase_price = str;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setLocal_quick_price(@e ItemQuickPriceObj itemQuickPriceObj) {
        this.local_quick_price = itemQuickPriceObj;
    }

    public final void setMarket_hash_name(@e String str) {
        this.market_hash_name = str;
    }

    public final void setMerged_info(@e TradeSteamInventoryGroup tradeSteamInventoryGroup) {
        this.merged_info = tradeSteamInventoryGroup;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setOrder_id(@e String str) {
        this.order_id = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setPut_on_price(@e String str) {
        this.put_on_price = str;
    }

    public final void setQuick_price(@e String str) {
        this.quick_price = str;
    }

    public final void setRarity_color(@e String str) {
        this.rarity_color = str;
    }

    public final void setSell_desc(@e String str) {
        this.sell_desc = str;
    }

    public final void setSku_id(@e String str) {
        this.sku_id = str;
    }

    public final void setSpecial(@e Integer num) {
        this.special = num;
    }

    public final void setSpu(@e String str) {
        this.spu = str;
    }

    public final void setSpu_id(@e String str) {
        this.spu_id = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setState_desc(@e String str) {
        this.state_desc = str;
    }

    public final void setState_desc_color(@e String str) {
        this.state_desc_color = str;
    }

    public final void setStickers(@e List<ItemStickerObj> list) {
        this.stickers = list;
    }

    public final void setTime_left(@e String str) {
        this.time_left = str;
    }

    public final void setTrade_info(@e TradeInfoObj tradeInfoObj) {
        this.trade_info = tradeInfoObj;
    }

    public final void setTrade_url(@e String str) {
        this.trade_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16185, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TradeSteamInventoryObj(market_hash_name=" + this.market_hash_name + ", name=" + this.name + ", img_url=" + this.img_url + ", float_value=" + this.float_value + ", special=" + this.special + ", price=" + this.price + ", high_purchase_price=" + this.high_purchase_price + ", quick_price=" + this.quick_price + ", rarity_color=" + this.rarity_color + ", stickers=" + this.stickers + ", trade_info=" + this.trade_info + ", flags=" + this.flags + ", time_left=" + this.time_left + ", sku_id=" + this.sku_id + ", spu_id=" + this.spu_id + ", checked=" + this.checked + ", spu=" + this.spu + ", local_quick_price=" + this.local_quick_price + ", put_on_price=" + this.put_on_price + ", buy_state=" + this.buy_state + ", sell_desc=" + this.sell_desc + ", order_id=" + this.order_id + ", state=" + this.state + ", state_desc=" + this.state_desc + ", state_desc_color=" + this.state_desc_color + ", trade_url=" + this.trade_url + ", merged_info=" + this.merged_info + ", delta=" + this.delta + ", desc_tags=" + this.desc_tags + ", amount=" + this.amount + ", create_time=" + this.create_time + ", bargain_state=" + this.bargain_state + ", btn_desc=" + this.btn_desc + ')';
    }
}
