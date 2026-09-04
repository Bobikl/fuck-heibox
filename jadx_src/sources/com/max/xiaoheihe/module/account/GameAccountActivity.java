package com.max.xiaoheihe.module.account;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.BindGameInfosObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.PlatformBindStatus;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.game.GameCardObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.s1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareAPI;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pokercc.android.expandablerecyclerview.ExpandableRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131202l4})
public class GameAccountActivity extends BaseActivity implements GameBindingFragment.n, com.max.xiaoheihe.module.account.adapter.d {
    public static final int Z = 3;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f77822a0 = 5;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f77823b0 = 6;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f77824c0 = 7;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f77825p1 = "NotRefresh";
    View L;
    private UserProfileUpdatedBroadcastReceiver N;
    private com.max.xiaoheihe.module.account.adapter.a P;
    private String R;
    private com.max.xiaoheihe.module.account.adapter.g S;

    @BindView(R.id.et_qucik)
    EditText et_qucik;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.ns_root)
    NestedScrollView ns_root;

    @BindView(R.id.rv_bind_list)
    ExpandableRecyclerView rv_bind_list;

    @BindView(R.id.rv_platform)
    RecyclerView rv_platform;

    @BindView(R.id.sb_change_card_type)
    SwitchButton sb_change_card_type;

    @BindView(R.id.sb_show_top)
    SwitchButton sb_show_top;

    @BindView(R.id.tv_platform_finish)
    TextView tv_platform_finish;

    @BindView(R.id.tv_platform_tip)
    TextView tv_platform_tip;

    @BindView(R.id.tv_quick_bind)
    TextView tv_quick_bind;

    @BindView(R.id.tv_quick_unbind)
    TextView tv_quick_unbind;

    @BindView(R.id.tv_type_card)
    TextView tv_type_card;

    @BindView(R.id.tv_type_list)
    TextView tv_type_list;

    @BindView(R.id.vg_card_type)
    View vg_card_type;

    @BindView(R.id.vg_platform_card)
    ViewGroup vg_platform_card;

    @BindView(R.id.vg_platform_setting)
    View vg_platform_setting;

    @BindView(R.id.vg_quick_bind)
    View vg_quick_bind;

    @BindView(R.id.vg_show_top)
    ViewGroup vg_show_top;
    private UMShareAPI M = null;
    private boolean O = false;
    private List<GameCardObj> Q = new ArrayList();
    private List<String> T = new ArrayList();
    private int U = 0;
    private boolean V = false;
    private ArrayList<String> W = new ArrayList<>();
    private ArrayList<String> X = null;
    r1.z0 Y = new d();

    public class UserProfileUpdatedBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private UserProfileUpdatedBroadcastReceiver() {
        }

        /* synthetic */ UserProfileUpdatedBroadcastReceiver(GameAccountActivity gameAccountActivity, e eVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 23055, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.X.equals(action)) {
                GameAccountActivity.M1(GameAccountActivity.this);
                return;
            }
            if (lb.a.f131055v.equals(action)) {
                if (lb.a.f131074y0.equals(intent.getStringExtra(lb.a.f131002m0))) {
                    GameAccountActivity.this.O = false;
                    GameAccountActivity.V1(GameAccountActivity.this);
                } else {
                    if (GameAccountActivity.f77825p1.equals(intent.getStringExtra(lb.a.f131002m0))) {
                        return;
                    }
                    GameAccountActivity.this.rv_bind_list.scrollToPosition(0);
                    GameAccountActivity.this.ns_root.p(33);
                    GameAccountActivity.this.mRefreshLayout.F();
                }
            }
        }
    }

    public class a implements kh.c<Result<HomeDataObj>, Result<BindGameInfosObj>, n> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public n a(Result<HomeDataObj> result, Result<BindGameInfosObj> result2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, result2}, this, changeQuickRedirect, false, 23033, new Class[]{Result.class, Result.class}, n.class);
            return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : GameAccountActivity.this.new n(result.getResult(), result2.getResult());
        }

        /* JADX WARN: Type inference failed for: r10v3, types: [com.max.xiaoheihe.module.account.GameAccountActivity$n, java.lang.Object] */
        @Override // kh.c
        public /* bridge */ /* synthetic */ n apply(Result<HomeDataObj> result, Result<BindGameInfosObj> result2) throws Exception {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{result, result2}, this, changeQuickRedirect, false, 23034, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(result, result2);
        }
    }

    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23035, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            com.max.xiaoheihe.utils.d.E0(((BaseActivity) GameAccountActivity.this).f66601b, GameAccountActivity.this.et_qucik);
            GameAccountActivity.this.mRefreshLayout.F();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23036, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 23037, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
            com.max.xiaoheihe.utils.d.E0(((BaseActivity) GameAccountActivity.this).f66601b, GameAccountActivity.this.et_qucik);
            GameAccountActivity.this.mRefreshLayout.F();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23038, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class d implements r1.z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23040, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAccountActivity.this.R = str;
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public /* synthetic */ void b() {
            s1.a(this);
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public io.reactivex.disposables.a c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23039, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : GameAccountActivity.this.V0();
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void d(View view, String str) {
        }

        @Override // com.max.xiaoheihe.module.game.r1.z0
        public void e() {
        }
    }

    public class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 23032, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameAccountActivity.M1(GameAccountActivity.this);
        }
    }

    public class f extends ItemTouchHelper.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder}, this, changeQuickRedirect, false, 23042, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23041, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : GameAccountActivity.this.S.m();
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(@androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder, @androidx.annotation.n0 RecyclerView.ViewHolder viewHolder2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{recyclerView, viewHolder, viewHolder2}, this, changeQuickRedirect, false, 23043, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            try {
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                GameAccountActivity.a2(GameAccountActivity.this, absoluteAdapterPosition, absoluteAdapterPosition2);
                if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                    int i10 = absoluteAdapterPosition;
                    while (i10 < absoluteAdapterPosition2) {
                        int i11 = i10 + 1;
                        Collections.swap(GameAccountActivity.this.T, i10, i11);
                        i10 = i11;
                    }
                } else {
                    for (int i12 = absoluteAdapterPosition; i12 > absoluteAdapterPosition2; i12--) {
                        Collections.swap(GameAccountActivity.this.T, i12, i12 - 1);
                    }
                }
                GameAccountActivity.this.S.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                GameAccountActivity.c2(GameAccountActivity.this);
                GameAccountActivity.e2(GameAccountActivity.this);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(@androidx.annotation.n0 RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23044, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameAccountActivity.f2(GameAccountActivity.this, z10);
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23045, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (GameAccountActivity.this.S.m()) {
                GameAccountActivity.this.S.p(false);
                GameAccountActivity.this.tv_platform_tip.setVisibility(8);
                GameAccountActivity.this.tv_platform_finish.setText("排序");
                GameAccountActivity.h2(GameAccountActivity.this);
            } else {
                GameAccountActivity.this.S.p(true);
                GameAccountActivity.this.tv_platform_tip.setVisibility(0);
                GameAccountActivity gameAccountActivity = GameAccountActivity.this;
                gameAccountActivity.tv_platform_finish.setText(((BaseActivity) gameAccountActivity).f66601b.getResources().getText(R.string.done));
            }
            GameAccountActivity.this.S.notifyDataSetChanged();
        }
    }

    public class i implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23046, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameAccountActivity.N1(GameAccountActivity.this, z10);
        }
    }

    public class j implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 23047, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported && GameAccountActivity.this.isActive()) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                GameAccountActivity gameAccountActivity = GameAccountActivity.this;
                gameAccountActivity.vg_show_top.setVisibility(iIntValue < gameAccountActivity.U + 2 ? 4 : 0);
                ViewGroup.LayoutParams layoutParams = GameAccountActivity.this.vg_show_top.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iIntValue;
                GameAccountActivity.this.vg_show_top.setLayoutParams(layoutParams);
            }
        }
    }

    public class k extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23049, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            r1.I1();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23048, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameAccountActivity.this.isActive()) {
                super.onError(th2);
            }
        }
    }

    public class l implements com.max.xiaoheihe.view.m {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.xiaoheihe.view.m
        public void a(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23051, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }

        @Override // com.max.xiaoheihe.view.m
        public void b(Dialog dialog) {
            if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 23050, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                return;
            }
            dialog.dismiss();
        }
    }

    public class m extends com.max.hbcommon.network.d<n> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f77839b;

        m(boolean z10) {
            this.f77839b = z10;
        }

        public void a(n nVar) {
            BindGameInfosObj bindGameInfosObj;
            if (PatchProxy.proxy(new Object[]{nVar}, this, changeQuickRedirect, false, 23052, new Class[]{n.class}, Void.TYPE).isSupported) {
                return;
            }
            if (nVar.f77841a != null) {
                User userI = com.max.xiaoheihe.utils.i0.i();
                userI.setGameAccountInfo(nVar.f77841a);
                com.max.xiaoheihe.utils.i0.z(userI);
            }
            if (GameAccountActivity.this.isActive() && (bindGameInfosObj = nVar.f77842b) != null) {
                if (this.f77839b) {
                    GameAccountActivity.Q1(GameAccountActivity.this, bindGameInfosObj);
                } else {
                    GameAccountActivity.Q1(GameAccountActivity.this, bindGameInfosObj);
                    GameAccountActivity.this.o2(nVar.f77842b);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 23053, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            GameAccountActivity.R1(GameAccountActivity.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 23054, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((n) obj);
        }
    }

    public class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HomeDataObj f77841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        BindGameInfosObj f77842b;

        public n(HomeDataObj homeDataObj, BindGameInfosObj bindGameInfosObj) {
            this.f77841a = homeDataObj;
            this.f77842b = bindGameInfosObj;
        }
    }

    private void A2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22999, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            com.max.hbcache.c.C(com.max.hbcache.c.Q, "0");
            this.tv_type_card.setTextColor(getResources().getColor(R.color.text_primary_1_color));
            this.tv_type_list.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        } else {
            com.max.hbcache.c.C(com.max.hbcache.c.Q, "1");
            this.tv_type_card.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
            this.tv_type_list.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        }
        com.max.xiaoheihe.utils.d.w1(this.f66601b);
    }

    private void B2() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22992, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.T.get(0).equals("steam") && !this.T.get(0).equals("epic")) {
            z10 = true;
        }
        if (this.V != z10) {
            this.V = z10;
            G2(z10);
        }
    }

    private void C2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23013, new Class[0], Void.TYPE).isSupported && this.O) {
            this.mRefreshLayout.P();
            x1();
        }
    }

    private void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.sb_change_card_type.setChecked(true, false);
        this.tv_type_card.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        this.tv_type_list.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
    }

    private void E2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23011, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.tv_type_card.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        this.tv_type_list.setTextColor(getResources().getColor(R.color.text_primary_1_color));
        this.sb_change_card_type.setChecked(false, false);
    }

    private void G2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22996, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = z10 ? ValueAnimator.ofInt(this.U, 0) : ValueAnimator.ofInt(0, this.U);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new j());
        valueAnimatorOfInt.start();
    }

    private void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this.L.findViewById(R.id.cp_loading);
        View viewFindViewById = this.L.findViewById(R.id.tv_bind_btn);
        if (circularProgressIndicator != null) {
            circularProgressIndicator.p();
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    private void I2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        J2(false);
    }

    private void J2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 23008, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) io.reactivex.z.W7(com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()), com.max.xiaoheihe.network.i.a().x9().I5(io.reactivex.schedulers.b.d()), new a()).a4(io.reactivex.android.schedulers.a.c()).J5(new m(z10)));
    }

    static /* synthetic */ void M1(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23022, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.z2();
    }

    static /* synthetic */ void N1(GameAccountActivity gameAccountActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23028, new Class[]{GameAccountActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.v2(z10);
    }

    static /* synthetic */ void Q1(GameAccountActivity gameAccountActivity, BindGameInfosObj bindGameInfosObj) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity, bindGameInfosObj}, null, changeQuickRedirect, true, 23029, new Class[]{GameAccountActivity.class, BindGameInfosObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.p2(bindGameInfosObj);
    }

    static /* synthetic */ void R1(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23030, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.C1();
    }

    static /* synthetic */ void V1(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23031, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.I2();
    }

    static /* synthetic */ void a2(GameAccountActivity gameAccountActivity, int i10, int i11) {
        Object[] objArr = {gameAccountActivity, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 23023, new Class[]{GameAccountActivity.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.q2(i10, i11);
    }

    static /* synthetic */ void c2(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23024, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.B2();
    }

    static /* synthetic */ void e2(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23025, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.r2();
    }

    static /* synthetic */ void f2(GameAccountActivity gameAccountActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23026, new Class[]{GameAccountActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.A2(z10);
    }

    static /* synthetic */ void h2(GameAccountActivity gameAccountActivity) {
        if (PatchProxy.proxy(new Object[]{gameAccountActivity}, null, changeQuickRedirect, true, 23027, new Class[]{GameAccountActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameAccountActivity.u2();
    }

    public static Intent j2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 22989, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) GameAccountActivity.class);
    }

    private int k2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22995, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            if (this.T.get(i10).equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    private void l2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23017, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.vg_quick_bind.setVisibility(8);
    }

    private /* synthetic */ void m2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23021, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.et_qucik.getText().toString())) {
            return;
        }
        x2();
    }

    private /* synthetic */ void n2(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 23020, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.et_qucik.getText().toString())) {
            return;
        }
        y2();
    }

    private void p2(BindGameInfosObj bindGameInfosObj) {
        if (PatchProxy.proxy(new Object[]{bindGameInfosObj}, this, changeQuickRedirect, false, 23009, new Class[]{BindGameInfosObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bindGameInfosObj == null) {
            C1();
            return;
        }
        GameBindingFragment gameBindingFragment = (GameBindingFragment) getSupportFragmentManager().r0(R.id.rb_0);
        if (gameBindingFragment == null) {
            if (!com.max.hbcommon.utils.c.w(bindGameInfosObj.getStats_orders())) {
                getSupportFragmentManager().u().y(R.id.rb_0, GameBindingFragment.n4(GameBindingFragment.D, bindGameInfosObj.getStats_orders())).n();
            }
        } else if (!com.max.hbcommon.utils.c.w(bindGameInfosObj.getStats_orders())) {
            gameBindingFragment.w4("", bindGameInfosObj.getStats_orders(), false);
        }
        ArrayList<GameCardObj> cardModels = bindGameInfosObj.getCardModels();
        if (cardModels.size() > 0) {
            this.Q.clear();
            this.Q.addAll(cardModels);
            this.P.notifyDataSetChanged();
        }
        this.O = true;
        C2();
    }

    private void q2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (!PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22993, new Class[]{cls, cls}, Void.TYPE).isSupported && this.Q.size() > 1 && i10 >= 0 && i11 >= 0 && i10 < this.T.size() && i11 < this.T.size()) {
            String str = this.T.get(i10);
            String str2 = this.T.get(i11);
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.Q.size(); i14++) {
                if (r1.Q0(str, this.Q.get(i14).getGame_type())) {
                    i12 = i14;
                } else if (r1.Q0(str2, this.Q.get(i14).getGame_type())) {
                    i13 = i14;
                }
            }
            if (i12 != -1) {
                if (i13 == -1) {
                    if (i10 <= i11) {
                        for (int size = this.Q.size() - 1; size >= 0 && !r1.Q0(str, this.Q.get(size).getGame_type()); size--) {
                            int iK2 = k2(this.Q.get(size).getGame_type());
                            if (iK2 >= 0 && iK2 <= i11) {
                                i13 = size;
                                break;
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.Q.size() && !r1.Q0(str, this.Q.get(i15).getGame_type()); i15++) {
                            if (k2(this.Q.get(i15).getGame_type()) >= i11) {
                                i13 = i15;
                                break;
                            }
                        }
                    }
                }
                if (i13 != -1) {
                    if (i12 < i13) {
                        int i16 = i12;
                        while (i16 < i13) {
                            int i17 = i16 + 1;
                            Collections.swap(this.Q, i16, i17);
                            i16 = i17;
                        }
                    } else {
                        for (int i18 = i12; i18 > i13; i18--) {
                            Collections.swap(this.Q, i18, i18 - 1);
                        }
                    }
                    this.P.T(i12, i13);
                }
            }
        }
    }

    private void r2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22994, new Class[0], Void.TYPE).isSupported && this.W.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                String strJ0 = r1.j0(this.T.get(i10));
                if (this.W.contains(strJ0)) {
                    arrayList.add(strJ0);
                }
            }
            if (this.W.contains(GameObj.PLATFORM_HARDWARE)) {
                arrayList.add(GameObj.PLATFORM_HARDWARE);
            }
            r1.j2(this.L, arrayList, this.Y, this);
        }
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22997, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.T) {
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(str);
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().I8(sb2.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
    }

    private void v2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22998, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().k(z10 ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p()));
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23018, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n3(this.et_qucik.getText().toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23019, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U(this.et_qucik.getText().toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = false;
        I2();
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23003, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_succuess));
        com.max.xiaoheihe.utils.d.x1(this.f66601b);
    }

    @Override // com.max.xiaoheihe.module.account.adapter.d
    public NestedScrollView C() {
        return this.ns_root;
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void C0(String str, Throwable th2) {
        if (PatchProxy.proxy(new Object[]{str, th2}, this, changeQuickRedirect, false, 23002, new Class[]{String.class, Throwable.class}, Void.TYPE).isSupported) {
            return;
        }
        th2.printStackTrace();
        com.max.heybox.hblog.g.x("GameAccountActivity, onBindFailed, gameType = " + str + ", " + Log.getStackTraceString(new Throwable()));
        if (GameBindingFragment.f77868u.equals(th2.getMessage()) || GameBindingFragment.f77867t.equals(th2.getMessage())) {
            com.max.xiaoheihe.view.l.D(this.f66601b, "", com.max.xiaoheihe.utils.d.n0(R.string.bind_pubg_fail_message), com.max.xiaoheihe.utils.d.n0(R.string.confirm), null, new l());
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.logging_data_fail));
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(String str, View view, EditText editText) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, view, editText}, this, changeQuickRedirect, false, 23001, new Class[]{String.class, View.class, EditText.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (lb.a.T0.equals(str)) {
            com.max.xiaoheihe.module.account.utils.l.B(lb.a.T0, V0(), this.f66601b, null, false, true, 5);
            return true;
        }
        if ("csgo".equals(str)) {
            com.max.xiaoheihe.module.account.utils.l.B("csgo", V0(), this.f66601b, null, false, true, 6);
            return true;
        }
        if (!lb.a.V0.equals(str)) {
            return false;
        }
        com.max.xiaoheihe.module.account.utils.l.B(lb.a.V0, V0(), this.f66601b, null, false, true, 7);
        return true;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22990, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_account);
        this.f66620u = ButterKnife.a(this);
        this.M = UMShareAPI.get(this);
        this.f66616q.setTitle(getString(R.string.manage_game_account));
        this.f66616q.P();
        this.f66617r.setVisibility(0);
        View viewInflate = this.f66602c.inflate(R.layout.layout_platforms_card_v2, this.vg_platform_card, false);
        this.vg_platform_card.removeAllViews();
        this.vg_platform_card.addView(viewInflate);
        this.L = viewInflate.findViewById(R.id.vg_platforms_container);
        CardView cardView = (CardView) viewInflate.findViewById(R.id.vg_container);
        if (cardView != null) {
            Activity activity = this.f66601b;
            cardView.setRadius(ViewUtils.n(activity, ViewUtils.L(activity), ViewUtils.f(this.f66601b, 150.0f), ViewUtils.ViewType.IMAGE));
        }
        this.mRefreshLayout.S(new e());
        this.mRefreshLayout.b0(false);
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = new UserProfileUpdatedBroadcastReceiver(this, null);
        this.N = userProfileUpdatedBroadcastReceiver;
        t1(userProfileUpdatedBroadcastReceiver, lb.a.f131055v);
        t1(this.N, lb.a.X);
        this.rv_bind_list.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.P = new com.max.xiaoheihe.module.account.adapter.a(this.f66601b, this.Q);
        this.rv_bind_list.setItemAnimator(new pokercc.android.expandablerecyclerview.b(this.rv_bind_list, 200L));
        this.rv_bind_list.setAdapter(this.P);
        this.U = ViewUtils.f(this.f66601b, -30.0f);
        this.rv_platform.setLayoutManager(new LinearLayoutManager(this.f66601b, 0, false));
        this.rv_platform.addItemDecoration(new com.max.hbcustomview.d(ViewUtils.f(this.f66601b, 4.0f), ViewUtils.f(this.f66601b, 12.0f)));
        Activity activity2 = this.f66601b;
        com.max.xiaoheihe.module.account.adapter.g gVar = new com.max.xiaoheihe.module.account.adapter.g(activity2, this.T, (ViewUtils.L(activity2) - ViewUtils.f(this.f66601b, 40.0f)) / 5);
        this.S = gVar;
        this.rv_platform.setAdapter(gVar);
        new ItemTouchHelper(new f()).attachToRecyclerView(this.rv_platform);
        n1();
        l2();
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void m1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23004, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.unbind_data_succuess));
        com.max.xiaoheihe.utils.d.y1(this.f66601b, lb.a.f131068x0);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23014, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        z2();
    }

    public void o2(BindGameInfosObj bindGameInfosObj) {
        int i10;
        if (PatchProxy.proxy(new Object[]{bindGameInfosObj}, this, changeQuickRedirect, false, 23010, new Class[]{BindGameInfosObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bindGameInfosObj == null) {
            C1();
            return;
        }
        if (!com.max.hbcommon.utils.c.w(bindGameInfosObj.getPlatform_list())) {
            r1.J1(bindGameInfosObj.getPlatform_list());
            this.T.clear();
            this.T.addAll(r1.p0());
            this.S.notifyDataSetChanged();
            if (this.T.get(0).equals("steam") || this.T.get(0).equals("epic")) {
                i10 = this.U;
                this.vg_show_top.setVisibility(4);
                this.V = false;
            } else {
                this.vg_show_top.setVisibility(0);
                this.V = true;
                i10 = 0;
            }
            ViewGroup.LayoutParams layoutParams = this.vg_show_top.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i10;
            this.vg_show_top.setLayoutParams(layoutParams);
        }
        String show_console_game_first = bindGameInfosObj.getShow_console_game_first();
        GameObj.showConsoleGameFirst = show_console_game_first;
        this.sb_show_top.setChecked(com.max.hbcommon.utils.c.x(show_console_game_first), false);
        PlatformBindStatus platformBindStatusG0 = r1.g0(bindGameInfosObj);
        this.W.clear();
        for (String str : GameObj.ALL_PLATFORMS) {
            str.hashCode();
            switch (str) {
                case "platform_hardware":
                    if (platformBindStatusG0.isBindHardware()) {
                        break;
                    } else {
                        this.W.add(GameObj.PLATFORM_HARDWARE);
                        break;
                    }
                    break;
                case "switch":
                    if (platformBindStatusG0.isBindSwitch()) {
                        break;
                    } else {
                        this.W.add("switch");
                        break;
                    }
                    break;
                case "platform_steam":
                    if (platformBindStatusG0.isBindSteam()) {
                        break;
                    } else {
                        this.W.add(GameObj.PLATFORM_STEAM);
                        break;
                    }
                    break;
                case "csgo":
                    if (platformBindStatusG0.isBindCsgo()) {
                        break;
                    } else {
                        this.W.add("csgo");
                        break;
                    }
                    break;
                case "epic":
                    if (platformBindStatusG0.isBindEpic()) {
                        break;
                    } else {
                        this.W.add("epic");
                        break;
                    }
                    break;
                case "dota2":
                    if (platformBindStatusG0.isBindDota2()) {
                        break;
                    } else {
                        this.W.add("dota2");
                        break;
                    }
                    break;
                case "platform_xbox":
                    if (platformBindStatusG0.isBindXbox()) {
                        break;
                    } else {
                        this.W.add(GameObj.PLATFORM_XBOX);
                        break;
                    }
                    break;
                case "platform_ps":
                    if (platformBindStatusG0.isBindPSN()) {
                        break;
                    } else {
                        this.W.add(GameObj.PLATFORM_PS);
                        break;
                    }
                    break;
            }
        }
        if (this.W.size() > 0) {
            this.L.setVisibility(0);
            this.R = r1.W(bindGameInfosObj);
            r1.k2(this.L, this.W, this.Y, this, bindGameInfosObj.getCsgo_bind_protocol());
        } else {
            this.L.setVisibility(8);
        }
        if ("0".equals(com.max.hbcache.c.o(com.max.hbcache.c.Q, "-1"))) {
            D2();
        } else {
            E2();
        }
        C2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        GameBindingFragment gameBindingFragment;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 23016, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI uMShareAPI = this.M;
        if (uMShareAPI != null) {
            uMShareAPI.onActivityResult(i10, i11, intent);
        }
        if (i10 == 3) {
            com.max.xiaoheihe.utils.d.x1(this.f66601b);
            return;
        }
        if (i10 == 5 && i11 == -1) {
            GameBindingFragment gameBindingFragment2 = (GameBindingFragment) getSupportFragmentManager().r0(R.id.vg_bind_card_container);
            if (gameBindingFragment2 != null) {
                gameBindingFragment2.p4(lb.a.T0);
                return;
            }
            return;
        }
        if (i10 == 6 && i11 == -1) {
            GameBindingFragment gameBindingFragment3 = (GameBindingFragment) getSupportFragmentManager().r0(R.id.vg_bind_card_container);
            if (gameBindingFragment3 != null) {
                gameBindingFragment3.p4("csgo");
                return;
            }
            return;
        }
        if (i10 == 7 && i11 == -1 && (gameBindingFragment = (GameBindingFragment) getSupportFragmentManager().r0(R.id.vg_bind_card_container)) != null) {
            gameBindingFragment.p4(lb.a.V0);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UserProfileUpdatedBroadcastReceiver userProfileUpdatedBroadcastReceiver = this.N;
        if (userProfileUpdatedBroadcastReceiver != null) {
            this.f66601b.unregisterReceiver(userProfileUpdatedBroadcastReceiver);
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22991, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.q1();
        this.sb_change_card_type.setOnCheckedChangeListener(new g());
        this.tv_platform_finish.setOnClickListener(new h());
        this.sb_show_top.setOnCheckedChangeListener(new i());
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void u1(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 23005, new Class[]{String.class}, Void.TYPE).isSupported && "xbox".equals(str) && this.R.equals(GameObj.PLATFORM_XBOX)) {
            H2();
        }
    }

    @Override // com.max.xiaoheihe.module.account.GameBindingFragment.n
    public /* synthetic */ void w2(String str, Throwable th2) {
        com.max.xiaoheihe.module.account.e.a(this, str, th2);
    }
}
