package com.max.xiaoheihe.module.account.manageraccount;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.module.account.accelworld.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ManagerAccountListVM.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class ManagerAccountListVM extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f79007m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private ArrayList<User> f79008k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private i0<Boolean> f79009l = new i0<>(Boolean.FALSE);

    @Override // com.max.xiaoheihe.base.mvvm.a
    public void a() {
    }

    @d
    public final ArrayList<User> p() {
        return this.f79008k;
    }

    public final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79008k.clear();
        this.f79008k.addAll(a.e());
    }

    @d
    public final i0<Boolean> s() {
        return this.f79009l;
    }

    public final void t(@d ArrayList<User> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 24998, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f79008k = arrayList;
    }

    public final void u(@d i0<Boolean> i0Var) {
        if (PatchProxy.proxy(new Object[]{i0Var}, this, changeQuickRedirect, false, 24999, new Class[]{i0.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(i0Var, "<set-?>");
        this.f79009l = i0Var;
    }
}
