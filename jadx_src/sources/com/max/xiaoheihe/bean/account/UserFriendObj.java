package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserFriendObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserFriendObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private AvatarDecorationObj avatar_decoration;

    @e
    private String friend_state;

    @e
    private Boolean is_send;

    @e
    private String message;

    @e
    private String nickname;

    @e
    private String online_desc;

    @e
    private String remarks;

    @SerializedName(alternate = {"online_state"}, value = "state")
    @e
    private String state;

    @e
    private String user_id;

    @e
    private String view_state;

    public UserFriendObj(@e String str, @e String str2, @e AvatarDecorationObj avatarDecorationObj, @e String str3, @e @JSONField(alternateNames = {"online_state"}, name = "state") String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e Boolean bool) {
        this.user_id = str;
        this.avatar = str2;
        this.avatar_decoration = avatarDecorationObj;
        this.nickname = str3;
        this.state = str4;
        this.online_desc = str5;
        this.message = str6;
        this.friend_state = str7;
        this.remarks = str8;
        this.view_state = str9;
        this.is_send = bool;
    }

    public static /* synthetic */ UserFriendObj copy$default(UserFriendObj userFriendObj, String str, String str2, AvatarDecorationObj avatarDecorationObj, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userFriendObj, str, str2, avatarDecorationObj, str3, str4, str5, str6, str7, str8, str9, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 14006, new Class[]{UserFriendObj.class, String.class, String.class, AvatarDecorationObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.TYPE, Object.class}, UserFriendObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserFriendObj) patchProxyResultProxy.result;
        }
        return userFriendObj.copy((i10 & 1) != 0 ? userFriendObj.user_id : str, (i10 & 2) != 0 ? userFriendObj.avatar : str2, (i10 & 4) != 0 ? userFriendObj.avatar_decoration : avatarDecorationObj, (i10 & 8) != 0 ? userFriendObj.nickname : str3, (i10 & 16) != 0 ? userFriendObj.state : str4, (i10 & 32) != 0 ? userFriendObj.online_desc : str5, (i10 & 64) != 0 ? userFriendObj.message : str6, (i10 & 128) != 0 ? userFriendObj.friend_state : str7, (i10 & 256) != 0 ? userFriendObj.remarks : str8, (i10 & 512) != 0 ? userFriendObj.view_state : str9, (i10 & 1024) != 0 ? userFriendObj.is_send : bool);
    }

    @e
    public final String component1() {
        return this.user_id;
    }

    @e
    public final String component10() {
        return this.view_state;
    }

    @e
    public final Boolean component11() {
        return this.is_send;
    }

    @e
    public final String component2() {
        return this.avatar;
    }

    @e
    public final AvatarDecorationObj component3() {
        return this.avatar_decoration;
    }

    @e
    public final String component4() {
        return this.nickname;
    }

    @e
    public final String component5() {
        return this.state;
    }

    @e
    public final String component6() {
        return this.online_desc;
    }

    @e
    public final String component7() {
        return this.message;
    }

    @e
    public final String component8() {
        return this.friend_state;
    }

    @e
    public final String component9() {
        return this.remarks;
    }

    @d
    public final UserFriendObj copy(@e String str, @e String str2, @e AvatarDecorationObj avatarDecorationObj, @e String str3, @e @JSONField(alternateNames = {"online_state"}, name = "state") String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, avatarDecorationObj, str3, str4, str5, str6, str7, str8, str9, bool}, this, changeQuickRedirect, false, 14005, new Class[]{String.class, String.class, AvatarDecorationObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, UserFriendObj.class);
        return patchProxyResultProxy.isSupported ? (UserFriendObj) patchProxyResultProxy.result : new UserFriendObj(str, str2, avatarDecorationObj, str3, str4, str5, str6, str7, str8, str9, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14009, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFriendObj)) {
            return false;
        }
        UserFriendObj userFriendObj = (UserFriendObj) obj;
        return f0.g(this.user_id, userFriendObj.user_id) && f0.g(this.avatar, userFriendObj.avatar) && f0.g(this.avatar_decoration, userFriendObj.avatar_decoration) && f0.g(this.nickname, userFriendObj.nickname) && f0.g(this.state, userFriendObj.state) && f0.g(this.online_desc, userFriendObj.online_desc) && f0.g(this.message, userFriendObj.message) && f0.g(this.friend_state, userFriendObj.friend_state) && f0.g(this.remarks, userFriendObj.remarks) && f0.g(this.view_state, userFriendObj.view_state) && f0.g(this.is_send, userFriendObj.is_send);
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
    public final String getFriend_state() {
        return this.friend_state;
    }

    @e
    public final String getMessage() {
        return this.message;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final String getOnline_desc() {
        return this.online_desc;
    }

    @e
    public final String getRemarks() {
        return this.remarks;
    }

    @e
    public final String getState() {
        return this.state;
    }

    @e
    public final String getUser_id() {
        return this.user_id;
    }

    @e
    public final String getView_state() {
        return this.view_state;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14008, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.user_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AvatarDecorationObj avatarDecorationObj = this.avatar_decoration;
        int iHashCode3 = (iHashCode2 + (avatarDecorationObj == null ? 0 : avatarDecorationObj.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.online_desc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.message;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.friend_state;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.remarks;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.view_state;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.is_send;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    @e
    public final Boolean is_send() {
        return this.is_send;
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setAvatar_decoration(@e AvatarDecorationObj avatarDecorationObj) {
        this.avatar_decoration = avatarDecorationObj;
    }

    public final void setFriend_state(@e String str) {
        this.friend_state = str;
    }

    public final void setMessage(@e String str) {
        this.message = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setOnline_desc(@e String str) {
        this.online_desc = str;
    }

    public final void setRemarks(@e String str) {
        this.remarks = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void setUser_id(@e String str) {
        this.user_id = str;
    }

    public final void setView_state(@e String str) {
        this.view_state = str;
    }

    public final void set_send(@e Boolean bool) {
        this.is_send = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14007, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserFriendObj(user_id=" + this.user_id + ", avatar=" + this.avatar + ", avatar_decoration=" + this.avatar_decoration + ", nickname=" + this.nickname + ", state=" + this.state + ", online_desc=" + this.online_desc + ", message=" + this.message + ", friend_state=" + this.friend_state + ", remarks=" + this.remarks + ", view_state=" + this.view_state + ", is_send=" + this.is_send + ')';
    }
}
