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

/* JADX INFO: compiled from: ActivityGameStoreShoppingCartBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113198g;

    private m0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f113192a = relativeLayout;
        this.f113193b = relativeLayout2;
        this.f113194c = linearLayout;
        this.f113195d = textView;
        this.f113196e = textView2;
        this.f113197f = textView3;
        this.f113198g = relativeLayout3;
    }

    @androidx.annotation.n0
    public static m0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16392, new Class[]{View.class}, m0.class);
        if (patchProxyResultProxy.isSupported) {
            return (m0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_bar;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.bottom_bar);
        if (relativeLayout != null) {
            i10 = R.id.option_bar;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.option_bar);
            if (linearLayout != null) {
                i10 = R.id.tv_clear;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_clear);
                if (textView != null) {
                    i10 = R.id.tv_delete;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_delete);
                    if (textView2 != null) {
                        i10 = R.id.tv_purchase_bar;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_purchase_bar);
                        if (textView3 != null) {
                            i10 = R.id.vg_progress;
                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                            if (relativeLayout2 != null) {
                                return new m0((RelativeLayout) view, relativeLayout, linearLayout, textView, textView2, textView3, relativeLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16390, new Class[]{LayoutInflater.class}, m0.class);
        return patchProxyResultProxy.isSupported ? (m0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16391, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m0.class);
        if (patchProxyResultProxy.isSupported) {
            return (m0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_store_shopping_cart, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113192a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16393, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
