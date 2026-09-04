package com.max.xiaoheihe.module.mall.cart.viewmodel;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.i0;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemWrapperObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: CartViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nCartViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CartViewModel.kt\ncom/max/xiaoheihe/module/mall/cart/viewmodel/CartViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n1549#2:65\n1620#2,3:66\n*S KotlinDebug\n*F\n+ 1 CartViewModel.kt\ncom/max/xiaoheihe/module/mall/cart/viewmodel/CartViewModel\n*L\n25#1:65\n25#1:66,3\n*E\n"})
@o(parameters = 0)
public final class a extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f90504h = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final i0<CartDetailObj> f90505d = new i0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final ArrayList<CartItemWrapperObj> f90506e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final i0<Boolean> f90507f = new i0<>(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final LinkedList<c> f90508g = new LinkedList<>();

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.viewmodel.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CartViewModel.kt */
    public static final class C0833a extends com.max.hbcommon.network.d<Result<CartDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0833a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41820, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            a.this.f().o(BaseViewModel.TYPE_STATE.ERROR);
        }

        public void onNext(@d Result<CartDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41821, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            a.this.f().o(BaseViewModel.TYPE_STATE.NORMAL);
            a.this.h().o(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41822, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CartDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: CartViewModel.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41823, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            a.this.g();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41824, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    public final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41818, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c((io.reactivex.disposables.b) i.a().a2().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new C0833a()));
    }

    @d
    public final i0<CartDetailObj> h() {
        return this.f90505d;
    }

    @d
    public final i0<Boolean> i() {
        return this.f90507f;
    }

    @d
    public final ArrayList<CartItemWrapperObj> k() {
        return this.f90506e;
    }

    @d
    public final LinkedList<String> m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41817, new Class[0], LinkedList.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinkedList) patchProxyResultProxy.result;
        }
        LinkedList<c> linkedList = this.f90508g;
        ArrayList arrayList = new ArrayList(t.Y(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).e());
        }
        return new LinkedList<>(arrayList);
    }

    @d
    public final LinkedList<c> n() {
        return this.f90508g;
    }

    public final void o(@d String cart_id) {
        if (PatchProxy.proxy(new Object[]{cart_id}, this, changeQuickRedirect, false, 41819, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cart_id, "cart_id");
        c((io.reactivex.disposables.b) i.a().c7(cart_id).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new b()));
    }
}
