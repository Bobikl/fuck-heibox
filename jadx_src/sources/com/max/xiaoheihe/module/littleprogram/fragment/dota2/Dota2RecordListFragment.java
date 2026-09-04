package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewHeaderInfoObj;
import com.max.xiaoheihe.bean.game.gameoverview.MatchObj;
import com.max.xiaoheihe.module.game.component.dota2.Dota2RecordItemView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.m8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2RecordListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.Y3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2RecordListFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a B = new a(null);
    public static final int C = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89048u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f89049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m8 f89050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final List<MatchObj> f89051x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f89052y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f89053z;

    /* JADX INFO: compiled from: Dota2RecordListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39310, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            Object obj = map != null ? map.get(Dota2GameDetailFragment.C.a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), (String) obj);
            Dota2RecordListFragment dota2RecordListFragment = new Dota2RecordListFragment();
            dota2RecordListFragment.setArguments(bundle);
            return dota2RecordListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2RecordListFragment.kt */
    public static final class b implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 39311, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(keyDescObj, "keyDescObj");
            String str = Dota2RecordListFragment.this.A;
            Dota2RecordListFragment.this.A = keyDescObj.getKey();
            if (f0.g(str, Dota2RecordListFragment.this.A)) {
                return;
            }
            Dota2RecordListFragment.U4(Dota2RecordListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2RecordListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39323, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2RecordListFragment.U4(Dota2RecordListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2RecordListFragment.kt */
    public static final class d extends s<MatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: Dota2RecordListFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Dota2RecordListFragment f89057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MatchObj f89058c;

            a(Dota2RecordListFragment dota2RecordListFragment, MatchObj matchObj) {
                this.f89057b = dota2RecordListFragment;
                this.f89058c = matchObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 39326, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((com.max.hbcommon.base.d) this.f89057b).mContext;
                f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.s0(mContext, this.f89058c.getMatch_id(), this.f89057b.e5(), this.f89057b.d5());
            }
        }

        d(Activity activity, List<MatchObj> list) {
            super(activity, list, R.layout.item_game_overview_record);
        }

        public void m(@dl.e s.e eVar, @dl.e MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39324, new Class[]{s.e.class, MatchObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2RecordListFragment dota2RecordListFragment = Dota2RecordListFragment.this;
            if (matchObj != null) {
                Dota2RecordItemView dota2RecordItemView = (Dota2RecordItemView) eVar.i(R.id.v_record);
                dota2RecordItemView.setData(matchObj);
                dota2RecordItemView.setOnClickListener(new a(dota2RecordListFragment, matchObj));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, MatchObj matchObj) {
            if (PatchProxy.proxy(new Object[]{eVar, matchObj}, this, changeQuickRedirect, false, 39325, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, matchObj);
        }
    }

    public static final /* synthetic */ void U4(Dota2RecordListFragment dota2RecordListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2RecordListFragment}, null, changeQuickRedirect, true, 39308, new Class[]{Dota2RecordListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2RecordListFragment.c5();
    }

    public static final /* synthetic */ void X4(Dota2RecordListFragment dota2RecordListFragment, Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2RecordListFragment, dota2MatchListObj}, null, changeQuickRedirect, true, 39309, new Class[]{Dota2RecordListFragment.class, Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2RecordListFragment.f5(dota2MatchListObj);
    }

    private final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39303, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashMap map = new HashMap();
        String str = this.f89053z;
        if (str != null) {
            map.put(str, this.A);
        }
        addDisposable((io.reactivex.disposables.b) i.a().va(this.f89048u, this.f89049v, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<Dota2MatchListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2RecordListFragment$getData$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 39312, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89059b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f89059b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2RecordListFragment$getData$2$onError$1(this.f89059b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<Dota2MatchListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 39313, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89059b.isActive()) {
                    y viewLifecycleOwner = this.f89059b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2RecordListFragment$getData$2$onNext$1(this.f89059b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 39314, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<Dota2MatchListObj>) obj);
            }
        }));
    }

    private final void f5(Dota2MatchListObj dota2MatchListObj) {
        if (PatchProxy.proxy(new Object[]{dota2MatchListObj}, this, changeQuickRedirect, false, 39304, new Class[]{Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<MatchObj> match_list = dota2MatchListObj != null ? dota2MatchListObj.getMatch_list() : null;
        this.f89051x.clear();
        com.max.xiaoheihe.module.littleprogram.fragment.dota2.c cVar = com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f89134a;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        cVar.c(mContext, b5().f113333g.b(), dota2MatchListObj != null ? dota2MatchListObj.getHeader_info() : null, null, null);
        b5().f113331e.setText(dota2MatchListObj != null ? dota2MatchListObj.getMax_win() : null);
        b5().f113330d.setText(dota2MatchListObj != null ? dota2MatchListObj.getMax_lose() : null);
        GradientDrawable gradientDrawableI = q.i(this.mContext, R.color.white_alpha3, R.color.white_alpha10, 0.5f, 6.0f);
        b5().f113335i.setBackground(gradientDrawableI);
        b5().f113334h.setBackground(gradientDrawableI);
        showContentView();
        if (!com.max.hbcommon.utils.c.w(match_list)) {
            List<MatchObj> list = this.f89051x;
            f0.m(match_list);
            list.addAll(match_list);
        }
        b5().f113333g.f116875c.setVisibility(8);
        SegmentFilterView segmentFilterView = b5().f113333g.f116879g;
        f0.o(segmentFilterView, "binding.vgHeader.vFilter");
        a5(segmentFilterView, dota2MatchListObj);
        RecyclerView.Adapter adapter = b5().f113328b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39302, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f89048u = arguments.getString(aVar.b());
        this.f89049v = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39301, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.f89052y = System.currentTimeMillis();
        m8 m8VarC = m8.c(this.mInflater);
        f0.o(m8VarC, "inflate(mInflater)");
        g5(m8VarC);
        b5().f113329c.setBackgroundResource(R.color.transparent);
        b5().f113329c.b0(false);
        b5().f113329c.S(new c());
        b5().f113328b.setLayoutManager(new LinearLayoutManager(this.mContext));
        b5().f113328b.setAdapter(new d(this.mContext, this.f89051x));
        b5().f113332f.setVisibility(4);
        b5().f113328b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        c5();
        SmartRefreshLayout smartRefreshLayoutB = b5().b();
        f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 39307, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : B.a(map);
    }

    public final void a5(@dl.d SegmentFilterView segmentFilterView, @dl.e Dota2MatchListObj dota2MatchListObj) {
        GameOverviewHeaderInfoObj header_info;
        List<FilterGroup> filters;
        if (PatchProxy.proxy(new Object[]{segmentFilterView, dota2MatchListObj}, this, changeQuickRedirect, false, 39305, new Class[]{SegmentFilterView.class, Dota2MatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(segmentFilterView, "segmentFilterView");
        if (dota2MatchListObj == null || (header_info = dota2MatchListObj.getHeader_info()) == null || (filters = header_info.getFilters()) == null || filters.size() <= 0) {
            return;
        }
        FilterGroup filterGroup = filters.get(0);
        this.f89053z = filterGroup.getKey();
        if (filterGroup.getFilters().size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (FilterItem filterItem : filterGroup.getFilters()) {
                KeyDescObj keyDescObj = new KeyDescObj();
                keyDescObj.setDesc(filterItem.getDesc());
                keyDescObj.setKey(filterItem.getKey());
                keyDescObj.setChecked(f0.g(filterItem.getKey(), this.A));
                arrayList.add(keyDescObj);
            }
            segmentFilterView.setLittleWhiteStyle();
            segmentFilterView.setMOnTabCheckedListener(new b());
            segmentFilterView.setData(arrayList);
            segmentFilterView.d();
        }
    }

    @dl.d
    public final m8 b5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39299, new Class[0], m8.class);
        if (patchProxyResultProxy.isSupported) {
            return (m8) patchProxyResultProxy.result;
        }
        m8 m8Var = this.f89050w;
        if (m8Var != null) {
            return m8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String d5() {
        return this.f89049v;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    @dl.e
    public final String e5() {
        return this.f89048u;
    }

    public final void g5(@dl.d m8 m8Var) {
        if (PatchProxy.proxy(new Object[]{m8Var}, this, changeQuickRedirect, false, 39300, new Class[]{m8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(m8Var, "<set-?>");
        this.f89050w = m8Var;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39306, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f89048u);
        jsonObject.addProperty(aVar.a(), this.f89049v);
        return jsonObject.toString();
    }

    public final void h5(@dl.e String str) {
        this.f89049v = str;
    }

    public final void i5(@dl.e String str) {
        this.f89048u = str;
    }
}
