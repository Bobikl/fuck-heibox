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

/* JADX INFO: compiled from: ItemR6PlayerMapDataHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f109034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollListView f109035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109048p;

    private bv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 HorizontalScrollListView horizontalScrollListView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f109033a = relativeLayout;
        this.f109034b = oVar;
        this.f109035c = horizontalScrollListView;
        this.f109036d = imageView;
        this.f109037e = imageView2;
        this.f109038f = textView;
        this.f109039g = textView2;
        this.f109040h = textView3;
        this.f109041i = textView4;
        this.f109042j = textView5;
        this.f109043k = textView6;
        this.f109044l = textView7;
        this.f109045m = textView8;
        this.f109046n = textView9;
        this.f109047o = linearLayout;
        this.f109048p = linearLayout2;
    }

    @androidx.annotation.n0
    public static bv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19564, new Class[]{View.class}, bv.class);
        if (patchProxyResultProxy.isSupported) {
            return (bv) patchProxyResultProxy.result;
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
                            i10 = R.id.tv_sort_kd;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_sort_kd);
                            if (textView2 != null) {
                                i10 = R.id.tv_sort_kost_per;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sort_kost_per);
                                if (textView3 != null) {
                                    i10 = R.id.tv_sort_round_with_opening_death;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_sort_round_with_opening_death);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_sort_round_with_opening_kill;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_sort_round_with_opening_kill);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_sort_round_won_count;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_sort_round_won_count);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_sort_rounds;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_sort_rounds);
                                                if (textView7 != null) {
                                                    i10 = R.id.tv_sort_time_played;
                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_sort_time_played);
                                                    if (textView8 != null) {
                                                        i10 = R.id.tv_sort_won_per;
                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_sort_won_per);
                                                        if (textView9 != null) {
                                                            i10 = R.id.vg_container;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_container);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_progress;
                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_progress);
                                                                if (linearLayout2 != null) {
                                                                    return new bv((RelativeLayout) view, oVarA, horizontalScrollListView, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, linearLayout, linearLayout2);
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
    public static bv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19562, new Class[]{LayoutInflater.class}, bv.class);
        return patchProxyResultProxy.isSupported ? (bv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19563, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bv.class);
        if (patchProxyResultProxy.isSupported) {
            return (bv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_r6_player_map_data_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109033a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19565, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
