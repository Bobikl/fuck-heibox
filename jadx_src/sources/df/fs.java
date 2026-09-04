package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOrderListSingleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fs implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final zp f110675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110676f;

    private fs(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 zp zpVar, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110671a = linearLayout;
        this.f110672b = imageView;
        this.f110673c = linearLayout2;
        this.f110674d = textView;
        this.f110675e = zpVar;
        this.f110676f = linearLayout3;
    }

    @androidx.annotation.n0
    public static fs a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19272, new Class[]{View.class}, fs.class);
        if (patchProxyResultProxy.isSupported) {
            return (fs) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_state_desc_faq;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_state_desc_faq);
        if (imageView != null) {
            i10 = R.id.ll_btn;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_btn);
            if (linearLayout != null) {
                i10 = R.id.tv_state_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_state_desc);
                if (textView != null) {
                    i10 = R.id.vg_product;
                    View viewA = l3.d.a(view, R.id.vg_product);
                    if (viewA != null) {
                        zp zpVarA = zp.a(viewA);
                        i10 = R.id.vg_state_desc;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_state_desc);
                        if (linearLayout2 != null) {
                            return new fs((LinearLayout) view, imageView, linearLayout, textView, zpVarA, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fs c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19270, new Class[]{LayoutInflater.class}, fs.class);
        return patchProxyResultProxy.isSupported ? (fs) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fs d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19271, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fs.class);
        if (patchProxyResultProxy.isSupported) {
            return (fs) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_order_list_single, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110671a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19273, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
