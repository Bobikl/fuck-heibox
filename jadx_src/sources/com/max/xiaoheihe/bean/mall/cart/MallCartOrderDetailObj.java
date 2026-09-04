package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.hbwallet.bean.MallOrderStackCouponObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.mall.MallOrderActionXObj;
import com.max.xiaoheihe.bean.mall.MallOrderBottomBtnObj;
import com.max.xiaoheihe.bean.mall.MallPayExtraInfo;
import com.max.xiaoheihe.bean.mall.MallPayPurchaseParams;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MoreOptionBtnsObj;
import com.max.xiaoheihe.bean.mall.OrderDetailActivityObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallCartOrderDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String active_type;

    @e
    private List<OrderDetailActivityObj> activity_list;

    @e
    private AddressInfoObj address;

    @e
    private String agreement_title;

    @e
    private String agreement_url;

    @e
    private Boolean allow_show;

    @e
    private String available_coupon_count;

    @e
    private String available_coupon_max_deduce;

    @e
    private MallOrderBottomBtnObj bottom_button;

    @e
    private SuggestDiscountInfo choose_discount_info;

    @e
    private List<CardObj> cm_cards;

    @e
    private List<CardObjV2> cm_cards_v2;

    @e
    private String coupon_center_protocol;

    @e
    private String coupon_count;

    @e
    private String current_price;

    @e
    private MallPriceObj discount_params_v2;

    @e
    private List<MallProductActionObj> display_items;

    @e
    private String enable_deduct;

    @e
    private MallOrderGroupInfo grouping_info;

    @e
    private String h_src;

    @e
    private Boolean hide_price_detail;
    private int max_deduct_coin;

    @e
    private List<MoreOptionBtnsObj> more_option_btns;

    @e
    private String msg;

    @e
    private Integer[][] msg_hl;

    @e
    private String need_choose_address;

    @e
    private MallOrderNotifyObj notify_message;

    @e
    private List<? extends KeyDescObj> order_award;

    @d
    private MallCartOrderInfoObj order_info;

    @d
    private List<CartGroupObj> order_items;

    @e
    private String order_type;

    @e
    private MallPayExtraInfo pay_info;

    @e
    private String pay_price;

    @e
    private List<PayTypeInfoObj> payment_list;

    @d
    private String product_state;

    @e
    private MallPayPurchaseParams purchase_params;

    @e
    private String service_agreement;

    @e
    private ShareInfoObj share_info;

    @e
    private String stack_coupon_count;

    @e
    private MallOrderStackCouponObj stack_coupons;

    @e
    private String title;

    @e
    private MallOrderActionXObj top_button;

    @e
    private String total_coin;

    @e
    private String total_hbalance;

    public MallCartOrderDetailObj(@e String str, @e MallPayExtraInfo mallPayExtraInfo, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e MallOrderNotifyObj mallOrderNotifyObj, @e String str8, @d String product_state, @e String str9, @e String str10, @e MallOrderStackCouponObj mallOrderStackCouponObj, @e String str11, @e String str12, @e String str13, @e String str14, @e MallPriceObj mallPriceObj, @e String str15, @e String str16, @e String str17, int i10, @d MallCartOrderInfoObj order_info, @e List<CardObj> list, @e List<CardObjV2> list2, @e AddressInfoObj addressInfoObj, @e String str18, @e MallOrderBottomBtnObj mallOrderBottomBtnObj, @e MallOrderActionXObj mallOrderActionXObj, @e ShareInfoObj shareInfoObj, @d List<CartGroupObj> order_items, @e List<MallProductActionObj> list3, @e List<MoreOptionBtnsObj> list4, @e List<PayTypeInfoObj> list5, @e MallPayPurchaseParams mallPayPurchaseParams, @e List<OrderDetailActivityObj> list6, @e SuggestDiscountInfo suggestDiscountInfo, @e List<? extends KeyDescObj> list7, @e Integer[][] numArr, @e String str19, @e Boolean bool, @e Boolean bool2, @e MallOrderGroupInfo mallOrderGroupInfo) {
        f0.p(product_state, "product_state");
        f0.p(order_info, "order_info");
        f0.p(order_items, "order_items");
        this.h_src = str;
        this.pay_info = mallPayExtraInfo;
        this.total_hbalance = str2;
        this.current_price = str3;
        this.pay_price = str4;
        this.service_agreement = str5;
        this.agreement_title = str6;
        this.agreement_url = str7;
        this.notify_message = mallOrderNotifyObj;
        this.order_type = str8;
        this.product_state = product_state;
        this.coupon_count = str9;
        this.stack_coupon_count = str10;
        this.stack_coupons = mallOrderStackCouponObj;
        this.available_coupon_count = str11;
        this.available_coupon_max_deduce = str12;
        this.coupon_center_protocol = str13;
        this.enable_deduct = str14;
        this.discount_params_v2 = mallPriceObj;
        this.total_coin = str15;
        this.title = str16;
        this.msg = str17;
        this.max_deduct_coin = i10;
        this.order_info = order_info;
        this.cm_cards = list;
        this.cm_cards_v2 = list2;
        this.address = addressInfoObj;
        this.need_choose_address = str18;
        this.bottom_button = mallOrderBottomBtnObj;
        this.top_button = mallOrderActionXObj;
        this.share_info = shareInfoObj;
        this.order_items = order_items;
        this.display_items = list3;
        this.more_option_btns = list4;
        this.payment_list = list5;
        this.purchase_params = mallPayPurchaseParams;
        this.activity_list = list6;
        this.choose_discount_info = suggestDiscountInfo;
        this.order_award = list7;
        this.msg_hl = numArr;
        this.active_type = str19;
        this.allow_show = bool;
        this.hide_price_detail = bool2;
        this.grouping_info = mallOrderGroupInfo;
    }

    public /* synthetic */ MallCartOrderDetailObj(String str, MallPayExtraInfo mallPayExtraInfo, String str2, String str3, String str4, String str5, String str6, String str7, MallOrderNotifyObj mallOrderNotifyObj, String str8, String str9, String str10, String str11, MallOrderStackCouponObj mallOrderStackCouponObj, String str12, String str13, String str14, String str15, MallPriceObj mallPriceObj, String str16, String str17, String str18, int i10, MallCartOrderInfoObj mallCartOrderInfoObj, List list, List list2, AddressInfoObj addressInfoObj, String str19, MallOrderBottomBtnObj mallOrderBottomBtnObj, MallOrderActionXObj mallOrderActionXObj, ShareInfoObj shareInfoObj, List list3, List list4, List list5, List list6, MallPayPurchaseParams mallPayPurchaseParams, List list7, SuggestDiscountInfo suggestDiscountInfo, List list8, Integer[][] numArr, String str20, Boolean bool, Boolean bool2, MallOrderGroupInfo mallOrderGroupInfo, int i11, int i12, u uVar) {
        this(str, mallPayExtraInfo, str2, str3, str4, str5, str6, str7, mallOrderNotifyObj, str8, str9, str10, str11, mallOrderStackCouponObj, str12, str13, str14, str15, mallPriceObj, str16, str17, str18, (i11 & 4194304) != 0 ? 0 : i10, mallCartOrderInfoObj, list, list2, addressInfoObj, str19, mallOrderBottomBtnObj, mallOrderActionXObj, shareInfoObj, list3, list4, list5, list6, (i12 & 8) != 0 ? null : mallPayPurchaseParams, list7, suggestDiscountInfo, list8, numArr, str20, bool, bool2, mallOrderGroupInfo);
    }

    public static /* synthetic */ MallCartOrderDetailObj copy$default(MallCartOrderDetailObj mallCartOrderDetailObj, String str, MallPayExtraInfo mallPayExtraInfo, String str2, String str3, String str4, String str5, String str6, String str7, MallOrderNotifyObj mallOrderNotifyObj, String str8, String str9, String str10, String str11, MallOrderStackCouponObj mallOrderStackCouponObj, String str12, String str13, String str14, String str15, MallPriceObj mallPriceObj, String str16, String str17, String str18, int i10, MallCartOrderInfoObj mallCartOrderInfoObj, List list, List list2, AddressInfoObj addressInfoObj, String str19, MallOrderBottomBtnObj mallOrderBottomBtnObj, MallOrderActionXObj mallOrderActionXObj, ShareInfoObj shareInfoObj, List list3, List list4, List list5, List list6, MallPayPurchaseParams mallPayPurchaseParams, List list7, SuggestDiscountInfo suggestDiscountInfo, List list8, Integer[][] numArr, String str20, Boolean bool, Boolean bool2, MallOrderGroupInfo mallOrderGroupInfo, int i11, int i12, Object obj) {
        Object[] objArr = {mallCartOrderDetailObj, str, mallPayExtraInfo, str2, str3, str4, str5, str6, str7, mallOrderNotifyObj, str8, str9, str10, str11, mallOrderStackCouponObj, str12, str13, str14, str15, mallPriceObj, str16, str17, str18, new Integer(i10), mallCartOrderInfoObj, list, list2, addressInfoObj, str19, mallOrderBottomBtnObj, mallOrderActionXObj, shareInfoObj, list3, list4, list5, list6, mallPayPurchaseParams, list7, suggestDiscountInfo, list8, numArr, str20, bool, bool2, mallOrderGroupInfo, new Integer(i11), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15592, new Class[]{MallCartOrderDetailObj.class, String.class, MallPayExtraInfo.class, String.class, String.class, String.class, String.class, String.class, String.class, MallOrderNotifyObj.class, String.class, String.class, String.class, String.class, MallOrderStackCouponObj.class, String.class, String.class, String.class, String.class, MallPriceObj.class, String.class, String.class, String.class, cls, MallCartOrderInfoObj.class, List.class, List.class, AddressInfoObj.class, String.class, MallOrderBottomBtnObj.class, MallOrderActionXObj.class, ShareInfoObj.class, List.class, List.class, List.class, List.class, MallPayPurchaseParams.class, List.class, SuggestDiscountInfo.class, List.class, Integer[][].class, String.class, Boolean.class, Boolean.class, MallOrderGroupInfo.class, cls, cls, Object.class}, MallCartOrderDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallCartOrderDetailObj) patchProxyResultProxy.result;
        }
        return mallCartOrderDetailObj.copy((i11 & 1) != 0 ? mallCartOrderDetailObj.h_src : str, (i11 & 2) != 0 ? mallCartOrderDetailObj.pay_info : mallPayExtraInfo, (i11 & 4) != 0 ? mallCartOrderDetailObj.total_hbalance : str2, (i11 & 8) != 0 ? mallCartOrderDetailObj.current_price : str3, (i11 & 16) != 0 ? mallCartOrderDetailObj.pay_price : str4, (i11 & 32) != 0 ? mallCartOrderDetailObj.service_agreement : str5, (i11 & 64) != 0 ? mallCartOrderDetailObj.agreement_title : str6, (i11 & 128) != 0 ? mallCartOrderDetailObj.agreement_url : str7, (i11 & 256) != 0 ? mallCartOrderDetailObj.notify_message : mallOrderNotifyObj, (i11 & 512) != 0 ? mallCartOrderDetailObj.order_type : str8, (i11 & 1024) != 0 ? mallCartOrderDetailObj.product_state : str9, (i11 & 2048) != 0 ? mallCartOrderDetailObj.coupon_count : str10, (i11 & 4096) != 0 ? mallCartOrderDetailObj.stack_coupon_count : str11, (i11 & 8192) != 0 ? mallCartOrderDetailObj.stack_coupons : mallOrderStackCouponObj, (i11 & 16384) != 0 ? mallCartOrderDetailObj.available_coupon_count : str12, (i11 & 32768) != 0 ? mallCartOrderDetailObj.available_coupon_max_deduce : str13, (i11 & 65536) != 0 ? mallCartOrderDetailObj.coupon_center_protocol : str14, (i11 & 131072) != 0 ? mallCartOrderDetailObj.enable_deduct : str15, (i11 & 262144) != 0 ? mallCartOrderDetailObj.discount_params_v2 : mallPriceObj, (i11 & 524288) != 0 ? mallCartOrderDetailObj.total_coin : str16, (i11 & 1048576) != 0 ? mallCartOrderDetailObj.title : str17, (i11 & 2097152) != 0 ? mallCartOrderDetailObj.msg : str18, (i11 & 4194304) != 0 ? mallCartOrderDetailObj.max_deduct_coin : i10, (i11 & 8388608) != 0 ? mallCartOrderDetailObj.order_info : mallCartOrderInfoObj, (i11 & 16777216) != 0 ? mallCartOrderDetailObj.cm_cards : list, (i11 & 33554432) != 0 ? mallCartOrderDetailObj.cm_cards_v2 : list2, (i11 & 67108864) != 0 ? mallCartOrderDetailObj.address : addressInfoObj, (i11 & 134217728) != 0 ? mallCartOrderDetailObj.need_choose_address : str19, (i11 & 268435456) != 0 ? mallCartOrderDetailObj.bottom_button : mallOrderBottomBtnObj, (i11 & 536870912) != 0 ? mallCartOrderDetailObj.top_button : mallOrderActionXObj, (i11 & 1073741824) != 0 ? mallCartOrderDetailObj.share_info : shareInfoObj, (i11 & Integer.MIN_VALUE) != 0 ? mallCartOrderDetailObj.order_items : list3, (i12 & 1) != 0 ? mallCartOrderDetailObj.display_items : list4, (i12 & 2) != 0 ? mallCartOrderDetailObj.more_option_btns : list5, (i12 & 4) != 0 ? mallCartOrderDetailObj.payment_list : list6, (i12 & 8) != 0 ? mallCartOrderDetailObj.purchase_params : mallPayPurchaseParams, (i12 & 16) != 0 ? mallCartOrderDetailObj.activity_list : list7, (i12 & 32) != 0 ? mallCartOrderDetailObj.choose_discount_info : suggestDiscountInfo, (i12 & 64) != 0 ? mallCartOrderDetailObj.order_award : list8, (i12 & 128) != 0 ? mallCartOrderDetailObj.msg_hl : numArr, (i12 & 256) != 0 ? mallCartOrderDetailObj.active_type : str20, (i12 & 512) != 0 ? mallCartOrderDetailObj.allow_show : bool, (i12 & 1024) != 0 ? mallCartOrderDetailObj.hide_price_detail : bool2, (i12 & 2048) != 0 ? mallCartOrderDetailObj.grouping_info : mallOrderGroupInfo);
    }

    @e
    public final String component1() {
        return this.h_src;
    }

    @e
    public final String component10() {
        return this.order_type;
    }

    @d
    public final String component11() {
        return this.product_state;
    }

    @e
    public final String component12() {
        return this.coupon_count;
    }

    @e
    public final String component13() {
        return this.stack_coupon_count;
    }

    @e
    public final MallOrderStackCouponObj component14() {
        return this.stack_coupons;
    }

    @e
    public final String component15() {
        return this.available_coupon_count;
    }

    @e
    public final String component16() {
        return this.available_coupon_max_deduce;
    }

    @e
    public final String component17() {
        return this.coupon_center_protocol;
    }

    @e
    public final String component18() {
        return this.enable_deduct;
    }

    @e
    public final MallPriceObj component19() {
        return this.discount_params_v2;
    }

    @e
    public final MallPayExtraInfo component2() {
        return this.pay_info;
    }

    @e
    public final String component20() {
        return this.total_coin;
    }

    @e
    public final String component21() {
        return this.title;
    }

    @e
    public final String component22() {
        return this.msg;
    }

    public final int component23() {
        return this.max_deduct_coin;
    }

    @d
    public final MallCartOrderInfoObj component24() {
        return this.order_info;
    }

    @e
    public final List<CardObj> component25() {
        return this.cm_cards;
    }

    @e
    public final List<CardObjV2> component26() {
        return this.cm_cards_v2;
    }

    @e
    public final AddressInfoObj component27() {
        return this.address;
    }

    @e
    public final String component28() {
        return this.need_choose_address;
    }

    @e
    public final MallOrderBottomBtnObj component29() {
        return this.bottom_button;
    }

    @e
    public final String component3() {
        return this.total_hbalance;
    }

    @e
    public final MallOrderActionXObj component30() {
        return this.top_button;
    }

    @e
    public final ShareInfoObj component31() {
        return this.share_info;
    }

    @d
    public final List<CartGroupObj> component32() {
        return this.order_items;
    }

    @e
    public final List<MallProductActionObj> component33() {
        return this.display_items;
    }

    @e
    public final List<MoreOptionBtnsObj> component34() {
        return this.more_option_btns;
    }

    @e
    public final List<PayTypeInfoObj> component35() {
        return this.payment_list;
    }

    @e
    public final MallPayPurchaseParams component36() {
        return this.purchase_params;
    }

    @e
    public final List<OrderDetailActivityObj> component37() {
        return this.activity_list;
    }

    @e
    public final SuggestDiscountInfo component38() {
        return this.choose_discount_info;
    }

    @e
    public final List<KeyDescObj> component39() {
        return this.order_award;
    }

    @e
    public final String component4() {
        return this.current_price;
    }

    @e
    public final Integer[][] component40() {
        return this.msg_hl;
    }

    @e
    public final String component41() {
        return this.active_type;
    }

    @e
    public final Boolean component42() {
        return this.allow_show;
    }

    @e
    public final Boolean component43() {
        return this.hide_price_detail;
    }

    @e
    public final MallOrderGroupInfo component44() {
        return this.grouping_info;
    }

    @e
    public final String component5() {
        return this.pay_price;
    }

    @e
    public final String component6() {
        return this.service_agreement;
    }

    @e
    public final String component7() {
        return this.agreement_title;
    }

    @e
    public final String component8() {
        return this.agreement_url;
    }

    @e
    public final MallOrderNotifyObj component9() {
        return this.notify_message;
    }

    @d
    public final MallCartOrderDetailObj copy(@e String str, @e MallPayExtraInfo mallPayExtraInfo, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e MallOrderNotifyObj mallOrderNotifyObj, @e String str8, @d String product_state, @e String str9, @e String str10, @e MallOrderStackCouponObj mallOrderStackCouponObj, @e String str11, @e String str12, @e String str13, @e String str14, @e MallPriceObj mallPriceObj, @e String str15, @e String str16, @e String str17, int i10, @d MallCartOrderInfoObj order_info, @e List<CardObj> list, @e List<CardObjV2> list2, @e AddressInfoObj addressInfoObj, @e String str18, @e MallOrderBottomBtnObj mallOrderBottomBtnObj, @e MallOrderActionXObj mallOrderActionXObj, @e ShareInfoObj shareInfoObj, @d List<CartGroupObj> order_items, @e List<MallProductActionObj> list3, @e List<MoreOptionBtnsObj> list4, @e List<PayTypeInfoObj> list5, @e MallPayPurchaseParams mallPayPurchaseParams, @e List<OrderDetailActivityObj> list6, @e SuggestDiscountInfo suggestDiscountInfo, @e List<? extends KeyDescObj> list7, @e Integer[][] numArr, @e String str19, @e Boolean bool, @e Boolean bool2, @e MallOrderGroupInfo mallOrderGroupInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, mallPayExtraInfo, str2, str3, str4, str5, str6, str7, mallOrderNotifyObj, str8, product_state, str9, str10, mallOrderStackCouponObj, str11, str12, str13, str14, mallPriceObj, str15, str16, str17, new Integer(i10), order_info, list, list2, addressInfoObj, str18, mallOrderBottomBtnObj, mallOrderActionXObj, shareInfoObj, order_items, list3, list4, list5, mallPayPurchaseParams, list6, suggestDiscountInfo, list7, numArr, str19, bool, bool2, mallOrderGroupInfo}, this, changeQuickRedirect, false, 15591, new Class[]{String.class, MallPayExtraInfo.class, String.class, String.class, String.class, String.class, String.class, String.class, MallOrderNotifyObj.class, String.class, String.class, String.class, String.class, MallOrderStackCouponObj.class, String.class, String.class, String.class, String.class, MallPriceObj.class, String.class, String.class, String.class, Integer.TYPE, MallCartOrderInfoObj.class, List.class, List.class, AddressInfoObj.class, String.class, MallOrderBottomBtnObj.class, MallOrderActionXObj.class, ShareInfoObj.class, List.class, List.class, List.class, List.class, MallPayPurchaseParams.class, List.class, SuggestDiscountInfo.class, List.class, Integer[][].class, String.class, Boolean.class, Boolean.class, MallOrderGroupInfo.class}, MallCartOrderDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallCartOrderDetailObj) patchProxyResultProxy.result;
        }
        f0.p(product_state, "product_state");
        f0.p(order_info, "order_info");
        f0.p(order_items, "order_items");
        return new MallCartOrderDetailObj(str, mallPayExtraInfo, str2, str3, str4, str5, str6, str7, mallOrderNotifyObj, str8, product_state, str9, str10, mallOrderStackCouponObj, str11, str12, str13, str14, mallPriceObj, str15, str16, str17, i10, order_info, list, list2, addressInfoObj, str18, mallOrderBottomBtnObj, mallOrderActionXObj, shareInfoObj, order_items, list3, list4, list5, mallPayPurchaseParams, list6, suggestDiscountInfo, list7, numArr, str19, bool, bool2, mallOrderGroupInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15595, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallCartOrderDetailObj)) {
            return false;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = (MallCartOrderDetailObj) obj;
        return f0.g(this.h_src, mallCartOrderDetailObj.h_src) && f0.g(this.pay_info, mallCartOrderDetailObj.pay_info) && f0.g(this.total_hbalance, mallCartOrderDetailObj.total_hbalance) && f0.g(this.current_price, mallCartOrderDetailObj.current_price) && f0.g(this.pay_price, mallCartOrderDetailObj.pay_price) && f0.g(this.service_agreement, mallCartOrderDetailObj.service_agreement) && f0.g(this.agreement_title, mallCartOrderDetailObj.agreement_title) && f0.g(this.agreement_url, mallCartOrderDetailObj.agreement_url) && f0.g(this.notify_message, mallCartOrderDetailObj.notify_message) && f0.g(this.order_type, mallCartOrderDetailObj.order_type) && f0.g(this.product_state, mallCartOrderDetailObj.product_state) && f0.g(this.coupon_count, mallCartOrderDetailObj.coupon_count) && f0.g(this.stack_coupon_count, mallCartOrderDetailObj.stack_coupon_count) && f0.g(this.stack_coupons, mallCartOrderDetailObj.stack_coupons) && f0.g(this.available_coupon_count, mallCartOrderDetailObj.available_coupon_count) && f0.g(this.available_coupon_max_deduce, mallCartOrderDetailObj.available_coupon_max_deduce) && f0.g(this.coupon_center_protocol, mallCartOrderDetailObj.coupon_center_protocol) && f0.g(this.enable_deduct, mallCartOrderDetailObj.enable_deduct) && f0.g(this.discount_params_v2, mallCartOrderDetailObj.discount_params_v2) && f0.g(this.total_coin, mallCartOrderDetailObj.total_coin) && f0.g(this.title, mallCartOrderDetailObj.title) && f0.g(this.msg, mallCartOrderDetailObj.msg) && this.max_deduct_coin == mallCartOrderDetailObj.max_deduct_coin && f0.g(this.order_info, mallCartOrderDetailObj.order_info) && f0.g(this.cm_cards, mallCartOrderDetailObj.cm_cards) && f0.g(this.cm_cards_v2, mallCartOrderDetailObj.cm_cards_v2) && f0.g(this.address, mallCartOrderDetailObj.address) && f0.g(this.need_choose_address, mallCartOrderDetailObj.need_choose_address) && f0.g(this.bottom_button, mallCartOrderDetailObj.bottom_button) && f0.g(this.top_button, mallCartOrderDetailObj.top_button) && f0.g(this.share_info, mallCartOrderDetailObj.share_info) && f0.g(this.order_items, mallCartOrderDetailObj.order_items) && f0.g(this.display_items, mallCartOrderDetailObj.display_items) && f0.g(this.more_option_btns, mallCartOrderDetailObj.more_option_btns) && f0.g(this.payment_list, mallCartOrderDetailObj.payment_list) && f0.g(this.purchase_params, mallCartOrderDetailObj.purchase_params) && f0.g(this.activity_list, mallCartOrderDetailObj.activity_list) && f0.g(this.choose_discount_info, mallCartOrderDetailObj.choose_discount_info) && f0.g(this.order_award, mallCartOrderDetailObj.order_award) && f0.g(this.msg_hl, mallCartOrderDetailObj.msg_hl) && f0.g(this.active_type, mallCartOrderDetailObj.active_type) && f0.g(this.allow_show, mallCartOrderDetailObj.allow_show) && f0.g(this.hide_price_detail, mallCartOrderDetailObj.hide_price_detail) && f0.g(this.grouping_info, mallCartOrderDetailObj.grouping_info);
    }

    @e
    public final String getActive_type() {
        return this.active_type;
    }

    @e
    public final List<OrderDetailActivityObj> getActivity_list() {
        return this.activity_list;
    }

    @e
    public final AddressInfoObj getAddress() {
        return this.address;
    }

    @e
    public final String getAgreement_title() {
        return this.agreement_title;
    }

    @e
    public final String getAgreement_url() {
        return this.agreement_url;
    }

    @e
    public final Boolean getAllow_show() {
        return this.allow_show;
    }

    @e
    public final String getAvailable_coupon_count() {
        return this.available_coupon_count;
    }

    @e
    public final String getAvailable_coupon_max_deduce() {
        return this.available_coupon_max_deduce;
    }

    @e
    public final MallOrderBottomBtnObj getBottom_button() {
        return this.bottom_button;
    }

    @e
    public final SuggestDiscountInfo getChoose_discount_info() {
        return this.choose_discount_info;
    }

    @e
    public final List<CardObj> getCm_cards() {
        return this.cm_cards;
    }

    @e
    public final List<CardObjV2> getCm_cards_v2() {
        return this.cm_cards_v2;
    }

    @e
    public final String getCoupon_center_protocol() {
        return this.coupon_center_protocol;
    }

    @e
    public final String getCoupon_count() {
        return this.coupon_count;
    }

    @e
    public final String getCurrent_price() {
        return this.current_price;
    }

    @e
    public final MallPriceObj getDiscount_params_v2() {
        return this.discount_params_v2;
    }

    @e
    public final List<MallProductActionObj> getDisplay_items() {
        return this.display_items;
    }

    @e
    public final String getEnable_deduct() {
        return this.enable_deduct;
    }

    @e
    public final MallOrderGroupInfo getGrouping_info() {
        return this.grouping_info;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final Boolean getHide_price_detail() {
        return this.hide_price_detail;
    }

    public final int getMax_deduct_coin() {
        return this.max_deduct_coin;
    }

    @e
    public final List<MoreOptionBtnsObj> getMore_option_btns() {
        return this.more_option_btns;
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final Integer[][] getMsg_hl() {
        return this.msg_hl;
    }

    @e
    public final String getNeed_choose_address() {
        return this.need_choose_address;
    }

    @e
    public final MallOrderNotifyObj getNotify_message() {
        return this.notify_message;
    }

    @e
    public final List<KeyDescObj> getOrder_award() {
        return this.order_award;
    }

    @d
    public final MallCartOrderInfoObj getOrder_info() {
        return this.order_info;
    }

    @d
    public final List<CartGroupObj> getOrder_items() {
        return this.order_items;
    }

    @e
    public final String getOrder_type() {
        return this.order_type;
    }

    @e
    public final MallPayExtraInfo getPay_info() {
        return this.pay_info;
    }

    @e
    public final String getPay_price() {
        return this.pay_price;
    }

    @e
    public final List<PayTypeInfoObj> getPayment_list() {
        return this.payment_list;
    }

    @d
    public final String getProduct_state() {
        return this.product_state;
    }

    @e
    public final MallPayPurchaseParams getPurchase_params() {
        return this.purchase_params;
    }

    @e
    public final String getService_agreement() {
        return this.service_agreement;
    }

    @e
    public final ShareInfoObj getShare_info() {
        return this.share_info;
    }

    @e
    public final String getStack_coupon_count() {
        return this.stack_coupon_count;
    }

    @e
    public final MallOrderStackCouponObj getStack_coupons() {
        return this.stack_coupons;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final MallOrderActionXObj getTop_button() {
        return this.top_button;
    }

    @e
    public final String getTotal_coin() {
        return this.total_coin;
    }

    @e
    public final String getTotal_hbalance() {
        return this.total_hbalance;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15594, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.h_src;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MallPayExtraInfo mallPayExtraInfo = this.pay_info;
        int iHashCode2 = (iHashCode + (mallPayExtraInfo == null ? 0 : mallPayExtraInfo.hashCode())) * 31;
        String str2 = this.total_hbalance;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.current_price;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pay_price;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.service_agreement;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agreement_title;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.agreement_url;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        MallOrderNotifyObj mallOrderNotifyObj = this.notify_message;
        int iHashCode9 = (iHashCode8 + (mallOrderNotifyObj == null ? 0 : mallOrderNotifyObj.hashCode())) * 31;
        String str8 = this.order_type;
        int iHashCode10 = (((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.product_state.hashCode()) * 31;
        String str9 = this.coupon_count;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.stack_coupon_count;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        MallOrderStackCouponObj mallOrderStackCouponObj = this.stack_coupons;
        int iHashCode13 = (iHashCode12 + (mallOrderStackCouponObj == null ? 0 : mallOrderStackCouponObj.hashCode())) * 31;
        String str11 = this.available_coupon_count;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.available_coupon_max_deduce;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.coupon_center_protocol;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.enable_deduct;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        MallPriceObj mallPriceObj = this.discount_params_v2;
        int iHashCode18 = (iHashCode17 + (mallPriceObj == null ? 0 : mallPriceObj.hashCode())) * 31;
        String str15 = this.total_coin;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.title;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.msg;
        int iHashCode21 = (((((iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31) + this.max_deduct_coin) * 31) + this.order_info.hashCode()) * 31;
        List<CardObj> list = this.cm_cards;
        int iHashCode22 = (iHashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        List<CardObjV2> list2 = this.cm_cards_v2;
        int iHashCode23 = (iHashCode22 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AddressInfoObj addressInfoObj = this.address;
        int iHashCode24 = (iHashCode23 + (addressInfoObj == null ? 0 : addressInfoObj.hashCode())) * 31;
        String str18 = this.need_choose_address;
        int iHashCode25 = (iHashCode24 + (str18 == null ? 0 : str18.hashCode())) * 31;
        MallOrderBottomBtnObj mallOrderBottomBtnObj = this.bottom_button;
        int iHashCode26 = (iHashCode25 + (mallOrderBottomBtnObj == null ? 0 : mallOrderBottomBtnObj.hashCode())) * 31;
        MallOrderActionXObj mallOrderActionXObj = this.top_button;
        int iHashCode27 = (iHashCode26 + (mallOrderActionXObj == null ? 0 : mallOrderActionXObj.hashCode())) * 31;
        ShareInfoObj shareInfoObj = this.share_info;
        int iHashCode28 = (((iHashCode27 + (shareInfoObj == null ? 0 : shareInfoObj.hashCode())) * 31) + this.order_items.hashCode()) * 31;
        List<MallProductActionObj> list3 = this.display_items;
        int iHashCode29 = (iHashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MoreOptionBtnsObj> list4 = this.more_option_btns;
        int iHashCode30 = (iHashCode29 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<PayTypeInfoObj> list5 = this.payment_list;
        int iHashCode31 = (iHashCode30 + (list5 == null ? 0 : list5.hashCode())) * 31;
        MallPayPurchaseParams mallPayPurchaseParams = this.purchase_params;
        int iHashCode32 = (iHashCode31 + (mallPayPurchaseParams == null ? 0 : mallPayPurchaseParams.hashCode())) * 31;
        List<OrderDetailActivityObj> list6 = this.activity_list;
        int iHashCode33 = (iHashCode32 + (list6 == null ? 0 : list6.hashCode())) * 31;
        SuggestDiscountInfo suggestDiscountInfo = this.choose_discount_info;
        int iHashCode34 = (iHashCode33 + (suggestDiscountInfo == null ? 0 : suggestDiscountInfo.hashCode())) * 31;
        List<? extends KeyDescObj> list7 = this.order_award;
        int iHashCode35 = (iHashCode34 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer[][] numArr = this.msg_hl;
        int iHashCode36 = (iHashCode35 + (numArr == null ? 0 : Arrays.hashCode(numArr))) * 31;
        String str19 = this.active_type;
        int iHashCode37 = (iHashCode36 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool = this.allow_show;
        int iHashCode38 = (iHashCode37 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hide_price_detail;
        int iHashCode39 = (iHashCode38 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MallOrderGroupInfo mallOrderGroupInfo = this.grouping_info;
        return iHashCode39 + (mallOrderGroupInfo != null ? mallOrderGroupInfo.hashCode() : 0);
    }

    public final void setActive_type(@e String str) {
        this.active_type = str;
    }

    public final void setActivity_list(@e List<OrderDetailActivityObj> list) {
        this.activity_list = list;
    }

    public final void setAddress(@e AddressInfoObj addressInfoObj) {
        this.address = addressInfoObj;
    }

    public final void setAgreement_title(@e String str) {
        this.agreement_title = str;
    }

    public final void setAgreement_url(@e String str) {
        this.agreement_url = str;
    }

    public final void setAllow_show(@e Boolean bool) {
        this.allow_show = bool;
    }

    public final void setAvailable_coupon_count(@e String str) {
        this.available_coupon_count = str;
    }

    public final void setAvailable_coupon_max_deduce(@e String str) {
        this.available_coupon_max_deduce = str;
    }

    public final void setBottom_button(@e MallOrderBottomBtnObj mallOrderBottomBtnObj) {
        this.bottom_button = mallOrderBottomBtnObj;
    }

    public final void setChoose_discount_info(@e SuggestDiscountInfo suggestDiscountInfo) {
        this.choose_discount_info = suggestDiscountInfo;
    }

    public final void setCm_cards(@e List<CardObj> list) {
        this.cm_cards = list;
    }

    public final void setCm_cards_v2(@e List<CardObjV2> list) {
        this.cm_cards_v2 = list;
    }

    public final void setCoupon_center_protocol(@e String str) {
        this.coupon_center_protocol = str;
    }

    public final void setCoupon_count(@e String str) {
        this.coupon_count = str;
    }

    public final void setCurrent_price(@e String str) {
        this.current_price = str;
    }

    public final void setDiscount_params_v2(@e MallPriceObj mallPriceObj) {
        this.discount_params_v2 = mallPriceObj;
    }

    public final void setDisplay_items(@e List<MallProductActionObj> list) {
        this.display_items = list;
    }

    public final void setEnable_deduct(@e String str) {
        this.enable_deduct = str;
    }

    public final void setGrouping_info(@e MallOrderGroupInfo mallOrderGroupInfo) {
        this.grouping_info = mallOrderGroupInfo;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setHide_price_detail(@e Boolean bool) {
        this.hide_price_detail = bool;
    }

    public final void setMax_deduct_coin(int i10) {
        this.max_deduct_coin = i10;
    }

    public final void setMore_option_btns(@e List<MoreOptionBtnsObj> list) {
        this.more_option_btns = list;
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setMsg_hl(@e Integer[][] numArr) {
        this.msg_hl = numArr;
    }

    public final void setNeed_choose_address(@e String str) {
        this.need_choose_address = str;
    }

    public final void setNotify_message(@e MallOrderNotifyObj mallOrderNotifyObj) {
        this.notify_message = mallOrderNotifyObj;
    }

    public final void setOrder_award(@e List<? extends KeyDescObj> list) {
        this.order_award = list;
    }

    public final void setOrder_info(@d MallCartOrderInfoObj mallCartOrderInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderInfoObj}, this, changeQuickRedirect, false, 15589, new Class[]{MallCartOrderInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallCartOrderInfoObj, "<set-?>");
        this.order_info = mallCartOrderInfoObj;
    }

    public final void setOrder_items(@d List<CartGroupObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15590, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.order_items = list;
    }

    public final void setOrder_type(@e String str) {
        this.order_type = str;
    }

    public final void setPay_info(@e MallPayExtraInfo mallPayExtraInfo) {
        this.pay_info = mallPayExtraInfo;
    }

    public final void setPay_price(@e String str) {
        this.pay_price = str;
    }

    public final void setPayment_list(@e List<PayTypeInfoObj> list) {
        this.payment_list = list;
    }

    public final void setProduct_state(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15588, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.product_state = str;
    }

    public final void setPurchase_params(@e MallPayPurchaseParams mallPayPurchaseParams) {
        this.purchase_params = mallPayPurchaseParams;
    }

    public final void setService_agreement(@e String str) {
        this.service_agreement = str;
    }

    public final void setShare_info(@e ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public final void setStack_coupon_count(@e String str) {
        this.stack_coupon_count = str;
    }

    public final void setStack_coupons(@e MallOrderStackCouponObj mallOrderStackCouponObj) {
        this.stack_coupons = mallOrderStackCouponObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTop_button(@e MallOrderActionXObj mallOrderActionXObj) {
        this.top_button = mallOrderActionXObj;
    }

    public final void setTotal_coin(@e String str) {
        this.total_coin = str;
    }

    public final void setTotal_hbalance(@e String str) {
        this.total_hbalance = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15593, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallCartOrderDetailObj(h_src=" + this.h_src + ", pay_info=" + this.pay_info + ", total_hbalance=" + this.total_hbalance + ", current_price=" + this.current_price + ", pay_price=" + this.pay_price + ", service_agreement=" + this.service_agreement + ", agreement_title=" + this.agreement_title + ", agreement_url=" + this.agreement_url + ", notify_message=" + this.notify_message + ", order_type=" + this.order_type + ", product_state=" + this.product_state + ", coupon_count=" + this.coupon_count + ", stack_coupon_count=" + this.stack_coupon_count + ", stack_coupons=" + this.stack_coupons + ", available_coupon_count=" + this.available_coupon_count + ", available_coupon_max_deduce=" + this.available_coupon_max_deduce + ", coupon_center_protocol=" + this.coupon_center_protocol + ", enable_deduct=" + this.enable_deduct + ", discount_params_v2=" + this.discount_params_v2 + ", total_coin=" + this.total_coin + ", title=" + this.title + ", msg=" + this.msg + ", max_deduct_coin=" + this.max_deduct_coin + ", order_info=" + this.order_info + ", cm_cards=" + this.cm_cards + ", cm_cards_v2=" + this.cm_cards_v2 + ", address=" + this.address + ", need_choose_address=" + this.need_choose_address + ", bottom_button=" + this.bottom_button + ", top_button=" + this.top_button + ", share_info=" + this.share_info + ", order_items=" + this.order_items + ", display_items=" + this.display_items + ", more_option_btns=" + this.more_option_btns + ", payment_list=" + this.payment_list + ", purchase_params=" + this.purchase_params + ", activity_list=" + this.activity_list + ", choose_discount_info=" + this.choose_discount_info + ", order_award=" + this.order_award + ", msg_hl=" + Arrays.toString(this.msg_hl) + ", active_type=" + this.active_type + ", allow_show=" + this.allow_show + ", hide_price_detail=" + this.hide_price_detail + ", grouping_info=" + this.grouping_info + ')';
    }
}
