package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2OverviewLayMarkerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ef0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110185g;

    private ef0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110179a = relativeLayout;
        this.f110180b = textView;
        this.f110181c = textView2;
        this.f110182d = textView3;
        this.f110183e = textView4;
        this.f110184f = view;
        this.f110185g = linearLayout;
    }

    @androidx.annotation.n0
    public static ef0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21638, new Class[]{View.class}, ef0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ef0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_delta;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_delta);
        if (textView != null) {
            i10 = R.id.tv_time;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
            if (textView2 != null) {
                i10 = R.id.tv_up_down;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_up_down);
                if (textView3 != null) {
                    i10 = R.id.tv_value;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_value);
                    if (textView4 != null) {
                        i10 = R.id.v_highlight;
                        View viewA = l3.d.a(view, R.id.v_highlight);
                        if (viewA != null) {
                            i10 = R.id.vg_content;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                            if (linearLayout != null) {
                                return new ef0((RelativeLayout) view, textView, textView2, textView3, textView4, viewA, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ef0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21636, new Class[]{LayoutInflater.class}, ef0.class);
        return patchProxyResultProxy.isSupported ? (ef0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ef0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21637, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ef0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ef0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_overview_lay_marker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110179a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21639, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
