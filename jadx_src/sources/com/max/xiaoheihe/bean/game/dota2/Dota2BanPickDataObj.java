package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2BanPickDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2BanPickDataObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Dota2HeroObj hero_info;

    @e
    private String order;

    public Dota2BanPickDataObj(@e String str, @e Dota2HeroObj dota2HeroObj) {
        this.order = str;
        this.hero_info = dota2HeroObj;
    }

    public static /* synthetic */ Dota2BanPickDataObj copy$default(Dota2BanPickDataObj dota2BanPickDataObj, String str, Dota2HeroObj dota2HeroObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2BanPickDataObj, str, dota2HeroObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15055, new Class[]{Dota2BanPickDataObj.class, String.class, Dota2HeroObj.class, Integer.TYPE, Object.class}, Dota2BanPickDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2BanPickDataObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dota2BanPickDataObj.order;
        }
        if ((i10 & 2) != 0) {
            dota2HeroObj = dota2BanPickDataObj.hero_info;
        }
        return dota2BanPickDataObj.copy(str, dota2HeroObj);
    }

    @e
    public final String component1() {
        return this.order;
    }

    @e
    public final Dota2HeroObj component2() {
        return this.hero_info;
    }

    @d
    public final Dota2BanPickDataObj copy(@e String str, @e Dota2HeroObj dota2HeroObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, dota2HeroObj}, this, changeQuickRedirect, false, 15054, new Class[]{String.class, Dota2HeroObj.class}, Dota2BanPickDataObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2BanPickDataObj) patchProxyResultProxy.result : new Dota2BanPickDataObj(str, dota2HeroObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15058, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2BanPickDataObj)) {
            return false;
        }
        Dota2BanPickDataObj dota2BanPickDataObj = (Dota2BanPickDataObj) obj;
        return f0.g(this.order, dota2BanPickDataObj.order) && f0.g(this.hero_info, dota2BanPickDataObj.hero_info);
    }

    @e
    public final Dota2HeroObj getHero_info() {
        return this.hero_info;
    }

    @e
    public final String getOrder() {
        return this.order;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15057, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.order;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Dota2HeroObj dota2HeroObj = this.hero_info;
        return iHashCode + (dota2HeroObj != null ? dota2HeroObj.hashCode() : 0);
    }

    public final void setHero_info(@e Dota2HeroObj dota2HeroObj) {
        this.hero_info = dota2HeroObj;
    }

    public final void setOrder(@e String str) {
        this.order = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15056, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2BanPickDataObj(order=" + this.order + ", hero_info=" + this.hero_info + ')';
    }
}
