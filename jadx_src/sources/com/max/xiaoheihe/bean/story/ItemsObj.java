package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.bbs.BBSNoCommentTipObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ItemsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CardIdInfoObj card_id_info;

    @e
    private String double_click_lottie_key;

    @e
    private String h_src;

    @e
    private LinkCardInfoObj link_card_info;

    @SerializedName("post_comment_auto_filled_text")
    @e
    private String postCommentAutoFilledText;

    @SerializedName("post_comment_no_more_info")
    @e
    private BBSNoCommentTipObj postCommentNoMoreInfo;

    @e
    private String post_comment_tips;

    public ItemsObj() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public ItemsObj(@e CardIdInfoObj cardIdInfoObj, @e LinkCardInfoObj linkCardInfoObj, @e String str, @e String str2, @e String str3, @e BBSNoCommentTipObj bBSNoCommentTipObj, @e String str4) {
        this.card_id_info = cardIdInfoObj;
        this.link_card_info = linkCardInfoObj;
        this.h_src = str;
        this.post_comment_tips = str2;
        this.postCommentAutoFilledText = str3;
        this.postCommentNoMoreInfo = bBSNoCommentTipObj;
        this.double_click_lottie_key = str4;
    }

    public /* synthetic */ ItemsObj(CardIdInfoObj cardIdInfoObj, LinkCardInfoObj linkCardInfoObj, String str, String str2, String str3, BBSNoCommentTipObj bBSNoCommentTipObj, String str4, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : cardIdInfoObj, (i10 & 2) != 0 ? null : linkCardInfoObj, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : bBSNoCommentTipObj, (i10 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ ItemsObj copy$default(ItemsObj itemsObj, CardIdInfoObj cardIdInfoObj, LinkCardInfoObj linkCardInfoObj, String str, String str2, String str3, BBSNoCommentTipObj bBSNoCommentTipObj, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemsObj, cardIdInfoObj, linkCardInfoObj, str, str2, str3, bBSNoCommentTipObj, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15954, new Class[]{ItemsObj.class, CardIdInfoObj.class, LinkCardInfoObj.class, String.class, String.class, String.class, BBSNoCommentTipObj.class, String.class, Integer.TYPE, Object.class}, ItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemsObj) patchProxyResultProxy.result;
        }
        return itemsObj.copy((i10 & 1) != 0 ? itemsObj.card_id_info : cardIdInfoObj, (i10 & 2) != 0 ? itemsObj.link_card_info : linkCardInfoObj, (i10 & 4) != 0 ? itemsObj.h_src : str, (i10 & 8) != 0 ? itemsObj.post_comment_tips : str2, (i10 & 16) != 0 ? itemsObj.postCommentAutoFilledText : str3, (i10 & 32) != 0 ? itemsObj.postCommentNoMoreInfo : bBSNoCommentTipObj, (i10 & 64) != 0 ? itemsObj.double_click_lottie_key : str4);
    }

    @e
    public final CardIdInfoObj component1() {
        return this.card_id_info;
    }

    @e
    public final LinkCardInfoObj component2() {
        return this.link_card_info;
    }

    @e
    public final String component3() {
        return this.h_src;
    }

    @e
    public final String component4() {
        return this.post_comment_tips;
    }

    @e
    public final String component5() {
        return this.postCommentAutoFilledText;
    }

    @e
    public final BBSNoCommentTipObj component6() {
        return this.postCommentNoMoreInfo;
    }

    @e
    public final String component7() {
        return this.double_click_lottie_key;
    }

    @d
    public final ItemsObj copy(@e CardIdInfoObj cardIdInfoObj, @e LinkCardInfoObj linkCardInfoObj, @e String str, @e String str2, @e String str3, @e BBSNoCommentTipObj bBSNoCommentTipObj, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cardIdInfoObj, linkCardInfoObj, str, str2, str3, bBSNoCommentTipObj, str4}, this, changeQuickRedirect, false, 15953, new Class[]{CardIdInfoObj.class, LinkCardInfoObj.class, String.class, String.class, String.class, BBSNoCommentTipObj.class, String.class}, ItemsObj.class);
        return patchProxyResultProxy.isSupported ? (ItemsObj) patchProxyResultProxy.result : new ItemsObj(cardIdInfoObj, linkCardInfoObj, str, str2, str3, bBSNoCommentTipObj, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15957, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemsObj)) {
            return false;
        }
        ItemsObj itemsObj = (ItemsObj) obj;
        return f0.g(this.card_id_info, itemsObj.card_id_info) && f0.g(this.link_card_info, itemsObj.link_card_info) && f0.g(this.h_src, itemsObj.h_src) && f0.g(this.post_comment_tips, itemsObj.post_comment_tips) && f0.g(this.postCommentAutoFilledText, itemsObj.postCommentAutoFilledText) && f0.g(this.postCommentNoMoreInfo, itemsObj.postCommentNoMoreInfo) && f0.g(this.double_click_lottie_key, itemsObj.double_click_lottie_key);
    }

    @e
    public final CardIdInfoObj getCard_id_info() {
        return this.card_id_info;
    }

    @e
    public final String getDouble_click_lottie_key() {
        return this.double_click_lottie_key;
    }

    @e
    public final String getH_src() {
        return this.h_src;
    }

    @e
    public final LinkCardInfoObj getLink_card_info() {
        return this.link_card_info;
    }

    @e
    public final String getPostCommentAutoFilledText() {
        return this.postCommentAutoFilledText;
    }

    @e
    public final BBSNoCommentTipObj getPostCommentNoMoreInfo() {
        return this.postCommentNoMoreInfo;
    }

    @e
    public final String getPost_comment_tips() {
        return this.post_comment_tips;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15956, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        CardIdInfoObj cardIdInfoObj = this.card_id_info;
        int iHashCode = (cardIdInfoObj == null ? 0 : cardIdInfoObj.hashCode()) * 31;
        LinkCardInfoObj linkCardInfoObj = this.link_card_info;
        int iHashCode2 = (iHashCode + (linkCardInfoObj == null ? 0 : linkCardInfoObj.hashCode())) * 31;
        String str = this.h_src;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.post_comment_tips;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postCommentAutoFilledText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BBSNoCommentTipObj bBSNoCommentTipObj = this.postCommentNoMoreInfo;
        int iHashCode6 = (iHashCode5 + (bBSNoCommentTipObj == null ? 0 : bBSNoCommentTipObj.hashCode())) * 31;
        String str4 = this.double_click_lottie_key;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCard_id_info(@e CardIdInfoObj cardIdInfoObj) {
        this.card_id_info = cardIdInfoObj;
    }

    public final void setDouble_click_lottie_key(@e String str) {
        this.double_click_lottie_key = str;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setLink_card_info(@e LinkCardInfoObj linkCardInfoObj) {
        this.link_card_info = linkCardInfoObj;
    }

    public final void setPostCommentAutoFilledText(@e String str) {
        this.postCommentAutoFilledText = str;
    }

    public final void setPostCommentNoMoreInfo(@e BBSNoCommentTipObj bBSNoCommentTipObj) {
        this.postCommentNoMoreInfo = bBSNoCommentTipObj;
    }

    public final void setPost_comment_tips(@e String str) {
        this.post_comment_tips = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15955, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ItemsObj(card_id_info=" + this.card_id_info + ", link_card_info=" + this.link_card_info + ", h_src=" + this.h_src + ", post_comment_tips=" + this.post_comment_tips + ", postCommentAutoFilledText=" + this.postCommentAutoFilledText + ", postCommentNoMoreInfo=" + this.postCommentNoMoreInfo + ", double_click_lottie_key=" + this.double_click_lottie_key + ')';
    }
}
