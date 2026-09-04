package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.AchieveBadgesObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UserMedalResultV2.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserMedalResultV2 implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HashMap<String, String> achieve_cnt_map;

    @e
    private List<String> can_wear_medal_ids;

    @e
    private String faq;

    @e
    private List<? extends AchieveBadgesObj> groups;

    @e
    private BBSUserInfoObj user;

    @e
    private String wear_achieved_cnt;

    public UserMedalResultV2(@e String str, @e String str2, @e HashMap<String, String> map, @e BBSUserInfoObj bBSUserInfoObj, @e List<? extends AchieveBadgesObj> list, @e List<String> list2) {
        this.wear_achieved_cnt = str;
        this.faq = str2;
        this.achieve_cnt_map = map;
        this.user = bBSUserInfoObj;
        this.groups = list;
        this.can_wear_medal_ids = list2;
    }

    public static /* synthetic */ UserMedalResultV2 copy$default(UserMedalResultV2 userMedalResultV2, String str, String str2, HashMap map, BBSUserInfoObj bBSUserInfoObj, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{userMedalResultV2, str, str2, map, bBSUserInfoObj, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14011, new Class[]{UserMedalResultV2.class, String.class, String.class, HashMap.class, BBSUserInfoObj.class, List.class, List.class, Integer.TYPE, Object.class}, UserMedalResultV2.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserMedalResultV2) patchProxyResultProxy.result;
        }
        return userMedalResultV2.copy((i10 & 1) != 0 ? userMedalResultV2.wear_achieved_cnt : str, (i10 & 2) != 0 ? userMedalResultV2.faq : str2, (i10 & 4) != 0 ? userMedalResultV2.achieve_cnt_map : map, (i10 & 8) != 0 ? userMedalResultV2.user : bBSUserInfoObj, (i10 & 16) != 0 ? userMedalResultV2.groups : list, (i10 & 32) != 0 ? userMedalResultV2.can_wear_medal_ids : list2);
    }

    @e
    public final String component1() {
        return this.wear_achieved_cnt;
    }

    @e
    public final String component2() {
        return this.faq;
    }

    @e
    public final HashMap<String, String> component3() {
        return this.achieve_cnt_map;
    }

    @e
    public final BBSUserInfoObj component4() {
        return this.user;
    }

    @e
    public final List<AchieveBadgesObj> component5() {
        return this.groups;
    }

    @e
    public final List<String> component6() {
        return this.can_wear_medal_ids;
    }

    @d
    public final UserMedalResultV2 copy(@e String str, @e String str2, @e HashMap<String, String> map, @e BBSUserInfoObj bBSUserInfoObj, @e List<? extends AchieveBadgesObj> list, @e List<String> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, map, bBSUserInfoObj, list, list2}, this, changeQuickRedirect, false, 14010, new Class[]{String.class, String.class, HashMap.class, BBSUserInfoObj.class, List.class, List.class}, UserMedalResultV2.class);
        return patchProxyResultProxy.isSupported ? (UserMedalResultV2) patchProxyResultProxy.result : new UserMedalResultV2(str, str2, map, bBSUserInfoObj, list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14014, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMedalResultV2)) {
            return false;
        }
        UserMedalResultV2 userMedalResultV2 = (UserMedalResultV2) obj;
        return f0.g(this.wear_achieved_cnt, userMedalResultV2.wear_achieved_cnt) && f0.g(this.faq, userMedalResultV2.faq) && f0.g(this.achieve_cnt_map, userMedalResultV2.achieve_cnt_map) && f0.g(this.user, userMedalResultV2.user) && f0.g(this.groups, userMedalResultV2.groups) && f0.g(this.can_wear_medal_ids, userMedalResultV2.can_wear_medal_ids);
    }

    @e
    public final HashMap<String, String> getAchieve_cnt_map() {
        return this.achieve_cnt_map;
    }

    @e
    public final List<String> getCan_wear_medal_ids() {
        return this.can_wear_medal_ids;
    }

    @e
    public final String getFaq() {
        return this.faq;
    }

    @e
    public final List<AchieveBadgesObj> getGroups() {
        return this.groups;
    }

    @e
    public final BBSUserInfoObj getUser() {
        return this.user;
    }

    @e
    public final String getWear_achieved_cnt() {
        return this.wear_achieved_cnt;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14013, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.wear_achieved_cnt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.faq;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap<String, String> map = this.achieve_cnt_map;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        BBSUserInfoObj bBSUserInfoObj = this.user;
        int iHashCode4 = (iHashCode3 + (bBSUserInfoObj == null ? 0 : bBSUserInfoObj.hashCode())) * 31;
        List<? extends AchieveBadgesObj> list = this.groups;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.can_wear_medal_ids;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setAchieve_cnt_map(@e HashMap<String, String> map) {
        this.achieve_cnt_map = map;
    }

    public final void setCan_wear_medal_ids(@e List<String> list) {
        this.can_wear_medal_ids = list;
    }

    public final void setFaq(@e String str) {
        this.faq = str;
    }

    public final void setGroups(@e List<? extends AchieveBadgesObj> list) {
        this.groups = list;
    }

    public final void setUser(@e BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }

    public final void setWear_achieved_cnt(@e String str) {
        this.wear_achieved_cnt = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14012, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserMedalResultV2(wear_achieved_cnt=" + this.wear_achieved_cnt + ", faq=" + this.faq + ", achieve_cnt_map=" + this.achieve_cnt_map + ", user=" + this.user + ", groups=" + this.groups + ", can_wear_medal_ids=" + this.can_wear_medal_ids + ')';
    }
}
