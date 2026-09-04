package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuMoreBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ed0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110159p;

    private ed0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8) {
        this.f110144a = linearLayout;
        this.f110145b = imageView;
        this.f110146c = imageView2;
        this.f110147d = imageView3;
        this.f110148e = textView;
        this.f110149f = textView2;
        this.f110150g = view;
        this.f110151h = view2;
        this.f110152i = linearLayout2;
        this.f110153j = linearLayout3;
        this.f110154k = linearLayout4;
        this.f110155l = linearLayout5;
        this.f110156m = relativeLayout;
        this.f110157n = linearLayout6;
        this.f110158o = linearLayout7;
        this.f110159p = linearLayout8;
    }

    @androidx.annotation.n0
    public static ed0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21433, new Class[]{View.class}, ed0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ed0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_menu_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_menu_close);
        if (imageView != null) {
            i10 = R.id.iv_menu_collect;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_menu_collect);
            if (imageView2 != null) {
                i10 = R.id.iv_menu_report;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_menu_report);
                if (imageView3 != null) {
                    i10 = R.id.tv_menu_collect;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_menu_collect);
                    if (textView != null) {
                        i10 = R.id.tv_menu_report;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_menu_report);
                        if (textView2 != null) {
                            i10 = R.id.v_margin;
                            View viewA = l3.d.a(view, R.id.v_margin);
                            if (viewA != null) {
                                i10 = R.id.v_shadow;
                                View viewA2 = l3.d.a(view, R.id.v_shadow);
                                if (viewA2 != null) {
                                    i10 = R.id.vg_content;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_menu_bitrate;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_menu_bitrate);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_menu_bitrate_list;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_menu_bitrate_list);
                                            if (linearLayout3 != null) {
                                                i10 = R.id.vg_menu_collect;
                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_menu_collect);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.vg_menu_header;
                                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_menu_header);
                                                    if (relativeLayout != null) {
                                                        i10 = R.id.vg_menu_report;
                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_menu_report);
                                                        if (linearLayout5 != null) {
                                                            i10 = R.id.vg_menu_speed;
                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_menu_speed);
                                                            if (linearLayout6 != null) {
                                                                i10 = R.id.vg_menu_speed_list;
                                                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_menu_speed_list);
                                                                if (linearLayout7 != null) {
                                                                    return new ed0((LinearLayout) view, imageView, imageView2, imageView3, textView, textView2, viewA, viewA2, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout, linearLayout5, linearLayout6, linearLayout7);
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
    public static ed0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21431, new Class[]{LayoutInflater.class}, ed0.class);
        return patchProxyResultProxy.isSupported ? (ed0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ed0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21432, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ed0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ed0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_more, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110144a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21434, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
