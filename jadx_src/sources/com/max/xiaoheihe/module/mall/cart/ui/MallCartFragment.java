package com.max.xiaoheihe.module.mall.cart.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.bean.mall.cart.CartGroupObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemWrapperObj;
import com.max.xiaoheihe.module.game.GameStoreActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.max.xiaoheihe.module.mall.cart.CartItemCheckState;
import com.max.xiaoheihe.module.mall.cart.CartListItemType;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.re;
import df.t9;
import df.vp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.b0;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import yh.l;

/* JADX INFO: compiled from: MallCartFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nMallCartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallCartFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,949:1\n766#2:950\n857#2,2:951\n*S KotlinDebug\n*F\n+ 1 MallCartFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartFragment\n*L\n798#1:950\n798#1:951,2\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.f131172h2)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MallCartFragment extends com.max.hbcommon.base.i implements com.max.xiaoheihe.module.mall.cart.ui.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f90276m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f90277n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f90278b = "game_purchase";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f90279c = b0.c(new yh.a<com.max.xiaoheihe.module.mall.cart.viewmodel.a>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$viewModel$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final com.max.xiaoheihe.module.mall.cart.viewmodel.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41553, new Class[0], com.max.xiaoheihe.module.mall.cart.viewmodel.a.class);
            return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.a) patchProxyResultProxy.result : (com.max.xiaoheihe.module.mall.cart.viewmodel.a) this.f90343b.O3(com.max.xiaoheihe.module.mall.cart.viewmodel.a.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.mall.cart.viewmodel.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.max.xiaoheihe.module.mall.cart.viewmodel.a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41554, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private LoadingDialog f90280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t9 f90281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<CartItemWrapperObj> f90282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private re f90283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout f90284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.activity.result.g<Intent> f90285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f90286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f90287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f90288l;

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final MallCartFragment a(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 41502, new Class[]{Bundle.class}, MallCartFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MallCartFragment) patchProxyResultProxy.result;
            }
            MallCartFragment mallCartFragment = new MallCartFragment();
            if (bundle != null) {
                mallCartFragment.setArguments(bundle);
            }
            return mallCartFragment;
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90289a;

        static {
            int[] iArr = new int[CartItemCheckState.valuesCustom().length];
            try {
                iArr[CartItemCheckState.DISABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartItemCheckState.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CartItemCheckState.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f90289a = iArr;
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class c extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41503, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41504, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    @t0({"SMAP\nMallCartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallCartFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartFragment$doRegisiterAction$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,949:1\n1855#2,2:950\n*S KotlinDebug\n*F\n+ 1 MallCartFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartFragment$doRegisiterAction$1\n*L\n623#1:950,2\n*E\n"})
    public static final class d extends com.max.hbcommon.network.d<Result<MallPurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallRegisterOrderObj f90292c;

        /* JADX INFO: compiled from: MallCartFragment.kt */
        public static final class a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseResultObj f90293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCartFragment f90294b;

            a(MallPurchaseResultObj mallPurchaseResultObj, MallCartFragment mallCartFragment) {
                this.f90293a = mallPurchaseResultObj;
                this.f90294b = mallCartFragment;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41510, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                String order_id = this.f90293a.getOrder_id();
                if (order_id == null || order_id.length() == 0) {
                    return;
                }
                if (f0.g("cart", this.f90293a.getOrder_src())) {
                    Activity mContext = ((com.max.hbcommon.base.d) this.f90294b).mContext;
                    f0.o(mContext, "mContext");
                    String order_id2 = this.f90293a.getOrder_id();
                    f0.o(order_id2, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.D(mContext, order_id2).A();
                    return;
                }
                Activity mContext2 = ((com.max.hbcommon.base.d) this.f90294b).mContext;
                f0.o(mContext2, "mContext");
                String order_id3 = this.f90293a.getOrder_id();
                f0.o(order_id3, "purchaseResultObj.order_id");
                com.max.xiaoheihe.base.router.b.R(mContext2, order_id3, true).A();
            }
        }

        d(MallRegisterOrderObj mallRegisterOrderObj) {
            this.f90292c = mallRegisterOrderObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41507, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (MallCartFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = MallCartFragment.this.f90280d;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallPurchaseResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41508, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (MallCartFragment.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialog = MallCartFragment.this.f90280d;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                if (result.getResult() != null) {
                    MallPurchaseResultObj result2 = result.getResult();
                    f0.m(result2);
                    MallPurchaseResultObj mallPurchaseResultObj = result2;
                    if (f0.g("1", mallPurchaseResultObj.getNot_finish_order())) {
                        MallCartFragment mallCartFragment = MallCartFragment.this;
                        MallCartFragment.r4(mallCartFragment, new a(mallPurchaseResultObj, mallCartFragment));
                        return;
                    }
                    List<MallOrderParamObj> params = this.f90292c.getParams();
                    f0.o(params, "purchaseParam.params");
                    MallCartFragment mallCartFragment2 = MallCartFragment.this;
                    for (MallOrderParamObj mallOrderParamObj : params) {
                        MallCartUtils.w(MallCartUtils.f90196a, OrderEvent.REGISTER, null, String.valueOf(mallOrderParamObj.getSku_id()), String.valueOf(mallOrderParamObj.getSku_id()), mallPurchaseResultObj.getOrder_id(), mallCartFragment2.f90287k, null, 64, null);
                    }
                    Activity mContext = ((com.max.hbcommon.base.d) MallCartFragment.this).mContext;
                    f0.o(mContext, "mContext");
                    String order_id = mallPurchaseResultObj.getOrder_id();
                    f0.o(order_id, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.D(mContext, order_id).A();
                    ((com.max.hbcommon.base.d) MallCartFragment.this).mContext.finish();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41509, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41511, new Class[]{View.class}, Void.TYPE).isSupported && MallCartFragment.b4(MallCartFragment.this).n().size() > 0) {
                MallCartFragment.R3(MallCartFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41512, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartFragment.p4(MallCartFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class g implements BottomButtonLeftItemView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView.a
        public void a(boolean z10) {
            MallProductObj product;
            if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41513, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                for (CartItemWrapperObj cartItemWrapperObj : MallCartFragment.b4(MallCartFragment.this).k()) {
                    if (cartItemWrapperObj.getItem_type() == CartListItemType.PRODUCT) {
                        CartItemObj item = cartItemWrapperObj.getItem();
                        f0.m(item);
                        if (!f0.g(item.getState(), "-1")) {
                            LinkedList<String> linkedListM = MallCartFragment.b4(MallCartFragment.this).m();
                            CartItemObj item2 = cartItemWrapperObj.getItem();
                            f0.m(item2);
                            if (!linkedListM.contains(item2.getCart_id())) {
                                LinkedList<com.max.xiaoheihe.module.mall.cart.viewmodel.c> linkedListN = MallCartFragment.b4(MallCartFragment.this).n();
                                CartItemObj item3 = cartItemWrapperObj.getItem();
                                f0.m(item3);
                                String cart_id = item3.getCart_id();
                                CartItemObj item4 = cartItemWrapperObj.getItem();
                                linkedListN.add(new com.max.xiaoheihe.module.mall.cart.viewmodel.c(cart_id, (item4 == null || (product = item4.getProduct()) == null) ? null : product.getSku_id()));
                            }
                        }
                    }
                }
            } else {
                MallCartFragment.b4(MallCartFragment.this).n().clear();
                MallCartFragment.d4(MallCartFragment.this);
            }
            MallCartFragment.e4(MallCartFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41514, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartFragment.p4(MallCartFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class i implements j0<CartDetailObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(CartDetailObj cartDetailObj) {
            if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 41516, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(cartDetailObj);
        }

        public final void b(CartDetailObj cartDetailObj) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 41515, new Class[]{CartDetailObj.class}, Void.TYPE).isSupported) {
                return;
            }
            List<CartGroupObj> carts = cartDetailObj.getCarts();
            MallCartFragment.b4(MallCartFragment.this).k().clear();
            LinearLayout linearLayout = null;
            if (carts != null) {
                int size = carts.size();
                for (int i10 = 0; i10 < size; i10++) {
                    carts.get(i10).setIndex_custom(String.valueOf(i10));
                    MallCartFragment.b4(MallCartFragment.this).k().add(new CartItemWrapperObj(carts.get(i10), null, Boolean.FALSE, CartListItemType.GROUP));
                    for (CartItemObj cartItemObj : carts.get(i10).getItems()) {
                        if (TextUtils.isEmpty(MallCartFragment.this.f90287k)) {
                            MallCartFragment.this.f90287k = cartItemObj.getH_src();
                        }
                        MallCartFragment.b4(MallCartFragment.this).k().add(new CartItemWrapperObj(carts.get(i10), cartItemObj, Boolean.FALSE, CartListItemType.PRODUCT));
                    }
                }
            }
            ArrayList<CartItemWrapperObj> arrayListK = MallCartFragment.b4(MallCartFragment.this).k();
            if (arrayListK == null || arrayListK.isEmpty()) {
                MallCartFragment.q4(MallCartFragment.this);
            } else {
                t9 t9Var = MallCartFragment.this.f90281e;
                if (t9Var == null) {
                    f0.S("binding");
                    t9Var = null;
                }
                t9Var.f115898i.b().setVisibility(8);
                MallCartFragment.e4(MallCartFragment.this);
            }
            MallCartFragment.i4(MallCartFragment.this);
            String message = cartDetailObj.getMessage();
            if (message == null || message.length() == 0) {
                t9 t9Var2 = MallCartFragment.this.f90281e;
                if (t9Var2 == null) {
                    f0.S("binding");
                    t9Var2 = null;
                }
                t9Var2.f115901l.setVisibility(8);
            } else {
                t9 t9Var3 = MallCartFragment.this.f90281e;
                if (t9Var3 == null) {
                    f0.S("binding");
                    t9Var3 = null;
                }
                t9Var3.f115901l.setVisibility(0);
                t9 t9Var4 = MallCartFragment.this.f90281e;
                if (t9Var4 == null) {
                    f0.S("binding");
                    t9Var4 = null;
                }
                t9Var4.f115894e.setText(cartDetailObj.getMessage());
            }
            String cart_count = cartDetailObj.getCart_count();
            if (cart_count != null && cart_count.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                mallCartUtils.D(com.max.hbutils.utils.n.q(cartDetailObj.getCart_count()));
                ((com.max.hbcommon.base.d) MallCartFragment.this).mTitleBar.setTitle("购物车(" + mallCartUtils.j() + ')');
            }
            if (MallCartFragment.c4(MallCartFragment.this)) {
                LinearLayout linearLayout2 = MallCartFragment.this.f90284h;
                if (linearLayout2 == null) {
                    f0.S("mAllClearView");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.setVisibility(0);
                return;
            }
            LinearLayout linearLayout3 = MallCartFragment.this.f90284h;
            if (linearLayout3 == null) {
                f0.S("mAllClearView");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.setVisibility(4);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class j implements j0<BaseViewModel.TYPE_STATE> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(BaseViewModel.TYPE_STATE type_state) {
            if (PatchProxy.proxy(new Object[]{type_state}, this, changeQuickRedirect, false, 41518, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(type_state);
        }

        public final void b(BaseViewModel.TYPE_STATE type_state) {
            if (PatchProxy.proxy(new Object[]{type_state}, this, changeQuickRedirect, false, 41517, new Class[]{BaseViewModel.TYPE_STATE.class}, Void.TYPE).isSupported) {
                return;
            }
            t9 t9Var = MallCartFragment.this.f90281e;
            t9 t9Var2 = null;
            if (t9Var == null) {
                f0.S("binding");
                t9Var = null;
            }
            t9Var.f115893d.A(0);
            t9 t9Var3 = MallCartFragment.this.f90281e;
            if (t9Var3 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var3;
            }
            t9Var2.f115893d.p(0);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class k implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MallCartFragment.kt */
        public static final class a implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCartFragment f90319b;

            a(MallCartFragment mallCartFragment) {
                this.f90319b = mallCartFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41521, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                t9 t9Var = this.f90319b.f90281e;
                t9 t9Var2 = null;
                if (t9Var == null) {
                    f0.S("binding");
                    t9Var = null;
                }
                t9Var.f115896g.setVisibility(0);
                t9 t9Var3 = this.f90319b.f90281e;
                if (t9Var3 == null) {
                    f0.S("binding");
                } else {
                    t9Var2 = t9Var3;
                }
                t9Var2.f115899j.setVisibility(8);
            }
        }

        k() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 41520, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean editMode) {
            if (PatchProxy.proxy(new Object[]{editMode}, this, changeQuickRedirect, false, 41519, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartFragment.b4(MallCartFragment.this).n().clear();
            f0.o(editMode, "editMode");
            t9 t9Var = null;
            if (editMode.booleanValue()) {
                t9 t9Var2 = MallCartFragment.this.f90281e;
                if (t9Var2 == null) {
                    f0.S("binding");
                    t9Var2 = null;
                }
                t9Var2.f115896g.setVisibility(8);
                t9 t9Var3 = MallCartFragment.this.f90281e;
                if (t9Var3 == null) {
                    f0.S("binding");
                } else {
                    t9Var = t9Var3;
                }
                t9Var.f115899j.setVisibility(0);
                ((com.max.hbcommon.base.d) MallCartFragment.this).mTitleBar.setAction("完成");
                MallCartFragment.g4(MallCartFragment.this);
            } else {
                ((com.max.hbcommon.base.d) MallCartFragment.this).mTitleBar.setAction("管理");
                MallCartFragment.d4(MallCartFragment.this);
                t9 t9Var4 = MallCartFragment.this.f90281e;
                if (t9Var4 == null) {
                    f0.S("binding");
                } else {
                    t9Var = t9Var4;
                }
                t9Var.f115897h.postDelayed(new a(MallCartFragment.this), 300L);
            }
            MallCartFragment.e4(MallCartFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class l extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41535, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            MallCartFragment.k4(MallCartFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41536, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            i0<Boolean> i0VarI = MallCartFragment.b4(MallCartFragment.this).i();
            Boolean boolF = MallCartFragment.b4(MallCartFragment.this).i().f();
            f0.m(boolF);
            i0VarI.r(Boolean.valueOf(true ^ boolF.booleanValue()));
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class n implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41537, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            MallCartFragment.b4(MallCartFragment.this).g();
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class o extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // pg.g, pg.c
        public void m(@dl.e ng.g gVar, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {gVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41538, new Class[]{ng.g.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzheader", "offset ==" + i10);
            MallCartFragment.this.f90286j = (float) i10;
            t9 t9Var = MallCartFragment.this.f90281e;
            if (t9Var == null) {
                f0.S("binding");
                t9Var = null;
            }
            t9Var.f115900k.b().setTranslationY(MallCartFragment.this.f90286j);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CartItemCheckState> f90325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallCartFragment f90326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CartGroupObj f90327d;

        p(Ref.ObjectRef<CartItemCheckState> objectRef, MallCartFragment mallCartFragment, CartGroupObj cartGroupObj) {
            this.f90325b = objectRef;
            this.f90326c = mallCartFragment;
            this.f90327d = cartGroupObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CartItemCheckState cartItemCheckState;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41541, new Class[]{View.class}, Void.TYPE).isSupported || (cartItemCheckState = this.f90325b.f124891b) == CartItemCheckState.DISABLE) {
                return;
            }
            if (cartItemCheckState == CartItemCheckState.CHECKED) {
                MallCartFragment.l4(this.f90326c, this.f90327d, false);
                MallCartFragment.g4(this.f90326c);
                MallCartFragment.e4(this.f90326c);
            } else {
                MallCartFragment.l4(this.f90326c, this.f90327d, true);
                MallCartFragment.g4(this.f90326c);
                MallCartFragment.e4(this.f90326c);
            }
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class q implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41543, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41542, new Class[]{ActivityResult.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartFragment.b4(MallCartFragment.this).g();
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class r extends com.max.hbcommon.base.adapter.s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f90329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallCartFragment f90330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f90332e;

        /* JADX INFO: compiled from: MallCartFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f90333b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f90334c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ MallCartFragment f90335d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.component.i f90336e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f90337f;

            a(String str, String str2, MallCartFragment mallCartFragment, com.max.hbcommon.component.i iVar, String str3) {
                this.f90333b = str;
                this.f90334c = str2;
                this.f90335d = mallCartFragment;
                this.f90336e = iVar;
                this.f90337f = str3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41548, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String str = this.f90333b;
                if (f0.g(str, this.f90334c)) {
                    MallCartFragment.Q3(this.f90335d);
                    this.f90336e.dismiss();
                } else if (f0.g(str, this.f90337f)) {
                    MallCartFragment.f4(this.f90335d);
                    this.f90336e.dismiss();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(ArrayList<String> arrayList, String str, MallCartFragment mallCartFragment, com.max.hbcommon.component.i iVar, String str2, Activity activity) {
            super(activity, arrayList, R.layout.item_collection_folder);
            this.f90329b = str;
            this.f90330c = mallCartFragment;
            this.f90331d = iVar;
            this.f90332e = str2;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d String data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 41546, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            View viewI = viewHolder.i(R.id.divider);
            if (viewI != null) {
                viewI.setVisibility(8);
            }
            viewHolder.itemView.setBackgroundResource(R.color.background_layer_2_color);
            TextView textView = (TextView) viewHolder.i(R.id.tv_folder_name);
            textView.setText(data);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red));
            textView.setOnClickListener(new a(data, this.f90329b, this.f90330c, this.f90331d, this.f90332e));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 41547, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90338b;

        s(com.max.hbcommon.component.i iVar) {
            this.f90338b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41549, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90338b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41550, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            androidx.activity.result.g gVar = MallCartFragment.this.f90285i;
            if (gVar == null) {
                f0.S("storeLauncher");
                gVar = null;
            }
            gVar.b(GameStoreActivity.R1(((com.max.hbcommon.base.d) MallCartFragment.this).mContext));
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class u implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f90341b;

        u(l0.g gVar) {
            this.f90341b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41551, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            l0.g gVar = this.f90341b;
            if (gVar != null) {
                gVar.a();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartFragment.kt */
    public static final class v implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v f90342b = new v();
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41552, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private final com.max.xiaoheihe.module.mall.cart.viewmodel.a A4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41445, new Class[0], com.max.xiaoheihe.module.mall.cart.viewmodel.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.a) patchProxyResultProxy.result : (com.max.xiaoheihe.module.mall.cart.viewmodel.a) this.f90279c.getValue();
    }

    private final boolean B4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41461, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (CartItemWrapperObj cartItemWrapperObj : A4().k()) {
            if (cartItemWrapperObj.getItem_type() == CartListItemType.PRODUCT) {
                CartItemObj item = cartItemWrapperObj.getItem();
                f0.m(item);
                if (f0.g(item.getState(), "-1")) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void C4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41475, new Class[0], Void.TYPE).isSupported && this.f90288l) {
            try {
                t9 t9Var = this.f90281e;
                if (t9Var == null) {
                    f0.S("binding");
                    t9Var = null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(t9Var.f115897h, "translationY", 0.0f, ViewUtils.f(this.mContext, 58.5f) + 0.0f);
                objectAnimatorOfFloat.start();
                addValueAnimator(objectAnimatorOfFloat);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f90288l = false;
        }
    }

    private final void D4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41457, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        re reVarC = re.c(this.mInflater);
        f0.o(reVarC, "inflate(mInflater)");
        this.f90283g = reVarC;
        t9 t9Var = null;
        if (reVarC == null) {
            f0.S("mPriceBinding");
            reVarC = null;
        }
        reVarC.f115206c.setPrice(r1.I("0"));
        t9 t9Var2 = this.f90281e;
        if (t9Var2 == null) {
            f0.S("binding");
            t9Var2 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = t9Var2.f115896g;
        re reVar = this.f90283g;
        if (reVar == null) {
            f0.S("mPriceBinding");
            reVar = null;
        }
        ConstraintLayout constraintLayoutB = reVar.b();
        f0.o(constraintLayoutB, "mPriceBinding.root");
        bottomButtonLeftItemView.b(constraintLayoutB);
        t9 t9Var3 = this.f90281e;
        if (t9Var3 == null) {
            f0.S("binding");
            t9Var3 = null;
        }
        t9Var3.f115896g.setRightText("去结算");
        t9 t9Var4 = this.f90281e;
        if (t9Var4 == null) {
            f0.S("binding");
            t9Var4 = null;
        }
        t9Var4.f115896g.setRightButtonFixWidth();
        re reVar2 = this.f90283g;
        if (reVar2 == null) {
            f0.S("mPriceBinding");
            reVar2 = null;
        }
        ViewGroup.LayoutParams layoutParams = reVar2.b().getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        t9 t9Var5 = this.f90281e;
        if (t9Var5 == null) {
            f0.S("binding");
            t9Var5 = null;
        }
        LinearLayout leftView = t9Var5.f115896g.getLeftView();
        ViewGroup.LayoutParams layoutParams3 = leftView != null ? leftView.getLayoutParams() : null;
        f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = 0;
        layoutParams4.weight = 1.0f;
        t9 t9Var6 = this.f90281e;
        if (t9Var6 == null) {
            f0.S("binding");
        } else {
            t9Var = t9Var6;
        }
        t9Var.f115896g.setRightClickListener(new e());
        E4();
    }

    private final void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41458, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.f90284h = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(this.mContext);
        imageView.setImageResource(R.drawable.mall_lightning_line_24x24);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 16.0f), ViewUtils.f(this.mContext, 16.0f));
        layoutParams.rightMargin = ViewUtils.f(this.mContext, 6.0f);
        LinearLayout linearLayout2 = this.f90284h;
        t9 t9Var = null;
        if (linearLayout2 == null) {
            f0.S("mAllClearView");
            linearLayout2 = null;
        }
        linearLayout2.addView(imageView, layoutParams);
        TextView textView = new TextView(this.mContext);
        textView.setText("一键清理");
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        LinearLayout linearLayout3 = this.f90284h;
        if (linearLayout3 == null) {
            f0.S("mAllClearView");
            linearLayout3 = null;
        }
        linearLayout3.addView(textView);
        LinearLayout linearLayout4 = this.f90284h;
        if (linearLayout4 == null) {
            f0.S("mAllClearView");
            linearLayout4 = null;
        }
        linearLayout4.setGravity(16);
        t9 t9Var2 = this.f90281e;
        if (t9Var2 == null) {
            f0.S("binding");
            t9Var2 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = t9Var2.f115899j;
        LinearLayout linearLayout5 = this.f90284h;
        if (linearLayout5 == null) {
            f0.S("mAllClearView");
            linearLayout5 = null;
        }
        bottomButtonLeftItemView.b(linearLayout5);
        t9 t9Var3 = this.f90281e;
        if (t9Var3 == null) {
            f0.S("binding");
            t9Var3 = null;
        }
        t9Var3.f115899j.setRightButtonFixWidth();
        LinearLayout linearLayout6 = this.f90284h;
        if (linearLayout6 == null) {
            f0.S("mAllClearView");
            linearLayout6 = null;
        }
        linearLayout6.setOnClickListener(new f());
        LinearLayout linearLayout7 = this.f90284h;
        if (linearLayout7 == null) {
            f0.S("mAllClearView");
            linearLayout7 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout7.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.width = -2;
        layoutParams3.height = -1;
        layoutParams3.rightMargin = ViewUtils.f(this.mContext, 14.0f);
        t9 t9Var4 = this.f90281e;
        if (t9Var4 == null) {
            f0.S("binding");
            t9Var4 = null;
        }
        LinearLayout leftView = t9Var4.f115899j.getLeftView();
        ViewGroup.LayoutParams layoutParams4 = leftView != null ? leftView.getLayoutParams() : null;
        f0.n(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.width = 0;
        layoutParams5.weight = 1.0f;
        t9 t9Var5 = this.f90281e;
        if (t9Var5 == null) {
            f0.S("binding");
            t9Var5 = null;
        }
        LinearLayout leftView2 = t9Var5.f115899j.getLeftView();
        if (leftView2 != null) {
            leftView2.setGravity(5);
        }
        t9 t9Var6 = this.f90281e;
        if (t9Var6 == null) {
            f0.S("binding");
            t9Var6 = null;
        }
        t9Var6.f115899j.setCheckboxListener(new g());
        t9 t9Var7 = this.f90281e;
        if (t9Var7 == null) {
            f0.S("binding");
        } else {
            t9Var = t9Var7;
        }
        t9Var.f115899j.setRightClickListener(new h());
    }

    private final void F4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41449, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A4().h().k(getViewLifecycleOwner(), new i());
        A4().f().k(getViewLifecycleOwner(), new j());
        A4().i().k(getViewLifecycleOwner(), new k());
    }

    private final void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41452, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        t9Var.f115892c.setLayoutManager(new LinearLayoutManager(this.mContext));
        t9 t9Var3 = this.f90281e;
        if (t9Var3 == null) {
            f0.S("binding");
            t9Var3 = null;
        }
        t9Var3.f115892c.setItemAnimator(null);
        final Activity activity = this.mContext;
        final ArrayList<CartItemWrapperObj> arrayListK = A4().k();
        this.f90282f = new com.max.hbcommon.base.adapter.u<CartItemWrapperObj>(activity, arrayListK) { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$initRv$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: MallCartFragment.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartItemWrapperObj f90301b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MallCartFragment f90302c;

                a(CartItemWrapperObj cartItemWrapperObj, MallCartFragment mallCartFragment) {
                    this.f90301b = cartItemWrapperObj;
                    this.f90302c = mallCartFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MallProductObj product;
                    MallProductObj product2;
                    MallGameInfoObj game_info;
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41528, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    MallPurchaseDetailDialogFragment.a aVar = MallPurchaseDetailDialogFragment.f89678c0;
                    CartItemObj item = this.f90301b.getItem();
                    String appid = (item == null || (product2 = item.getProduct()) == null || (game_info = product2.getGame_info()) == null) ? null : game_info.getAppid();
                    CartItemObj item2 = this.f90301b.getItem();
                    String sku_id = (item2 == null || (product = item2.getProduct()) == null) ? null : product.getSku_id();
                    CartItemObj item3 = this.f90301b.getItem();
                    aVar.b(null, appid, null, sku_id, item3 != null ? item3.getCart_id() : null).M3(this.f90302c.getChildFragmentManager(), this.f90302c.z4());
                }
            }

            /* JADX INFO: compiled from: MallCartFragment.kt */
            public static final class b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartItemWrapperObj f90303b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ vp f90304c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ MallCartFragment f90305d;

                b(CartItemWrapperObj cartItemWrapperObj, vp vpVar, MallCartFragment mallCartFragment) {
                    this.f90303b = cartItemWrapperObj;
                    this.f90304c = vpVar;
                    this.f90305d = mallCartFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41532, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    CartItemObj item = this.f90303b.getItem();
                    f0.m(item);
                    Integer count = item.getCount();
                    if (count != null && count.intValue() == 1) {
                        return;
                    }
                    CartItemObj item2 = this.f90303b.getItem();
                    f0.m(item2);
                    CartItemObj item3 = this.f90303b.getItem();
                    f0.m(item3);
                    Integer count2 = item3.getCount();
                    f0.m(count2);
                    item2.setCount(Integer.valueOf(count2.intValue() - 1));
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    CartItemObj item4 = this.f90303b.getItem();
                    f0.m(item4);
                    mallCartUtils.p(item4, this.f90304c);
                    MallCartFragment.i4(this.f90305d);
                    MallCartFragment mallCartFragment = this.f90305d;
                    CartItemObj item5 = this.f90303b.getItem();
                    f0.m(item5);
                    MallCartFragment.P3(mallCartFragment, item5);
                }
            }

            /* JADX INFO: compiled from: MallCartFragment.kt */
            public static final class c implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ CartItemWrapperObj f90306b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ vp f90307c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ MallCartFragment f90308d;

                c(CartItemWrapperObj cartItemWrapperObj, vp vpVar, MallCartFragment mallCartFragment) {
                    this.f90306b = cartItemWrapperObj;
                    this.f90307c = vpVar;
                    this.f90308d = mallCartFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41533, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    CartItemObj item = this.f90306b.getItem();
                    f0.m(item);
                    Integer maximum = item.getMaximum();
                    CartItemObj item2 = this.f90306b.getItem();
                    f0.m(item2);
                    if (f0.g(maximum, item2.getCount())) {
                        com.max.hbutils.utils.c.f("超出限购数量");
                        return;
                    }
                    CartItemObj item3 = this.f90306b.getItem();
                    f0.m(item3);
                    CartItemObj item4 = this.f90306b.getItem();
                    f0.m(item4);
                    Integer count = item4.getCount();
                    f0.m(count);
                    item3.setCount(Integer.valueOf(count.intValue() + 1));
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    CartItemObj item5 = this.f90306b.getItem();
                    f0.m(item5);
                    mallCartUtils.p(item5, this.f90307c);
                    MallCartFragment.i4(this.f90308d);
                    MallCartFragment mallCartFragment = this.f90308d;
                    CartItemObj item6 = this.f90306b.getItem();
                    f0.m(item6);
                    MallCartFragment.P3(mallCartFragment, item6);
                }
            }

            /* JADX INFO: compiled from: MallCartFragment.kt */
            public static final class d implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ MallCartFragment f90309b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CartItemWrapperObj f90310c;

                d(MallCartFragment mallCartFragment, CartItemWrapperObj cartItemWrapperObj) {
                    this.f90309b = mallCartFragment;
                    this.f90310c = cartItemWrapperObj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41534, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f90309b).mContext;
                    f0.o(mContext, "mContext");
                    CartItemObj item = this.f90310c.getItem();
                    f0.m(item);
                    mallCartUtils.l(mContext, item);
                }
            }

            @Override // com.max.hbcommon.base.adapter.u
            public /* bridge */ /* synthetic */ int m(int i10, CartItemWrapperObj cartItemWrapperObj) {
                Object[] objArr = {new Integer(i10), cartItemWrapperObj};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41525, new Class[]{cls, Object.class}, cls);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, cartItemWrapperObj);
            }

            public int n(int i10, @dl.d CartItemWrapperObj data) {
                Object[] objArr = {new Integer(i10), data};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41523, new Class[]{cls, CartItemWrapperObj.class}, cls);
                if (patchProxyResultProxy.isSupported) {
                    return ((Integer) patchProxyResultProxy.result).intValue();
                }
                f0.p(data, "data");
                return data.getItem_type() == CartListItemType.GROUP ? R.layout.item_mall_cart_group : R.layout.item_mall_cart_list;
            }

            public void o(@dl.d final s.e viewHolder, @dl.d final CartItemWrapperObj obj) {
                if (PatchProxy.proxy(new Object[]{viewHolder, obj}, this, changeQuickRedirect, false, 41522, new Class[]{s.e.class, CartItemWrapperObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(obj, "obj");
                if (viewHolder.d() == R.layout.item_mall_cart_group) {
                    MallCartFragment.j4(this.f90300b, viewHolder, obj.getGourp());
                    return;
                }
                if (viewHolder.d() == R.layout.item_mall_cart_list) {
                    vp vpVarA = vp.a(viewHolder.itemView);
                    f0.o(vpVarA, "bind(viewHolder.itemView)");
                    int i10 = (viewHolder.getAdapterPosition() >= getDataList().size() - 1 || getDataList().get(viewHolder.getAdapterPosition() + 1).getItem_type() == CartListItemType.GROUP) ? 2 : 1;
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    Activity mContext = ((com.max.hbcommon.base.d) this.f90300b).mContext;
                    f0.o(mContext, "mContext");
                    CartItemObj item = obj.getItem();
                    f0.m(item);
                    final MallCartFragment mallCartFragment = this.f90300b;
                    mallCartUtils.n(mContext, item, vpVarA, i10, new l<String, b2>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$initRv$1$onBindViewHolder$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(String str) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41527, new Class[]{Object.class}, Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2(str);
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@dl.d String it) {
                            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41526, new Class[]{String.class}, Void.TYPE).isSupported) {
                                return;
                            }
                            f0.p(it, "it");
                            MallCartFragment.h4(mallCartFragment, viewHolder.getAdapterPosition(), it);
                        }
                    });
                    CartItemObj item2 = obj.getItem();
                    f0.m(item2);
                    if (item2.getProduct().isBundle()) {
                        vpVarA.f116917w.setOnClickListener(null);
                    } else {
                        vpVarA.f116917w.setOnClickListener(new a(obj, this.f90300b));
                    }
                    final CartItemCheckState cartItemCheckStateV3 = MallCartFragment.V3(this.f90300b, obj);
                    MallCartFragment mallCartFragment2 = this.f90300b;
                    ImageView imageView = vpVarA.f116897c;
                    f0.o(imageView, "itemBinding.ivCheckbox");
                    MallCartFragment.o4(mallCartFragment2, cartItemCheckStateV3, imageView);
                    viewHolder.getAdapterPosition();
                    FrameLayout frameLayout = vpVarA.f116910p;
                    final MallCartFragment mallCartFragment3 = this.f90300b;
                    frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$initRv$1$onBindViewHolder$3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            CartItemCheckState cartItemCheckState;
                            MallProductObj product;
                            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41529, new Class[]{View.class}, Void.TYPE).isSupported || (cartItemCheckState = cartItemCheckStateV3) == CartItemCheckState.DISABLE) {
                                return;
                            }
                            if (cartItemCheckState == CartItemCheckState.CHECKED) {
                                LinkedList<com.max.xiaoheihe.module.mall.cart.viewmodel.c> linkedListN = MallCartFragment.b4(mallCartFragment3).n();
                                final CartItemWrapperObj cartItemWrapperObj = obj;
                                x.I0(linkedListN, new l<com.max.xiaoheihe.module.mall.cart.viewmodel.c, Boolean>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$initRv$1$onBindViewHolder$3.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(1);
                                    }

                                    @dl.d
                                    public final Boolean a(@dl.d com.max.xiaoheihe.module.mall.cart.viewmodel.c it) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41530, new Class[]{com.max.xiaoheihe.module.mall.cart.viewmodel.c.class}, Boolean.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return (Boolean) patchProxyResultProxy.result;
                                        }
                                        f0.p(it, "it");
                                        CartItemObj item3 = cartItemWrapperObj.getItem();
                                        f0.m(item3);
                                        return Boolean.valueOf(f0.g(item3.getCart_id(), it.e()));
                                    }

                                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Boolean, java.lang.Object] */
                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ Boolean invoke(com.max.xiaoheihe.module.mall.cart.viewmodel.c cVar) {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 41531, new Class[]{Object.class}, Object.class);
                                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(cVar);
                                    }
                                });
                                MallCartFragment.g4(mallCartFragment3);
                                MallCartFragment.e4(mallCartFragment3);
                                return;
                            }
                            LinkedList<com.max.xiaoheihe.module.mall.cart.viewmodel.c> linkedListN2 = MallCartFragment.b4(mallCartFragment3).n();
                            CartItemObj item3 = obj.getItem();
                            f0.m(item3);
                            String cart_id = item3.getCart_id();
                            CartItemObj item4 = obj.getItem();
                            linkedListN2.add(new com.max.xiaoheihe.module.mall.cart.viewmodel.c(cart_id, (item4 == null || (product = item4.getProduct()) == null) ? null : product.getSku_id()));
                            MallCartFragment.g4(mallCartFragment3);
                            MallCartFragment.e4(mallCartFragment3);
                        }
                    });
                    d dVar = new d(this.f90300b, obj);
                    vpVarA.f116900f.setOnClickListener(dVar);
                    vpVarA.f116907m.setOnClickListener(dVar);
                    vpVarA.f116901g.setOnClickListener(new b(obj, vpVarA, this.f90300b));
                    vpVarA.f116896b.setOnClickListener(new c(obj, vpVarA, this.f90300b));
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
                if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 41524, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                o(eVar, (CartItemWrapperObj) obj);
            }
        };
        t9 t9Var4 = this.f90281e;
        if (t9Var4 == null) {
            f0.S("binding");
            t9Var4 = null;
        }
        RecyclerView recyclerView = t9Var4.f115892c;
        com.max.hbcommon.base.adapter.u<CartItemWrapperObj> uVar = this.f90282f;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView.setAdapter(uVar);
        t9 t9Var5 = this.f90281e;
        if (t9Var5 == null) {
            f0.S("binding");
        } else {
            t9Var2 = t9Var5;
        }
        t9Var2.f115892c.addOnScrollListener(new l());
    }

    private final void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41456, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.setTitle("购物车");
        this.mTitleBar.setAction("管理");
        this.mTitleBar.setActionOnClickListener(new m());
    }

    private final void I4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41447, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        H4();
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        t9Var.f115893d.S(new n());
        t9 t9Var3 = this.f90281e;
        if (t9Var3 == null) {
            f0.S("binding");
            t9Var3 = null;
        }
        t9Var3.f115893d.b0(false);
        t9 t9Var4 = this.f90281e;
        if (t9Var4 == null) {
            f0.S("binding");
            t9Var4 = null;
        }
        t9Var4.f115893d.k0(new o());
        GradientDrawable gradientDrawableO = com.max.hbutils.utils.q.o(this.mContext, R.color.divider_color, 0.0f);
        t9 t9Var5 = this.f90281e;
        if (t9Var5 == null) {
            f0.S("binding");
        } else {
            t9Var2 = t9Var5;
        }
        t9Var2.f115901l.setBackgroundDrawable(com.max.hbutils.utils.q.M(gradientDrawableO, this.mContext, R.color.divider_secondary_1_color, 0.5f));
        D4();
        U4();
        G4();
        F4();
    }

    private final boolean J4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41465, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (CartItemWrapperObj cartItemWrapperObj : A4().k()) {
            if (cartItemWrapperObj.getItem_type() == CartListItemType.PRODUCT) {
                CartItemObj item = cartItemWrapperObj.getItem();
                f0.m(item);
                if (f0.g(item.getState(), "-1")) {
                    continue;
                } else {
                    LinkedList<String> linkedListM = A4().m();
                    CartItemObj item2 = cartItemWrapperObj.getItem();
                    f0.m(item2);
                    if (!linkedListM.contains(item2.getCart_id())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final boolean K4(CartGroupObj cartGroupObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartGroupObj}, this, changeQuickRedirect, false, 41466, new Class[]{CartGroupObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (f0.g(A4().i().f(), Boolean.FALSE) && !com.max.hbcommon.utils.c.x(cartGroupObj.getMulti())) {
            return false;
        }
        for (CartItemObj cartItemObj : cartGroupObj.getItems()) {
            String state = cartItemObj.getState();
            f0.m(state);
            if (b5(state) && !A4().m().contains(cartItemObj.getCart_id())) {
                return false;
            }
        }
        return true;
    }

    private final boolean L4(CartGroupObj cartGroupObj, CartItemObj cartItemObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartGroupObj, cartItemObj}, this, changeQuickRedirect, false, 41472, new Class[]{CartGroupObj.class, CartItemObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList<CartItemWrapperObj> arrayListK = A4().k();
        ArrayList<CartItemWrapperObj> arrayList = new ArrayList();
        for (Object obj : arrayListK) {
            if (((CartItemWrapperObj) obj).getItem_type() == CartListItemType.PRODUCT) {
                arrayList.add(obj);
            }
        }
        for (CartItemWrapperObj cartItemWrapperObj : arrayList) {
            LinkedList<String> linkedListM = A4().m();
            CartItemObj item = cartItemWrapperObj.getItem();
            f0.m(item);
            if (linkedListM.contains(item.getCart_id())) {
                if (!f0.g(cartItemWrapperObj.getGourp().getIndex_custom(), cartGroupObj.getIndex_custom())) {
                    return false;
                }
                if (com.max.hbcommon.utils.c.x(cartGroupObj.getMulti())) {
                    continue;
                } else {
                    CartItemObj item2 = cartItemWrapperObj.getItem();
                    f0.m(item2);
                    if (!f0.g(item2.getCart_id(), cartItemObj.getCart_id())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41482, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.base.adapter.u<CartItemWrapperObj> uVar = this.f90282f;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
        T4();
    }

    private final void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41477, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A4().o(CollectionsKt___CollectionsKt.h3(A4().m(), Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$onBatchDelete$cartIds$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41539, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41540, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null));
        A4().n().clear();
    }

    private final void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41473, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (CartItemWrapperObj cartItemWrapperObj : A4().k()) {
            if (cartItemWrapperObj.getItem_type() == CartListItemType.GROUP) {
                CartGroupObj gourp = cartItemWrapperObj.getGourp();
                f0.m(gourp);
                cartItemWrapperObj.set_checked(Boolean.valueOf(K4(gourp)));
            }
        }
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        t9Var.f115899j.setChecked(J4(), false);
        if (f0.g(A4().i().f(), Boolean.TRUE)) {
            X4();
        } else if (A4().n().size() > 0) {
            t9 t9Var3 = this.f90281e;
            if (t9Var3 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var3;
            }
            t9Var2.f115896g.setRightText("去结算(" + A4().n().size() + ')');
            X4();
        } else {
            C4();
        }
        Q4();
    }

    public static final /* synthetic */ void P3(MallCartFragment mallCartFragment, CartItemObj cartItemObj) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, cartItemObj}, null, changeQuickRedirect, true, 41495, new Class[]{MallCartFragment.class, CartItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.s4(cartItemObj);
    }

    private final void P4(int i10, String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, 41476, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        A4().o(str);
    }

    public static final /* synthetic */ void Q3(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41499, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.t4();
    }

    private final void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41478, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        for (CartItemWrapperObj cartItemWrapperObj : A4().k()) {
            if (cartItemWrapperObj.getItem_type() == CartListItemType.PRODUCT) {
                LinkedList<String> linkedListM = A4().m();
                CartItemObj item = cartItemWrapperObj.getItem();
                f0.m(item);
                if (linkedListM.contains(item.getCart_id())) {
                    CartItemObj item2 = cartItemWrapperObj.getItem();
                    f0.m(item2);
                    BigDecimal bigDecimal2 = new BigDecimal(item2.getProduct().getPrice().getFinal_price());
                    CartItemObj item3 = cartItemWrapperObj.getItem();
                    f0.m(item3);
                    Integer count = item3.getCount();
                    BigDecimal bigDecimalMultiply = bigDecimal2.multiply(new BigDecimal(count != null ? count.intValue() : 1));
                    f0.o(bigDecimalMultiply, "this.multiply(other)");
                    bigDecimal = bigDecimal.add(bigDecimalMultiply);
                    f0.o(bigDecimal, "this.add(other)");
                }
            }
        }
        re reVar = this.f90283g;
        if (reVar == null) {
            f0.S("mPriceBinding");
            reVar = null;
        }
        reVar.f115206c.setPrice(r1.I(bigDecimal.toString()));
    }

    public static final /* synthetic */ void R3(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41497, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.u4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.max.xiaoheihe.module.mall.cart.CartItemCheckState] */
    private final void R4(com.max.hbcommon.base.adapter.s.e eVar, CartGroupObj cartGroupObj) {
        if (PatchProxy.proxy(new Object[]{eVar, cartGroupObj}, this, changeQuickRedirect, false, 41451, new Class[]{com.max.hbcommon.base.adapter.s.e.class, CartGroupObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) eVar.i(R.id.tv_group_name);
        ImageView ivCheckbox = (ImageView) eVar.i(R.id.iv_checkbox);
        View viewI = eVar.i(R.id.vg_check);
        textView.setText(cartGroupObj.getTitle());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = v4(cartGroupObj);
        p pVar = new p(objectRef, this, cartGroupObj);
        textView.setOnClickListener(pVar);
        viewI.setOnClickListener(pVar);
        CartItemCheckState cartItemCheckState = (CartItemCheckState) objectRef.f124891b;
        f0.o(ivCheckbox, "ivCheckbox");
        W4(cartItemCheckState, ivCheckbox);
    }

    private final void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41480, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        RecyclerView.LayoutManager layoutManager = t9Var.f115892c.getLayoutManager();
        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        com.max.hbcommon.utils.d.b("zzzzheader", "positon ==" + iFindFirstVisibleItemPosition + "  completepositon=" + iFindFirstCompletelyVisibleItemPosition);
        if ((iFindFirstVisibleItemPosition < 0 && iFindFirstCompletelyVisibleItemPosition < 0) || (iFindFirstVisibleItemPosition == 0 && iFindFirstCompletelyVisibleItemPosition == 0)) {
            t9 t9Var3 = this.f90281e;
            if (t9Var3 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var3;
            }
            t9Var2.f115900k.b().setVisibility(8);
            return;
        }
        if (iFindFirstVisibleItemPosition == iFindFirstCompletelyVisibleItemPosition) {
            T4();
            t9 t9Var4 = this.f90281e;
            if (t9Var4 == null) {
                f0.S("binding");
                t9Var4 = null;
            }
            t9Var4.f115900k.b().setVisibility(0);
            t9 t9Var5 = this.f90281e;
            if (t9Var5 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var5;
            }
            t9Var2.f115900k.b().setTranslationY(this.f90286j);
            return;
        }
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(x4(iFindFirstCompletelyVisibleItemPosition));
        if (viewFindViewByPosition == null) {
            T4();
            t9 t9Var6 = this.f90281e;
            if (t9Var6 == null) {
                f0.S("binding");
                t9Var6 = null;
            }
            t9Var6.f115900k.b().setVisibility(0);
            t9 t9Var7 = this.f90281e;
            if (t9Var7 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var7;
            }
            t9Var2.f115900k.b().setTranslationY(this.f90286j);
            return;
        }
        t9 t9Var8 = this.f90281e;
        if (t9Var8 == null) {
            f0.S("binding");
            t9Var8 = null;
        }
        int iV = ViewUtils.V(t9Var8.f115900k.b()) - viewFindViewByPosition.getTop();
        if (iV > 0) {
            T4();
            t9 t9Var9 = this.f90281e;
            if (t9Var9 == null) {
                f0.S("binding");
                t9Var9 = null;
            }
            t9Var9.f115900k.b().setVisibility(0);
            t9 t9Var10 = this.f90281e;
            if (t9Var10 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var10;
            }
            t9Var2.f115900k.b().setTranslationY(-iV);
            return;
        }
        T4();
        t9 t9Var11 = this.f90281e;
        if (t9Var11 == null) {
            f0.S("binding");
            t9Var11 = null;
        }
        t9Var11.f115900k.b().setVisibility(0);
        t9 t9Var12 = this.f90281e;
        if (t9Var12 == null) {
            f0.S("binding");
        } else {
            t9Var2 = t9Var12;
        }
        t9Var2.f115900k.b().setTranslationY(this.f90286j);
    }

    private final void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41479, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        RecyclerView.LayoutManager layoutManager = t9Var.f115892c.getLayoutManager();
        f0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0) {
            ArrayList<CartItemWrapperObj> arrayListK = A4().k();
            if ((arrayListK == null || arrayListK.isEmpty()) || iFindFirstVisibleItemPosition >= A4().k().size()) {
                return;
            }
            CartGroupObj gourp = A4().k().get(iFindFirstVisibleItemPosition).getGourp();
            t9 t9Var3 = this.f90281e;
            if (t9Var3 == null) {
                f0.S("binding");
            } else {
                t9Var2 = t9Var3;
            }
            R4(new com.max.hbcommon.base.adapter.s.e(R.layout.item_mall_cart_group, t9Var2.f115900k.b()), gourp);
        }
    }

    private final void U4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41448, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new q());
        f0.o(gVarRegisterForActivityResult, "private fun registerLaun…ata()\n            }\n    }");
        this.f90285i = gVarRegisterForActivityResult;
    }

    public static final /* synthetic */ CartItemCheckState V3(MallCartFragment mallCartFragment, CartItemWrapperObj cartItemWrapperObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartFragment, cartItemWrapperObj}, null, changeQuickRedirect, true, 41493, new Class[]{MallCartFragment.class, CartItemWrapperObj.class}, CartItemCheckState.class);
        return patchProxyResultProxy.isSupported ? (CartItemCheckState) patchProxyResultProxy.result : mallCartFragment.w4(cartItemWrapperObj);
    }

    private final void V4(CartGroupObj cartGroupObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{cartGroupObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41468, new Class[]{CartGroupObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        for (final CartItemObj cartItemObj : cartGroupObj.getItems()) {
            String state = cartItemObj.getState();
            f0.m(state);
            if (b5(state)) {
                if (z10) {
                    if (!A4().m().contains(cartItemObj.getCart_id())) {
                        A4().n().add(new com.max.xiaoheihe.module.mall.cart.viewmodel.c(cartItemObj.getCart_id(), cartItemObj.getProduct().getSku_id()));
                    }
                } else if (A4().m().contains(cartItemObj.getCart_id())) {
                    x.I0(A4().n(), new yh.l<com.max.xiaoheihe.module.mall.cart.viewmodel.c, Boolean>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$setGroupChildrenChecked$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(1);
                        }

                        @dl.d
                        public final Boolean a(@dl.d com.max.xiaoheihe.module.mall.cart.viewmodel.c it) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41544, new Class[]{com.max.xiaoheihe.module.mall.cart.viewmodel.c.class}, Boolean.class);
                            if (patchProxyResultProxy.isSupported) {
                                return (Boolean) patchProxyResultProxy.result;
                            }
                            f0.p(it, "it");
                            return Boolean.valueOf(f0.g(cartItemObj.getCart_id(), it.e()));
                        }

                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Boolean, java.lang.Object] */
                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(com.max.xiaoheihe.module.mall.cart.viewmodel.c cVar) {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 41545, new Class[]{Object.class}, Object.class);
                            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(cVar);
                        }
                    });
                }
            }
        }
    }

    private final void W4(CartItemCheckState cartItemCheckState, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{cartItemCheckState, imageView}, this, changeQuickRedirect, false, 41471, new Class[]{CartItemCheckState.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f90289a[cartItemCheckState.ordinal()];
        if (i10 == 1) {
            imageView.setImageResource(R.drawable.common_select_disable_line_16x16);
        } else if (i10 == 2) {
            imageView.setImageResource(R.drawable.common_select_single_filled_16x16);
        } else {
            if (i10 != 3) {
                return;
            }
            imageView.setImageResource(R.drawable.common_select_line_16x16);
        }
    }

    private final void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41474, new Class[0], Void.TYPE).isSupported || this.f90288l) {
            return;
        }
        t9 t9Var = this.f90281e;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(t9Var.f115897h, "translationY", ViewUtils.f(this.mContext, 58.5f) + 0.0f, 0.0f);
        objectAnimatorOfFloat.start();
        addValueAnimator(objectAnimatorOfFloat);
        this.f90288l = true;
    }

    private final void Y4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41459, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.dialog_select_collection, (ViewGroup) null, false);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, viewInflate);
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.bb_cancel);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        View viewFindViewById = viewInflate.findViewById(R.id.v_blank);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_dialog);
        View viewFindViewById3 = viewInflate.findViewById(R.id.rv_choices);
        f0.o(viewFindViewById3, "mContentView.findViewById(R.id.rv_choices)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_action);
        viewFindViewById2.setBackgroundResource(R.drawable.white_top_8dp);
        ArrayList arrayList = new ArrayList();
        textView2.setVisibility(8);
        if (z10) {
            arrayList.add("确认删除");
            textView.setText("是否删除所选商品");
        } else {
            arrayList.add("确认清理");
            textView.setText("一键清理将删除所有失效商品，是否继续？");
        }
        RecyclerView.Adapter rVar = new r(arrayList, "确认清理", this, iVar, "确认删除", this.mContext);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(rVar);
        s sVar = new s(iVar);
        bottomButtonLeftItemView.setRightClickListener(sVar);
        viewFindViewById.setOnClickListener(sVar);
        iVar.show();
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41450, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t9 t9Var = this.f90281e;
        t9 t9Var2 = null;
        if (t9Var == null) {
            f0.S("binding");
            t9Var = null;
        }
        t9Var.f115898i.b().setVisibility(0);
        t9 t9Var3 = this.f90281e;
        if (t9Var3 == null) {
            f0.S("binding");
        } else {
            t9Var2 = t9Var3;
        }
        t9Var2.f115898i.f111233d.setOnClickListener(new t());
    }

    private final void a5(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 41464, new Class[]{l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (!isActive() || activity == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(getString(R.string.fail)).l(getString(R.string.has_not_finish_order)).u(getString(R.string.to_handle), new u(gVar)).o(getString(R.string.cancel), v.f90342b).F();
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.mall.cart.viewmodel.a b4(MallCartFragment mallCartFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41483, new Class[]{MallCartFragment.class}, com.max.xiaoheihe.module.mall.cart.viewmodel.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.a) patchProxyResultProxy.result : mallCartFragment.A4();
    }

    private final boolean b5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41467, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (f0.g(A4().i().f(), Boolean.TRUE)) {
            return !f0.g(str, "-1");
        }
        return f0.g(str, "1");
    }

    public static final /* synthetic */ boolean c4(MallCartFragment mallCartFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41487, new Class[]{MallCartFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallCartFragment.B4();
    }

    public static final /* synthetic */ void d4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41489, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.C4();
    }

    public static final /* synthetic */ void e4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41485, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.M4();
    }

    public static final /* synthetic */ void f4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41500, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.N4();
    }

    public static final /* synthetic */ void g4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41488, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.O4();
    }

    public static final /* synthetic */ void h4(MallCartFragment mallCartFragment, int i10, String str) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, new Integer(i10), str}, null, changeQuickRedirect, true, 41492, new Class[]{MallCartFragment.class, Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.P4(i10, str);
    }

    public static final /* synthetic */ void i4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41486, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.Q4();
    }

    public static final /* synthetic */ void j4(MallCartFragment mallCartFragment, com.max.hbcommon.base.adapter.s.e eVar, CartGroupObj cartGroupObj) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, eVar, cartGroupObj}, null, changeQuickRedirect, true, 41491, new Class[]{MallCartFragment.class, com.max.hbcommon.base.adapter.s.e.class, CartGroupObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.R4(eVar, cartGroupObj);
    }

    public static final /* synthetic */ void k4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41496, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.S4();
    }

    public static final /* synthetic */ void l4(MallCartFragment mallCartFragment, CartGroupObj cartGroupObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, cartGroupObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 41490, new Class[]{MallCartFragment.class, CartGroupObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.V4(cartGroupObj, z10);
    }

    public static final /* synthetic */ void o4(MallCartFragment mallCartFragment, CartItemCheckState cartItemCheckState, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, cartItemCheckState, imageView}, null, changeQuickRedirect, true, 41494, new Class[]{MallCartFragment.class, CartItemCheckState.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.W4(cartItemCheckState, imageView);
    }

    public static final /* synthetic */ void p4(MallCartFragment mallCartFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 41498, new Class[]{MallCartFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.Y4(z10);
    }

    public static final /* synthetic */ void q4(MallCartFragment mallCartFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment}, null, changeQuickRedirect, true, 41484, new Class[]{MallCartFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.Z4();
    }

    public static final /* synthetic */ void r4(MallCartFragment mallCartFragment, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{mallCartFragment, gVar}, null, changeQuickRedirect, true, 41501, new Class[]{MallCartFragment.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartFragment.a5(gVar);
    }

    private final void s4(CartItemObj cartItemObj) {
        if (PatchProxy.proxy(new Object[]{cartItemObj}, this, changeQuickRedirect, false, 41453, new Class[]{CartItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U2(cartItemObj.getProduct().getSku_id(), String.valueOf(cartItemObj.getCount()), null, null, cartItemObj.getCart_id(), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41460, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CartItemWrapperObj cartItemWrapperObj : A4().k()) {
            if (cartItemWrapperObj.getItem_type() == CartListItemType.PRODUCT) {
                CartItemObj item = cartItemWrapperObj.getItem();
                f0.m(item);
                if (f0.g(item.getState(), "-1")) {
                    CartItemObj item2 = cartItemWrapperObj.getItem();
                    f0.m(item2);
                    arrayList.add(item2.getCart_id());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        A4().o(CollectionsKt___CollectionsKt.h3(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartFragment$clearInvalidProduct$cartIds$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41505, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41506, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null));
    }

    private final void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41463, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        this.f90280d = new LoadingDialog(mContext, "", true).r();
        MallRegisterOrderObj mallRegisterOrderObjY4 = y4();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v8(com.max.hbutils.utils.k.p(mallRegisterOrderObjY4), this.f90287k).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(mallRegisterOrderObjY4)));
    }

    private final CartItemCheckState v4(CartGroupObj cartGroupObj) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartGroupObj}, this, changeQuickRedirect, false, 41469, new Class[]{CartGroupObj.class}, CartItemCheckState.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemCheckState) patchProxyResultProxy.result;
        }
        if (f0.g(A4().i().f(), Boolean.FALSE) && !com.max.hbcommon.utils.c.x(cartGroupObj.getMulti())) {
            return CartItemCheckState.DISABLE;
        }
        int i11 = 0;
        for (CartItemObj cartItemObj : cartGroupObj.getItems()) {
            if (A4().m().contains(cartItemObj.getCart_id())) {
                i11++;
            } else {
                Boolean boolF = A4().i().f();
                Boolean bool = Boolean.TRUE;
                if (f0.g(boolF, bool) && !f0.g(cartItemObj.getState(), "-1")) {
                    return CartItemCheckState.UNCHECKED;
                }
                if (!f0.g(A4().i().f(), bool) && f0.g(cartItemObj.getState(), "1") && L4(cartGroupObj, cartItemObj)) {
                    return CartItemCheckState.UNCHECKED;
                }
                i10++;
            }
        }
        if (i10 == cartGroupObj.getItems().size()) {
            return CartItemCheckState.DISABLE;
        }
        return i11 == cartGroupObj.getItems().size() - i10 ? CartItemCheckState.CHECKED : CartItemCheckState.UNCHECKED;
    }

    private final CartItemCheckState w4(CartItemWrapperObj cartItemWrapperObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cartItemWrapperObj}, this, changeQuickRedirect, false, 41470, new Class[]{CartItemWrapperObj.class}, CartItemCheckState.class);
        if (patchProxyResultProxy.isSupported) {
            return (CartItemCheckState) patchProxyResultProxy.result;
        }
        if (f0.g(A4().i().f(), Boolean.TRUE)) {
            LinkedList<String> linkedListM = A4().m();
            CartItemObj item = cartItemWrapperObj.getItem();
            f0.m(item);
            if (linkedListM.contains(item.getCart_id())) {
                return CartItemCheckState.CHECKED;
            }
            CartItemObj item2 = cartItemWrapperObj.getItem();
            f0.m(item2);
            String state = item2.getState();
            f0.m(state);
            return b5(state) ? CartItemCheckState.UNCHECKED : CartItemCheckState.DISABLE;
        }
        LinkedList<String> linkedListM2 = A4().m();
        CartItemObj item3 = cartItemWrapperObj.getItem();
        f0.m(item3);
        if (linkedListM2.contains(item3.getCart_id())) {
            return CartItemCheckState.CHECKED;
        }
        CartItemObj item4 = cartItemWrapperObj.getItem();
        f0.m(item4);
        String state2 = item4.getState();
        f0.m(state2);
        if (b5(state2)) {
            CartGroupObj gourp = cartItemWrapperObj.getGourp();
            CartItemObj item5 = cartItemWrapperObj.getItem();
            f0.m(item5);
            if (L4(gourp, item5)) {
                return CartItemCheckState.UNCHECKED;
            }
        }
        return CartItemCheckState.DISABLE;
    }

    private final int x4(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41481, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int size = A4().k().size();
        while (i10 < size) {
            if (A4().k().get(i10).getItem_type() == CartListItemType.GROUP) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 41446, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        this.mTitleBar.setTitle("购物车(" + MallCartUtils.f90196a.j() + ')');
        l3.c cVar = null;
        t9 t9VarD = t9.d(this.mInflater, null, false);
        f0.o(t9VarD, "inflate(mInflater, null, false)");
        this.f90281e = t9VarD;
        if (t9VarD == null) {
            f0.S("binding");
        } else {
            cVar = t9VarD;
        }
        setContentView(cVar);
        I4();
        A4().g();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41454, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        A4().f().r(BaseViewModel.TYPE_STATE.LOADING);
        A4().g();
    }

    @Override // com.max.xiaoheihe.module.mall.cart.ui.d
    public void u0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41455, new Class[0], Void.TYPE).isSupported && isActive()) {
            A4().g();
        }
    }

    @dl.d
    public final MallRegisterOrderObj y4() {
        String session;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41462, new Class[0], MallRegisterOrderObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallRegisterOrderObj) patchProxyResultProxy.result;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        CartDetailObj cartDetailObjF = A4().h().f();
        mallRegisterOrderObj.setSession((cartDetailObjF == null || (session = cartDetailObjF.getSession()) == null) ? 0L : Long.parseLong(session));
        if (mallRegisterOrderObj.getParams() == null) {
            mallRegisterOrderObj.setParams(new ArrayList());
        }
        for (com.max.xiaoheihe.module.mall.cart.viewmodel.c cVar : A4().n()) {
            MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
            mallOrderParamObj.setCart_id(cVar.e());
            String strF = cVar.f();
            if (strF != null) {
                mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(strF));
            }
            mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        }
        return mallRegisterOrderObj;
    }

    @dl.d
    public final String z4() {
        return this.f90278b;
    }
}
