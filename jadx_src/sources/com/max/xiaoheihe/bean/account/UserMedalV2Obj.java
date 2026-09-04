package com.max.xiaoheihe.bean.account;

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

/* JADX INFO: compiled from: UserMedalV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UserMedalV2Obj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @d
    private String exp;

    @e
    private String highlight_text;
    private int level;

    @d
    private List<MedalLevelObj> levels;

    @d
    private String medal_id;
    private int wear;

    @e
    private Integer wear_level;

    public UserMedalV2Obj(@e Integer num, @d String medal_id, int i10, @d String exp, int i11, @d List<MedalLevelObj> levels, @e String str, @e String str2) {
        f0.p(medal_id, "medal_id");
        f0.p(exp, "exp");
        f0.p(levels, "levels");
        this.wear_level = num;
        this.medal_id = medal_id;
        this.level = i10;
        this.exp = exp;
        this.wear = i11;
        this.levels = levels;
        this.highlight_text = str;
        this.desc = str2;
    }

    public /* synthetic */ UserMedalV2Obj(Integer num, String str, int i10, String str2, int i11, List list, String str3, String str4, int i12, u uVar) {
        this(num, str, (i12 & 4) != 0 ? 0 : i10, str2, (i12 & 16) != 0 ? 0 : i11, list, str3, str4);
    }

    public static /* synthetic */ UserMedalV2Obj copy$default(UserMedalV2Obj userMedalV2Obj, Integer num, String str, int i10, String str2, int i11, List list, String str3, String str4, int i12, Object obj) {
        int i13 = i10;
        Object[] objArr = {userMedalV2Obj, num, str, new Integer(i13), str2, new Integer(i11), list, str3, str4, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14021, new Class[]{UserMedalV2Obj.class, Integer.class, String.class, cls, String.class, cls, List.class, String.class, String.class, cls, Object.class}, UserMedalV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserMedalV2Obj) patchProxyResultProxy.result;
        }
        Integer num2 = (i12 & 1) != 0 ? userMedalV2Obj.wear_level : num;
        String str5 = (i12 & 2) != 0 ? userMedalV2Obj.medal_id : str;
        if ((i12 & 4) != 0) {
            i13 = userMedalV2Obj.level;
        }
        return userMedalV2Obj.copy(num2, str5, i13, (i12 & 8) != 0 ? userMedalV2Obj.exp : str2, (i12 & 16) != 0 ? userMedalV2Obj.wear : i11, (i12 & 32) != 0 ? userMedalV2Obj.levels : list, (i12 & 64) != 0 ? userMedalV2Obj.highlight_text : str3, (i12 & 128) != 0 ? userMedalV2Obj.desc : str4);
    }

    @e
    public final Integer component1() {
        return this.wear_level;
    }

    @d
    public final String component2() {
        return this.medal_id;
    }

    public final int component3() {
        return this.level;
    }

    @d
    public final String component4() {
        return this.exp;
    }

    public final int component5() {
        return this.wear;
    }

    @d
    public final List<MedalLevelObj> component6() {
        return this.levels;
    }

    @e
    public final String component7() {
        return this.highlight_text;
    }

    @e
    public final String component8() {
        return this.desc;
    }

    @d
    public final UserMedalV2Obj copy(@e Integer num, @d String medal_id, int i10, @d String exp, int i11, @d List<MedalLevelObj> levels, @e String str, @e String str2) {
        Object[] objArr = {num, medal_id, new Integer(i10), exp, new Integer(i11), levels, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 14020, new Class[]{Integer.class, String.class, cls, String.class, cls, List.class, String.class, String.class}, UserMedalV2Obj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserMedalV2Obj) patchProxyResultProxy.result;
        }
        f0.p(medal_id, "medal_id");
        f0.p(exp, "exp");
        f0.p(levels, "levels");
        return new UserMedalV2Obj(num, medal_id, i10, exp, i11, levels, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14024, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMedalV2Obj)) {
            return false;
        }
        UserMedalV2Obj userMedalV2Obj = (UserMedalV2Obj) obj;
        return f0.g(this.wear_level, userMedalV2Obj.wear_level) && f0.g(this.medal_id, userMedalV2Obj.medal_id) && this.level == userMedalV2Obj.level && f0.g(this.exp, userMedalV2Obj.exp) && this.wear == userMedalV2Obj.wear && f0.g(this.levels, userMedalV2Obj.levels) && f0.g(this.highlight_text, userMedalV2Obj.highlight_text) && f0.g(this.desc, userMedalV2Obj.desc);
    }

    @d
    public final MedalLevelObj getCurrentLevel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14018, new Class[0], MedalLevelObj.class);
        return patchProxyResultProxy.isSupported ? (MedalLevelObj) patchProxyResultProxy.result : this.levels.get(fi.u.u(this.level - 1, 0));
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @d
    public final String getExp() {
        return this.exp;
    }

    @e
    public final String getHighlight_text() {
        return this.highlight_text;
    }

    public final int getLevel() {
        return this.level;
    }

    @d
    public final List<MedalLevelObj> getLevels() {
        return this.levels;
    }

    @d
    public final String getMedal_id() {
        return this.medal_id;
    }

    @e
    public final String getNext_exp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14019, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return this.level == this.levels.size() + (-1) ? getCurrentLevel().getExp() : this.levels.get(this.level).getExp();
    }

    public final int getWear() {
        return this.wear;
    }

    @e
    public final Integer getWear_level() {
        return this.wear_level;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14023, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.wear_level;
        int iHashCode = (((((((((((num == null ? 0 : num.hashCode()) * 31) + this.medal_id.hashCode()) * 31) + this.level) * 31) + this.exp.hashCode()) * 31) + this.wear) * 31) + this.levels.hashCode()) * 31;
        String str = this.highlight_text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.desc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setExp(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14016, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.exp = str;
    }

    public final void setHighlight_text(@e String str) {
        this.highlight_text = str;
    }

    public final void setLevel(int i10) {
        this.level = i10;
    }

    public final void setLevels(@d List<MedalLevelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 14017, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.levels = list;
    }

    public final void setMedal_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14015, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.medal_id = str;
    }

    public final void setWear(int i10) {
        this.wear = i10;
    }

    public final void setWear_level(@e Integer num) {
        this.wear_level = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14022, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UserMedalV2Obj(wear_level=" + this.wear_level + ", medal_id=" + this.medal_id + ", level=" + this.level + ", exp=" + this.exp + ", wear=" + this.wear + ", levels=" + this.levels + ", highlight_text=" + this.highlight_text + ", desc=" + this.desc + ')';
    }
}
