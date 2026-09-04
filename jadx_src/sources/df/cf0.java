package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2DanView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2MatchHeroDataItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2DanView f109375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroImageView f109376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final KDAView f109377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109379o;

    private cf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 Dota2DanView dota2DanView, @androidx.annotation.n0 Dota2HeroImageView dota2HeroImageView, @androidx.annotation.n0 KDAView kDAView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f109365a = relativeLayout;
        this.f109366b = imageView;
        this.f109367c = qMUIRadiusImageView;
        this.f109368d = imageView2;
        this.f109369e = qMUIRadiusImageView2;
        this.f109370f = recyclerView;
        this.f109371g = textView;
        this.f109372h = textView2;
        this.f109373i = textView3;
        this.f109374j = textView4;
        this.f109375k = dota2DanView;
        this.f109376l = dota2HeroImageView;
        this.f109377m = kDAView;
        this.f109378n = view;
        this.f109379o = linearLayout;
    }

    @androidx.annotation.n0
    public static cf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21630, new Class[]{View.class}, cf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_authentication;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_authentication);
        if (imageView != null) {
            i10 = R.id.iv_avatar;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_equip_1;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_equip_1);
                if (imageView2 != null) {
                    i10 = R.id.iv_equip_2;
                    QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_equip_2);
                    if (qMUIRadiusImageView2 != null) {
                        i10 = R.id.rv_equip;
                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_equip);
                        if (recyclerView != null) {
                            i10 = R.id.tv_damage_rate;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_damage_rate);
                            if (textView != null) {
                                i10 = R.id.tv_fight_rate;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_fight_rate);
                                if (textView2 != null) {
                                    i10 = R.id.tv_kda;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_kda);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i10 = R.id.v_dota2_dan;
                                            Dota2DanView dota2DanView = (Dota2DanView) l3.d.a(view, R.id.v_dota2_dan);
                                            if (dota2DanView != null) {
                                                i10 = R.id.v_dota2_hero;
                                                Dota2HeroImageView dota2HeroImageView = (Dota2HeroImageView) l3.d.a(view, R.id.v_dota2_hero);
                                                if (dota2HeroImageView != null) {
                                                    i10 = R.id.v_kda;
                                                    KDAView kDAView = (KDAView) l3.d.a(view, R.id.v_kda);
                                                    if (kDAView != null) {
                                                        i10 = R.id.v_select;
                                                        View viewA = l3.d.a(view, R.id.v_select);
                                                        if (viewA != null) {
                                                            i10 = R.id.vg_kda;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kda);
                                                            if (linearLayout != null) {
                                                                return new cf0((RelativeLayout) view, imageView, qMUIRadiusImageView, imageView2, qMUIRadiusImageView2, recyclerView, textView, textView2, textView3, textView4, dota2DanView, dota2HeroImageView, kDAView, viewA, linearLayout);
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
    public static cf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21628, new Class[]{LayoutInflater.class}, cf0.class);
        return patchProxyResultProxy.isSupported ? (cf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21629, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_match_hero_data_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109365a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21631, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
