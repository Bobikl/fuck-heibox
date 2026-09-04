package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AccountInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private AvatarDecorationObj avatar_decoration;

    @e
    private LevelInfoObj level_info;

    @e
    private String userid;

    @e
    private String username;

    public AccountInfoObj(@e String str, @e String str2, @e AvatarDecorationObj avatarDecorationObj, @e String str3, @e LevelInfoObj levelInfoObj) {
        this.username = str;
        this.userid = str2;
        this.avatar_decoration = avatarDecorationObj;
        this.avatar = str3;
        this.level_info = levelInfoObj;
    }

    public static /* synthetic */ AccountInfoObj copy$default(AccountInfoObj accountInfoObj, String str, String str2, AvatarDecorationObj avatarDecorationObj, String str3, LevelInfoObj levelInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountInfoObj, str, str2, avatarDecorationObj, str3, levelInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.f30732jj, new Class[]{AccountInfoObj.class, String.class, String.class, AvatarDecorationObj.class, String.class, LevelInfoObj.class, Integer.TYPE, Object.class}, AccountInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AccountInfoObj) patchProxyResultProxy.result;
        }
        return accountInfoObj.copy((i10 & 1) != 0 ? accountInfoObj.username : str, (i10 & 2) != 0 ? accountInfoObj.userid : str2, (i10 & 4) != 0 ? accountInfoObj.avatar_decoration : avatarDecorationObj, (i10 & 8) != 0 ? accountInfoObj.avatar : str3, (i10 & 16) != 0 ? accountInfoObj.level_info : levelInfoObj);
    }

    @e
    public final String component1() {
        return this.username;
    }

    @e
    public final String component2() {
        return this.userid;
    }

    @e
    public final AvatarDecorationObj component3() {
        return this.avatar_decoration;
    }

    @e
    public final String component4() {
        return this.avatar;
    }

    @e
    public final LevelInfoObj component5() {
        return this.level_info;
    }

    @d
    public final AccountInfoObj copy(@e String str, @e String str2, @e AvatarDecorationObj avatarDecorationObj, @e String str3, @e LevelInfoObj levelInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, avatarDecorationObj, str3, levelInfoObj}, this, changeQuickRedirect, false, c.b.f30708ij, new Class[]{String.class, String.class, AvatarDecorationObj.class, String.class, LevelInfoObj.class}, AccountInfoObj.class);
        return patchProxyResultProxy.isSupported ? (AccountInfoObj) patchProxyResultProxy.result : new AccountInfoObj(str, str2, avatarDecorationObj, str3, levelInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.f30801mj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoObj)) {
            return false;
        }
        AccountInfoObj accountInfoObj = (AccountInfoObj) obj;
        return f0.g(this.username, accountInfoObj.username) && f0.g(this.userid, accountInfoObj.userid) && f0.g(this.avatar_decoration, accountInfoObj.avatar_decoration) && f0.g(this.avatar, accountInfoObj.avatar) && f0.g(this.level_info, accountInfoObj.level_info);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final AvatarDecorationObj getAvatar_decoration() {
        return this.avatar_decoration;
    }

    @e
    public final LevelInfoObj getLevel_info() {
        return this.level_info;
    }

    @e
    public final String getUserid() {
        return this.userid;
    }

    @e
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30778lj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AvatarDecorationObj avatarDecorationObj = this.avatar_decoration;
        int iHashCode3 = (iHashCode2 + (avatarDecorationObj == null ? 0 : avatarDecorationObj.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LevelInfoObj levelInfoObj = this.level_info;
        return iHashCode4 + (levelInfoObj != null ? levelInfoObj.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setAvatar_decoration(@e AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public final void setLevel_info(@e LevelInfoObj levelInfoObj) {
        this.level_info = levelInfoObj;
    }

    public final void setUserid(@e String str) {
        this.userid = str;
    }

    public final void setUsername(@e String str) {
        this.username = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30755kj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AccountInfoObj(username=" + this.username + ", userid=" + this.userid + ", avatar_decoration=" + this.avatar_decoration + ", avatar=" + this.avatar + ", level_info=" + this.level_info + ')';
    }
}
