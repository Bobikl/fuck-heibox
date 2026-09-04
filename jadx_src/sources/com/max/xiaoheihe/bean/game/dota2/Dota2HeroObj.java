package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2HeroObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2HeroObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String hero_id;

    @e
    private String hero_image;

    @e
    private String hero_name;

    @e
    private String hero_variant;

    @e
    private String level;

    @e
    private String protocol;

    public Dota2HeroObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.hero_id = str;
        this.hero_name = str2;
        this.hero_image = str3;
        this.hero_variant = str4;
        this.level = str5;
        this.protocol = str6;
    }

    public static /* synthetic */ Dota2HeroObj copy$default(Dota2HeroObj dota2HeroObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2HeroObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15077, new Class[]{Dota2HeroObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2HeroObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2HeroObj) patchProxyResultProxy.result;
        }
        return dota2HeroObj.copy((i10 & 1) != 0 ? dota2HeroObj.hero_id : str, (i10 & 2) != 0 ? dota2HeroObj.hero_name : str2, (i10 & 4) != 0 ? dota2HeroObj.hero_image : str3, (i10 & 8) != 0 ? dota2HeroObj.hero_variant : str4, (i10 & 16) != 0 ? dota2HeroObj.level : str5, (i10 & 32) != 0 ? dota2HeroObj.protocol : str6);
    }

    @e
    public final String component1() {
        return this.hero_id;
    }

    @e
    public final String component2() {
        return this.hero_name;
    }

    @e
    public final String component3() {
        return this.hero_image;
    }

    @e
    public final String component4() {
        return this.hero_variant;
    }

    @e
    public final String component5() {
        return this.level;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @d
    public final Dota2HeroObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15076, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Dota2HeroObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2HeroObj) patchProxyResultProxy.result : new Dota2HeroObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15080, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2HeroObj)) {
            return false;
        }
        Dota2HeroObj dota2HeroObj = (Dota2HeroObj) obj;
        return f0.g(this.hero_id, dota2HeroObj.hero_id) && f0.g(this.hero_name, dota2HeroObj.hero_name) && f0.g(this.hero_image, dota2HeroObj.hero_image) && f0.g(this.hero_variant, dota2HeroObj.hero_variant) && f0.g(this.level, dota2HeroObj.level) && f0.g(this.protocol, dota2HeroObj.protocol);
    }

    @e
    public final String getHero_id() {
        return this.hero_id;
    }

    @e
    public final String getHero_image() {
        return this.hero_image;
    }

    @e
    public final String getHero_name() {
        return this.hero_name;
    }

    @e
    public final String getHero_variant() {
        return this.hero_variant;
    }

    @e
    public final String getLevel() {
        return this.level;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15079, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.hero_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hero_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hero_image;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hero_variant;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.level;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setHero_id(@e String str) {
        this.hero_id = str;
    }

    public final void setHero_image(@e String str) {
        this.hero_image = str;
    }

    public final void setHero_name(@e String str) {
        this.hero_name = str;
    }

    public final void setHero_variant(@e String str) {
        this.hero_variant = str;
    }

    public final void setLevel(@e String str) {
        this.level = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15078, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2HeroObj(hero_id=" + this.hero_id + ", hero_name=" + this.hero_name + ", hero_image=" + this.hero_image + ", hero_variant=" + this.hero_variant + ", level=" + this.level + ", protocol=" + this.protocol + ')';
    }
}
