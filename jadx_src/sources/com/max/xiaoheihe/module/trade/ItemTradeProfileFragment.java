package com.max.xiaoheihe.module.trade;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.account.AccountDetailObj;
import com.max.xiaoheihe.bean.trade.MallTradeHomeObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ItemTradeProfileFragment extends com.max.xiaoheihe.module.littleprogram.fragment.b {

    @dl.d
    public static final a S = new a(null);
    public static final int T = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private View H;
    private RecyclerView I;
    private View J;
    private ImageView K;
    private TextView L;
    private ObjectAnimator M;
    private boolean N;
    private View O;

    @dl.e
    private TradeMsgBroadcastReceiver P;

    @dl.e
    private com.max.hbcommon.component.i Q;
    private com.max.hbcommon.base.adapter.s<KeyDescObj> R;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TitleBar f92510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private MallTradeHomeObj f92511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f92512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f92513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f92514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ViewGroup f92515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f92516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f92517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f92518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f92519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f92520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f92521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f92522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f92523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f92524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f92525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f92526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f92527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f92528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f92529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SmartRefreshLayout f92530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f92531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f92532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f92533z;

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.e
        public final ItemTradeProfileFragment a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44525, new Class[0], ItemTradeProfileFragment.class);
            return patchProxyResultProxy.isSupported ? (ItemTradeProfileFragment) patchProxyResultProxy.result : new ItemTradeProfileFragment();
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<MallTradeHomeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44527, new Class[0], Void.TYPE).isSupported && ItemTradeProfileFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = ItemTradeProfileFragment.this.f92530w;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemTradeProfileFragment.this.f92530w;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44526, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemTradeProfileFragment.this.isActive()) {
                super.onError(e10);
                ItemTradeProfileFragment.Z3(ItemTradeProfileFragment.this);
                SmartRefreshLayout smartRefreshLayout = ItemTradeProfileFragment.this.f92530w;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemTradeProfileFragment.this.f92530w;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<MallTradeHomeObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44528, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemTradeProfileFragment.this.isActive()) {
                ItemTradeProfileFragment.this.f92511d = result.getResult();
                ItemTradeProfileFragment.this.m4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44529, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallTradeHomeObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f92536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f92537d;

        c(boolean z10, int i10) {
            this.f92536c = z10;
            this.f92537d = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44530, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemTradeProfileFragment.this.isActive()) {
                super.onError(e10);
                e10.printStackTrace();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onNext(@dl.d Result<StateObj> result) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44531, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemTradeProfileFragment.this.isActive()) {
                if (this.f92536c) {
                    if (ItemTradeProfileFragment.this.Q == null) {
                        ItemTradeProfileFragment itemTradeProfileFragment = ItemTradeProfileFragment.this;
                        Activity mContext = ((com.max.hbcommon.base.d) itemTradeProfileFragment).mContext;
                        f0.o(mContext, "mContext");
                        itemTradeProfileFragment.Q = TradeInfoUtilKt.O(mContext);
                    }
                    com.max.hbcommon.component.i iVar2 = ItemTradeProfileFragment.this.Q;
                    if ((iVar2 != null && iVar2.isShowing()) == false && (iVar = ItemTradeProfileFragment.this.Q) != null) {
                        iVar.show();
                    }
                }
                com.max.hbcommon.component.i iVar3 = ItemTradeProfileFragment.this.Q;
                if ((iVar3 != null && iVar3.isShowing()) != false) {
                    Activity mContext2 = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                    f0.o(mContext2, "mContext");
                    com.max.hbcommon.component.i iVar4 = ItemTradeProfileFragment.this.Q;
                    f0.m(iVar4);
                    TradeInfoUtilKt.W(mContext2, result, iVar4, this.f92537d);
                }
                StateObj result2 = result.getResult();
                String state = result2 == null ? z5.f.f141859j : result2.getState();
                if (state == null) {
                    state = z5.f.f141859j;
                }
                int iHashCode = state.hashCode();
                TextView textView = null;
                ImageView imageView = null;
                if (iHashCode != -1281977283) {
                    if (iHashCode != 3548) {
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            if (this.f92537d <= 10) {
                                ItemTradeProfileFragment.V3(ItemTradeProfileFragment.this, false);
                                ImageView imageView2 = ItemTradeProfileFragment.this.K;
                                if (imageView2 == null) {
                                    f0.S("mIvUpdateIcon");
                                    imageView2 = null;
                                }
                                imageView2.setVisibility(0);
                                ObjectAnimator objectAnimator = ItemTradeProfileFragment.this.M;
                                if (objectAnimator == null) {
                                    f0.S("mRotationAnimtor");
                                    objectAnimator = null;
                                }
                                if (!objectAnimator.isRunning()) {
                                    ObjectAnimator objectAnimator2 = ItemTradeProfileFragment.this.M;
                                    if (objectAnimator2 == null) {
                                        f0.S("mRotationAnimtor");
                                        objectAnimator2 = null;
                                    }
                                    objectAnimator2.start();
                                }
                                TextView textView2 = ItemTradeProfileFragment.this.L;
                                if (textView2 == null) {
                                    f0.S("mTvUpdateBtnDesc");
                                    textView2 = null;
                                }
                                textView2.setText(result2 != null ? result2.getBtn_desc() : null);
                                ItemTradeProfileFragment.e4(ItemTradeProfileFragment.this, this.f92537d + 1, false, 2, null);
                                return;
                            }
                            ItemTradeProfileFragment.l4(ItemTradeProfileFragment.this, false, 1, null);
                            ObjectAnimator objectAnimator3 = ItemTradeProfileFragment.this.M;
                            if (objectAnimator3 == null) {
                                f0.S("mRotationAnimtor");
                                objectAnimator3 = null;
                            }
                            if (objectAnimator3.isRunning()) {
                                ObjectAnimator objectAnimator4 = ItemTradeProfileFragment.this.M;
                                if (objectAnimator4 == null) {
                                    f0.S("mRotationAnimtor");
                                    objectAnimator4 = null;
                                }
                                objectAnimator4.end();
                                ImageView imageView3 = ItemTradeProfileFragment.this.K;
                                if (imageView3 == null) {
                                    f0.S("mIvUpdateIcon");
                                    imageView3 = null;
                                }
                                imageView3.setVisibility(8);
                            }
                            TextView textView3 = ItemTradeProfileFragment.this.L;
                            if (textView3 == null) {
                                f0.S("mTvUpdateBtnDesc");
                            } else {
                                textView = textView3;
                            }
                            textView.setText("更新失败");
                            if (ItemTradeProfileFragment.this.N) {
                                com.max.hbutils.utils.c.f("更新数据失败");
                                return;
                            }
                            return;
                        }
                    } else if (state.equals(ITagManager.SUCCESS)) {
                        ItemTradeProfileFragment.l4(ItemTradeProfileFragment.this, false, 1, null);
                        if (ItemTradeProfileFragment.this.N) {
                            com.max.hbutils.utils.c.f("更新数据成功");
                        }
                        ObjectAnimator objectAnimator5 = ItemTradeProfileFragment.this.M;
                        if (objectAnimator5 == null) {
                            f0.S("mRotationAnimtor");
                            objectAnimator5 = null;
                        }
                        if (objectAnimator5.isRunning()) {
                            ObjectAnimator objectAnimator6 = ItemTradeProfileFragment.this.M;
                            if (objectAnimator6 == null) {
                                f0.S("mRotationAnimtor");
                                objectAnimator6 = null;
                            }
                            objectAnimator6.end();
                            ImageView imageView4 = ItemTradeProfileFragment.this.K;
                            if (imageView4 == null) {
                                f0.S("mIvUpdateIcon");
                            } else {
                                imageView = imageView4;
                            }
                            imageView.setVisibility(8);
                        }
                        ItemTradeProfileFragment.T3(ItemTradeProfileFragment.this);
                        return;
                    }
                } else if (state.equals(z5.f.f141859j)) {
                    ItemTradeProfileFragment.l4(ItemTradeProfileFragment.this, false, 1, null);
                    ObjectAnimator objectAnimator7 = ItemTradeProfileFragment.this.M;
                    if (objectAnimator7 == null) {
                        f0.S("mRotationAnimtor");
                        objectAnimator7 = null;
                    }
                    if (objectAnimator7.isRunning()) {
                        ObjectAnimator objectAnimator8 = ItemTradeProfileFragment.this.M;
                        if (objectAnimator8 == null) {
                            f0.S("mRotationAnimtor");
                            objectAnimator8 = null;
                        }
                        objectAnimator8.end();
                        ImageView imageView5 = ItemTradeProfileFragment.this.K;
                        if (imageView5 == null) {
                            f0.S("mIvUpdateIcon");
                            imageView5 = null;
                        }
                        imageView5.setVisibility(8);
                    }
                    TextView textView4 = ItemTradeProfileFragment.this.L;
                    if (textView4 == null) {
                        f0.S("mTvUpdateBtnDesc");
                        textView4 = null;
                    }
                    textView4.setText(result2 != null ? result2.getBtn_desc() : null);
                    if (ItemTradeProfileFragment.this.N) {
                        com.max.hbutils.utils.c.f("更新数据失败");
                        return;
                    }
                    return;
                }
                ItemTradeProfileFragment.l4(ItemTradeProfileFragment.this, false, 1, null);
                ObjectAnimator objectAnimator9 = ItemTradeProfileFragment.this.M;
                if (objectAnimator9 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator9 = null;
                }
                if (objectAnimator9.isRunning()) {
                    ObjectAnimator objectAnimator10 = ItemTradeProfileFragment.this.M;
                    if (objectAnimator10 == null) {
                        f0.S("mRotationAnimtor");
                        objectAnimator10 = null;
                    }
                    objectAnimator10.end();
                    ImageView imageView6 = ItemTradeProfileFragment.this.K;
                    if (imageView6 == null) {
                        f0.S("mIvUpdateIcon");
                        imageView6 = null;
                    }
                    imageView6.setVisibility(8);
                }
                TextView textView5 = ItemTradeProfileFragment.this.L;
                if (textView5 == null) {
                    f0.S("mTvUpdateBtnDesc");
                    textView5 = null;
                }
                textView5.setText(result2 != null ? result2.getBtn_desc() : null);
                if (ItemTradeProfileFragment.this.N) {
                    com.max.hbutils.utils.c.f("更新数据失败");
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44532, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44545, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeDealActivity.a aVar = TradeDealActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44546, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeDealActivity.a aVar = TradeDealActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 1));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44547, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeBargainListActivity.a aVar = TradeBargainListActivity.R;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0, true));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44548, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemTradeProfileFragment.this.N = true;
            ItemTradeProfileFragment.a4(ItemTradeProfileFragment.this, true);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer trade_state;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44549, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallTradeHomeObj mallTradeHomeObj = ItemTradeProfileFragment.this.f92511d;
            if ((mallTradeHomeObj == null || (trade_state = mallTradeHomeObj.getTrade_state()) == null || trade_state.intValue() != 1) ? false : true) {
                return;
            }
            ItemTradeProfileFragment.this.N = false;
            ItemTradeProfileFragment.U3(ItemTradeProfileFragment.this, 1, true);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44550, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemTradeProfileFragment.this.N = false;
            ItemTradeProfileFragment.U3(ItemTradeProfileFragment.this, 1, true);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class j implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44544, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            if (i0.s()) {
                ItemTradeProfileFragment.T3(ItemTradeProfileFragment.this);
            } else {
                ItemTradeProfileFragment.this.n4();
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44551, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.P(mContext).A();
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44552, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeFavourActivity.a aVar = TradeFavourActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44553, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeFavourActivity.a aVar = TradeFavourActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 1));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44554, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeOrderActivity.a aVar = TradeOrderActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44555, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradePurchaseListActivity.a aVar = TradePurchaseListActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44556, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                ItemWaitReceiveActivity.a aVar = ItemWaitReceiveActivity.L;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44557, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeBargainListActivity.a aVar = TradeBargainListActivity.R;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeBargainListActivity.a.b(aVar, mContext, null, false, 6, null));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44558, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext)) {
                Activity activity = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                TradeOrderActivity.a aVar = TradeOrderActivity.Q;
                Activity mContext = ((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 1));
            }
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44559, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.W0(((com.max.hbcommon.base.d) ItemTradeProfileFragment.this).mContext);
        }
    }

    /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
    public static final class t extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f92564c;

        t(boolean z10) {
            this.f92564c = z10;
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44560, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            TextView textView = ItemTradeProfileFragment.this.L;
            if (textView == null) {
                f0.S("mTvUpdateBtnDesc");
                textView = null;
            }
            textView.setText(result.getResult().getDesc());
            ItemTradeProfileFragment.U3(ItemTradeProfileFragment.this, 1, this.f92564c);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44561, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public static final /* synthetic */ void T3(ItemTradeProfileFragment itemTradeProfileFragment) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment}, null, changeQuickRedirect, true, 44520, new Class[]{ItemTradeProfileFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeProfileFragment.c4();
    }

    public static final /* synthetic */ void U3(ItemTradeProfileFragment itemTradeProfileFragment, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44522, new Class[]{ItemTradeProfileFragment.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeProfileFragment.d4(i10, z10);
    }

    public static final /* synthetic */ void V3(ItemTradeProfileFragment itemTradeProfileFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44524, new Class[]{ItemTradeProfileFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeProfileFragment.k4(z10);
    }

    public static final /* synthetic */ void Z3(ItemTradeProfileFragment itemTradeProfileFragment) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment}, null, changeQuickRedirect, true, 44523, new Class[]{ItemTradeProfileFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeProfileFragment.showError();
    }

    public static final /* synthetic */ void a4(ItemTradeProfileFragment itemTradeProfileFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44521, new Class[]{ItemTradeProfileFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemTradeProfileFragment.o4(z10);
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44503, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.O;
        View view2 = null;
        if (view == null) {
            f0.S("mRootView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.srl);
        f0.o(viewFindViewById, "mRootView.findViewById(R.id.srl)");
        this.f92530w = (SmartRefreshLayout) viewFindViewById;
        View view3 = this.O;
        if (view3 == null) {
            f0.S("mRootView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.toolbar);
        f0.o(viewFindViewById2, "mRootView.findViewById(R.id.toolbar)");
        this.f92510c = (TitleBar) viewFindViewById2;
        View view4 = this.O;
        if (view4 == null) {
            f0.S("mRootView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.iv_avatar);
        f0.o(viewFindViewById3, "mRootView.findViewById(R.id.iv_avatar)");
        this.f92512e = (ImageView) viewFindViewById3;
        View view5 = this.O;
        if (view5 == null) {
            f0.S("mRootView");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(R.id.tv_name);
        f0.o(viewFindViewById4, "mRootView.findViewById(R.id.tv_name)");
        this.f92513f = (TextView) viewFindViewById4;
        View view6 = this.O;
        if (view6 == null) {
            f0.S("mRootView");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(R.id.vg_profile);
        f0.o(viewFindViewById5, "mRootView.findViewById(R.id.vg_profile)");
        this.f92528u = viewFindViewById5;
        View view7 = this.O;
        if (view7 == null) {
            f0.S("mRootView");
            view7 = null;
        }
        View viewFindViewById6 = view7.findViewById(R.id.tv_trade_check_message);
        f0.o(viewFindViewById6, "mRootView.findViewById(R…d.tv_trade_check_message)");
        this.f92529v = (TextView) viewFindViewById6;
        View view8 = this.O;
        if (view8 == null) {
            f0.S("mRootView");
            view8 = null;
        }
        View viewFindViewById7 = view8.findViewById(R.id.rl_medal_level);
        f0.o(viewFindViewById7, "mRootView.findViewById(R.id.rl_medal_level)");
        this.f92514g = (RelativeLayout) viewFindViewById7;
        View view9 = this.O;
        if (view9 == null) {
            f0.S("mRootView");
            view9 = null;
        }
        View viewFindViewById8 = view9.findViewById(R.id.vg_state);
        f0.o(viewFindViewById8, "mRootView.findViewById(R.id.vg_state)");
        this.f92515h = (ViewGroup) viewFindViewById8;
        View view10 = this.O;
        if (view10 == null) {
            f0.S("mRootView");
            view10 = null;
        }
        View viewFindViewById9 = view10.findViewById(R.id.tv_login_desc);
        f0.o(viewFindViewById9, "mRootView.findViewById(R.id.tv_login_desc)");
        this.f92516i = (TextView) viewFindViewById9;
        View view11 = this.O;
        if (view11 == null) {
            f0.S("mRootView");
            view11 = null;
        }
        View viewFindViewById10 = view11.findViewById(R.id.tv_wallet_value);
        f0.o(viewFindViewById10, "mRootView.findViewById(R.id.tv_wallet_value)");
        this.f92517j = (TextView) viewFindViewById10;
        View view12 = this.O;
        if (view12 == null) {
            f0.S("mRootView");
            view12 = null;
        }
        View viewFindViewById11 = view12.findViewById(R.id.tv_favour_num);
        f0.o(viewFindViewById11, "mRootView.findViewById(R.id.tv_favour_num)");
        this.f92519l = (TextView) viewFindViewById11;
        View view13 = this.O;
        if (view13 == null) {
            f0.S("mRootView");
            view13 = null;
        }
        View viewFindViewById12 = view13.findViewById(R.id.tv_follow_num);
        f0.o(viewFindViewById12, "mRootView.findViewById(R.id.tv_follow_num)");
        this.f92518k = (TextView) viewFindViewById12;
        View view14 = this.O;
        if (view14 == null) {
            f0.S("mRootView");
            view14 = null;
        }
        View viewFindViewById13 = view14.findViewById(R.id.tv_bargain_purchase);
        f0.o(viewFindViewById13, "mRootView.findViewById(R.id.tv_bargain_purchase)");
        this.f92520m = (TextView) viewFindViewById13;
        View view15 = this.O;
        if (view15 == null) {
            f0.S("mRootView");
            view15 = null;
        }
        View viewFindViewById14 = view15.findViewById(R.id.tv_bargain_sell);
        f0.o(viewFindViewById14, "mRootView.findViewById(R.id.tv_bargain_sell)");
        this.f92521n = (TextView) viewFindViewById14;
        View view16 = this.O;
        if (view16 == null) {
            f0.S("mRootView");
            view16 = null;
        }
        View viewFindViewById15 = view16.findViewById(R.id.tv_buy_orders);
        f0.o(viewFindViewById15, "mRootView.findViewById(R.id.tv_buy_orders)");
        this.f92522o = (TextView) viewFindViewById15;
        View view17 = this.O;
        if (view17 == null) {
            f0.S("mRootView");
            view17 = null;
        }
        View viewFindViewById16 = view17.findViewById(R.id.tv_order_sell);
        f0.o(viewFindViewById16, "mRootView.findViewById(R.id.tv_order_sell)");
        this.f92523p = (TextView) viewFindViewById16;
        View view18 = this.O;
        if (view18 == null) {
            f0.S("mRootView");
            view18 = null;
        }
        View viewFindViewById17 = view18.findViewById(R.id.tv_want_to_buy);
        f0.o(viewFindViewById17, "mRootView.findViewById(R.id.tv_want_to_buy)");
        this.f92525r = (TextView) viewFindViewById17;
        View view19 = this.O;
        if (view19 == null) {
            f0.S("mRootView");
            view19 = null;
        }
        View viewFindViewById18 = view19.findViewById(R.id.tv_num_to_received);
        f0.o(viewFindViewById18, "mRootView.findViewById(R.id.tv_num_to_received)");
        this.f92526s = (TextView) viewFindViewById18;
        View view20 = this.O;
        if (view20 == null) {
            f0.S("mRootView");
            view20 = null;
        }
        View viewFindViewById19 = view20.findViewById(R.id.tv_num_to_delivering);
        f0.o(viewFindViewById19, "mRootView.findViewById(R.id.tv_num_to_delivering)");
        this.f92527t = (TextView) viewFindViewById19;
        View view21 = this.O;
        if (view21 == null) {
            f0.S("mRootView");
            view21 = null;
        }
        View viewFindViewById20 = view21.findViewById(R.id.tv_selling);
        f0.o(viewFindViewById20, "mRootView.findViewById(R.id.tv_selling)");
        this.f92524q = (TextView) viewFindViewById20;
        View view22 = this.O;
        if (view22 == null) {
            f0.S("mRootView");
            view22 = null;
        }
        View viewFindViewById21 = view22.findViewById(R.id.vg_profile_info_1);
        f0.o(viewFindViewById21, "mRootView.findViewById(R.id.vg_profile_info_1)");
        this.f92531x = viewFindViewById21;
        View view23 = this.O;
        if (view23 == null) {
            f0.S("mRootView");
            view23 = null;
        }
        View viewFindViewById22 = view23.findViewById(R.id.vg_profile_info_2);
        f0.o(viewFindViewById22, "mRootView.findViewById(R.id.vg_profile_info_2)");
        this.f92532y = viewFindViewById22;
        View view24 = this.O;
        if (view24 == null) {
            f0.S("mRootView");
            view24 = null;
        }
        View viewFindViewById23 = view24.findViewById(R.id.vg_profile_info_3);
        f0.o(viewFindViewById23, "mRootView.findViewById(R.id.vg_profile_info_3)");
        this.f92533z = viewFindViewById23;
        View view25 = this.O;
        if (view25 == null) {
            f0.S("mRootView");
            view25 = null;
        }
        View viewFindViewById24 = view25.findViewById(R.id.vg_order_info_1);
        f0.o(viewFindViewById24, "mRootView.findViewById(R.id.vg_order_info_1)");
        this.A = viewFindViewById24;
        View view26 = this.O;
        if (view26 == null) {
            f0.S("mRootView");
            view26 = null;
        }
        View viewFindViewById25 = view26.findViewById(R.id.vg_order_info_2);
        f0.o(viewFindViewById25, "mRootView.findViewById(R.id.vg_order_info_2)");
        this.B = viewFindViewById25;
        View view27 = this.O;
        if (view27 == null) {
            f0.S("mRootView");
            view27 = null;
        }
        View viewFindViewById26 = view27.findViewById(R.id.vg_order_info_3);
        f0.o(viewFindViewById26, "mRootView.findViewById(R.id.vg_order_info_3)");
        this.C = viewFindViewById26;
        View view28 = this.O;
        if (view28 == null) {
            f0.S("mRootView");
            view28 = null;
        }
        View viewFindViewById27 = view28.findViewById(R.id.vg_order_info_4);
        f0.o(viewFindViewById27, "mRootView.findViewById(R.id.vg_order_info_4)");
        this.D = viewFindViewById27;
        View view29 = this.O;
        if (view29 == null) {
            f0.S("mRootView");
            view29 = null;
        }
        View viewFindViewById28 = view29.findViewById(R.id.vg_sell_info_1);
        f0.o(viewFindViewById28, "mRootView.findViewById(R.id.vg_sell_info_1)");
        this.E = viewFindViewById28;
        View view30 = this.O;
        if (view30 == null) {
            f0.S("mRootView");
            view30 = null;
        }
        View viewFindViewById29 = view30.findViewById(R.id.vg_sell_info_2);
        f0.o(viewFindViewById29, "mRootView.findViewById(R.id.vg_sell_info_2)");
        this.F = viewFindViewById29;
        View view31 = this.O;
        if (view31 == null) {
            f0.S("mRootView");
            view31 = null;
        }
        View viewFindViewById30 = view31.findViewById(R.id.vg_sell_info_3);
        f0.o(viewFindViewById30, "mRootView.findViewById(R.id.vg_sell_info_3)");
        this.G = viewFindViewById30;
        View view32 = this.O;
        if (view32 == null) {
            f0.S("mRootView");
            view32 = null;
        }
        View viewFindViewById31 = view32.findViewById(R.id.vg_sell_info_4);
        f0.o(viewFindViewById31, "mRootView.findViewById(R.id.vg_sell_info_4)");
        this.H = viewFindViewById31;
        View view33 = this.O;
        if (view33 == null) {
            f0.S("mRootView");
            view33 = null;
        }
        View viewFindViewById32 = view33.findViewById(R.id.vg_data_update);
        f0.o(viewFindViewById32, "mRootView.findViewById(R.id.vg_data_update)");
        this.J = viewFindViewById32;
        View view34 = this.O;
        if (view34 == null) {
            f0.S("mRootView");
            view34 = null;
        }
        View viewFindViewById33 = view34.findViewById(R.id.tv_data_update_text);
        f0.o(viewFindViewById33, "mRootView.findViewById(R.id.tv_data_update_text)");
        this.L = (TextView) viewFindViewById33;
        View view35 = this.O;
        if (view35 == null) {
            f0.S("mRootView");
            view35 = null;
        }
        View viewFindViewById34 = view35.findViewById(R.id.iv_data_update_icon);
        f0.o(viewFindViewById34, "mRootView.findViewById(R.id.iv_data_update_icon)");
        this.K = (ImageView) viewFindViewById34;
        View view36 = this.O;
        if (view36 == null) {
            f0.S("mRootView");
        } else {
            view2 = view36;
        }
        View viewFindViewById35 = view2.findViewById(R.id.rv_tools);
        f0.o(viewFindViewById35, "mRootView.findViewById(R.id.rv_tools)");
        this.I = (RecyclerView) viewFindViewById35;
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44506, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().fa().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void d4(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44516, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.f92515h;
        TextView textView = null;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setClickable(false);
        TextView textView2 = this.f92529v;
        if (textView2 == null) {
            f0.S("tv_trade_check_message");
        } else {
            textView = textView2;
        }
        textView.setClickable(false);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A9().C1(i10 < 4 ? 1L : 2L, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(z10, i10)));
    }

    static /* synthetic */ void e4(ItemTradeProfileFragment itemTradeProfileFragment, int i10, boolean z10, int i11, Object obj) {
        Object[] objArr = {itemTradeProfileFragment, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 44517, new Class[]{ItemTradeProfileFragment.class, cls, Boolean.TYPE, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        itemTradeProfileFragment.d4(i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44505, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        for (int i10 = 0; i10 < 6; i10++) {
            ((ArrayList) objectRef.f124891b).add(keyDescObj);
        }
        final Context context = getContext();
        this.R = new com.max.hbcommon.base.adapter.s<KeyDescObj>(objectRef, this, context) { // from class: com.max.xiaoheihe.module.trade.ItemTradeProfileFragment$initToolsList$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemTradeProfileFragment f92544b;

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92545b;

                a(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92545b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44535, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) this.f92545b).mContext)) {
                        Activity activity = ((com.max.hbcommon.base.d) this.f92545b).mContext;
                        TradeAccountSettingActivity.a aVar = TradeAccountSettingActivity.f92620p2;
                        Activity mContext = ((com.max.hbcommon.base.d) this.f92545b).mContext;
                        f0.o(mContext, "mContext");
                        activity.startActivity(aVar.a(mContext));
                    }
                }
            }

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92546b;

                b(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92546b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44539, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Activity activity = ((com.max.hbcommon.base.d) this.f92546b).mContext;
                    f0.n(activity, "null cannot be cast to non-null type android.app.Activity");
                    TradeInfoUtilKt.d(activity);
                }
            }

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class c implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92547b;

                c(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92547b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44540, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) this.f92547b).mContext)) {
                        Activity activity = ((com.max.hbcommon.base.d) this.f92547b).mContext;
                        TradeSellSettingsActivity.a aVar = TradeSellSettingsActivity.W;
                        Activity mContext = ((com.max.hbcommon.base.d) this.f92547b).mContext;
                        f0.o(mContext, "mContext");
                        activity.startActivity(aVar.b(mContext));
                    }
                }
            }

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class d implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92548b;

                d(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92548b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44541, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Intent intent = new Intent(((com.max.hbcommon.base.d) this.f92548b).mContext, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", lb.a.A3);
                    intent.putExtra("title", "防骗指南");
                    ((com.max.hbcommon.base.d) this.f92548b).mContext.startActivity(intent);
                }
            }

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class e implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92549b;

                e(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92549b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44542, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ((com.max.hbcommon.base.d) this.f92549b).mContext.startActivity(TradeFeedbackActivity.P.a(((com.max.hbcommon.base.d) this.f92549b).mContext));
                }
            }

            /* JADX INFO: compiled from: ItemTradeProfileFragment.kt */
            public static final class f implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemTradeProfileFragment f92550b;

                f(ItemTradeProfileFragment itemTradeProfileFragment) {
                    this.f92550b = itemTradeProfileFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44543, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Intent intent = new Intent(((com.max.hbcommon.base.d) this.f92550b).mContext, (Class<?>) WebActionActivity.class);
                    intent.putExtra("pageurl", lb.a.O3);
                    intent.putExtra("title", "CSGO百科");
                    ((com.max.hbcommon.base.d) this.f92550b).mContext.startActivity(intent);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, objectRef.f124891b, R.layout.item_trade_profile_tools);
                this.f92544b = this;
            }

            /* JADX WARN: Code duplicated, block: B:43:0x011d  */
            public void m(@dl.d s.e viewHolder, @dl.d KeyDescObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44533, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
                TextView textView = (TextView) viewHolder.i(R.id.tv_name);
                int adapterPosition = viewHolder.getAdapterPosition();
                imageView.setImageResource(R.drawable.nav_bar_trade_disc);
                textView.setText(data.getText());
                if (adapterPosition == 0) {
                    textView.setText("账号设置");
                    MallTradeHomeObj mallTradeHomeObj = this.f92544b.f92511d;
                    if ((mallTradeHomeObj != null ? mallTradeHomeObj.getSteam_id_info() : null) != null) {
                        imageView.setImageResource(R.drawable.market_operation_set_steam_40x40);
                        viewHolder.itemView.setOnClickListener(new a(this.f92544b));
                        return;
                    } else {
                        imageView.setImageResource(R.drawable.market_operation_set_steam_highlight_40x40);
                        View view = viewHolder.itemView;
                        final ItemTradeProfileFragment itemTradeProfileFragment = this.f92544b;
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.ItemTradeProfileFragment$initToolsList$2$onBindViewHolder$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 44536, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) itemTradeProfileFragment).mContext)) {
                                    Activity mContext = ((com.max.hbcommon.base.d) itemTradeProfileFragment).mContext;
                                    f0.o(mContext, "mContext");
                                    final ItemTradeProfileFragment itemTradeProfileFragment2 = itemTradeProfileFragment;
                                    TradeInfoUtilKt.b0(mContext, true, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemTradeProfileFragment$initToolsList$2$onBindViewHolder$2.1
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ b2 invoke() {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44538, new Class[0], Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            invoke2();
                                            return b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44537, new Class[0], Void.TYPE).isSupported) {
                                                return;
                                            }
                                            Activity activity = ((com.max.hbcommon.base.d) itemTradeProfileFragment2).mContext;
                                            TradeAutoGetInfoActivity.b bVar = TradeAutoGetInfoActivity.L3;
                                            activity.startActivity(bVar.d(((com.max.hbcommon.base.d) itemTradeProfileFragment2).mContext, bVar.c()));
                                        }
                                    }, 12, null);
                                }
                            }
                        });
                        return;
                    }
                }
                if (adapterPosition == 1) {
                    textView.setText("微信通知");
                    MallTradeHomeObj mallTradeHomeObj2 = this.f92544b.f92511d;
                    String wechat_notification = mallTradeHomeObj2 != null ? mallTradeHomeObj2.getWechat_notification() : null;
                    if (wechat_notification == null || wechat_notification.length() == 0) {
                        imageView.setImageResource(R.drawable.market_operation_set_wechat_40x40);
                    } else {
                        MallTradeHomeObj mallTradeHomeObj3 = this.f92544b.f92511d;
                        if (f0.g("2", mallTradeHomeObj3 != null ? mallTradeHomeObj3.getWechat_notification() : null)) {
                            imageView.setImageResource(R.drawable.market_operation_set_wechat_40x40);
                        } else {
                            imageView.setImageResource(R.drawable.market_operation_set_wechat_highlight_40x40);
                        }
                    }
                    viewHolder.itemView.setOnClickListener(new b(this.f92544b));
                    return;
                }
                if (adapterPosition == 2) {
                    textView.setText("出售设置");
                    MallTradeHomeObj mallTradeHomeObj4 = this.f92544b.f92511d;
                    if (f0.g("1", mallTradeHomeObj4 != null ? mallTradeHomeObj4.getSale_setting() : null)) {
                        imageView.setImageResource(R.drawable.market_operation_set_sell_on_40x40);
                    } else {
                        imageView.setImageResource(R.drawable.market_operation_set_sell_off_40x40);
                    }
                    viewHolder.itemView.setOnClickListener(new c(this.f92544b));
                    return;
                }
                if (adapterPosition == 3) {
                    textView.setText("防骗指南");
                    imageView.setImageResource(R.drawable.market_operation_help_antifraud_40x40);
                    viewHolder.itemView.setOnClickListener(new d(this.f92544b));
                } else if (adapterPosition == 4) {
                    textView.setText("帮助&反馈");
                    imageView.setImageResource(R.drawable.market_operation_help_40x40);
                    viewHolder.itemView.setOnClickListener(new e(this.f92544b));
                } else {
                    if (adapterPosition != 5) {
                        return;
                    }
                    imageView.setImageResource(R.drawable.market_operation_wiki_40x40);
                    textView.setText("CSGO百科");
                    viewHolder.itemView.setOnClickListener(new f(this.f92544b));
                }
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj2) {
                if (PatchProxy.proxy(new Object[]{eVar, keyDescObj2}, this, changeQuickRedirect, false, 44534, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, keyDescObj2);
            }
        };
        RecyclerView recyclerView = this.I;
        com.max.hbcommon.base.adapter.s<KeyDescObj> sVar = null;
        if (recyclerView == null) {
            f0.S("rv_tools");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 5));
        RecyclerView recyclerView2 = this.I;
        if (recyclerView2 == null) {
            f0.S("rv_tools");
            recyclerView2 = null;
        }
        com.max.hbcommon.base.adapter.s<KeyDescObj> sVar2 = this.R;
        if (sVar2 == null) {
            f0.S("mToolsAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView2.setAdapter(sVar);
    }

    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44504, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f92530w;
        ObjectAnimator objectAnimator = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new j());
        SmartRefreshLayout smartRefreshLayout2 = this.f92530w;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        View view = this.f92531x;
        if (view == null) {
            f0.S("vg_profile_info_1");
            view = null;
        }
        view.setOnClickListener(new k());
        View view2 = this.f92532y;
        if (view2 == null) {
            f0.S("vg_profile_info_2");
            view2 = null;
        }
        view2.setOnClickListener(new l());
        View view3 = this.f92533z;
        if (view3 == null) {
            f0.S("vg_profile_info_3");
            view3 = null;
        }
        view3.setOnClickListener(new m());
        View view4 = this.A;
        if (view4 == null) {
            f0.S("vg_order_info_1");
            view4 = null;
        }
        view4.setOnClickListener(new n());
        View view5 = this.B;
        if (view5 == null) {
            f0.S("vg_order_info_2");
            view5 = null;
        }
        view5.setOnClickListener(new o());
        View view6 = this.C;
        if (view6 == null) {
            f0.S("vg_order_info_3");
            view6 = null;
        }
        view6.setOnClickListener(new p());
        View view7 = this.D;
        if (view7 == null) {
            f0.S("vg_order_info_4");
            view7 = null;
        }
        view7.setOnClickListener(new q());
        View view8 = this.E;
        if (view8 == null) {
            f0.S("vg_sell_info_1");
            view8 = null;
        }
        view8.setOnClickListener(new r());
        View view9 = this.F;
        if (view9 == null) {
            f0.S("vg_sell_info_2");
            view9 = null;
        }
        view9.setOnClickListener(new d());
        View view10 = this.G;
        if (view10 == null) {
            f0.S("vg_sell_info_3");
            view10 = null;
        }
        view10.setOnClickListener(new e());
        View view11 = this.H;
        if (view11 == null) {
            f0.S("vg_sell_info_4");
            view11 = null;
        }
        view11.setOnClickListener(new f());
        View view12 = this.J;
        if (view12 == null) {
            f0.S("mVgUpdate");
            view12 = null;
        }
        view12.setOnClickListener(new g());
        ViewGroup viewGroup = this.f92515h;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setOnClickListener(new h());
        TextView textView = this.f92529v;
        if (textView == null) {
            f0.S("tv_trade_check_message");
            textView = null;
        }
        textView.setOnClickListener(new i());
        ImageView imageView = this.K;
        if (imageView == null) {
            f0.S("mIvUpdateIcon");
            imageView = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, androidx.constraintlayout.motion.widget.f.f18721i, 0.0f, 360.0f);
        f0.o(objectAnimatorOfFloat, "ofFloat(mIvUpdateIcon, \"rotation\", 0f, 360f)");
        this.M = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat == null) {
            f0.S("mRotationAnimtor");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.setRepeatMode(1);
        ObjectAnimator objectAnimator2 = this.M;
        if (objectAnimator2 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator2 = null;
        }
        objectAnimator2.setDuration(1000L);
        ObjectAnimator objectAnimator3 = this.M;
        if (objectAnimator3 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator3 = null;
        }
        objectAnimator3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator4 = this.M;
        if (objectAnimator4 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator4 = null;
        }
        objectAnimator4.setRepeatCount(-1);
        ObjectAnimator objectAnimator5 = this.M;
        if (objectAnimator5 == null) {
            f0.S("mRotationAnimtor");
        } else {
            objectAnimator = objectAnimator5;
        }
        addValueAnimator(objectAnimator);
        f4();
    }

    private final void h4(int i10, TextView textView) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), textView}, this, changeQuickRedirect, false, 44511, new Class[]{Integer.TYPE, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = ViewUtils.f(this.mContext, 18.0f);
        if (i10 >= 100) {
            layoutParams2.width = -2;
            textView.setPadding(ViewUtils.f(this.mContext, 5.0f), 0, ViewUtils.f(this.mContext, 5.0f), 0);
            textView.setText("99+");
        } else {
            if (i10 >= 10) {
                layoutParams2.width = -2;
                textView.setPadding(ViewUtils.f(this.mContext, 5.0f), 0, ViewUtils.f(this.mContext, 5.0f), 0);
                textView.setText(i10 + "");
                return;
            }
            layoutParams2.width = ViewUtils.f(this.mContext, 18.0f);
            textView.setPadding(0, 0, 0, 0);
            textView.setText(i10 + "");
        }
    }

    private final void k4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44518, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.J;
        TextView textView = null;
        if (view == null) {
            f0.S("mVgUpdate");
            view = null;
        }
        view.setClickable(z10);
        ViewGroup viewGroup = this.f92515h;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setClickable(z10);
        TextView textView2 = this.f92529v;
        if (textView2 == null) {
            f0.S("tv_trade_check_message");
        } else {
            textView = textView2;
        }
        textView.setClickable(z10);
    }

    static /* synthetic */ void l4(ItemTradeProfileFragment itemTradeProfileFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 44519, new Class[]{ItemTradeProfileFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        itemTradeProfileFragment.k4(z10);
    }

    private final void o4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44514, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.J;
        ObjectAnimator objectAnimator = null;
        if (view == null) {
            f0.S("mVgUpdate");
            view = null;
        }
        view.setClickable(false);
        ImageView imageView = this.K;
        if (imageView == null) {
            f0.S("mIvUpdateIcon");
            imageView = null;
        }
        imageView.setVisibility(0);
        ObjectAnimator objectAnimator2 = this.M;
        if (objectAnimator2 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator2 = null;
        }
        if (!objectAnimator2.isRunning()) {
            ObjectAnimator objectAnimator3 = this.M;
            if (objectAnimator3 == null) {
                f0.S("mRotationAnimtor");
            } else {
                objectAnimator = objectAnimator3;
            }
            objectAnimator.start();
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().k7().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t(z10)));
    }

    static /* synthetic */ void p4(ItemTradeProfileFragment itemTradeProfileFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{itemTradeProfileFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 44515, new Class[]{ItemTradeProfileFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        itemTradeProfileFragment.o4(z10);
    }

    public final void i4(@dl.e MallTradeHomeObj mallTradeHomeObj) {
        String strValueOf;
        String strValueOf2;
        String selling;
        String purchasing;
        String bargain_buyer;
        if (PatchProxy.proxy(new Object[]{mallTradeHomeObj}, this, changeQuickRedirect, false, 44510, new Class[]{MallTradeHomeObj.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        String str = "";
        if (com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getBuy_orders() : null) > 0) {
            strValueOf = String.valueOf(com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getBuy_orders() : null));
        } else {
            strValueOf = "";
        }
        if (com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getSell_orders() : null) > 0) {
            strValueOf2 = String.valueOf(com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getSell_orders() : null));
        } else {
            strValueOf2 = "";
        }
        TextView textView2 = this.f92522o;
        if (textView2 == null) {
            f0.S("tv_buy_orders");
            textView2 = null;
        }
        textView2.setText("购买订单 " + strValueOf);
        TextView textView3 = this.f92523p;
        if (textView3 == null) {
            f0.S("tv_order_sell");
            textView3 = null;
        }
        textView3.setText("出售订单 " + strValueOf2);
        TextView textView4 = this.f92524q;
        if (textView4 == null) {
            f0.S("tv_selling");
            textView4 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("正在上架 ");
        if (mallTradeHomeObj == null || (selling = mallTradeHomeObj.getSelling()) == null) {
            selling = "";
        }
        sb2.append(selling);
        textView4.setText(sb2.toString());
        TextView textView5 = this.f92525r;
        if (textView5 == null) {
            f0.S("tv_want_to_buy");
            textView5 = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("我的求购 ");
        if (mallTradeHomeObj == null || (purchasing = mallTradeHomeObj.getPurchasing()) == null) {
            purchasing = "";
        }
        sb3.append(purchasing);
        textView5.setText(sb3.toString());
        TextView textView6 = this.f92520m;
        if (textView6 == null) {
            f0.S("tv_bargain_purchase");
            textView6 = null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("我的还价 ");
        if (mallTradeHomeObj != null && (bargain_buyer = mallTradeHomeObj.getBargain_buyer()) != null) {
            str = bargain_buyer;
        }
        sb4.append(str);
        textView6.setText(sb4.toString());
        int iQ = com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getReceiving() : null);
        TextView textView7 = this.f92526s;
        if (textView7 == null) {
            f0.S("tv_num_to_received");
            textView7 = null;
        }
        h4(iQ, textView7);
        int iQ2 = com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getDelivering() : null);
        TextView textView8 = this.f92527t;
        if (textView8 == null) {
            f0.S("tv_num_to_delivering");
            textView8 = null;
        }
        h4(iQ2, textView8);
        int iQ3 = com.max.hbutils.utils.n.q(mallTradeHomeObj != null ? mallTradeHomeObj.getBargain_seller() : null);
        TextView textView9 = this.f92521n;
        if (textView9 == null) {
            f0.S("tv_bargain_sell");
        } else {
            textView = textView9;
        }
        h4(iQ3, textView);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 44500, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.activity_item_trade_profile);
        this.O = rootView;
        b4();
        TitleBar titleBar = this.f92510c;
        TitleBar titleBar2 = null;
        if (titleBar == null) {
            f0.S("mToolbar");
            titleBar = null;
        }
        ViewGroup.LayoutParams layoutParams = titleBar.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += com.max.hbutils.utils.t.p(this.mContext);
        TitleBar titleBar3 = this.f92510c;
        if (titleBar3 == null) {
            f0.S("mToolbar");
            titleBar3 = null;
        }
        titleBar3.setBackgroundResource(R.color.transparent);
        if (getContext() instanceof com.max.hbminiprogram.h) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            TitleBar titleBar4 = this.f92510c;
            if (titleBar4 == null) {
                f0.S("mToolbar");
            } else {
                titleBar2 = titleBar4;
            }
            TradeInfoUtilKt.H(mContext, titleBar2, "我的饰品主页");
        } else {
            TitleBar titleBar5 = this.f92510c;
            if (titleBar5 == null) {
                f0.S("mToolbar");
                titleBar5 = null;
            }
            titleBar5.setTitle("我的饰品主页");
            Activity mContext2 = this.mContext;
            f0.o(mContext2, "mContext");
            TitleBar titleBar6 = this.f92510c;
            if (titleBar6 == null) {
                f0.S("mToolbar");
            } else {
                titleBar2 = titleBar6;
            }
            TradeInfoUtilKt.I(mContext2, titleBar2);
        }
        g4();
        showLoading();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j4() {
        AccountDetailObj profile;
        AccountDetailObj profile2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44509, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallTradeHomeObj mallTradeHomeObj = this.f92511d;
        TextView textView = null;
        SmartRefreshLayout smartRefreshLayout = null;
        String avartar = (mallTradeHomeObj == null || (profile2 = mallTradeHomeObj.getProfile()) == null) ? null : profile2.getAvartar();
        ImageView imageView = this.f92512e;
        if (imageView == null) {
            f0.S("iv_avatar");
            imageView = null;
        }
        com.max.hbimage.b.H(avartar, imageView);
        TextView textView2 = this.f92513f;
        if (textView2 == null) {
            f0.S("tv_name");
            textView2 = null;
        }
        MallTradeHomeObj mallTradeHomeObj2 = this.f92511d;
        textView2.setText((mallTradeHomeObj2 == null || (profile = mallTradeHomeObj2.getProfile()) == null) ? null : profile.getUsername());
        TextView textView3 = this.f92513f;
        if (textView3 == null) {
            f0.S("tv_name");
            textView3 = null;
        }
        textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        RelativeLayout relativeLayout = this.f92514g;
        if (relativeLayout == null) {
            f0.S("rl_medal_level");
            relativeLayout = null;
        }
        MallTradeHomeObj mallTradeHomeObj3 = this.f92511d;
        com.max.xiaoheihe.utils.d.h1(relativeLayout, mallTradeHomeObj3 != null ? mallTradeHomeObj3.getProfile() : null);
        ViewGroup viewGroup = this.f92515h;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        TextView textView4 = this.f92516i;
        if (textView4 == null) {
            f0.S("tv_login_desc");
            textView4 = null;
        }
        textView4.setVisibility(8);
        ViewGroup viewGroup2 = this.f92515h;
        if (viewGroup2 == null) {
            f0.S("vg_state");
            viewGroup2 = null;
        }
        MallTradeHomeObj mallTradeHomeObj4 = this.f92511d;
        Integer trade_state = mallTradeHomeObj4 != null ? mallTradeHomeObj4.getTrade_state() : null;
        MallTradeHomeObj mallTradeHomeObj5 = this.f92511d;
        TradeInfoUtilKt.C(viewGroup2, trade_state, mallTradeHomeObj5 != null ? mallTradeHomeObj5.getTrade_state_desc() : null);
        View view = this.f92531x;
        if (view == null) {
            f0.S("vg_profile_info_1");
            view = null;
        }
        view.setVisibility(0);
        View view2 = this.f92532y;
        if (view2 == null) {
            f0.S("vg_profile_info_2");
            view2 = null;
        }
        view2.setVisibility(0);
        View view3 = this.f92533z;
        if (view3 == null) {
            f0.S("vg_profile_info_3");
            view3 = null;
        }
        view3.setVisibility(0);
        TextView textView5 = this.f92517j;
        if (textView5 == null) {
            f0.S("tv_wallet_value");
            textView5 = null;
        }
        MallTradeHomeObj mallTradeHomeObj6 = this.f92511d;
        textView5.setText(mallTradeHomeObj6 != null ? mallTradeHomeObj6.getWallet_value() : null);
        TextView textView6 = this.f92518k;
        if (textView6 == null) {
            f0.S("tv_follow_num");
            textView6 = null;
        }
        MallTradeHomeObj mallTradeHomeObj7 = this.f92511d;
        textView6.setText(String.valueOf(mallTradeHomeObj7 != null ? mallTradeHomeObj7.getFollow_num() : null));
        TextView textView7 = this.f92519l;
        if (textView7 == null) {
            f0.S("tv_favour_num");
            textView7 = null;
        }
        MallTradeHomeObj mallTradeHomeObj8 = this.f92511d;
        textView7.setText(String.valueOf(mallTradeHomeObj8 != null ? mallTradeHomeObj8.getFavour_num() : null));
        MallTradeHomeObj mallTradeHomeObj9 = this.f92511d;
        boolean z10 = true;
        if (f0.g("waiting", mallTradeHomeObj9 != null ? mallTradeHomeObj9.getBtn_state() : null)) {
            ImageView imageView2 = this.K;
            if (imageView2 == null) {
                f0.S("mIvUpdateIcon");
                imageView2 = null;
            }
            imageView2.setVisibility(0);
            ObjectAnimator objectAnimator = this.M;
            if (objectAnimator == null) {
                f0.S("mRotationAnimtor");
                objectAnimator = null;
            }
            if (!objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.M;
                if (objectAnimator2 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator2 = null;
                }
                objectAnimator2.start();
            }
            this.N = false;
            e4(this, 1, false, 2, null);
            View view4 = this.J;
            if (view4 == null) {
                f0.S("mVgUpdate");
                view4 = null;
            }
            view4.setClickable(false);
        } else {
            ImageView imageView3 = this.K;
            if (imageView3 == null) {
                f0.S("mIvUpdateIcon");
                imageView3 = null;
            }
            imageView3.setVisibility(8);
            ObjectAnimator objectAnimator3 = this.M;
            if (objectAnimator3 == null) {
                f0.S("mRotationAnimtor");
                objectAnimator3 = null;
            }
            if (objectAnimator3.isRunning()) {
                ObjectAnimator objectAnimator4 = this.M;
                if (objectAnimator4 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator4 = null;
                }
                objectAnimator4.end();
            }
            View view5 = this.J;
            if (view5 == null) {
                f0.S("mVgUpdate");
                view5 = null;
            }
            view5.setClickable(true);
        }
        MallTradeHomeObj mallTradeHomeObj10 = this.f92511d;
        String btn_desc = mallTradeHomeObj10 != null ? mallTradeHomeObj10.getBtn_desc() : null;
        if ((btn_desc == null || btn_desc.length() == 0) == true) {
            View view6 = this.J;
            if (view6 == null) {
                f0.S("mVgUpdate");
                view6 = null;
            }
            view6.setVisibility(8);
        } else {
            View view7 = this.J;
            if (view7 == null) {
                f0.S("mVgUpdate");
                view7 = null;
            }
            view7.setVisibility(0);
            TextView textView8 = this.L;
            if (textView8 == null) {
                f0.S("mTvUpdateBtnDesc");
                textView8 = null;
            }
            MallTradeHomeObj mallTradeHomeObj11 = this.f92511d;
            textView8.setText(mallTradeHomeObj11 != null ? mallTradeHomeObj11.getBtn_desc() : null);
        }
        MallTradeHomeObj mallTradeHomeObj12 = this.f92511d;
        String trade_check_message = mallTradeHomeObj12 != null ? mallTradeHomeObj12.getTrade_check_message() : null;
        if (trade_check_message != null && trade_check_message.length() != 0) {
            z10 = false;
        }
        if (z10) {
            TextView textView9 = this.f92529v;
            if (textView9 == null) {
                f0.S("tv_trade_check_message");
                textView9 = null;
            }
            textView9.setVisibility(8);
            SmartRefreshLayout smartRefreshLayout2 = this.f92530w;
            if (smartRefreshLayout2 == null) {
                f0.S("mRefreshLayout");
            } else {
                smartRefreshLayout = smartRefreshLayout2;
            }
            ViewGroup.LayoutParams layoutParams = smartRefreshLayout.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(this.mContext, 4.0f);
            return;
        }
        TextView textView10 = this.f92529v;
        if (textView10 == null) {
            f0.S("tv_trade_check_message");
            textView10 = null;
        }
        textView10.setVisibility(0);
        SmartRefreshLayout smartRefreshLayout3 = this.f92530w;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = smartRefreshLayout3.getLayoutParams();
        f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(this.mContext, 0.0f);
        StringBuilder sb2 = new StringBuilder();
        MallTradeHomeObj mallTradeHomeObj13 = this.f92511d;
        sb2.append(mallTradeHomeObj13 != null ? mallTradeHomeObj13.getTrade_check_message() : null);
        sb2.append(" \uf0da");
        String string = sb2.toString();
        TextView textView11 = this.f92529v;
        if (textView11 == null) {
            f0.S("tv_trade_check_message");
            textView11 = null;
        }
        bb.d.d(textView11, 0);
        TextView textView12 = this.f92529v;
        if (textView12 == null) {
            f0.S("tv_trade_check_message");
        } else {
            textView = textView12;
        }
        textView.setText(string);
    }

    public final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44508, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        j4();
        i4(this.f92511d);
        com.max.hbcommon.base.adapter.s<KeyDescObj> sVar = this.R;
        if (sVar == null) {
            f0.S("mToolsAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
    }

    public final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44513, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        ImageView imageView = this.f92512e;
        View view = null;
        if (imageView == null) {
            f0.S("iv_avatar");
            imageView = null;
        }
        imageView.setImageResource(R.drawable.common_default_avatar_40x40);
        TextView textView = this.f92513f;
        if (textView == null) {
            f0.S("tv_name");
            textView = null;
        }
        textView.setText("点击登录");
        TextView textView2 = this.f92513f;
        if (textView2 == null) {
            f0.S("tv_name");
            textView2 = null;
        }
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        ViewGroup viewGroup = this.f92515h;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setVisibility(8);
        TextView textView3 = this.f92516i;
        if (textView3 == null) {
            f0.S("tv_login_desc");
            textView3 = null;
        }
        textView3.setVisibility(0);
        View view2 = this.f92531x;
        if (view2 == null) {
            f0.S("vg_profile_info_1");
            view2 = null;
        }
        view2.setVisibility(8);
        View view3 = this.f92532y;
        if (view3 == null) {
            f0.S("vg_profile_info_2");
            view3 = null;
        }
        view3.setVisibility(8);
        View view4 = this.f92533z;
        if (view4 == null) {
            f0.S("vg_profile_info_3");
            view4 = null;
        }
        view4.setVisibility(8);
        i4(null);
        View view5 = this.f92528u;
        if (view5 == null) {
            f0.S("vg_profile");
        } else {
            view = view5;
        }
        view.setOnClickListener(new s());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.b, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44507, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        if (i0.s()) {
            c4();
        } else {
            n4();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44501, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        TitleBar titleBar = this.f92510c;
        if (titleBar == null) {
            f0.S("mToolbar");
            titleBar = null;
        }
        TradeMsgBroadcastReceiver tradeMsgBroadcastReceiver = new TradeMsgBroadcastReceiver(titleBar, getContext() instanceof com.max.hbminiprogram.h);
        this.P = tradeMsgBroadcastReceiver;
        registerReceiver(tradeMsgBroadcastReceiver, lb.a.N);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44512, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (i0.s()) {
            c4();
        } else {
            n4();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44502, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.P);
    }
}
