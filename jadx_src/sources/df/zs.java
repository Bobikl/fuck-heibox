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

/* JADX INFO: compiled from: ItemPlayerLeaderboardsNormalHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zs implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f118455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118458i;

    private zs(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f118450a = linearLayout;
        this.f118451b = imageView;
        this.f118452c = imageView2;
        this.f118453d = view;
        this.f118454e = textView;
        this.f118455f = gradientTextView;
        this.f118456g = textView2;
        this.f118457h = textView3;
        this.f118458i = textView4;
    }

    @androidx.annotation.n0
    public static zs a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19352, new Class[]{View.class}, zs.class);
        if (patchProxyResultProxy.isSupported) {
            return (zs) patchProxyResultProxy.result;
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
                    i10 = R.id.tv_nickname;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_nickname);
                    if (textView != null) {
                        i10 = R.id.tv_rank;
                        GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                        if (gradientTextView != null) {
                            i10 = R.id.tv_value0;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_value0);
                            if (textView2 != null) {
                                i10 = R.id.tv_value1;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_value1);
                                if (textView3 != null) {
                                    i10 = R.id.tv_value2;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_value2);
                                    if (textView4 != null) {
                                        return new zs((LinearLayout) view, imageView, imageView2, viewA, textView, gradientTextView, textView2, textView3, textView4);
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
    public static zs c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19350, new Class[]{LayoutInflater.class}, zs.class);
        return patchProxyResultProxy.isSupported ? (zs) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zs d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19351, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zs.class);
        if (patchProxyResultProxy.isSupported) {
            return (zs) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_leaderboards_normal_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118450a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19353, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
