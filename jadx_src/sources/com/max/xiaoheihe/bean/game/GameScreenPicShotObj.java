package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GameScreenPicShotObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameScreenPicShotObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private String bg_img;

    @e
    private String desc;

    @e
    private String icon;

    @e
    private String img_url;
    private boolean isChecked;

    @e
    private String main_color;

    @e
    private String name;

    @e
    private String name_en;

    @e
    private String platform_icon;

    @e
    private String publish_timestamp;

    @e
    private String thumb;

    @e
    private String topic_id;

    public GameScreenPicShotObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, boolean z10) {
        this.img_url = str;
        this.desc = str2;
        this.name = str3;
        this.thumb = str4;
        this.icon = str5;
        this.bg_img = str6;
        this.publish_timestamp = str7;
        this.main_color = str8;
        this.platform_icon = str9;
        this.topic_id = str10;
        this.name_en = str11;
        this.appid = str12;
        this.isChecked = z10;
    }

    public /* synthetic */ GameScreenPicShotObj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, int i10, u uVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, (i10 & 4096) != 0 ? false : z10);
    }

    public static /* synthetic */ GameScreenPicShotObj copy$default(GameScreenPicShotObj gameScreenPicShotObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameScreenPicShotObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 14854, new Class[]{GameScreenPicShotObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Object.class}, GameScreenPicShotObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameScreenPicShotObj) patchProxyResultProxy.result;
        }
        return gameScreenPicShotObj.copy((i10 & 1) != 0 ? gameScreenPicShotObj.img_url : str, (i10 & 2) != 0 ? gameScreenPicShotObj.desc : str2, (i10 & 4) != 0 ? gameScreenPicShotObj.name : str3, (i10 & 8) != 0 ? gameScreenPicShotObj.thumb : str4, (i10 & 16) != 0 ? gameScreenPicShotObj.icon : str5, (i10 & 32) != 0 ? gameScreenPicShotObj.bg_img : str6, (i10 & 64) != 0 ? gameScreenPicShotObj.publish_timestamp : str7, (i10 & 128) != 0 ? gameScreenPicShotObj.main_color : str8, (i10 & 256) != 0 ? gameScreenPicShotObj.platform_icon : str9, (i10 & 512) != 0 ? gameScreenPicShotObj.topic_id : str10, (i10 & 1024) != 0 ? gameScreenPicShotObj.name_en : str11, (i10 & 2048) != 0 ? gameScreenPicShotObj.appid : str12, (i10 & 4096) != 0 ? gameScreenPicShotObj.isChecked : z10 ? 1 : 0);
    }

    @e
    public final String component1() {
        return this.img_url;
    }

    @e
    public final String component10() {
        return this.topic_id;
    }

    @e
    public final String component11() {
        return this.name_en;
    }

    @e
    public final String component12() {
        return this.appid;
    }

    public final boolean component13() {
        return this.isChecked;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component4() {
        return this.thumb;
    }

    @e
    public final String component5() {
        return this.icon;
    }

    @e
    public final String component6() {
        return this.bg_img;
    }

    @e
    public final String component7() {
        return this.publish_timestamp;
    }

    @e
    public final String component8() {
        return this.main_color;
    }

    @e
    public final String component9() {
        return this.platform_icon;
    }

    @d
    public final GameScreenPicShotObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10, @e String str11, @e String str12, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 14853, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, GameScreenPicShotObj.class);
        return patchProxyResultProxy.isSupported ? (GameScreenPicShotObj) patchProxyResultProxy.result : new GameScreenPicShotObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14852, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj != null ? obj instanceof GameScreenPicShotObj : true)) {
            return false;
        }
        GameScreenPicShotObj gameScreenPicShotObj = (GameScreenPicShotObj) obj;
        return f0.g(gameScreenPicShotObj != null ? gameScreenPicShotObj.img_url : null, this.img_url);
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final String getBg_img() {
        return this.bg_img;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getImg_url() {
        return this.img_url;
    }

    @e
    public final String getMain_color() {
        return this.main_color;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getName_en() {
        return this.name_en;
    }

    @e
    public final String getPlatform_icon() {
        return this.platform_icon;
    }

    @e
    public final String getPublish_timestamp() {
        return this.publish_timestamp;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final String getTopic_id() {
        return this.topic_id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14856, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img_url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bg_img;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.publish_timestamp;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.main_color;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.platform_icon;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.topic_id;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name_en;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.appid;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        boolean z10 = this.isChecked;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode12 + r10;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setBg_img(@e String str) {
        this.bg_img = str;
    }

    public final void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setImg_url(@e String str) {
        this.img_url = str;
    }

    public final void setMain_color(@e String str) {
        this.main_color = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setName_en(@e String str) {
        this.name_en = str;
    }

    public final void setPlatform_icon(@e String str) {
        this.platform_icon = str;
    }

    public final void setPublish_timestamp(@e String str) {
        this.publish_timestamp = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setTopic_id(@e String str) {
        this.topic_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14855, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameScreenPicShotObj(img_url=" + this.img_url + ", desc=" + this.desc + ", name=" + this.name + ", thumb=" + this.thumb + ", icon=" + this.icon + ", bg_img=" + this.bg_img + ", publish_timestamp=" + this.publish_timestamp + ", main_color=" + this.main_color + ", platform_icon=" + this.platform_icon + ", topic_id=" + this.topic_id + ", name_en=" + this.name_en + ", appid=" + this.appid + ", isChecked=" + this.isChecked + ')';
    }
}
