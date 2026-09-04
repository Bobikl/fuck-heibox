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

/* JADX INFO: compiled from: ItemOwPlayerHeroDataHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ks implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f112715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112727o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112728p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112729q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112731s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112732t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112733u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112734v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112735w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112736x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112737y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112738z;

    private ks(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 TextView textView13, @androidx.annotation.n0 TextView textView14, @androidx.annotation.n0 TextView textView15, @androidx.annotation.n0 TextView textView16, @androidx.annotation.n0 TextView textView17, @androidx.annotation.n0 TextView textView18, @androidx.annotation.n0 TextView textView19, @androidx.annotation.n0 TextView textView20, @androidx.annotation.n0 TextView textView21, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112713a = relativeLayout;
        this.f112714b = oVar;
        this.f112715c = horizontalScrollListView;
        this.f112716d = imageView;
        this.f112717e = imageView2;
        this.f112718f = textView;
        this.f112719g = textView2;
        this.f112720h = textView3;
        this.f112721i = textView4;
        this.f112722j = textView5;
        this.f112723k = textView6;
        this.f112724l = textView7;
        this.f112725m = textView8;
        this.f112726n = textView9;
        this.f112727o = textView10;
        this.f112728p = textView11;
        this.f112729q = textView12;
        this.f112730r = textView13;
        this.f112731s = textView14;
        this.f112732t = textView15;
        this.f112733u = textView16;
        this.f112734v = textView17;
        this.f112735w = textView18;
        this.f112736x = textView19;
        this.f112737y = textView20;
        this.f112738z = textView21;
        this.A = linearLayout;
    }

    @androidx.annotation.n0
    public static ks a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19292, new Class[]{View.class}, ks.class);
        if (patchProxyResultProxy.isSupported) {
            return (ks) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.hsv_header;
            HorizontalScrollListView horizontalScrollListView = (HorizontalScrollListView) l3.d.a(view, R.id.hsv_header);
            if (horizontalScrollListView != null) {
                i10 = R.id.iv_gradient_header;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_gradient_header);
                if (imageView != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView2 != null) {
                        i10 = R.id.tv_name;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView != null) {
                            i10 = R.id.tv_sort_alone_kill;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sort_alone_kill);
                            if (textView2 != null) {
                                i10 = R.id.tv_sort_avg_aad_kill;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sort_avg_aad_kill);
                                if (textView3 != null) {
                                    i10 = R.id.tv_sort_avg_aad_time;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sort_avg_aad_time);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_sort_avg_alone_kill;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_sort_avg_alone_kill);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_sort_avg_dmg;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_sort_avg_dmg);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_sort_avg_heal;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_sort_avg_heal);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_sort_avg_last_hit;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_sort_avg_last_hit);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_sort_avg_on_fire_time;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_sort_avg_on_fire_time);
                                                        if (textView9 != null) {
                                                            i10 = R.id.tv_sort_critical_acc;
                                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_sort_critical_acc);
                                                            if (textView10 != null) {
                                                                i10 = R.id.tv_sort_death;
                                                                TextView textView11 = (TextView) l3.d.a(view, R.id.tv_sort_death);
                                                                if (textView11 != null) {
                                                                    i10 = R.id.tv_sort_dmg;
                                                                    TextView textView12 = (TextView) l3.d.a(view, R.id.tv_sort_dmg);
                                                                    if (textView12 != null) {
                                                                        i10 = R.id.tv_sort_heal;
                                                                        TextView textView13 = (TextView) l3.d.a(view, R.id.tv_sort_heal);
                                                                        if (textView13 != null) {
                                                                            i10 = R.id.tv_sort_kd;
                                                                            TextView textView14 = (TextView) l3.d.a(view, R.id.tv_sort_kd);
                                                                            if (textView14 != null) {
                                                                                i10 = R.id.tv_sort_kill;
                                                                                TextView textView15 = (TextView) l3.d.a(view, R.id.tv_sort_kill);
                                                                                if (textView15 != null) {
                                                                                    i10 = R.id.tv_sort_last_hit;
                                                                                    TextView textView16 = (TextView) l3.d.a(view, R.id.tv_sort_last_hit);
                                                                                    if (textView16 != null) {
                                                                                        i10 = R.id.tv_sort_match_time;
                                                                                        TextView textView17 = (TextView) l3.d.a(view, R.id.tv_sort_match_time);
                                                                                        if (textView17 != null) {
                                                                                            i10 = R.id.tv_sort_mmr;
                                                                                            TextView textView18 = (TextView) l3.d.a(view, R.id.tv_sort_mmr);
                                                                                            if (textView18 != null) {
                                                                                                i10 = R.id.tv_sort_mmr_rank;
                                                                                                TextView textView19 = (TextView) l3.d.a(view, R.id.tv_sort_mmr_rank);
                                                                                                if (textView19 != null) {
                                                                                                    i10 = R.id.tv_sort_on_fire_time;
                                                                                                    TextView textView20 = (TextView) l3.d.a(view, R.id.tv_sort_on_fire_time);
                                                                                                    if (textView20 != null) {
                                                                                                        i10 = R.id.tv_sort_weapon_acc;
                                                                                                        TextView textView21 = (TextView) l3.d.a(view, R.id.tv_sort_weapon_acc);
                                                                                                        if (textView21 != null) {
                                                                                                            i10 = R.id.vg_container;
                                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                                                                            if (linearLayout != null) {
                                                                                                                return new ks((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, linearLayout);
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
    public static ks c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19290, new Class[]{LayoutInflater.class}, ks.class);
        return patchProxyResultProxy.isSupported ? (ks) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ks d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19291, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ks.class);
        if (patchProxyResultProxy.isSupported) {
            return (ks) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_ow_player_hero_data_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112713a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19293, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
