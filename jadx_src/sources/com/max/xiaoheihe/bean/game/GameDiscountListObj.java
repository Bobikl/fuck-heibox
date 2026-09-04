package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameDiscountListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameDiscountListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String datetime;

    @e
    private String description;

    @e
    private GameObj game;

    @e
    private List<GameObj> game_list;

    @e
    private String max_discount;
    private int offset;

    @e
    private String platform;

    @e
    private String platform_icon;

    @e
    private String timestamp;
    private int total;
    private int type;

    public GameDiscountListObj(@e String str, @e String str2, @e List<GameObj> list, int i10, int i11, @e String str3, @e String str4, @e GameObj gameObj, @e String str5, @e String str6, int i12) {
        this.description = str;
        this.datetime = str2;
        this.game_list = list;
        this.offset = i10;
        this.total = i11;
        this.platform = str3;
        this.timestamp = str4;
        this.game = gameObj;
        this.platform_icon = str5;
        this.max_discount = str6;
        this.type = i12;
    }

    public /* synthetic */ GameDiscountListObj(String str, String str2, List list, int i10, int i11, String str3, String str4, GameObj gameObj, String str5, String str6, int i12, int i13, u uVar) {
        this(str, str2, list, (i13 & 8) != 0 ? 0 : i10, (i13 & 16) != 0 ? 0 : i11, str3, str4, gameObj, str5, str6, (i13 & 1024) != 0 ? 0 : i12);
    }

    public static /* synthetic */ GameDiscountListObj copy$default(GameDiscountListObj gameDiscountListObj, String str, String str2, List list, int i10, int i11, String str3, String str4, GameObj gameObj, String str5, String str6, int i12, int i13, Object obj) {
        int i14 = i12;
        Object[] objArr = {gameDiscountListObj, str, str2, list, new Integer(i10), new Integer(i11), str3, str4, gameObj, str5, str6, new Integer(i14), new Integer(i13), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14811, new Class[]{GameDiscountListObj.class, String.class, String.class, List.class, cls, cls, String.class, String.class, GameObj.class, String.class, String.class, cls, cls, Object.class}, GameDiscountListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDiscountListObj) patchProxyResultProxy.result;
        }
        String str7 = (i13 & 1) != 0 ? gameDiscountListObj.description : str;
        String str8 = (i13 & 2) != 0 ? gameDiscountListObj.datetime : str2;
        List list2 = (i13 & 4) != 0 ? gameDiscountListObj.game_list : list;
        int i15 = (i13 & 8) != 0 ? gameDiscountListObj.offset : i10;
        int i16 = (i13 & 16) != 0 ? gameDiscountListObj.total : i11;
        String str9 = (i13 & 32) != 0 ? gameDiscountListObj.platform : str3;
        String str10 = (i13 & 64) != 0 ? gameDiscountListObj.timestamp : str4;
        GameObj gameObj2 = (i13 & 128) != 0 ? gameDiscountListObj.game : gameObj;
        String str11 = (i13 & 256) != 0 ? gameDiscountListObj.platform_icon : str5;
        String str12 = (i13 & 512) != 0 ? gameDiscountListObj.max_discount : str6;
        if ((i13 & 1024) != 0) {
            i14 = gameDiscountListObj.type;
        }
        return gameDiscountListObj.copy(str7, str8, list2, i15, i16, str9, str10, gameObj2, str11, str12, i14);
    }

    @e
    public final String component1() {
        return this.description;
    }

    @e
    public final String component10() {
        return this.max_discount;
    }

    public final int component11() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.datetime;
    }

    @e
    public final List<GameObj> component3() {
        return this.game_list;
    }

    public final int component4() {
        return this.offset;
    }

    public final int component5() {
        return this.total;
    }

    @e
    public final String component6() {
        return this.platform;
    }

    @e
    public final String component7() {
        return this.timestamp;
    }

    @e
    public final GameObj component8() {
        return this.game;
    }

    @e
    public final String component9() {
        return this.platform_icon;
    }

    @d
    public final GameDiscountListObj copy(@e String str, @e String str2, @e List<GameObj> list, int i10, int i11, @e String str3, @e String str4, @e GameObj gameObj, @e String str5, @e String str6, int i12) {
        Object[] objArr = {str, str2, list, new Integer(i10), new Integer(i11), str3, str4, gameObj, str5, str6, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 14810, new Class[]{String.class, String.class, List.class, cls, cls, String.class, String.class, GameObj.class, String.class, String.class, cls}, GameDiscountListObj.class);
        return patchProxyResultProxy.isSupported ? (GameDiscountListObj) patchProxyResultProxy.result : new GameDiscountListObj(str, str2, list, i10, i11, str3, str4, gameObj, str5, str6, i12);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14814, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDiscountListObj)) {
            return false;
        }
        GameDiscountListObj gameDiscountListObj = (GameDiscountListObj) obj;
        return f0.g(this.description, gameDiscountListObj.description) && f0.g(this.datetime, gameDiscountListObj.datetime) && f0.g(this.game_list, gameDiscountListObj.game_list) && this.offset == gameDiscountListObj.offset && this.total == gameDiscountListObj.total && f0.g(this.platform, gameDiscountListObj.platform) && f0.g(this.timestamp, gameDiscountListObj.timestamp) && f0.g(this.game, gameDiscountListObj.game) && f0.g(this.platform_icon, gameDiscountListObj.platform_icon) && f0.g(this.max_discount, gameDiscountListObj.max_discount) && this.type == gameDiscountListObj.type;
    }

    @e
    public final String getDatetime() {
        return this.datetime;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final GameObj getGame() {
        return this.game;
    }

    @e
    public final List<GameObj> getGame_list() {
        return this.game_list;
    }

    @e
    public final String getMax_discount() {
        return this.max_discount;
    }

    public final int getOffset() {
        return this.offset;
    }

    @e
    public final String getPlatform() {
        return this.platform;
    }

    @e
    public final String getPlatform_icon() {
        return this.platform_icon;
    }

    @e
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14813, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.datetime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GameObj> list = this.game_list;
        int iHashCode3 = (((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.offset) * 31) + this.total) * 31;
        String str3 = this.platform;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timestamp;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GameObj gameObj = this.game;
        int iHashCode6 = (iHashCode5 + (gameObj == null ? 0 : gameObj.hashCode())) * 31;
        String str5 = this.platform_icon;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.max_discount;
        return ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.type;
    }

    public final void setDatetime(@e String str) {
        this.datetime = str;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setGame(@e GameObj gameObj) {
        this.game = gameObj;
    }

    public final void setGame_list(@e List<GameObj> list) {
        this.game_list = list;
    }

    public final void setMax_discount(@e String str) {
        this.max_discount = str;
    }

    public final void setOffset(int i10) {
        this.offset = i10;
    }

    public final void setPlatform(@e String str) {
        this.platform = str;
    }

    public final void setPlatform_icon(@e String str) {
        this.platform_icon = str;
    }

    public final void setTimestamp(@e String str) {
        this.timestamp = str;
    }

    public final void setTotal(int i10) {
        this.total = i10;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14812, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameDiscountListObj(description=" + this.description + ", datetime=" + this.datetime + ", game_list=" + this.game_list + ", offset=" + this.offset + ", total=" + this.total + ", platform=" + this.platform + ", timestamp=" + this.timestamp + ", game=" + this.game + ", platform_icon=" + this.platform_icon + ", max_discount=" + this.max_discount + ", type=" + this.type + ')';
    }
}
