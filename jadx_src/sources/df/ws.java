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

/* JADX INFO: compiled from: ItemPlayerLeaderboardsDestiny2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ws implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f117247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117249h;

    private ws(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f117242a = linearLayout;
        this.f117243b = imageView;
        this.f117244c = imageView2;
        this.f117245d = imageView3;
        this.f117246e = textView;
        this.f117247f = gradientTextView;
        this.f117248g = textView2;
        this.f117249h = textView3;
    }

    @androidx.annotation.n0
    public static ws a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19340, new Class[]{View.class}, ws.class);
        if (patchProxyResultProxy.isSupported) {
            return (ws) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView2 != null) {
                i10 = R.id.iv_rating_img;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rating_img);
                if (imageView3 != null) {
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
                                    return new ws((LinearLayout) view, imageView, imageView2, imageView3, textView, gradientTextView, textView2, textView3);
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
    public static ws c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19338, new Class[]{LayoutInflater.class}, ws.class);
        return patchProxyResultProxy.isSupported ? (ws) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ws d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19339, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ws.class);
        if (patchProxyResultProxy.isSupported) {
            return (ws) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_leaderboards_destiny2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117242a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19341, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
