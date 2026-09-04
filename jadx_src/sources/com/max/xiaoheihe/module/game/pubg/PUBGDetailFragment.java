package com.max.xiaoheihe.module.game.pubg;

import android.app.Activity;
import android.content.Context;
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
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.component.chart.HeyBoxRadarChart;
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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGDetailFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.game.pubg.e.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGStatsDetailObj f88025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f88026c;

    @BindView(R.id.cv_matches)
    CardView cv_matches;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f88027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f88028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f88029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f88030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f88031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.xiaoheihe.module.game.pubg.b f88032i;

    @BindView(R.id.iv_arrow)
    ImageView iv_arrow;

    @BindView(R.id.iv_mode)
    ImageView iv_mode;

    @BindView(R.id.iv_rating_img)
    ImageView iv_rating_img;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s<PUBGStatsObj> f88033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u<PUBGMatchObj> f88034k;

    @BindView(R.id.ll_mode)
    LinearLayout ll_mode;

    @BindView(R.id.line)
    LineChart mLineChart;

    @BindView(R.id.cv_line_chart)
    CardView mLineChartCardView;

    @BindView(R.id.radar)
    HeyBoxRadarChart mRadarChart;

    @BindView(R.id.tv_radar)
    TextView mRadarTextView;

    @BindView(R.id.tv_rating_trend)
    TextView mRatingTrendTextView;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private GridView f88039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PopupWindow f88040q;

    @BindView(R.id.rv_matches)
    RecyclerView rv_matches;

    @BindView(R.id.rv_overview)
    RecyclerView rv_overview;

    @BindView(R.id.rv_stats)
    RecyclerView rv_stats;

    @BindView(R.id.tv_match_count)
    TextView tv_match_count;

    @BindView(R.id.tv_mode)
    TextView tv_mode;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<PUBGDataObj> f88035l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    List<PUBGStatsObj> f88036m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    List<PUBGGameModeFilter> f88037n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    List<PUBGMatchObj> f88038o = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f88041r = 0;

    public class a implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 38212, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : n.g(f10);
        }
    }

    public class b implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 38213, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : PUBGDetailFragment.this.f88025b.getTrend().get((int) f10).getDesc();
        }
    }

    public class c implements IAxisValueFormatter {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f88048a;

        c(int i10) {
            this.f88048a = i10;
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f10, AxisBase axisBase) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), axisBase}, this, changeQuickRedirect, false, 38214, new Class[]{Float.TYPE, AxisBase.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            int i10 = (int) f10;
            if (i10 > 0) {
                i10 = this.f88048a - i10;
            }
            return PUBGDetailFragment.this.f88025b.getRadar_score().get(i10).getDesc();
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88050b;

        d(Context context) {
            this.f88050b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38215, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment pUBGDetailFragment = PUBGDetailFragment.this;
            pUBGDetailFragment.f4(this.f88050b, pUBGDetailFragment.f88040q, PUBGDetailFragment.this.f88039p);
        }
    }

    public class e implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38216, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment.this.iv_arrow.setRotationX(0.0f);
        }
    }

    public class f implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38217, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment.this.f88039p.setVisibility(0);
        }
    }

    public class g implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridView f88054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PopupWindow f88055b;

        g(GridView gridView, PopupWindow popupWindow) {
            this.f88054a = gridView;
            this.f88055b = popupWindow;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38218, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f88054a.setVisibility(8);
            this.f88055b.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38211, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment pUBGDetailFragment = PUBGDetailFragment.this;
            Activity activity = ((com.max.hbcommon.base.d) pUBGDetailFragment).mContext;
            PUBGDetailFragment pUBGDetailFragment2 = PUBGDetailFragment.this;
            PUBGDetailFragment.N3(pUBGDetailFragment, activity, view, pUBGDetailFragment2.f88037n, pUBGDetailFragment2);
        }
    }

    public class i extends u<PUBGMatchObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38223, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : super.getItemCount() + 1;
        }

        @Override // com.max.hbcommon.base.adapter.u, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            Object[] objArr = {new Integer(i10)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38222, new Class[]{cls}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, null);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, PUBGMatchObj pUBGMatchObj) {
            Object[] objArr = {new Integer(i10), pUBGMatchObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 38225, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, pUBGMatchObj);
        }

        public int n(int i10, PUBGMatchObj pUBGMatchObj) {
            return i10 == 0 ? R.layout.item_matches_title : R.layout.item_matches;
        }

        public void o(s.e eVar, int i10, List<Object> list) {
            if (PatchProxy.proxy(new Object[]{eVar, new Integer(i10), list}, this, changeQuickRedirect, false, 38221, new Class[]{s.e.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, i10 == 0 ? null : (PUBGMatchObj) this.mDataList.get(i10 - 1));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
            if (PatchProxy.proxy(new Object[]{viewHolder, new Integer(i10), list}, this, changeQuickRedirect, false, 38227, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE).isSupported) {
                return;
            }
            o((s.e) viewHolder, i10, list);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 38226, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            p(eVar, (PUBGMatchObj) obj);
        }

        public void p(s.e eVar, PUBGMatchObj pUBGMatchObj) {
            if (!PatchProxy.proxy(new Object[]{eVar, pUBGMatchObj}, this, changeQuickRedirect, false, 38224, new Class[]{s.e.class, PUBGMatchObj.class}, Void.TYPE).isSupported && eVar.d() == R.layout.item_matches) {
                com.max.xiaoheihe.module.game.pubg.utils.b.l((ViewGroup) eVar.b(), pUBGMatchObj, eVar.getAdapterPosition() == getItemCount() - 1);
            }
        }
    }

    public class j implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38228, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment.this.f88041r = 0;
            PUBGDetailFragment.Y3(PUBGDetailFragment.this);
            PUBGDetailFragment.Z3(PUBGDetailFragment.this);
        }
    }

    public class k implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38229, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailFragment.X3(PUBGDetailFragment.this, 30);
            PUBGDetailFragment.Z3(PUBGDetailFragment.this);
        }
    }

    public class l extends com.max.hbcommon.network.d<Result<PUBGStatsDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38230, new Class[0], Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = PUBGDetailFragment.this.mRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                }
                PUBGDetailFragment.a4(PUBGDetailFragment.this);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38231, new Class[]{Throwable.class}, Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = PUBGDetailFragment.this.mRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                }
                super.onError(th2);
                PUBGDetailFragment.b4(PUBGDetailFragment.this);
            }
        }

        public void onNext(Result<PUBGStatsDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38232, new Class[]{Result.class}, Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                PUBGDetailFragment.O3(PUBGDetailFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38233, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGStatsDetailObj>) obj);
        }
    }

    public class m extends com.max.hbcommon.network.d<Result<PUBGMatchListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38234, new Class[0], Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                PUBGDetailFragment.this.mRefreshLayout.A(0);
                PUBGDetailFragment.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38235, new Class[]{Throwable.class}, Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                PUBGDetailFragment.this.mRefreshLayout.A(0);
                PUBGDetailFragment.this.mRefreshLayout.p(0);
                PUBGDetailFragment.this.cv_matches.setVisibility(8);
            }
        }

        public void onNext(Result<PUBGMatchListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38236, new Class[]{Result.class}, Void.TYPE).isSupported && PUBGDetailFragment.this.isActive()) {
                if (result.getResult() != null) {
                    PUBGDetailFragment.P3(PUBGDetailFragment.this, result.getResult());
                } else {
                    PUBGDetailFragment.this.cv_matches.setVisibility(8);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38237, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PUBGMatchListObj>) obj);
        }
    }

    private boolean L3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38196, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<PUBGGameModeFilter> it = this.f88037n.iterator();
        while (it.hasNext()) {
            if (this.f88027d.equals(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void N3(PUBGDetailFragment pUBGDetailFragment, Context context, View view, List list, com.max.xiaoheihe.module.game.pubg.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment, context, view, list, bVar}, null, changeQuickRedirect, true, 38204, new Class[]{PUBGDetailFragment.class, Context.class, View.class, List.class, com.max.xiaoheihe.module.game.pubg.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.n4(context, view, list, bVar);
    }

    static /* synthetic */ void O3(PUBGDetailFragment pUBGDetailFragment, PUBGStatsDetailObj pUBGStatsDetailObj) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment, pUBGStatsDetailObj}, null, changeQuickRedirect, true, 38209, new Class[]{PUBGDetailFragment.class, PUBGStatsDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.m4(pUBGStatsDetailObj);
    }

    static /* synthetic */ void P3(PUBGDetailFragment pUBGDetailFragment, PUBGMatchListObj pUBGMatchListObj) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment, pUBGMatchListObj}, null, changeQuickRedirect, true, 38210, new Class[]{PUBGDetailFragment.class, PUBGMatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.o4(pUBGMatchListObj);
    }

    static /* synthetic */ int X3(PUBGDetailFragment pUBGDetailFragment, int i10) {
        int i11 = pUBGDetailFragment.f88041r + i10;
        pUBGDetailFragment.f88041r = i11;
        return i11;
    }

    static /* synthetic */ void Y3(PUBGDetailFragment pUBGDetailFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment}, null, changeQuickRedirect, true, 38205, new Class[]{PUBGDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.c4();
    }

    static /* synthetic */ void Z3(PUBGDetailFragment pUBGDetailFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment}, null, changeQuickRedirect, true, 38206, new Class[]{PUBGDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.e4();
    }

    static /* synthetic */ void a4(PUBGDetailFragment pUBGDetailFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment}, null, changeQuickRedirect, true, 38207, new Class[]{PUBGDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.showContentView();
    }

    static /* synthetic */ void b4(PUBGDetailFragment pUBGDetailFragment) {
        if (PatchProxy.proxy(new Object[]{pUBGDetailFragment}, null, changeQuickRedirect, true, 38208, new Class[]{PUBGDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        pUBGDetailFragment.showError();
    }

    private void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38190, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Yb(this.f88028e, this.f88029f, this.f88026c, this.f88030g, this.f88027d, this.f88031h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38186, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.f88028e = getArguments().getString("nickname");
        this.f88029f = getArguments().getString("season");
        this.f88026c = getArguments().getString("region");
        this.f88027d = getArguments().getString("mode");
        this.f88030g = getArguments().getString("fpp");
        String string = getArguments().getString("player_id");
        this.f88031h = string;
        if (TextUtils.isEmpty(string)) {
            this.f88031h = this.f88028e;
        }
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38191, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i2(this.f88028e, this.f88041r, 30, this.f88029f, this.f88026c, this.f88030g, this.f88027d, this.f88031h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    private void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38189, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88032i = new com.max.xiaoheihe.module.game.pubg.b(this.mContext, this.f88035l, 4, this.f88027d);
        this.rv_overview.setLayoutManager(new GridLayoutManager(this.mContext, 4));
        this.rv_overview.setAdapter(this.f88032i);
        this.f88033j = new s<PUBGStatsObj>(this.mContext, this.f88036m, R.layout.item_pubg_stats) { // from class: com.max.xiaoheihe.module.game.pubg.PUBGDetailFragment.2
            public static ChangeQuickRedirect changeQuickRedirect;

            public void m(s.e eVar, PUBGStatsObj pUBGStatsObj) {
                if (PatchProxy.proxy(new Object[]{eVar, pUBGStatsObj}, this, changeQuickRedirect, false, 38219, new Class[]{s.e.class, PUBGStatsObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                RecyclerView recyclerView = (RecyclerView) eVar.i(R.id.rv_data);
                TextView textView = (TextView) eVar.i(R.id.tv_score);
                if (recyclerView.getLayoutManager() == null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(((com.max.hbcommon.base.d) PUBGDetailFragment.this).mContext, 3) { // from class: com.max.xiaoheihe.module.game.pubg.PUBGDetailFragment.2.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public boolean canScrollVertically() {
                            return false;
                        }
                    });
                }
                if (recyclerView.getAdapter() == null) {
                    recyclerView.setAdapter(new com.max.xiaoheihe.module.game.pubg.b(((com.max.hbcommon.base.d) PUBGDetailFragment.this).mContext, pUBGStatsObj.getOverview(), -1));
                } else {
                    ((com.max.xiaoheihe.module.game.pubg.b) recyclerView.getAdapter()).p(pUBGStatsObj.getOverview());
                }
                eVar.p(R.id.tv_desc, pUBGStatsObj.getDesc());
                textView.setText(pUBGStatsObj.getScore_value());
                textView.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(PUBGDetailFragment.this.f88027d));
                com.max.hbimage.b.H(pUBGStatsObj.getImg(), (ImageView) eVar.i(R.id.iv_icon));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, PUBGStatsObj pUBGStatsObj) {
                if (PatchProxy.proxy(new Object[]{eVar, pUBGStatsObj}, this, changeQuickRedirect, false, 38220, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, pUBGStatsObj);
            }
        };
        this.rv_stats.setLayoutManager(new LinearLayoutManager(this.mContext) { // from class: com.max.xiaoheihe.module.game.pubg.PUBGDetailFragment.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.rv_stats.setAdapter(this.f88033j);
        this.rv_matches.setLayoutManager(new LinearLayoutManager(this.mContext) { // from class: com.max.xiaoheihe.module.game.pubg.PUBGDetailFragment.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        i iVar = new i(getContext(), this.f88038o);
        this.f88034k = iVar;
        this.rv_matches.setAdapter(iVar);
        this.mRefreshLayout.S(new j());
        this.mRefreshLayout.f0(new k());
    }

    public static PUBGDetailFragment h4(String str, String str2, String str3, String str4, String str5, String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 38184, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGDetailFragment) patchProxyResultProxy.result;
        }
        PUBGDetailFragment pUBGDetailFragment = new PUBGDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("nickname", str);
        bundle.putString("mode", str2);
        bundle.putString("season", str3);
        bundle.putString("region", str5);
        bundle.putString("fpp", str4);
        bundle.putString("player_id", str6);
        pUBGDetailFragment.setArguments(bundle);
        return pUBGDetailFragment;
    }

    private void i4() {
        PUBGStatsDetailObj pUBGStatsDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38194, new Class[0], Void.TYPE).isSupported || (pUBGStatsDetailObj = this.f88025b) == null) {
            return;
        }
        if (pUBGStatsDetailObj.getTrend() == null || this.f88025b.getTrend().size() <= 0) {
            this.mLineChartCardView.setVisibility(8);
        } else {
            this.mLineChartCardView.setVisibility(0);
            this.mLineChart.clear();
            ArrayList arrayList = new ArrayList();
            com.max.hbcommon.component.chart.a.a(this.mLineChart, 6, false, false);
            this.mLineChart.getAxisLeft().setValueFormatter(new a());
            this.mLineChart.getXAxis().setValueFormatter(new b());
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < this.f88025b.getTrend().size(); i10++) {
                arrayList2.add(new Entry(i10, com.max.xiaoheihe.module.game.pubg.utils.c.d(this.f88027d, this.f88025b.getTrend().get(i10)), arrayList));
            }
            LineDataSet lineDataSet = new LineDataSet(arrayList2, this.f88027d);
            lineDataSet.setLineWidth(1.5f);
            lineDataSet.setColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(this.f88027d));
            lineDataSet.setCircleColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(this.f88027d));
            lineDataSet.setCircleRadius(3.0f);
            lineDataSet.setCircleHoleRadius(1.5f);
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawHighlightIndicators(false);
            arrayList.add(lineDataSet);
            this.mLineChart.setData(new LineData(arrayList));
            PUBGTrendMarkerView pUBGTrendMarkerView = new PUBGTrendMarkerView(this.mContext, this.mLineChart.getXAxis().getValueFormatter());
            pUBGTrendMarkerView.setChartView(this.mLineChart);
            this.mLineChart.setMarker(pUBGTrendMarkerView);
            this.mLineChart.invalidate();
        }
        if (this.f88025b.getRadar_score() == null || this.f88025b.getRadar_score().size() <= 0) {
            this.mRadarTextView.setVisibility(8);
            this.mRadarChart.setVisibility(8);
            return;
        }
        int size = this.f88025b.getRadar_score().size();
        this.mRadarTextView.setVisibility(0);
        this.mRadarChart.setVisibility(0);
        this.mRadarChart.setBackgroundColor(getResources().getColor(R.color.white));
        this.mRadarChart.setExtraTopOffset(40.0f);
        this.mRadarChart.setExtraBottomOffset(40.0f);
        this.mRadarChart.setRotationEnabled(false);
        this.mRadarChart.setDescription(null);
        this.mRadarChart.getLegend().setEnabled(false);
        HeyBoxRadarChart heyBoxRadarChart = this.mRadarChart;
        Easing.EasingOption easingOption = Easing.EasingOption.EaseInOutQuad;
        heyBoxRadarChart.animateXY(1000, 1000, easingOption, easingOption);
        XAxis xAxis = this.mRadarChart.getXAxis();
        xAxis.setValueFormatter(new c(size));
        xAxis.setDrawLabels(false);
        YAxis yAxis = this.mRadarChart.getYAxis();
        yAxis.setLabelCount(5, true);
        yAxis.setDrawLabels(false);
        yAxis.setAxisMinimum(0.0f);
        yAxis.setAxisMaximum(100.0f);
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (i11 < size) {
            arrayList3.add(new RadarEntry(n.p(this.f88025b.getRadar_score().get(i11 > 0 ? size - i11 : i11).getValue())));
            i11++;
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList3, "");
        radarDataSet.setDrawFilled(true);
        radarDataSet.setDrawValues(false);
        radarDataSet.setDrawHighlightIndicators(false);
        radarDataSet.setFillAlpha(128);
        radarDataSet.setFillDrawable(com.max.xiaoheihe.module.game.pubg.utils.c.g(this.f88027d, ViewUtils.V(this.mRadarChart), ViewUtils.V(this.mRadarChart)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(radarDataSet);
        this.mRadarChart.setData(new RadarData(arrayList4));
        this.mRadarChart.invalidate();
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38195, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88037n.clear();
        List<PUBGGameModeFilter> modes = this.f88025b.getModes();
        if (!com.max.hbcommon.utils.c.w(modes)) {
            this.f88037n.addAll(modes);
        }
        if (!L3() && this.f88037n.size() > 0) {
            String key = this.f88037n.get(0).getKey();
            this.f88027d = key;
            this.f88032i.q(key);
            initData();
            return;
        }
        for (PUBGGameModeFilter pUBGGameModeFilter : this.f88037n) {
            if (this.f88027d.equals(pUBGGameModeFilter.getKey())) {
                this.tv_mode.setText(pUBGGameModeFilter.getValue());
                this.tv_match_count.setText(pUBGGameModeFilter.getMatch_count());
                if (com.max.hbcommon.utils.c.u(pUBGGameModeFilter.getRating_img())) {
                    this.iv_rating_img.setVisibility(8);
                } else {
                    this.iv_rating_img.setVisibility(0);
                    com.max.hbimage.b.K(pUBGGameModeFilter.getRating_img(), this.iv_rating_img);
                }
                pUBGGameModeFilter.setCustom_checked(true);
            }
        }
        this.tv_mode.setTextColor(com.max.xiaoheihe.module.game.pubg.utils.c.a(this.f88027d));
        this.iv_mode.setImageResource(com.max.xiaoheihe.module.game.pubg.utils.c.c(this.f88027d));
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38197, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88035l.clear();
        List<PUBGDataObj> overview = this.f88025b.getOverview();
        if (!com.max.hbcommon.utils.c.w(overview)) {
            this.f88035l.addAll(overview);
        }
        if (com.max.hbcommon.utils.c.w(this.f88035l)) {
            this.rv_overview.setVisibility(8);
        } else {
            this.rv_overview.setVisibility(0);
        }
        this.f88032i.notifyDataSetChanged();
    }

    private void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38198, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88036m.clear();
        List<PUBGStatsObj> stats = this.f88025b.getStats();
        if (!com.max.hbcommon.utils.c.w(stats)) {
            this.f88036m.addAll(stats);
        }
        this.f88033j.notifyDataSetChanged();
    }

    private void m4(PUBGStatsDetailObj pUBGStatsDetailObj) {
        if (PatchProxy.proxy(new Object[]{pUBGStatsDetailObj}, this, changeQuickRedirect, false, 38193, new Class[]{PUBGStatsDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88025b = pUBGStatsDetailObj;
        j4();
        k4();
        i4();
        l4();
    }

    private void n4(Context context, View view, List<PUBGGameModeFilter> list, com.max.xiaoheihe.module.game.pubg.e.b bVar) {
        if (PatchProxy.proxy(new Object[]{context, view, list, bVar}, this, changeQuickRedirect, false, 38199, new Class[]{Context.class, View.class, List.class, com.max.xiaoheihe.module.game.pubg.e.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_filter, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.divider_top);
        this.f88039p = (GridView) viewInflate.findViewById(R.id.gv_filter);
        viewFindViewById.setVisibility(0);
        this.f88039p.setAdapter((ListAdapter) new com.max.xiaoheihe.module.game.pubg.e(context, lb.a.J0, list, com.max.xiaoheihe.module.game.pubg.a.f88153a.a(list), bVar));
        PopupWindow popupWindow = this.f88040q;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f88040q = new PopupWindow(viewInflate, -1, -1, true);
        viewInflate.setOnClickListener(new d(context));
        this.f88040q.setTouchable(true);
        this.f88040q.setBackgroundDrawable(new BitmapDrawable());
        this.f88040q.setAnimationStyle(0);
        this.f88040q.setOnDismissListener(new e());
        if (this.f88040q.isShowing() || view == null) {
            return;
        }
        ViewUtils.o0(this.f88040q, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new f());
        this.f88039p.startAnimation(animationLoadAnimation);
        this.iv_arrow.setRotationX(180.0f);
    }

    private void o4(PUBGMatchListObj pUBGMatchListObj) {
        if (PatchProxy.proxy(new Object[]{pUBGMatchListObj}, this, changeQuickRedirect, false, 38192, new Class[]{PUBGMatchListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f88041r == 0) {
            this.f88038o.clear();
        }
        if (pUBGMatchListObj.getMatches() != null) {
            this.f88038o.addAll(pUBGMatchListObj.getMatches());
        }
        if (com.max.hbcommon.utils.c.w(this.f88038o)) {
            this.cv_matches.setVisibility(8);
        } else {
            this.cv_matches.setVisibility(0);
        }
        this.f88034k.notifyDataSetChanged();
    }

    private void p4(List<PUBGGameModeFilter> list, PUBGGameModeFilter pUBGGameModeFilter) {
        if (PatchProxy.proxy(new Object[]{list, pUBGGameModeFilter}, this, changeQuickRedirect, false, 38202, new Class[]{List.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.game.pubg.a.f88153a.b(list, pUBGGameModeFilter);
        String key = pUBGGameModeFilter.getKey();
        this.f88027d = key;
        this.f88032i.q(key);
    }

    @Override // com.max.xiaoheihe.module.game.pubg.e.b
    public void T1(CompoundButton compoundButton, PUBGGameModeFilter pUBGGameModeFilter) {
        if (PatchProxy.proxy(new Object[]{compoundButton, pUBGGameModeFilter}, this, changeQuickRedirect, false, 38201, new Class[]{CompoundButton.class, PUBGGameModeFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        p4(this.f88037n, pUBGGameModeFilter);
        f4(this.mContext, this.f88040q, this.f88039p);
        initData();
    }

    public void f4(Context context, PopupWindow popupWindow, GridView gridView) {
        if (PatchProxy.proxy(new Object[]{context, popupWindow, gridView}, this, changeQuickRedirect, false, 38200, new Class[]{Context.class, PopupWindow.class, GridView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_out);
        animationLoadAnimation.setAnimationListener(new g(gridView, popupWindow));
        gridView.startAnimation(animationLoadAnimation);
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38187, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f88041r = 0;
        c4();
        e4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38185, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_pubg_detail);
        this.mUnBinder = ButterKnife.f(this, view);
        d4();
        g4();
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c4();
    }

    @Override // com.max.hbcommon.base.d
    public void registerEvents() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38188, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.ll_mode.setOnClickListener(new h());
    }
}
