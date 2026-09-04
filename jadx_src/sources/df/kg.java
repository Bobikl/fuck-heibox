package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptRvImageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112621h;

    private kg(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112614a = frameLayout;
        this.f112615b = imageView;
        this.f112616c = imageView2;
        this.f112617d = imageView3;
        this.f112618e = textView;
        this.f112619f = view;
        this.f112620g = linearLayout;
        this.f112621h = linearLayout2;
    }

    @androidx.annotation.n0
    public static kg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18047, new Class[]{View.class}, kg.class);
        if (patchProxyResultProxy.isSupported) {
            return (kg) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.iv_image;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_image);
            if (imageView2 != null) {
                i10 = R.id.iv_image_not_full;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_image_not_full);
                if (imageView3 != null) {
                    i10 = R.id.tv_tag;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_tag);
                    if (textView != null) {
                        i10 = R.id.v_arrow;
                        View viewA = l3.d.a(view, R.id.v_arrow);
                        if (viewA != null) {
                            i10 = R.id.vg_tag;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                            if (linearLayout != null) {
                                i10 = R.id.vg_tag_content;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tag_content);
                                if (linearLayout2 != null) {
                                    return new kg((FrameLayout) view, imageView, imageView2, imageView3, textView, viewA, linearLayout, linearLayout2);
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
    public static kg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18045, new Class[]{LayoutInflater.class}, kg.class);
        return patchProxyResultProxy.isSupported ? (kg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18046, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kg.class);
        if (patchProxyResultProxy.isSupported) {
            return (kg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_rv_image, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112614a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18048, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
