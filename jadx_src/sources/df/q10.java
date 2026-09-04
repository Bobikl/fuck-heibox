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

/* JADX INFO: compiled from: ItemWeaponsCsgo5eBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f114657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f114658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114660i;

    private q10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114652a = relativeLayout;
        this.f114653b = imageView;
        this.f114654c = relativeLayout2;
        this.f114655d = textView;
        this.f114656e = textView2;
        this.f114657f = oVar;
        this.f114658g = progressBar;
        this.f114659h = textView3;
        this.f114660i = textView4;
    }

    @androidx.annotation.n0
    public static q10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20244, new Class[]{View.class}, q10.class);
        if (patchProxyResultProxy.isSupported) {
            return (q10) patchProxyResultProxy.result;
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
                                        return new q10((RelativeLayout) view, imageView, relativeLayout, textView, textView2, oVarA, progressBar, textView3, textView4);
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
    public static q10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20242, new Class[]{LayoutInflater.class}, q10.class);
        return patchProxyResultProxy.isSupported ? (q10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20243, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q10.class);
        if (patchProxyResultProxy.isSupported) {
            return (q10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_weapons_csgo5e, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114652a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20245, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
