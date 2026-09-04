package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRecommendGameImgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113853h;

    private nh0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f113846a = relativeLayout;
        this.f113847b = cardView;
        this.f113848c = cardView2;
        this.f113849d = imageView;
        this.f113850e = linearLayout;
        this.f113851f = linearLayout2;
        this.f113852g = relativeLayout2;
        this.f113853h = linearLayout3;
    }

    @androidx.annotation.n0
    public static nh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21878, new Class[]{View.class}, nh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_htag;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_htag);
        if (cardView != null) {
            i10 = R.id.cv_img;
            CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_img);
            if (cardView2 != null) {
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.ll_htag;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_htag);
                    if (linearLayout != null) {
                        i10 = R.id.ll_platform_icon;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                        if (linearLayout2 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i10 = R.id.vg_is_owned;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                            if (linearLayout3 != null) {
                                return new nh0(relativeLayout, cardView, cardView2, imageView, linearLayout, linearLayout2, relativeLayout, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static nh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21876, new Class[]{LayoutInflater.class}, nh0.class);
        return patchProxyResultProxy.isSupported ? (nh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21877, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_recommend_game_img, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113846a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21879, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
