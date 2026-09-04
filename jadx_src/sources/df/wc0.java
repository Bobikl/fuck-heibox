package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MaxIncludeLoginWebBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f117135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117138f;

    private wc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117133a = relativeLayout;
        this.f117134b = linearLayout;
        this.f117135c = button;
        this.f117136d = editText;
        this.f117137e = editText2;
        this.f117138f = linearLayout2;
    }

    @androidx.annotation.n0
    public static wc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21401, new Class[]{View.class}, wc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.activePart;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.activePart);
        if (linearLayout != null) {
            i10 = R.id.bt_click_login;
            Button button = (Button) l3.d.a(view, R.id.bt_click_login);
            if (button != null) {
                i10 = R.id.et_number;
                EditText editText = (EditText) l3.d.a(view, R.id.et_number);
                if (editText != null) {
                    i10 = R.id.et_pwd;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_pwd);
                    if (editText2 != null) {
                        i10 = R.id.ll_number;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_number);
                        if (linearLayout2 != null) {
                            return new wc0((RelativeLayout) view, linearLayout, button, editText, editText2, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21399, new Class[]{LayoutInflater.class}, wc0.class);
        return patchProxyResultProxy.isSupported ? (wc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21400, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.max_include_login_web, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117133a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21402, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
