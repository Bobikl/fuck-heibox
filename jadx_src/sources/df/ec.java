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

/* JADX INFO: compiled from: GameScoreBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ec implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110129e;

    private ec(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110125a = linearLayout;
        this.f110126b = imageView;
        this.f110127c = textView;
        this.f110128d = textView2;
        this.f110129e = linearLayout2;
    }

    @androidx.annotation.n0
    public static ec a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17608, new Class[]{View.class}, ec.class);
        if (patchProxyResultProxy.isSupported) {
            return (ec) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_score;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_score);
        if (imageView != null) {
            i10 = R.id.tv_extra;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_extra);
            if (textView != null) {
                i10 = R.id.tv_score;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_score);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new ec(linearLayout, imageView, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ec c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17606, new Class[]{LayoutInflater.class}, ec.class);
        return patchProxyResultProxy.isSupported ? (ec) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ec d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17607, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ec.class);
        if (patchProxyResultProxy.isSupported) {
            return (ec) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.game_score, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110125a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17609, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
