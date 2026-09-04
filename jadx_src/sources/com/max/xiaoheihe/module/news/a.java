package com.max.xiaoheihe.module.news;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.q0;
import androidx.lifecycle.w0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConceptFeedsViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f91270c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q0 f91271b;

    public a(@dl.d q0 savedStateHandle) {
        f0.p(savedStateHandle, "savedStateHandle");
        this.f91271b = savedStateHandle;
    }

    @dl.e
    public final String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42402, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : (String) this.f91271b.h("key_last_pull");
    }

    @dl.e
    public final String e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42404, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : (String) this.f91271b.h("key_use_history");
    }

    public final boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42406, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Boolean bool = (Boolean) this.f91271b.h("key_is_first_request");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final void g(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42407, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f91271b.q("key_is_first_request", Boolean.valueOf(z10));
    }

    public final void h(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42403, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f91271b.q("key_last_pull", str);
    }

    public final void i(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 42405, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q("ConceptFeedsViewModel, useHistory, value = " + str);
        this.f91271b.q("key_use_history", String.valueOf(str));
    }
}
