package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemWaterfallHashtagDetalLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f114388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f114389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114398o;

    private p10(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 Space space, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f114384a = cardView;
        this.f114385b = imageView;
        this.f114386c = imageView2;
        this.f114387d = qMUIRadiusImageView;
        this.f114388e = shineButton;
        this.f114389f = space;
        this.f114390g = expressionTextView;
        this.f114391h = textView;
        this.f114392i = textView2;
        this.f114393j = expressionTextView2;
        this.f114394k = textView3;
        this.f114395l = frameLayout;
        this.f114396m = linearLayout;
        this.f114397n = frameLayout2;
        this.f114398o = linearLayout2;
    }

    @androidx.annotation.n0
    public static p10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20240, new Class[]{View.class}, p10.class);
        if (patchProxyResultProxy.isSupported) {
            return (p10) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_cover_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_cover_img);
            if (imageView2 != null) {
                i10 = R.id.iv_your_follow;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_your_follow);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.sb_interactive_like;
                    ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.sb_interactive_like);
                    if (shineButton != null) {
                        i10 = R.id.space_below_cover_img;
                        Space space = (Space) l3.d.a(view, R.id.space_below_cover_img);
                        if (space != null) {
                            i10 = R.id.tv_desc;
                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                            if (expressionTextView != null) {
                                i10 = R.id.tv_like;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_like);
                                if (textView != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_title;
                                        ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                        if (expressionTextView2 != null) {
                                            i10 = R.id.tv_your_follow;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_your_follow);
                                            if (textView3 != null) {
                                                i10 = R.id.vg_cover_img;
                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_cover_img);
                                                if (frameLayout != null) {
                                                    i10 = R.id.vg_like;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_like);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_video_play_icon;
                                                        FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_video_play_icon);
                                                        if (frameLayout2 != null) {
                                                            i10 = R.id.vg_your_follow;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_your_follow);
                                                            if (linearLayout2 != null) {
                                                                return new p10((CardView) view, imageView, imageView2, qMUIRadiusImageView, shineButton, space, expressionTextView, textView, textView2, expressionTextView2, textView3, frameLayout, linearLayout, frameLayout2, linearLayout2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static p10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20238, new Class[]{LayoutInflater.class}, p10.class);
        return patchProxyResultProxy.isSupported ? (p10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20239, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p10.class);
        if (patchProxyResultProxy.isSupported) {
            return (p10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_waterfall_hashtag_detal_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114384a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20241, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
