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

/* JADX INFO: compiled from: ItemR6PlayerWeaponDataHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f110706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110711h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110719p;

    private fv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110704a = relativeLayout;
        this.f110705b = oVar;
        this.f110706c = horizontalScrollListView;
        this.f110707d = imageView;
        this.f110708e = imageView2;
        this.f110709f = textView;
        this.f110710g = textView2;
        this.f110711h = textView3;
        this.f110712i = textView4;
        this.f110713j = textView5;
        this.f110714k = textView6;
        this.f110715l = textView7;
        this.f110716m = textView8;
        this.f110717n = textView9;
        this.f110718o = linearLayout;
        this.f110719p = linearLayout2;
    }

    @androidx.annotation.n0
    public static fv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19580, new Class[]{View.class}, fv.class);
        if (patchProxyResultProxy.isSupported) {
            return (fv) patchProxyResultProxy.result;
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
                            i10 = R.id.tv_sort_head_shot_count;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sort_head_shot_count);
                            if (textView2 != null) {
                                i10 = R.id.tv_sort_head_shot_percentage;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sort_head_shot_percentage);
                                if (textView3 != null) {
                                    i10 = R.id.tv_sort_kills_count;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sort_kills_count);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_sort_round_used_count;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_sort_round_used_count);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_sort_round_with_kill_percentage;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_sort_round_with_kill_percentage);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_sort_round_with_multi_kill_percentage;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_sort_round_with_multi_kill_percentage);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_sort_round_won_count;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_sort_round_won_count);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_sort_round_won_percentage;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_sort_round_won_percentage);
                                                        if (textView9 != null) {
                                                            i10 = R.id.vg_container;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_progress;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                                                if (linearLayout2 != null) {
                                                                    return new fv((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout, linearLayout2);
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
    public static fv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19578, new Class[]{LayoutInflater.class}, fv.class);
        return patchProxyResultProxy.isSupported ? (fv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19579, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fv.class);
        if (patchProxyResultProxy.isSupported) {
            return (fv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_weapon_data_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110704a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19581, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
