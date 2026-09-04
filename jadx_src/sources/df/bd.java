package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemApexLegendTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bd implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f108908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108915i;

    private bd(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6) {
        this.f108907a = constraintLayout;
        this.f108908b = guideline;
        this.f108909c = textView;
        this.f108910d = view;
        this.f108911e = textView2;
        this.f108912f = textView3;
        this.f108913g = textView4;
        this.f108914h = textView5;
        this.f108915i = textView6;
    }

    @androidx.annotation.n0
    public static bd a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17700, new Class[]{View.class}, bd.class);
        if (patchProxyResultProxy.isSupported) {
            return (bd) patchProxyResultProxy.result;
        }
        int i10 = R.id.guardline_1;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
        if (guideline != null) {
            i10 = R.id.tv_legend;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_legend);
            if (textView != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    i10 = R.id.vg_1;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.vg_1);
                    if (textView2 != null) {
                        i10 = R.id.vg_2;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.vg_2);
                        if (textView3 != null) {
                            i10 = R.id.vg_3;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.vg_3);
                            if (textView4 != null) {
                                i10 = R.id.vg_4;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.vg_4);
                                if (textView5 != null) {
                                    i10 = R.id.vg_name;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.vg_name);
                                    if (textView6 != null) {
                                        return new bd((ConstraintLayout) view, guideline, textView, viewA, textView2, textView3, textView4, textView5, textView6);
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
    public static bd c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17698, new Class[]{LayoutInflater.class}, bd.class);
        return patchProxyResultProxy.isSupported ? (bd) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bd d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17699, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bd.class);
        if (patchProxyResultProxy.isSupported) {
            return (bd) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_apex_legend_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108907a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17701, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
