package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.chart.CustomBarChart;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentGameDurationStatisticsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CustomBarChart f108359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108367j;

    private a5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CustomBarChart customBarChart, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108358a = constraintLayout;
        this.f108359b = customBarChart;
        this.f108360c = imageView;
        this.f108361d = linearLayout;
        this.f108362e = recyclerView;
        this.f108363f = recyclerView2;
        this.f108364g = textView;
        this.f108365h = textView2;
        this.f108366i = textView3;
        this.f108367j = linearLayout2;
    }

    @androidx.annotation.n0
    public static a5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16864, new Class[]{View.class}, a5.class);
        if (patchProxyResultProxy.isSupported) {
            return (a5) patchProxyResultProxy.result;
        }
        int i10 = R.id.bar_chart;
        CustomBarChart customBarChart = (CustomBarChart) l3.d.a(view, R.id.bar_chart);
        if (customBarChart != null) {
            i10 = R.id.iv_tips;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_tips);
            if (imageView != null) {
                i10 = R.id.ll_dialog;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_dialog);
                if (linearLayout != null) {
                    i10 = R.id.rv_duration;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_duration);
                    if (recyclerView != null) {
                        i10 = R.id.rv_duration_data;
                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_duration_data);
                        if (recyclerView2 != null) {
                            i10 = R.id.tv_duration_title;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_duration_title);
                            if (textView != null) {
                                i10 = R.id.tv_pass_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_pass_title);
                                if (textView2 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        i10 = R.id.vg_data_source;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_data_source);
                                        if (linearLayout2 != null) {
                                            return new a5((ConstraintLayout) view, customBarChart, imageView, linearLayout, recyclerView, recyclerView2, textView, textView2, textView3, linearLayout2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16862, new Class[]{LayoutInflater.class}, a5.class);
        return patchProxyResultProxy.isSupported ? (a5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16863, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a5.class);
        if (patchProxyResultProxy.isSupported) {
            return (a5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_game_duration_statistics, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108358a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16865, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
