package com.max.hbstory.bean;

import androidx.compose.foundation.b0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryData.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class StoryItemsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private StoryCardIdInfoObj card_id_info;

    @e
    private String double_click_lottie_key;

    @e
    private String h_src;

    @e
    private StoryLinkCardInfoObj link_card_info;
    private boolean need_story_mode_report;

    @e
    private String post_comment_tips;

    public StoryItemsObj() {
        this(null, null, null, null, null, false, 63, null);
    }

    public StoryItemsObj(@e StoryCardIdInfoObj storyCardIdInfoObj, @e StoryLinkCardInfoObj storyLinkCardInfoObj, @e String str, @e String str2, @e String str3, boolean z10) {
        this.card_id_info = storyCardIdInfoObj;
        this.link_card_info = storyLinkCardInfoObj;
        this.h_src = str;
        this.post_comment_tips = str2;
        this.double_click_lottie_key = str3;
        this.need_story_mode_report = z10;
    }

    public /* synthetic */ StoryItemsObj(StoryCardIdInfoObj storyCardIdInfoObj, StoryLinkCardInfoObj storyLinkCardInfoObj, String str, String str2, String str3, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : storyCardIdInfoObj, (i10 & 2) != 0 ? null : storyLinkCardInfoObj, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) == 0 ? str3 : null, (i10 & 32) != 0 ? false : z10);
    }

    public static /* synthetic */ StoryItemsObj copy$default(StoryItemsObj storyItemsObj, StoryCardIdInfoObj storyCardIdInfoObj, StoryLinkCardInfoObj storyLinkCardInfoObj, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyItemsObj, storyCardIdInfoObj, storyLinkCardInfoObj, str, str2, str3, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33458be, new Class[]{StoryItemsObj.class, StoryCardIdInfoObj.class, StoryLinkCardInfoObj.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        StoryCardIdInfoObj storyCardIdInfoObj2 = (i10 & 1) != 0 ? storyItemsObj.card_id_info : storyCardIdInfoObj;
        StoryLinkCardInfoObj storyLinkCardInfoObj2 = (i10 & 2) != 0 ? storyItemsObj.link_card_info : storyLinkCardInfoObj;
        String str4 = (i10 & 4) != 0 ? storyItemsObj.h_src : str;
        String str5 = (i10 & 8) != 0 ? storyItemsObj.post_comment_tips : str2;
        String str6 = (i10 & 16) != 0 ? storyItemsObj.double_click_lottie_key : str3;
        if ((i10 & 32) != 0) {
            z11 = storyItemsObj.need_story_mode_report;
        }
        return storyItemsObj.copy(storyCardIdInfoObj2, storyLinkCardInfoObj2, str4, str5, str6, z11);
    }

    @e
    public final StoryCardIdInfoObj component1() {
        return this.card_id_info;
    }

    @e
    public final StoryLinkCardInfoObj component2() {
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
        return this.double_click_lottie_key;
    }

    public final boolean component6() {
        return this.need_story_mode_report;
    }

    @d
    public final StoryItemsObj copy(@e StoryCardIdInfoObj storyCardIdInfoObj, @e StoryLinkCardInfoObj storyLinkCardInfoObj, @e String str, @e String str2, @e String str3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyCardIdInfoObj, storyLinkCardInfoObj, str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.k.f33435ae, new Class[]{StoryCardIdInfoObj.class, StoryLinkCardInfoObj.class, String.class, String.class, String.class, Boolean.TYPE}, StoryItemsObj.class);
        return patchProxyResultProxy.isSupported ? (StoryItemsObj) patchProxyResultProxy.result : new StoryItemsObj(storyCardIdInfoObj, storyLinkCardInfoObj, str, str2, str3, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Yd, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj instanceof StoryItemsObj)) {
            return false;
        }
        StoryCardIdInfoObj storyCardIdInfoObj = this.card_id_info;
        String item_id = storyCardIdInfoObj != null ? storyCardIdInfoObj.getItem_id() : null;
        StoryCardIdInfoObj storyCardIdInfoObj2 = ((StoryItemsObj) obj).card_id_info;
        return f0.g(item_id, storyCardIdInfoObj2 != null ? storyCardIdInfoObj2.getItem_id() : null);
    }

    @e
    public final StoryCardIdInfoObj getCard_id_info() {
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
    public final StoryLinkCardInfoObj getLink_card_info() {
        return this.link_card_info;
    }

    public final boolean getNeed_story_mode_report() {
        return this.need_story_mode_report;
    }

    @e
    public final String getPost_comment_tips() {
        return this.post_comment_tips;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33505de, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        StoryCardIdInfoObj storyCardIdInfoObj = this.card_id_info;
        int iHashCode = (storyCardIdInfoObj == null ? 0 : storyCardIdInfoObj.hashCode()) * 31;
        StoryLinkCardInfoObj storyLinkCardInfoObj = this.link_card_info;
        int iHashCode2 = (iHashCode + (storyLinkCardInfoObj == null ? 0 : storyLinkCardInfoObj.hashCode())) * 31;
        String str = this.h_src;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.post_comment_tips;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.double_click_lottie_key;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + b0.a(this.need_story_mode_report);
    }

    public final boolean isVideo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Zd, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        StoryCardIdInfoObj storyCardIdInfoObj = this.card_id_info;
        return storyCardIdInfoObj != null && storyCardIdInfoObj.getCard_type() == 1;
    }

    public final void setCard_id_info(@e StoryCardIdInfoObj storyCardIdInfoObj) {
        this.card_id_info = storyCardIdInfoObj;
    }

    public final void setDouble_click_lottie_key(@e String str) {
        this.double_click_lottie_key = str;
    }

    public final void setH_src(@e String str) {
        this.h_src = str;
    }

    public final void setLink_card_info(@e StoryLinkCardInfoObj storyLinkCardInfoObj) {
        this.link_card_info = storyLinkCardInfoObj;
    }

    public final void setNeed_story_mode_report(boolean z10) {
        this.need_story_mode_report = z10;
    }

    public final void setPost_comment_tips(@e String str) {
        this.post_comment_tips = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33481ce, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryItemsObj(card_id_info=" + this.card_id_info + ", link_card_info=" + this.link_card_info + ", h_src=" + this.h_src + ", post_comment_tips=" + this.post_comment_tips + ", double_click_lottie_key=" + this.double_click_lottie_key + ", need_story_mode_report=" + this.need_story_mode_report + ')';
    }
}
