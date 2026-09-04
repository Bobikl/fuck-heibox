package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.roundedview.HBRoundedCornerImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.InnerGameItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameVideoCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final InnerGameItemView f109789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBRoundedCornerImageView f109790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109795i;

    private dg0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 InnerGameItemView innerGameItemView, @androidx.annotation.n0 HBRoundedCornerImageView hBRoundedCornerImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f109787a = relativeLayout;
        this.f109788b = cardView;
        this.f109789c = innerGameItemView;
        this.f109790d = hBRoundedCornerImageView;
        this.f109791e = imageView;
        this.f109792f = imageView2;
        this.f109793g = textView;
        this.f109794h = relativeLayout2;
        this.f109795i = relativeLayout3;
    }

    @androidx.annotation.n0
    public static dg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21736, new Class[]{View.class}, dg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_video_container;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_video_container);
        if (cardView != null) {
            i10 = R.id.game_item;
            InnerGameItemView innerGameItemView = (InnerGameItemView) l3.d.a(view, R.id.game_item);
            if (innerGameItemView != null) {
                i10 = R.id.iv_bg;
                HBRoundedCornerImageView hBRoundedCornerImageView = (HBRoundedCornerImageView) l3.d.a(view, R.id.iv_bg);
                if (hBRoundedCornerImageView != null) {
                    i10 = R.id.iv_gradient;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient);
                    if (imageView != null) {
                        i10 = R.id.iv_video_play;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_video_play);
                        if (imageView2 != null) {
                            i10 = R.id.tv_left_top_label;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_left_top_label);
                            if (textView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i10 = R.id.vg_video_thump;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_video_thump);
                                if (relativeLayout2 != null) {
                                    return new dg0(relativeLayout, cardView, innerGameItemView, hBRoundedCornerImageView, imageView, imageView2, textView, relativeLayout, relativeLayout2);
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
    public static dg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21734, new Class[]{LayoutInflater.class}, dg0.class);
        return patchProxyResultProxy.isSupported ? (dg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static dg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21735, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, dg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (dg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_video_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109787a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21737, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
