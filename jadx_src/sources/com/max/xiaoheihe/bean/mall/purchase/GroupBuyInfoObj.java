package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GroupBuyInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GroupBuyInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String past_group_game_desc;

    @e
    private String past_group_time_desc;

    @e
    private List<GroupBuyUserInfoObj> user_info;

    public GroupBuyInfoObj(@e List<GroupBuyUserInfoObj> list, @e String str, @e String str2) {
        this.user_info = list;
        this.past_group_game_desc = str;
        this.past_group_time_desc = str2;
    }

    public static /* synthetic */ GroupBuyInfoObj copy$default(GroupBuyInfoObj groupBuyInfoObj, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{groupBuyInfoObj, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15660, new Class[]{GroupBuyInfoObj.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, GroupBuyInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GroupBuyInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = groupBuyInfoObj.user_info;
        }
        if ((i10 & 2) != 0) {
            str = groupBuyInfoObj.past_group_game_desc;
        }
        if ((i10 & 4) != 0) {
            str2 = groupBuyInfoObj.past_group_time_desc;
        }
        return groupBuyInfoObj.copy(list, str, str2);
    }

    @e
    public final List<GroupBuyUserInfoObj> component1() {
        return this.user_info;
    }

    @e
    public final String component2() {
        return this.past_group_game_desc;
    }

    @e
    public final String component3() {
        return this.past_group_time_desc;
    }

    @d
    public final GroupBuyInfoObj copy(@e List<GroupBuyUserInfoObj> list, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 15659, new Class[]{List.class, String.class, String.class}, GroupBuyInfoObj.class);
        return patchProxyResultProxy.isSupported ? (GroupBuyInfoObj) patchProxyResultProxy.result : new GroupBuyInfoObj(list, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15663, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupBuyInfoObj)) {
            return false;
        }
        GroupBuyInfoObj groupBuyInfoObj = (GroupBuyInfoObj) obj;
        return f0.g(this.user_info, groupBuyInfoObj.user_info) && f0.g(this.past_group_game_desc, groupBuyInfoObj.past_group_game_desc) && f0.g(this.past_group_time_desc, groupBuyInfoObj.past_group_time_desc);
    }

    @e
    public final String getPast_group_game_desc() {
        return this.past_group_game_desc;
    }

    @e
    public final String getPast_group_time_desc() {
        return this.past_group_time_desc;
    }

    @e
    public final List<GroupBuyUserInfoObj> getUser_info() {
        return this.user_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15662, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<GroupBuyUserInfoObj> list = this.user_info;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.past_group_game_desc;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.past_group_time_desc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPast_group_game_desc(@e String str) {
        this.past_group_game_desc = str;
    }

    public final void setPast_group_time_desc(@e String str) {
        this.past_group_time_desc = str;
    }

    public final void setUser_info(@e List<GroupBuyUserInfoObj> list) {
        this.user_info = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15661, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GroupBuyInfoObj(user_info=" + this.user_info + ", past_group_game_desc=" + this.past_group_game_desc + ", past_group_time_desc=" + this.past_group_time_desc + ')';
    }
}
