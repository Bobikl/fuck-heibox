package com.max.xiaoheihe.module.mall.cart;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.flyco.tablayout.widget.MsgView;
import com.google.gson.JsonObject;
import com.max.hbcassette.bean.CassetteTagObj;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbcommon.component.card.CardViewGenerator;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.a;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.mall.MallGameInfoObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.max.xiaoheihe.bean.mall.cart.MallProductActionObj;
import com.max.xiaoheihe.bean.mall.purchase.UseBuyPurchaseDialogObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.module.mall.MallProductDetailActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.kc0;
import df.qe;
import df.vp;
import df.yp;
import dl.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: MallCartUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MallCartUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f90197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f90198c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f90199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f90200e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final MallCartUtils f90196a = new MallCartUtils();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f90201f = 8;

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90202a;

        static {
            int[] iArr = new int[OrderEvent.valuesCustom().length];
            try {
                iArr[OrderEvent.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderEvent.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderEvent.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f90202a = iArr;
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<CartDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.h<CartDetailObj> f90203b;

        b(l0.h<CartDetailObj> hVar) {
            this.f90203b = hVar;
        }

        public void onNext(@dl.d Result<CartDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41393, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f90203b.a(result.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41394, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<CartDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f90204b;

        c(l0.g gVar) {
            this.f90204b = gVar;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41395, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f90204b.a();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41396, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90205b;

        d(Context context) {
            this.f90205b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41397, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.k(this.f90205b);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90206b;

        e(Context context) {
            this.f90206b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41398, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.k(this.f90206b);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class f implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f90207b = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 41399, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            MallCartUtils.f90197b = motionEvent.getRawX();
            MallCartUtils.f90198c = motionEvent.getRawY();
            return false;
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class g implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yh.l<String, b2> f90209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CartItemObj f90210d;

        /* JADX INFO: compiled from: MallCartUtils.kt */
        public static final class a implements com.max.xiaoheihe.view.popuplist.a.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yh.l<String, b2> f90211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CartItemObj f90212b;

            /* JADX WARN: Multi-variable type inference failed */
            a(yh.l<? super String, b2> lVar, CartItemObj cartItemObj) {
                this.f90211a = lVar;
                this.f90212b = cartItemObj;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public boolean a(@dl.e View view, @dl.e View view2, int i10) {
                return true;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public void b(@dl.d View contextView, int i10, int i11) {
                Object[] objArr = {contextView, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41401, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(contextView, "contextView");
                this.f90211a.invoke(this.f90212b.getCart_id());
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.g
            @dl.d
            public String c(@dl.e View view, @dl.e View view2, int i10, int i11, @dl.e String str) {
                return str == null ? "" : str;
            }

            @Override // com.max.xiaoheihe.view.popuplist.a.h
            public /* synthetic */ void onDismiss() {
                com.max.xiaoheihe.view.popuplist.b.a(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(Context context, yh.l<? super String, b2> lVar, CartItemObj cartItemObj) {
            this.f90208b = context;
            this.f90209c = lVar;
            this.f90210d = cartItemObj;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41400, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            com.max.xiaoheihe.view.popuplist.a aVar = new com.max.xiaoheihe.view.popuplist.a(this.f90208b);
            ArrayList arrayList = new ArrayList();
            arrayList.add("删除");
            aVar.g0(view, 0, MallCartUtils.f90197b, MallCartUtils.f90198c, arrayList, new a(this.f90209c, this.f90210d));
            return true;
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f90213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CartItemObj f90214c;

        h(Context context, CartItemObj cartItemObj) {
            this.f90213b = context;
            this.f90214c = cartItemObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41402, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.l(this.f90213b, this.f90214c);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallProductActionObj f90215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f90216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f90217d;

        i(MallProductActionObj mallProductActionObj, Context context, String str) {
            this.f90215b = mallProductActionObj;
            this.f90216c = context;
            this.f90217d = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41403, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String type = this.f90215b.getType();
            if (f0.g(type, SwitchDetailActivity.P)) {
                com.max.xiaoheihe.base.router.b.k0(this.f90216c, this.f90215b.getUrl());
            } else if (f0.g(type, "cdkey_coupon")) {
                com.max.xiaoheihe.base.router.b.f0(this.f90216c, 0, 2, null).A();
            }
            MallCartUtils.c(MallCartUtils.f90196a, lb.d.f131165g2, this.f90217d);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class j implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f90218b;

        j(View view) {
            this.f90218b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41419, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f90218b.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class k implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f90219b;

        k(View view) {
            this.f90219b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41420, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Object animatedValue = it.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) animatedValue).floatValue();
            this.f90219b.setScaleX(fFloatValue);
            this.f90219b.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallProductActionObj f90220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f90221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f90222d;

        l(MallProductActionObj mallProductActionObj, Context context, String str) {
            this.f90220b = mallProductActionObj;
            this.f90221c = context;
            this.f90222d = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41421, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String cdkey = this.f90220b.getCdkey();
            if (cdkey != null && cdkey.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(this.f90221c, this.f90220b.getCdkey());
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.text_copied));
            MallCartUtils.c(MallCartUtils.f90196a, lb.d.f131158f2, this.f90222d);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallProductActionObj f90223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreButton f90224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f90225d;

        m(MallProductActionObj mallProductActionObj, MoreButton moreButton, String str) {
            this.f90223b = mallProductActionObj;
            this.f90224c = moreButton;
            this.f90225d = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41422, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String cdkey = this.f90223b.getCdkey();
            if (cdkey != null && cdkey.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            String type = this.f90223b.getType();
            if (f0.g(type, SwitchDetailActivity.P)) {
                Context context = this.f90224c.getContext();
                f0.o(context, "context");
                com.max.xiaoheihe.base.router.b.k0(context, this.f90223b.getUrl());
            } else if (f0.g(type, "cdkey_coupon")) {
                Context context2 = this.f90224c.getContext();
                f0.o(context2, "context");
                com.max.xiaoheihe.base.router.b.f0(context2, 0, 2, null).A();
            }
            MallCartUtils.c(MallCartUtils.f90196a, lb.d.f131165g2, this.f90225d);
        }
    }

    /* JADX INFO: compiled from: MallCartUtils.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallProductActionObj f90226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kc0 f90227c;

        n(MallProductActionObj mallProductActionObj, kc0 kc0Var) {
            this.f90226b = mallProductActionObj;
            this.f90227c = kc0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer kid;
            Object objB;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41423, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.f131214n2, null, null);
            MallProductActionObj.SendToPcObj send_to_pc = this.f90226b.getSend_to_pc();
            if (send_to_pc == null || (kid = send_to_pc.getKid()) == null) {
                return;
            }
            int iIntValue = kid.intValue();
            try {
                kotlin.Result.a aVar = kotlin.Result.f124476c;
                objB = kotlin.Result.b((com.max.hbcommon.network.d) com.max.xiaoheihe.network.i.a().W6(iIntValue).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d()));
            } catch (Throwable th2) {
                kotlin.Result.a aVar2 = kotlin.Result.f124476c;
                objB = kotlin.Result.b(t0.a(th2));
            }
            Throwable thE = kotlin.Result.e(objB);
            if (thE != null) {
                com.max.heybox.hblog.g.f74531b.v("[MallCartUtils] send_to_pc net request fall, error: " + thE);
            }
        }
    }

    private MallCartUtils() {
    }

    private final void A(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 41377, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!(str2 == null || str2.length() == 0)) {
            jsonObject.addProperty("order_id", str2);
        }
        com.max.hbcommon.analytics.l.f66572a.l(str, jsonObject);
    }

    private final void B(OrderEvent orderEvent, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject) {
        String str7;
        if (PatchProxy.proxy(new Object[]{orderEvent, str, str2, str3, str4, str5, str6, jsonObject}, this, changeQuickRedirect, false, 41386, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        int i10 = a.f90202a[orderEvent.ordinal()];
        if (i10 == 1) {
            str7 = lb.d.Z1;
        } else if (i10 == 2) {
            str7 = lb.d.f131123a2;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str7 = lb.d.f131130b2;
        }
        pageEventObj.setPath(str7);
        JsonObject jsonObjectDeepCopy = jsonObject != null ? jsonObject.deepCopy() : null;
        if (jsonObjectDeepCopy == null) {
            jsonObjectDeepCopy = new JsonObject();
        }
        jsonObjectDeepCopy.addProperty("app_id", str);
        jsonObjectDeepCopy.addProperty("sku_id", str2);
        jsonObjectDeepCopy.addProperty("buy_sku_id", str3);
        jsonObjectDeepCopy.addProperty("order_id", str4);
        jsonObjectDeepCopy.addProperty("h_src", str6);
        jsonObjectDeepCopy.addProperty("order_variety", str5);
        pageEventObj.setAddition(jsonObjectDeepCopy);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / ((long) 1000)));
        if (orderEvent == OrderEvent.REGISTER) {
            ArrayList<ArrayList<PathSrcNode>> arrayListG = com.max.hbcommon.analytics.l.f66572a.g();
            if (!(arrayListG == null || arrayListG.isEmpty())) {
                pageEventObj.setSrc(arrayListG);
            }
        }
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    @xh.m
    public static final void G(@dl.d AppCompatActivity activity, @dl.e FragmentManager fragmentManager, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4) {
        if (PatchProxy.proxy(new Object[]{activity, fragmentManager, str, str2, str3, str4}, null, changeQuickRedirect, true, 41388, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        I(activity, fragmentManager, str, null, null, null, null, null, str3, str2, str4, "1", null, Boolean.FALSE);
    }

    @xh.m
    public static final void H(@dl.d AppCompatActivity activity, @dl.e FragmentManager fragmentManager, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6, @dl.e String str7, @dl.e String str8, @dl.e Boolean bool) {
        if (PatchProxy.proxy(new Object[]{activity, fragmentManager, str, str2, str3, str4, str5, str6, str7, str8, bool}, null, changeQuickRedirect, true, 41387, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        I(activity, fragmentManager, str, str2, str3, str4, str5, str6, str7, null, null, "0", str8, bool);
    }

    @xh.m
    public static final void I(@dl.d final AppCompatActivity activity, @dl.e final FragmentManager fragmentManager, @dl.e final String str, @dl.e final String str2, @dl.e final String str3, @dl.e final String str4, @dl.e final String str5, @dl.e final String str6, @dl.e final String str7, @dl.e final String str8, @dl.e final String str9, @dl.e final String str10, @dl.e final String str11, @dl.e final Boolean bool) {
        if (PatchProxy.proxy(new Object[]{activity, fragmentManager, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, bool}, null, changeQuickRedirect, true, 41389, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(activity, "activity");
        if (activity.isFinishing()) {
            return;
        }
        final String str12 = "purchase_dialog";
        if ((fragmentManager != null ? fragmentManager.s0("purchase_dialog") : null) != null) {
            return;
        }
        final LoadingDialog loadingDialog = new LoadingDialog(activity, "");
        final d2 d2VarF = kotlinx.coroutines.k.f(r0.a(e1.e()), e1.e(), null, new MallCartUtils$showPurchaseDialog$job$1(loadingDialog, null), 2, null);
        com.max.xiaoheihe.network.i.a().y8(str2, str7).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<UseBuyPurchaseDialogObj>>() { // from class: com.max.xiaoheihe.module.mall.cart.MallCartUtils$showPurchaseDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41407, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                d2.a.b(d2VarF, null, 1, null);
                if (loadingDialog.i()) {
                    loadingDialog.c();
                }
                if (activity.isFinishing()) {
                    return;
                }
                super.onError(e10);
            }

            public void onNext(@d Result<UseBuyPurchaseDialogObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41406, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                d2.a.b(d2VarF, null, 1, null);
                if (loadingDialog.i()) {
                    loadingDialog.c();
                }
                if (activity.isFinishing()) {
                    return;
                }
                super.onNext(result);
                k.f(r0.a(e1.e()), null, null, new MallCartUtils$showPurchaseDialog$1$onNext$1(fragmentManager, result, str, str2, str3, str7, str11, bool, str12, str4, str5, str6, str8, str9, str10, null), 3, null);
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41408, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<UseBuyPurchaseDialogObj>) obj);
            }
        });
    }

    private final void J(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41378, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new j(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.1f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new k(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(480L);
        animatorSet.setDuration(480L);
        animatorSet.setInterpolator(new com.max.hbcustomview.shinebuttonlib.a(0.4f));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.start();
    }

    private final void K(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41372, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
            com.max.xiaoheihe.accelworld.l.q(view, R.color.divider_secondary_1_color, 3.0f);
        } else {
            view.setVisibility(8);
            view.setOnClickListener(null);
        }
    }

    private final void L(Context context, kc0 kc0Var, MallProductActionObj mallProductActionObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, kc0Var, mallProductActionObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41374, new Class[]{Context.class, kc0.class, MallProductActionObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            kc0Var.f112552g.setVisibility(8);
            return;
        }
        TextView textView = kc0Var.f112552g;
        textView.setVisibility(0);
        textView.setGravity(8388627);
        String desc = mallProductActionObj.getDesc();
        textView.setText(desc == null || desc.length() == 0 ? mallProductActionObj.getCdkey() : mallProductActionObj.getDesc());
        textView.setTypeface(null, 1);
        textView.setTextColor(androidx.core.content.d.f(context, R.color.text_primary_1_color));
        textView.setTextSize(1, 12.0f);
        if (mallProductActionObj.getSend_to_pc() != null) {
            int id2 = kc0Var.f112552g.getId();
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.H(kc0Var.b());
            cVar.E(id2);
            cVar.L(id2, 6, 0, 6, ViewUtils.f(context, 22.0f));
            cVar.L(id2, 7, kc0Var.f112551f.getId(), 6, ViewUtils.f(context, 6.0f));
            cVar.K(id2, 3, kc0Var.f112557l.getId(), 3);
            cVar.K(id2, 4, kc0Var.f112557l.getId(), 4);
            cVar.Y(id2, true);
            cVar.r(kc0Var.b());
        }
    }

    private final void M(TextView textView, MallProductActionObj mallProductActionObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, mallProductActionObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41373, new Class[]{TextView.class, MallProductActionObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(mallProductActionObj.getDesc());
        }
    }

    private final void N(Context context, kc0 kc0Var, MallProductActionObj mallProductActionObj, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, kc0Var, mallProductActionObj, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41375, new Class[]{Context.class, kc0.class, MallProductActionObj.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            kc0Var.f112551f.setVisibility(8);
            return;
        }
        TextView textView = kc0Var.f112551f;
        textView.setVisibility(0);
        textView.setGravity(17);
        Drawable drawableI = androidx.core.content.d.i(context, R.drawable.common_copy_line_24x24);
        if (drawableI != null) {
            drawableI.setBounds(0, 0, ViewUtils.f(context, 10.0f), ViewUtils.f(context, 10.0f));
            androidx.core.graphics.drawable.d.n(drawableI, androidx.core.content.d.f(context, R.color.text_clickable_color));
            textView.setCompoundDrawables(drawableI, null, null, null);
        }
        textView.setOnClickListener(new l(mallProductActionObj, context, str));
        if (mallProductActionObj.getSend_to_pc() != null) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            int id2 = kc0Var.f112551f.getId();
            cVar.H(kc0Var.b());
            cVar.E(id2);
            cVar.L(id2, 7, kc0Var.f112556k.getId(), 6, ViewUtils.f(context, 10.0f));
            cVar.K(id2, 3, kc0Var.f112557l.getId(), 3);
            cVar.K(id2, 4, kc0Var.f112557l.getId(), 4);
            cVar.R(id2, ViewUtils.f(context, 34.0f));
            cVar.T(id2, ViewUtils.f(context, 34.0f));
            cVar.r(kc0Var.b());
        }
    }

    private final void O(MoreButton moreButton, MallProductActionObj mallProductActionObj, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{moreButton, mallProductActionObj, new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 41371, new Class[]{MoreButton.class, MallProductActionObj.class, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            moreButton.setVisibility(8);
            return;
        }
        moreButton.setVisibility(0);
        moreButton.setText(mallProductActionObj.getButton_desc());
        moreButton.setOnClickListener(new m(mallProductActionObj, moreButton, str));
    }

    private final void P(Context context, kc0 kc0Var, MallProductActionObj mallProductActionObj, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, kc0Var, mallProductActionObj, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41376, new Class[]{Context.class, kc0.class, MallProductActionObj.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            kc0Var.f112556k.setVisibility(8);
            kc0Var.f112554i.setVisibility(8);
            return;
        }
        kc0Var.f112556k.setVisibility(0);
        kc0Var.f112554i.setVisibility(0);
        MallProductActionObj.SendToPcObj send_to_pc = mallProductActionObj.getSend_to_pc();
        String desc = send_to_pc != null ? send_to_pc.getDesc() : null;
        if (desc != null && !com.max.hbcommon.utils.c.u(desc)) {
            kc0Var.f112554i.setText(desc);
        }
        kc0Var.f112554i.setOnClickListener(new n(mallProductActionObj, kc0Var));
    }

    private final void Q(ImageView imageView, MallProductActionObj mallProductActionObj, boolean z10) {
        if (!PatchProxy.proxy(new Object[]{imageView, mallProductActionObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41370, new Class[]{ImageView.class, MallProductActionObj.class, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            imageView.setVisibility(0);
            com.max.xiaoheihe.accelworld.l.k(imageView, mallProductActionObj.getIcon());
            String icon_color = mallProductActionObj.getIcon_color();
            if (icon_color == null || com.max.hbcommon.utils.c.u(icon_color)) {
                imageView.clearColorFilter();
            } else {
                imageView.setColorFilter(com.max.hbutils.utils.a.g(icon_color));
            }
        }
    }

    private final void R(TextView textView, MallProductActionObj mallProductActionObj, boolean z10) {
        if (!PatchProxy.proxy(new Object[]{textView, mallProductActionObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41369, new Class[]{TextView.class, MallProductActionObj.class, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            textView.setVisibility(0);
            textView.setText(mallProductActionObj.getName());
        }
    }

    public static final /* synthetic */ void c(MallCartUtils mallCartUtils, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallCartUtils, str, str2}, null, changeQuickRedirect, true, 41392, new Class[]{MallCartUtils.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartUtils.A(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    private final void r(kc0 kc0Var, Context context, MallProductActionObj mallProductActionObj, String str) {
        boolean z10;
        if (PatchProxy.proxy(new Object[]{kc0Var, context, mallProductActionObj, str}, this, changeQuickRedirect, false, 41368, new Class[]{kc0.class, Context.class, MallProductActionObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCartUtils mallCartUtils = f90196a;
        TextView tvTitle = kc0Var.f112555j;
        f0.o(tvTitle, "tvTitle");
        mallCartUtils.R(tvTitle, mallProductActionObj, true);
        ImageView ivIcon = kc0Var.f112548c;
        f0.o(ivIcon, "ivIcon");
        mallCartUtils.Q(ivIcon, mallProductActionObj, true);
        MoreButton mbAction = kc0Var.f112549d;
        f0.o(mbAction, "mbAction");
        String cdkey = mallProductActionObj.getCdkey();
        if (cdkey == null || cdkey.length() == 0) {
            z10 = false;
        } else {
            String button_desc = mallProductActionObj.getButton_desc();
            if (button_desc == null || button_desc.length() == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        mallCartUtils.O(mbAction, mallProductActionObj, z10, str);
        View viewCdkBg = kc0Var.f112557l;
        f0.o(viewCdkBg, "viewCdkBg");
        mallCartUtils.K(viewCdkBg, true);
        TextView tvDescOld = kc0Var.f112553h;
        f0.o(tvDescOld, "tvDescOld");
        mallCartUtils.M(tvDescOld, mallProductActionObj, false);
        mallCartUtils.L(context, kc0Var, mallProductActionObj, true);
        mallCartUtils.N(context, kc0Var, mallProductActionObj, str, true);
        mallCartUtils.P(context, kc0Var, mallProductActionObj, str, mallProductActionObj.getSend_to_pc() != null);
    }

    public static /* synthetic */ void w(MallCartUtils mallCartUtils, OrderEvent orderEvent, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{mallCartUtils, orderEvent, str, str2, str3, str4, str5, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 41385, new Class[]{MallCartUtils.class, OrderEvent.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartUtils.v(orderEvent, str, str2, str3, str4, str5, (i10 & 64) != 0 ? null : jsonObject);
    }

    public static /* synthetic */ void z(MallCartUtils mallCartUtils, OrderEvent orderEvent, String str, String str2, String str3, String str4, String str5, JsonObject jsonObject, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{mallCartUtils, orderEvent, str, str2, str3, str4, str5, jsonObject, new Integer(i10), obj}, null, changeQuickRedirect, true, 41383, new Class[]{MallCartUtils.class, OrderEvent.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartUtils.y(orderEvent, str, str2, str3, str4, str5, (i10 & 64) != 0 ? null : jsonObject);
    }

    public final void C(@dl.d OrderEvent type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        if (PatchProxy.proxy(new Object[]{type, str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 41381, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        B(type, str, str2, str3, str4, GameListHeaderObj.KEY_STORE, str5, null);
    }

    public final void D(int i10) {
        f90199d = i10;
    }

    public final void E(boolean z10, @dl.d vp itemBinding) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), itemBinding}, this, changeQuickRedirect, false, 41362, new Class[]{Boolean.TYPE, vp.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemBinding, "itemBinding");
        if (z10) {
            itemBinding.f116902h.b().setVisibility(0);
            itemBinding.f116907m.setAlpha(0.4f);
            itemBinding.f116912r.setAlpha(0.4f);
        } else {
            itemBinding.f116902h.b().setVisibility(8);
            itemBinding.f116907m.setAlpha(1.0f);
            itemBinding.f116912r.setAlpha(1.0f);
        }
    }

    public final void F(boolean z10, @dl.d vp itemBinding) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), itemBinding}, this, changeQuickRedirect, false, 41361, new Class[]{Boolean.TYPE, vp.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemBinding, "itemBinding");
        if (z10) {
            itemBinding.f116915u.setAlpha(1.0f);
        } else {
            itemBinding.f116915u.setAlpha(0.6f);
        }
    }

    public final void f(@dl.d io.reactivex.disposables.a compositeDisposable, @dl.d String sku_id, @dl.d String count, @dl.d String cat_value, @dl.e String str, @dl.d l0.h<CartDetailObj> callback) {
        if (PatchProxy.proxy(new Object[]{compositeDisposable, sku_id, count, cat_value, str, callback}, this, changeQuickRedirect, false, 41363, new Class[]{io.reactivex.disposables.a.class, String.class, String.class, String.class, String.class, l0.h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(compositeDisposable, "compositeDisposable");
        f0.p(sku_id, "sku_id");
        f0.p(count, "count");
        f0.p(cat_value, "cat_value");
        f0.p(callback, "callback");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f90200e > 300) {
            f90200e = jCurrentTimeMillis;
            compositeDisposable.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U2(sku_id, null, cat_value, str, null, count).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(callback)));
        }
    }

    public final void g(@dl.d io.reactivex.disposables.a compositeDisposable, @dl.d String sku_id, @dl.d String cat_value, @dl.e String str, @dl.d String cart_id, @dl.d l0.g callback) {
        if (PatchProxy.proxy(new Object[]{compositeDisposable, sku_id, cat_value, str, cart_id, callback}, this, changeQuickRedirect, false, 41364, new Class[]{io.reactivex.disposables.a.class, String.class, String.class, String.class, String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(compositeDisposable, "compositeDisposable");
        f0.p(sku_id, "sku_id");
        f0.p(cat_value, "cat_value");
        f0.p(cart_id, "cart_id");
        f0.p(callback, "callback");
        compositeDisposable.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U2(sku_id, null, cat_value, str, cart_id, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(callback)));
    }

    @dl.d
    public final View h(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 41357, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        qe qeVarC = qe.c(LayoutInflater.from(context));
        f0.o(qeVarC, "inflate(LayoutInflater.from(context))");
        ConstraintLayout constraintLayoutB = qeVarC.b();
        f0.o(constraintLayoutB, "containerView.getRoot()");
        m(context, constraintLayoutB, false);
        qeVarC.b().setOnClickListener(new d(context));
        ConstraintLayout constraintLayoutB2 = qeVarC.b();
        f0.o(constraintLayoutB2, "containerView.getRoot()");
        return constraintLayoutB2;
    }

    @dl.d
    public final View i(@dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 41356, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        String.valueOf(f90199d);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.mall_shopping_line_24x24);
        MsgView msgView = new MsgView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        imageView.setId(R.id.iv_icon);
        imageView.setPadding(ViewUtils.f(context, 5.0f), 0, ViewUtils.f(context, 10.0f), 0);
        relativeLayout.addView(imageView, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(context, 10.0f));
        layoutParams2.addRule(6, R.id.iv_icon);
        msgView.setIncludeFontPadding(false);
        msgView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        msgView.setTextSize(1, 9.0f);
        msgView.setGravity(17);
        msgView.setIsRadiusHalfHeight(true);
        msgView.setBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        msgView.setId(R.id.tv_count);
        relativeLayout.addView(msgView, layoutParams2);
        m(context, relativeLayout, true);
        relativeLayout.setOnClickListener(new e(context));
        return relativeLayout;
    }

    public final int j() {
        return f90199d;
    }

    public final void k(@dl.d Context mContext) {
        if (PatchProxy.proxy(new Object[]{mContext}, this, changeQuickRedirect, false, 41355, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        com.max.xiaoheihe.base.router.b.f(mContext, lb.d.f131172h2).A();
    }

    public final void l(@dl.d Context context, @dl.d CartItemObj data) {
        if (PatchProxy.proxy(new Object[]{context, data}, this, changeQuickRedirect, false, 41365, new Class[]{Context.class, CartItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        if (data.getProduct().getGame_info() == null) {
            context.startActivity(MallProductDetailActivity.n2(context, data.getProduct().getSku_id(), data.getH_src()));
            return;
        }
        MallGameInfoObj game_info = data.getProduct().getGame_info();
        String appid = game_info != null ? game_info.getAppid() : null;
        MallGameInfoObj game_info2 = data.getProduct().getGame_info();
        context.startActivity(z.b(context, data.getH_src(), appid, game_info2 != null ? game_info2.getGame_type() : null, null, i0.m(), i0.j(), null));
    }

    public final void m(@dl.e Context context, @dl.d View cartView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{context, cartView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41358, new Class[]{Context.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cartView, "cartView");
        int i10 = f90199d;
        TextView textView = (TextView) cartView.findViewById(R.id.tv_count);
        if (textView == null) {
            return;
        }
        int iF = z10 ? ViewUtils.f(context, 5.0f) + ViewUtils.f(context, 14.0f) : ViewUtils.f(context, 10.0f);
        bb.d.d(textView, 4);
        if (i10 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = ViewUtils.f(context, 10.0f);
        if (i10 < 100 && i10 < 10) {
            marginLayoutParams.width = ViewUtils.f(context, 10.0f);
            textView.setPadding(0, 0, 0, 0);
            marginLayoutParams.leftMargin = iF + ViewUtils.f(context, 2.0f);
        } else {
            marginLayoutParams.width = -2;
            textView.setPadding(ViewUtils.f(context, 2.5f), 0, ViewUtils.f(context, 2.5f), 0);
            marginLayoutParams.leftMargin = iF;
        }
        textView.setText(String.valueOf(f90199d));
    }

    public final void n(@dl.d Context context, @dl.d CartItemObj data, @dl.d vp itemBinding, int i10, @dl.d yh.l<? super String, b2> onItemDeleted) {
        if (PatchProxy.proxy(new Object[]{context, data, itemBinding, new Integer(i10), onItemDeleted}, this, changeQuickRedirect, false, 41359, new Class[]{Context.class, CartItemObj.class, vp.class, Integer.TYPE, yh.l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        f0.p(itemBinding, "itemBinding");
        f0.p(onItemDeleted, "onItemDeleted");
        if (com.max.hbcommon.utils.c.A(data.getProduct().getShow_default_background_img())) {
            itemBinding.f116899e.setVisibility(0);
            com.max.hbimage.b.d0(data.getProduct().getHead_image(), itemBinding.f116899e, ViewUtils.f(context, 1.0f));
            itemBinding.f116900f.setImageResource(R.drawable.sku_background_empty);
        } else {
            com.max.hbimage.b.K(data.getProduct().getHead_image(), itemBinding.f116900f);
            itemBinding.f116899e.setVisibility(8);
        }
        itemBinding.f116907m.setText(data.getProduct().getName());
        if (ViewUtils.S(itemBinding.f116907m.getPaint(), data.getProduct().getName()) > (ViewUtils.L(context) - ViewUtils.f(context, 118.0f)) - ViewUtils.f(context, 24.0f)) {
            itemBinding.f116907m.setHeight(ViewUtils.f(context, 44.0f));
        } else {
            itemBinding.f116907m.setHeight(ViewUtils.f(context, 22.0f));
        }
        itemBinding.f116907m.setText(data.getProduct().getName());
        if (data.getContent() != null) {
            TextView textView = itemBinding.f116904j;
            List<String> content = data.getContent();
            f0.m(content);
            textView.setText(content.get(0));
            TextView textView2 = itemBinding.f116905k;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(';');
            List<String> content2 = data.getContent();
            f0.m(content2);
            sb2.append(content2.get(1));
            textView2.setText(sb2.toString());
        }
        if (data.getProduct().isBundle()) {
            itemBinding.f116898d.setVisibility(8);
        } else {
            itemBinding.f116898d.setVisibility(0);
        }
        itemBinding.f116916v.setPrice(r1.I(data.getProduct().getPrice().getFinal_price()));
        List<String> tags = data.getTags();
        if (tags == null || tags.isEmpty()) {
            itemBinding.f116903i.setVisibility(8);
        } else {
            itemBinding.f116903i.setVisibility(0);
            itemBinding.f116903i.removeAllViews();
            ArrayList arrayList = new ArrayList();
            List<String> tags2 = data.getTags();
            f0.m(tags2);
            Iterator<String> it = tags2.iterator();
            while (it.hasNext()) {
                arrayList.add(new CassetteTagObj(it.next(), "#F67010"));
            }
            CardViewGenerator cardViewGeneratorA = CardViewGenerator.f67433b.a();
            LinearLayout linearLayout = itemBinding.f116903i;
            f0.o(linearLayout, "itemBinding.llTags");
            cardViewGeneratorA.c(linearLayout, new CardParam.a(context).j(arrayList).l(true).k(CardParam.DISPLAY_MODE.LIMIT).p(1).m(6).c());
        }
        String price_delta_desc = data.getPrice_delta_desc();
        if (price_delta_desc == null || price_delta_desc.length() == 0) {
            itemBinding.f116909o.setVisibility(8);
        } else {
            itemBinding.f116909o.setVisibility(0);
            itemBinding.f116909o.setText(data.getPrice_delta_desc());
        }
        if (i10 == 1) {
            itemBinding.f116913s.setVisibility(8);
            itemBinding.f116914t.setVisibility(0);
        } else if (i10 == 2) {
            itemBinding.f116913s.setVisibility(0);
            itemBinding.f116914t.setVisibility(8);
        }
        String sale_state_desc = data.getSale_state_desc();
        if (sale_state_desc == null || sale_state_desc.length() == 0) {
            itemBinding.f116908n.setVisibility(8);
        } else {
            itemBinding.f116908n.setVisibility(0);
            itemBinding.f116908n.setBackgroundDrawable(q.C(context, R.color.text_primary_1_color_alpha30, 4.0f));
            itemBinding.f116908n.setText(data.getSale_state_desc());
        }
        p(data, itemBinding);
        String state = data.getState();
        if (f0.g(state, "-1")) {
            F(false, itemBinding);
            E(false, itemBinding);
        } else if (f0.g(state, "0")) {
            F(true, itemBinding);
            E(true, itemBinding);
        } else {
            F(true, itemBinding);
            E(false, itemBinding);
        }
        itemBinding.b().setOnTouchListener(f.f90207b);
        itemBinding.b().setOnLongClickListener(new g(context, onItemDeleted, data));
    }

    public final void o(@dl.d Context context, @dl.d yp itemBinding, @dl.d CartItemObj data) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{context, itemBinding, data}, this, changeQuickRedirect, false, 41366, new Class[]{Context.class, yp.class, CartItemObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(itemBinding, "itemBinding");
        f0.p(data, "data");
        String string = null;
        if (data.getContent() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("数量×");
            sb2.append(data.getCount());
            sb2.append(" ; ");
            List<String> content = data.getContent();
            f0.m(content);
            sb2.append(CollectionsKt___CollectionsKt.h3(content, " ; ", null, null, 0, null, null, 62, null));
            string = sb2.toString();
        }
        itemBinding.b().setMinHeight(ViewUtils.f(context, 108.0f));
        itemBinding.b().getLayoutParams().height = -2;
        if (com.max.hbcommon.utils.c.A(data.getProduct().getShow_default_background_img())) {
            itemBinding.f118012b.setVisibility(0);
            com.max.hbimage.b.d0(data.getProduct().getHead_image(), itemBinding.f118012b, ViewUtils.f(context, 1.0f));
            itemBinding.f118013c.setImageResource(R.drawable.sku_background_empty);
        } else {
            com.max.hbimage.b.K(data.getProduct().getHead_image(), itemBinding.f118013c);
            itemBinding.f118012b.setVisibility(8);
        }
        if (com.max.hbcommon.utils.c.u(data.getProduct().getSupport_platform_waring())) {
            itemBinding.f118017g.setVisibility(8);
        } else {
            itemBinding.f118017g.setText(data.getProduct().getSupport_platform_waring());
            itemBinding.f118017g.setVisibility(0);
        }
        itemBinding.f118015e.setText(data.getProduct().getName());
        if (data.getContent() != null) {
            itemBinding.f118014d.setText(string);
        }
        itemBinding.f118019i.setPrice(r1.I(data.getProduct().getPrice().getFinal_price()));
        String sale_state_desc = data.getSale_state_desc();
        if (sale_state_desc != null && sale_state_desc.length() != 0) {
            z10 = false;
        }
        if (z10) {
            itemBinding.f118016f.setVisibility(8);
        } else {
            itemBinding.f118016f.setVisibility(0);
            itemBinding.f118016f.setBackgroundDrawable(q.C(context, R.color.text_primary_1_color_alpha30, 4.0f));
            itemBinding.f118016f.setText(data.getSale_state_desc());
        }
        itemBinding.b().setOnClickListener(new h(context, data));
    }

    public final void p(@dl.d CartItemObj data, @dl.d vp itemBinding) {
        if (PatchProxy.proxy(new Object[]{data, itemBinding}, this, changeQuickRedirect, false, 41360, new Class[]{CartItemObj.class, vp.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        f0.p(itemBinding, "itemBinding");
        itemBinding.f116906l.setText(String.valueOf(data.getCount()));
        Integer count = data.getCount();
        if (count != null && count.intValue() == 1) {
            itemBinding.f116901g.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        } else {
            itemBinding.f116901g.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        }
        if (f0.g(data.getMaximum(), data.getCount())) {
            itemBinding.f116896b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        } else {
            itemBinding.f116896b.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d2  */
    public final void q(@dl.d Context mContext, @dl.d final kc0 itemBinding, @dl.d final MallProductActionObj data, @dl.e String str, @dl.e String str2, @dl.e String str3) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{mContext, itemBinding, data, str, str2, str3}, this, changeQuickRedirect, false, 41367, new Class[]{Context.class, kc0.class, MallProductActionObj.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mContext, "mContext");
        f0.p(itemBinding, "itemBinding");
        f0.p(data, "data");
        boolean z11 = com.max.hbcommon.utils.c.u(data.getCdkey()) && com.max.hbcommon.utils.c.u(data.getDesc());
        yh.a<ImageView> aVar = new yh.a<ImageView>() { // from class: com.max.xiaoheihe.module.mall.cart.MallCartUtils$refreshOrderActionItem$setIcon$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @d
            public final ImageView a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41404, new Class[0], ImageView.class);
                if (patchProxyResultProxy.isSupported) {
                    return (ImageView) patchProxyResultProxy.result;
                }
                ImageView imageView = itemBinding.f112548c;
                MallProductActionObj mallProductActionObj = data;
                imageView.setVisibility(0);
                l.k(imageView, mallProductActionObj.getIcon());
                if (c.u(mallProductActionObj.getIcon_color())) {
                    imageView.clearColorFilter();
                } else {
                    String icon_color = mallProductActionObj.getIcon_color();
                    f0.m(icon_color);
                    imageView.setColorFilter(a.g(icon_color));
                }
                return imageView;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.ImageView, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ImageView invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41405, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        if (z11) {
            View view = itemBinding.f112557l;
            view.setVisibility(8);
            view.setOnClickListener(null);
            TextView textView = itemBinding.f112551f;
            textView.setVisibility(8);
            textView.setOnClickListener(null);
            TextView textView2 = itemBinding.f112552g;
            textView2.setVisibility(8);
            textView2.setOnClickListener(null);
            itemBinding.f112553h.setVisibility(8);
            aVar.invoke();
            TextView textView3 = itemBinding.f112555j;
            textView3.setVisibility(0);
            textView3.setText(data.getName());
            MoreButton moreButton = itemBinding.f112549d;
            String cdkey = data.getCdkey();
            if (cdkey == null || cdkey.length() == 0) {
                moreButton.setVisibility(8);
            } else {
                String button_desc = data.getButton_desc();
                if (button_desc != null && button_desc.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    moreButton.setVisibility(8);
                } else {
                    moreButton.setVisibility(0);
                    moreButton.setText(data.getButton_desc());
                }
            }
            itemBinding.b().setOnClickListener(null);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(data.getCdkey())) {
            r(itemBinding, mContext, data, str3);
            return;
        }
        TextView textView4 = itemBinding.f112551f;
        textView4.setVisibility(8);
        textView4.setOnClickListener(null);
        TextView textView5 = itemBinding.f112552g;
        textView5.setVisibility(8);
        textView5.setOnClickListener(null);
        View view2 = itemBinding.f112557l;
        view2.setVisibility(8);
        view2.setOnClickListener(null);
        TextView textView6 = itemBinding.f112553h;
        textView6.setVisibility(0);
        textView6.setText(data.getDesc());
        TextView textView7 = itemBinding.f112555j;
        textView7.setVisibility(0);
        textView7.setText(data.getName());
        aVar.invoke();
        MoreButton moreButton2 = itemBinding.f112549d;
        String button_desc2 = data.getButton_desc();
        if (button_desc2 != null && button_desc2.length() != 0) {
            z10 = false;
        }
        if (z10) {
            moreButton2.setVisibility(8);
        } else {
            moreButton2.setVisibility(0);
            moreButton2.setText(data.getButton_desc());
        }
        itemBinding.b().setOnClickListener(new i(data, mContext, str3));
    }

    public final void s(@dl.e View view, @dl.e MallOrderNotifyObj mallOrderNotifyObj) {
        if (PatchProxy.proxy(new Object[]{view, mallOrderNotifyObj}, this, changeQuickRedirect, false, 41379, new Class[]{View.class, MallOrderNotifyObj.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (mallOrderNotifyObj == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.tv_message);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_message_icon);
        textView.setText(mallOrderNotifyObj.getMessage());
        textView.setTextColor(com.max.hbcommon.utils.l.g(mallOrderNotifyObj.getText_color()));
        view.setBackgroundColor(com.max.hbcommon.utils.l.g(mallOrderNotifyObj.getBackground()));
        imageView.setColorFilter(com.max.hbcommon.utils.l.g(mallOrderNotifyObj.getText_color()));
        com.max.hbimage.b.K(mallOrderNotifyObj.getIcon(), imageView);
    }

    public final void t(@dl.e View view, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{view, str}, this, changeQuickRedirect, false, 41380, new Class[]{View.class, String.class}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (str == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            ((TextView) view.findViewById(R.id.tv_message)).setText(str);
        }
    }

    @xh.i
    public final void u(@dl.d OrderEvent type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        if (PatchProxy.proxy(new Object[]{type, str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 41391, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        w(this, type, str, str2, str3, str4, str5, null, 64, null);
    }

    @xh.i
    public final void v(@dl.d OrderEvent type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{type, str, str2, str3, str4, str5, jsonObject}, this, changeQuickRedirect, false, 41384, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        B(type, str, str2, str3, str4, "cart", str5, jsonObject);
    }

    @xh.i
    public final void x(@dl.d OrderEvent type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        if (PatchProxy.proxy(new Object[]{type, str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 41390, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        z(this, type, str, str2, str3, str4, str5, null, 64, null);
    }

    @xh.i
    public final void y(@dl.d OrderEvent type, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{type, str, str2, str3, str4, str5, jsonObject}, this, changeQuickRedirect, false, 41382, new Class[]{OrderEvent.class, String.class, String.class, String.class, String.class, String.class, JsonObject.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        B(type, str, str2, str3, str4, "mall", str5, jsonObject);
    }
}
