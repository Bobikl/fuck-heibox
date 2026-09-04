package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.ProgressBgView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCoffeeProgressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBgView f110965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110969f;

    private gf(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBgView progressBgView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f110964a = linearLayout;
        this.f110965b = progressBgView;
        this.f110966c = textView;
        this.f110967d = textView2;
        this.f110968e = textView3;
        this.f110969f = relativeLayout;
    }

    @androidx.annotation.n0
    public static gf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17928, new Class[]{View.class}, gf.class);
        if (patchProxyResultProxy.isSupported) {
            return (gf) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_0;
        ProgressBgView progressBgView = (ProgressBgView) l3.d.a(view, R.id.pb_0);
        if (progressBgView != null) {
            i10 = R.id.tv_progress_0;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_progress_0);
            if (textView != null) {
                i10 = R.id.tv_progress_checked_0;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_progress_checked_0);
                if (textView2 != null) {
                    i10 = R.id.tv_progress_desc_0;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress_desc_0);
                    if (textView3 != null) {
                        i10 = R.id.vg_progress_desc_0;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_0);
                        if (relativeLayout != null) {
                            return new gf((LinearLayout) view, progressBgView, textView, textView2, textView3, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17926, new Class[]{LayoutInflater.class}, gf.class);
        return patchProxyResultProxy.isSupported ? (gf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17927, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gf.class);
        if (patchProxyResultProxy.isSupported) {
            return (gf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_coffee_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110964a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17929, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
