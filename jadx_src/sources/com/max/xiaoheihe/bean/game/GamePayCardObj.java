package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GamePayCardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GamePayCardObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private String current_price;

    @e
    private String image;

    @e
    private String name;

    public GamePayCardObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.current_price = str;
        this.image = str2;
        this.name = str3;
        this.appid = str4;
    }

    public static /* synthetic */ GamePayCardObj copy$default(GamePayCardObj gamePayCardObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePayCardObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14836, new Class[]{GamePayCardObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, GamePayCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePayCardObj) patchProxyResultProxy.result;
        }
        return gamePayCardObj.copy((i10 & 1) != 0 ? gamePayCardObj.current_price : str, (i10 & 2) != 0 ? gamePayCardObj.image : str2, (i10 & 4) != 0 ? gamePayCardObj.name : str3, (i10 & 8) != 0 ? gamePayCardObj.appid : str4);
    }

    @e
    public final String component1() {
        return this.current_price;
    }

    @e
    public final String component2() {
        return this.image;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final String component4() {
        return this.appid;
    }

    @d
    public final GamePayCardObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 14835, new Class[]{String.class, String.class, String.class, String.class}, GamePayCardObj.class);
        return patchProxyResultProxy.isSupported ? (GamePayCardObj) patchProxyResultProxy.result : new GamePayCardObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14839, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamePayCardObj)) {
            return false;
        }
        GamePayCardObj gamePayCardObj = (GamePayCardObj) obj;
        return f0.g(this.current_price, gamePayCardObj.current_price) && f0.g(this.image, gamePayCardObj.image) && f0.g(this.name, gamePayCardObj.name) && f0.g(this.appid, gamePayCardObj.appid);
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final String getCurrent_price() {
        return this.current_price;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14838, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.current_price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appid;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setCurrent_price(@e String str) {
        this.current_price = str;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14837, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GamePayCardObj(current_price=" + this.current_price + ", image=" + this.image + ", name=" + this.name + ", appid=" + this.appid + ')';
    }
}
