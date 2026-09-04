package com.max.xiaoheihe.bean.game.xbox;

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

/* JADX INFO: compiled from: XboxShortAccountInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class XboxShortAccountInfo implements Serializable {
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
    private XboxFriendInfoWrapper friends;

    @e
    private String nickname;

    @e
    private List<KeyDescObj> stats;

    @e
    private String v3_protocol;

    @e
    private String xuid;

    public XboxShortAccountInfo(@e List<KeyDescObj> list, @e String str, @e XboxFriendInfoWrapper xboxFriendInfoWrapper, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this.stats = list;
        this.background_url = str;
        this.friends = xboxFriendInfoWrapper;
        this.avatar_url = str2;
        this.xuid = str3;
        this.nickname = str4;
        this.desc = str5;
        this.v3_protocol = str6;
        this.friend_protocol = str7;
    }

    public static /* synthetic */ XboxShortAccountInfo copy$default(XboxShortAccountInfo xboxShortAccountInfo, List list, String str, XboxFriendInfoWrapper xboxFriendInfoWrapper, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{xboxShortAccountInfo, list, str, xboxFriendInfoWrapper, str2, str3, str4, str5, str6, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 15464, new Class[]{XboxShortAccountInfo.class, List.class, String.class, XboxFriendInfoWrapper.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, XboxShortAccountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (XboxShortAccountInfo) patchProxyResultProxy.result;
        }
        return xboxShortAccountInfo.copy((i10 & 1) != 0 ? xboxShortAccountInfo.stats : list, (i10 & 2) != 0 ? xboxShortAccountInfo.background_url : str, (i10 & 4) != 0 ? xboxShortAccountInfo.friends : xboxFriendInfoWrapper, (i10 & 8) != 0 ? xboxShortAccountInfo.avatar_url : str2, (i10 & 16) != 0 ? xboxShortAccountInfo.xuid : str3, (i10 & 32) != 0 ? xboxShortAccountInfo.nickname : str4, (i10 & 64) != 0 ? xboxShortAccountInfo.desc : str5, (i10 & 128) != 0 ? xboxShortAccountInfo.v3_protocol : str6, (i10 & 256) != 0 ? xboxShortAccountInfo.friend_protocol : str7);
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
    public final XboxFriendInfoWrapper component3() {
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
        return this.desc;
    }

    @e
    public final String component8() {
        return this.v3_protocol;
    }

    @e
    public final String component9() {
        return this.friend_protocol;
    }

    @d
    public final XboxShortAccountInfo copy(@e List<KeyDescObj> list, @e String str, @e XboxFriendInfoWrapper xboxFriendInfoWrapper, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, xboxFriendInfoWrapper, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 15463, new Class[]{List.class, String.class, XboxFriendInfoWrapper.class, String.class, String.class, String.class, String.class, String.class, String.class}, XboxShortAccountInfo.class);
        return patchProxyResultProxy.isSupported ? (XboxShortAccountInfo) patchProxyResultProxy.result : new XboxShortAccountInfo(list, str, xboxFriendInfoWrapper, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15467, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XboxShortAccountInfo)) {
            return false;
        }
        XboxShortAccountInfo xboxShortAccountInfo = (XboxShortAccountInfo) obj;
        return f0.g(this.stats, xboxShortAccountInfo.stats) && f0.g(this.background_url, xboxShortAccountInfo.background_url) && f0.g(this.friends, xboxShortAccountInfo.friends) && f0.g(this.avatar_url, xboxShortAccountInfo.avatar_url) && f0.g(this.xuid, xboxShortAccountInfo.xuid) && f0.g(this.nickname, xboxShortAccountInfo.nickname) && f0.g(this.desc, xboxShortAccountInfo.desc) && f0.g(this.v3_protocol, xboxShortAccountInfo.v3_protocol) && f0.g(this.friend_protocol, xboxShortAccountInfo.friend_protocol);
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
    public final XboxFriendInfoWrapper getFriends() {
        return this.friends;
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
    public final String getV3_protocol() {
        return this.v3_protocol;
    }

    @e
    public final String getXuid() {
        return this.xuid;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15466, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<KeyDescObj> list = this.stats;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.background_url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        XboxFriendInfoWrapper xboxFriendInfoWrapper = this.friends;
        int iHashCode3 = (iHashCode2 + (xboxFriendInfoWrapper == null ? 0 : xboxFriendInfoWrapper.hashCode())) * 31;
        String str2 = this.avatar_url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xuid;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.desc;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.v3_protocol;
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

    public final void setFriends(@e XboxFriendInfoWrapper xboxFriendInfoWrapper) {
        this.friends = xboxFriendInfoWrapper;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setStats(@e List<KeyDescObj> list) {
        this.stats = list;
    }

    public final void setV3_protocol(@e String str) {
        this.v3_protocol = str;
    }

    public final void setXuid(@e String str) {
        this.xuid = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15465, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "XboxShortAccountInfo(stats=" + this.stats + ", background_url=" + this.background_url + ", friends=" + this.friends + ", avatar_url=" + this.avatar_url + ", xuid=" + this.xuid + ", nickname=" + this.nickname + ", desc=" + this.desc + ", v3_protocol=" + this.v3_protocol + ", friend_protocol=" + this.friend_protocol + ')';
    }
}
