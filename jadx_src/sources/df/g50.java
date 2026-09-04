package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import org.android.spdy.SpdyProtocol;

/* JADX INFO: compiled from: LayoutForbidUserBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f110818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f110819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110820h;

    private g50(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioButton radioButton4, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 TextView textView) {
        this.f110813a = linearLayout;
        this.f110814b = editText;
        this.f110815c = radioButton;
        this.f110816d = radioButton2;
        this.f110817e = radioButton3;
        this.f110818f = radioButton4;
        this.f110819g = radioGroup;
        this.f110820h = textView;
    }

    @androidx.annotation.n0
    public static g50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, SpdyProtocol.L7E_SSSL_0RTT_HTTP2, new Class[]{View.class}, g50.class);
        if (patchProxyResultProxy.isSupported) {
            return (g50) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_forbid_comment;
        EditText editText = (EditText) l3.d.a(view, R.id.et_forbid_comment);
        if (editText != null) {
            i10 = R.id.rb_0;
            RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_0);
            if (radioButton != null) {
                i10 = R.id.rb_1;
                RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_1);
                if (radioButton2 != null) {
                    i10 = R.id.rb_2;
                    RadioButton radioButton3 = (RadioButton) l3.d.a(view, R.id.rb_2);
                    if (radioButton3 != null) {
                        i10 = R.id.rb_3;
                        RadioButton radioButton4 = (RadioButton) l3.d.a(view, R.id.rb_3);
                        if (radioButton4 != null) {
                            i10 = R.id.rg_forbid_time;
                            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.rg_forbid_time);
                            if (radioGroup != null) {
                                i10 = R.id.tv_forbid_time_remained;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_forbid_time_remained);
                                if (textView != null) {
                                    return new g50((LinearLayout) view, editText, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, textView);
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
    public static g50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20614, new Class[]{LayoutInflater.class}, g50.class);
        return patchProxyResultProxy.isSupported ? (g50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static g50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20615, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g50.class);
        if (patchProxyResultProxy.isSupported) {
            return (g50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_forbid_user, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110813a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20617, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
