package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.PinEntryEditText;
import com.max.hbview.AutoOffsettingBackgroundLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityLoginBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final TextView A;

    @androidx.annotation.n0
    public final TextView B;

    @androidx.annotation.n0
    public final TextView C;

    @androidx.annotation.n0
    public final View D;

    @androidx.annotation.n0
    public final View E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final t70 G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final FrameLayout I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final AutoOffsettingBackgroundLayout f109952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f109953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f109954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f109958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109960j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109961k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109962l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final PinEntryEditText f109970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109971u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109972v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109976z;

    private e1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 Group group, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 Guideline guideline3, @androidx.annotation.n0 Guideline guideline4, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 PinEntryEditText pinEntryEditText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 View view3, @androidx.annotation.n0 View view4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 t70 t70Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f109951a = constraintLayout;
        this.f109952b = autoOffsettingBackgroundLayout;
        this.f109953c = checkBox;
        this.f109954d = constraintLayout2;
        this.f109955e = editText;
        this.f109956f = editText2;
        this.f109957g = editText3;
        this.f109958h = group;
        this.f109959i = imageView;
        this.f109960j = imageView2;
        this.f109961k = imageView3;
        this.f109962l = imageView4;
        this.f109963m = imageView5;
        this.f109964n = guideline;
        this.f109965o = guideline2;
        this.f109966p = guideline3;
        this.f109967q = guideline4;
        this.f109968r = view;
        this.f109969s = view2;
        this.f109970t = pinEntryEditText;
        this.f109971u = textView;
        this.f109972v = textView2;
        this.f109973w = textView3;
        this.f109974x = textView4;
        this.f109975y = textView5;
        this.f109976z = textView6;
        this.A = textView7;
        this.B = textView8;
        this.C = textView9;
        this.D = view3;
        this.E = view4;
        this.F = linearLayout;
        this.G = t70Var;
        this.H = linearLayout2;
        this.I = frameLayout;
    }

    @androidx.annotation.n0
    public static e1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16464, new Class[]{View.class}, e1.class);
        if (patchProxyResultProxy.isSupported) {
            return (e1) patchProxyResultProxy.result;
        }
        int i10 = R.id.auto_offset_background;
        AutoOffsettingBackgroundLayout autoOffsettingBackgroundLayout = (AutoOffsettingBackgroundLayout) l3.d.a(view, R.id.auto_offset_background);
        if (autoOffsettingBackgroundLayout != null) {
            i10 = R.id.cb_privacy;
            CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_privacy);
            if (checkBox != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.et_invite_code;
                EditText editText = (EditText) l3.d.a(view, R.id.et_invite_code);
                if (editText != null) {
                    i10 = R.id.et_number;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_number);
                    if (editText2 != null) {
                        i10 = R.id.et_pwd;
                        EditText editText3 = (EditText) l3.d.a(view, R.id.et_pwd);
                        if (editText3 != null) {
                            i10 = R.id.group_invite_code;
                            Group group = (Group) l3.d.a(view, R.id.group_invite_code);
                            if (group != null) {
                                i10 = R.id.ib_icon_back;
                                ImageView imageView = (ImageView) l3.d.a(view, R.id.ib_icon_back);
                                if (imageView != null) {
                                    i10 = R.id.iv_area_code_arrow;
                                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_area_code_arrow);
                                    if (imageView2 != null) {
                                        i10 = R.id.iv_bottom_logo;
                                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_bottom_logo);
                                        if (imageView3 != null) {
                                            i10 = R.id.iv_del;
                                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_del);
                                            if (imageView4 != null) {
                                                i10 = R.id.iv_tips_privacy;
                                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_tips_privacy);
                                                if (imageView5 != null) {
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
                                                                    i10 = R.id.line_guide_privacy;
                                                                    View viewA = l3.d.a(view, R.id.line_guide_privacy);
                                                                    if (viewA != null) {
                                                                        i10 = R.id.mask_background;
                                                                        View viewA2 = l3.d.a(view, R.id.mask_background);
                                                                        if (viewA2 != null) {
                                                                            i10 = R.id.pet_verification_code;
                                                                            PinEntryEditText pinEntryEditText = (PinEntryEditText) l3.d.a(view, R.id.pet_verification_code);
                                                                            if (pinEntryEditText != null) {
                                                                                i10 = R.id.tv_action;
                                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.tv_area_code;
                                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_area_code);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.tv_error_message;
                                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_error_message);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.tv_forget_pwd;
                                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_forget_pwd);
                                                                                            if (textView4 != null) {
                                                                                                i10 = R.id.tv_number;
                                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_number);
                                                                                                if (textView5 != null) {
                                                                                                    i10 = R.id.tv_privacy;
                                                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_privacy);
                                                                                                    if (textView6 != null) {
                                                                                                        i10 = R.id.tv_title;
                                                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                                                        if (textView7 != null) {
                                                                                                            i10 = R.id.tv_toggle_login;
                                                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_toggle_login);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.tv_wechat_login;
                                                                                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_wechat_login);
                                                                                                                if (textView9 != null) {
                                                                                                                    i10 = R.id.v_et_line;
                                                                                                                    View viewA3 = l3.d.a(view, R.id.v_et_line);
                                                                                                                    if (viewA3 != null) {
                                                                                                                        i10 = R.id.v_invite_line;
                                                                                                                        View viewA4 = l3.d.a(view, R.id.v_invite_line);
                                                                                                                        if (viewA4 != null) {
                                                                                                                            i10 = R.id.vg_area_code;
                                                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_area_code);
                                                                                                                            if (linearLayout != null) {
                                                                                                                                i10 = R.id.vg_login_way;
                                                                                                                                View viewA5 = l3.d.a(view, R.id.vg_login_way);
                                                                                                                                if (viewA5 != null) {
                                                                                                                                    t70 t70VarA = t70.a(viewA5);
                                                                                                                                    i10 = R.id.vg_privacy;
                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_privacy);
                                                                                                                                    if (linearLayout2 != null) {
                                                                                                                                        i10 = R.id.vg_privacy_check;
                                                                                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_privacy_check);
                                                                                                                                        if (frameLayout != null) {
                                                                                                                                            return new e1(constraintLayout, autoOffsettingBackgroundLayout, checkBox, constraintLayout, editText, editText2, editText3, group, imageView, imageView2, imageView3, imageView4, imageView5, guideline, guideline2, guideline3, guideline4, viewA, viewA2, pinEntryEditText, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewA3, viewA4, linearLayout, t70VarA, linearLayout2, frameLayout);
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
    public static e1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16462, new Class[]{LayoutInflater.class}, e1.class);
        return patchProxyResultProxy.isSupported ? (e1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16463, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e1.class);
        if (patchProxyResultProxy.isSupported) {
            return (e1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109951a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16465, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
