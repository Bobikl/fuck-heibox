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

/* JADX INFO: compiled from: ActivityInputPayPwdBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f117329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final PinEntryEditText f117330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f117331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TitleBar f117334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117335j;

    private x0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 PinEntryEditText pinEntryEditText, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TitleBar titleBar, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117326a = constraintLayout;
        this.f117327b = constraintLayout2;
        this.f117328c = imageView;
        this.f117329d = guideline;
        this.f117330e = pinEntryEditText;
        this.f117331f = hBLineHeightTextView;
        this.f117332g = textView;
        this.f117333h = textView2;
        this.f117334i = titleBar;
        this.f117335j = linearLayout;
    }

    @androidx.annotation.n0
    public static x0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16436, new Class[]{View.class}, x0.class);
        if (patchProxyResultProxy.isSupported) {
            return (x0) patchProxyResultProxy.result;
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
                    i10 = R.id.tv_desc;
                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                    if (hBLineHeightTextView != null) {
                        i10 = R.id.tv_forget_pwd;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_forget_pwd);
                        if (textView != null) {
                            i10 = R.id.tv_title;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView2 != null) {
                                i10 = R.id.v_title;
                                TitleBar titleBar = (TitleBar) l3.d.a(view, R.id.v_title);
                                if (titleBar != null) {
                                    i10 = R.id.vg_bg;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                                    if (linearLayout != null) {
                                        return new x0(constraintLayout, constraintLayout, imageView, guideline, pinEntryEditText, hBLineHeightTextView, textView, textView2, titleBar, linearLayout);
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
    public static x0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16434, new Class[]{LayoutInflater.class}, x0.class);
        return patchProxyResultProxy.isSupported ? (x0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16435, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x0.class);
        if (patchProxyResultProxy.isSupported) {
            return (x0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_input_pay_pwd, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117326a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16437, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
