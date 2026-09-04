package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.BaseGameOverviewObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.max.xiaoheihe.module.account.GameBindingFragment;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.game.dota2.ImageCacheManager;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.f8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nDota2GameDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dota2GameDetailFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2GameDetailFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,373:1\n262#2,2:374\n*S KotlinDebug\n*F\n+ 1 Dota2GameDetailFragment.kt\ncom/max/xiaoheihe/module/littleprogram/fragment/dota2/Dota2GameDetailFragment\n*L\n366#1:374,2\n*E\n"})
@n9.a({com.max.hbminiprogram.d.class})
@m(path = lb.d.T3)
@o(parameters = 0)
public final class Dota2GameDetailFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a C = new a(null);
    public static final int D = 8;

    @dl.d
    private static final String E = "user_id";

    @dl.d
    private static final String F = "steam_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private GameOverviewListObj B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f88933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f88934v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f8 f88936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private com.max.xiaoheihe.module.game.adapter.overview.b f88937y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f88935w = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final List<BaseGameOverviewObj> f88938z = new ArrayList();

    @dl.d
    private List<FilterGroup> A = new ArrayList();

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39055, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2GameDetailFragment.F;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39054, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2GameDetailFragment.E;
        }

        @dl.d
        public final Fragment c(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39057, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(b()) : null);
            Object obj = map != null ? map.get(a()) : null;
            bundle.putString(b(), str);
            bundle.putString(a(), (String) obj);
            Dota2GameDetailFragment dota2GameDetailFragment = new Dota2GameDetailFragment();
            dota2GameDetailFragment.setArguments(bundle);
            return dota2GameDetailFragment;
        }

        @dl.d
        @xh.m
        public final Dota2GameDetailFragment d(@dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 39056, new Class[]{String.class, String.class}, Dota2GameDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Dota2GameDetailFragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            bundle.putString(b(), str);
            bundle.putString(a(), str2);
            Dota2GameDetailFragment dota2GameDetailFragment = new Dota2GameDetailFragment();
            dota2GameDetailFragment.setArguments(bundle);
            return dota2GameDetailFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class b extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39058, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (Dota2GameDetailFragment.this.isActive()) {
                super.onNext((Result) result);
                GameOverviewListObj gameOverviewListObj = Dota2GameDetailFragment.this.B;
                if (gameOverviewListObj != null) {
                    gameOverviewListObj.set_me("1");
                }
                Dota2GameDetailFragment.this.h5().f110487i.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39059, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class c extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f88941c;

        c(boolean z10) {
            this.f88941c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39060, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            super.onError(e10);
            GameOverviewListObj gameOverviewListObj = Dota2GameDetailFragment.this.B;
            if (gameOverviewListObj != null) {
                boolean z10 = this.f88941c;
                Dota2GameDetailFragment dota2GameDetailFragment = Dota2GameDetailFragment.this;
                gameOverviewListObj.setFollow_state(z10 ? "0" : "1");
                Dota2GameDetailFragment.d5(dota2GameDetailFragment);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39072, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2GameDetailFragment.X4(Dota2GameDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class e implements com.max.xiaoheihe.module.game.adapter.overview.b.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        public boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39073, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : Dota2GameDetailFragment.this.f88935w;
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        @dl.e
        public String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39075, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2GameDetailFragment.this.j5();
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.c
        @dl.e
        public String getUserId() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39074, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : Dota2GameDetailFragment.this.k5();
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class f implements com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        public void a(@dl.d List<FilterGroup> groupList) {
            if (PatchProxy.proxy(new Object[]{groupList}, this, changeQuickRedirect, false, 39076, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(groupList, "groupList");
            Dota2GameDetailFragment.this.A = groupList;
            Dota2GameDetailFragment.X4(Dota2GameDetailFragment.this);
        }

        @Override // com.max.xiaoheihe.module.game.adapter.overview.b.InterfaceC0764b
        @dl.e
        public List<FilterGroup> b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39077, new Class[0], List.class);
            return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : Dota2GameDetailFragment.this.A;
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class g implements ConsecutiveScrollerLayout.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.h
        public final void a(View view, int i10, int i11, int i12) {
            Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 39078, new Class[]{View.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.heybox.hblog.g.f74531b.M("scrollY: " + i10);
            if (i12 != 0 || i10 >= Dota2GameDetailFragment.this.h5().f110489k.getMeasuredHeight()) {
                return;
            }
            if (ViewUtils.a0(Dota2GameDetailFragment.this.h5().f110489k)) {
                Dota2GameDetailFragment.this.h5().f110485g.y0(Dota2GameDetailFragment.this.h5().f110484f);
            } else {
                Dota2GameDetailFragment.this.h5().f110485g.y0(Dota2GameDetailFragment.this.h5().f110489k);
            }
        }
    }

    /* JADX INFO: compiled from: Dota2GameDetailFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GameOverviewListObj f88953c;

        h(GameOverviewListObj gameOverviewListObj) {
            this.f88953c = gameOverviewListObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39079, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) Dota2GameDetailFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, this.f88953c.getSearch_protocol());
        }
    }

    public static final /* synthetic */ void T4(Dota2GameDetailFragment dota2GameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2GameDetailFragment}, null, changeQuickRedirect, true, 39052, new Class[]{Dota2GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2GameDetailFragment.f5();
    }

    public static final /* synthetic */ void U4(Dota2GameDetailFragment dota2GameDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{dota2GameDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 39053, new Class[]{Dota2GameDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dota2GameDetailFragment.g5(z10);
    }

    public static final /* synthetic */ void X4(Dota2GameDetailFragment dota2GameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2GameDetailFragment}, null, changeQuickRedirect, true, 39049, new Class[]{Dota2GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2GameDetailFragment.i5();
    }

    public static final /* synthetic */ void b5(Dota2GameDetailFragment dota2GameDetailFragment, GameOverviewListObj gameOverviewListObj) {
        if (PatchProxy.proxy(new Object[]{dota2GameDetailFragment, gameOverviewListObj}, null, changeQuickRedirect, true, 39050, new Class[]{Dota2GameDetailFragment.class, GameOverviewListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2GameDetailFragment.l5(gameOverviewListObj);
    }

    public static final /* synthetic */ void d5(Dota2GameDetailFragment dota2GameDetailFragment) {
        if (PatchProxy.proxy(new Object[]{dota2GameDetailFragment}, null, changeQuickRedirect, true, 39051, new Class[]{Dota2GameDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2GameDetailFragment.p5();
    }

    @SuppressLint({"AutoDispose"})
    private final void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().fb(this.f88934v, "dota2").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @SuppressLint({"AutoDispose"})
    private final void g5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39038, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().M1(this.f88933u, this.f88934v, z10 ? "1" : "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(z10)));
    }

    @SuppressLint({"AutoDispose"})
    private final void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39036, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        for (FilterGroup filterGroup : this.A) {
            String key = filterGroup.getKey();
            FilterItem filterItemC = SecondaryWindowSegmentFilterView.f67839l.c(filterGroup);
            map.put(key, filterItemC != null ? filterItemC.getKey() : null);
        }
        addDisposable((io.reactivex.disposables.b) i.a().g3(this.f88933u, this.f88934v, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<GameOverviewListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2GameDetailFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39061, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f88946b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f88946b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2GameDetailFragment$getData$1$onError$1(this.f88946b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<GameOverviewListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39062, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f88946b.isActive()) {
                    y viewLifecycleOwner = this.f88946b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2GameDetailFragment$getData$1$onNext$1(this.f88946b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39063, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<GameOverviewListObj>) obj);
            }
        }));
    }

    private final void l5(GameOverviewListObj gameOverviewListObj) {
        List<BaseGameOverviewObj> data_list;
        if (PatchProxy.proxy(new Object[]{gameOverviewListObj}, this, changeQuickRedirect, false, 39037, new Class[]{GameOverviewListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zIsEmpty = this.f88938z.isEmpty();
        this.f88938z.clear();
        this.B = gameOverviewListObj;
        this.f88934v = gameOverviewListObj != null ? gameOverviewListObj.getSteam_id() : null;
        if (gameOverviewListObj == null || (data_list = gameOverviewListObj.getData_list()) == null) {
            return;
        }
        Iterator<BaseGameOverviewObj> it = data_list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (f0.g(it.next().getItem_type(), "bind")) {
                z10 = true;
            }
        }
        if (z10) {
            h5().f110481c.setVisibility(8);
            h5().f110487i.setVisibility(8);
            h5().f110486h.setVisibility(0);
            getChildFragmentManager().u().b(R.id.vg_bind_card_container, GameBindingFragment.m4("dota2")).n();
            return;
        }
        List<BaseGameOverviewObj> listA = com.max.xiaoheihe.module.game.adapter.overview.b.f85762g.a(data_list, this.A);
        if (listA != null) {
            this.f88938z.addAll(listA);
        }
        h5().f110481c.setVisibility(0);
        h5().f110486h.setVisibility(8);
        h5().f110482d.setText(gameOverviewListObj.getSearch_hint());
        h5().f110488j.setOnClickListener(new h(gameOverviewListObj));
        this.f88935w = com.max.hbcommon.utils.c.x(gameOverviewListObj.is_me());
        if (com.max.hbcommon.utils.c.x(gameOverviewListObj.is_me())) {
            h5().f110487i.setVisibility(8);
        } else {
            h5().f110487i.setVisibility(0);
            p5();
        }
        com.max.xiaoheihe.module.game.adapter.overview.b bVar = this.f88937y;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
        if (zIsEmpty) {
            h5().f110485g.v0(h5().f110484f);
        }
    }

    @dl.d
    @xh.m
    public static final Dota2GameDetailFragment n5(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 39048, new Class[]{String.class, String.class}, Dota2GameDetailFragment.class);
        return patchProxyResultProxy.isSupported ? (Dota2GameDetailFragment) patchProxyResultProxy.result : C.d(str, str2);
    }

    private final void p5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y viewLifecycleOwner = getViewLifecycleOwner();
        f0.o(viewLifecycleOwner, "viewLifecycleOwner");
        k.f(z.a(viewLifecycleOwner), null, null, new Dota2GameDetailFragment$refreshBottomButton$1(this, null), 3, null);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39034, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88933u = arguments.getString(E);
            this.f88934v = arguments.getString(F);
        }
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.xiaoheihe.module.account.GameBindingFragment.n
    public void B1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39044, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        i5();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39033, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f8 f8VarC = f8.c(this.mInflater);
        f0.o(f8VarC, "inflate(mInflater)");
        q5(f8VarC);
        h5().f110481c.setVisibility(4);
        h5().f110481c.setBackgroundResource(R.color.transparent);
        h5().f110481c.i0(true);
        h5().f110481c.b0(false);
        h5().f110481c.S(new d());
        h5().f110480b.setLayoutManager(new LinearLayoutManager(this.mContext));
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        List<BaseGameOverviewObj> list = this.f88938z;
        RecyclerView recyclerView = h5().f110480b;
        f0.o(recyclerView, "binding.rv");
        com.max.xiaoheihe.module.game.adapter.overview.b bVar = new com.max.xiaoheihe.module.game.adapter.overview.b(mContext, list, recyclerView, new e(), getChildFragmentManager());
        this.f88937y = bVar;
        bVar.v(new f());
        h5().f110488j.setBackground(com.max.hbutils.utils.q.i(this.mContext, R.color.white_alpha3, R.color.white_alpha5, 0.5f, 3.0f));
        h5().f110480b.setAdapter(this.f88937y);
        h5().f110480b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        ImageCacheManager.f87355b.b().g(ImageCacheManager.f87359f);
        if (this.mContext instanceof ChannelsDetailActivity) {
            m5();
        } else {
            h5().f110485g.setOnVerticalScrollChangeListener(new g());
        }
        RelativeLayout relativeLayoutB = h5().b();
        f0.o(relativeLayoutB, "binding.root");
        return relativeLayoutB;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39043, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : C.c(map);
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.xiaoheihe.module.account.GameBindingFragment.n
    public boolean g2(@dl.e String str, @dl.e View view, @dl.e EditText editText) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, view, editText}, this, changeQuickRedirect, false, 39045, new Class[]{String.class, View.class, EditText.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f88934v = String.valueOf(editText != null ? editText.getText() : null);
        return false;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39042, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(E, this.f88933u);
        jsonObject.addProperty(F, this.f88934v);
        return jsonObject.toString();
    }

    @dl.d
    public final f8 h5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39031, new Class[0], f8.class);
        if (patchProxyResultProxy.isSupported) {
            return (f8) patchProxyResultProxy.result;
        }
        f8 f8Var = this.f88936x;
        if (f8Var != null) {
            return f8Var;
        }
        f0.S("binding");
        return null;
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        i5();
    }

    @dl.e
    public final String j5() {
        return this.f88934v;
    }

    @dl.e
    public final String k5() {
        return this.f88933u;
    }

    public final void m5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39046, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = h5().f110489k;
        f0.o(linearLayout, "binding.vgSearchContainer");
        linearLayout.setVisibility(8);
    }

    public final void o5(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 39047, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h5().f110487i.setTranslationY(-(i10 - 1));
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        i5();
    }

    public final void q5(@dl.d f8 f8Var) {
        if (PatchProxy.proxy(new Object[]{f8Var}, this, changeQuickRedirect, false, 39032, new Class[]{f8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(f8Var, "<set-?>");
        this.f88936x = f8Var;
    }

    public final void r5(@dl.e String str) {
        this.f88934v = str;
    }

    public final void s5(@dl.e String str) {
        this.f88933u = str;
    }
}
