package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LinkCardInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String description;

    @e
    private List<FeedbackInfo> feedback_info;

    @e
    private ImgInfoObj img_info;

    @e
    private StatInfoObj stat_info;

    @e
    private String title;

    @e
    private BBSUserInfoObj user_info;

    @e
    private VideoInfoObj video_info;

    public LinkCardInfoObj() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public LinkCardInfoObj(@e List<FeedbackInfo> list, @e String str, @e String str2, @e BBSUserInfoObj bBSUserInfoObj, @e StatInfoObj statInfoObj, @e ImgInfoObj imgInfoObj, @e VideoInfoObj videoInfoObj) {
        this.feedback_info = list;
        this.description = str;
        this.title = str2;
        this.user_info = bBSUserInfoObj;
        this.stat_info = statInfoObj;
        this.img_info = imgInfoObj;
        this.video_info = videoInfoObj;
    }

    public /* synthetic */ LinkCardInfoObj(List list, String str, String str2, BBSUserInfoObj bBSUserInfoObj, StatInfoObj statInfoObj, ImgInfoObj imgInfoObj, VideoInfoObj videoInfoObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : bBSUserInfoObj, (i10 & 16) != 0 ? null : statInfoObj, (i10 & 32) != 0 ? null : imgInfoObj, (i10 & 64) != 0 ? null : videoInfoObj);
    }

    public static /* synthetic */ LinkCardInfoObj copy$default(LinkCardInfoObj linkCardInfoObj, List list, String str, String str2, BBSUserInfoObj bBSUserInfoObj, StatInfoObj statInfoObj, ImgInfoObj imgInfoObj, VideoInfoObj videoInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkCardInfoObj, list, str, str2, bBSUserInfoObj, statInfoObj, imgInfoObj, videoInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15959, new Class[]{LinkCardInfoObj.class, List.class, String.class, String.class, BBSUserInfoObj.class, StatInfoObj.class, ImgInfoObj.class, VideoInfoObj.class, Integer.TYPE, Object.class}, LinkCardInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkCardInfoObj) patchProxyResultProxy.result;
        }
        return linkCardInfoObj.copy((i10 & 1) != 0 ? linkCardInfoObj.feedback_info : list, (i10 & 2) != 0 ? linkCardInfoObj.description : str, (i10 & 4) != 0 ? linkCardInfoObj.title : str2, (i10 & 8) != 0 ? linkCardInfoObj.user_info : bBSUserInfoObj, (i10 & 16) != 0 ? linkCardInfoObj.stat_info : statInfoObj, (i10 & 32) != 0 ? linkCardInfoObj.img_info : imgInfoObj, (i10 & 64) != 0 ? linkCardInfoObj.video_info : videoInfoObj);
    }

    @e
    public final List<FeedbackInfo> component1() {
        return this.feedback_info;
    }

    @e
    public final String component2() {
        return this.description;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final BBSUserInfoObj component4() {
        return this.user_info;
    }

    @e
    public final StatInfoObj component5() {
        return this.stat_info;
    }

    @e
    public final ImgInfoObj component6() {
        return this.img_info;
    }

    @e
    public final VideoInfoObj component7() {
        return this.video_info;
    }

    @d
    public final LinkCardInfoObj copy(@e List<FeedbackInfo> list, @e String str, @e String str2, @e BBSUserInfoObj bBSUserInfoObj, @e StatInfoObj statInfoObj, @e ImgInfoObj imgInfoObj, @e VideoInfoObj videoInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2, bBSUserInfoObj, statInfoObj, imgInfoObj, videoInfoObj}, this, changeQuickRedirect, false, 15958, new Class[]{List.class, String.class, String.class, BBSUserInfoObj.class, StatInfoObj.class, ImgInfoObj.class, VideoInfoObj.class}, LinkCardInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LinkCardInfoObj) patchProxyResultProxy.result : new LinkCardInfoObj(list, str, str2, bBSUserInfoObj, statInfoObj, imgInfoObj, videoInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15962, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkCardInfoObj)) {
            return false;
        }
        LinkCardInfoObj linkCardInfoObj = (LinkCardInfoObj) obj;
        return f0.g(this.feedback_info, linkCardInfoObj.feedback_info) && f0.g(this.description, linkCardInfoObj.description) && f0.g(this.title, linkCardInfoObj.title) && f0.g(this.user_info, linkCardInfoObj.user_info) && f0.g(this.stat_info, linkCardInfoObj.stat_info) && f0.g(this.img_info, linkCardInfoObj.img_info) && f0.g(this.video_info, linkCardInfoObj.video_info);
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final List<FeedbackInfo> getFeedback_info() {
        return this.feedback_info;
    }

    @e
    public final ImgInfoObj getImg_info() {
        return this.img_info;
    }

    @e
    public final StatInfoObj getStat_info() {
        return this.stat_info;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final BBSUserInfoObj getUser_info() {
        return this.user_info;
    }

    @e
    public final VideoInfoObj getVideo_info() {
        return this.video_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15961, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<FeedbackInfo> list = this.feedback_info;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user_info;
        int iHashCode4 = (iHashCode3 + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        StatInfoObj statInfoObj = this.stat_info;
        int iHashCode5 = (iHashCode4 + (statInfoObj == null ? 0 : statInfoObj.hashCode())) * 31;
        ImgInfoObj imgInfoObj = this.img_info;
        int iHashCode6 = (iHashCode5 + (imgInfoObj == null ? 0 : imgInfoObj.hashCode())) * 31;
        VideoInfoObj videoInfoObj = this.video_info;
        return iHashCode6 + (videoInfoObj != null ? videoInfoObj.hashCode() : 0);
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setFeedback_info(@e List<FeedbackInfo> list) {
        this.feedback_info = list;
    }

    public final void setImg_info(@e ImgInfoObj imgInfoObj) {
        this.img_info = imgInfoObj;
    }

    public final void setStat_info(@e StatInfoObj statInfoObj) {
        this.stat_info = statInfoObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUser_info(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user_info = bBSUserInfoObj;
    }

    public final void setVideo_info(@e VideoInfoObj videoInfoObj) {
        this.video_info = videoInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15960, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LinkCardInfoObj(feedback_info=" + this.feedback_info + ", description=" + this.description + ", title=" + this.title + ", user_info=" + this.user_info + ", stat_info=" + this.stat_info + ", img_info=" + this.img_info + ", video_info=" + this.video_info + ')';
    }
}
