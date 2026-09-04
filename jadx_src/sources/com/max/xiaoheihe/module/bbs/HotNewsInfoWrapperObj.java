package com.max.xiaoheihe.module.bbs;

import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: compiled from: HotNewsFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class HotNewsInfoWrapperObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79936d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private TYPE f79937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private BBSLinkObj f79938c;

    public HotNewsInfoWrapperObj(@dl.d TYPE type, @dl.e BBSLinkObj bBSLinkObj) {
        kotlin.jvm.internal.f0.p(type, "type");
        this.f79937b = type;
        this.f79938c = bBSLinkObj;
    }

    public static /* synthetic */ HotNewsInfoWrapperObj d(HotNewsInfoWrapperObj hotNewsInfoWrapperObj, TYPE type, BBSLinkObj bBSLinkObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotNewsInfoWrapperObj, type, bBSLinkObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 26597, new Class[]{HotNewsInfoWrapperObj.class, TYPE.class, BBSLinkObj.class, Integer.TYPE, Object.class}, HotNewsInfoWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotNewsInfoWrapperObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            type = hotNewsInfoWrapperObj.f79937b;
        }
        if ((i10 & 2) != 0) {
            bBSLinkObj = hotNewsInfoWrapperObj.f79938c;
        }
        return hotNewsInfoWrapperObj.c(type, bBSLinkObj);
    }

    @dl.d
    public final TYPE a() {
        return this.f79937b;
    }

    @dl.e
    public final BBSLinkObj b() {
        return this.f79938c;
    }

    @dl.d
    public final HotNewsInfoWrapperObj c(@dl.d TYPE type, @dl.e BBSLinkObj bBSLinkObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, bBSLinkObj}, this, changeQuickRedirect, false, 26596, new Class[]{TYPE.class, BBSLinkObj.class}, HotNewsInfoWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotNewsInfoWrapperObj) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        return new HotNewsInfoWrapperObj(type, bBSLinkObj);
    }

    @dl.e
    public final BBSLinkObj e() {
        return this.f79938c;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26594, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.f0.g(HotNewsInfoWrapperObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.bbs.HotNewsInfoWrapperObj");
        HotNewsInfoWrapperObj hotNewsInfoWrapperObj = (HotNewsInfoWrapperObj) obj;
        return this.f79937b == hotNewsInfoWrapperObj.f79937b && kotlin.jvm.internal.f0.g(this.f79938c, hotNewsInfoWrapperObj.f79938c);
    }

    @dl.d
    public final TYPE f() {
        return this.f79937b;
    }

    public final void g(@dl.e BBSLinkObj bBSLinkObj) {
        this.f79938c = bBSLinkObj;
    }

    public final void h(@dl.d TYPE type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 26593, new Class[]{TYPE.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(type, "<set-?>");
        this.f79937b = type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26595, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.f79937b.hashCode() * 31;
        BBSLinkObj bBSLinkObj = this.f79938c;
        return iHashCode + (bBSLinkObj != null ? bBSLinkObj.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26598, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotNewsInfoWrapperObj(type=" + this.f79937b + ", data=" + this.f79938c + ')';
    }
}
