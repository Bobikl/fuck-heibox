package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDota2MatchHeroDataExpandBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f108946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108953q;

    private bf0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 RecyclerView recyclerView3, @androidx.annotation.n0 RecyclerView recyclerView4, @androidx.annotation.n0 RecyclerView recyclerView5, @androidx.annotation.n0 RecyclerView recyclerView6, @androidx.annotation.n0 RecyclerView recyclerView7, @androidx.annotation.n0 RecyclerView recyclerView8, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f108937a = linearLayout;
        this.f108938b = imageView;
        this.f108939c = recyclerView;
        this.f108940d = recyclerView2;
        this.f108941e = recyclerView3;
        this.f108942f = recyclerView4;
        this.f108943g = recyclerView5;
        this.f108944h = recyclerView6;
        this.f108945i = recyclerView7;
        this.f108946j = recyclerView8;
        this.f108947k = textView;
        this.f108948l = textView2;
        this.f108949m = textView3;
        this.f108950n = textView4;
        this.f108951o = linearLayout2;
        this.f108952p = linearLayout3;
        this.f108953q = relativeLayout;
    }

    @androidx.annotation.n0
    public static bf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21626, new Class[]{View.class}, bf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_unit_equip;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_unit_equip);
        if (imageView != null) {
            i10 = R.id.rv_backpack;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_backpack);
            if (recyclerView != null) {
                i10 = R.id.rv_hero_buff;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_hero_buff);
                if (recyclerView2 != null) {
                    i10 = R.id.rv_hero_data;
                    RecyclerView recyclerView3 = (RecyclerView) l3.d.a(view, R.id.rv_hero_data);
                    if (recyclerView3 != null) {
                        i10 = R.id.rv_hero_kill;
                        RecyclerView recyclerView4 = (RecyclerView) l3.d.a(view, R.id.rv_hero_kill);
                        if (recyclerView4 != null) {
                            i10 = R.id.rv_hero_level_up;
                            RecyclerView recyclerView5 = (RecyclerView) l3.d.a(view, R.id.rv_hero_level_up);
                            if (recyclerView5 != null) {
                                i10 = R.id.rv_support_tools;
                                RecyclerView recyclerView6 = (RecyclerView) l3.d.a(view, R.id.rv_support_tools);
                                if (recyclerView6 != null) {
                                    i10 = R.id.rv_unit_backpack;
                                    RecyclerView recyclerView7 = (RecyclerView) l3.d.a(view, R.id.rv_unit_backpack);
                                    if (recyclerView7 != null) {
                                        i10 = R.id.rv_unit_equip;
                                        RecyclerView recyclerView8 = (RecyclerView) l3.d.a(view, R.id.rv_unit_equip);
                                        if (recyclerView8 != null) {
                                            i10 = R.id.tv_all_damage;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_all_damage);
                                            if (textView != null) {
                                                i10 = R.id.tv_all_gold;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_all_gold);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_score;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_score);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_unit_name;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_unit_name);
                                                        if (textView4 != null) {
                                                            i10 = R.id.vg_hero_kill;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_hero_kill);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_support_tools;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_support_tools);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.vg_unit;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_unit);
                                                                    if (relativeLayout != null) {
                                                                        return new bf0((LinearLayout) view, imageView, recyclerView, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6, recyclerView7, recyclerView8, textView, textView2, textView3, textView4, linearLayout, linearLayout2, relativeLayout);
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
    public static bf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21624, new Class[]{LayoutInflater.class}, bf0.class);
        return patchProxyResultProxy.isSupported ? (bf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21625, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_dota2_match_hero_data_expand, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108937a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21627, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
