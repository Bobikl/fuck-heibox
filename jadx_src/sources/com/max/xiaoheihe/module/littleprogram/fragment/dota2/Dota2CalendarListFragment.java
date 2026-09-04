package com.max.xiaoheihe.module.littleprogram.fragment.dota2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
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
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.CalendarObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListObj;
import com.max.xiaoheihe.module.game.component.CalendarUtils;
import com.max.xiaoheihe.module.game.component.dota2.Dota2CalendarView;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import df.d8;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import ng.j;

/* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@m(path = lb.d.X3)
@o(parameters = 0)
@n9.a({com.max.hbminiprogram.d.class})
public final class Dota2CalendarListFragment extends com.max.xiaoheihe.module.littleprogram.fragment.dota2.a implements com.max.hbminiprogram.d {

    @dl.d
    public static final a A = new a(null);
    public static final int B = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f88900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f88901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d8 f88902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final List<GameOverviewCalendarListObj> f88903x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private Dota2CalendarView.Type f88904y = Dota2CalendarView.Type.Count;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f88905z;

    /* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Fragment a(@dl.e Map<String, ? extends Object> map) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38990, new Class[]{Map.class}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Bundle bundle = new Bundle();
            String str = (String) (map != null ? map.get(Dota2GameDetailFragment.C.b()) : null);
            Object obj = map != null ? map.get(Dota2GameDetailFragment.C.a()) : null;
            Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
            bundle.putString(aVar.b(), str);
            bundle.putString(aVar.a(), (String) obj);
            Dota2CalendarListFragment dota2CalendarListFragment = new Dota2CalendarListFragment();
            dota2CalendarListFragment.setArguments(bundle);
            return dota2CalendarListFragment;
        }
    }

    /* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
    public static final class b implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@dl.d KeyDescObj key, int i10) {
            RecyclerView.Adapter adapter;
            if (PatchProxy.proxy(new Object[]{key, new Integer(i10)}, this, changeQuickRedirect, false, 38991, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(key, "key");
            Dota2CalendarView.Type type = Dota2CalendarListFragment.this.f88904y;
            if (i10 == 0) {
                Dota2CalendarListFragment.this.f88904y = Dota2CalendarView.Type.Count;
            } else {
                Dota2CalendarListFragment.this.f88904y = Dota2CalendarView.Type.Win;
            }
            if (type == Dota2CalendarListFragment.this.f88904y || (adapter = Dota2CalendarListFragment.this.a5().f109684b.getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 39003, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            Dota2CalendarListFragment.V4(Dota2CalendarListFragment.this);
        }
    }

    /* JADX INFO: compiled from: Dota2CalendarListFragment.kt */
    public static final class d extends s<GameOverviewCalendarListObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(Activity activity, List<GameOverviewCalendarListObj> list) {
            super(activity, list, R.layout.item_dota2_calendar);
        }

        public final boolean m(long j10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 39005, new Class[]{Long.TYPE}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10 * 1000);
            calendar.get(1);
            return calendar.get(2) + 1 == 7 && calendar.get(5) == 1;
        }

        public void n(@dl.e s.e eVar, @dl.e GameOverviewCalendarListObj gameOverviewCalendarListObj) {
            List<CalendarObj> calendar;
            if (PatchProxy.proxy(new Object[]{eVar, gameOverviewCalendarListObj}, this, changeQuickRedirect, false, 39004, new Class[]{s.e.class, GameOverviewCalendarListObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            Dota2CalendarListFragment dota2CalendarListFragment = Dota2CalendarListFragment.this;
            if (gameOverviewCalendarListObj == null || (calendar = gameOverviewCalendarListObj.getCalendar()) == null) {
                return;
            }
            Dota2CalendarView dota2CalendarView = (Dota2CalendarView) eVar.i(R.id.v_calendar);
            TextView textView = (TextView) eVar.i(R.id.tv_year);
            dota2CalendarView.setData(calendar);
            dota2CalendarView.setType(dota2CalendarListFragment.f88904y);
            if (eVar.getAbsoluteAdapterPosition() <= 0 || calendar.size() <= 0 || !m(n.r(calendar.get(0).getDate()))) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CalendarUtils.f86571a.t(n.r(calendar.get(0).getDate())));
            sb2.append((char) 24180);
            textView.setText(sb2.toString());
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, GameOverviewCalendarListObj gameOverviewCalendarListObj) {
            if (PatchProxy.proxy(new Object[]{eVar, gameOverviewCalendarListObj}, this, changeQuickRedirect, false, 39006, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            n(eVar, gameOverviewCalendarListObj);
        }
    }

    public static final /* synthetic */ void V4(Dota2CalendarListFragment dota2CalendarListFragment) {
        if (PatchProxy.proxy(new Object[]{dota2CalendarListFragment}, null, changeQuickRedirect, true, 38988, new Class[]{Dota2CalendarListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2CalendarListFragment.b5();
    }

    public static final /* synthetic */ void W4(Dota2CalendarListFragment dota2CalendarListFragment, GameOverviewCalendarListListObj gameOverviewCalendarListListObj) {
        if (PatchProxy.proxy(new Object[]{dota2CalendarListFragment, gameOverviewCalendarListListObj}, null, changeQuickRedirect, true, 38989, new Class[]{Dota2CalendarListFragment.class, GameOverviewCalendarListListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        dota2CalendarListFragment.e5(gameOverviewCalendarListListObj);
    }

    private final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38983, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) i.a().N0(this.f88900u, this.f88901v).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<GameOverviewCalendarListListObj>>() { // from class: com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2CalendarListFragment$getData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38992, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f88909b.isActive()) {
                    super.onError(e10);
                    y viewLifecycleOwner = this.f88909b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2CalendarListFragment$getData$1$onError$1(this.f88909b, null), 3, null);
                }
            }

            public void onNext(@dl.d Result<GameOverviewCalendarListListObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38993, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f88909b.isActive()) {
                    y viewLifecycleOwner = this.f88909b.getViewLifecycleOwner();
                    f0.o(viewLifecycleOwner, "viewLifecycleOwner");
                    k.f(z.a(viewLifecycleOwner), null, null, new Dota2CalendarListFragment$getData$1$onNext$1(this.f88909b, result, null), 3, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38994, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<GameOverviewCalendarListListObj>) obj);
            }
        }));
    }

    private final void e5(GameOverviewCalendarListListObj gameOverviewCalendarListListObj) {
        String title;
        if (PatchProxy.proxy(new Object[]{gameOverviewCalendarListListObj}, this, changeQuickRedirect, false, 38984, new Class[]{GameOverviewCalendarListListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<GameOverviewCalendarListObj> calendar = gameOverviewCalendarListListObj != null ? gameOverviewCalendarListListObj.getCalendar() : null;
        this.f88903x.clear();
        com.max.xiaoheihe.module.littleprogram.fragment.dota2.c cVar = com.max.xiaoheihe.module.littleprogram.fragment.dota2.c.f89134a;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        cVar.c(mContext, a5().f109687e.b(), gameOverviewCalendarListListObj != null ? gameOverviewCalendarListListObj.getHeader_info() : null, null, null);
        TextView textView = a5().f109686d;
        if (gameOverviewCalendarListListObj == null || (title = gameOverviewCalendarListListObj.getTitle()) == null) {
            title = "活动热力图";
        }
        textView.setText(title);
        showContentView();
        if (!com.max.hbcommon.utils.c.w(calendar)) {
            List<GameOverviewCalendarListObj> list = this.f88903x;
            f0.m(calendar);
            list.addAll(calendar);
        }
        a5().f109687e.f116875c.setVisibility(8);
        SegmentFilterView segmentFilterView = a5().f109687e.f116879g;
        f0.o(segmentFilterView, "binding.vgHeader.vFilter");
        Z4(segmentFilterView);
        RecyclerView.Adapter adapter = a5().f109684b.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38982, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        this.f88900u = arguments.getString(aVar.b());
        this.f88901v = arguments.getString(aVar.a());
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d
    @dl.d
    public View K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38981, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.f88905z = System.currentTimeMillis();
        d8 d8VarC = d8.c(this.mInflater);
        f0.o(d8VarC, "inflate(mInflater)");
        f5(d8VarC);
        a5().f109685c.setBackgroundResource(R.color.transparent);
        a5().f109685c.S(new c());
        a5().f109685c.b0(false);
        a5().f109684b.setLayoutManager(new LinearLayoutManager(this.mContext));
        a5().f109684b.setAdapter(new d(this.mContext, this.f88903x));
        a5().f109685c.setVisibility(4);
        a5().f109684b.setOverScrollMode(2);
        CircularProgressIndicator circularProgressIndicator = J4().f111334f;
        circularProgressIndicator.setTrackColor(this.mContext.getColor(R.color.white_alpha30));
        circularProgressIndicator.setIndicatorColor(this.mContext.getColor(R.color.divider_primary_1_color));
        circularProgressIndicator.p();
        b5();
        SmartRefreshLayout smartRefreshLayoutB = a5().b();
        f0.o(smartRefreshLayoutB, "binding.root");
        return smartRefreshLayoutB;
    }

    public final void Z4(@dl.d SegmentFilterView segmentFilterView) {
        if (PatchProxy.proxy(new Object[]{segmentFilterView}, this, changeQuickRedirect, false, 38985, new Class[]{SegmentFilterView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(segmentFilterView, "segmentFilterView");
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setDesc("场次");
        keyDescObj.setKey("0");
        keyDescObj.setChecked(this.f88904y == Dota2CalendarView.Type.Count);
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc("胜率");
        keyDescObj2.setKey("1");
        keyDescObj2.setChecked(this.f88904y == Dota2CalendarView.Type.Win);
        arrayList.add(keyDescObj2);
        segmentFilterView.setLittleWhiteStyle();
        segmentFilterView.setMOnTabCheckedListener(new b());
        segmentFilterView.setData(arrayList);
        segmentFilterView.d();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @dl.d
    public Fragment a2(@dl.e Map<String, ? extends Object> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 38987, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : A.a(map);
    }

    @dl.d
    public final d8 a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38979, new Class[0], d8.class);
        if (patchProxyResultProxy.isSupported) {
            return (d8) patchProxyResultProxy.result;
        }
        d8 d8Var = this.f88902w;
        if (d8Var != null) {
            return d8Var;
        }
        f0.S("binding");
        return null;
    }

    @dl.e
    public final String c5() {
        return this.f88901v;
    }

    @dl.e
    public final String d5() {
        return this.f88900u;
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.dota2.d, com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public boolean e4() {
        return false;
    }

    public final void f5(@dl.d d8 d8Var) {
        if (PatchProxy.proxy(new Object[]{d8Var}, this, changeQuickRedirect, false, 38980, new Class[]{d8.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(d8Var, "<set-?>");
        this.f88902w = d8Var;
    }

    public final void g5(@dl.e String str) {
        this.f88901v = str;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38986, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        Dota2GameDetailFragment.a aVar = Dota2GameDetailFragment.C;
        jsonObject.addProperty(aVar.b(), this.f88900u);
        jsonObject.addProperty(aVar.a(), this.f88901v);
        return jsonObject.toString();
    }

    public final void h5(@dl.e String str) {
        this.f88900u = str;
    }
}
