package com.max.xiaoheihe.bean.share;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.o;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ShareImageDialogConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ShareImageDialogConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String default_content;

    @e
    private String douyin_bg_url;

    @e
    private String douyin_hashtag;

    @e
    private List<String> hashtags;

    @e
    private String image_src;

    @e
    private String postTips;

    @e
    private String post_card_ids;

    @e
    private String post_extra_params;

    @e
    private String qr_code;

    @e
    private Bitmap qr_code_bitmap;

    @e
    private ScreenStyleInfoObj screenStyleInfo;

    @e
    private String share_title;

    @e
    private String share_url;

    @e
    private Bitmap singleBitmap;

    @e
    private List<BBSTopicObj> topicList;

    public ShareImageDialogConfigObj(@e String str, @e String str2, @e String str3, @e String str4, @e List<BBSTopicObj> list, @e String str5, @e String str6, @e Bitmap bitmap, @e List<String> list2, @e String str7, @e Bitmap bitmap2, @e ScreenStyleInfoObj screenStyleInfoObj, @e String str8, @e String str9, @e String str10) {
        this.share_title = str;
        this.share_url = str2;
        this.qr_code = str3;
        this.image_src = str4;
        this.topicList = list;
        this.douyin_hashtag = str5;
        this.douyin_bg_url = str6;
        this.qr_code_bitmap = bitmap;
        this.hashtags = list2;
        this.default_content = str7;
        this.singleBitmap = bitmap2;
        this.screenStyleInfo = screenStyleInfoObj;
        this.post_extra_params = str8;
        this.postTips = str9;
        this.post_card_ids = str10;
    }

    public /* synthetic */ ShareImageDialogConfigObj(String str, String str2, String str3, String str4, List list, String str5, String str6, Bitmap bitmap, List list2, String str7, Bitmap bitmap2, ScreenStyleInfoObj screenStyleInfoObj, String str8, String str9, String str10, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : bitmap, (i10 & 256) != 0 ? null : list2, str7, (i10 & 1024) != 0 ? null : bitmap2, (i10 & 2048) != 0 ? null : screenStyleInfoObj, (i10 & 4096) != 0 ? null : str8, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10);
    }

    public static /* synthetic */ ShareImageDialogConfigObj copy$default(ShareImageDialogConfigObj shareImageDialogConfigObj, String str, String str2, String str3, String str4, List list, String str5, String str6, Bitmap bitmap, List list2, String str7, Bitmap bitmap2, ScreenStyleInfoObj screenStyleInfoObj, String str8, String str9, String str10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareImageDialogConfigObj, str, str2, str3, str4, list, str5, str6, bitmap, list2, str7, bitmap2, screenStyleInfoObj, str8, str9, str10, new Integer(i10), obj}, null, changeQuickRedirect, true, 15928, new Class[]{ShareImageDialogConfigObj.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, Bitmap.class, List.class, String.class, Bitmap.class, ScreenStyleInfoObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ShareImageDialogConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareImageDialogConfigObj) patchProxyResultProxy.result;
        }
        return shareImageDialogConfigObj.copy((i10 & 1) != 0 ? shareImageDialogConfigObj.share_title : str, (i10 & 2) != 0 ? shareImageDialogConfigObj.share_url : str2, (i10 & 4) != 0 ? shareImageDialogConfigObj.qr_code : str3, (i10 & 8) != 0 ? shareImageDialogConfigObj.image_src : str4, (i10 & 16) != 0 ? shareImageDialogConfigObj.topicList : list, (i10 & 32) != 0 ? shareImageDialogConfigObj.douyin_hashtag : str5, (i10 & 64) != 0 ? shareImageDialogConfigObj.douyin_bg_url : str6, (i10 & 128) != 0 ? shareImageDialogConfigObj.qr_code_bitmap : bitmap, (i10 & 256) != 0 ? shareImageDialogConfigObj.hashtags : list2, (i10 & 512) != 0 ? shareImageDialogConfigObj.default_content : str7, (i10 & 1024) != 0 ? shareImageDialogConfigObj.singleBitmap : bitmap2, (i10 & 2048) != 0 ? shareImageDialogConfigObj.screenStyleInfo : screenStyleInfoObj, (i10 & 4096) != 0 ? shareImageDialogConfigObj.post_extra_params : str8, (i10 & 8192) != 0 ? shareImageDialogConfigObj.postTips : str9, (i10 & 16384) != 0 ? shareImageDialogConfigObj.post_card_ids : str10);
    }

    @e
    public final String component1() {
        return this.share_title;
    }

    @e
    public final String component10() {
        return this.default_content;
    }

    @e
    public final Bitmap component11() {
        return this.singleBitmap;
    }

    @e
    public final ScreenStyleInfoObj component12() {
        return this.screenStyleInfo;
    }

    @e
    public final String component13() {
        return this.post_extra_params;
    }

    @e
    public final String component14() {
        return this.postTips;
    }

    @e
    public final String component15() {
        return this.post_card_ids;
    }

    @e
    public final String component2() {
        return this.share_url;
    }

    @e
    public final String component3() {
        return this.qr_code;
    }

    @e
    public final String component4() {
        return this.image_src;
    }

    @e
    public final List<BBSTopicObj> component5() {
        return this.topicList;
    }

    @e
    public final String component6() {
        return this.douyin_hashtag;
    }

    @e
    public final String component7() {
        return this.douyin_bg_url;
    }

    @e
    public final Bitmap component8() {
        return this.qr_code_bitmap;
    }

    @e
    public final List<String> component9() {
        return this.hashtags;
    }

    @d
    public final ShareImageDialogConfigObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<BBSTopicObj> list, @e String str5, @e String str6, @e Bitmap bitmap, @e List<String> list2, @e String str7, @e Bitmap bitmap2, @e ScreenStyleInfoObj screenStyleInfoObj, @e String str8, @e String str9, @e String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list, str5, str6, bitmap, list2, str7, bitmap2, screenStyleInfoObj, str8, str9, str10}, this, changeQuickRedirect, false, 15927, new Class[]{String.class, String.class, String.class, String.class, List.class, String.class, String.class, Bitmap.class, List.class, String.class, Bitmap.class, ScreenStyleInfoObj.class, String.class, String.class, String.class}, ShareImageDialogConfigObj.class);
        return patchProxyResultProxy.isSupported ? (ShareImageDialogConfigObj) patchProxyResultProxy.result : new ShareImageDialogConfigObj(str, str2, str3, str4, list, str5, str6, bitmap, list2, str7, bitmap2, screenStyleInfoObj, str8, str9, str10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15931, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareImageDialogConfigObj)) {
            return false;
        }
        ShareImageDialogConfigObj shareImageDialogConfigObj = (ShareImageDialogConfigObj) obj;
        return f0.g(this.share_title, shareImageDialogConfigObj.share_title) && f0.g(this.share_url, shareImageDialogConfigObj.share_url) && f0.g(this.qr_code, shareImageDialogConfigObj.qr_code) && f0.g(this.image_src, shareImageDialogConfigObj.image_src) && f0.g(this.topicList, shareImageDialogConfigObj.topicList) && f0.g(this.douyin_hashtag, shareImageDialogConfigObj.douyin_hashtag) && f0.g(this.douyin_bg_url, shareImageDialogConfigObj.douyin_bg_url) && f0.g(this.qr_code_bitmap, shareImageDialogConfigObj.qr_code_bitmap) && f0.g(this.hashtags, shareImageDialogConfigObj.hashtags) && f0.g(this.default_content, shareImageDialogConfigObj.default_content) && f0.g(this.singleBitmap, shareImageDialogConfigObj.singleBitmap) && f0.g(this.screenStyleInfo, shareImageDialogConfigObj.screenStyleInfo) && f0.g(this.post_extra_params, shareImageDialogConfigObj.post_extra_params) && f0.g(this.postTips, shareImageDialogConfigObj.postTips) && f0.g(this.post_card_ids, shareImageDialogConfigObj.post_card_ids);
    }

    @e
    public final String getDefault_content() {
        return this.default_content;
    }

    @e
    public final String getDouyin_bg_url() {
        return this.douyin_bg_url;
    }

    @e
    public final String getDouyin_hashtag() {
        return this.douyin_hashtag;
    }

    @e
    public final List<String> getHashtags() {
        return this.hashtags;
    }

    @e
    public final String getImage_src() {
        return this.image_src;
    }

    @e
    public final String getPostTips() {
        return this.postTips;
    }

    @e
    public final String getPost_card_ids() {
        return this.post_card_ids;
    }

    @e
    public final String getPost_extra_params() {
        return this.post_extra_params;
    }

    @e
    public final String getQr_code() {
        return this.qr_code;
    }

    @e
    public final Bitmap getQr_code_bitmap() {
        return this.qr_code_bitmap;
    }

    @e
    public final ScreenStyleInfoObj getScreenStyleInfo() {
        return this.screenStyleInfo;
    }

    @e
    public final String getShare_title() {
        return this.share_title;
    }

    @e
    public final String getShare_url() {
        return this.share_url;
    }

    @e
    public final Bitmap getSingleBitmap() {
        return this.singleBitmap;
    }

    @e
    public final List<BBSTopicObj> getTopicList() {
        return this.topicList;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15930, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.share_title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.share_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qr_code;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image_src;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BBSTopicObj> list = this.topicList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.douyin_hashtag;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.douyin_bg_url;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Bitmap bitmap = this.qr_code_bitmap;
        int iHashCode8 = (iHashCode7 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        List<String> list2 = this.hashtags;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str7 = this.default_content;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Bitmap bitmap2 = this.singleBitmap;
        int iHashCode11 = (iHashCode10 + (bitmap2 == null ? 0 : bitmap2.hashCode())) * 31;
        ScreenStyleInfoObj screenStyleInfoObj = this.screenStyleInfo;
        int iHashCode12 = (iHashCode11 + (screenStyleInfoObj == null ? 0 : screenStyleInfoObj.hashCode())) * 31;
        String str8 = this.post_extra_params;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postTips;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.post_card_ids;
        return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setDefault_content(@e String str) {
        this.default_content = str;
    }

    public final void setDouyin_bg_url(@e String str) {
        this.douyin_bg_url = str;
    }

    public final void setDouyin_hashtag(@e String str) {
        this.douyin_hashtag = str;
    }

    public final void setHashtags(@e List<String> list) {
        this.hashtags = list;
    }

    public final void setImage_src(@e String str) {
        this.image_src = str;
    }

    public final void setPostTips(@e String str) {
        this.postTips = str;
    }

    public final void setPost_card_ids(@e String str) {
        this.post_card_ids = str;
    }

    public final void setPost_extra_params(@e String str) {
        this.post_extra_params = str;
    }

    public final void setQr_code(@e String str) {
        this.qr_code = str;
    }

    public final void setQr_code_bitmap(@e Bitmap bitmap) {
        this.qr_code_bitmap = bitmap;
    }

    public final void setScreenStyleInfo(@e ScreenStyleInfoObj screenStyleInfoObj) {
        this.screenStyleInfo = screenStyleInfoObj;
    }

    public final void setShare_title(@e String str) {
        this.share_title = str;
    }

    public final void setShare_url(@e String str) {
        this.share_url = str;
    }

    public final void setSingleBitmap(@e Bitmap bitmap) {
        this.singleBitmap = bitmap;
    }

    public final void setTopicList(@e List<BBSTopicObj> list) {
        this.topicList = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15929, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ShareImageDialogConfigObj(share_title=" + this.share_title + ", share_url=" + this.share_url + ", qr_code=" + this.qr_code + ", image_src=" + this.image_src + ", topicList=" + this.topicList + ", douyin_hashtag=" + this.douyin_hashtag + ", douyin_bg_url=" + this.douyin_bg_url + ", qr_code_bitmap=" + this.qr_code_bitmap + ", hashtags=" + this.hashtags + ", default_content=" + this.default_content + ", singleBitmap=" + this.singleBitmap + ", screenStyleInfo=" + this.screenStyleInfo + ", post_extra_params=" + this.post_extra_params + ", postTips=" + this.postTips + ", post_card_ids=" + this.post_card_ids + ')';
    }
}
