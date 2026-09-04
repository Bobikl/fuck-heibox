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

/* JADX INFO: compiled from: ItemSearchToolBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109924e;

    private dy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f109920a = relativeLayout;
        this.f109921b = imageView;
        this.f109922c = textView;
        this.f109923d = textView2;
        this.f109924e = textView3;
    }

    @androidx.annotation.n0
    public static dy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19880, new Class[]{View.class}, dy.class);
        if (patchProxyResultProxy.isSupported) {
            return (dy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_enter_static;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_enter_static);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView3 != null) {
                        return new dy((RelativeLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static dy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19878, new Class[]{LayoutInflater.class}, dy.class);
        return patchProxyResultProxy.isSupported ? (dy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19879, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dy.class);
        if (patchProxyResultProxy.isSupported) {
            return (dy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_tool, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109920a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19881, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
