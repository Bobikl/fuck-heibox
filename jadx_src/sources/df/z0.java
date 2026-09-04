package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityInviteCodeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f118107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f118108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f118113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f118114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f118115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f118116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118124r;

    private z0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 Guideline guideline3, @androidx.annotation.n0 Guideline guideline4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f118107a = constraintLayout;
        this.f118108b = constraintLayout2;
        this.f118109c = editText;
        this.f118110d = imageView;
        this.f118111e = imageView2;
        this.f118112f = imageView3;
        this.f118113g = guideline;
        this.f118114h = guideline2;
        this.f118115i = guideline3;
        this.f118116j = guideline4;
        this.f118117k = textView;
        this.f118118l = textView2;
        this.f118119m = textView3;
        this.f118120n = textView4;
        this.f118121o = textView5;
        this.f118122p = textView6;
        this.f118123q = view;
        this.f118124r = linearLayout;
    }

    @androidx.annotation.n0
    public static z0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16444, new Class[]{View.class}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.et_invite_code;
        EditText editText = (EditText) l3.d.a(view, R.id.et_invite_code);
        if (editText != null) {
            i10 = R.id.ib_icon_back;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.ib_icon_back);
            if (imageView != null) {
                i10 = R.id.iv_bottom_logo;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
                if (imageView2 != null) {
                    i10 = R.id.iv_del;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_del);
                    if (imageView3 != null) {
                        i10 = R.id.line_et_bottom;
                        Guideline guideline = (Guideline) l3.d.a(view, R.id.line_et_bottom);
                        if (guideline != null) {
                            i10 = R.id.line_et_number_bottom;
                            Guideline guideline2 = (Guideline) l3.d.a(view, R.id.line_et_number_bottom);
                            if (guideline2 != null) {
                                i10 = R.id.line_et_number_right;
                                Guideline guideline3 = (Guideline) l3.d.a(view, R.id.line_et_number_right);
                                if (guideline3 != null) {
                                    i10 = R.id.line_et_top;
                                    Guideline guideline4 = (Guideline) l3.d.a(view, R.id.line_et_top);
                                    if (guideline4 != null) {
                                        i10 = R.id.tv_action;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                                        if (textView != null) {
                                            i10 = R.id.tv_error_message;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_error_message);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_number;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_number);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_rules;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_rules);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_skip;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_skip);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_title;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                                            if (textView6 != null) {
                                                                i10 = R.id.v_et_line;
                                                                View viewA = l3.d.a(view, R.id.v_et_line);
                                                                if (viewA != null) {
                                                                    i10 = R.id.vg_bg;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                                                                    if (linearLayout != null) {
                                                                        return new z0(constraintLayout, constraintLayout, editText, imageView, imageView2, imageView3, guideline, guideline2, guideline3, guideline4, textView, textView2, textView3, textView4, textView5, textView6, viewA, linearLayout);
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
    public static z0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16442, new Class[]{LayoutInflater.class}, z0.class);
        return patchProxyResultProxy.isSupported ? (z0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16443, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z0.class);
        if (patchProxyResultProxy.isSupported) {
            return (z0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_invite_code, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f118107a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16445, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
