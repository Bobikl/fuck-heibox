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

/* JADX INFO: compiled from: LayoutGameShotImageviewerCustomPageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115870e;

    private t60(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115866a = relativeLayout;
        this.f115867b = imageView;
        this.f115868c = textView;
        this.f115869d = textView2;
        this.f115870e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static t60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20772, new Class[]{View.class}, t60.class);
        if (patchProxyResultProxy.isSupported) {
            return (t60) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_logo);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_time;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
                if (textView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new t60(relativeLayout, imageView, textView, textView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20770, new Class[]{LayoutInflater.class}, t60.class);
        return patchProxyResultProxy.isSupported ? (t60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20771, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t60.class);
        if (patchProxyResultProxy.isSupported) {
            return (t60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_shot_imageviewer_custom_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115866a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20773, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
