package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.xiaoheihe.bean.bbs.LinkSpecialTagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeyboxGameOfficialCommentTipObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HeyboxGameOfficialCommentTipObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String desc;

    @e
    private String protocol;

    @SerializedName("special_tag")
    @e
    private LinkSpecialTagObj specialTag;

    @SerializedName("user_id")
    @e
    private String userId;

    @e
    private String username;

    public HeyboxGameOfficialCommentTipObj(@e String str, @e String str2, @e String str3, @e LinkSpecialTagObj linkSpecialTagObj, @e String str4, @e String str5) {
        this.userId = str;
        this.username = str2;
        this.avatar = str3;
        this.specialTag = linkSpecialTagObj;
        this.desc = str4;
        this.protocol = str5;
    }

    public static /* synthetic */ HeyboxGameOfficialCommentTipObj copy$default(HeyboxGameOfficialCommentTipObj heyboxGameOfficialCommentTipObj, String str, String str2, String str3, LinkSpecialTagObj linkSpecialTagObj, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{heyboxGameOfficialCommentTipObj, str, str2, str3, linkSpecialTagObj, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14899, new Class[]{HeyboxGameOfficialCommentTipObj.class, String.class, String.class, String.class, LinkSpecialTagObj.class, String.class, String.class, Integer.TYPE, Object.class}, HeyboxGameOfficialCommentTipObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyboxGameOfficialCommentTipObj) patchProxyResultProxy.result;
        }
        return heyboxGameOfficialCommentTipObj.copy((i10 & 1) != 0 ? heyboxGameOfficialCommentTipObj.userId : str, (i10 & 2) != 0 ? heyboxGameOfficialCommentTipObj.username : str2, (i10 & 4) != 0 ? heyboxGameOfficialCommentTipObj.avatar : str3, (i10 & 8) != 0 ? heyboxGameOfficialCommentTipObj.specialTag : linkSpecialTagObj, (i10 & 16) != 0 ? heyboxGameOfficialCommentTipObj.desc : str4, (i10 & 32) != 0 ? heyboxGameOfficialCommentTipObj.protocol : str5);
    }

    @e
    public final String component1() {
        return this.userId;
    }

    @e
    public final String component2() {
        return this.username;
    }

    @e
    public final String component3() {
        return this.avatar;
    }

    @e
    public final LinkSpecialTagObj component4() {
        return this.specialTag;
    }

    @e
    public final String component5() {
        return this.desc;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @d
    public final HeyboxGameOfficialCommentTipObj copy(@e String str, @e String str2, @e String str3, @e LinkSpecialTagObj linkSpecialTagObj, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, linkSpecialTagObj, str4, str5}, this, changeQuickRedirect, false, 14898, new Class[]{String.class, String.class, String.class, LinkSpecialTagObj.class, String.class, String.class}, HeyboxGameOfficialCommentTipObj.class);
        return patchProxyResultProxy.isSupported ? (HeyboxGameOfficialCommentTipObj) patchProxyResultProxy.result : new HeyboxGameOfficialCommentTipObj(str, str2, str3, linkSpecialTagObj, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14902, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeyboxGameOfficialCommentTipObj)) {
            return false;
        }
        HeyboxGameOfficialCommentTipObj heyboxGameOfficialCommentTipObj = (HeyboxGameOfficialCommentTipObj) obj;
        return f0.g(this.userId, heyboxGameOfficialCommentTipObj.userId) && f0.g(this.username, heyboxGameOfficialCommentTipObj.username) && f0.g(this.avatar, heyboxGameOfficialCommentTipObj.avatar) && f0.g(this.specialTag, heyboxGameOfficialCommentTipObj.specialTag) && f0.g(this.desc, heyboxGameOfficialCommentTipObj.desc) && f0.g(this.protocol, heyboxGameOfficialCommentTipObj.protocol);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final LinkSpecialTagObj getSpecialTag() {
        return this.specialTag;
    }

    @e
    public final String getUserId() {
        return this.userId;
    }

    @e
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14901, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LinkSpecialTagObj linkSpecialTagObj = this.specialTag;
        int iHashCode4 = (iHashCode3 + (linkSpecialTagObj == null ? 0 : linkSpecialTagObj.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setSpecialTag(@e LinkSpecialTagObj linkSpecialTagObj) {
        this.specialTag = linkSpecialTagObj;
    }

    public final void setUserId(@e String str) {
        this.userId = str;
    }

    public final void setUsername(@e String str) {
        this.username = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14900, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeyboxGameOfficialCommentTipObj(userId=" + this.userId + ", username=" + this.username + ", avatar=" + this.avatar + ", specialTag=" + this.specialTag + ", desc=" + this.desc + ", protocol=" + this.protocol + ')';
    }
}
