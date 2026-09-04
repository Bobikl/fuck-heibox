package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.account.GameOverviewObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: EpicDetailInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicDetailInfo {

    @d
    public static final String EPIC_ID_URL = "https://www.epicgames.com/account/v2/eula/acceptance-history";

    @d
    public static final String EPIC_ORDERS_URL = "https://www.epicgames.com/account/v2/payment/ajaxGetOrderHistory?locale=zh-CN";

    @d
    public static final String EPIC_ORDER_CONFIRM_ENDPOINT = "https://payment-website-pci.ol.epicgames.com/purchase/confirm-order";

    @d
    public static final String EPIC_ORDER_GAMES_URL = "https://www.epicgames.com/account/v2/order/playtime?orderId=";

    @d
    public static final String EPIC_ORDER_PREVIEW_ENDPOINT = "https://payment-website-pci.ol.epicgames.com/purchase/order-preview";

    @d
    public static final String EPIC_PURCHASE_URL = "https://www.epicgames.com/store/purchase?showNavigation=true&highlightColor=0078f2";

    @d
    public static final String STATE_EXPIRED = "2";

    @d
    public static final String STATE_NEED_UPDATE = "1";

    @d
    public static final String STATE_NORMAL = "0";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameOverviewObj> epic_game_overview;

    @d
    private String epic_id;

    @e
    private String epic_notice;

    @e
    private EpicFriendInfoWrapper friends;

    @e
    private String game_num;

    @e
    private List<KeyDescObj> game_prize_distribute;

    @e
    private List<KeyDescObj> game_time_distribute;

    @e
    private List<GameObj> games;

    @e
    private String head_color;

    @e
    private String head_image;
    private boolean is_epic_api_changed;

    @e
    private String last_update_time;

    @e
    private String name;

    @e
    private String state;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: EpicDetailInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public EpicDetailInfo(@e String str, @e String str2, @e String str3, @e String str4, @e List<GameOverviewObj> list, @e List<GameObj> list2, @e List<KeyDescObj> list3, @e List<KeyDescObj> list4, @e EpicFriendInfoWrapper epicFriendInfoWrapper, @e String str5, @e String str6, @d String epic_id, boolean z10, @e String str7) {
        f0.p(epic_id, "epic_id");
        this.name = str;
        this.head_color = str2;
        this.last_update_time = str3;
        this.game_num = str4;
        this.epic_game_overview = list;
        this.games = list2;
        this.game_time_distribute = list3;
        this.game_prize_distribute = list4;
        this.friends = epicFriendInfoWrapper;
        this.state = str5;
        this.head_image = str6;
        this.epic_id = epic_id;
        this.is_epic_api_changed = z10;
        this.epic_notice = str7;
    }

    public /* synthetic */ EpicDetailInfo(String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, EpicFriendInfoWrapper epicFriendInfoWrapper, String str5, String str6, String str7, boolean z10, String str8, int i10, u uVar) {
        this(str, str2, str3, str4, list, list2, list3, list4, epicFriendInfoWrapper, str5, str6, str7, (i10 & 4096) != 0 ? false : z10, str8);
    }

    public static /* synthetic */ EpicDetailInfo copy$default(EpicDetailInfo epicDetailInfo, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, EpicFriendInfoWrapper epicFriendInfoWrapper, String str5, String str6, String str7, boolean z10, String str8, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicDetailInfo, str, str2, str3, str4, list, list2, list3, list4, epicFriendInfoWrapper, str5, str6, str7, new Byte(z11 ? (byte) 1 : (byte) 0), str8, new Integer(i10), obj}, null, changeQuickRedirect, true, 15166, new Class[]{EpicDetailInfo.class, String.class, String.class, String.class, String.class, List.class, List.class, List.class, List.class, EpicFriendInfoWrapper.class, String.class, String.class, String.class, Boolean.TYPE, String.class, Integer.TYPE, Object.class}, EpicDetailInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicDetailInfo) patchProxyResultProxy.result;
        }
        String str9 = (i10 & 1) != 0 ? epicDetailInfo.name : str;
        String str10 = (i10 & 2) != 0 ? epicDetailInfo.head_color : str2;
        String str11 = (i10 & 4) != 0 ? epicDetailInfo.last_update_time : str3;
        String str12 = (i10 & 8) != 0 ? epicDetailInfo.game_num : str4;
        List list5 = (i10 & 16) != 0 ? epicDetailInfo.epic_game_overview : list;
        List list6 = (i10 & 32) != 0 ? epicDetailInfo.games : list2;
        List list7 = (i10 & 64) != 0 ? epicDetailInfo.game_time_distribute : list3;
        List list8 = (i10 & 128) != 0 ? epicDetailInfo.game_prize_distribute : list4;
        EpicFriendInfoWrapper epicFriendInfoWrapper2 = (i10 & 256) != 0 ? epicDetailInfo.friends : epicFriendInfoWrapper;
        String str13 = (i10 & 512) != 0 ? epicDetailInfo.state : str5;
        String str14 = (i10 & 1024) != 0 ? epicDetailInfo.head_image : str6;
        String str15 = (i10 & 2048) != 0 ? epicDetailInfo.epic_id : str7;
        if ((i10 & 4096) != 0) {
            z11 = epicDetailInfo.is_epic_api_changed;
        }
        return epicDetailInfo.copy(str9, str10, str11, str12, list5, list6, list7, list8, epicFriendInfoWrapper2, str13, str14, str15, z11, (i10 & 8192) != 0 ? epicDetailInfo.epic_notice : str8);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component10() {
        return this.state;
    }

    @e
    public final String component11() {
        return this.head_image;
    }

    @d
    public final String component12() {
        return this.epic_id;
    }

    public final boolean component13() {
        return this.is_epic_api_changed;
    }

    @e
    public final String component14() {
        return this.epic_notice;
    }

    @e
    public final String component2() {
        return this.head_color;
    }

    @e
    public final String component3() {
        return this.last_update_time;
    }

    @e
    public final String component4() {
        return this.game_num;
    }

    @e
    public final List<GameOverviewObj> component5() {
        return this.epic_game_overview;
    }

    @e
    public final List<GameObj> component6() {
        return this.games;
    }

    @e
    public final List<KeyDescObj> component7() {
        return this.game_time_distribute;
    }

    @e
    public final List<KeyDescObj> component8() {
        return this.game_prize_distribute;
    }

    @e
    public final EpicFriendInfoWrapper component9() {
        return this.friends;
    }

    @d
    public final EpicDetailInfo copy(@e String str, @e String str2, @e String str3, @e String str4, @e List<GameOverviewObj> list, @e List<GameObj> list2, @e List<KeyDescObj> list3, @e List<KeyDescObj> list4, @e EpicFriendInfoWrapper epicFriendInfoWrapper, @e String str5, @e String str6, @d String epic_id, boolean z10, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, list, list2, list3, list4, epicFriendInfoWrapper, str5, str6, epic_id, new Byte(z10 ? (byte) 1 : (byte) 0), str7}, this, changeQuickRedirect, false, 15165, new Class[]{String.class, String.class, String.class, String.class, List.class, List.class, List.class, List.class, EpicFriendInfoWrapper.class, String.class, String.class, String.class, Boolean.TYPE, String.class}, EpicDetailInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicDetailInfo) patchProxyResultProxy.result;
        }
        f0.p(epic_id, "epic_id");
        return new EpicDetailInfo(str, str2, str3, str4, list, list2, list3, list4, epicFriendInfoWrapper, str5, str6, epic_id, z10, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15169, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicDetailInfo)) {
            return false;
        }
        EpicDetailInfo epicDetailInfo = (EpicDetailInfo) obj;
        return f0.g(this.name, epicDetailInfo.name) && f0.g(this.head_color, epicDetailInfo.head_color) && f0.g(this.last_update_time, epicDetailInfo.last_update_time) && f0.g(this.game_num, epicDetailInfo.game_num) && f0.g(this.epic_game_overview, epicDetailInfo.epic_game_overview) && f0.g(this.games, epicDetailInfo.games) && f0.g(this.game_time_distribute, epicDetailInfo.game_time_distribute) && f0.g(this.game_prize_distribute, epicDetailInfo.game_prize_distribute) && f0.g(this.friends, epicDetailInfo.friends) && f0.g(this.state, epicDetailInfo.state) && f0.g(this.head_image, epicDetailInfo.head_image) && f0.g(this.epic_id, epicDetailInfo.epic_id) && this.is_epic_api_changed == epicDetailInfo.is_epic_api_changed && f0.g(this.epic_notice, epicDetailInfo.epic_notice);
    }

    @e
    public final List<GameOverviewObj> getEpic_game_overview() {
        return this.epic_game_overview;
    }

    @d
    public final String getEpic_id() {
        return this.epic_id;
    }

    @e
    public final String getEpic_notice() {
        return this.epic_notice;
    }

    @e
    public final EpicFriendInfoWrapper getFriends() {
        return this.friends;
    }

    @e
    public final String getGame_num() {
        return this.game_num;
    }

    @e
    public final List<KeyDescObj> getGame_prize_distribute() {
        return this.game_prize_distribute;
    }

    @e
    public final List<KeyDescObj> getGame_time_distribute() {
        return this.game_time_distribute;
    }

    @e
    public final List<GameObj> getGames() {
        return this.games;
    }

    @e
    public final String getHead_color() {
        return this.head_color;
    }

    @e
    public final String getHead_image() {
        return this.head_image;
    }

    @e
    public final String getLast_update_time() {
        return this.last_update_time;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v48 */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15168, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.head_color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.last_update_time;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.game_num;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<GameOverviewObj> list = this.epic_game_overview;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<GameObj> list2 = this.games;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KeyDescObj> list3 = this.game_time_distribute;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<KeyDescObj> list4 = this.game_prize_distribute;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        EpicFriendInfoWrapper epicFriendInfoWrapper = this.friends;
        int iHashCode9 = (iHashCode8 + (epicFriendInfoWrapper == null ? 0 : epicFriendInfoWrapper.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.head_image;
        int iHashCode11 = (((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.epic_id.hashCode()) * 31;
        boolean z10 = this.is_epic_api_changed;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode11 + r10) * 31;
        String str7 = this.epic_notice;
        return i10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean is_epic_api_changed() {
        return this.is_epic_api_changed;
    }

    public final void setEpic_game_overview(@e List<GameOverviewObj> list) {
        this.epic_game_overview = list;
    }

    public final void setEpic_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15164, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.epic_id = str;
    }

    public final void setEpic_notice(@e String str) {
        this.epic_notice = str;
    }

    public final void setFriends(@e EpicFriendInfoWrapper epicFriendInfoWrapper) {
        this.friends = epicFriendInfoWrapper;
    }

    public final void setGame_num(@e String str) {
        this.game_num = str;
    }

    public final void setGame_prize_distribute(@e List<KeyDescObj> list) {
        this.game_prize_distribute = list;
    }

    public final void setGame_time_distribute(@e List<KeyDescObj> list) {
        this.game_time_distribute = list;
    }

    public final void setGames(@e List<GameObj> list) {
        this.games = list;
    }

    public final void setHead_color(@e String str) {
        this.head_color = str;
    }

    public final void setHead_image(@e String str) {
        this.head_image = str;
    }

    public final void setLast_update_time(@e String str) {
        this.last_update_time = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setState(@e String str) {
        this.state = str;
    }

    public final void set_epic_api_changed(boolean z10) {
        this.is_epic_api_changed = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15167, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicDetailInfo(name=" + this.name + ", head_color=" + this.head_color + ", last_update_time=" + this.last_update_time + ", game_num=" + this.game_num + ", epic_game_overview=" + this.epic_game_overview + ", games=" + this.games + ", game_time_distribute=" + this.game_time_distribute + ", game_prize_distribute=" + this.game_prize_distribute + ", friends=" + this.friends + ", state=" + this.state + ", head_image=" + this.head_image + ", epic_id=" + this.epic_id + ", is_epic_api_changed=" + this.is_epic_api_changed + ", epic_notice=" + this.epic_notice + ')';
    }
}
