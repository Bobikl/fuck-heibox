package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameCardContainerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class of0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114229m;

    private of0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f114217a = relativeLayout;
        this.f114218b = cardView;
        this.f114219c = qMUIRadiusImageView;
        this.f114220d = imageView;
        this.f114221e = imageView2;
        this.f114222f = textView;
        this.f114223g = view;
        this.f114224h = view2;
        this.f114225i = frameLayout;
        this.f114226j = relativeLayout2;
        this.f114227k = relativeLayout3;
        this.f114228l = linearLayout;
        this.f114229m = relativeLayout4;
    }

    @androidx.annotation.n0
    public static of0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21678, new Class[]{View.class}, of0.class);
        if (patchProxyResultProxy.isSupported) {
            return (of0) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_video_container;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_video_container);
        if (cardView != null) {
            i10 = R.id.iv_bg;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_bg);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_label;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_label);
                if (imageView != null) {
                    i10 = R.id.iv_video_play;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_video_play);
                    if (imageView2 != null) {
                        i10 = R.id.tv_left_top_label;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_left_top_label);
                        if (textView != null) {
                            i10 = R.id.v_gradient;
                            View viewA = l3.d.a(view, R.id.v_gradient);
                            if (viewA != null) {
                                i10 = R.id.v_pure_color;
                                View viewA2 = l3.d.a(view, R.id.v_pure_color);
                                if (viewA2 != null) {
                                    i10 = R.id.vg_bottom_container;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bottom_container);
                                    if (frameLayout != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i10 = R.id.vg_content;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                                        if (relativeLayout2 != null) {
                                            i10 = R.id.vg_label;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_label);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_video_thump;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_video_thump);
                                                if (relativeLayout3 != null) {
                                                    return new of0(relativeLayout, cardView, qMUIRadiusImageView, imageView, imageView2, textView, viewA, viewA2, frameLayout, relativeLayout, relativeLayout2, linearLayout, relativeLayout3);
                                                }
                                            }
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
    public static of0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21676, new Class[]{LayoutInflater.class}, of0.class);
        return patchProxyResultProxy.isSupported ? (of0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static of0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21677, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, of0.class);
        if (patchProxyResultProxy.isSupported) {
            return (of0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_card_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114217a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21679, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
