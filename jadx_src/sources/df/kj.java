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

/* JADX INFO: compiled from: ItemFloatingDanmakuBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112649e;

    private kj(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112645a = linearLayout;
        this.f112646b = imageView;
        this.f112647c = textView;
        this.f112648d = textView2;
        this.f112649e = linearLayout2;
    }

    @androidx.annotation.n0
    public static kj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18359, new Class[]{View.class}, kj.class);
        if (patchProxyResultProxy.isSupported) {
            return (kj) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_action);
        if (imageView != null) {
            i10 = R.id.tv_action;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
            if (textView != null) {
                i10 = R.id.tv_danmaku;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_danmaku);
                if (textView2 != null) {
                    i10 = R.id.vg_action;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_action);
                    if (linearLayout != null) {
                        return new kj((LinearLayout) view, imageView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18357, new Class[]{LayoutInflater.class}, kj.class);
        return patchProxyResultProxy.isSupported ? (kj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18358, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kj.class);
        if (patchProxyResultProxy.isSupported) {
            return (kj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_floating_danmaku, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112645a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18360, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
