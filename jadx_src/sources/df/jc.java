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

/* JADX INFO: compiled from: HeaderGameMonthlyPlayerStatBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112126f;

    private jc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f112121a = linearLayout;
        this.f112122b = textView;
        this.f112123c = textView2;
        this.f112124d = textView3;
        this.f112125e = textView4;
        this.f112126f = textView5;
    }

    @androidx.annotation.n0
    public static jc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17628, new Class[]{View.class}, jc.class);
        if (patchProxyResultProxy.isSupported) {
            return (jc) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_delta;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_delta);
        if (textView != null) {
            i10 = R.id.tv_delta_percent;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_delta_percent);
            if (textView2 != null) {
                i10 = R.id.tv_month;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_month);
                if (textView3 != null) {
                    i10 = R.id.tv_peak;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_peak);
                    if (textView4 != null) {
                        i10 = R.id.tv_player;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_player);
                        if (textView5 != null) {
                            return new jc((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17626, new Class[]{LayoutInflater.class}, jc.class);
        return patchProxyResultProxy.isSupported ? (jc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17627, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jc.class);
        if (patchProxyResultProxy.isSupported) {
            return (jc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.header_game_monthly_player_stat, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112121a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17629, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
