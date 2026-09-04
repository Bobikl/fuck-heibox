package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTopSheetBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f131658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131660f;

    private n(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view) {
        this.f131655a = relativeLayout;
        this.f131656b = imageView;
        this.f131657c = textView;
        this.f131658d = frameLayout;
        this.f131659e = linearLayout;
        this.f131660f = view;
    }

    @androidx.annotation.n0
    public static n a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f32089x6, new Class[]{View.class}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.vg_center_view;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                if (frameLayout != null) {
                    i10 = R.id.vg_content;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout != null && (viewA = l3.d.a(view, (i10 = R.id.vg_mask))) != null) {
                        return new n((RelativeLayout) view, imageView, textView, frameLayout, linearLayout, viewA);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f32055v6, new Class[]{LayoutInflater.class}, n.class);
        return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32072w6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_top_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131655a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32106y6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
