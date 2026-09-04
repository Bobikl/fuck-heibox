package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicAccountInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicAccountInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar_url;

    @e
    private String background_url;

    @e
    private String desc;

    @e
    private String friend_protocol;

    @e
    private EpicFriendInfoWrapper friends;

    @e
    private String head_color;

    @e
    private String nickname;

    @e
    private List<KeyDescObj> stats;

    @e
    private String xuid;

    public EpicAccountInfo(@e List<KeyDescObj> list, @e String str, @e EpicFriendInfoWrapper epicFriendInfoWrapper, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this.stats = list;
        this.background_url = str;
        this.friends = epicFriendInfoWrapper;
        this.avatar_url = str2;
        this.xuid = str3;
        this.nickname = str4;
        this.head_color = str5;
        this.desc = str6;
        this.friend_protocol = str7;
    }

    public static /* synthetic */ EpicAccountInfo copy$default(EpicAccountInfo epicAccountInfo, List list, String str, EpicFriendInfoWrapper epicFriendInfoWrapper, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicAccountInfo, list, str, epicFriendInfoWrapper, str2, str3, str4, str5, str6, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 15142, new Class[]{EpicAccountInfo.class, List.class, String.class, EpicFriendInfoWrapper.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, EpicAccountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicAccountInfo) patchProxyResultProxy.result;
        }
        return epicAccountInfo.copy((i10 & 1) != 0 ? epicAccountInfo.stats : list, (i10 & 2) != 0 ? epicAccountInfo.background_url : str, (i10 & 4) != 0 ? epicAccountInfo.friends : epicFriendInfoWrapper, (i10 & 8) != 0 ? epicAccountInfo.avatar_url : str2, (i10 & 16) != 0 ? epicAccountInfo.xuid : str3, (i10 & 32) != 0 ? epicAccountInfo.nickname : str4, (i10 & 64) != 0 ? epicAccountInfo.head_color : str5, (i10 & 128) != 0 ? epicAccountInfo.desc : str6, (i10 & 256) != 0 ? epicAccountInfo.friend_protocol : str7);
    }

    @e
    public final List<KeyDescObj> component1() {
        return this.stats;
    }

    @e
    public final String component2() {
        return this.background_url;
    }

    @e
    public final EpicFriendInfoWrapper component3() {
        return this.friends;
    }

    @e
    public final String component4() {
        return this.avatar_url;
    }

    @e
    public final String component5() {
        return this.xuid;
    }

    @e
    public final String component6() {
        return this.nickname;
    }

    @e
    public final String component7() {
        return this.head_color;
    }

    @e
    public final String component8() {
        return this.desc;
    }

    @e
    public final String component9() {
        return this.friend_protocol;
    }

    @d
    public final EpicAccountInfo copy(@e List<KeyDescObj> list, @e String str, @e EpicFriendInfoWrapper epicFriendInfoWrapper, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, epicFriendInfoWrapper, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 15141, new Class[]{List.class, String.class, EpicFriendInfoWrapper.class, String.class, String.class, String.class, String.class, String.class, String.class}, EpicAccountInfo.class);
        return patchProxyResultProxy.isSupported ? (EpicAccountInfo) patchProxyResultProxy.result : new EpicAccountInfo(list, str, epicFriendInfoWrapper, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15145, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicAccountInfo)) {
            return false;
        }
        EpicAccountInfo epicAccountInfo = (EpicAccountInfo) obj;
        return f0.g(this.stats, epicAccountInfo.stats) && f0.g(this.background_url, epicAccountInfo.background_url) && f0.g(this.friends, epicAccountInfo.friends) && f0.g(this.avatar_url, epicAccountInfo.avatar_url) && f0.g(this.xuid, epicAccountInfo.xuid) && f0.g(this.nickname, epicAccountInfo.nickname) && f0.g(this.head_color, epicAccountInfo.head_color) && f0.g(this.desc, epicAccountInfo.desc) && f0.g(this.friend_protocol, epicAccountInfo.friend_protocol);
    }

    @e
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    @e
    public final String getBackground_url() {
        return this.background_url;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getFriend_protocol() {
        return this.friend_protocol;
    }

    @e
    public final EpicFriendInfoWrapper getFriends() {
        return this.friends;
    }

    @e
    public final String getHead_color() {
        return this.head_color;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final List<KeyDescObj> getStats() {
        return this.stats;
    }

    @e
    public final String getXuid() {
        return this.xuid;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15144, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<KeyDescObj> list = this.stats;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.background_url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EpicFriendInfoWrapper epicFriendInfoWrapper = this.friends;
        int iHashCode3 = (iHashCode2 + (epicFriendInfoWrapper == null ? 0 : epicFriendInfoWrapper.hashCode())) * 31;
        String str2 = this.avatar_url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xuid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.head_color;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.friend_protocol;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAvatar_url(@e String str) {
        this.avatar_url = str;
    }

    public final void setBackground_url(@e String str) {
        this.background_url = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFriend_protocol(@e String str) {
        this.friend_protocol = str;
    }

    public final void setFriends(@e EpicFriendInfoWrapper epicFriendInfoWrapper) {
        this.friends = epicFriendInfoWrapper;
    }

    public final void setHead_color(@e String str) {
        this.head_color = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setStats(@e List<KeyDescObj> list) {
        this.stats = list;
    }

    public final void setXuid(@e String str) {
        this.xuid = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15143, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicAccountInfo(stats=" + this.stats + ", background_url=" + this.background_url + ", friends=" + this.friends + ", avatar_url=" + this.avatar_url + ", xuid=" + this.xuid + ", nickname=" + this.nickname + ", head_color=" + this.head_color + ", desc=" + this.desc + ", friend_protocol=" + this.friend_protocol + ')';
    }
}
