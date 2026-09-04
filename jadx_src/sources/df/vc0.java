package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MaxIncludeLoginBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f116782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f116783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f116785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116794o;

    private vc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f116780a = relativeLayout;
        this.f116781b = linearLayout;
        this.f116782c = button;
        this.f116783d = checkBox;
        this.f116784e = editText;
        this.f116785f = editText2;
        this.f116786g = imageView;
        this.f116787h = imageView2;
        this.f116788i = linearLayout2;
        this.f116789j = linearLayout3;
        this.f116790k = linearLayout4;
        this.f116791l = textView;
        this.f116792m = textView2;
        this.f116793n = linearLayout5;
        this.f116794o = linearLayout6;
    }

    @androidx.annotation.n0
    public static vc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21397, new Class[]{View.class}, vc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.activePart;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.activePart);
        if (linearLayout != null) {
            i10 = R.id.bt_click_login;
            Button button = (Button) l3.d.a(view, R.id.bt_click_login);
            if (button != null) {
                i10 = R.id.ck_agreement;
                CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.ck_agreement);
                if (checkBox != null) {
                    i10 = R.id.et_number;
                    EditText editText = (EditText) l3.d.a(view, R.id.et_number);
                    if (editText != null) {
                        i10 = R.id.et_pwd;
                        EditText editText2 = (EditText) l3.d.a(view, R.id.et_pwd);
                        if (editText2 != null) {
                            i10 = R.id.iv_login_by_web;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_login_by_web);
                            if (imageView != null) {
                                i10 = R.id.iv_login_by_weixin;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_login_by_weixin);
                                if (imageView2 != null) {
                                    i10 = R.id.ll_agreement;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_agreement);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.ll_number;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.ll_number);
                                        if (linearLayout3 != null) {
                                            i10 = R.id.ll_third_party_login;
                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.ll_third_party_login);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.tv_agreement;
                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_agreement);
                                                if (textView != null) {
                                                    i10 = R.id.tv_find_pwd;
                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_find_pwd);
                                                    if (textView2 != null) {
                                                        i10 = R.id.vg_login_by_web;
                                                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_login_by_web);
                                                        if (linearLayout5 != null) {
                                                            i10 = R.id.vg_login_by_weixin;
                                                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_login_by_weixin);
                                                            if (linearLayout6 != null) {
                                                                return new vc0((RelativeLayout) view, linearLayout, button, checkBox, editText, editText2, imageView, imageView2, linearLayout2, linearLayout3, linearLayout4, textView, textView2, linearLayout5, linearLayout6);
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
    public static vc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21395, new Class[]{LayoutInflater.class}, vc0.class);
        return patchProxyResultProxy.isSupported ? (vc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21396, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.max_include_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116780a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21398, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
