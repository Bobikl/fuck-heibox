package com.max.xiaoheihe.bean.proxy;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ProxyItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class Host implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String host;

    @e
    private ArrayList<String> ips;

    public Host(@e String str, @e ArrayList<String> arrayList) {
        this.host = str;
        this.ips = arrayList;
    }

    public static /* synthetic */ Host copy$default(Host host, String str, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{host, str, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 15791, new Class[]{Host.class, String.class, ArrayList.class, Integer.TYPE, Object.class}, Host.class);
        if (patchProxyResultProxy.isSupported) {
            return (Host) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = host.host;
        }
        if ((i10 & 2) != 0) {
            arrayList = host.ips;
        }
        return host.copy(str, arrayList);
    }

    @e
    public final String component1() {
        return this.host;
    }

    @e
    public final ArrayList<String> component2() {
        return this.ips;
    }

    @d
    public final Host copy(@e String str, @e ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, arrayList}, this, changeQuickRedirect, false, 15790, new Class[]{String.class, ArrayList.class}, Host.class);
        return patchProxyResultProxy.isSupported ? (Host) patchProxyResultProxy.result : new Host(str, arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15794, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Host)) {
            return false;
        }
        Host host = (Host) obj;
        return f0.g(this.host, host.host) && f0.g(this.ips, host.ips);
    }

    @e
    public final String getHost() {
        return this.host;
    }

    @e
    public final ArrayList<String> getIps() {
        return this.ips;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15793, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.host;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<String> arrayList = this.ips;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setHost(@e String str) {
        this.host = str;
    }

    public final void setIps(@e ArrayList<String> arrayList) {
        this.ips = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15792, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Host(host=" + this.host + ", ips=" + this.ips + ')';
    }
}
