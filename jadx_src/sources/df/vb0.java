package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutTradeItemCheckBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116772h;

    private vb0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f116765a = relativeLayout;
        this.f116766b = imageView;
        this.f116767c = textView;
        this.f116768d = textView2;
        this.f116769e = textView3;
        this.f116770f = textView4;
        this.f116771g = textView5;
        this.f116772h = relativeLayout2;
    }

    @androidx.annotation.n0
    public static vb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21293, new Class[]{View.class}, vb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_all;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_all);
        if (imageView != null) {
            i10 = R.id.tv_btn_cancel;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_btn_cancel);
            if (textView != null) {
                i10 = R.id.tv_btn_confirm;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_btn_confirm);
                if (textView2 != null) {
                    i10 = R.id.tv_btn_put_off;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_btn_put_off);
                    if (textView3 != null) {
                        i10 = R.id.tv_count;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_count);
                        if (textView4 != null) {
                            i10 = R.id.tv_desc;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView5 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                return new vb0(relativeLayout, imageView, textView, textView2, textView3, textView4, textView5, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21291, new Class[]{LayoutInflater.class}, vb0.class);
        return patchProxyResultProxy.isSupported ? (vb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21292, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_trade_item_check_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116765a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21294, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
