package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.KDAView;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroMmrView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2HeroItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ye0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f117933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final Dota2HeroMmrView f117938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final KDAView f117939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117940i;

    private ye0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 Dota2HeroMmrView dota2HeroMmrView, @androidx.annotation.n0 KDAView kDAView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117932a = relativeLayout;
        this.f117933b = qMUIRadiusImageView;
        this.f117934c = progressBar;
        this.f117935d = textView;
        this.f117936e = textView2;
        this.f117937f = textView3;
        this.f117938g = dota2HeroMmrView;
        this.f117939h = kDAView;
        this.f117940i = linearLayout;
    }

    @androidx.annotation.n0
    public static ye0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21614, new Class[]{View.class}, ye0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ye0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_hero;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_hero);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.pb_achievement;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_achievement);
            if (progressBar != null) {
                i10 = R.id.tv_kd;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_kd);
                if (textView != null) {
                    i10 = R.id.tv_num;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_num);
                    if (textView2 != null) {
                        i10 = R.id.tv_win_rate;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_win_rate);
                        if (textView3 != null) {
                            i10 = R.id.v_dota2_mmr;
                            Dota2HeroMmrView dota2HeroMmrView = (Dota2HeroMmrView) l3.d.a(view, R.id.v_dota2_mmr);
                            if (dota2HeroMmrView != null) {
                                i10 = R.id.v_kda;
                                KDAView kDAView = (KDAView) l3.d.a(view, R.id.v_kda);
                                if (kDAView != null) {
                                    i10 = R.id.vg_kda;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_kda);
                                    if (linearLayout != null) {
                                        return new ye0((RelativeLayout) view, qMUIRadiusImageView, progressBar, textView, textView2, textView3, dota2HeroMmrView, kDAView, linearLayout);
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
    public static ye0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21612, new Class[]{LayoutInflater.class}, ye0.class);
        return patchProxyResultProxy.isSupported ? (ye0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ye0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21613, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ye0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ye0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_hero_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117932a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21615, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
