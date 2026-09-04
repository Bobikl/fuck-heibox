package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KDAObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class KDAObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String assist;

    @e
    private String death;

    /* JADX INFO: renamed from: kd, reason: collision with root package name */
    @e
    private String f76978kd;

    @e
    private String kill;

    public KDAObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.f76978kd = str;
        this.kill = str2;
        this.death = str3;
        this.assist = str4;
    }

    public static /* synthetic */ KDAObj copy$default(KDAObj kDAObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kDAObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15256, new Class[]{KDAObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, KDAObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KDAObj) patchProxyResultProxy.result;
        }
        return kDAObj.copy((i10 & 1) != 0 ? kDAObj.f76978kd : str, (i10 & 2) != 0 ? kDAObj.kill : str2, (i10 & 4) != 0 ? kDAObj.death : str3, (i10 & 8) != 0 ? kDAObj.assist : str4);
    }

    @e
    public final String component1() {
        return this.f76978kd;
    }

    @e
    public final String component2() {
        return this.kill;
    }

    @e
    public final String component3() {
        return this.death;
    }

    @e
    public final String component4() {
        return this.assist;
    }

    @d
    public final KDAObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15255, new Class[]{String.class, String.class, String.class, String.class}, KDAObj.class);
        return patchProxyResultProxy.isSupported ? (KDAObj) patchProxyResultProxy.result : new KDAObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15259, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KDAObj)) {
            return false;
        }
        KDAObj kDAObj = (KDAObj) obj;
        return f0.g(this.f76978kd, kDAObj.f76978kd) && f0.g(this.kill, kDAObj.kill) && f0.g(this.death, kDAObj.death) && f0.g(this.assist, kDAObj.assist);
    }

    @e
    public final String getAssist() {
        return this.assist;
    }

    @e
    public final String getDeath() {
        return this.death;
    }

    @e
    public final String getKd() {
        return this.f76978kd;
    }

    @e
    public final String getKill() {
        return this.kill;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15258, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f76978kd;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.kill;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.death;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assist;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAssist(@e String str) {
        this.assist = str;
    }

    public final void setDeath(@e String str) {
        this.death = str;
    }

    public final void setKd(@e String str) {
        this.f76978kd = str;
    }

    public final void setKill(@e String str) {
        this.kill = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15257, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "KDAObj(kd=" + this.f76978kd + ", kill=" + this.kill + ", death=" + this.death + ", assist=" + this.assist + ')';
    }
}
