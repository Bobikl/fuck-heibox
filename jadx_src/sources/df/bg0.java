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

/* JADX INFO: compiled from: ViewGameScroeWithNumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108961f;

    private bg0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f108956a = linearLayout;
        this.f108957b = imageView;
        this.f108958c = textView;
        this.f108959d = textView2;
        this.f108960e = linearLayout2;
        this.f108961f = linearLayout3;
    }

    @androidx.annotation.n0
    public static bg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21728, new Class[]{View.class}, bg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_score;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_score);
        if (imageView != null) {
            i10 = R.id.tv_score;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_score);
            if (textView != null) {
                i10 = R.id.tv_score_detail;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_score_detail);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i10 = R.id.vg_score_content;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_score_content);
                    if (linearLayout2 != null) {
                        return new bg0(linearLayout, imageView, textView, textView2, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21726, new Class[]{LayoutInflater.class}, bg0.class);
        return patchProxyResultProxy.isSupported ? (bg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21727, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_scroe_with_num, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108956a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21729, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
