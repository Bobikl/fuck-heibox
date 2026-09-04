package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WhiteHostnamesResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class WhiteHostnamesResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<String> white_hostnames;

    @e
    private String white_hostnames_version;

    public WhiteHostnamesResult(@e String str, @e List<String> list) {
        this.white_hostnames_version = str;
        this.white_hostnames = list;
    }

    public static /* synthetic */ WhiteHostnamesResult copy$default(WhiteHostnamesResult whiteHostnamesResult, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{whiteHostnamesResult, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.cO, new Class[]{WhiteHostnamesResult.class, String.class, List.class, Integer.TYPE, Object.class}, WhiteHostnamesResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (WhiteHostnamesResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = whiteHostnamesResult.white_hostnames_version;
        }
        if ((i10 & 2) != 0) {
            list = whiteHostnamesResult.white_hostnames;
        }
        return whiteHostnamesResult.copy(str, list);
    }

    @e
    public final String component1() {
        return this.white_hostnames_version;
    }

    @e
    public final List<String> component2() {
        return this.white_hostnames;
    }

    @d
    public final WhiteHostnamesResult copy(@e String str, @e List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, c.m.bO, new Class[]{String.class, List.class}, WhiteHostnamesResult.class);
        return patchProxyResultProxy.isSupported ? (WhiteHostnamesResult) patchProxyResultProxy.result : new WhiteHostnamesResult(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.fO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhiteHostnamesResult)) {
            return false;
        }
        WhiteHostnamesResult whiteHostnamesResult = (WhiteHostnamesResult) obj;
        return f0.g(this.white_hostnames_version, whiteHostnamesResult.white_hostnames_version) && f0.g(this.white_hostnames, whiteHostnamesResult.white_hostnames);
    }

    @e
    public final List<String> getWhite_hostnames() {
        return this.white_hostnames;
    }

    @e
    public final String getWhite_hostnames_version() {
        return this.white_hostnames_version;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.eO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.white_hostnames_version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.white_hostnames;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setWhite_hostnames(@e List<String> list) {
        this.white_hostnames = list;
    }

    public final void setWhite_hostnames_version(@e String str) {
        this.white_hostnames_version = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.dO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WhiteHostnamesResult(white_hostnames_version=" + this.white_hostnames_version + ", white_hostnames=" + this.white_hostnames + ')';
    }
}
