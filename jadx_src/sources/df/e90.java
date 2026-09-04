package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.PlatformDataView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPsnGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f110091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f110097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f110098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f110099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final PlatformDataView f110100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f110102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110103n;

    private e90(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 PlatformDataView platformDataView, @androidx.annotation.n0 PlatformDataView platformDataView2, @androidx.annotation.n0 PlatformDataView platformDataView3, @androidx.annotation.n0 PlatformDataView platformDataView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f110090a = relativeLayout;
        this.f110091b = qMUIRadiusImageView;
        this.f110092c = imageView;
        this.f110093d = imageView2;
        this.f110094e = imageView3;
        this.f110095f = linearLayout;
        this.f110096g = linearLayout2;
        this.f110097h = platformDataView;
        this.f110098i = platformDataView2;
        this.f110099j = platformDataView3;
        this.f110100k = platformDataView4;
        this.f110101l = textView;
        this.f110102m = cardView;
        this.f110103n = linearLayout3;
    }

    @androidx.annotation.n0
    public static e90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21022, new Class[]{View.class}, e90.class);
        if (patchProxyResultProxy.isSupported) {
            return (e90) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_game_data_card_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_data_card_bg);
            if (imageView != null) {
                i10 = R.id.iv_mask;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
                if (imageView2 != null) {
                    i10 = R.id.iv_tips;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_tips);
                    if (imageView3 != null) {
                        i10 = R.id.ll_card_desc;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_card_desc);
                        if (linearLayout != null) {
                            i10 = R.id.ll_tips;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_tips);
                            if (linearLayout2 != null) {
                                i10 = R.id.pdv0;
                                PlatformDataView platformDataView = (PlatformDataView) l3.d.a(view, R.id.pdv0);
                                if (platformDataView != null) {
                                    i10 = R.id.pdv1;
                                    PlatformDataView platformDataView2 = (PlatformDataView) l3.d.a(view, R.id.pdv1);
                                    if (platformDataView2 != null) {
                                        i10 = R.id.pdv2;
                                        PlatformDataView platformDataView3 = (PlatformDataView) l3.d.a(view, R.id.pdv2);
                                        if (platformDataView3 != null) {
                                            i10 = R.id.pdv3;
                                            PlatformDataView platformDataView4 = (PlatformDataView) l3.d.a(view, R.id.pdv3);
                                            if (platformDataView4 != null) {
                                                i10 = R.id.tv_tips;
                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_tips);
                                                if (textView != null) {
                                                    i10 = R.id.vg_card;
                                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_card);
                                                    if (cardView != null) {
                                                        i10 = R.id.vg_game_data_card_data;
                                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_game_data_card_data);
                                                        if (linearLayout3 != null) {
                                                            return new e90((RelativeLayout) view, qMUIRadiusImageView, imageView, imageView2, imageView3, linearLayout, linearLayout2, platformDataView, platformDataView2, platformDataView3, platformDataView4, textView, cardView, linearLayout3);
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
    public static e90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21020, new Class[]{LayoutInflater.class}, e90.class);
        return patchProxyResultProxy.isSupported ? (e90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21021, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e90.class);
        if (patchProxyResultProxy.isSupported) {
            return (e90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_psn_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110090a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21023, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
