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

/* JADX INFO: compiled from: DialogAchieveEventBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111248n;

    private h4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f111235a = relativeLayout;
        this.f111236b = imageView;
        this.f111237c = view;
        this.f111238d = textView;
        this.f111239e = textView2;
        this.f111240f = textView3;
        this.f111241g = textView4;
        this.f111242h = textView5;
        this.f111243i = textView6;
        this.f111244j = textView7;
        this.f111245k = linearLayout;
        this.f111246l = linearLayout2;
        this.f111247m = linearLayout3;
        this.f111248n = relativeLayout2;
    }

    @androidx.annotation.n0
    public static h4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16788, new Class[]{View.class}, h4.class);
        if (patchProxyResultProxy.isSupported) {
            return (h4) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.line_v;
            View viewA = l3.d.a(view, R.id.line_v);
            if (viewA != null) {
                i10 = R.id.tv_award_coin;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_award_coin);
                if (textView != null) {
                    i10 = R.id.tv_award_exp;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_award_exp);
                    if (textView2 != null) {
                        i10 = R.id.tv_desc;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView3 != null) {
                            i10 = R.id.tv_mission_msg;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_mission_msg);
                            if (textView4 != null) {
                                i10 = R.id.tv_negative_button;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_negative_button);
                                if (textView5 != null) {
                                    i10 = R.id.tv_positive_button;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView7 != null) {
                                            i10 = R.id.vg_award_coin;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_award_coin);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_award_exp;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_award_exp);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_button_panel;
                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.vg_icon;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_icon);
                                                        if (relativeLayout != null) {
                                                            return new h4((RelativeLayout) view, imageView, viewA, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, linearLayout2, linearLayout3, relativeLayout);
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
    public static h4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16786, new Class[]{LayoutInflater.class}, h4.class);
        return patchProxyResultProxy.isSupported ? (h4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16787, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h4.class);
        if (patchProxyResultProxy.isSupported) {
            return (h4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_achieve_event, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111235a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16789, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
