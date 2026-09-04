package com.max.xiaoheihe.bean.game.nswitch;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SwitchAccountInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SwitchAccountInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String avatar;

    @e
    private String desc;

    @e
    private String friend_code;

    @e
    private List<SwitchFriendInfo> friends;

    @e
    private String friends_total;

    @d
    private List<GameObj> games;

    @e
    private String games_total;

    @e
    private String heybox_id;

    @e
    private String nickname;

    @e
    private String protocol;

    @e
    private String server_name;

    @e
    private List<KeyDescObj> stats;

    @e
    private String type;

    public SwitchAccountInfo(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<SwitchFriendInfo> list, @e String str6, @e String str7, @e List<KeyDescObj> list2, @d List<GameObj> games, @e String str8, @e String str9, @e String str10) {
        f0.p(games, "games");
        this.friends_total = str;
        this.nickname = str2;
        this.avatar = str3;
        this.friend_code = str4;
        this.server_name = str5;
        this.friends = list;
        this.heybox_id = str6;
        this.type = str7;
        this.stats = list2;
        this.games = games;
        this.games_total = str8;
        this.protocol = str9;
        this.desc = str10;
    }

    public static /* synthetic */ SwitchAccountInfo copy$default(SwitchAccountInfo switchAccountInfo, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, List list3, String str8, String str9, String str10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{switchAccountInfo, str, str2, str3, str4, str5, list, str6, str7, list2, list3, str8, str9, str10, new Integer(i10), obj}, null, changeQuickRedirect, true, 15279, new Class[]{SwitchAccountInfo.class, String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, List.class, List.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SwitchAccountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SwitchAccountInfo) patchProxyResultProxy.result;
        }
        return switchAccountInfo.copy((i10 & 1) != 0 ? switchAccountInfo.friends_total : str, (i10 & 2) != 0 ? switchAccountInfo.nickname : str2, (i10 & 4) != 0 ? switchAccountInfo.avatar : str3, (i10 & 8) != 0 ? switchAccountInfo.friend_code : str4, (i10 & 16) != 0 ? switchAccountInfo.server_name : str5, (i10 & 32) != 0 ? switchAccountInfo.friends : list, (i10 & 64) != 0 ? switchAccountInfo.heybox_id : str6, (i10 & 128) != 0 ? switchAccountInfo.type : str7, (i10 & 256) != 0 ? switchAccountInfo.stats : list2, (i10 & 512) != 0 ? switchAccountInfo.games : list3, (i10 & 1024) != 0 ? switchAccountInfo.games_total : str8, (i10 & 2048) != 0 ? switchAccountInfo.protocol : str9, (i10 & 4096) != 0 ? switchAccountInfo.desc : str10);
    }

    @e
    public final String component1() {
        return this.friends_total;
    }

    @d
    public final List<GameObj> component10() {
        return this.games;
    }

    @e
    public final String component11() {
        return this.games_total;
    }

    @e
    public final String component12() {
        return this.protocol;
    }

    @e
    public final String component13() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.nickname;
    }

    @e
    public final String component3() {
        return this.avatar;
    }

    @e
    public final String component4() {
        return this.friend_code;
    }

    @e
    public final String component5() {
        return this.server_name;
    }

    @e
    public final List<SwitchFriendInfo> component6() {
        return this.friends;
    }

    @e
    public final String component7() {
        return this.heybox_id;
    }

    @e
    public final String component8() {
        return this.type;
    }

    @e
    public final List<KeyDescObj> component9() {
        return this.stats;
    }

    @d
    public final SwitchAccountInfo copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e List<SwitchFriendInfo> list, @e String str6, @e String str7, @e List<KeyDescObj> list2, @d List<GameObj> games, @e String str8, @e String str9, @e String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, list, str6, str7, list2, games, str8, str9, str10}, this, changeQuickRedirect, false, 15278, new Class[]{String.class, String.class, String.class, String.class, String.class, List.class, String.class, String.class, List.class, List.class, String.class, String.class, String.class}, SwitchAccountInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SwitchAccountInfo) patchProxyResultProxy.result;
        }
        f0.p(games, "games");
        return new SwitchAccountInfo(str, str2, str3, str4, str5, list, str6, str7, list2, games, str8, str9, str10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15282, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchAccountInfo)) {
            return false;
        }
        SwitchAccountInfo switchAccountInfo = (SwitchAccountInfo) obj;
        return f0.g(this.friends_total, switchAccountInfo.friends_total) && f0.g(this.nickname, switchAccountInfo.nickname) && f0.g(this.avatar, switchAccountInfo.avatar) && f0.g(this.friend_code, switchAccountInfo.friend_code) && f0.g(this.server_name, switchAccountInfo.server_name) && f0.g(this.friends, switchAccountInfo.friends) && f0.g(this.heybox_id, switchAccountInfo.heybox_id) && f0.g(this.type, switchAccountInfo.type) && f0.g(this.stats, switchAccountInfo.stats) && f0.g(this.games, switchAccountInfo.games) && f0.g(this.games_total, switchAccountInfo.games_total) && f0.g(this.protocol, switchAccountInfo.protocol) && f0.g(this.desc, switchAccountInfo.desc);
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
    public final String getFriend_code() {
        return this.friend_code;
    }

    @e
    public final List<SwitchFriendInfo> getFriends() {
        return this.friends;
    }

    @e
    public final String getFriends_total() {
        return this.friends_total;
    }

    @d
    public final List<GameObj> getGames() {
        return this.games;
    }

    @e
    public final String getGames_total() {
        return this.games_total;
    }

    @e
    public final String getHeybox_id() {
        return this.heybox_id;
    }

    @e
    public final String getNickname() {
        return this.nickname;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getServer_name() {
        return this.server_name;
    }

    @e
    public final List<KeyDescObj> getStats() {
        return this.stats;
    }

    @e
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15281, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.friends_total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.friend_code;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.server_name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<SwitchFriendInfo> list = this.friends;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.heybox_id;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.type;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<KeyDescObj> list2 = this.stats;
        int iHashCode9 = (((iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.games.hashCode()) * 31;
        String str8 = this.games_total;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.protocol;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.desc;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setAvatar(@e String str) {
        this.avatar = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setFriend_code(@e String str) {
        this.friend_code = str;
    }

    public final void setFriends(@e List<SwitchFriendInfo> list) {
        this.friends = list;
    }

    public final void setFriends_total(@e String str) {
        this.friends_total = str;
    }

    public final void setGames(@d List<GameObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15277, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.games = list;
    }

    public final void setGames_total(@e String str) {
        this.games_total = str;
    }

    public final void setHeybox_id(@e String str) {
        this.heybox_id = str;
    }

    public final void setNickname(@e String str) {
        this.nickname = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setServer_name(@e String str) {
        this.server_name = str;
    }

    public final void setStats(@e List<KeyDescObj> list) {
        this.stats = list;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15280, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SwitchAccountInfo(friends_total=" + this.friends_total + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", friend_code=" + this.friend_code + ", server_name=" + this.server_name + ", friends=" + this.friends + ", heybox_id=" + this.heybox_id + ", type=" + this.type + ", stats=" + this.stats + ", games=" + this.games + ", games_total=" + this.games_total + ", protocol=" + this.protocol + ", desc=" + this.desc + ')';
    }
}
