package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MarkerViewPubgTrendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115185h;

    private rc0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f115178a = linearLayout;
        this.f115179b = textView;
        this.f115180c = textView2;
        this.f115181d = textView3;
        this.f115182e = textView4;
        this.f115183f = linearLayout2;
        this.f115184g = linearLayout3;
        this.f115185h = linearLayout4;
    }

    @androidx.annotation.n0
    public static rc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21381, new Class[]{View.class}, rc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_duo;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_duo);
        if (textView != null) {
            i10 = R.id.tv_solo;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_solo);
            if (textView2 != null) {
                i10 = R.id.tv_squad;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_squad);
                if (textView3 != null) {
                    i10 = R.id.tv_time;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time);
                    if (textView4 != null) {
                        i10 = R.id.vg_duo;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_duo);
                        if (linearLayout != null) {
                            i10 = R.id.vg_solo;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_solo);
                            if (linearLayout2 != null) {
                                i10 = R.id.vg_squad;
                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_squad);
                                if (linearLayout3 != null) {
                                    return new rc0((LinearLayout) view, textView, textView2, textView3, textView4, linearLayout, linearLayout2, linearLayout3);
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
    public static rc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21379, new Class[]{LayoutInflater.class}, rc0.class);
        return patchProxyResultProxy.isSupported ? (rc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21380, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.marker_view_pubg_trend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115178a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21382, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
