package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameAwardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116196e;

    private u50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f116192a = constraintLayout;
        this.f116193b = imageView;
        this.f116194c = imageView2;
        this.f116195d = textView;
        this.f116196e = textView2;
    }

    @androidx.annotation.n0
    public static u50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20672, new Class[]{View.class}, u50.class);
        if (patchProxyResultProxy.isSupported) {
            return (u50) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_left_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_left_icon);
        if (imageView != null) {
            i10 = R.id.iv_right_icon;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_right_icon);
            if (imageView2 != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView2 != null) {
                        return new u50((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20670, new Class[]{LayoutInflater.class}, u50.class);
        return patchProxyResultProxy.isSupported ? (u50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20671, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u50.class);
        if (patchProxyResultProxy.isSupported) {
            return (u50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_award, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116192a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20673, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
