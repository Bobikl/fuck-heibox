package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.github.mikephil.charting.charts.LineChart;
import com.max.hbcommon.component.chart.HeyBoxRadarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGDetailFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGDetailFragment f88063b;

    @i1
    public PUBGDetailFragment_ViewBinding(PUBGDetailFragment pUBGDetailFragment, View view) {
        this.f88063b = pUBGDetailFragment;
        pUBGDetailFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        pUBGDetailFragment.tv_mode = (TextView) butterknife.internal.f.f(view, R.id.tv_mode, "field 'tv_mode'", TextView.class);
        pUBGDetailFragment.tv_match_count = (TextView) butterknife.internal.f.f(view, R.id.tv_match_count, "field 'tv_match_count'", TextView.class);
        pUBGDetailFragment.iv_mode = (ImageView) butterknife.internal.f.f(view, R.id.iv_mode, "field 'iv_mode'", ImageView.class);
        pUBGDetailFragment.iv_arrow = (ImageView) butterknife.internal.f.f(view, R.id.iv_arrow, "field 'iv_arrow'", ImageView.class);
        pUBGDetailFragment.ll_mode = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_mode, "field 'll_mode'", LinearLayout.class);
        pUBGDetailFragment.iv_rating_img = (ImageView) butterknife.internal.f.f(view, R.id.iv_rating_img, "field 'iv_rating_img'", ImageView.class);
        pUBGDetailFragment.mLineChartCardView = (CardView) butterknife.internal.f.f(view, R.id.cv_line_chart, "field 'mLineChartCardView'", CardView.class);
        pUBGDetailFragment.mRatingTrendTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_rating_trend, "field 'mRatingTrendTextView'", TextView.class);
        pUBGDetailFragment.mRadarTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_radar, "field 'mRadarTextView'", TextView.class);
        pUBGDetailFragment.mRadarChart = (HeyBoxRadarChart) butterknife.internal.f.f(view, R.id.radar, "field 'mRadarChart'", HeyBoxRadarChart.class);
        pUBGDetailFragment.mLineChart = (LineChart) butterknife.internal.f.f(view, R.id.line, "field 'mLineChart'", LineChart.class);
        pUBGDetailFragment.rv_matches = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_matches, "field 'rv_matches'", RecyclerView.class);
        pUBGDetailFragment.rv_stats = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_stats, "field 'rv_stats'", RecyclerView.class);
        pUBGDetailFragment.rv_overview = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_overview, "field 'rv_overview'", RecyclerView.class);
        pUBGDetailFragment.cv_matches = (CardView) butterknife.internal.f.f(view, R.id.cv_matches, "field 'cv_matches'", CardView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38238, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGDetailFragment pUBGDetailFragment = this.f88063b;
        if (pUBGDetailFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88063b = null;
        pUBGDetailFragment.mRefreshLayout = null;
        pUBGDetailFragment.tv_mode = null;
        pUBGDetailFragment.tv_match_count = null;
        pUBGDetailFragment.iv_mode = null;
        pUBGDetailFragment.iv_arrow = null;
        pUBGDetailFragment.ll_mode = null;
        pUBGDetailFragment.iv_rating_img = null;
        pUBGDetailFragment.mLineChartCardView = null;
        pUBGDetailFragment.mRatingTrendTextView = null;
        pUBGDetailFragment.mRadarTextView = null;
        pUBGDetailFragment.mRadarChart = null;
        pUBGDetailFragment.mLineChart = null;
        pUBGDetailFragment.rv_matches = null;
        pUBGDetailFragment.rv_stats = null;
        pUBGDetailFragment.rv_overview = null;
        pUBGDetailFragment.cv_matches = null;
    }
}
