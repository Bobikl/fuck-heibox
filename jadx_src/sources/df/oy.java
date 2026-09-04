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

/* JADX INFO: compiled from: ItemShoppingCartBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f114322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114330j;

    private oy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114321a = relativeLayout;
        this.f114322b = oVar;
        this.f114323c = imageView;
        this.f114324d = imageView2;
        this.f114325e = imageView3;
        this.f114326f = textView;
        this.f114327g = textView2;
        this.f114328h = textView3;
        this.f114329i = textView4;
        this.f114330j = relativeLayout2;
    }

    @androidx.annotation.n0
    public static oy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19924, new Class[]{View.class}, oy.class);
        if (patchProxyResultProxy.isSupported) {
            return (oy) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_check_state;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_check_state);
            if (imageView != null) {
                i10 = R.id.iv_desc_more;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_desc_more);
                if (imageView2 != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView3 != null) {
                        i10 = R.id.tv_desc_0;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc_0);
                        if (textView != null) {
                            i10 = R.id.tv_desc_1;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc_1);
                            if (textView2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView3 != null) {
                                    i10 = R.id.tv_option;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_option);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_desc;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_desc);
                                        if (relativeLayout != null) {
                                            return new oy((RelativeLayout) view, oVarA, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, relativeLayout);
                                        }
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
    public static oy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19922, new Class[]{LayoutInflater.class}, oy.class);
        return patchProxyResultProxy.isSupported ? (oy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19923, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oy.class);
        if (patchProxyResultProxy.isSupported) {
            return (oy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_shopping_cart, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114321a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19925, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
