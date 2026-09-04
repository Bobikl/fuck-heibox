package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.BlurView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewRecommendVerGameCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BoxAutoPlayView f114906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final BlurView f114914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final GamePriceView f114915k;

    private qh0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BoxAutoPlayView boxAutoPlayView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 BlurView blurView, @androidx.annotation.n0 GamePriceView gamePriceView) {
        this.f114905a = relativeLayout;
        this.f114906b = boxAutoPlayView;
        this.f114907c = imageView;
        this.f114908d = imageView2;
        this.f114909e = linearLayout;
        this.f114910f = textView;
        this.f114911g = textView2;
        this.f114912h = relativeLayout2;
        this.f114913i = relativeLayout3;
        this.f114914j = blurView;
        this.f114915k = gamePriceView;
    }

    @androidx.annotation.n0
    public static qh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21890, new Class[]{View.class}, qh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bv_deadline_date;
        BoxAutoPlayView boxAutoPlayView = (BoxAutoPlayView) l3.d.a(view, R.id.bv_deadline_date);
        if (boxAutoPlayView != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView != null) {
                i10 = R.id.iv_middle;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_middle);
                if (imageView2 != null) {
                    i10 = R.id.ll_platform_icon;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_platform_icon);
                    if (linearLayout != null) {
                        i10 = R.id.tv_deadline_date;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                        if (textView != null) {
                            i10 = R.id.tv_game_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name);
                            if (textView2 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i10 = R.id.vg_deadline_date;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_deadline_date);
                                if (relativeLayout2 != null) {
                                    i10 = R.id.view_blur;
                                    BlurView blurView = (BlurView) l3.d.a(view, R.id.view_blur);
                                    if (blurView != null) {
                                        i10 = R.id.view_price;
                                        GamePriceView gamePriceView = (GamePriceView) l3.d.a(view, R.id.view_price);
                                        if (gamePriceView != null) {
                                            return new qh0(relativeLayout, boxAutoPlayView, imageView, imageView2, linearLayout, textView, textView2, relativeLayout, relativeLayout2, blurView, gamePriceView);
                                        }
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
    public static qh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21888, new Class[]{LayoutInflater.class}, qh0.class);
        return patchProxyResultProxy.isSupported ? (qh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21889, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_recommend_ver_game_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114905a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21891, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
