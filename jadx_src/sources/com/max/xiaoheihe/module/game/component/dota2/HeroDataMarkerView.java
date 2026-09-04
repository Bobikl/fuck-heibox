package com.max.xiaoheihe.module.game.component.dota2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.max.hbcommon.base.adapter.s;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2PlayerObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.comparisons.g;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: HeroDataMarkerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nHeroDataMarkerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeroDataMarkerView.kt\ncom/max/xiaoheihe/module/game/component/dota2/HeroDataMarkerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1011#2,2:144\n*S KotlinDebug\n*F\n+ 1 HeroDataMarkerView.kt\ncom/max/xiaoheihe/module/game/component/dota2/HeroDataMarkerView\n*L\n83#1:144,2\n*E\n"})
@SuppressLint({"ViewConstructor"})
@o(parameters = 0)
public final class HeroDataMarkerView extends MarkerView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87241d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final List<Dota2PlayerObj> f87242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private a f87243c;

    /* JADX INFO: compiled from: HeroDataMarkerView.kt */
    public interface a {
        @e
        List<Integer> a();

        @d
        Dota2MatchDetailChart.Type getType();
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @t0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HeroDataMarkerView.kt\ncom/max/xiaoheihe/module/game/component/dota2/HeroDataMarkerView\n*L\n1#1,328:1\n83#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t10, t11}, this, changeQuickRedirect, false, 37414, new Class[]{Object.class, Object.class}, Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : g.l(Float.valueOf(n.p(((Dota2ChartObj) t11).getValue())), Float.valueOf(n.p(((Dota2ChartObj) t10).getValue())));
        }
    }

    /* JADX INFO: compiled from: HeroDataMarkerView.kt */
    public static final class c extends s<Dota2ChartObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HeroDataMarkerView f87244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Dota2ChartObj> list, HeroDataMarkerView heroDataMarkerView, Context context) {
            super(context, list, R.layout.item_hero_data_maker);
            this.f87244b = heroDataMarkerView;
        }

        public void m(@e s.e eVar, @e Dota2ChartObj dota2ChartObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2ChartObj}, this, changeQuickRedirect, false, 37415, new Class[]{s.e.class, Dota2ChartObj.class}, Void.TYPE).isSupported || eVar == null) {
                return;
            }
            HeroDataMarkerView heroDataMarkerView = this.f87244b;
            if (dota2ChartObj != null) {
                View viewI = eVar.i(R.id.v_trend);
                TextView textView = (TextView) eVar.i(R.id.tv_value);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
                int iE1 = com.max.xiaoheihe.utils.d.e1(dota2ChartObj.getColor());
                viewI.setBackgroundColor(iE1);
                textView.setTextColor(iE1);
                textView.setText(heroDataMarkerView.a(n.q(dota2ChartObj.getValue())));
                textView.setTypeface(bb.d.a().b(2));
                com.max.hbimage.b.K(dota2ChartObj.getIcon(), imageView);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Dota2ChartObj dota2ChartObj) {
            if (PatchProxy.proxy(new Object[]{eVar, dota2ChartObj}, this, changeQuickRedirect, false, 37416, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, dota2ChartObj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroDataMarkerView(@d Context context, @d List<Dota2PlayerObj> playerList, @e a aVar) {
        super(context, R.layout.view_hero_data_maker);
        f0.p(context, "context");
        f0.p(playerList, "playerList");
        this.f87242b = playerList;
        this.f87243c = aVar;
        setBackground(ViewUtils.G(ViewUtils.f(context, 4.0f), com.max.xiaoheihe.utils.d.E(R.color.black_alpha90)));
    }

    @d
    public final String a(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37411, new Class[]{Integer.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = new DecimalFormat("#,###").format(Integer.valueOf(i10));
        f0.o(str, "formatter.format(number)");
        return str;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(@e Canvas canvas, float f10, float f11) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37413, new Class[]{Canvas.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.draw(canvas, f10, 0.0f);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    @e
    public MPPointF getOffsetForDrawingAtPoint(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 37412, new Class[]{cls, cls}, MPPointF.class);
        if (patchProxyResultProxy.isSupported) {
            return (MPPointF) patchProxyResultProxy.result;
        }
        float f12 = ViewUtils.f(getContext(), 8.0f);
        if (f10 >= ViewUtils.L(getContext()) / 2) {
            f12 = -(f12 + getMeasuredWidth());
        }
        return new MPPointF(f12, getChartView() != null ? (ViewUtils.V(getChartView()) - getMeasuredHeight()) / 2.0f : 0.0f);
    }

    @e
    public final a getOnGetSelectLines() {
        return this.f87243c;
    }

    @d
    public final List<Dota2PlayerObj> getPlayerList() {
        return this.f87242b;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(@d Entry e10, @e Highlight highlight) {
        int i10;
        if (PatchProxy.proxy(new Object[]{e10, highlight}, this, changeQuickRedirect, false, 37410, new Class[]{Entry.class, Highlight.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(e10, "e");
        View viewFindViewById = findViewById(R.id.tv_time);
        f0.o(viewFindViewById, "findViewById(R.id.tv_time)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rv);
        f0.o(viewFindViewById2, "findViewById(R.id.rv)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        Object data = e10.getData();
        f0.n(data, "null cannot be cast to non-null type com.max.xiaoheihe.bean.game.dota2.Dota2ChartObj");
        Dota2ChartObj dota2ChartObj = (Dota2ChartObj) data;
        ArrayList arrayList = new ArrayList();
        a aVar = this.f87243c;
        if ((aVar != null ? aVar.getType() : null) != Dota2MatchDetailChart.Type.Exp) {
            List<Dota2ChartObj> graph_gold = this.f87242b.get(0).getGraph_gold();
            f0.m(graph_gold);
            int size = graph_gold.size();
            i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = 0;
                    break;
                }
                List<Dota2ChartObj> graph_gold2 = this.f87242b.get(0).getGraph_gold();
                f0.m(graph_gold2);
                if (f0.g(graph_gold2.get(i10).getTime(), dota2ChartObj.getTime())) {
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            List<Dota2ChartObj> graph_exp = this.f87242b.get(0).getGraph_exp();
            f0.m(graph_exp);
            int size2 = graph_exp.size();
            i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    i10 = 0;
                    break;
                }
                List<Dota2ChartObj> graph_exp2 = this.f87242b.get(0).getGraph_exp();
                f0.m(graph_exp2);
                if (f0.g(graph_exp2.get(i10).getTime(), dota2ChartObj.getTime())) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        List[] listArr = new List[1];
        a aVar2 = this.f87243c;
        listArr[0] = aVar2 != null ? aVar2.a() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            for (Dota2PlayerObj dota2PlayerObj : this.f87242b) {
                a aVar3 = this.f87243c;
                List<Dota2ChartObj> graph_gold3 = (aVar3 != null ? aVar3.getType() : null) == Dota2MatchDetailChart.Type.Gold ? dota2PlayerObj.getGraph_gold() : dota2PlayerObj.getGraph_exp();
                f0.m(graph_gold3);
                Dota2ChartObj dota2ChartObj2 = graph_gold3.get(i10);
                dota2ChartObj2.setColor(dota2PlayerObj.getChart_color());
                dota2ChartObj2.setIcon(dota2PlayerObj.getHero_icon());
                arrayList.add(dota2ChartObj2);
            }
        } else {
            a aVar4 = this.f87243c;
            List<Integer> listA = aVar4 != null ? aVar4.a() : null;
            f0.m(listA);
            Iterator<Integer> it = listA.iterator();
            while (it.hasNext()) {
                Dota2PlayerObj dota2PlayerObj2 = this.f87242b.get(it.next().intValue());
                a aVar5 = this.f87243c;
                List<Dota2ChartObj> graph_gold4 = (aVar5 != null ? aVar5.getType() : null) == Dota2MatchDetailChart.Type.Gold ? dota2PlayerObj2.getGraph_gold() : dota2PlayerObj2.getGraph_exp();
                f0.m(graph_gold4);
                Dota2ChartObj dota2ChartObj3 = graph_gold4.get(i10);
                dota2ChartObj3.setColor(dota2PlayerObj2.getChart_color());
                dota2ChartObj3.setIcon(dota2PlayerObj2.getHero_icon());
                arrayList.add(dota2ChartObj3);
            }
        }
        if (arrayList.size() > 1) {
            w.m0(arrayList, new b());
        }
        textView.setText(com.max.hbutils.utils.w.b(dota2ChartObj.getTime()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new c(arrayList, this, getContext()));
        super.refreshContent(e10, highlight);
    }

    public final void setOnGetSelectLines(@e a aVar) {
        this.f87243c = aVar;
    }
}
