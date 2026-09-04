package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDetailDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameDetailDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String delta;

    @e
    private String desc;

    @e
    private RichAttributeModelObj hb_rich_text;

    @e
    private List<GamePeakValueObj> peak_values;

    @e
    private String protocol;

    @e
    private String rank;

    @e
    private String value;

    public GameDetailDataObj(@e String str, @e String str2, @e String str3, @e String str4, @e RichAttributeModelObj richAttributeModelObj, @e List<GamePeakValueObj> list, @e String str5) {
        this.desc = str;
        this.rank = str2;
        this.delta = str3;
        this.value = str4;
        this.hb_rich_text = richAttributeModelObj;
        this.peak_values = list;
        this.protocol = str5;
    }

    public static /* synthetic */ GameDetailDataObj copy$default(GameDetailDataObj gameDetailDataObj, String str, String str2, String str3, String str4, RichAttributeModelObj richAttributeModelObj, List list, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameDetailDataObj, str, str2, str3, str4, richAttributeModelObj, list, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14712, new Class[]{GameDetailDataObj.class, String.class, String.class, String.class, String.class, RichAttributeModelObj.class, List.class, String.class, Integer.TYPE, Object.class}, GameDetailDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameDetailDataObj) patchProxyResultProxy.result;
        }
        return gameDetailDataObj.copy((i10 & 1) != 0 ? gameDetailDataObj.desc : str, (i10 & 2) != 0 ? gameDetailDataObj.rank : str2, (i10 & 4) != 0 ? gameDetailDataObj.delta : str3, (i10 & 8) != 0 ? gameDetailDataObj.value : str4, (i10 & 16) != 0 ? gameDetailDataObj.hb_rich_text : richAttributeModelObj, (i10 & 32) != 0 ? gameDetailDataObj.peak_values : list, (i10 & 64) != 0 ? gameDetailDataObj.protocol : str5);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final String component2() {
        return this.rank;
    }

    @e
    public final String component3() {
        return this.delta;
    }

    @e
    public final String component4() {
        return this.value;
    }

    @e
    public final RichAttributeModelObj component5() {
        return this.hb_rich_text;
    }

    @e
    public final List<GamePeakValueObj> component6() {
        return this.peak_values;
    }

    @e
    public final String component7() {
        return this.protocol;
    }

    @d
    public final GameDetailDataObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e RichAttributeModelObj richAttributeModelObj, @e List<GamePeakValueObj> list, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, richAttributeModelObj, list, str5}, this, changeQuickRedirect, false, 14711, new Class[]{String.class, String.class, String.class, String.class, RichAttributeModelObj.class, List.class, String.class}, GameDetailDataObj.class);
        return patchProxyResultProxy.isSupported ? (GameDetailDataObj) patchProxyResultProxy.result : new GameDetailDataObj(str, str2, str3, str4, richAttributeModelObj, list, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14715, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDetailDataObj)) {
            return false;
        }
        GameDetailDataObj gameDetailDataObj = (GameDetailDataObj) obj;
        return f0.g(this.desc, gameDetailDataObj.desc) && f0.g(this.rank, gameDetailDataObj.rank) && f0.g(this.delta, gameDetailDataObj.delta) && f0.g(this.value, gameDetailDataObj.value) && f0.g(this.hb_rich_text, gameDetailDataObj.hb_rich_text) && f0.g(this.peak_values, gameDetailDataObj.peak_values) && f0.g(this.protocol, gameDetailDataObj.protocol);
    }

    @e
    public final String getDelta() {
        return this.delta;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final RichAttributeModelObj getHb_rich_text() {
        return this.hb_rich_text;
    }

    @e
    public final List<GamePeakValueObj> getPeak_values() {
        return this.peak_values;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getRank() {
        return this.rank;
    }

    @e
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14714, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rank;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.delta;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.value;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RichAttributeModelObj richAttributeModelObj = this.hb_rich_text;
        int iHashCode5 = (iHashCode4 + (richAttributeModelObj == null ? 0 : richAttributeModelObj.hashCode())) * 31;
        List<GamePeakValueObj> list = this.peak_values;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.protocol;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setDelta(@e String str) {
        this.delta = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setHb_rich_text(@e RichAttributeModelObj richAttributeModelObj) {
        this.hb_rich_text = richAttributeModelObj;
    }

    public final void setPeak_values(@e List<GamePeakValueObj> list) {
        this.peak_values = list;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setRank(@e String str) {
        this.rank = str;
    }

    public final void setValue(@e String str) {
        this.value = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14713, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameDetailDataObj(desc=" + this.desc + ", rank=" + this.rank + ", delta=" + this.delta + ", value=" + this.value + ", hb_rich_text=" + this.hb_rich_text + ", peak_values=" + this.peak_values + ", protocol=" + this.protocol + ')';
    }
}
