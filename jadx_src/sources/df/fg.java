package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.mediaselector.lib.widget.SquareRelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptPostImageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SquareRelativeLayout f110567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110572f;

    private fg(@androidx.annotation.n0 SquareRelativeLayout squareRelativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view) {
        this.f110567a = squareRelativeLayout;
        this.f110568b = imageView;
        this.f110569c = imageView2;
        this.f110570d = textView;
        this.f110571e = textView2;
        this.f110572f = view;
    }

    @androidx.annotation.n0
    public static fg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18027, new Class[]{View.class}, fg.class);
        if (patchProxyResultProxy.isSupported) {
            return (fg) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_add;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.tv_duration;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_duration);
                if (textView != null) {
                    i10 = R.id.tv_preview;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_preview);
                    if (textView2 != null) {
                        i10 = R.id.v_img_stroke;
                        View viewA = l3.d.a(view, R.id.v_img_stroke);
                        if (viewA != null) {
                            return new fg((SquareRelativeLayout) view, imageView, imageView2, textView, textView2, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18025, new Class[]{LayoutInflater.class}, fg.class);
        return patchProxyResultProxy.isSupported ? (fg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18026, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fg.class);
        if (patchProxyResultProxy.isSupported) {
            return (fg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_post_image, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SquareRelativeLayout b() {
        return this.f110567a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18028, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
