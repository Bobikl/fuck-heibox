package com.max.xiaoheihe.module.game.heybox.gamematerial.bean;

import androidx.compose.runtime.internal.o;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameMaterialObj.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameMaterialObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String avatar;

    @SerializedName("hash_tag")
    @e
    private final String hashTag;

    @SerializedName("header_bg_color_end")
    @e
    private final String headerBgColorEnd;

    @SerializedName("header_bg_color_start")
    @e
    private final String headerBgColorStart;

    @e
    private final String icon;

    @SerializedName("query_filter")
    @e
    private final ArrayList<KeyDescObj> queryFilter;

    @SerializedName("size_filter")
    @e
    private final ArrayList<KeyDescObj> sizeFilter;

    @SerializedName("sort_filter")
    @e
    private final ArrayList<KeyDescObj> sortFilter;

    @SerializedName("status_bar_style")
    @e
    private final String statusBarStyle;

    @e
    private final String title;

    @SerializedName("today_cnt")
    @e
    private final Integer todayCnt;

    @SerializedName("total_cnt")
    @e
    private final Integer totalCnt;

    public GameMaterialObj() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public GameMaterialObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Integer num, @e Integer num2, @e ArrayList<KeyDescObj> arrayList, @e ArrayList<KeyDescObj> arrayList2, @e ArrayList<KeyDescObj> arrayList3) {
        this.title = str;
        this.icon = str2;
        this.hashTag = str3;
        this.avatar = str4;
        this.statusBarStyle = str5;
        this.headerBgColorStart = str6;
        this.headerBgColorEnd = str7;
        this.totalCnt = num;
        this.todayCnt = num2;
        this.sortFilter = arrayList;
        this.sizeFilter = arrayList2;
        this.queryFilter = arrayList3;
    }

    public /* synthetic */ GameMaterialObj(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : num, (i10 & 256) != 0 ? null : num2, (i10 & 512) != 0 ? null : arrayList, (i10 & 1024) != 0 ? null : arrayList2, (i10 & 2048) == 0 ? arrayList3 : null);
    }

    public static /* synthetic */ GameMaterialObj copy$default(GameMaterialObj gameMaterialObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameMaterialObj, str, str2, str3, str4, str5, str6, str7, num, num2, arrayList, arrayList2, arrayList3, new Integer(i10), obj}, null, changeQuickRedirect, true, 37521, new Class[]{GameMaterialObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, ArrayList.class, ArrayList.class, ArrayList.class, Integer.TYPE, Object.class}, GameMaterialObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMaterialObj) patchProxyResultProxy.result;
        }
        return gameMaterialObj.copy((i10 & 1) != 0 ? gameMaterialObj.title : str, (i10 & 2) != 0 ? gameMaterialObj.icon : str2, (i10 & 4) != 0 ? gameMaterialObj.hashTag : str3, (i10 & 8) != 0 ? gameMaterialObj.avatar : str4, (i10 & 16) != 0 ? gameMaterialObj.statusBarStyle : str5, (i10 & 32) != 0 ? gameMaterialObj.headerBgColorStart : str6, (i10 & 64) != 0 ? gameMaterialObj.headerBgColorEnd : str7, (i10 & 128) != 0 ? gameMaterialObj.totalCnt : num, (i10 & 256) != 0 ? gameMaterialObj.todayCnt : num2, (i10 & 512) != 0 ? gameMaterialObj.sortFilter : arrayList, (i10 & 1024) != 0 ? gameMaterialObj.sizeFilter : arrayList2, (i10 & 2048) != 0 ? gameMaterialObj.queryFilter : arrayList3);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final ArrayList<KeyDescObj> component10() {
        return this.sortFilter;
    }

    @e
    public final ArrayList<KeyDescObj> component11() {
        return this.sizeFilter;
    }

    @e
    public final ArrayList<KeyDescObj> component12() {
        return this.queryFilter;
    }

    @e
    public final String component2() {
        return this.icon;
    }

    @e
    public final String component3() {
        return this.hashTag;
    }

    @e
    public final String component4() {
        return this.avatar;
    }

    @e
    public final String component5() {
        return this.statusBarStyle;
    }

    @e
    public final String component6() {
        return this.headerBgColorStart;
    }

    @e
    public final String component7() {
        return this.headerBgColorEnd;
    }

    @e
    public final Integer component8() {
        return this.totalCnt;
    }

    @e
    public final Integer component9() {
        return this.todayCnt;
    }

    @d
    public final GameMaterialObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Integer num, @e Integer num2, @e ArrayList<KeyDescObj> arrayList, @e ArrayList<KeyDescObj> arrayList2, @e ArrayList<KeyDescObj> arrayList3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, num, num2, arrayList, arrayList2, arrayList3}, this, changeQuickRedirect, false, 37520, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, ArrayList.class, ArrayList.class, ArrayList.class}, GameMaterialObj.class);
        return patchProxyResultProxy.isSupported ? (GameMaterialObj) patchProxyResultProxy.result : new GameMaterialObj(str, str2, str3, str4, str5, str6, str7, num, num2, arrayList, arrayList2, arrayList3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37524, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameMaterialObj)) {
            return false;
        }
        GameMaterialObj gameMaterialObj = (GameMaterialObj) obj;
        return f0.g(this.title, gameMaterialObj.title) && f0.g(this.icon, gameMaterialObj.icon) && f0.g(this.hashTag, gameMaterialObj.hashTag) && f0.g(this.avatar, gameMaterialObj.avatar) && f0.g(this.statusBarStyle, gameMaterialObj.statusBarStyle) && f0.g(this.headerBgColorStart, gameMaterialObj.headerBgColorStart) && f0.g(this.headerBgColorEnd, gameMaterialObj.headerBgColorEnd) && f0.g(this.totalCnt, gameMaterialObj.totalCnt) && f0.g(this.todayCnt, gameMaterialObj.todayCnt) && f0.g(this.sortFilter, gameMaterialObj.sortFilter) && f0.g(this.sizeFilter, gameMaterialObj.sizeFilter) && f0.g(this.queryFilter, gameMaterialObj.queryFilter);
    }

    @e
    public final String getAvatar() {
        return this.avatar;
    }

    @e
    public final String getHashTag() {
        return this.hashTag;
    }

    @e
    public final String getHeaderBgColorEnd() {
        return this.headerBgColorEnd;
    }

    @e
    public final String getHeaderBgColorStart() {
        return this.headerBgColorStart;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final ArrayList<KeyDescObj> getQueryFilter() {
        return this.queryFilter;
    }

    @e
    public final ArrayList<KeyDescObj> getSizeFilter() {
        return this.sizeFilter;
    }

    @e
    public final ArrayList<KeyDescObj> getSortFilter() {
        return this.sortFilter;
    }

    @e
    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final Integer getTodayCnt() {
        return this.todayCnt;
    }

    @e
    public final Integer getTotalCnt() {
        return this.totalCnt;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37523, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hashTag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.statusBarStyle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.headerBgColorStart;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.headerBgColorEnd;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.totalCnt;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.todayCnt;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList = this.sortFilter;
        int iHashCode10 = (iHashCode9 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList2 = this.sizeFilter;
        int iHashCode11 = (iHashCode10 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<KeyDescObj> arrayList3 = this.queryFilter;
        return iHashCode11 + (arrayList3 != null ? arrayList3.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37522, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameMaterialObj(title=" + this.title + ", icon=" + this.icon + ", hashTag=" + this.hashTag + ", avatar=" + this.avatar + ", statusBarStyle=" + this.statusBarStyle + ", headerBgColorStart=" + this.headerBgColorStart + ", headerBgColorEnd=" + this.headerBgColorEnd + ", totalCnt=" + this.totalCnt + ", todayCnt=" + this.todayCnt + ", sortFilter=" + this.sortFilter + ", sizeFilter=" + this.sizeFilter + ", queryFilter=" + this.queryFilter + ')';
    }
}
