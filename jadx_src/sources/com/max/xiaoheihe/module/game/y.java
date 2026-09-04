package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GamePlatformInfoObj;
import com.max.xiaoheihe.bean.game.GlobalRegionPriceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

/* JADX INFO: compiled from: GameDetailUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class y {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: GameDetailUtils.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f88565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GlobalRegionPriceObj f88566c;

        a(Context context, GlobalRegionPriceObj globalRegionPriceObj) {
            this.f88565b = context;
            this.f88566c = globalRegionPriceObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32992, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f88565b, this.f88566c.getPurchase_protocol());
        }
    }

    /* JADX INFO: compiled from: GameDetailUtils.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GamePlatformInfoObj f88567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f88569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88570e;

        b(GamePlatformInfoObj gamePlatformInfoObj, String str, e eVar, com.max.hbcommon.component.i iVar) {
            this.f88567b = gamePlatformInfoObj;
            this.f88568c = str;
            this.f88569d = eVar;
            this.f88570e = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32993, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f88567b.getPlatf().equals(this.f88568c)) {
                this.f88569d.a(this.f88567b);
            }
            com.max.hbcommon.component.i iVar = this.f88570e;
            if (iVar == null || !iVar.isShowing()) {
                return;
            }
            this.f88570e.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameDetailUtils.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f88571b;

        c(com.max.hbcommon.component.i iVar) {
            this.f88571b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32994, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f88571b) == null || !iVar.isShowing()) {
                return;
            }
            this.f88571b.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameDetailUtils.java */
    public static class d extends com.max.hbcommon.base.adapter.s<GlobalRegionPriceObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f88572b;

        public d(Context context, List<GlobalRegionPriceObj> list) {
            super(context, list, R.layout.item_global_price_trend);
            this.f88572b = context;
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, GlobalRegionPriceObj globalRegionPriceObj) {
            if (PatchProxy.proxy(new Object[]{eVar, globalRegionPriceObj}, this, changeQuickRedirect, false, 32995, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
                return;
            }
            y.b(eVar, globalRegionPriceObj);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, GlobalRegionPriceObj globalRegionPriceObj) {
            if (PatchProxy.proxy(new Object[]{eVar, globalRegionPriceObj}, this, changeQuickRedirect, false, 32996, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, globalRegionPriceObj);
        }
    }

    /* JADX INFO: compiled from: GameDetailUtils.java */
    public interface e {
        void a(GamePlatformInfoObj gamePlatformInfoObj);
    }

    public static void a(LineChart lineChart, int i10, boolean z10, boolean z11) {
        Object[] objArr = {lineChart, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 32990, new Class[]{LineChart.class, Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = lineChart.getContext();
        com.max.hbcommon.component.chart.b bVar = new com.max.hbcommon.component.chart.b(lineChart, lineChart.getAnimator(), lineChart.getViewPortHandler());
        lineChart.setLayerType(1, null);
        bVar.f(true);
        lineChart.setRenderer(bVar);
        ViewPortHandler viewPortHandler = lineChart.getViewPortHandler();
        YAxis axisLeft = lineChart.getAxisLeft();
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        com.max.hbcommon.component.chart.g gVar = new com.max.hbcommon.component.chart.g(viewPortHandler, axisLeft, lineChart.getTransformer(axisDependency));
        gVar.d(z10);
        gVar.c(z11);
        lineChart.setRendererLeftYAxis(gVar);
        lineChart.setXAxisRenderer(new com.max.hbcommon.component.chart.e(lineChart.getViewPortHandler(), lineChart.getXAxis(), lineChart.getTransformer(axisDependency)));
        lineChart.setBackgroundColor(context.getResources().getColor(R.color.background_layer_2_color));
        lineChart.setDragEnabled(false);
        lineChart.setScaleEnabled(false);
        lineChart.setDescription(null);
        lineChart.getLegend().setEnabled(false);
        YAxis axisLeft2 = lineChart.getAxisLeft();
        if (i10 > 0) {
            axisLeft2.setLabelCount(i10, true);
        }
        axisLeft2.setAxisLineWidth(1.0f);
        axisLeft2.setAxisLineColor(context.getResources().getColor(R.color.divider_secondary_2_color));
        axisLeft2.setGridLineWidth(1.0f);
        axisLeft2.setGridColor(context.getResources().getColor(R.color.background_card_1_color_alpha30));
        axisLeft2.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
        YAxis axisRight = lineChart.getAxisRight();
        axisRight.setAxisLineWidth(1.0f);
        axisRight.setAxisLineColor(context.getResources().getColor(R.color.background_card_1_color_alpha30));
        axisRight.setDrawLabels(false);
        axisRight.setDrawGridLines(false);
        XAxis xAxis = lineChart.getXAxis();
        xAxis.setAxisLineWidth(1.0f);
        xAxis.setAxisLineColor(context.getResources().getColor(R.color.divider_secondary_2_color));
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setGridLineWidth(1.0f);
        xAxis.setGridColor(context.getResources().getColor(R.color.background_card_1_color_alpha30));
        xAxis.setTextColor(context.getResources().getColor(R.color.text_secondary_1_color));
        lineChart.animateX(300, Easing.EasingOption.EaseInOutQuad);
    }

    public static void b(com.max.hbcommon.base.adapter.s.e eVar, GlobalRegionPriceObj globalRegionPriceObj) {
        if (PatchProxy.proxy(new Object[]{eVar, globalRegionPriceObj}, null, changeQuickRedirect, true, 32989, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GlobalRegionPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = eVar.itemView.getContext();
        ImageView imageView = (ImageView) eVar.i(R.id.iv_flag);
        ImageView imageView2 = (ImageView) eVar.i(R.id.iv_ps_plus);
        TextView textView = (TextView) eVar.i(R.id.tv_name);
        TextView textView2 = (TextView) eVar.i(R.id.tv_lowest_price);
        TextView textView3 = (TextView) eVar.i(R.id.tv_current_price);
        TextView textView4 = (TextView) eVar.i(R.id.tv_current_symbol);
        TextView textView5 = (TextView) eVar.i(R.id.tv_usd_price);
        TextView textView6 = (TextView) eVar.i(R.id.tv_deadline_date);
        TextView textView7 = (TextView) eVar.i(R.id.tv_go_buy);
        TextView textView8 = (TextView) eVar.i(R.id.tv_discount);
        com.max.hbimage.b.K(globalRegionPriceObj.getImage(), imageView);
        textView.setText(globalRegionPriceObj.getRegion_name());
        if ("1".equals(globalRegionPriceObj.getPs_plus())) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        bb.d.d(textView3, 5);
        bb.d.d(textView4, 5);
        if ("1".equals(globalRegionPriceObj.getNew_lowest())) {
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.emerald_green));
            textView2.setText("当前新史低");
            textView2.setVisibility(0);
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.emerald_green));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.emerald_green));
            textView7.setBackground(com.max.hbutils.utils.q.o(context, R.color.emerald_green, 2.0f));
            textView8.setBackground(com.max.hbutils.utils.q.o(context, R.color.emerald_green, 2.0f));
            textView8.setTextColor(com.max.xiaoheihe.utils.d.F(context, R.color.white));
        } else if ("1".equals(globalRegionPriceObj.getIs_lowest())) {
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            textView2.setText("当前史低");
            textView2.setVisibility(0);
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.lowest_discount_color));
            textView7.setBackground(com.max.hbutils.utils.q.o(context, R.color.lowest_discount_color, 2.0f));
            textView8.setBackground(com.max.hbutils.utils.q.o(context, R.color.lowest_discount_color, 2.0f));
            textView8.setTextColor(com.max.xiaoheihe.utils.d.F(context, R.color.white));
        } else {
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            if (com.max.hbcommon.utils.c.u(globalRegionPriceObj.getLowest_price())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText("史低￥" + globalRegionPriceObj.getLowest_price());
                textView2.setVisibility(0);
            }
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView7.setBackgroundResource(R.drawable.text_primary_2dp);
            textView8.setBackgroundResource(R.drawable.text_primary_2dp);
            textView8.setTextColor(com.max.xiaoheihe.utils.d.F(context, R.color.background_layer_2_color));
        }
        textView3.setText(globalRegionPriceObj.getCurrent());
        textView5.setText(globalRegionPriceObj.getFinal_amount());
        if (globalRegionPriceObj.getDiscount() == null || com.max.hbutils.utils.n.o(globalRegionPriceObj.getDiscount()) <= 0.0d) {
            textView8.setVisibility(8);
        } else {
            textView8.setVisibility(0);
            textView8.setText(globalRegionPriceObj.getDiscount());
            textView8.setText(String.format("-%s%%", globalRegionPriceObj.getDiscount()));
        }
        if (com.max.hbcommon.utils.c.u(globalRegionPriceObj.getPurchase_protocol())) {
            textView7.setVisibility(8);
        } else {
            textView7.setVisibility(0);
            textView7.setOnClickListener(new a(context, globalRegionPriceObj));
        }
        textView6.setText(globalRegionPriceObj.getDeadline_date());
    }

    public static void c(Context context, List<GamePlatformInfoObj> list, String str, e eVar) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{context, list, str, eVar}, null, changeQuickRedirect, true, 32991, new Class[]{Context.class, List.class, String.class, e.class}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_switch_game_platform, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(context, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i(context, true, viewInflate);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_bg);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_platform);
        viewGroup2.removeAllViews();
        for (GamePlatformInfoObj gamePlatformInfoObj : list) {
            if (gamePlatformInfoObj.getPlatf() != null) {
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_game_platform_button, viewGroup2, z10);
                ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.iv_icon);
                TextView textView = (TextView) viewInflate2.findViewById(R.id.tv_name);
                if (str.equals(gamePlatformInfoObj.getPlatf())) {
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                    viewInflate2.setBackground(com.max.hbutils.utils.q.o(context, r1.R(gamePlatformInfoObj.getPlatf()), 2.0f));
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                } else {
                    viewInflate2.setBackground(com.max.hbutils.utils.q.o(context, R.color.gray_white_0, 2.0f));
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate2.getLayoutParams();
                if (viewGroup2.getChildCount() > 0) {
                    layoutParams.topMargin = ViewUtils.f(context, 12.0f);
                }
                com.max.hbimage.b.K(gamePlatformInfoObj.getImg_url(), imageView);
                textView.setText(gamePlatformInfoObj.getName());
                viewInflate2.setOnClickListener(new b(gamePlatformInfoObj, str, eVar, iVar));
                viewGroup2.addView(viewInflate2, layoutParams);
                z10 = false;
            }
        }
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        viewGroup.setOnClickListener(new c(iVar));
        iVar.show();
    }
}
