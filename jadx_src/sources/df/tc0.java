package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MaxIncludeFindpwdThreeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f115965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115971i;

    private tc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 TextView textView) {
        this.f115963a = relativeLayout;
        this.f115964b = linearLayout;
        this.f115965c = button;
        this.f115966d = oVar;
        this.f115967e = editText;
        this.f115968f = editText2;
        this.f115969g = relativeLayout2;
        this.f115970h = relativeLayout3;
        this.f115971i = textView;
    }

    @androidx.annotation.n0
    public static tc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21389, new Class[]{View.class}, tc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.activePart;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.activePart);
        if (linearLayout != null) {
            i10 = R.id.bt_submit;
            Button button = (Button) l3.d.a(view, R.id.bt_submit);
            if (button != null) {
                i10 = R.id.divider;
                View viewA = l3.d.a(view, R.id.divider);
                if (viewA != null) {
                    mb.o oVarA = mb.o.a(viewA);
                    i10 = R.id.et_pwd;
                    EditText editText = (EditText) l3.d.a(view, R.id.et_pwd);
                    if (editText != null) {
                        i10 = R.id.et_pwd_again;
                        EditText editText2 = (EditText) l3.d.a(view, R.id.et_pwd_again);
                        if (editText2 != null) {
                            i10 = R.id.rl_set_pwd;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_set_pwd);
                            if (relativeLayout != null) {
                                i10 = R.id.rl_set_pwd_again;
                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.rl_set_pwd_again);
                                if (relativeLayout2 != null) {
                                    i10 = R.id.tv_set_pwd;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_set_pwd);
                                    if (textView != null) {
                                        return new tc0((RelativeLayout) view, linearLayout, button, oVarA, editText, editText2, relativeLayout, relativeLayout2, textView);
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
    public static tc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21387, new Class[]{LayoutInflater.class}, tc0.class);
        return patchProxyResultProxy.isSupported ? (tc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21388, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.max_include_findpwd_three, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115963a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21390, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
