package com.max.xiaoheihe.module.voice;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HeyboxMicViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class PCDeviceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f93947e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final List<String> f93948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final String f93949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final String f93950d;

    public PCDeviceInfo(@d List<String> ipList, @d String port, @d String token) {
        f0.p(ipList, "ipList");
        f0.p(port, "port");
        f0.p(token, "token");
        this.f93948b = ipList;
        this.f93949c = port;
        this.f93950d = token;
    }

    public static /* synthetic */ PCDeviceInfo e(PCDeviceInfo pCDeviceInfo, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pCDeviceInfo, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 46686, new Class[]{PCDeviceInfo.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, PCDeviceInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (PCDeviceInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = pCDeviceInfo.f93948b;
        }
        if ((i10 & 2) != 0) {
            str = pCDeviceInfo.f93949c;
        }
        if ((i10 & 4) != 0) {
            str2 = pCDeviceInfo.f93950d;
        }
        return pCDeviceInfo.d(list, str, str2);
    }

    @d
    public final List<String> a() {
        return this.f93948b;
    }

    @d
    public final String b() {
        return this.f93949c;
    }

    @d
    public final String c() {
        return this.f93950d;
    }

    @d
    public final PCDeviceInfo d(@d List<String> ipList, @d String port, @d String token) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ipList, port, token}, this, changeQuickRedirect, false, 46685, new Class[]{List.class, String.class, String.class}, PCDeviceInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (PCDeviceInfo) patchProxyResultProxy.result;
        }
        f0.p(ipList, "ipList");
        f0.p(port, "port");
        f0.p(token, "token");
        return new PCDeviceInfo(ipList, port, token);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46689, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PCDeviceInfo)) {
            return false;
        }
        PCDeviceInfo pCDeviceInfo = (PCDeviceInfo) obj;
        return f0.g(this.f93948b, pCDeviceInfo.f93948b) && f0.g(this.f93949c, pCDeviceInfo.f93949c) && f0.g(this.f93950d, pCDeviceInfo.f93950d);
    }

    @d
    public final List<String> f() {
        return this.f93948b;
    }

    @d
    public final String g() {
        return this.f93949c;
    }

    @d
    public final String h() {
        return this.f93950d;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46688, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (((this.f93948b.hashCode() * 31) + this.f93949c.hashCode()) * 31) + this.f93950d.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46687, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PCDeviceInfo(ipList=" + this.f93948b + ", port=" + this.f93949c + ", token=" + this.f93950d + ')';
    }
}
