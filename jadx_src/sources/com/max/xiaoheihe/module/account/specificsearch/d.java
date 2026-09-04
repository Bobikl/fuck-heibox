package com.max.xiaoheihe.module.account.specificsearch;

import androidx.annotation.k0;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import com.max.hbcommon.base.BaseViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UserCenteredSearchViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class d extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f79264h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f79265i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f79266j = "UserCenteredSearchViewModel-dbg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final i0<String> f79267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final LiveData<String> f79268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final i0<String> f79269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final LiveData<String> f79270g;

    /* JADX INFO: compiled from: UserCenteredSearchViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public d() {
        i0<String> i0Var = new i0<>();
        this.f79267d = i0Var;
        this.f79268e = i0Var;
        i0<String> i0Var2 = new i0<>();
        this.f79269f = i0Var2;
        this.f79270g = i0Var2;
    }

    @dl.d
    public final LiveData<String> g() {
        return this.f79270g;
    }

    @dl.d
    public final LiveData<String> h() {
        return this.f79268e;
    }

    @k0
    public final void i(@dl.d String newSearchHint) {
        if (PatchProxy.proxy(new Object[]{newSearchHint}, this, changeQuickRedirect, false, 25353, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newSearchHint, "newSearchHint");
        this.f79269f.r(newSearchHint);
    }

    @k0
    public final void k(@dl.d String newSearchQuery) {
        if (PatchProxy.proxy(new Object[]{newSearchQuery}, this, changeQuickRedirect, false, 25352, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newSearchQuery, "newSearchQuery");
        if (newSearchQuery.length() == 0) {
            return;
        }
        this.f79267d.r(newSearchQuery);
    }
}
