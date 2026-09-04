package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemWeaponsCsgoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f115041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115043i;

    private r10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f115035a = relativeLayout;
        this.f115036b = imageView;
        this.f115037c = relativeLayout2;
        this.f115038d = textView;
        this.f115039e = textView2;
        this.f115040f = oVar;
        this.f115041g = progressBar;
        this.f115042h = textView3;
        this.f115043i = textView4;
    }

    @androidx.annotation.n0
    public static r10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20248, new Class[]{View.class}, r10.class);
        if (patchProxyResultProxy.isSupported) {
            return (r10) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.cell0);
        if (imageView != null) {
            i10 = R.id.cell1;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell1);
            if (relativeLayout != null) {
                i10 = R.id.cell2;
                TextView textView = (TextView) l3.d.a(view, R.id.cell2);
                if (textView != null) {
                    i10 = R.id.cell3;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.cell3);
                    if (textView2 != null) {
                        i10 = R.id.divider;
                        View viewA = l3.d.a(view, R.id.divider);
                        if (viewA != null) {
                            mb.o oVarA = mb.o.a(viewA);
                            i10 = R.id.f76248pb;
                            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.f76248pb);
                            if (progressBar != null) {
                                i10 = R.id.tv_k_avg;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_k_avg);
                                if (textView3 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView4 != null) {
                                        return new r10((RelativeLayout) view, imageView, relativeLayout, textView, textView2, oVarA, progressBar, textView3, textView4);
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
    public static r10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20246, new Class[]{LayoutInflater.class}, r10.class);
        return patchProxyResultProxy.isSupported ? (r10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20247, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r10.class);
        if (patchProxyResultProxy.isSupported) {
            return (r10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_weapons_csgo, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115035a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20249, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
