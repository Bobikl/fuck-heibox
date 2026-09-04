package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlayerLeaderboardsNormalBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ys implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f118044i;

    private ys(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView) {
        this.f118036a = linearLayout;
        this.f118037b = imageView;
        this.f118038c = imageView2;
        this.f118039d = view;
        this.f118040e = linearLayout2;
        this.f118041f = linearLayout3;
        this.f118042g = linearLayout4;
        this.f118043h = textView;
        this.f118044i = gradientTextView;
    }

    @androidx.annotation.n0
    public static ys a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19348, new Class[]{View.class}, ys.class);
        if (patchProxyResultProxy.isSupported) {
            return (ys) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView2 != null) {
                i10 = R.id.left_space;
                View viewA = l3.d.a(view, R.id.left_space);
                if (viewA != null) {
                    i10 = R.id.ll_value0;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_value0);
                    if (linearLayout != null) {
                        i10 = R.id.ll_value1;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_value1);
                        if (linearLayout2 != null) {
                            i10 = R.id.ll_value2;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_value2);
                            if (linearLayout3 != null) {
                                i10 = R.id.tv_nickname;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_nickname);
                                if (textView != null) {
                                    i10 = R.id.tv_rank;
                                    GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                                    if (gradientTextView != null) {
                                        return new ys((LinearLayout) view, imageView, imageView2, viewA, linearLayout, linearLayout2, linearLayout3, textView, gradientTextView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ys c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19346, new Class[]{LayoutInflater.class}, ys.class);
        return patchProxyResultProxy.isSupported ? (ys) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ys d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19347, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ys.class);
        if (patchProxyResultProxy.isSupported) {
            return (ys) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_leaderboards_normal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118036a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19349, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
