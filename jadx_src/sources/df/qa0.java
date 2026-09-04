package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutShareEpicDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qa0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f114825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BarChart f114826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BarChart f114827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f114839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final wh0 f114842r;

    private qa0(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 BarChart barChart, @androidx.annotation.n0 BarChart barChart2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 wh0 wh0Var) {
        this.f114825a = nestedScrollView;
        this.f114826b = barChart;
        this.f114827c = barChart2;
        this.f114828d = cardView;
        this.f114829e = cardView2;
        this.f114830f = imageView;
        this.f114831g = imageView2;
        this.f114832h = linearLayout;
        this.f114833i = linearLayout2;
        this.f114834j = recyclerView;
        this.f114835k = textView;
        this.f114836l = textView2;
        this.f114837m = textView3;
        this.f114838n = textView4;
        this.f114839o = qRCodeShareView;
        this.f114840p = relativeLayout;
        this.f114841q = imageView3;
        this.f114842r = wh0Var;
    }

    @androidx.annotation.n0
    public static qa0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21174, new Class[]{View.class}, qa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qa0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bc_chart_price;
        BarChart barChart = (BarChart) l3.d.a(view, R.id.bc_chart_price);
        if (barChart != null) {
            i10 = R.id.bc_chart_time;
            BarChart barChart2 = (BarChart) l3.d.a(view, R.id.bc_chart_time);
            if (barChart2 != null) {
                i10 = R.id.cv_chart_price;
                CardView cardView = (CardView) l3.d.a(view, R.id.cv_chart_price);
                if (cardView != null) {
                    i10 = R.id.cv_chart_time;
                    CardView cardView2 = (CardView) l3.d.a(view, R.id.cv_chart_time);
                    if (cardView2 != null) {
                        i10 = R.id.iv_head;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_head);
                        if (imageView != null) {
                            i10 = R.id.iv_mask;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
                            if (imageView2 != null) {
                                i10 = R.id.ll_content;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content);
                                if (linearLayout != null) {
                                    i10 = R.id.ll_info_wrapper;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_info_wrapper);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.rv_game;
                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game);
                                        if (recyclerView != null) {
                                            i10 = R.id.tv_avatar;
                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_avatar);
                                            if (textView != null) {
                                                i10 = R.id.tv_game_num;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_num);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_nickname;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_update_time;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_update_time);
                                                        if (textView4 != null) {
                                                            i10 = R.id.v_qr_code;
                                                            QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                                            if (qRCodeShareView != null) {
                                                                i10 = R.id.vg_avatar;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_avatar);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_avatar_frame;
                                                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.vg_avatar_frame);
                                                                    if (imageView3 != null) {
                                                                        i10 = R.id.vg_detail_value;
                                                                        View viewA = l3.d.a(view, R.id.vg_detail_value);
                                                                        if (viewA != null) {
                                                                            return new qa0((NestedScrollView) view, barChart, barChart2, cardView, cardView2, imageView, imageView2, linearLayout, linearLayout2, recyclerView, textView, textView2, textView3, textView4, qRCodeShareView, relativeLayout, imageView3, wh0.a(viewA));
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
    public static qa0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21172, new Class[]{LayoutInflater.class}, qa0.class);
        return patchProxyResultProxy.isSupported ? (qa0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qa0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21173, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qa0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qa0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_share_epic_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f114825a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21175, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
