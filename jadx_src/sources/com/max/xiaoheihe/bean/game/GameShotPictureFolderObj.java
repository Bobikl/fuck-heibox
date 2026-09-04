package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameShotPictureFolderObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameShotPictureFolderObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private String icon;

    @e
    private String name;

    @e
    private String thumb;

    @e
    private String update_time;

    @e
    private String valid_count;

    public GameShotPictureFolderObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.valid_count = str;
        this.update_time = str2;
        this.icon = str3;
        this.thumb = str4;
        this.name = str5;
        this.appid = str6;
    }

    public static /* synthetic */ GameShotPictureFolderObj copy$default(GameShotPictureFolderObj gameShotPictureFolderObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameShotPictureFolderObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 14871, new Class[]{GameShotPictureFolderObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GameShotPictureFolderObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameShotPictureFolderObj) patchProxyResultProxy.result;
        }
        return gameShotPictureFolderObj.copy((i10 & 1) != 0 ? gameShotPictureFolderObj.valid_count : str, (i10 & 2) != 0 ? gameShotPictureFolderObj.update_time : str2, (i10 & 4) != 0 ? gameShotPictureFolderObj.icon : str3, (i10 & 8) != 0 ? gameShotPictureFolderObj.thumb : str4, (i10 & 16) != 0 ? gameShotPictureFolderObj.name : str5, (i10 & 32) != 0 ? gameShotPictureFolderObj.appid : str6);
    }

    @e
    public final String component1() {
        return this.valid_count;
    }

    @e
    public final String component2() {
        return this.update_time;
    }

    @e
    public final String component3() {
        return this.icon;
    }

    @e
    public final String component4() {
        return this.thumb;
    }

    @e
    public final String component5() {
        return this.name;
    }

    @e
    public final String component6() {
        return this.appid;
    }

    @d
    public final GameShotPictureFolderObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 14870, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, GameShotPictureFolderObj.class);
        return patchProxyResultProxy.isSupported ? (GameShotPictureFolderObj) patchProxyResultProxy.result : new GameShotPictureFolderObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14869, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!(obj == null ? true : obj instanceof GameShotPictureFolderObj)) {
            return false;
        }
        GameShotPictureFolderObj gameShotPictureFolderObj = (GameShotPictureFolderObj) obj;
        if (f0.g(this.name, gameShotPictureFolderObj != null ? gameShotPictureFolderObj.name : null)) {
            if (f0.g(this.appid, gameShotPictureFolderObj != null ? gameShotPictureFolderObj.appid : null)) {
                return true;
            }
        }
        return false;
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final String getUpdate_time() {
        return this.update_time;
    }

    @e
    public final String getValid_count() {
        return this.valid_count;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14873, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.valid_count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.update_time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thumb;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appid;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setUpdate_time(@e String str) {
        this.update_time = str;
    }

    public final void setValid_count(@e String str) {
        this.valid_count = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14872, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GameShotPictureFolderObj(valid_count=" + this.valid_count + ", update_time=" + this.update_time + ", icon=" + this.icon + ", thumb=" + this.thumb + ", name=" + this.name + ", appid=" + this.appid + ')';
    }
}
