package com.max.xiaoheihe.bean.game.dota2;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ResultColorObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ResultColorObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String lose_color;

    @e
    private String win_color;

    public ResultColorObj(@e String str, @e String str2) {
        this.win_color = str;
        this.lose_color = str2;
    }

    public static /* synthetic */ ResultColorObj copy$default(ResultColorObj resultColorObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{resultColorObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15137, new Class[]{ResultColorObj.class, String.class, String.class, Integer.TYPE, Object.class}, ResultColorObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ResultColorObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = resultColorObj.win_color;
        }
        if ((i10 & 2) != 0) {
            str2 = resultColorObj.lose_color;
        }
        return resultColorObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.win_color;
    }

    @e
    public final String component2() {
        return this.lose_color;
    }

    @d
    public final ResultColorObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15136, new Class[]{String.class, String.class}, ResultColorObj.class);
        return patchProxyResultProxy.isSupported ? (ResultColorObj) patchProxyResultProxy.result : new ResultColorObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15140, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultColorObj)) {
            return false;
        }
        ResultColorObj resultColorObj = (ResultColorObj) obj;
        return f0.g(this.win_color, resultColorObj.win_color) && f0.g(this.lose_color, resultColorObj.lose_color);
    }

    @e
    public final String getLose_color() {
        return this.lose_color;
    }

    @e
    public final String getWin_color() {
        return this.win_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15139, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.win_color;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lose_color;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setLose_color(@e String str) {
        this.lose_color = str;
    }

    public final void setWin_color(@e String str) {
        this.win_color = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15138, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ResultColorObj(win_color=" + this.win_color + ", lose_color=" + this.lose_color + ')';
    }
}
