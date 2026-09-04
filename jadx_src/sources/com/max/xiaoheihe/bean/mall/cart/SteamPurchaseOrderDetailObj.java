package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.xiaoheihe.bean.AlertObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.mall.MallOrderBottomBtnObj;
import com.max.xiaoheihe.bean.mall.MoreOptionBtnsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SteamPurchaseOrderDetailObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private MallOrderBottomBtnObj bottom_button;

    @e
    private List<CardObj> cm_cards;

    @e
    private List<CardObjV2> cm_cards_v2;

    @e
    private String create_time;

    @e
    private String desc;

    @e
    private String image;

    @e
    private String is_finished;

    @e
    private List<MoreOptionBtnsObj> more_option_btns;

    @e
    private String name;

    @e
    private AlertObj not_finish_alert;

    @e
    private RelatedRecommend related_recommend;

    @e
    private String rmb;

    @e
    private ShareInfoObj share_info;

    @e
    private String tip;

    @e
    private String tip_v2;

    @e
    private String title;

    @e
    private String trans_id;

    public SteamPurchaseOrderDetailObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e RelatedRecommend relatedRecommend, @e MallOrderBottomBtnObj mallOrderBottomBtnObj, @e ShareInfoObj shareInfoObj, @e List<MoreOptionBtnsObj> list, @e String str10, @e AlertObj alertObj, @e List<CardObj> list2, @e List<CardObjV2> list3) {
        this.image = str;
        this.name = str2;
        this.title = str3;
        this.desc = str4;
        this.trans_id = str5;
        this.rmb = str6;
        this.create_time = str7;
        this.tip = str8;
        this.tip_v2 = str9;
        this.related_recommend = relatedRecommend;
        this.bottom_button = mallOrderBottomBtnObj;
        this.share_info = shareInfoObj;
        this.more_option_btns = list;
        this.is_finished = str10;
        this.not_finish_alert = alertObj;
        this.cm_cards = list2;
        this.cm_cards_v2 = list3;
    }

    public static /* synthetic */ SteamPurchaseOrderDetailObj copy$default(SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RelatedRecommend relatedRecommend, MallOrderBottomBtnObj mallOrderBottomBtnObj, ShareInfoObj shareInfoObj, List list, String str10, AlertObj alertObj, List list2, List list3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamPurchaseOrderDetailObj, str, str2, str3, str4, str5, str6, str7, str8, str9, relatedRecommend, mallOrderBottomBtnObj, shareInfoObj, list, str10, alertObj, list2, list3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15627, new Class[]{SteamPurchaseOrderDetailObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, RelatedRecommend.class, MallOrderBottomBtnObj.class, ShareInfoObj.class, List.class, String.class, AlertObj.class, List.class, List.class, Integer.TYPE, Object.class}, SteamPurchaseOrderDetailObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SteamPurchaseOrderDetailObj) patchProxyResultProxy.result;
        }
        return steamPurchaseOrderDetailObj.copy((i10 & 1) != 0 ? steamPurchaseOrderDetailObj.image : str, (i10 & 2) != 0 ? steamPurchaseOrderDetailObj.name : str2, (i10 & 4) != 0 ? steamPurchaseOrderDetailObj.title : str3, (i10 & 8) != 0 ? steamPurchaseOrderDetailObj.desc : str4, (i10 & 16) != 0 ? steamPurchaseOrderDetailObj.trans_id : str5, (i10 & 32) != 0 ? steamPurchaseOrderDetailObj.rmb : str6, (i10 & 64) != 0 ? steamPurchaseOrderDetailObj.create_time : str7, (i10 & 128) != 0 ? steamPurchaseOrderDetailObj.tip : str8, (i10 & 256) != 0 ? steamPurchaseOrderDetailObj.tip_v2 : str9, (i10 & 512) != 0 ? steamPurchaseOrderDetailObj.related_recommend : relatedRecommend, (i10 & 1024) != 0 ? steamPurchaseOrderDetailObj.bottom_button : mallOrderBottomBtnObj, (i10 & 2048) != 0 ? steamPurchaseOrderDetailObj.share_info : shareInfoObj, (i10 & 4096) != 0 ? steamPurchaseOrderDetailObj.more_option_btns : list, (i10 & 8192) != 0 ? steamPurchaseOrderDetailObj.is_finished : str10, (i10 & 16384) != 0 ? steamPurchaseOrderDetailObj.not_finish_alert : alertObj, (i10 & 32768) != 0 ? steamPurchaseOrderDetailObj.cm_cards : list2, (i10 & 65536) != 0 ? steamPurchaseOrderDetailObj.cm_cards_v2 : list3);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final RelatedRecommend component10() {
        return this.related_recommend;
    }

    @e
    public final MallOrderBottomBtnObj component11() {
        return this.bottom_button;
    }

    @e
    public final ShareInfoObj component12() {
        return this.share_info;
    }

    @e
    public final List<MoreOptionBtnsObj> component13() {
        return this.more_option_btns;
    }

    @e
    public final String component14() {
        return this.is_finished;
    }

    @e
    public final AlertObj component15() {
        return this.not_finish_alert;
    }

    @e
    public final List<CardObj> component16() {
        return this.cm_cards;
    }

    @e
    public final List<CardObjV2> component17() {
        return this.cm_cards_v2;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @e
    public final String component5() {
        return this.trans_id;
    }

    @e
    public final String component6() {
        return this.rmb;
    }

    @e
    public final String component7() {
        return this.create_time;
    }

    @e
    public final String component8() {
        return this.tip;
    }

    @e
    public final String component9() {
        return this.tip_v2;
    }

    @d
    public final SteamPurchaseOrderDetailObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e RelatedRecommend relatedRecommend, @e MallOrderBottomBtnObj mallOrderBottomBtnObj, @e ShareInfoObj shareInfoObj, @e List<MoreOptionBtnsObj> list, @e String str10, @e AlertObj alertObj, @e List<CardObj> list2, @e List<CardObjV2> list3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, relatedRecommend, mallOrderBottomBtnObj, shareInfoObj, list, str10, alertObj, list2, list3}, this, changeQuickRedirect, false, 15626, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, RelatedRecommend.class, MallOrderBottomBtnObj.class, ShareInfoObj.class, List.class, String.class, AlertObj.class, List.class, List.class}, SteamPurchaseOrderDetailObj.class);
        return patchProxyResultProxy.isSupported ? (SteamPurchaseOrderDetailObj) patchProxyResultProxy.result : new SteamPurchaseOrderDetailObj(str, str2, str3, str4, str5, str6, str7, str8, str9, relatedRecommend, mallOrderBottomBtnObj, shareInfoObj, list, str10, alertObj, list2, list3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15630, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteamPurchaseOrderDetailObj)) {
            return false;
        }
        SteamPurchaseOrderDetailObj steamPurchaseOrderDetailObj = (SteamPurchaseOrderDetailObj) obj;
        return f0.g(this.image, steamPurchaseOrderDetailObj.image) && f0.g(this.name, steamPurchaseOrderDetailObj.name) && f0.g(this.title, steamPurchaseOrderDetailObj.title) && f0.g(this.desc, steamPurchaseOrderDetailObj.desc) && f0.g(this.trans_id, steamPurchaseOrderDetailObj.trans_id) && f0.g(this.rmb, steamPurchaseOrderDetailObj.rmb) && f0.g(this.create_time, steamPurchaseOrderDetailObj.create_time) && f0.g(this.tip, steamPurchaseOrderDetailObj.tip) && f0.g(this.tip_v2, steamPurchaseOrderDetailObj.tip_v2) && f0.g(this.related_recommend, steamPurchaseOrderDetailObj.related_recommend) && f0.g(this.bottom_button, steamPurchaseOrderDetailObj.bottom_button) && f0.g(this.share_info, steamPurchaseOrderDetailObj.share_info) && f0.g(this.more_option_btns, steamPurchaseOrderDetailObj.more_option_btns) && f0.g(this.is_finished, steamPurchaseOrderDetailObj.is_finished) && f0.g(this.not_finish_alert, steamPurchaseOrderDetailObj.not_finish_alert) && f0.g(this.cm_cards, steamPurchaseOrderDetailObj.cm_cards) && f0.g(this.cm_cards_v2, steamPurchaseOrderDetailObj.cm_cards_v2);
    }

    @e
    public final MallOrderBottomBtnObj getBottom_button() {
        return this.bottom_button;
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
    public final String getCreate_time() {
        return this.create_time;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final List<MoreOptionBtnsObj> getMore_option_btns() {
        return this.more_option_btns;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final AlertObj getNot_finish_alert() {
        return this.not_finish_alert;
    }

    @e
    public final RelatedRecommend getRelated_recommend() {
        return this.related_recommend;
    }

    @e
    public final String getRmb() {
        return this.rmb;
    }

    @e
    public final ShareInfoObj getShare_info() {
        return this.share_info;
    }

    @e
    public final String getTip() {
        return this.tip;
    }

    @e
    public final String getTip_v2() {
        return this.tip_v2;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getTrans_id() {
        return this.trans_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15629, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trans_id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rmb;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.create_time;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tip;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tip_v2;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        RelatedRecommend relatedRecommend = this.related_recommend;
        int iHashCode10 = (iHashCode9 + (relatedRecommend == null ? 0 : relatedRecommend.hashCode())) * 31;
        MallOrderBottomBtnObj mallOrderBottomBtnObj = this.bottom_button;
        int iHashCode11 = (iHashCode10 + (mallOrderBottomBtnObj == null ? 0 : mallOrderBottomBtnObj.hashCode())) * 31;
        ShareInfoObj shareInfoObj = this.share_info;
        int iHashCode12 = (iHashCode11 + (shareInfoObj == null ? 0 : shareInfoObj.hashCode())) * 31;
        List<MoreOptionBtnsObj> list = this.more_option_btns;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.is_finished;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AlertObj alertObj = this.not_finish_alert;
        int iHashCode15 = (iHashCode14 + (alertObj == null ? 0 : alertObj.hashCode())) * 31;
        List<CardObj> list2 = this.cm_cards;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CardObjV2> list3 = this.cm_cards_v2;
        return iHashCode16 + (list3 != null ? list3.hashCode() : 0);
    }

    @e
    public final String is_finished() {
        return this.is_finished;
    }

    public final void setBottom_button(@e MallOrderBottomBtnObj mallOrderBottomBtnObj) {
        this.bottom_button = mallOrderBottomBtnObj;
    }

    public final void setCm_cards(@e List<CardObj> list) {
        this.cm_cards = list;
    }

    public final void setCm_cards_v2(@e List<CardObjV2> list) {
        this.cm_cards_v2 = list;
    }

    public final void setCreate_time(@e String str) {
        this.create_time = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setMore_option_btns(@e List<MoreOptionBtnsObj> list) {
        this.more_option_btns = list;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setNot_finish_alert(@e AlertObj alertObj) {
        this.not_finish_alert = alertObj;
    }

    public final void setRelated_recommend(@e RelatedRecommend relatedRecommend) {
        this.related_recommend = relatedRecommend;
    }

    public final void setRmb(@e String str) {
        this.rmb = str;
    }

    public final void setShare_info(@e ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public final void setTip(@e String str) {
        this.tip = str;
    }

    public final void setTip_v2(@e String str) {
        this.tip_v2 = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTrans_id(@e String str) {
        this.trans_id = str;
    }

    public final void set_finished(@e String str) {
        this.is_finished = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15628, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SteamPurchaseOrderDetailObj(image=" + this.image + ", name=" + this.name + ", title=" + this.title + ", desc=" + this.desc + ", trans_id=" + this.trans_id + ", rmb=" + this.rmb + ", create_time=" + this.create_time + ", tip=" + this.tip + ", tip_v2=" + this.tip_v2 + ", related_recommend=" + this.related_recommend + ", bottom_button=" + this.bottom_button + ", share_info=" + this.share_info + ", more_option_btns=" + this.more_option_btns + ", is_finished=" + this.is_finished + ", not_finish_alert=" + this.not_finish_alert + ", cm_cards=" + this.cm_cards + ", cm_cards_v2=" + this.cm_cards_v2 + ')';
    }
}
