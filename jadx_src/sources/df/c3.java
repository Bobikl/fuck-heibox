package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.PinEntryEditText;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityVerifyPhonenumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final PinEntryEditText f109132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f109134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f109136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109137j;

    private c3(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 PinEntryEditText pinEntryEditText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f109128a = constraintLayout;
        this.f109129b = constraintLayout2;
        this.f109130c = imageView;
        this.f109131d = guideline;
        this.f109132e = pinEntryEditText;
        this.f109133f = textView;
        this.f109134g = hBLineHeightTextView;
        this.f109135h = textView2;
        this.f109136i = titleBar;
        this.f109137j = linearLayout;
    }

    @androidx.annotation.n0
    public static c3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16664, new Class[]{View.class}, c3.class);
        if (patchProxyResultProxy.isSupported) {
            return (c3) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.iv_bottom_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
        if (imageView != null) {
            i10 = R.id.line_et_top;
            Guideline guideline = (Guideline) l3.d.a(view, R.id.line_et_top);
            if (guideline != null) {
                i10 = R.id.pet_verification_code;
                PinEntryEditText pinEntryEditText = (PinEntryEditText) l3.d.a(view, R.id.pet_verification_code);
                if (pinEntryEditText != null) {
                    i10 = R.id.tv_action;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                    if (textView != null) {
                        i10 = R.id.tv_desc;
                        HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                        if (hBLineHeightTextView != null) {
                            i10 = R.id.tv_title;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView2 != null) {
                                i10 = R.id.v_title;
                                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.v_title);
                                if (titleBar != null) {
                                    i10 = R.id.vg_bg;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                                    if (linearLayout != null) {
                                        return new c3(constraintLayout, constraintLayout, imageView, guideline, pinEntryEditText, textView, hBLineHeightTextView, textView2, titleBar, linearLayout);
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
    public static c3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16662, new Class[]{LayoutInflater.class}, c3.class);
        return patchProxyResultProxy.isSupported ? (c3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16663, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c3.class);
        if (patchProxyResultProxy.isSupported) {
            return (c3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_verify_phonenum, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109128a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16665, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
