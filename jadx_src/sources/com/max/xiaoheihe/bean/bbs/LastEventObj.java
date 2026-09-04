package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LastEventObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class LastEventObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String comment_num;

    @e
    private String create_at;

    @e
    private String dvp_protocol;

    @e
    private String has_video;

    @e
    private String link_id;

    @e
    private String link_tag;

    @e
    private String title;

    @e
    private BBSUserInfoObj user;

    public LastEventObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e BBSUserInfoObj bBSUserInfoObj, @e String str7) {
        this.link_id = str;
        this.title = str2;
        this.comment_num = str3;
        this.create_at = str4;
        this.link_tag = str5;
        this.has_video = str6;
        this.user = bBSUserInfoObj;
        this.dvp_protocol = str7;
    }

    public static /* synthetic */ LastEventObj copy$default(LastEventObj lastEventObj, String str, String str2, String str3, String str4, String str5, String str6, BBSUserInfoObj bBSUserInfoObj, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{lastEventObj, str, str2, str3, str4, str5, str6, bBSUserInfoObj, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 14318, new Class[]{LastEventObj.class, String.class, String.class, String.class, String.class, String.class, String.class, BBSUserInfoObj.class, String.class, Integer.TYPE, Object.class}, LastEventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LastEventObj) patchProxyResultProxy.result;
        }
        return lastEventObj.copy((i10 & 1) != 0 ? lastEventObj.link_id : str, (i10 & 2) != 0 ? lastEventObj.title : str2, (i10 & 4) != 0 ? lastEventObj.comment_num : str3, (i10 & 8) != 0 ? lastEventObj.create_at : str4, (i10 & 16) != 0 ? lastEventObj.link_tag : str5, (i10 & 32) != 0 ? lastEventObj.has_video : str6, (i10 & 64) != 0 ? lastEventObj.user : bBSUserInfoObj, (i10 & 128) != 0 ? lastEventObj.dvp_protocol : str7);
    }

    @e
    public final String component1() {
        return this.link_id;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.comment_num;
    }

    @e
    public final String component4() {
        return this.create_at;
    }

    @e
    public final String component5() {
        return this.link_tag;
    }

    @e
    public final String component6() {
        return this.has_video;
    }

    @e
    public final BBSUserInfoObj component7() {
        return this.user;
    }

    @e
    public final String component8() {
        return this.dvp_protocol;
    }

    @d
    public final LastEventObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e BBSUserInfoObj bBSUserInfoObj, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, bBSUserInfoObj, str7}, this, changeQuickRedirect, false, 14317, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, BBSUserInfoObj.class, String.class}, LastEventObj.class);
        return patchProxyResultProxy.isSupported ? (LastEventObj) patchProxyResultProxy.result : new LastEventObj(str, str2, str3, str4, str5, str6, bBSUserInfoObj, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14321, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastEventObj)) {
            return false;
        }
        LastEventObj lastEventObj = (LastEventObj) obj;
        return f0.g(this.link_id, lastEventObj.link_id) && f0.g(this.title, lastEventObj.title) && f0.g(this.comment_num, lastEventObj.comment_num) && f0.g(this.create_at, lastEventObj.create_at) && f0.g(this.link_tag, lastEventObj.link_tag) && f0.g(this.has_video, lastEventObj.has_video) && f0.g(this.user, lastEventObj.user) && f0.g(this.dvp_protocol, lastEventObj.dvp_protocol);
    }

    @e
    public final String getComment_num() {
        return this.comment_num;
    }

    @e
    public final String getCreate_at() {
        return this.create_at;
    }

    @e
    public final String getDvp_protocol() {
        return this.dvp_protocol;
    }

    @e
    public final String getHas_video() {
        return this.has_video;
    }

    @e
    public final String getLink_id() {
        return this.link_id;
    }

    @e
    public final String getLink_tag() {
        return this.link_tag;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final BBSUserInfoObj getUser() {
        return this.user;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14320, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.link_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment_num;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.create_at;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.link_tag;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.has_video;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user;
        int iHashCode7 = (iHashCode6 + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        String str7 = this.dvp_protocol;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setComment_num(@e String str) {
        this.comment_num = str;
    }

    public final void setCreate_at(@e String str) {
        this.create_at = str;
    }

    public final void setDvp_protocol(@e String str) {
        this.dvp_protocol = str;
    }

    public final void setHas_video(@e String str) {
        this.has_video = str;
    }

    public final void setLink_id(@e String str) {
        this.link_id = str;
    }

    public final void setLink_tag(@e String str) {
        this.link_tag = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setUser(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14319, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LastEventObj(link_id=" + this.link_id + ", title=" + this.title + ", comment_num=" + this.comment_num + ", create_at=" + this.create_at + ", link_tag=" + this.link_tag + ", has_video=" + this.has_video + ", user=" + this.user + ", dvp_protocol=" + this.dvp_protocol + ')';
    }
}
