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

/* JADX INFO: compiled from: ItemSignInV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class py implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114631f;

    private py(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114626a = relativeLayout;
        this.f114627b = imageView;
        this.f114628c = textView;
        this.f114629d = textView2;
        this.f114630e = view;
        this.f114631f = relativeLayout2;
    }

    @androidx.annotation.n0
    public static py a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19928, new Class[]{View.class}, py.class);
        if (patchProxyResultProxy.isSupported) {
            return (py) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_item_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_item_desc);
            if (textView != null) {
                i10 = R.id.tv_item_title;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_title);
                if (textView2 != null) {
                    i10 = R.id.v_mask;
                    View viewA = l3.d.a(view, R.id.v_mask);
                    if (viewA != null) {
                        i10 = R.id.vg_bg;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bg);
                        if (relativeLayout != null) {
                            return new py((RelativeLayout) view, imageView, textView, textView2, viewA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static py c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19926, new Class[]{LayoutInflater.class}, py.class);
        return patchProxyResultProxy.isSupported ? (py) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static py d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19927, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, py.class);
        if (patchProxyResultProxy.isSupported) {
            return (py) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sign_in_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114626a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19929, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
