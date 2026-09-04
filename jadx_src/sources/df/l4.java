package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogAliCertifyBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f112845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f112846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f112851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112857n;

    private l4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112844a = relativeLayout;
        this.f112845b = checkBox;
        this.f112846c = qMUIRadiusImageView;
        this.f112847d = imageView;
        this.f112848e = textView;
        this.f112849f = textView2;
        this.f112850g = textView3;
        this.f112851h = hBLineHeightTextView;
        this.f112852i = textView4;
        this.f112853j = textView5;
        this.f112854k = frameLayout;
        this.f112855l = linearLayout;
        this.f112856m = frameLayout2;
        this.f112857n = linearLayout2;
    }

    @androidx.annotation.n0
    public static l4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16804, new Class[]{View.class}, l4.class);
        if (patchProxyResultProxy.isSupported) {
            return (l4) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_agreement;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_agreement);
        if (checkBox != null) {
            i10 = R.id.iv_avatar;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_dialog_close;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_dialog_close);
                if (imageView != null) {
                    i10 = R.id.tv_agreement;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_agreement);
                    if (textView != null) {
                        i10 = R.id.tv_auth_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_auth_title);
                        if (textView2 != null) {
                            i10 = R.id.tv_confirm;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                            if (textView3 != null) {
                                i10 = R.id.tv_desc;
                                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                                if (hBLineHeightTextView != null) {
                                    i10 = R.id.tv_id_card;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_id_card);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_bg;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                            if (frameLayout != null) {
                                                i10 = R.id.vg_bottom_bar;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_checkbox;
                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_checkbox);
                                                    if (frameLayout2 != null) {
                                                        i10 = R.id.vg_tips;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tips);
                                                        if (linearLayout2 != null) {
                                                            return new l4((RelativeLayout) view, checkBox, qMUIRadiusImageView, imageView, textView, textView2, textView3, hBLineHeightTextView, textView4, textView5, frameLayout, linearLayout, frameLayout2, linearLayout2);
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
    public static l4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16802, new Class[]{LayoutInflater.class}, l4.class);
        return patchProxyResultProxy.isSupported ? (l4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16803, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l4.class);
        if (patchProxyResultProxy.isSupported) {
            return (l4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_ali_certify, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112844a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16805, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
