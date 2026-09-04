package com.max.xiaoheihe.bean.chat;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FriendsChatRoomObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FriendsChatRoomObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String channel_desc;

    @e
    private String count;

    @e
    private String protocol;

    @e
    private String user_desc;

    @e
    private List<String> users_avatar;

    public FriendsChatRoomObj(@e String str, @e List<String> list, @e String str2, @e String str3, @e String str4) {
        this.count = str;
        this.users_avatar = list;
        this.protocol = str2;
        this.user_desc = str3;
        this.channel_desc = str4;
    }

    public static /* synthetic */ FriendsChatRoomObj copy$default(FriendsChatRoomObj friendsChatRoomObj, String str, List list, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{friendsChatRoomObj, str, list, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14597, new Class[]{FriendsChatRoomObj.class, String.class, List.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, FriendsChatRoomObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FriendsChatRoomObj) patchProxyResultProxy.result;
        }
        return friendsChatRoomObj.copy((i10 & 1) != 0 ? friendsChatRoomObj.count : str, (i10 & 2) != 0 ? friendsChatRoomObj.users_avatar : list, (i10 & 4) != 0 ? friendsChatRoomObj.protocol : str2, (i10 & 8) != 0 ? friendsChatRoomObj.user_desc : str3, (i10 & 16) != 0 ? friendsChatRoomObj.channel_desc : str4);
    }

    @e
    public final String component1() {
        return this.count;
    }

    @e
    public final List<String> component2() {
        return this.users_avatar;
    }

    @e
    public final String component3() {
        return this.protocol;
    }

    @e
    public final String component4() {
        return this.user_desc;
    }

    @e
    public final String component5() {
        return this.channel_desc;
    }

    @d
    public final FriendsChatRoomObj copy(@e String str, @e List<String> list, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2, str3, str4}, this, changeQuickRedirect, false, 14596, new Class[]{String.class, List.class, String.class, String.class, String.class}, FriendsChatRoomObj.class);
        return patchProxyResultProxy.isSupported ? (FriendsChatRoomObj) patchProxyResultProxy.result : new FriendsChatRoomObj(str, list, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14600, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsChatRoomObj)) {
            return false;
        }
        FriendsChatRoomObj friendsChatRoomObj = (FriendsChatRoomObj) obj;
        return f0.g(this.count, friendsChatRoomObj.count) && f0.g(this.users_avatar, friendsChatRoomObj.users_avatar) && f0.g(this.protocol, friendsChatRoomObj.protocol) && f0.g(this.user_desc, friendsChatRoomObj.user_desc) && f0.g(this.channel_desc, friendsChatRoomObj.channel_desc);
    }

    @e
    public final String getChannel_desc() {
        return this.channel_desc;
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getUser_desc() {
        return this.user_desc;
    }

    @e
    public final List<String> getUsers_avatar() {
        return this.users_avatar;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14599, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.users_avatar;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.protocol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user_desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channel_desc;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setChannel_desc(@e String str) {
        this.channel_desc = str;
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setUser_desc(@e String str) {
        this.user_desc = str;
    }

    public final void setUsers_avatar(@e List<String> list) {
        this.users_avatar = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14598, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FriendsChatRoomObj(count=" + this.count + ", users_avatar=" + this.users_avatar + ", protocol=" + this.protocol + ", user_desc=" + this.user_desc + ", channel_desc=" + this.channel_desc + ')';
    }
}
