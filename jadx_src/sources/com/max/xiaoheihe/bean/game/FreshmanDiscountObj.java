package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FreshmanDiscountObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FreshmanDiscountObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private FreshmanDiscountGameObj game_info;

    @e
    private String session;

    @e
    private String top_img;

    public FreshmanDiscountObj(@e String str, @e String str2, @e FreshmanDiscountGameObj freshmanDiscountGameObj) {
        this.top_img = str;
        this.session = str2;
        this.game_info = freshmanDiscountGameObj;
    }

    public static /* synthetic */ FreshmanDiscountObj copy$default(FreshmanDiscountObj freshmanDiscountObj, String str, String str2, FreshmanDiscountGameObj freshmanDiscountGameObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{freshmanDiscountObj, str, str2, freshmanDiscountGameObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14683, new Class[]{FreshmanDiscountObj.class, String.class, String.class, FreshmanDiscountGameObj.class, Integer.TYPE, Object.class}, FreshmanDiscountObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FreshmanDiscountObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = freshmanDiscountObj.top_img;
        }
        if ((i10 & 2) != 0) {
            str2 = freshmanDiscountObj.session;
        }
        if ((i10 & 4) != 0) {
            freshmanDiscountGameObj = freshmanDiscountObj.game_info;
        }
        return freshmanDiscountObj.copy(str, str2, freshmanDiscountGameObj);
    }

    @e
    public final String component1() {
        return this.top_img;
    }

    @e
    public final String component2() {
        return this.session;
    }

    @e
    public final FreshmanDiscountGameObj component3() {
        return this.game_info;
    }

    @d
    public final FreshmanDiscountObj copy(@e String str, @e String str2, @e FreshmanDiscountGameObj freshmanDiscountGameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, freshmanDiscountGameObj}, this, changeQuickRedirect, false, 14682, new Class[]{String.class, String.class, FreshmanDiscountGameObj.class}, FreshmanDiscountObj.class);
        return patchProxyResultProxy.isSupported ? (FreshmanDiscountObj) patchProxyResultProxy.result : new FreshmanDiscountObj(str, str2, freshmanDiscountGameObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14686, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshmanDiscountObj)) {
            return false;
        }
        FreshmanDiscountObj freshmanDiscountObj = (FreshmanDiscountObj) obj;
        return f0.g(this.top_img, freshmanDiscountObj.top_img) && f0.g(this.session, freshmanDiscountObj.session) && f0.g(this.game_info, freshmanDiscountObj.game_info);
    }

    @e
    public final FreshmanDiscountGameObj getGame_info() {
        return this.game_info;
    }

    @e
    public final String getSession() {
        return this.session;
    }

    @e
    public final String getTop_img() {
        return this.top_img;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14685, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.top_img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.session;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FreshmanDiscountGameObj freshmanDiscountGameObj = this.game_info;
        return iHashCode2 + (freshmanDiscountGameObj != null ? freshmanDiscountGameObj.hashCode() : 0);
    }

    public final void setGame_info(@e FreshmanDiscountGameObj freshmanDiscountGameObj) {
        this.game_info = freshmanDiscountGameObj;
    }

    public final void setSession(@e String str) {
        this.session = str;
    }

    public final void setTop_img(@e String str) {
        this.top_img = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14684, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FreshmanDiscountObj(top_img=" + this.top_img + ", session=" + this.session + ", game_info=" + this.game_info + ')';
    }
}
