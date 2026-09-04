package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: PostTabActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83170c = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final String f83171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final PostCheckReason f83172b;

    public w0(@dl.e String str, @dl.d PostCheckReason postCheckReason) {
        kotlin.jvm.internal.f0.p(postCheckReason, "postCheckReason");
        this.f83171a = str;
        this.f83172b = postCheckReason;
    }

    public /* synthetic */ w0(String str, PostCheckReason postCheckReason, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str, postCheckReason);
    }

    public static /* synthetic */ w0 d(w0 w0Var, String str, PostCheckReason postCheckReason, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{w0Var, str, postCheckReason, new Integer(i10), obj}, null, changeQuickRedirect, true, 30562, new Class[]{w0.class, String.class, PostCheckReason.class, Integer.TYPE, Object.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = w0Var.f83171a;
        }
        if ((i10 & 2) != 0) {
            postCheckReason = w0Var.f83172b;
        }
        return w0Var.c(str, postCheckReason);
    }

    @dl.e
    public final String a() {
        return this.f83171a;
    }

    @dl.d
    public final PostCheckReason b() {
        return this.f83172b;
    }

    @dl.d
    public final w0 c(@dl.e String str, @dl.d PostCheckReason postCheckReason) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, postCheckReason}, this, changeQuickRedirect, false, 30561, new Class[]{String.class, PostCheckReason.class}, w0.class);
        if (patchProxyResultProxy.isSupported) {
            return (w0) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(postCheckReason, "postCheckReason");
        return new w0(str, postCheckReason);
    }

    @dl.e
    public final String e() {
        return this.f83171a;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 30565, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.f0.g(this.f83171a, w0Var.f83171a) && this.f83172b == w0Var.f83172b;
    }

    @dl.d
    public final PostCheckReason f() {
        return this.f83172b;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30564, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f83171a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f83172b.hashCode();
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 30563, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostCheckResult(hintMsg=" + this.f83171a + ", postCheckReason=" + this.f83172b + ')';
    }
}
