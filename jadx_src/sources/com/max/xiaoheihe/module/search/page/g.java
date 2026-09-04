package com.max.xiaoheihe.module.search.page;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbsearch.l;
import com.max.hbsearch.y0;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.PlayerInfoObj;
import com.max.xiaoheihe.bean.game.PlayerListObj;
import com.max.xiaoheihe.module.game.ow.OWPlayerOverViewActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchOwPlayerFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class g extends y0 {
    public static final int O = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.d
    private final ArrayList<PlayerInfoObj> I = new ArrayList<>();

    @dl.d
    private final ArrayList<PlayerInfoObj> J = new ArrayList<>();

    @dl.e
    private t K;

    @dl.e
    private t L;
    private View M;
    private View N;

    /* JADX INFO: compiled from: SearchOwPlayerFragment.kt */
    public final class a extends s<PlayerInfoObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private String f91661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f91662c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.page.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SearchOwPlayerFragment.kt */
        public static final class ViewOnClickListenerC0856a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g f91664c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f91665d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f91666e;

            ViewOnClickListenerC0856a(g gVar, String str, String str2) {
                this.f91664c = gVar;
                this.f91665d = str;
                this.f91666e = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43060, new Class[]{View.class}, Void.TYPE).isSupported && f0.g(lb.a.E0, a.this.m())) {
                    ((com.max.hbcommon.base.d) this.f91664c).mContext.startActivity(OWPlayerOverViewActivity.M1(((com.max.hbcommon.base.d) this.f91664c).mContext, this.f91665d, this.f91666e));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d g gVar, @dl.e String gameId, List<? extends PlayerInfoObj> list) {
            super(((com.max.hbcommon.base.d) gVar).mContext, list, R.layout.item_player);
            f0.p(gameId, "gameId");
            this.f91662c = gVar;
            this.f91661b = gameId;
        }

        @dl.d
        public final String m() {
            return this.f91661b;
        }

        public void n(@dl.d s.e viewHolder, @dl.d PlayerInfoObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 43058, new Class[]{s.e.class, PlayerInfoObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_avatar);
            TextView textView = (TextView) viewHolder.i(R.id.tv_data);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_data);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_name);
            View viewI = viewHolder.i(R.id.divider);
            View viewB = viewHolder.b();
            if (f0.g(lb.a.E0, this.f91661b)) {
                com.max.hbimage.b.d0(data.getPortraitAvatar(), imageView, ViewUtils.f(((com.max.hbcommon.base.d) this.f91662c).mContext, 2.0f));
            }
            textView2.setText(data.getNickname());
            if (com.max.hbcommon.utils.c.u(data.getRank_img())) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                com.max.hbimage.b.K(data.getRank_img(), imageView2);
            }
            if (com.max.hbcommon.utils.c.u(data.getLevel())) {
                textView.setText("--");
            } else {
                textView.setText(data.getLevel());
            }
            viewB.setOnClickListener(new ViewOnClickListenerC0856a(this.f91662c, data.getPlayer_id(), data.getNickname()));
            viewI.setVisibility(data == this.mDataList.get(getItemCount() - 1) ? 8 : 0);
        }

        public final void o(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43057, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            this.f91661b = str;
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PlayerInfoObj playerInfoObj) {
            if (PatchProxy.proxy(new Object[]{eVar, playerInfoObj}, this, changeQuickRedirect, false, 43059, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, playerInfoObj);
        }
    }

    /* JADX INFO: compiled from: SearchOwPlayerFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<PlayerListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43062, new Class[0], Void.TYPE).isSupported && g.this.isActive()) {
                super.onComplete();
                g.K5(g.this, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43061, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (g.this.isActive()) {
                super.onError(e10);
                g.K5(g.this, null);
            }
        }

        public void onNext(@dl.d Result<PlayerListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43063, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (g.this.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    PlayerListObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getPlayer_list() != null) {
                        g.this.I.clear();
                        ArrayList arrayList = g.this.I;
                        PlayerListObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getPlayer_list());
                    }
                }
                g.P5(g.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43064, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PlayerListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: SearchOwPlayerFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<PlayerListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f91668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f91669c;

        c(String str, g gVar) {
            this.f91668b = str;
            this.f91669c = gVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43066, new Class[0], Void.TYPE).isSupported && f0.g(this.f91668b, g.O5(this.f91669c)) && this.f91669c.isActive()) {
                super.onComplete();
                g.K5(this.f91669c, this.f91668b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 43065, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (f0.g(this.f91668b, g.O5(this.f91669c)) && this.f91669c.isActive()) {
                super.onError(e10);
                g.K5(this.f91669c, this.f91668b);
            }
        }

        public void onNext(@dl.d Result<PlayerListObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 43067, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (f0.g(this.f91668b, g.O5(this.f91669c)) && this.f91669c.isActive()) {
                super.onNext(result);
                if (result.getResult() != null) {
                    PlayerListObj result2 = result.getResult();
                    f0.m(result2);
                    if (result2.getPlayer_list() != null) {
                        this.f91669c.J.clear();
                        ArrayList arrayList = this.f91669c.J;
                        PlayerListObj result3 = result.getResult();
                        f0.m(result3);
                        arrayList.addAll(result3.getPlayer_list());
                    }
                }
                g.Q5(this.f91669c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 43068, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PlayerListObj>) obj);
        }
    }

    public static final /* synthetic */ void K5(g gVar, String str) {
        if (PatchProxy.proxy(new Object[]{gVar, str}, null, changeQuickRedirect, true, 43054, new Class[]{g.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.Q3(str);
    }

    public static final /* synthetic */ String O5(g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 43053, new Class[]{g.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : gVar.d4();
    }

    public static final /* synthetic */ void P5(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 43056, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.S5();
    }

    public static final /* synthetic */ void Q5(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 43055, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        gVar.T5();
    }

    private final void R5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43050, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void S5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43051, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.K;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
    }

    private final void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43049, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.L;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        if (this.J.isEmpty()) {
            y4();
            return;
        }
        P4().setAdapter(this.L);
        E5(true);
        N4().setVisibility(8);
    }

    private final void U5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43048, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().p9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str, this)));
    }

    @Override // com.max.hbsearch.y0
    public void H5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43045, new Class[0], Void.TYPE).isSupported && com.max.hbcommon.utils.c.u(d4())) {
            k4();
            R5();
        }
    }

    @Override // com.max.hbsearch.y0
    public void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.K = new t(new a(this, lb.a.E0, this.I));
        this.L = new t(new a(this, lb.a.E0, this.J));
    }

    @Override // com.max.hbsearch.y0
    public void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43042, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_player_header, (ViewGroup) P4(), false);
        f0.o(viewInflate, "mInflater.inflate(R.layo…er, mRecyclerView, false)");
        this.M = viewInflate;
        View view = null;
        if (viewInflate == null) {
            f0.S("owFamousPlayerListHeader");
            viewInflate = null;
        }
        View viewFindViewById = viewInflate.findViewById(R.id.tv_name);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(getString(R.string.famous_player));
        View view2 = this.M;
        if (view2 == null) {
            f0.S("owFamousPlayerListHeader");
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_data);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setText(getString(R.string.skill_rating));
        View viewInflate2 = this.mInflater.inflate(R.layout.item_player_header, (ViewGroup) P4(), false);
        f0.o(viewInflate2, "mInflater.inflate(R.layo…er, mRecyclerView, false)");
        this.N = viewInflate2;
        if (viewInflate2 == null) {
            f0.S("owSearchPlayerListHeader");
            viewInflate2 = null;
        }
        View viewFindViewById3 = viewInflate2.findViewById(R.id.tv_name);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(getString(R.string.player));
        View view3 = this.N;
        if (view3 == null) {
            f0.S("owSearchPlayerListHeader");
        } else {
            view = view3;
        }
        View viewFindViewById4 = view.findViewById(R.id.tv_data);
        f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(getString(R.string.skill_rating));
    }

    @Override // com.max.hbsearch.y0
    public void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43046, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t tVar = this.K;
        f0.m(tVar);
        tVar.notifyDataSetChanged();
        P4().setAdapter(this.K);
        E5(true);
    }

    @Override // com.max.hbsearch.y0
    public void h5(@dl.d String q10, @dl.e String str) {
        if (PatchProxy.proxy(new Object[]{q10, str}, this, changeQuickRedirect, false, 43047, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(q10, "q");
        U5(q10);
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 13;
    }

    @Override // com.max.hbsearch.y0, com.max.hbsearch.k
    @dl.d
    public String j4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43052, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_game_role_nickname);
        f0.o(strN0, "getString(R.string.search_game_role_nickname)");
        return strN0;
    }

    @Override // com.max.hbsearch.y0
    public void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43044, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u4(l.J);
        View viewInflate = this.mInflater.inflate(R.layout.item_all_search_history, (ViewGroup) P4(), false);
        f0.n(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        v4((LinearLayout) viewInflate);
        t tVar = this.K;
        f0.m(tVar);
        tVar.p(R.layout.item_all_search_history, g4());
        t tVar2 = this.K;
        f0.m(tVar2);
        View view = this.M;
        View view2 = null;
        if (view == null) {
            f0.S("owFamousPlayerListHeader");
            view = null;
        }
        tVar2.p(R.layout.item_player_header, view);
        t tVar3 = this.L;
        f0.m(tVar3);
        View view3 = this.N;
        if (view3 == null) {
            f0.S("owSearchPlayerListHeader");
        } else {
            view2 = view3;
        }
        tVar3.p(R.layout.item_player_header, view2);
        P4().setAdapter(this.K);
    }
}
