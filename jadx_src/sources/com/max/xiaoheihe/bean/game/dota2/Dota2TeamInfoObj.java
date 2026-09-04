package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2TeamInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2TeamInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String icon;

    @e
    private String name;

    @e
    private String tag;

    @e
    private String team_id;

    @e
    private String verified_name;

    public Dota2TeamInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.name = str;
        this.tag = str2;
        this.team_id = str3;
        this.verified_name = str4;
        this.icon = str5;
    }

    public static /* synthetic */ Dota2TeamInfoObj copy$default(Dota2TeamInfoObj dota2TeamInfoObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2TeamInfoObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 15097, new Class[]{Dota2TeamInfoObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2TeamInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2TeamInfoObj) patchProxyResultProxy.result;
        }
        return dota2TeamInfoObj.copy((i10 & 1) != 0 ? dota2TeamInfoObj.name : str, (i10 & 2) != 0 ? dota2TeamInfoObj.tag : str2, (i10 & 4) != 0 ? dota2TeamInfoObj.team_id : str3, (i10 & 8) != 0 ? dota2TeamInfoObj.verified_name : str4, (i10 & 16) != 0 ? dota2TeamInfoObj.icon : str5);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.tag;
    }

    @e
    public final String component3() {
        return this.team_id;
    }

    @e
    public final String component4() {
        return this.verified_name;
    }

    @e
    public final String component5() {
        return this.icon;
    }

    @d
    public final Dota2TeamInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 15096, new Class[]{String.class, String.class, String.class, String.class, String.class}, Dota2TeamInfoObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2TeamInfoObj) patchProxyResultProxy.result : new Dota2TeamInfoObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15100, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2TeamInfoObj)) {
            return false;
        }
        Dota2TeamInfoObj dota2TeamInfoObj = (Dota2TeamInfoObj) obj;
        return f0.g(this.name, dota2TeamInfoObj.name) && f0.g(this.tag, dota2TeamInfoObj.tag) && f0.g(this.team_id, dota2TeamInfoObj.team_id) && f0.g(this.verified_name, dota2TeamInfoObj.verified_name) && f0.g(this.icon, dota2TeamInfoObj.icon);
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
    public final String getTag() {
        return this.tag;
    }

    @e
    public final String getTeam_id() {
        return this.team_id;
    }

    @e
    public final String getVerified_name() {
        return this.verified_name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15099, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.team_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.verified_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.icon;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    public final void setTeam_id(@e String str) {
        this.team_id = str;
    }

    public final void setVerified_name(@e String str) {
        this.verified_name = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15098, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2TeamInfoObj(name=" + this.name + ", tag=" + this.tag + ", team_id=" + this.team_id + ", verified_name=" + this.verified_name + ", icon=" + this.icon + ')';
    }
}
