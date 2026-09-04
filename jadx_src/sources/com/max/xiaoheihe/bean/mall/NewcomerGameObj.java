package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerNotifyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class NewcomerGameObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String appid;

    @e
    private String game_type;

    @e
    private String head_img;

    @e
    private String name;

    @e
    private String new_price;

    @e
    private String price;

    @e
    private String sku_id;

    public NewcomerGameObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this.sku_id = str;
        this.name = str2;
        this.price = str3;
        this.game_type = str4;
        this.new_price = str5;
        this.appid = str6;
        this.head_img = str7;
    }

    public static /* synthetic */ NewcomerGameObj copy$default(NewcomerGameObj newcomerGameObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerGameObj, str, str2, str3, str4, str5, str6, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 15527, new Class[]{NewcomerGameObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, NewcomerGameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (NewcomerGameObj) patchProxyResultProxy.result;
        }
        return newcomerGameObj.copy((i10 & 1) != 0 ? newcomerGameObj.sku_id : str, (i10 & 2) != 0 ? newcomerGameObj.name : str2, (i10 & 4) != 0 ? newcomerGameObj.price : str3, (i10 & 8) != 0 ? newcomerGameObj.game_type : str4, (i10 & 16) != 0 ? newcomerGameObj.new_price : str5, (i10 & 32) != 0 ? newcomerGameObj.appid : str6, (i10 & 64) != 0 ? newcomerGameObj.head_img : str7);
    }

    @e
    public final String component1() {
        return this.sku_id;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.price;
    }

    @e
    public final String component4() {
        return this.game_type;
    }

    @e
    public final String component5() {
        return this.new_price;
    }

    @e
    public final String component6() {
        return this.appid;
    }

    @e
    public final String component7() {
        return this.head_img;
    }

    @d
    public final NewcomerGameObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 15526, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, NewcomerGameObj.class);
        return patchProxyResultProxy.isSupported ? (NewcomerGameObj) patchProxyResultProxy.result : new NewcomerGameObj(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15530, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewcomerGameObj)) {
            return false;
        }
        NewcomerGameObj newcomerGameObj = (NewcomerGameObj) obj;
        return f0.g(this.sku_id, newcomerGameObj.sku_id) && f0.g(this.name, newcomerGameObj.name) && f0.g(this.price, newcomerGameObj.price) && f0.g(this.game_type, newcomerGameObj.game_type) && f0.g(this.new_price, newcomerGameObj.new_price) && f0.g(this.appid, newcomerGameObj.appid) && f0.g(this.head_img, newcomerGameObj.head_img);
    }

    @e
    public final String getAppid() {
        return this.appid;
    }

    @e
    public final String getGame_type() {
        return this.game_type;
    }

    @e
    public final String getHead_img() {
        return this.head_img;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getNew_price() {
        return this.new_price;
    }

    @e
    public final String getPrice() {
        return this.price;
    }

    @e
    public final String getSku_id() {
        return this.sku_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15529, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.sku_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.game_type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.new_price;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appid;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.head_img;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAppid(@e String str) {
        this.appid = str;
    }

    public final void setGame_type(@e String str) {
        this.game_type = str;
    }

    public final void setHead_img(@e String str) {
        this.head_img = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setNew_price(@e String str) {
        this.new_price = str;
    }

    public final void setPrice(@e String str) {
        this.price = str;
    }

    public final void setSku_id(@e String str) {
        this.sku_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15528, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "NewcomerGameObj(sku_id=" + this.sku_id + ", name=" + this.name + ", price=" + this.price + ", game_type=" + this.game_type + ", new_price=" + this.new_price + ", appid=" + this.appid + ", head_img=" + this.head_img + ')';
    }
}
