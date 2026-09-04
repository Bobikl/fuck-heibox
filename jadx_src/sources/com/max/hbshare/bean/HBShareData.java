package com.max.hbshare.bean;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.b0;
import bb.c;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.media.UMImage;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBShareData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HBShareData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean canCopyUrl;

    @e
    private String can_not_share_tips;

    @e
    private transient View customTitleView;

    @e
    private Bundle extraOpts;

    @e
    private List<? extends PostOptionObj> extraShareActionList;
    private boolean onlyShareImage;

    @e
    private JsonObject report_extra;

    @e
    private List<? extends PostOptionObj> shareActionList;

    @e
    private String shareFilePath;

    @e
    private transient UMShareListener shareListener;

    @e
    private String targetUrl;

    @e
    private String text;

    @e
    private String title;

    @e
    private transient UMImage umImage;

    @i
    public HBShareData() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @i
    public HBShareData(boolean z10) {
        this(z10, false, null, null, null, null, null, null, null, null, null, null, null, c.k.F5, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11) {
        this(z10, z11, null, null, null, null, null, null, null, null, null, null, null, c.k.D5, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str) {
        this(z10, z11, str, null, null, null, null, null, null, null, null, null, null, c.k.f33993z5, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2) {
        this(z10, z11, str, str2, null, null, null, null, null, null, null, null, null, c.k.f33817r5, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3) {
        this(z10, z11, str, str2, str3, null, null, null, null, null, null, null, null, c.k.f33449b5, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle) {
        this(z10, z11, str, str2, str3, bundle, null, null, null, null, null, null, null, c.k.f33904v4, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage) {
        this(z10, z11, str, str2, str3, bundle, uMImage, null, null, null, null, null, null, c.k.f33632j3, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener) {
        this(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, null, null, null, null, null, c.k.L0, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list) {
        this(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, list, null, null, null, null, c.i.W0, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list, @e String str4) {
        this(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, list, str4, null, null, null, c.g.f32954lc, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list, @e String str4, @e List<? extends PostOptionObj> list2) {
        this(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, list, str4, list2, null, null, c.f.Jw, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list, @e String str4, @e List<? extends PostOptionObj> list2, @e View view) {
        this(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, list, str4, list2, view, null, 4096, null);
    }

    @i
    public HBShareData(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list, @e String str4, @e List<? extends PostOptionObj> list2, @e View view, @e String str5) {
        this.onlyShareImage = z10;
        this.canCopyUrl = z11;
        this.title = str;
        this.text = str2;
        this.targetUrl = str3;
        this.extraOpts = bundle;
        this.umImage = uMImage;
        this.shareListener = uMShareListener;
        this.shareActionList = list;
        this.shareFilePath = str4;
        this.extraShareActionList = list2;
        this.customTitleView = view;
        this.can_not_share_tips = str5;
    }

    public /* synthetic */ HBShareData(boolean z10, boolean z11, String str, String str2, String str3, Bundle bundle, UMImage uMImage, UMShareListener uMShareListener, List list, String str4, List list2, View view, String str5, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : bundle, (i10 & 64) != 0 ? null : uMImage, (i10 & 128) != 0 ? null : uMShareListener, (i10 & 256) != 0 ? null : list, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? null : list2, (i10 & 2048) != 0 ? null : view, (i10 & 4096) == 0 ? str5 : null);
    }

    public static /* synthetic */ HBShareData copy$default(HBShareData hBShareData, boolean z10, boolean z11, String str, String str2, String str3, Bundle bundle, UMImage uMImage, UMShareListener uMShareListener, List list, String str4, List list2, View view, String str5, int i10, Object obj) {
        Object[] objArr = {hBShareData, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, bundle, uMImage, uMShareListener, list, str4, list2, view, str5, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.k.Ea, new Class[]{HBShareData.class, cls, cls, String.class, String.class, String.class, Bundle.class, UMImage.class, UMShareListener.class, List.class, String.class, List.class, View.class, String.class, Integer.TYPE, Object.class}, HBShareData.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBShareData) patchProxyResultProxy.result;
        }
        return hBShareData.copy((i10 & 1) != 0 ? hBShareData.onlyShareImage : z10 ? 1 : 0, (i10 & 2) != 0 ? hBShareData.canCopyUrl : z11 ? 1 : 0, (i10 & 4) != 0 ? hBShareData.title : str, (i10 & 8) != 0 ? hBShareData.text : str2, (i10 & 16) != 0 ? hBShareData.targetUrl : str3, (i10 & 32) != 0 ? hBShareData.extraOpts : bundle, (i10 & 64) != 0 ? hBShareData.umImage : uMImage, (i10 & 128) != 0 ? hBShareData.shareListener : uMShareListener, (i10 & 256) != 0 ? hBShareData.shareActionList : list, (i10 & 512) != 0 ? hBShareData.shareFilePath : str4, (i10 & 1024) != 0 ? hBShareData.extraShareActionList : list2, (i10 & 2048) != 0 ? hBShareData.customTitleView : view, (i10 & 4096) != 0 ? hBShareData.can_not_share_tips : str5);
    }

    public final boolean component1() {
        return this.onlyShareImage;
    }

    @e
    public final String component10() {
        return this.shareFilePath;
    }

    @e
    public final List<PostOptionObj> component11() {
        return this.extraShareActionList;
    }

    @e
    public final View component12() {
        return this.customTitleView;
    }

    @e
    public final String component13() {
        return this.can_not_share_tips;
    }

    public final boolean component2() {
        return this.canCopyUrl;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.text;
    }

    @e
    public final String component5() {
        return this.targetUrl;
    }

    @e
    public final Bundle component6() {
        return this.extraOpts;
    }

    @e
    public final UMImage component7() {
        return this.umImage;
    }

    @e
    public final UMShareListener component8() {
        return this.shareListener;
    }

    @e
    public final List<PostOptionObj> component9() {
        return this.shareActionList;
    }

    @d
    public final HBShareData copy(boolean z10, boolean z11, @e String str, @e String str2, @e String str3, @e Bundle bundle, @e UMImage uMImage, @e UMShareListener uMShareListener, @e List<? extends PostOptionObj> list, @e String str4, @e List<? extends PostOptionObj> list2, @e View view, @e String str5) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, str2, str3, bundle, uMImage, uMShareListener, list, str4, list2, view, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 8448, new Class[]{cls, cls, String.class, String.class, String.class, Bundle.class, UMImage.class, UMShareListener.class, List.class, String.class, List.class, View.class, String.class}, HBShareData.class);
        return patchProxyResultProxy.isSupported ? (HBShareData) patchProxyResultProxy.result : new HBShareData(z10, z11, str, str2, str3, bundle, uMImage, uMShareListener, list, str4, list2, view, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Ha, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HBShareData)) {
            return false;
        }
        HBShareData hBShareData = (HBShareData) obj;
        return this.onlyShareImage == hBShareData.onlyShareImage && this.canCopyUrl == hBShareData.canCopyUrl && f0.g(this.title, hBShareData.title) && f0.g(this.text, hBShareData.text) && f0.g(this.targetUrl, hBShareData.targetUrl) && f0.g(this.extraOpts, hBShareData.extraOpts) && f0.g(this.umImage, hBShareData.umImage) && f0.g(this.shareListener, hBShareData.shareListener) && f0.g(this.shareActionList, hBShareData.shareActionList) && f0.g(this.shareFilePath, hBShareData.shareFilePath) && f0.g(this.extraShareActionList, hBShareData.extraShareActionList) && f0.g(this.customTitleView, hBShareData.customTitleView) && f0.g(this.can_not_share_tips, hBShareData.can_not_share_tips);
    }

    public final boolean getCanCopyUrl() {
        return this.canCopyUrl;
    }

    @e
    public final String getCan_not_share_tips() {
        return this.can_not_share_tips;
    }

    @e
    public final View getCustomTitleView() {
        return this.customTitleView;
    }

    @e
    public final Bundle getExtraOpts() {
        return this.extraOpts;
    }

    @e
    public final List<PostOptionObj> getExtraShareActionList() {
        return this.extraShareActionList;
    }

    public final boolean getOnlyShareImage() {
        return this.onlyShareImage;
    }

    @e
    public final JsonObject getReport_extra() {
        return this.report_extra;
    }

    @e
    public final List<PostOptionObj> getShareActionList() {
        return this.shareActionList;
    }

    @e
    public final String getShareFilePath() {
        return this.shareFilePath;
    }

    @e
    public final UMShareListener getShareListener() {
        return this.shareListener;
    }

    @e
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final UMImage getUmImage() {
        return this.umImage;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ga, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = ((b0.a(this.onlyShareImage) * 31) + b0.a(this.canCopyUrl)) * 31;
        String str = this.title;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Bundle bundle = this.extraOpts;
        int iHashCode4 = (iHashCode3 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        UMImage uMImage = this.umImage;
        int iHashCode5 = (iHashCode4 + (uMImage == null ? 0 : uMImage.hashCode())) * 31;
        UMShareListener uMShareListener = this.shareListener;
        int iHashCode6 = (iHashCode5 + (uMShareListener == null ? 0 : uMShareListener.hashCode())) * 31;
        List<? extends PostOptionObj> list = this.shareActionList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.shareFilePath;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<? extends PostOptionObj> list2 = this.extraShareActionList;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        View view = this.customTitleView;
        int iHashCode10 = (iHashCode9 + (view == null ? 0 : view.hashCode())) * 31;
        String str5 = this.can_not_share_tips;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCanCopyUrl(boolean z10) {
        this.canCopyUrl = z10;
    }

    public final void setCan_not_share_tips(@e String str) {
        this.can_not_share_tips = str;
    }

    public final void setCustomTitleView(@e View view) {
        this.customTitleView = view;
    }

    public final void setExtraOpts(@e Bundle bundle) {
        this.extraOpts = bundle;
    }

    public final void setExtraShareActionList(@e List<? extends PostOptionObj> list) {
        this.extraShareActionList = list;
    }

    public final void setOnlyShareImage(boolean z10) {
        this.onlyShareImage = z10;
    }

    public final void setReport_extra(@e JsonObject jsonObject) {
        this.report_extra = jsonObject;
    }

    public final void setShareActionList(@e List<? extends PostOptionObj> list) {
        this.shareActionList = list;
    }

    public final void setShareFilePath(@e String str) {
        this.shareFilePath = str;
    }

    public final void setShareListener(@e UMShareListener uMShareListener) {
        this.shareListener = uMShareListener;
    }

    public final void setTargetUrl(@e String str) {
        this.targetUrl = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUmImage(@e UMImage uMImage) {
        this.umImage = uMImage;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Fa, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HBShareData(onlyShareImage=" + this.onlyShareImage + ", canCopyUrl=" + this.canCopyUrl + ", title=" + this.title + ", text=" + this.text + ", targetUrl=" + this.targetUrl + ", extraOpts=" + this.extraOpts + ", umImage=" + this.umImage + ", shareListener=" + this.shareListener + ", shareActionList=" + this.shareActionList + ", shareFilePath=" + this.shareFilePath + ", extraShareActionList=" + this.extraShareActionList + ", customTitleView=" + this.customTitleView + ", can_not_share_tips=" + this.can_not_share_tips + ')';
    }
}
