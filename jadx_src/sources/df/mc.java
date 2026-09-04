package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HeaderSignInV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f113382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GridLayout f113384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113392l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113393m;

    private mc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 View view, @androidx.annotation.n0 GridLayout gridLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113381a = linearLayout;
        this.f113382b = checkBox;
        this.f113383c = view;
        this.f113384d = gridLayout;
        this.f113385e = imageView;
        this.f113386f = relativeLayout;
        this.f113387g = textView;
        this.f113388h = textView2;
        this.f113389i = textView3;
        this.f113390j = textView4;
        this.f113391k = view2;
        this.f113392l = relativeLayout2;
        this.f113393m = linearLayout2;
    }

    @androidx.annotation.n0
    public static mc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17640, new Class[]{View.class}, mc.class);
        if (patchProxyResultProxy.isSupported) {
            return (mc) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_check_in_hint;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_check_in_hint);
        if (checkBox != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.gl_days;
                GridLayout gridLayout = (GridLayout) l3.d.a(view, R.id.gl_days);
                if (gridLayout != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView != null) {
                        i10 = R.id.rl_sunday;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_sunday);
                        if (relativeLayout != null) {
                            i10 = R.id.tv_check_in;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_check_in);
                            if (textView != null) {
                                i10 = R.id.tv_item_desc;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_desc);
                                if (textView2 != null) {
                                    i10 = R.id.tv_item_title;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_item_title);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView4 != null) {
                                            i10 = R.id.v_mask;
                                            View viewA2 = l3.d.a(view, R.id.v_mask);
                                            if (viewA2 != null) {
                                                i10 = R.id.vg_bg;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_bg);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.vg_check_in_hint;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_check_in_hint);
                                                    if (linearLayout != null) {
                                                        return new mc((LinearLayout) view, checkBox, viewA, gridLayout, imageView, relativeLayout, textView, textView2, textView3, textView4, viewA2, relativeLayout2, linearLayout);
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
    public static mc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17638, new Class[]{LayoutInflater.class}, mc.class);
        return patchProxyResultProxy.isSupported ? (mc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17639, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mc.class);
        if (patchProxyResultProxy.isSupported) {
            return (mc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.header_sign_in_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113381a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17641, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
