package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2TeamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Dota2TeamObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String logo;

    @e
    private String name;

    @e
    private String team_id;

    public Dota2TeamObj(@e String str, @e String str2, @e String str3) {
        this.logo = str;
        this.name = str2;
        this.team_id = str3;
    }

    public static /* synthetic */ Dota2TeamObj copy$default(Dota2TeamObj dota2TeamObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dota2TeamObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 15102, new Class[]{Dota2TeamObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, Dota2TeamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dota2TeamObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = dota2TeamObj.logo;
        }
        if ((i10 & 2) != 0) {
            str2 = dota2TeamObj.name;
        }
        if ((i10 & 4) != 0) {
            str3 = dota2TeamObj.team_id;
        }
        return dota2TeamObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.logo;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.team_id;
    }

    @d
    public final Dota2TeamObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 15101, new Class[]{String.class, String.class, String.class}, Dota2TeamObj.class);
        return patchProxyResultProxy.isSupported ? (Dota2TeamObj) patchProxyResultProxy.result : new Dota2TeamObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15105, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dota2TeamObj)) {
            return false;
        }
        Dota2TeamObj dota2TeamObj = (Dota2TeamObj) obj;
        return f0.g(this.logo, dota2TeamObj.logo) && f0.g(this.name, dota2TeamObj.name) && f0.g(this.team_id, dota2TeamObj.team_id);
    }

    @e
    public final String getLogo() {
        return this.logo;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getTeam_id() {
        return this.team_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15104, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.logo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.team_id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setLogo(@e String str) {
        this.logo = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setTeam_id(@e String str) {
        this.team_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15103, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Dota2TeamObj(logo=" + this.logo + ", name=" + this.name + ", team_id=" + this.team_id + ')';
    }
}
