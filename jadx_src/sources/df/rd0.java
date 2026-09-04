package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.Shimmer.ShimmerFrameLayout;
import com.max.hbview.CountDownTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowTaskV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CountDownTextView f115189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShimmerFrameLayout f115194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f115199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewStub f115203p;

    private rd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CountDownTextView countDownTextView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 ShimmerFrameLayout shimmerFrameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ViewStub viewStub) {
        this.f115188a = linearLayout;
        this.f115189b = countDownTextView;
        this.f115190c = imageView;
        this.f115191d = linearLayout2;
        this.f115192e = linearLayout3;
        this.f115193f = linearLayout4;
        this.f115194g = shimmerFrameLayout;
        this.f115195h = textView;
        this.f115196i = textView2;
        this.f115197j = textView3;
        this.f115198k = textView4;
        this.f115199l = marqueeTextView;
        this.f115200m = view;
        this.f115201n = linearLayout5;
        this.f115202o = frameLayout;
        this.f115203p = viewStub;
    }

    @androidx.annotation.n0
    public static rd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21484, new Class[]{View.class}, rd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cdtv_state;
        CountDownTextView countDownTextView = (CountDownTextView) l3.d.a(view, R.id.cdtv_state);
        if (countDownTextView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll_retroactive;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_retroactive);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i10 = R.id.ll_sign;
                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_sign);
                    if (linearLayout3 != null) {
                        i10 = R.id.sfl_item;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) l3.d.a(view, R.id.sfl_item);
                        if (shimmerFrameLayout != null) {
                            i10 = R.id.tv_days;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_days);
                            if (textView != null) {
                                i10 = R.id.tv_retroactive;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_retroactive);
                                if (textView2 != null) {
                                    i10 = R.id.tv_sign_desc;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sign_desc);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_state;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_title;
                                            MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_title);
                                            if (marqueeTextView != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_award;
                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_award);
                                                    if (linearLayout4 != null) {
                                                        i10 = R.id.vg_state;
                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_state);
                                                        if (frameLayout != null) {
                                                            i10 = R.id.vs_retroactive_calendar;
                                                            ViewStub viewStub = (ViewStub) l3.d.a(view, R.id.vs_retroactive_calendar);
                                                            if (viewStub != null) {
                                                                return new rd0(linearLayout2, countDownTextView, imageView, linearLayout, linearLayout2, linearLayout3, shimmerFrameLayout, textView, textView2, textView3, textView4, marqueeTextView, viewA, linearLayout4, frameLayout, viewStub);
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
    public static rd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21482, new Class[]{LayoutInflater.class}, rd0.class);
        return patchProxyResultProxy.isSupported ? (rd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21483, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (rd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_task_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115188a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21485, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
