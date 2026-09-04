package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2HeroTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ze0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118356f;

    private ze0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f118351a = relativeLayout;
        this.f118352b = textView;
        this.f118353c = textView2;
        this.f118354d = textView3;
        this.f118355e = textView4;
        this.f118356f = textView5;
    }

    @androidx.annotation.n0
    public static ze0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21618, new Class[]{View.class}, ze0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_hreo;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_hreo);
        if (textView != null) {
            i10 = R.id.tv_kda;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_kda);
            if (textView2 != null) {
                i10 = R.id.tv_match_num;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_match_num);
                if (textView3 != null) {
                    i10 = R.id.tv_mmr;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_mmr);
                    if (textView4 != null) {
                        i10 = R.id.tv_win_rate;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                        if (textView5 != null) {
                            return new ze0((RelativeLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ze0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21616, new Class[]{LayoutInflater.class}, ze0.class);
        return patchProxyResultProxy.isSupported ? (ze0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ze0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21617, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ze0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ze0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_hero_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118351a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21619, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
