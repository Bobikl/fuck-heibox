package com.max.xiaoheihe.module.mall.newcomer;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.accelworld.AccelWorldABTestKt;
import com.max.accelworld.i;
import com.max.accelworld.j;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottomsheet.q;
import com.max.hbcommon.component.bottomsheet.t;
import com.max.hbcommon.utils.l;
import com.max.hbcustomview.GradientTextView;
import com.max.hblayout.hbgame.GameSingleCardFrameLayout;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.h1;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.recommend.NewcomerCouponReceiveResult;
import com.max.xiaoheihe.bean.mall.NewcomerCouponObj;
import com.max.xiaoheihe.bean.mall.NewcomerGameObj;
import com.max.xiaoheihe.bean.mall.NewcomerNofityV2Obj;
import com.max.xiaoheihe.bean.mall.NewcomerNotifyObj;
import com.max.xiaoheihe.module.game.adapter.v;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.bw;
import dl.d;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NewcomerManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class NewcomerManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final NewcomerManager f90882a = new NewcomerManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f90883b = "2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f90884c = "3";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f90885d = "NewcomerManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90886e = 0;

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<NewcomerNotifyObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90887b;

        a(BaseActivity baseActivity) {
            this.f90887b = baseActivity;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 42085, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<NewcomerNotifyObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42086, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            NewcomerNotifyObj result2 = result.getResult();
            if (result2 != null) {
                BaseActivity baseActivity = this.f90887b;
                if (com.max.hbcommon.utils.c.x(result2.getNotify())) {
                    if (!f0.g(result2.getLocation(), "2")) {
                        if (f0.g(result2.getLocation(), "3")) {
                            NewcomerManager.d(NewcomerManager.f90882a, result2);
                        }
                    } else if (com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.LOW.getValue())) {
                        NewcomerManager.e(NewcomerManager.f90882a, baseActivity, result2);
                    } else {
                        NewcomerManager.d(NewcomerManager.f90882a, result2);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42087, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<NewcomerNotifyObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<NewcomerCouponReceiveResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f90888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90889c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f90890d;

        b(q qVar, String str, Context context) {
            this.f90888b = qVar;
            this.f90889c = str;
            this.f90890d = context;
        }

        public void onNext(@dl.d Result<NewcomerCouponReceiveResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 42088, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            this.f90888b.dismiss();
            if (!com.max.hbcommon.utils.c.u(this.f90889c)) {
                com.max.xiaoheihe.base.router.b.k0(this.f90890d, this.f90889c);
            }
            Intent intent = new Intent();
            intent.setAction("com.max.xiaoheihe.game.gotop");
            this.f90890d.sendBroadcast(intent);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 42089, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<NewcomerCouponReceiveResult>) obj);
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class c implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NewcomerNotifyObj f90892c;

        c(BaseActivity baseActivity, NewcomerNotifyObj newcomerNotifyObj) {
            this.f90891b = baseActivity;
            this.f90892c = newcomerNotifyObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 42096, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f90891b, this.f90892c.getProtocol());
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class d implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f90893a = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 42097, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            NewcomerManager.a(NewcomerManager.f90882a);
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class e implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f90894b;

        e(boolean z10) {
            this.f90894b = z10;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (!PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 42098, new Class[]{DialogInterface.class}, Void.TYPE).isSupported && this.f90894b) {
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
            }
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class f implements t {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f90895a;

        f(boolean z10) {
            this.f90895a = z10;
        }

        @Override // com.max.hbcommon.component.bottomsheet.t
        public void onDismiss() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42099, new Class[0], Void.TYPE).isSupported && this.f90895a) {
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.LOW.getValue());
            }
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f90897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ NewcomerNofityV2Obj f90898d;

        g(BaseActivity baseActivity, q qVar, NewcomerNofityV2Obj newcomerNofityV2Obj) {
            this.f90896b = baseActivity;
            this.f90897c = qVar;
            this.f90898d = newcomerNofityV2Obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 42100, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            NewcomerManager.c(NewcomerManager.f90882a, this.f90896b, this.f90897c, this.f90898d.getProt());
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class h extends h1 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90899f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f90900g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Ref.ObjectRef<Activity> objectRef, Ref.ObjectRef<ArrayList<MallCouponObj>> objectRef2, BaseActivity baseActivity, int i10) {
            super(objectRef.f124891b, objectRef2.f124891b);
            this.f90899f = baseActivity;
            this.f90900g = i10;
        }

        @Override // com.max.hbwallet.h1, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MallCouponObj mallCouponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponObj}, this, changeQuickRedirect, false, 42102, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            w(eVar, mallCouponObj);
        }

        @Override // com.max.hbwallet.h1
        public void w(@dl.d s.e viewHolder, @dl.d MallCouponObj coupon) {
            if (PatchProxy.proxy(new Object[]{viewHolder, coupon}, this, changeQuickRedirect, false, 42101, new Class[]{s.e.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(coupon, "coupon");
            coupon.setState_desc("领取");
            super.w(viewHolder, coupon);
            GradientTextView gradientTextView = (GradientTextView) viewHolder.i(R.id.tv_action);
            ImageView imageView = (ImageView) viewHolder.i(R.id.v_coupon_line);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_bg);
            TextView textView = (TextView) viewHolder.i(R.id.tv_name);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_time);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_desc);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_price);
            TextView textView5 = (TextView) viewHolder.i(R.id.tv_discount);
            ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_substract_top);
            ImageView imageView4 = (ImageView) viewHolder.i(R.id.iv_substract_bottom);
            TextView textView6 = (TextView) viewHolder.i(R.id.tv_unit);
            gradientTextView.setBackground(com.max.hbutils.utils.q.o(this.f90899f, R.color.white, 3.0f));
            gradientTextView.setColors(l.a(R.color.store_gradient_free_lottery_start_color), l.a(R.color.store_gradient_free_lottery_end_color));
            gradientTextView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            imageView2.setBackground(ViewUtils.x(0, l.a(R.color.store_gradient_free_lottery_start_color), l.a(R.color.store_gradient_free_lottery_end_color)));
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            if (textView2.getVisibility() == 8) {
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(this.f90899f, 6.0f);
            }
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView5.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView6.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
            imageView3.setColorFilter(com.max.xiaoheihe.utils.d.E(this.f90900g));
            imageView4.setColorFilter(com.max.xiaoheihe.utils.d.E(this.f90900g));
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class i implements h1.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f90902b;

        i(BaseActivity baseActivity, q qVar) {
            this.f90901a = baseActivity;
            this.f90902b = qVar;
        }

        @Override // com.max.hbwallet.h1.a
        public void a(@dl.e View view, @dl.d MallCouponObj coupon) {
            if (PatchProxy.proxy(new Object[]{view, coupon}, this, changeQuickRedirect, false, 42103, new Class[]{View.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(coupon, "coupon");
            NewcomerManager.c(NewcomerManager.f90882a, this.f90901a, this.f90902b, coupon.getProtocol());
        }
    }

    /* JADX INFO: compiled from: NewcomerManager.kt */
    public static final class j extends s<GameObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f90903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(BaseActivity baseActivity, ArrayList<GameObj> arrayList) {
            super(baseActivity, arrayList, R.layout.item_recommend_newcomer_card_game);
            this.f90903b = baseActivity;
        }

        public void m(@dl.d s.e viewHolder, @dl.d GameObj game) {
            if (PatchProxy.proxy(new Object[]{viewHolder, game}, this, changeQuickRedirect, false, 42104, new Class[]{s.e.class, GameObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(game, "game");
            com.max.xiaoheihe.module.game.adapter.recommend.binder.l.f86174i.b(this.f90903b, viewHolder, game);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameObj gameObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameObj}, this, changeQuickRedirect, false, 42105, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, gameObj);
        }
    }

    private NewcomerManager() {
    }

    public static final /* synthetic */ void a(NewcomerManager newcomerManager) {
        if (PatchProxy.proxy(new Object[]{newcomerManager}, null, changeQuickRedirect, true, 42082, new Class[]{NewcomerManager.class}, Void.TYPE).isSupported) {
            return;
        }
        newcomerManager.g();
    }

    public static final /* synthetic */ GameObj b(NewcomerManager newcomerManager, NewcomerNofityV2Obj newcomerNofityV2Obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerManager, newcomerNofityV2Obj}, null, changeQuickRedirect, true, 42084, new Class[]{NewcomerManager.class, NewcomerNofityV2Obj.class}, GameObj.class);
        return patchProxyResultProxy.isSupported ? (GameObj) patchProxyResultProxy.result : newcomerManager.i(newcomerNofityV2Obj);
    }

    public static final /* synthetic */ void c(NewcomerManager newcomerManager, Context context, q qVar, String str) {
        if (PatchProxy.proxy(new Object[]{newcomerManager, context, qVar, str}, null, changeQuickRedirect, true, 42083, new Class[]{NewcomerManager.class, Context.class, q.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        newcomerManager.l(context, qVar, str);
    }

    public static final /* synthetic */ void d(NewcomerManager newcomerManager, NewcomerNotifyObj newcomerNotifyObj) {
        if (PatchProxy.proxy(new Object[]{newcomerManager, newcomerNotifyObj}, null, changeQuickRedirect, true, 42081, new Class[]{NewcomerManager.class, NewcomerNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        newcomerManager.m(newcomerNotifyObj);
    }

    public static final /* synthetic */ void e(NewcomerManager newcomerManager, BaseActivity baseActivity, NewcomerNotifyObj newcomerNotifyObj) {
        if (PatchProxy.proxy(new Object[]{newcomerManager, baseActivity, newcomerNotifyObj}, null, changeQuickRedirect, true, 42080, new Class[]{NewcomerManager.class, BaseActivity.class, NewcomerNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        newcomerManager.q(baseActivity, newcomerNotifyObj);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42070, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.C(com.max.hbcache.c.K0, "");
    }

    private final GameObj i(NewcomerNofityV2Obj newcomerNofityV2Obj) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerNofityV2Obj}, this, changeQuickRedirect, false, 42075, new Class[]{NewcomerNofityV2Obj.class}, GameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameObj) patchProxyResultProxy.result;
        }
        ArrayList<GameObj> game = newcomerNofityV2Obj.getGame();
        if (game != null && !game.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return game.get(0);
    }

    private final void j(bw bwVar) {
        if (PatchProxy.proxy(new Object[]{bwVar}, this, changeQuickRedirect, false, 42077, new Class[]{bw.class}, Void.TYPE).isSupported) {
            return;
        }
        bwVar.f109051c.setVisibility(8);
        bwVar.f109053e.setVisibility(8);
        bwVar.b().setVisibility(8);
    }

    private final boolean k(NewcomerNofityV2Obj newcomerNofityV2Obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newcomerNofityV2Obj}, this, changeQuickRedirect, false, 42074, new Class[]{NewcomerNofityV2Obj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList<GameObj> game = newcomerNofityV2Obj.getGame();
        return game != null && game.size() == 1;
    }

    private final void l(Context context, q qVar, String str) {
        if (PatchProxy.proxy(new Object[]{context, qVar, str}, this, changeQuickRedirect, false, 42079, new Class[]{Context.class, q.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().h6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new b(qVar, str, context));
    }

    private final void m(NewcomerNotifyObj newcomerNotifyObj) {
        if (PatchProxy.proxy(new Object[]{newcomerNotifyObj}, this, changeQuickRedirect, false, 42065, new Class[]{NewcomerNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b(f90885d, "saveNewcomerNotifyInfo");
        com.max.hbcache.c.C(com.max.hbcache.c.K0, k.p(newcomerNotifyObj));
    }

    private final void n(Context context, bw bwVar, NewcomerNofityV2Obj newcomerNofityV2Obj) {
        if (PatchProxy.proxy(new Object[]{context, bwVar, newcomerNofityV2Obj}, this, changeQuickRedirect, false, 42073, new Class[]{Context.class, bw.class, NewcomerNofityV2Obj.class}, Void.TYPE).isSupported) {
            return;
        }
        o(context, bwVar, newcomerNofityV2Obj);
    }

    private final void o(Context context, bw bwVar, NewcomerNofityV2Obj newcomerNofityV2Obj) {
        if (PatchProxy.proxy(new Object[]{context, bwVar, newcomerNofityV2Obj}, this, changeQuickRedirect, false, 42076, new Class[]{Context.class, bw.class, NewcomerNofityV2Obj.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<GameObj> game = newcomerNofityV2Obj.getGame();
        if (game == null || game.isEmpty()) {
            j(bwVar);
        } else {
            p(context, bwVar, newcomerNofityV2Obj);
        }
    }

    private final void p(final Context context, final bw bwVar, final NewcomerNofityV2Obj newcomerNofityV2Obj) {
        if (PatchProxy.proxy(new Object[]{context, bwVar, newcomerNofityV2Obj}, this, changeQuickRedirect, false, 42078, new Class[]{Context.class, bw.class, NewcomerNofityV2Obj.class}, Void.TYPE).isSupported) {
            return;
        }
        AccelWorldABTestKt.a(f90882a.k(newcomerNofityV2Obj), new yh.l<com.max.accelworld.i, b2>() { // from class: com.max.xiaoheihe.module.mall.newcomer.NewcomerManager$showGameCard$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d i DoABTest) {
                if (PatchProxy.proxy(new Object[]{DoABTest}, this, changeQuickRedirect, false, 42090, new Class[]{i.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(DoABTest, "$this$DoABTest");
                final bw bwVar2 = bwVar;
                final Context context2 = context;
                final bw bwVar3 = bwVar;
                final NewcomerNofityV2Obj newcomerNofityV2Obj2 = newcomerNofityV2Obj;
                DoABTest.c(new yh.l<j, b2>() { // from class: com.max.xiaoheihe.module.mall.newcomer.NewcomerManager$showGameCard$1$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@d j TrueDoA) {
                        if (PatchProxy.proxy(new Object[]{TrueDoA}, this, changeQuickRedirect, false, 42092, new Class[]{j.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(TrueDoA, "$this$TrueDoA");
                        GameSingleCardFrameLayout flSingleGameContainer = bwVar2.f109051c;
                        f0.o(flSingleGameContainer, "flSingleGameContainer");
                        TrueDoA.d(flSingleGameContainer);
                        RecyclerView rvGames = bwVar2.f109053e;
                        f0.o(rvGames, "rvGames");
                        TrueDoA.a(rvGames);
                        com.max.xiaoheihe.module.game.adapter.recommend.binder.l.a aVar = com.max.xiaoheihe.module.game.adapter.recommend.binder.l.f86174i;
                        Context context3 = context2;
                        GameSingleCardFrameLayout gameSingleCardFrameLayout = bwVar3.f109051c;
                        f0.o(gameSingleCardFrameLayout, "cardBinding.flSingleGameContainer");
                        aVar.c(context3, gameSingleCardFrameLayout, NewcomerManager.b(NewcomerManager.f90882a, newcomerNofityV2Obj2));
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(j jVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42093, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(jVar);
                        return b2.f124493a;
                    }
                });
                final bw bwVar4 = bwVar;
                DoABTest.a(new yh.l<j, b2>() { // from class: com.max.xiaoheihe.module.mall.newcomer.NewcomerManager$showGameCard$1$1.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(1);
                    }

                    public final void a(@d j FalseDoB) {
                        if (PatchProxy.proxy(new Object[]{FalseDoB}, this, changeQuickRedirect, false, 42094, new Class[]{j.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(FalseDoB, "$this$FalseDoB");
                        RecyclerView rvGames = bwVar4.f109053e;
                        f0.o(rvGames, "rvGames");
                        FalseDoB.d(rvGames);
                        GameSingleCardFrameLayout flSingleGameContainer = bwVar4.f109051c;
                        f0.o(flSingleGameContainer, "flSingleGameContainer");
                        FalseDoB.a(flSingleGameContainer);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(j jVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 42095, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        a(jVar);
                        return b2.f124493a;
                    }
                });
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(i iVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, 42091, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(iVar);
                return b2.f124493a;
            }
        });
    }

    private final void q(BaseActivity baseActivity, NewcomerNotifyObj newcomerNotifyObj) {
        if (PatchProxy.proxy(new Object[]{baseActivity, newcomerNotifyObj}, this, changeQuickRedirect, false, 42067, new Class[]{BaseActivity.class, NewcomerNotifyObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (newcomerNotifyObj.getNotify_v2() == null) {
            s(this, baseActivity, newcomerNotifyObj, false, 4, null);
            return;
        }
        NewcomerNofityV2Obj notify_v2 = newcomerNotifyObj.getNotify_v2();
        f0.m(notify_v2);
        u(this, baseActivity, notify_v2, false, 4, null);
    }

    private final void r(BaseActivity baseActivity, NewcomerNotifyObj newcomerNotifyObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{baseActivity, newcomerNotifyObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42068, new Class[]{BaseActivity.class, NewcomerNotifyObj.class, Boolean.TYPE}, Void.TYPE).isSupported || baseActivity.isFinishing()) {
            return;
        }
        if (!z10 || com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.LOW.getValue())) {
            com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(baseActivity);
            int iL = ViewUtils.L(baseActivity) - ViewUtils.f(baseActivity, 60.0f);
            fVar.a(new ib.a(iL, (iL * 200) / 315, 0, newcomerNotifyObj.getBackground(), 4, null));
            fVar.a(new ib.b(20.0f));
            if (newcomerNotifyObj.getGame() != null) {
                NewcomerGameObj game = newcomerNotifyObj.getGame();
                f0.m(game);
                fVar.a(new com.max.xiaoheihe.module.mall.newcomer.b(game));
            } else {
                NewcomerCouponObj coupon = newcomerNotifyObj.getCoupon();
                f0.m(coupon);
                fVar.a(new com.max.xiaoheihe.module.mall.newcomer.a(coupon));
            }
            fVar.a(new ib.b(20.0f));
            fVar.u("点此查收", new c(baseActivity, newcomerNotifyObj));
            com.max.hbcommon.view.a aVarD = fVar.d();
            aVarD.setOnShowListener(d.f90893a);
            aVarD.setOnDismissListener(new e(z10));
            if (z10) {
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.LOW.getValue());
            }
            aVarD.show();
            aVarD.h().setBackground(com.max.hbutils.utils.q.o(baseActivity, R.color.interactive_color, 4.0f));
        }
    }

    static /* synthetic */ void s(NewcomerManager newcomerManager, BaseActivity baseActivity, NewcomerNotifyObj newcomerNotifyObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{newcomerManager, baseActivity, newcomerNotifyObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 42069, new Class[]{NewcomerManager.class, BaseActivity.class, NewcomerNotifyObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        newcomerManager.r(baseActivity, newcomerNotifyObj, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.app.Activity] */
    private final void t(BaseActivity baseActivity, NewcomerNofityV2Obj newcomerNofityV2Obj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{baseActivity, newcomerNofityV2Obj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 42071, new Class[]{BaseActivity.class, NewcomerNofityV2Obj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? E = HeyBoxApplication.C().E();
        objectRef.f124891b = E;
        if (E == 0 || E.isFinishing() || !(objectRef.f124891b instanceof FragmentActivity)) {
            return;
        }
        if (!z10 || com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.LOW.getValue())) {
            com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
            View viewInflate = LayoutInflater.from((Context) objectRef.f124891b).inflate(R.layout.layout_newcomer_coupon_v2_dialog, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv);
            ((TextView) viewInflate.findViewById(R.id.tv_title)).setText(newcomerNofityV2Obj.getTitle());
            ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.cv_card);
            viewInflate.setBackground(com.max.hbutils.utils.q.E(baseActivity, R.color.dialog_background_color, 12.0f));
            bw bwVarA = bw.a(viewGroup);
            f0.o(bwVarA, "bind(cv_card)");
            com.max.xiaoheihe.module.game.adapter.recommend.binder.l.f86174i.a(baseActivity, bwVarA);
            bwVarA.f109059k.setVisibility(8);
            bwVarA.f109052d.setVisibility(8);
            bwVarA.f109054f.setVisibility(0);
            bwVarA.f109054f.setText(newcomerNofityV2Obj.getSub_title());
            bwVarA.f109053e.setLayoutManager(new LinearLayoutManager(baseActivity, 0, false));
            bwVarA.f109053e.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(baseActivity, 6.0f), ViewUtils.f(baseActivity, 12.0f), ViewUtils.f(baseActivity, 12.0f)));
            bwVarA.f109053e.setAdapter(new j(baseActivity, newcomerNofityV2Obj.getGame()));
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) viewInflate.findViewById(R.id.btn_action);
            bottomButtonLeftItemView.setBackgroundResource(R.color.divider_secondary_2_color);
            recyclerView.setLayoutManager(new LinearLayoutManager((Context) objectRef.f124891b));
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.f124891b = new ArrayList();
            if (!com.max.hbcommon.utils.c.w(newcomerNofityV2Obj.getCoupons())) {
                ArrayList arrayList = (ArrayList) objectRef2.f124891b;
                ArrayList<MallCouponObj> coupons = newcomerNofityV2Obj.getCoupons();
                f0.m(coupons);
                arrayList.add(coupons.get(0));
            }
            aVar.h(R.drawable.bottom_sheets_key_discount_red_28x28).n(R.drawable.bottom_sheets_broken_coupon2_80x80).k(false).x(true).r(viewInflate);
            q qVarA = aVar.a();
            g();
            qVarA.y4(new f(z10));
            if (z10) {
                com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.LOW.getValue());
            }
            bottomButtonLeftItemView.setOnClickListener(new g(baseActivity, qVarA, newcomerNofityV2Obj));
            h hVar = new h(objectRef, objectRef2, baseActivity, R.color.divider_secondary_2_color);
            hVar.B(new i(baseActivity, qVarA));
            recyclerView.setAdapter(hVar);
            qVarA.M3(((FragmentActivity) objectRef.f124891b).getSupportFragmentManager(), "stack_coupon_bottom_dialog");
            RecyclerView recyclerView2 = bwVarA.f109053e;
            f0.o(recyclerView2, "cardBinding.rvGames");
            new v(qVarA, recyclerView2, false, null, 8, null);
            if (qVarA.isViewCreated()) {
                View viewD4 = qVarA.d4();
                f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.T = (int) (ViewUtils.J(baseActivity) * 0.85f);
                qVarA.m4().setVisibility(8);
                qVarA.e4().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            }
            n(baseActivity, bwVarA, newcomerNofityV2Obj);
        }
    }

    static /* synthetic */ void u(NewcomerManager newcomerManager, BaseActivity baseActivity, NewcomerNofityV2Obj newcomerNofityV2Obj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{newcomerManager, baseActivity, newcomerNofityV2Obj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 42072, new Class[]{NewcomerManager.class, BaseActivity.class, NewcomerNofityV2Obj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        newcomerManager.t(baseActivity, newcomerNofityV2Obj, z10);
    }

    public final void f(@dl.d BaseActivity baseActivity, @dl.d String type) {
        if (PatchProxy.proxy(new Object[]{baseActivity, type}, this, changeQuickRedirect, false, 42066, new Class[]{BaseActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(baseActivity, "baseActivity");
        f0.p(type, "type");
        com.max.hbcommon.utils.d.b(f90885d, "checkForNotify type==" + type);
        NewcomerNotifyObj newcomerNotifyObj = (NewcomerNotifyObj) k.a(com.max.hbcache.c.o(com.max.hbcache.c.K0, ""), NewcomerNotifyObj.class);
        if (newcomerNotifyObj != null && f0.g(type, newcomerNotifyObj.getLocation()) && com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.c(ViewPriority.LOW.getValue())) {
            q(baseActivity, newcomerNotifyObj);
        }
    }

    public final void h(@dl.d BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, this, changeQuickRedirect, false, 42064, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(baseActivity, "baseActivity");
        baseActivity.V0().c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().B3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(baseActivity)));
    }
}
