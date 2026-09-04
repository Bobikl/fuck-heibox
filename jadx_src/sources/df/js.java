package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.HorizontalScrollListView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOwPlayerHeroDataBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class js implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f112256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112273t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112274u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112275v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112278y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112279z;

    private js(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 TextView textView17, @androidx.annotation.n0 TextView textView18, @androidx.annotation.n0 TextView textView19, @androidx.annotation.n0 TextView textView20, @androidx.annotation.n0 TextView textView21, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112254a = relativeLayout;
        this.f112255b = oVar;
        this.f112256c = horizontalScrollListView;
        this.f112257d = imageView;
        this.f112258e = imageView2;
        this.f112259f = textView;
        this.f112260g = textView2;
        this.f112261h = textView3;
        this.f112262i = textView4;
        this.f112263j = textView5;
        this.f112264k = textView6;
        this.f112265l = textView7;
        this.f112266m = textView8;
        this.f112267n = textView9;
        this.f112268o = textView10;
        this.f112269p = textView11;
        this.f112270q = textView12;
        this.f112271r = textView13;
        this.f112272s = textView14;
        this.f112273t = textView15;
        this.f112274u = textView16;
        this.f112275v = textView17;
        this.f112276w = textView18;
        this.f112277x = textView19;
        this.f112278y = textView20;
        this.f112279z = textView21;
        this.A = linearLayout;
    }

    @androidx.annotation.n0
    public static js a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19288, new Class[]{View.class}, js.class);
        if (patchProxyResultProxy.isSupported) {
            return (js) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.hsv;
            HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) l3.d.a(view, R.id.hsv);
            if (horizontalScrollListView != null) {
                i10 = R.id.iv_gradient;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient);
                if (imageView != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView2 != null) {
                        i10 = R.id.tv_alone_kill;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_alone_kill);
                        if (textView != null) {
                            i10 = R.id.tv_avg_aad_kill;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_avg_aad_kill);
                            if (textView2 != null) {
                                i10 = R.id.tv_avg_aad_time;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_avg_aad_time);
                                if (textView3 != null) {
                                    i10 = R.id.tv_avg_alone_kill;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_avg_alone_kill);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_avg_dmg;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_avg_dmg);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_avg_heal;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_avg_heal);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_avg_last_hit;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_avg_last_hit);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_avg_on_fire_time;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_avg_on_fire_time);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_critical_acc;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_critical_acc);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_death;
                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_death);
                                                            if (textView10 != null) {
                                                                i10 = R.id.tv_dmg;
                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_dmg);
                                                                if (textView11 != null) {
                                                                    i10 = R.id.tv_heal;
                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_heal);
                                                                    if (textView12 != null) {
                                                                        i10 = R.id.tv_kd;
                                                                        TextView textView13 = (TextView) l3.d.a(view, R.id.tv_kd);
                                                                        if (textView13 != null) {
                                                                            i10 = R.id.tv_kill;
                                                                            TextView textView14 = (TextView) l3.d.a(view, R.id.tv_kill);
                                                                            if (textView14 != null) {
                                                                                i10 = R.id.tv_last_hit;
                                                                                TextView textView15 = (TextView) l3.d.a(view, R.id.tv_last_hit);
                                                                                if (textView15 != null) {
                                                                                    i10 = R.id.tv_match_time;
                                                                                    TextView textView16 = (TextView) l3.d.a(view, R.id.tv_match_time);
                                                                                    if (textView16 != null) {
                                                                                        i10 = R.id.tv_mmr;
                                                                                        TextView textView17 = (TextView) l3.d.a(view, R.id.tv_mmr);
                                                                                        if (textView17 != null) {
                                                                                            i10 = R.id.tv_mmr_rank;
                                                                                            TextView textView18 = (TextView) l3.d.a(view, R.id.tv_mmr_rank);
                                                                                            if (textView18 != null) {
                                                                                                i10 = R.id.tv_name;
                                                                                                TextView textView19 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                                                if (textView19 != null) {
                                                                                                    i10 = R.id.tv_on_fire_time;
                                                                                                    TextView textView20 = (TextView) l3.d.a(view, R.id.tv_on_fire_time);
                                                                                                    if (textView20 != null) {
                                                                                                        i10 = R.id.tv_weapon_acc;
                                                                                                        TextView textView21 = (TextView) l3.d.a(view, R.id.tv_weapon_acc);
                                                                                                        if (textView21 != null) {
                                                                                                            i10 = R.id.vg_container;
                                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                                                                            if (linearLayout != null) {
                                                                                                                return new js((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, linearLayout);
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
    public static js c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19286, new Class[]{LayoutInflater.class}, js.class);
        return patchProxyResultProxy.isSupported ? (js) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static js d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19287, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, js.class);
        if (patchProxyResultProxy.isSupported) {
            return (js) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_ow_player_hero_data, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112254a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19289, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
