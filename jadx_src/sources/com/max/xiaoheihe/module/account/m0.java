package com.max.xiaoheihe.module.account;

import android.util.Log;
import androidx.lifecycle.LiveData;
import com.max.hbcommon.base.BaseViewModel;
import com.max.xiaoheihe.bean.account.PushStateGroupWrapperObjV4;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.b2;

/* JADX INFO: compiled from: SetPushStateViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class m0 extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f78984h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<PushStateGroupWrapperObjV4> f78985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final LiveData<PushStateGroupWrapperObjV4> f78986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.i0<String> f78987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final LiveData<String> f78988g;

    public m0() {
        androidx.lifecycle.i0<PushStateGroupWrapperObjV4> i0Var = new androidx.lifecycle.i0<>();
        this.f78985d = i0Var;
        this.f78986e = i0Var;
        androidx.lifecycle.i0<String> i0Var2 = new androidx.lifecycle.i0<>();
        this.f78987f = i0Var2;
        this.f78988g = i0Var2;
    }

    @dl.d
    public final LiveData<PushStateGroupWrapperObjV4> g() {
        return this.f78986e;
    }

    @dl.d
    public final LiveData<String> h() {
        return this.f78988g;
    }

    public final void i(@dl.e PushStateGroupWrapperObjV4 pushStateGroupWrapperObjV4) {
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{pushStateGroupWrapperObjV4}, this, changeQuickRedirect, false, 24074, new Class[]{PushStateGroupWrapperObjV4.class}, Void.TYPE).isSupported) {
            return;
        }
        if (pushStateGroupWrapperObjV4 != null) {
            this.f78985d.o(pushStateGroupWrapperObjV4);
            b2Var = b2.f124493a;
        } else {
            b2Var = null;
        }
        if (b2Var == null) {
            com.max.heybox.hblog.g.f74531b.v("[SetPushStateViewModel][updatePushSettingState] invalid param");
        }
    }

    public final void k(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24075, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Log.d("DBG-SetPushStateViewModel", "[updatePageTitleText] titleText: " + str);
        b2 b2Var = null;
        if (!(true ^ (str == null || str.length() == 0))) {
            str = null;
        }
        if (str != null) {
            this.f78987f.o(str);
            b2Var = b2.f124493a;
        }
        if (b2Var == null) {
            com.max.heybox.hblog.g.f74531b.v("[SetPushStateViewModel][updateTitleText] invalid param");
        }
    }
}
