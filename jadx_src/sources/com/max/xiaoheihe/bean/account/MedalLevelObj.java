package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UserMedalV2Obj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MedalLevelObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer achieved;

    @e
    private String achieved_desc;
    private int achieved_percent;

    @e
    private String btn_desc;

    @e
    private String btn_protocol;

    @e
    private String desc;

    @e
    private String exp;

    @e
    private String highlight_text;

    @d
    private String img;
    private int level;

    @d
    private String name;

    @e
    private String rank_level;

    @d
    private String thumb;

    public MedalLevelObj(int i10, @e String str, @e String str2, @e Integer num, @e String str3, @e String str4, @d String thumb, @d String img, @d String name, int i11, @e String str5, @e String str6, @e String str7) {
        f0.p(thumb, "thumb");
        f0.p(img, "img");
        f0.p(name, "name");
        this.achieved_percent = i10;
        this.btn_protocol = str;
        this.btn_desc = str2;
        this.achieved = num;
        this.rank_level = str3;
        this.achieved_desc = str4;
        this.thumb = thumb;
        this.img = img;
        this.name = name;
        this.level = i11;
        this.highlight_text = str5;
        this.desc = str6;
        this.exp = str7;
    }

    public /* synthetic */ MedalLevelObj(int i10, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i11, String str8, String str9, String str10, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, str, str2, num, str3, str4, str5, str6, str7, (i12 & 512) != 0 ? 0 : i11, str8, str9, str10);
    }

    public static /* synthetic */ MedalLevelObj copy$default(MedalLevelObj medalLevelObj, int i10, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, int i11, String str8, String str9, String str10, int i12, Object obj) {
        Object[] objArr = {medalLevelObj, new Integer(i10), str, str2, num, str3, str4, str5, str6, str7, new Integer(i11), str8, str9, str10, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 13880, new Class[]{MedalLevelObj.class, cls, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class, cls, Object.class}, MedalLevelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MedalLevelObj) patchProxyResultProxy.result;
        }
        return medalLevelObj.copy((i12 & 1) != 0 ? medalLevelObj.achieved_percent : i10, (i12 & 2) != 0 ? medalLevelObj.btn_protocol : str, (i12 & 4) != 0 ? medalLevelObj.btn_desc : str2, (i12 & 8) != 0 ? medalLevelObj.achieved : num, (i12 & 16) != 0 ? medalLevelObj.rank_level : str3, (i12 & 32) != 0 ? medalLevelObj.achieved_desc : str4, (i12 & 64) != 0 ? medalLevelObj.thumb : str5, (i12 & 128) != 0 ? medalLevelObj.img : str6, (i12 & 256) != 0 ? medalLevelObj.name : str7, (i12 & 512) != 0 ? medalLevelObj.level : i11, (i12 & 1024) != 0 ? medalLevelObj.highlight_text : str8, (i12 & 2048) != 0 ? medalLevelObj.desc : str9, (i12 & 4096) != 0 ? medalLevelObj.exp : str10);
    }

    public final int component1() {
        return this.achieved_percent;
    }

    public final int component10() {
        return this.level;
    }

    @e
    public final String component11() {
        return this.highlight_text;
    }

    @e
    public final String component12() {
        return this.desc;
    }

    @e
    public final String component13() {
        return this.exp;
    }

    @e
    public final String component2() {
        return this.btn_protocol;
    }

    @e
    public final String component3() {
        return this.btn_desc;
    }

    @e
    public final Integer component4() {
        return this.achieved;
    }

    @e
    public final String component5() {
        return this.rank_level;
    }

    @e
    public final String component6() {
        return this.achieved_desc;
    }

    @d
    public final String component7() {
        return this.thumb;
    }

    @d
    public final String component8() {
        return this.img;
    }

    @d
    public final String component9() {
        return this.name;
    }

    @d
    public final MedalLevelObj copy(int i10, @e String str, @e String str2, @e Integer num, @e String str3, @e String str4, @d String thumb, @d String img, @d String name, int i11, @e String str5, @e String str6, @e String str7) {
        Object[] objArr = {new Integer(i10), str, str2, num, str3, str4, thumb, img, name, new Integer(i11), str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 13879, new Class[]{cls, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, cls, String.class, String.class, String.class}, MedalLevelObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MedalLevelObj) patchProxyResultProxy.result;
        }
        f0.p(thumb, "thumb");
        f0.p(img, "img");
        f0.p(name, "name");
        return new MedalLevelObj(i10, str, str2, num, str3, str4, thumb, img, name, i11, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13883, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MedalLevelObj)) {
            return false;
        }
        MedalLevelObj medalLevelObj = (MedalLevelObj) obj;
        return this.achieved_percent == medalLevelObj.achieved_percent && f0.g(this.btn_protocol, medalLevelObj.btn_protocol) && f0.g(this.btn_desc, medalLevelObj.btn_desc) && f0.g(this.achieved, medalLevelObj.achieved) && f0.g(this.rank_level, medalLevelObj.rank_level) && f0.g(this.achieved_desc, medalLevelObj.achieved_desc) && f0.g(this.thumb, medalLevelObj.thumb) && f0.g(this.img, medalLevelObj.img) && f0.g(this.name, medalLevelObj.name) && this.level == medalLevelObj.level && f0.g(this.highlight_text, medalLevelObj.highlight_text) && f0.g(this.desc, medalLevelObj.desc) && f0.g(this.exp, medalLevelObj.exp);
    }

    @e
    public final Integer getAchieved() {
        return this.achieved;
    }

    @e
    public final String getAchieved_desc() {
        return this.achieved_desc;
    }

    public final int getAchieved_percent() {
        return this.achieved_percent;
    }

    @e
    public final String getBtn_desc() {
        return this.btn_desc;
    }

    @e
    public final String getBtn_protocol() {
        return this.btn_protocol;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getExp() {
        return this.exp;
    }

    @e
    public final String getHighlight_text() {
        return this.highlight_text;
    }

    @d
    public final String getImg() {
        return this.img;
    }

    public final int getLevel() {
        return this.level;
    }

    @d
    public final String getName() {
        return this.name;
    }

    @e
    public final String getRank_level() {
        return this.rank_level;
    }

    @d
    public final String getThumb() {
        return this.thumb;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13882, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = this.achieved_percent * 31;
        String str = this.btn_protocol;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.btn_desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.achieved;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.rank_level;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.achieved_desc;
        int iHashCode5 = (((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.thumb.hashCode()) * 31) + this.img.hashCode()) * 31) + this.name.hashCode()) * 31) + this.level) * 31;
        String str5 = this.highlight_text;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.exp;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAchieved(@e Integer num) {
        this.achieved = num;
    }

    public final void setAchieved_desc(@e String str) {
        this.achieved_desc = str;
    }

    public final void setAchieved_percent(int i10) {
        this.achieved_percent = i10;
    }

    public final void setBtn_desc(@e String str) {
        this.btn_desc = str;
    }

    public final void setBtn_protocol(@e String str) {
        this.btn_protocol = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setExp(@e String str) {
        this.exp = str;
    }

    public final void setHighlight_text(@e String str) {
        this.highlight_text = str;
    }

    public final void setImg(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13877, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.img = str;
    }

    public final void setLevel(int i10) {
        this.level = i10;
    }

    public final void setName(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13878, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.name = str;
    }

    public final void setRank_level(@e String str) {
        this.rank_level = str;
    }

    public final void setThumb(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13876, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.thumb = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13881, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MedalLevelObj(achieved_percent=" + this.achieved_percent + ", btn_protocol=" + this.btn_protocol + ", btn_desc=" + this.btn_desc + ", achieved=" + this.achieved + ", rank_level=" + this.rank_level + ", achieved_desc=" + this.achieved_desc + ", thumb=" + this.thumb + ", img=" + this.img + ", name=" + this.name + ", level=" + this.level + ", highlight_text=" + this.highlight_text + ", desc=" + this.desc + ", exp=" + this.exp + ')';
    }
}
