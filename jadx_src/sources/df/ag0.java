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

/* JADX INFO: compiled from: ViewGamePriceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ag0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final o60 f108559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108560g;

    private ag0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 o60 o60Var, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108554a = relativeLayout;
        this.f108555b = linearLayout;
        this.f108556c = textView;
        this.f108557d = textView2;
        this.f108558e = textView3;
        this.f108559f = o60Var;
        this.f108560g = linearLayout2;
    }

    @androidx.annotation.n0
    public static ag0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21724, new Class[]{View.class}, ag0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ag0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_price;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_price);
        if (linearLayout != null) {
            i10 = R.id.tv_no_price;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_no_price);
            if (textView != null) {
                i10 = R.id.tv_release_date;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_release_date);
                if (textView2 != null) {
                    i10 = R.id.tv_release_date_desc;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_release_date_desc);
                    if (textView3 != null) {
                        i10 = R.id.vg_heybox_price;
                        View viewA = l3.d.a(view, R.id.vg_heybox_price);
                        if (viewA != null) {
                            o60 o60VarA = o60.a(viewA);
                            i10 = R.id.vg_release_date;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_release_date);
                            if (linearLayout2 != null) {
                                return new ag0((RelativeLayout) view, linearLayout, textView, textView2, textView3, o60VarA, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ag0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21722, new Class[]{LayoutInflater.class}, ag0.class);
        return patchProxyResultProxy.isSupported ? (ag0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ag0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21723, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ag0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ag0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_price, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108554a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21725, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
