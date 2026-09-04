package com.max.xiaoheihe.bean.game.calendar;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.game.GamePublishBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameEventObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameEventObj extends GamePublishBaseObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String end_timestamp;

    @e
    private String event_id;

    @e
    private String image;

    @e
    private Boolean need_shine_bg;

    @e
    private List<String> platforms_icon;

    @e
    private String protocol;

    @e
    private String start_timestamp;

    @e
    private String title;

    public GameEventObj(@e String str, @e List<String> list, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        this.image = str;
        this.platforms_icon = list;
        this.title = str2;
        this.desc = str3;
        this.start_timestamp = str4;
        this.end_timestamp = str5;
        this.protocol = str6;
        this.event_id = str7;
        this.need_shine_bg = bool;
    }

    public static /* synthetic */ GameEventObj copy$default(GameEventObj gameEventObj, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameEventObj, str, list, str2, str3, str4, str5, str6, str7, bool, new Integer(i10), obj}, null, changeQuickRedirect, true, 15045, new Class[]{GameEventObj.class, String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Integer.TYPE, Object.class}, GameEventObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameEventObj) patchProxyResultProxy.result;
        }
        return gameEventObj.copy((i10 & 1) != 0 ? gameEventObj.image : str, (i10 & 2) != 0 ? gameEventObj.platforms_icon : list, (i10 & 4) != 0 ? gameEventObj.title : str2, (i10 & 8) != 0 ? gameEventObj.desc : str3, (i10 & 16) != 0 ? gameEventObj.start_timestamp : str4, (i10 & 32) != 0 ? gameEventObj.end_timestamp : str5, (i10 & 64) != 0 ? gameEventObj.protocol : str6, (i10 & 128) != 0 ? gameEventObj.event_id : str7, (i10 & 256) != 0 ? gameEventObj.need_shine_bg : bool);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final List<String> component2() {
        return this.platforms_icon;
    }

    @e
    public final String component3() {
        return this.title;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @e
    public final String component5() {
        return this.start_timestamp;
    }

    @e
    public final String component6() {
        return this.end_timestamp;
    }

    @e
    public final String component7() {
        return this.protocol;
    }

    @e
    public final String component8() {
        return this.event_id;
    }

    @e
    public final Boolean component9() {
        return this.need_shine_bg;
    }

    @d
    public final GameEventObj copy(@e String str, @e List<String> list, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e Boolean bool) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, str2, str3, str4, str5, str6, str7, bool}, this, changeQuickRedirect, false, 15044, new Class[]{String.class, List.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, GameEventObj.class);
        return patchProxyResultProxy.isSupported ? (GameEventObj) patchProxyResultProxy.result : new GameEventObj(str, list, str2, str3, str4, str5, str6, str7, bool);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15048, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameEventObj)) {
            return false;
        }
        GameEventObj gameEventObj = (GameEventObj) obj;
        return f0.g(this.image, gameEventObj.image) && f0.g(this.platforms_icon, gameEventObj.platforms_icon) && f0.g(this.title, gameEventObj.title) && f0.g(this.desc, gameEventObj.desc) && f0.g(this.start_timestamp, gameEventObj.start_timestamp) && f0.g(this.end_timestamp, gameEventObj.end_timestamp) && f0.g(this.protocol, gameEventObj.protocol) && f0.g(this.event_id, gameEventObj.event_id) && f0.g(this.need_shine_bg, gameEventObj.need_shine_bg);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getEnd_timestamp() {
        return this.end_timestamp;
    }

    @e
    public final String getEvent_id() {
        return this.event_id;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final Boolean getNeed_shine_bg() {
        return this.need_shine_bg;
    }

    @e
    public final List<String> getPlatforms_icon() {
        return this.platforms_icon;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getStart_timestamp() {
        return this.start_timestamp;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15047, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.platforms_icon;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.start_timestamp;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.end_timestamp;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.event_id;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.need_shine_bg;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isNormalEvent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15043, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(getItem_type(), "1");
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setEnd_timestamp(@e String str) {
        this.end_timestamp = str;
    }

    public final void setEvent_id(@e String str) {
        this.event_id = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setNeed_shine_bg(@e Boolean bool) {
        this.need_shine_bg = bool;
    }

    public final void setPlatforms_icon(@e List<String> list) {
        this.platforms_icon = list;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setStart_timestamp(@e String str) {
        this.start_timestamp = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15046, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameEventObj(image=" + this.image + ", platforms_icon=" + this.platforms_icon + ", title=" + this.title + ", desc=" + this.desc + ", start_timestamp=" + this.start_timestamp + ", end_timestamp=" + this.end_timestamp + ", protocol=" + this.protocol + ", event_id=" + this.event_id + ", need_shine_bg=" + this.need_shine_bg + ')';
    }
}
