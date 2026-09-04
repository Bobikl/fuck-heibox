package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2FollowMatchBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ve0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroImageView f116841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final KDAView f116842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116843k;

    private ve0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 Dota2HeroImageView dota2HeroImageView, @androidx.annotation.n0 KDAView kDAView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116833a = relativeLayout;
        this.f116834b = imageView;
        this.f116835c = imageView2;
        this.f116836d = qMUIRadiusImageView;
        this.f116837e = textView;
        this.f116838f = textView2;
        this.f116839g = textView3;
        this.f116840h = textView4;
        this.f116841i = dota2HeroImageView;
        this.f116842j = kDAView;
        this.f116843k = linearLayout;
    }

    @androidx.annotation.n0
    public static ve0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21602, new Class[]{View.class}, ve0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ve0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_authentication;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_authentication);
            if (imageView2 != null) {
                i10 = R.id.iv_avatar;
                QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
                if (qMUIRadiusImageView != null) {
                    i10 = R.id.tv_dan_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_dan_name);
                    if (textView != null) {
                        i10 = R.id.tv_duration;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_duration);
                        if (textView2 != null) {
                            i10 = R.id.tv_name;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView3 != null) {
                                i10 = R.id.tv_result;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_result);
                                if (textView4 != null) {
                                    i10 = R.id.v_dota2_hero;
                                    Dota2HeroImageView dota2HeroImageView = (Dota2HeroImageView) l3.d.a(view, R.id.v_dota2_hero);
                                    if (dota2HeroImageView != null) {
                                        i10 = R.id.v_kda;
                                        KDAView kDAView = (KDAView) l3.d.a(view, R.id.v_kda);
                                        if (kDAView != null) {
                                            i10 = R.id.vg_kda;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kda);
                                            if (linearLayout != null) {
                                                return new ve0((RelativeLayout) view, imageView, imageView2, qMUIRadiusImageView, textView, textView2, textView3, textView4, dota2HeroImageView, kDAView, linearLayout);
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
    public static ve0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21600, new Class[]{LayoutInflater.class}, ve0.class);
        return patchProxyResultProxy.isSupported ? (ve0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ve0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21601, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ve0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ve0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_follow_match, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116833a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21603, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
