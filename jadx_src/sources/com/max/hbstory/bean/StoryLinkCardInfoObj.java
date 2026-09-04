package com.max.hbstory.bean;

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
public final class StoryLinkCardInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String description;

    @e
    private StoryImgInfoObj img_info;

    @e
    private StoryStatInfoObj stat_info;

    @e
    private String title;

    @e
    private StoryBBSUserInfoObj user_info;

    @e
    private StoryVideoInfoObj video_info;

    public StoryLinkCardInfoObj() {
        this(null, null, null, null, null, null, 63, null);
    }

    public StoryLinkCardInfoObj(@e String str, @e String str2, @e StoryBBSUserInfoObj storyBBSUserInfoObj, @e StoryStatInfoObj storyStatInfoObj, @e StoryImgInfoObj storyImgInfoObj, @e StoryVideoInfoObj storyVideoInfoObj) {
        this.description = str;
        this.title = str2;
        this.user_info = storyBBSUserInfoObj;
        this.stat_info = storyStatInfoObj;
        this.img_info = storyImgInfoObj;
        this.video_info = storyVideoInfoObj;
    }

    public /* synthetic */ StoryLinkCardInfoObj(String str, String str2, StoryBBSUserInfoObj storyBBSUserInfoObj, StoryStatInfoObj storyStatInfoObj, StoryImgInfoObj storyImgInfoObj, StoryVideoInfoObj storyVideoInfoObj, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : storyBBSUserInfoObj, (i10 & 8) != 0 ? null : storyStatInfoObj, (i10 & 16) != 0 ? null : storyImgInfoObj, (i10 & 32) != 0 ? null : storyVideoInfoObj);
    }

    public static /* synthetic */ StoryLinkCardInfoObj copy$default(StoryLinkCardInfoObj storyLinkCardInfoObj, String str, String str2, StoryBBSUserInfoObj storyBBSUserInfoObj, StoryStatInfoObj storyStatInfoObj, StoryImgInfoObj storyImgInfoObj, StoryVideoInfoObj storyVideoInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyLinkCardInfoObj, str, str2, storyBBSUserInfoObj, storyStatInfoObj, storyImgInfoObj, storyVideoInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.f33551fe, new Class[]{StoryLinkCardInfoObj.class, String.class, String.class, StoryBBSUserInfoObj.class, StoryStatInfoObj.class, StoryImgInfoObj.class, StoryVideoInfoObj.class, Integer.TYPE, Object.class}, StoryLinkCardInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryLinkCardInfoObj) patchProxyResultProxy.result;
        }
        return storyLinkCardInfoObj.copy((i10 & 1) != 0 ? storyLinkCardInfoObj.description : str, (i10 & 2) != 0 ? storyLinkCardInfoObj.title : str2, (i10 & 4) != 0 ? storyLinkCardInfoObj.user_info : storyBBSUserInfoObj, (i10 & 8) != 0 ? storyLinkCardInfoObj.stat_info : storyStatInfoObj, (i10 & 16) != 0 ? storyLinkCardInfoObj.img_info : storyImgInfoObj, (i10 & 32) != 0 ? storyLinkCardInfoObj.video_info : storyVideoInfoObj);
    }

    @e
    public final String component1() {
        return this.description;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final StoryBBSUserInfoObj component3() {
        return this.user_info;
    }

    @e
    public final StoryStatInfoObj component4() {
        return this.stat_info;
    }

    @e
    public final StoryImgInfoObj component5() {
        return this.img_info;
    }

    @e
    public final StoryVideoInfoObj component6() {
        return this.video_info;
    }

    @d
    public final StoryLinkCardInfoObj copy(@e String str, @e String str2, @e StoryBBSUserInfoObj storyBBSUserInfoObj, @e StoryStatInfoObj storyStatInfoObj, @e StoryImgInfoObj storyImgInfoObj, @e StoryVideoInfoObj storyVideoInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, storyBBSUserInfoObj, storyStatInfoObj, storyImgInfoObj, storyVideoInfoObj}, this, changeQuickRedirect, false, c.k.f33528ee, new Class[]{String.class, String.class, StoryBBSUserInfoObj.class, StoryStatInfoObj.class, StoryImgInfoObj.class, StoryVideoInfoObj.class}, StoryLinkCardInfoObj.class);
        return patchProxyResultProxy.isSupported ? (StoryLinkCardInfoObj) patchProxyResultProxy.result : new StoryLinkCardInfoObj(str, str2, storyBBSUserInfoObj, storyStatInfoObj, storyImgInfoObj, storyVideoInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.f33620ie, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryLinkCardInfoObj)) {
            return false;
        }
        StoryLinkCardInfoObj storyLinkCardInfoObj = (StoryLinkCardInfoObj) obj;
        return f0.g(this.description, storyLinkCardInfoObj.description) && f0.g(this.title, storyLinkCardInfoObj.title) && f0.g(this.user_info, storyLinkCardInfoObj.user_info) && f0.g(this.stat_info, storyLinkCardInfoObj.stat_info) && f0.g(this.img_info, storyLinkCardInfoObj.img_info) && f0.g(this.video_info, storyLinkCardInfoObj.video_info);
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final StoryImgInfoObj getImg_info() {
        return this.img_info;
    }

    @e
    public final StoryStatInfoObj getStat_info() {
        return this.stat_info;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final StoryBBSUserInfoObj getUser_info() {
        return this.user_info;
    }

    @e
    public final StoryVideoInfoObj getVideo_info() {
        return this.video_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33597he, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        StoryBBSUserInfoObj storyBBSUserInfoObj = this.user_info;
        int iHashCode3 = (iHashCode2 + (storyBBSUserInfoObj == null ? 0 : storyBBSUserInfoObj.hashCode())) * 31;
        StoryStatInfoObj storyStatInfoObj = this.stat_info;
        int iHashCode4 = (iHashCode3 + (storyStatInfoObj == null ? 0 : storyStatInfoObj.hashCode())) * 31;
        StoryImgInfoObj storyImgInfoObj = this.img_info;
        int iHashCode5 = (iHashCode4 + (storyImgInfoObj == null ? 0 : storyImgInfoObj.hashCode())) * 31;
        StoryVideoInfoObj storyVideoInfoObj = this.video_info;
        return iHashCode5 + (storyVideoInfoObj != null ? storyVideoInfoObj.hashCode() : 0);
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setImg_info(@e StoryImgInfoObj storyImgInfoObj) {
        this.img_info = storyImgInfoObj;
    }

    public final void setStat_info(@e StoryStatInfoObj storyStatInfoObj) {
        this.stat_info = storyStatInfoObj;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUser_info(@e StoryBBSUserInfoObj storyBBSUserInfoObj) {
        this.user_info = storyBBSUserInfoObj;
    }

    public final void setVideo_info(@e StoryVideoInfoObj storyVideoInfoObj) {
        this.video_info = storyVideoInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.f33574ge, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StoryLinkCardInfoObj(description=" + this.description + ", title=" + this.title + ", user_info=" + this.user_info + ", stat_info=" + this.stat_info + ", img_info=" + this.img_info + ", video_info=" + this.video_info + ')';
    }
}
