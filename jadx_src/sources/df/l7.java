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

/* JADX INFO: compiled from: FragmentChargeDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112899l;

    private l7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f112888a = relativeLayout;
        this.f112889b = imageView;
        this.f112890c = linearLayout;
        this.f112891d = linearLayout2;
        this.f112892e = textView;
        this.f112893f = textView2;
        this.f112894g = textView3;
        this.f112895h = textView4;
        this.f112896i = textView5;
        this.f112897j = textView6;
        this.f112898k = relativeLayout2;
        this.f112899l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static l7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17116, new Class[]{View.class}, l7.class);
        if (patchProxyResultProxy.isSupported) {
            return (l7) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.ll_choose_options;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_choose_options);
            if (linearLayout != null) {
                i10 = R.id.ll_title;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_title);
                if (linearLayout2 != null) {
                    i10 = R.id.tv_battery_got;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_battery_got);
                    if (textView != null) {
                        i10 = R.id.tv_battery_remaining;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_battery_remaining);
                        if (textView2 != null) {
                            i10 = R.id.tv_confirm;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                            if (textView3 != null) {
                                i10 = R.id.tv_content_get_desc;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_content_get_desc);
                                if (textView4 != null) {
                                    i10 = R.id.tv_heybox_battery_cnt;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_heybox_battery_cnt);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_heybox_battery_faq;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_heybox_battery_faq);
                                        if (textView6 != null) {
                                            i10 = R.id.vg_bottom_bar;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_progress;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_progress);
                                                if (relativeLayout2 != null) {
                                                    return new l7((RelativeLayout) view, imageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5, textView6, relativeLayout, relativeLayout2);
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
    public static l7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17114, new Class[]{LayoutInflater.class}, l7.class);
        return patchProxyResultProxy.isSupported ? (l7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17115, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l7.class);
        if (patchProxyResultProxy.isSupported) {
            return (l7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_charge_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112888a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17117, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
