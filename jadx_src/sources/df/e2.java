package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivitySteamPrivacyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ScrollView f109980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109985f;

    private e2(@androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f109980a = scrollView;
        this.f109981b = imageView;
        this.f109982c = textView;
        this.f109983d = textView2;
        this.f109984e = textView3;
        this.f109985f = relativeLayout;
    }

    @androidx.annotation.n0
    public static e2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16568, new Class[]{View.class}, e2.class);
        if (patchProxyResultProxy.isSupported) {
            return (e2) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_inventory_state;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_inventory_state);
            if (textView != null) {
                i10 = R.id.tv_personal_state;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_personal_state);
                if (textView2 != null) {
                    i10 = R.id.tv_refresh;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_refresh);
                    if (textView3 != null) {
                        i10 = R.id.vg_open_oversea;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_open_oversea);
                        if (relativeLayout != null) {
                            return new e2((ScrollView) view, imageView, textView, textView2, textView3, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16566, new Class[]{LayoutInflater.class}, e2.class);
        return patchProxyResultProxy.isSupported ? (e2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16567, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e2.class);
        if (patchProxyResultProxy.isSupported) {
            return (e2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_steam_privacy, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ScrollView b() {
        return this.f109980a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16569, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
