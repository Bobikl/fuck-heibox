package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.chart.RadarView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPubgRadarChartBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ah0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadarView f108569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108573f;

    private ah0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RadarView radarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f108568a = linearLayout;
        this.f108569b = radarView;
        this.f108570c = textView;
        this.f108571d = textView2;
        this.f108572e = textView3;
        this.f108573f = textView4;
    }

    @androidx.annotation.n0
    public static ah0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21826, new Class[]{View.class}, ah0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ah0) patchProxyResultProxy.result;
        }
        int i10 = R.id.radar;
        RadarView radarView = (RadarView) l3.d.a(view, R.id.radar);
        if (radarView != null) {
            i10 = R.id.tv_level;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_level);
            if (textView != null) {
                i10 = R.id.tv_level_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_level_desc);
                if (textView2 != null) {
                    i10 = R.id.tv_score;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_score);
                    if (textView3 != null) {
                        i10 = R.id.tv_score_desc;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_score_desc);
                        if (textView4 != null) {
                            return new ah0((LinearLayout) view, radarView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ah0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21824, new Class[]{LayoutInflater.class}, ah0.class);
        return patchProxyResultProxy.isSupported ? (ah0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ah0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21825, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ah0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ah0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_pubg_radar_chart, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108568a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21827, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
