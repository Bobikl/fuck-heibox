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

/* JADX INFO: compiled from: ItemWeaponsCsgob5Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f115386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115388i;

    private s10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f115380a = relativeLayout;
        this.f115381b = imageView;
        this.f115382c = relativeLayout2;
        this.f115383d = textView;
        this.f115384e = textView2;
        this.f115385f = oVar;
        this.f115386g = progressBar;
        this.f115387h = textView3;
        this.f115388i = textView4;
    }

    @androidx.annotation.n0
    public static s10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20252, new Class[]{View.class}, s10.class);
        if (patchProxyResultProxy.isSupported) {
            return (s10) patchProxyResultProxy.result;
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
                                        return new s10((RelativeLayout) view, imageView, relativeLayout, textView, textView2, oVarA, progressBar, textView3, textView4);
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
    public static s10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20250, new Class[]{LayoutInflater.class}, s10.class);
        return patchProxyResultProxy.isSupported ? (s10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20251, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s10.class);
        if (patchProxyResultProxy.isSupported) {
            return (s10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_weapons_csgob5, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115380a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20253, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
