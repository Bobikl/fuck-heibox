package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.Shimmer.ShimmerLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomSheetsBindPhoneBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f110004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f110010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f110011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f110012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShimmerLayout f110023u;

    private e30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 EditText editText4, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 Guideline guideline3, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ShimmerLayout shimmerLayout) {
        this.f110003a = relativeLayout;
        this.f110004b = bottomButtonLeftItemView;
        this.f110005c = constraintLayout;
        this.f110006d = editText;
        this.f110007e = editText2;
        this.f110008f = editText3;
        this.f110009g = editText4;
        this.f110010h = guideline;
        this.f110011i = guideline2;
        this.f110012j = guideline3;
        this.f110013k = imageView;
        this.f110014l = imageView2;
        this.f110015m = textView;
        this.f110016n = textView2;
        this.f110017o = textView3;
        this.f110018p = textView4;
        this.f110019q = textView5;
        this.f110020r = textView6;
        this.f110021s = textView7;
        this.f110022t = linearLayout;
        this.f110023u = shimmerLayout;
    }

    @androidx.annotation.n0
    public static e30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20402, new Class[]{View.class}, e30.class);
        if (patchProxyResultProxy.isSupported) {
            return (e30) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.cl_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
            if (constraintLayout != null) {
                i10 = R.id.et_input_password;
                EditText editText = (EditText) l3.d.a(view, R.id.et_input_password);
                if (editText != null) {
                    i10 = R.id.et_input_password_confirm;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_input_password_confirm);
                    if (editText2 != null) {
                        i10 = R.id.et_input_phone_num;
                        EditText editText3 = (EditText) l3.d.a(view, R.id.et_input_phone_num);
                        if (editText3 != null) {
                            i10 = R.id.et_input_verify_code;
                            EditText editText4 = (EditText) l3.d.a(view, R.id.et_input_verify_code);
                            if (editText4 != null) {
                                i10 = R.id.guideline_end;
                                Guideline guideline = (Guideline) l3.d.a(view, R.id.guideline_end);
                                if (guideline != null) {
                                    i10 = R.id.guideline_input_top;
                                    Guideline guideline2 = (Guideline) l3.d.a(view, R.id.guideline_input_top);
                                    if (guideline2 != null) {
                                        i10 = R.id.guideline_start;
                                        Guideline guideline3 = (Guideline) l3.d.a(view, R.id.guideline_start);
                                        if (guideline3 != null) {
                                            i10 = R.id.iv_icon;
                                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                                            if (imageView != null) {
                                                i10 = R.id.iv_small_icon;
                                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_small_icon);
                                                if (imageView2 != null) {
                                                    i10 = R.id.tv_area_code;
                                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_area_code);
                                                    if (textView != null) {
                                                        i10 = R.id.tv_confirm_password_w500;
                                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm_password_w500);
                                                        if (textView2 != null) {
                                                            i10 = R.id.tv_get_code;
                                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_get_code);
                                                            if (textView3 != null) {
                                                                i10 = R.id.tv_password_w500;
                                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_password_w500);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.tv_phone_num_w500;
                                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_phone_num_w500);
                                                                    if (textView5 != null) {
                                                                        i10 = R.id.tv_title;
                                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                        if (textView6 != null) {
                                                                            i10 = R.id.tv_verify_code_w500;
                                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_verify_code_w500);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.vg_area_code;
                                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_area_code);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.vg_icon;
                                                                                    ShimmerLayout shimmerLayout = (ShimmerLayout) l3.d.a(view, R.id.vg_icon);
                                                                                    if (shimmerLayout != null) {
                                                                                        return new e30((RelativeLayout) view, bottomButtonLeftItemView, constraintLayout, editText, editText2, editText3, editText4, guideline, guideline2, guideline3, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, shimmerLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static e30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20400, new Class[]{LayoutInflater.class}, e30.class);
        return patchProxyResultProxy.isSupported ? (e30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20401, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e30.class);
        if (patchProxyResultProxy.isSupported) {
            return (e30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheets_bind_phone, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110003a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20403, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
