package com.max.xiaoheihe.module.littleprogram.fragment.pubg;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.chart.RadarView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.pubg.PUBGDataObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGGameModeFilter;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchListObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGStatsDetailObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGStatsObj;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import df.ta;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PUBGDetailV2Fragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.game.pubg.e.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f89184t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f89185u = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private PUBGStatsDetailObj f89186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f89187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f89188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f89189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f89190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f89191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f89192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.littleprogram.fragment.pubg.a f89193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private s<PUBGStatsObj> f89194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private s<PUBGMatchObj> f89195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private List<PUBGDataObj> f89196l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private List<PUBGStatsObj> f89197m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private List<PUBGGameModeFilter> f89198n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private ArrayList<PUBGMatchObj> f89199o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private GridView f89200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private PopupWindow f89201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f89202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ta f89203s;

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @m
        public PUBGDetailV2Fragment a(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 39446, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailV2Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (PUBGDetailV2Fragment) patchProxyResultProxy.result;
            }
            PUBGDetailV2Fragment pUBGDetailV2Fragment = new PUBGDetailV2Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("nickname", str);
            bundle.putString("mode", str2);
            bundle.putString("season", str3);
            bundle.putString("region", str5);
            bundle.putString("fpp", str4);
            bundle.putString("player_id", str6);
            pUBGDetailV2Fragment.setArguments(bundle);
            return pUBGDetailV2Fragment;
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PUBGMatchListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39459, new Class[0], Void.TYPE).isSupported && PUBGDetailV2Fragment.this.isActive()) {
                ta taVar = PUBGDetailV2Fragment.this.f89203s;
                ta taVar2 = null;
                if (taVar == null) {
                    f0.S("binding");
                    taVar = null;
                }
                taVar.f115915i.A(0);
                ta taVar3 = PUBGDetailV2Fragment.this.f89203s;
                if (taVar3 == null) {
                    f0.S("binding");
                } else {
                    taVar2 = taVar3;
                }
                taVar2.f115915i.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39460, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (PUBGDetailV2Fragment.this.isActive()) {
                ta taVar = PUBGDetailV2Fragment.this.f89203s;
                ta taVar2 = null;
                if (taVar == null) {
                    f0.S("binding");
                    taVar = null;
                }
                taVar.f115915i.A(0);
                ta taVar3 = PUBGDetailV2Fragment.this.f89203s;
                if (taVar3 == null) {
                    f0.S("binding");
                    taVar3 = null;
                }
                taVar3.f115915i.p(0);
                ta taVar4 = PUBGDetailV2Fragment.this.f89203s;
                if (taVar4 == null) {
                    f0.S("binding");
                } else {
                    taVar2 = taVar4;
                }
                taVar2.f115919m.b().setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<PUBGMatchListObj> pubgMatchListObjResult) {
            if (PatchProxy.proxy(new Object[]{pubgMatchListObjResult}, this, changeQuickRedirect, false, 39461, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(pubgMatchListObjResult, "pubgMatchListObjResult");
            if (PUBGDetailV2Fragment.this.isActive()) {
                if (pubgMatchListObjResult.getResult() != null) {
                    PUBGDetailV2Fragment.V3(PUBGDetailV2Fragment.this, pubgMatchListObjResult.getResult());
                    return;
                }
                ta taVar = PUBGDetailV2Fragment.this.f89203s;
                if (taVar == null) {
                    f0.S("binding");
                    taVar = null;
                }
                taVar.f115919m.b().setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39462, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGMatchListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class c implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridView f89205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PopupWindow f89206b;

        c(GridView gridView, PopupWindow popupWindow) {
            this.f89205a = gridView;
            this.f89206b = popupWindow;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39464, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            this.f89205a.setVisibility(8);
            this.f89206b.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39465, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39463, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class d extends s<PUBGMatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Activity activity, ArrayList<PUBGMatchObj> arrayList) {
            super(activity, arrayList, R.layout.item_pubg_matches_v2);
        }

        public void m(@dl.d s.e viewHolder, @dl.d PUBGMatchObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 39466, new Class[]{s.e.class, PUBGMatchObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            PUBGDetailV2Fragment.U3(PUBGDetailV2Fragment.this, viewHolder.itemView, data, viewHolder.getAdapterPosition() == getItemCount() - 1);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 39467, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, pUBGMatchObj);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39470, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PUBGDetailV2Fragment.this.f89202r = 0;
            PUBGDetailV2Fragment.P3(PUBGDetailV2Fragment.this);
            PUBGDetailV2Fragment.R3(PUBGDetailV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class f implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39471, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            PUBGDetailV2Fragment.this.f89202r += 30;
            PUBGDetailV2Fragment.R3(PUBGDetailV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PUBGMatchObj f89211c;

        g(PUBGMatchObj pUBGMatchObj) {
            this.f89211c = pUBGMatchObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39472, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) PUBGDetailV2Fragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.j0(mContext, this.f89211c.getProtocol());
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39473, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailV2Fragment pUBGDetailV2Fragment = PUBGDetailV2Fragment.this;
            Activity mContext = ((com.max.hbcommon.base.d) pUBGDetailV2Fragment).mContext;
            f0.o(mContext, "mContext");
            PUBGDetailV2Fragment.a4(pUBGDetailV2Fragment, mContext, view, PUBGDetailV2Fragment.this.c4(), PUBGDetailV2Fragment.this);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f89219c;

        i(Context context) {
            this.f89219c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39474, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailV2Fragment pUBGDetailV2Fragment = PUBGDetailV2Fragment.this;
            Context context = this.f89219c;
            PopupWindow popupWindow = pUBGDetailV2Fragment.f89201q;
            GridView gridView = PUBGDetailV2Fragment.this.f89200p;
            f0.m(gridView);
            pUBGDetailV2Fragment.i4(context, popupWindow, gridView);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class j implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39475, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            ta taVar = PUBGDetailV2Fragment.this.f89203s;
            if (taVar == null) {
                f0.S("binding");
                taVar = null;
            }
            taVar.f115908b.setRotationX(0.0f);
        }
    }

    /* JADX INFO: compiled from: PUBGDetailV2Fragment.kt */
    public static final class k implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39477, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39478, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(@dl.d Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 39476, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            GridView gridView = PUBGDetailV2Fragment.this.f89200p;
            f0.m(gridView);
            gridView.setVisibility(0);
        }
    }

    private final boolean L3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39426, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<PUBGGameModeFilter> it = this.f89198n.iterator();
        while (it.hasNext()) {
            if (f0.g(this.f89188d, it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ void P3(PUBGDetailV2Fragment pUBGDetailV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment}, null, changeQuickRedirect, true, 39440, new Class[]{PUBGDetailV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.b4();
    }

    public static final /* synthetic */ void R3(PUBGDetailV2Fragment pUBGDetailV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment}, null, changeQuickRedirect, true, 39441, new Class[]{PUBGDetailV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.f4();
    }

    public static final /* synthetic */ void U3(PUBGDetailV2Fragment pUBGDetailV2Fragment, View view, PUBGMatchObj pUBGMatchObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment, view, pUBGMatchObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39439, new Class[]{PUBGDetailV2Fragment.class, View.class, PUBGMatchObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.l4(view, pUBGMatchObj, z10);
    }

    public static final /* synthetic */ void V3(PUBGDetailV2Fragment pUBGDetailV2Fragment, PUBGMatchListObj pUBGMatchListObj) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment, pUBGMatchListObj}, null, changeQuickRedirect, true, 39438, new Class[]{PUBGDetailV2Fragment.class, PUBGMatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.m4(pUBGMatchListObj);
    }

    public static final /* synthetic */ void X3(PUBGDetailV2Fragment pUBGDetailV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment}, null, changeQuickRedirect, true, 39443, new Class[]{PUBGDetailV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.showContentView();
    }

    public static final /* synthetic */ void Y3(PUBGDetailV2Fragment pUBGDetailV2Fragment, PUBGStatsDetailObj pUBGStatsDetailObj) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment, pUBGStatsDetailObj}, null, changeQuickRedirect, true, 39445, new Class[]{PUBGDetailV2Fragment.class, PUBGStatsDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.v4(pUBGStatsDetailObj);
    }

    public static final /* synthetic */ void Z3(PUBGDetailV2Fragment pUBGDetailV2Fragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment}, null, changeQuickRedirect, true, 39444, new Class[]{PUBGDetailV2Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.showError();
    }

    public static final /* synthetic */ void a4(PUBGDetailV2Fragment pUBGDetailV2Fragment, Context context, View view, List list, com.max.xiaoheihe.module.game.pubg.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailV2Fragment, context, view, list, bVar}, null, changeQuickRedirect, true, 39442, new Class[]{PUBGDetailV2Fragment.class, Context.class, View.class, List.class, com.max.xiaoheihe.module.game.pubg.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailV2Fragment.w4(context, view, list, bVar);
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39431, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Yb(this.f89189e, this.f89190f, this.f89187c, this.f89191g, this.f89188d, this.f89192h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<PUBGStatsDetailObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onComplete() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39447, new Class[0], Void.TYPE).isSupported && this.f89212b.isActive()) {
                    ta taVar = null;
                    if (this.f89212b.getParentFragment() instanceof d) {
                        k.f(r0.a(e1.e()), null, null, new PUBGDetailV2Fragment$getData$1$onComplete$1(this.f89212b, null), 3, null);
                    }
                    ta taVar2 = this.f89212b.f89203s;
                    if (taVar2 == null) {
                        f0.S("binding");
                    } else {
                        taVar = taVar2;
                    }
                    taVar.f115915i.A(0);
                    PUBGDetailV2Fragment.X3(this.f89212b);
                    super.onComplete();
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39448, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89212b.isActive()) {
                    ta taVar = null;
                    if (this.f89212b.getParentFragment() instanceof d) {
                        k.f(r0.a(e1.e()), null, null, new PUBGDetailV2Fragment$getData$1$onError$1(this.f89212b, null), 3, null);
                    }
                    ta taVar2 = this.f89212b.f89203s;
                    if (taVar2 == null) {
                        f0.S("binding");
                    } else {
                        taVar = taVar2;
                    }
                    taVar.f115915i.A(0);
                    super.onError(e10);
                    PUBGDetailV2Fragment.Z3(this.f89212b);
                }
            }

            public void onNext(@dl.d Result<PUBGStatsDetailObj> statsResult) {
                if (PatchProxy.proxy(new Object[]{statsResult}, this, changeQuickRedirect, false, 39449, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(statsResult, "statsResult");
                if (this.f89212b.isActive()) {
                    PUBGDetailV2Fragment.Y3(this.f89212b, statsResult.getResult());
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39450, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<PUBGStatsDetailObj>) obj);
            }
        }));
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39420, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        f0.m(arguments);
        this.f89189e = arguments.getString("nickname");
        Bundle arguments2 = getArguments();
        f0.m(arguments2);
        this.f89190f = arguments2.getString("season");
        Bundle arguments3 = getArguments();
        f0.m(arguments3);
        this.f89187c = arguments3.getString("region");
        Bundle arguments4 = getArguments();
        f0.m(arguments4);
        this.f89188d = arguments4.getString("mode");
        Bundle arguments5 = getArguments();
        f0.m(arguments5);
        this.f89191g = arguments5.getString("fpp");
        Bundle arguments6 = getArguments();
        f0.m(arguments6);
        String string = arguments6.getString("player_id");
        this.f89192h = string;
        if (TextUtils.isEmpty(string)) {
            this.f89192h = this.f89189e;
        }
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39417, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i2(this.f89189e, this.f89202r, 30, this.f89190f, this.f89187c, this.f89191g, this.f89188d, this.f89192h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39421, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.littleprogram.fragment.pubg.a aVar = new com.max.xiaoheihe.module.littleprogram.fragment.pubg.a(this.mContext, this.f89196l, 4, this.f89188d);
        this.f89193i = aVar;
        aVar.s(Integer.valueOf(ViewUtils.f(this.mContext, 3.0f)));
        ta taVar = this.f89203s;
        ta taVar2 = null;
        if (taVar == null) {
            f0.S("binding");
            taVar = null;
        }
        taVar.f115913g.setLayoutManager(new GridLayoutManager(this.mContext, 4));
        ta taVar3 = this.f89203s;
        if (taVar3 == null) {
            f0.S("binding");
            taVar3 = null;
        }
        taVar3.f115913g.setAdapter(this.f89193i);
        this.f89195k = new d(this.mContext, this.f89199o);
        ta taVar4 = this.f89203s;
        if (taVar4 == null) {
            f0.S("binding");
            taVar4 = null;
        }
        RecyclerView recyclerView = taVar4.f115919m.f112493b;
        final Activity activity = this.mContext;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$initRV$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        ta taVar5 = this.f89203s;
        if (taVar5 == null) {
            f0.S("binding");
            taVar5 = null;
        }
        taVar5.f115919m.f112493b.setAdapter(this.f89195k);
        final Activity activity2 = this.mContext;
        final List<PUBGStatsObj> list = this.f89197m;
        this.f89194j = new s<PUBGStatsObj>(activity2, list) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$initRV$3
            public static ChangeQuickRedirect changeQuickRedirect;

            public void m(@dl.d s.e viewHolder, @e PUBGStatsObj pUBGStatsObj) {
                if (PatchProxy.proxy(new Object[]{viewHolder, pUBGStatsObj}, this, changeQuickRedirect, false, 39468, new Class[]{s.e.class, PUBGStatsObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                RecyclerView recyclerView2 = (RecyclerView) viewHolder.i(R.id.rv_data);
                TextView textView = (TextView) viewHolder.i(R.id.tv_score);
                if (recyclerView2.getLayoutManager() == null) {
                    final Activity activity3 = ((com.max.hbcommon.base.d) this.f89220b).mContext;
                    recyclerView2.setLayoutManager(new GridLayoutManager(activity3) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$initRV$3$onBindViewHolder$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public boolean canScrollVertically() {
                            return false;
                        }
                    });
                }
                if (recyclerView2.getAdapter() == null) {
                    a aVar2 = new a(((com.max.hbcommon.base.d) this.f89220b).mContext, pUBGStatsObj != null ? pUBGStatsObj.getOverview() : null, -1);
                    aVar2.s(Integer.valueOf(ViewUtils.f(((com.max.hbcommon.base.d) this.f89220b).mContext, 3.0f)));
                    recyclerView2.setAdapter(aVar2);
                } else {
                    a aVar3 = (a) recyclerView2.getAdapter();
                    f0.m(aVar3);
                    aVar3.p(pUBGStatsObj != null ? pUBGStatsObj.getOverview() : null);
                }
                viewHolder.p(R.id.tv_desc, pUBGStatsObj != null ? pUBGStatsObj.getDesc() : null);
                textView.setText(pUBGStatsObj != null ? pUBGStatsObj.getScore_value() : null);
                textView.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(this.f89220b.f89188d));
                bb.d.d(textView, 5);
                com.max.hbimage.b.H(pUBGStatsObj != null ? pUBGStatsObj.getImg() : null, (ImageView) viewHolder.i(R.id.iv_icon));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGStatsObj pUBGStatsObj) {
                if (PatchProxy.proxy(new Object[]{eVar, pUBGStatsObj}, this, changeQuickRedirect, false, 39469, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, pUBGStatsObj);
            }
        };
        ta taVar6 = this.f89203s;
        if (taVar6 == null) {
            f0.S("binding");
            taVar6 = null;
        }
        RecyclerView recyclerView2 = taVar6.f115914h;
        final Activity activity3 = this.mContext;
        recyclerView2.setLayoutManager(new LinearLayoutManager(activity3) { // from class: com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGDetailV2Fragment$initRV$4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        ta taVar7 = this.f89203s;
        if (taVar7 == null) {
            f0.S("binding");
            taVar7 = null;
        }
        taVar7.f115914h.setAdapter(this.f89194j);
        ta taVar8 = this.f89203s;
        if (taVar8 == null) {
            f0.S("binding");
            taVar8 = null;
        }
        taVar8.f115915i.S(new e());
        ta taVar9 = this.f89203s;
        if (taVar9 == null) {
            f0.S("binding");
        } else {
            taVar2 = taVar9;
        }
        taVar2.f115915i.f0(new f());
    }

    @dl.d
    @m
    public static PUBGDetailV2Fragment k4(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, @dl.e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 39437, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailV2Fragment.class);
        return patchProxyResultProxy.isSupported ? (PUBGDetailV2Fragment) patchProxyResultProxy.result : f89184t.a(str, str2, str3, str4, str5, str6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x05e4  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v16 int, still in use, count: 1, list:
  (r1v16 int) from 0x056f: IF  (r1v16 int) != (83 int)  -> B:55:0x0571 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private final void l4(View view, PUBGMatchObj pUBGMatchObj, boolean z10) {
        char c10;
        if (PatchProxy.proxy(new Object[]{view, pUBGMatchObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39419, new Class[]{View.class, PUBGMatchObj.class, Boolean.TYPE}, Void.TYPE).isSupported || view == null) {
            return;
        }
        if (pUBGMatchObj == null) {
            view.setVisibility(8);
            return;
        }
        View viewFindViewById = view.findViewById(R.id.v_item_matches_sign);
        View viewFindViewById2 = view.findViewById(R.id.tv_item_matches_count);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_rank);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.vg_matches_count);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_rank);
        f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_rank_header);
        f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_team_count);
        f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_item_matches_time);
        f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.iv_item_matches_mode);
        f0.n(viewFindViewById9, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_item_matches_rating);
        f0.n(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tv_item_matches_rating_diff);
        f0.n(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.tv_item_matches_rating_hint);
        f0.n(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView8 = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_item_matches_kd);
        f0.n(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView9 = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.tv_item_matches_kd_hint);
        f0.n(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView10 = (TextView) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.tv_item_matches_score);
        f0.n(viewFindViewById15, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView11 = (TextView) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.v_item_matches_divider);
        View viewFindViewById17 = view.findViewById(R.id.tv_item_matches_region);
        f0.n(viewFindViewById17, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView12 = (TextView) viewFindViewById17;
        View viewFindViewById18 = view.findViewById(R.id.tv_fpp);
        f0.n(viewFindViewById18, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView13 = (TextView) viewFindViewById18;
        View viewFindViewById19 = view.findViewById(R.id.tv_map);
        f0.n(viewFindViewById19, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView14 = (TextView) viewFindViewById19;
        com.max.hbimage.b.R(pUBGMatchObj.getMode_img(), imageView, 0, ViewUtils.f(this.mContext, 11.0f), 1, -1);
        imageView.setImageTintList(ColorStateList.valueOf(this.mContext.getResources().getColor(R.color.white_alpha30)));
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(8);
            textView.setText(pUBGMatchObj.getMatch_count());
        } else {
            viewGroup.setVisibility(0);
            viewGroup2.setVisibility(8);
            textView2.setText(pUBGMatchObj.getRank());
            textView4.setText(IOUtils.DIR_SEPARATOR_UNIX + pUBGMatchObj.getTeam_count());
        }
        textView5.setText(pUBGMatchObj.getTime());
        textView6.setText(pUBGMatchObj.getRating());
        textView7.setText(pUBGMatchObj.getRating_diff());
        float f10 = ViewUtils.f(getContext(), 3.0f);
        int iF = ViewUtils.f(getContext(), 2.0f);
        textView3.setTextColor(this.mContext.getResources().getColor(R.color.black));
        textView2.setTextColor(this.mContext.getResources().getColor(R.color.black));
        textView4.setTextColor(this.mContext.getResources().getColor(R.color.black_alpha80));
        if (f0.g(CommonNetImpl.UP, pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.green_70));
        } else if (f0.g("down", pUBGMatchObj.getRating_trend())) {
            textView7.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.red_208));
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getMatchId())) {
            if (f0.g("win", pUBGMatchObj.getTag())) {
                viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.orange_255_110)));
                viewFindViewById.setVisibility(0);
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.orange_255_110), this.mContext.getResources().getColor(R.color.orange_255_110)));
            } else if (f0.g("top10", pUBGMatchObj.getTag())) {
                viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.yellow_255)));
                viewFindViewById.setVisibility(0);
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.yellow_255), this.mContext.getResources().getColor(R.color.yellow_255)));
            } else {
                textView3.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
                textView2.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
                textView4.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
                viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.white_alpha10)));
                textView8.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_2_color));
                viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.white), this.mContext.getResources().getColor(R.color.white)));
                viewFindViewById.setVisibility(4);
            }
        } else if (n.q(pUBGMatchObj.getRank()) == 1) {
            viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.orange_255_110)));
            viewFindViewById.setVisibility(0);
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.orange_255_110), this.mContext.getResources().getColor(R.color.orange_255_110)));
        } else if (n.q(pUBGMatchObj.getRank()) <= 10) {
            viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.yellow_255)));
            viewFindViewById.setVisibility(0);
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.yellow_255), this.mContext.getResources().getColor(R.color.yellow_255)));
        } else {
            textView3.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
            textView2.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
            textView4.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha50));
            viewGroup.setBackground(ViewUtils.G(iF, this.mContext.getResources().getColor(R.color.white_alpha10)));
            textView8.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
            viewFindViewById.setBackground(ViewUtils.I(new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f}, this.mContext.getResources().getColor(R.color.white), this.mContext.getResources().getColor(R.color.white)));
            viewFindViewById.setVisibility(4);
        }
        if (TextUtils.isEmpty(pUBGMatchObj.getTag_desc())) {
            textView8.setVisibility(8);
            c10 = 0;
        } else {
            c10 = 0;
            textView8.setVisibility(0);
            textView8.setText(pUBGMatchObj.getTag_desc());
        }
        String[] strArr = new String[2];
        strArr[c10] = pUBGMatchObj.getMap_name();
        strArr[1] = pUBGMatchObj.getMap_color();
        if (com.max.hbcommon.utils.c.v(strArr)) {
            textView14.setVisibility(8);
        } else {
            textView14.setText(pUBGMatchObj.getMap_name());
            textView14.setBackground(ViewUtils.G(ViewUtils.f(this.mContext, 2.0f), com.max.xiaoheihe.utils.d.e1(pUBGMatchObj.getMap_color())));
            textView14.setVisibility(0);
        }
        if (com.max.hbcommon.utils.c.u(pUBGMatchObj.getDamage_dealt())) {
            textView9.setText(pUBGMatchObj.getKd());
        } else {
            textView9.setText(pUBGMatchObj.getDamage_dealt());
        }
        textView12.setText(pUBGMatchObj.getRegion_desc());
        String mode = pUBGMatchObj.getMode();
        f0.o(mode, "obj.mode");
        if (StringsKt__StringsKt.W2(mode, "fpp", false, 2, null)) {
            textView13.setVisibility(0);
        } else {
            textView13.setVisibility(8);
        }
        textView10.setText(pUBGMatchObj.getK());
        textView11.setText(pUBGMatchObj.getScore());
        String score = pUBGMatchObj.getScore();
        f0.o(score, "obj.score");
        Locale locale = Locale.getDefault();
        f0.o(locale, "getDefault()");
        String upperCase = score.toUpperCase(locale);
        f0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (upperCase.hashCode() != 83) {
            switch (upperCase) {
                case "A":
                    textView11.setTextColor(this.mContext.getResources().getColor(R.color.yellow_255));
                    break;
                case "B":
                    textView11.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
                    break;
                case "C":
                    textView11.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
                    break;
                case "D":
                    textView11.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
                    break;
                default:
                    textView11.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
                    break;
            }
        } else if (upperCase.equals(androidx.exifinterface.media.a.R4)) {
            textView11.setTextColor(this.mContext.getResources().getColor(R.color.orange_255_110));
        } else {
            textView11.setTextColor(this.mContext.getResources().getColor(R.color.white_alpha30));
        }
        view.setOnClickListener(new g(pUBGMatchObj));
        if (z10) {
            viewFindViewById16.setVisibility(4);
        } else {
            viewFindViewById16.setVisibility(0);
        }
    }

    private final void m4(PUBGMatchListObj pUBGMatchListObj) {
        int i10;
        s<PUBGMatchObj> sVar;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{pUBGMatchListObj}, this, changeQuickRedirect, false, 39418, new Class[]{PUBGMatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f89202r == 0) {
            this.f89199o.clear();
        }
        int size = this.f89199o.size();
        ta taVar = null;
        List<PUBGMatchObj> matches = pUBGMatchListObj != null ? pUBGMatchListObj.getMatches() : null;
        if (matches != null && !matches.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            List<PUBGMatchObj> matches2 = pUBGMatchListObj != null ? pUBGMatchListObj.getMatches() : null;
            f0.m(matches2);
            i10 = 0;
            for (PUBGMatchObj pUBGMatchObj : matches2) {
                if (pUBGMatchObj != null) {
                    this.f89199o.add(pUBGMatchObj);
                    i10++;
                }
            }
        }
        if (this.f89202r == 0) {
            s<PUBGMatchObj> sVar2 = this.f89195k;
            if (sVar2 != null) {
                sVar2.notifyDataSetChanged();
            }
        } else if (i10 > 0 && (sVar = this.f89195k) != null) {
            sVar.notifyItemRangeInserted(size, i10);
        }
        if (this.f89199o.size() > 0) {
            ta taVar2 = this.f89203s;
            if (taVar2 == null) {
                f0.S("binding");
            } else {
                taVar = taVar2;
            }
            taVar.f115919m.b().setVisibility(0);
            return;
        }
        ta taVar3 = this.f89203s;
        if (taVar3 == null) {
            f0.S("binding");
        } else {
            taVar = taVar3;
        }
        taVar.f115919m.b().setVisibility(8);
    }

    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39427, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89198n.clear();
        PUBGStatsDetailObj pUBGStatsDetailObj = this.f89186b;
        ta taVar = null;
        List<PUBGGameModeFilter> modes = pUBGStatsDetailObj != null ? pUBGStatsDetailObj.getModes() : null;
        if (!com.max.hbcommon.utils.c.w(modes)) {
            List<PUBGGameModeFilter> list = this.f89198n;
            f0.m(modes);
            list.addAll(modes);
        }
        if (!L3() && this.f89198n.size() > 0) {
            String key = this.f89198n.get(0).getKey();
            this.f89188d = key;
            com.max.xiaoheihe.module.littleprogram.fragment.pubg.a aVar = this.f89193i;
            if (aVar != null) {
                aVar.q(key);
            }
            initData();
            return;
        }
        for (PUBGGameModeFilter pUBGGameModeFilter : this.f89198n) {
            if (f0.g(this.f89188d, pUBGGameModeFilter.getKey())) {
                ta taVar2 = this.f89203s;
                if (taVar2 == null) {
                    f0.S("binding");
                    taVar2 = null;
                }
                taVar2.f115917k.setText(pUBGGameModeFilter.getValue());
                ta taVar3 = this.f89203s;
                if (taVar3 == null) {
                    f0.S("binding");
                    taVar3 = null;
                }
                taVar3.f115916j.setText(pUBGGameModeFilter.getMatch_count());
                if (com.max.hbcommon.utils.c.u(pUBGGameModeFilter.getRating_img())) {
                    ta taVar4 = this.f89203s;
                    if (taVar4 == null) {
                        f0.S("binding");
                        taVar4 = null;
                    }
                    taVar4.f115910d.setVisibility(8);
                } else {
                    ta taVar5 = this.f89203s;
                    if (taVar5 == null) {
                        f0.S("binding");
                        taVar5 = null;
                    }
                    taVar5.f115910d.setVisibility(0);
                    String rating_img = pUBGGameModeFilter.getRating_img();
                    ta taVar6 = this.f89203s;
                    if (taVar6 == null) {
                        f0.S("binding");
                        taVar6 = null;
                    }
                    com.max.hbimage.b.K(rating_img, taVar6.f115910d);
                }
                pUBGGameModeFilter.setCustom_checked(true);
            }
        }
        ta taVar7 = this.f89203s;
        if (taVar7 == null) {
            f0.S("binding");
            taVar7 = null;
        }
        taVar7.f115917k.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(this.f89188d));
        ta taVar8 = this.f89203s;
        if (taVar8 == null) {
            f0.S("binding");
            taVar8 = null;
        }
        taVar8.f115909c.setImageResource(com.max.xiaoheihe.module.game.pubg.utils.c.c(this.f89188d));
        ta taVar9 = this.f89203s;
        if (taVar9 == null) {
            f0.S("binding");
        } else {
            taVar = taVar9;
        }
        taVar.f115909c.setColorFilter(com.max.xiaoheihe.module.game.pubg.utils.c.e(this.f89188d));
    }

    private final void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39425, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89196l.clear();
        PUBGStatsDetailObj pUBGStatsDetailObj = this.f89186b;
        ta taVar = null;
        List<PUBGDataObj> overview = pUBGStatsDetailObj != null ? pUBGStatsDetailObj.getOverview() : null;
        if (!com.max.hbcommon.utils.c.w(overview)) {
            List<PUBGDataObj> list = this.f89196l;
            f0.m(overview);
            list.addAll(overview);
        }
        if (com.max.hbcommon.utils.c.w(this.f89196l)) {
            ta taVar2 = this.f89203s;
            if (taVar2 == null) {
                f0.S("binding");
            } else {
                taVar = taVar2;
            }
            taVar.f115913g.setVisibility(8);
        } else {
            ta taVar3 = this.f89203s;
            if (taVar3 == null) {
                f0.S("binding");
            } else {
                taVar = taVar3;
            }
            taVar.f115913g.setVisibility(0);
        }
        com.max.xiaoheihe.module.littleprogram.fragment.pubg.a aVar = this.f89193i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    private final void p4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39424, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGStatsDetailObj pUBGStatsDetailObj = this.f89186b;
        ta taVar = null;
        List<PUBGDataObj> radar_score = pUBGStatsDetailObj != null ? pUBGStatsDetailObj.getRadar_score() : null;
        if (radar_score == null || radar_score.isEmpty()) {
            ta taVar2 = this.f89203s;
            if (taVar2 == null) {
                f0.S("binding");
            } else {
                taVar = taVar2;
            }
            taVar.f115920n.setVisibility(8);
            return;
        }
        ta taVar3 = this.f89203s;
        if (taVar3 == null) {
            f0.S("binding");
            taVar3 = null;
        }
        taVar3.f115920n.setVisibility(0);
        ta taVar4 = this.f89203s;
        if (taVar4 == null) {
            f0.S("binding");
            taVar4 = null;
        }
        RadarView radarView = taVar4.f115912f;
        PUBGStatsDetailObj pUBGStatsDetailObj2 = this.f89186b;
        com.max.xiaoheihe.module.game.pubg.utils.b.t(radarView, pUBGStatsDetailObj2 != null ? pUBGStatsDetailObj2.getRadar_score() : null);
    }

    private final void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39423, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89197m.clear();
        PUBGStatsDetailObj pUBGStatsDetailObj = this.f89186b;
        ta taVar = null;
        List<PUBGStatsObj> stats = pUBGStatsDetailObj != null ? pUBGStatsDetailObj.getStats() : null;
        if (com.max.hbcommon.utils.c.w(stats)) {
            ta taVar2 = this.f89203s;
            if (taVar2 == null) {
                f0.S("binding");
            } else {
                taVar = taVar2;
            }
            taVar.f115914h.setVisibility(8);
        } else {
            ta taVar3 = this.f89203s;
            if (taVar3 == null) {
                f0.S("binding");
            } else {
                taVar = taVar3;
            }
            taVar.f115914h.setVisibility(0);
            List<PUBGStatsObj> list = this.f89197m;
            f0.m(stats);
            list.addAll(stats);
        }
        s<PUBGStatsObj> sVar = this.f89194j;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
    }

    private final void v4(PUBGStatsDetailObj pUBGStatsDetailObj) {
        if (PatchProxy.proxy(new Object[]{pUBGStatsDetailObj}, this, changeQuickRedirect, false, 39422, new Class[]{PUBGStatsDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89186b = pUBGStatsDetailObj;
        n4();
        o4();
        p4();
        q4();
    }

    private final void w4(Context context, View view, List<? extends PUBGGameModeFilter> list, com.max.xiaoheihe.module.game.pubg.e.b bVar) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{context, view, list, bVar}, this, changeQuickRedirect, false, 39429, new Class[]{Context.class, View.class, List.class, com.max.xiaoheihe.module.game.pubg.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        ta taVar = null;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_filter, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.divider_top);
        View viewFindViewById2 = viewInflate.findViewById(R.id.gv_filter);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.GridView");
        GridView gridView = (GridView) viewFindViewById2;
        this.f89200p = gridView;
        if (gridView != null) {
            gridView.setBackground(androidx.core.content.res.i.g(getResources(), R.drawable.pubg_filter_bg_v2, null));
        }
        viewFindViewById.setVisibility(8);
        com.max.xiaoheihe.module.game.pubg.e eVar = new com.max.xiaoheihe.module.game.pubg.e(context, lb.a.J0, list, com.max.xiaoheihe.module.game.pubg.a.f88153a.a(list), bVar);
        eVar.i(ViewUtils.f(this.mContext, 3.0f));
        GridView gridView2 = this.f89200p;
        f0.m(gridView2);
        gridView2.setAdapter((ListAdapter) eVar);
        PopupWindow popupWindow = this.f89201q;
        if (popupWindow != null) {
            f0.m(popupWindow);
            popupWindow.dismiss();
        }
        this.f89201q = new PopupWindow(viewInflate, -1, -1, true);
        viewInflate.setOnClickListener(new i(context));
        PopupWindow popupWindow2 = this.f89201q;
        if (popupWindow2 != null) {
            popupWindow2.setTouchable(true);
        }
        PopupWindow popupWindow3 = this.f89201q;
        if (popupWindow3 != null) {
            popupWindow3.setBackgroundDrawable(new BitmapDrawable());
        }
        PopupWindow popupWindow4 = this.f89201q;
        if (popupWindow4 != null) {
            popupWindow4.setAnimationStyle(0);
        }
        PopupWindow popupWindow5 = this.f89201q;
        if (popupWindow5 != null) {
            popupWindow5.setOnDismissListener(new j());
        }
        PopupWindow popupWindow6 = this.f89201q;
        if (popupWindow6 != null && popupWindow6.isShowing()) {
            z10 = true;
        }
        if (z10 || view == null) {
            return;
        }
        ViewUtils.o0(this.f89201q, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new k());
        GridView gridView3 = this.f89200p;
        f0.m(gridView3);
        gridView3.startAnimation(animationLoadAnimation);
        ta taVar2 = this.f89203s;
        if (taVar2 == null) {
            f0.S("binding");
        } else {
            taVar = taVar2;
        }
        taVar.f115908b.setRotationX(180.0f);
    }

    private final void x4(List<? extends PUBGGameModeFilter> list, PUBGGameModeFilter pUBGGameModeFilter) {
        if (PatchProxy.proxy(new Object[]{list, pUBGGameModeFilter}, this, changeQuickRedirect, false, 39436, new Class[]{List.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.pubg.a aVar = com.max.xiaoheihe.module.game.pubg.a.f88153a;
        f0.m(pUBGGameModeFilter);
        aVar.b(list, pUBGGameModeFilter);
        this.f89188d = pUBGGameModeFilter.getKey();
        com.max.xiaoheihe.module.littleprogram.fragment.pubg.a aVar2 = this.f89193i;
        f0.m(aVar2);
        aVar2.q(this.f89188d);
    }

    @Override // com.max.xiaoheihe.module.game.pubg.e.b
    public void T1(@dl.e CompoundButton compoundButton, @dl.d PUBGGameModeFilter data) {
        if (PatchProxy.proxy(new Object[]{compoundButton, data}, this, changeQuickRedirect, false, 39435, new Class[]{CompoundButton.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(data, "data");
        x4(this.f89198n, data);
        Activity activity = this.mContext;
        PopupWindow popupWindow = this.f89201q;
        GridView gridView = this.f89200p;
        f0.m(gridView);
        i4(activity, popupWindow, gridView);
        initData();
    }

    @dl.d
    public final List<PUBGGameModeFilter> c4() {
        return this.f89198n;
    }

    @dl.d
    public final ArrayList<PUBGMatchObj> e4() {
        return this.f89199o;
    }

    @dl.d
    public final List<PUBGDataObj> g4() {
        return this.f89196l;
    }

    @dl.d
    public final List<PUBGStatsObj> h4() {
        return this.f89197m;
    }

    public final void i4(@dl.e Context context, @dl.e PopupWindow popupWindow, @dl.d GridView currentFilterGridView) {
        if (PatchProxy.proxy(new Object[]{context, popupWindow, currentFilterGridView}, this, changeQuickRedirect, false, 39430, new Class[]{Context.class, PopupWindow.class, GridView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(currentFilterGridView, "currentFilterGridView");
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_out);
        animationLoadAnimation.setAnimationListener(new c(currentFilterGridView, popupWindow));
        currentFilterGridView.startAnimation(animationLoadAnimation);
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39433, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89202r = 0;
        if (getParentFragment() instanceof com.max.xiaoheihe.module.littleprogram.fragment.dota2.d) {
            Fragment parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.fragment.dota2.GameOverviewBaseFragment");
            ((com.max.xiaoheihe.module.littleprogram.fragment.dota2.d) parentFragment).J4().f111334f.setVisibility(0);
        }
        b4();
        f4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39432, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ta taVarC = ta.c(this.mInflater);
        f0.o(taVarC, "inflate(mInflater)");
        this.f89203s = taVarC;
        if (taVarC == null) {
            f0.S("binding");
            taVarC = null;
        }
        setContentView(taVarC);
        d4();
        j4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39434, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
    }

    public final void r4(@dl.d List<PUBGGameModeFilter> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39415, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f89198n = list;
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39428, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ta taVar = this.f89203s;
        if (taVar == null) {
            f0.S("binding");
            taVar = null;
        }
        taVar.f115911e.setOnClickListener(new h());
    }

    public final void s4(@dl.d ArrayList<PUBGMatchObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 39416, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.f89199o = arrayList;
    }

    public final void t4(@dl.d List<PUBGDataObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39413, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f89196l = list;
    }

    public final void u4(@dl.d List<PUBGStatsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 39414, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.f89197m = list;
    }
}
