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

/* JADX INFO: compiled from: ActivityUpdatePwdBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f108333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f108334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f108335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f108336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f108337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108341j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108342k;

    private a3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108332a = relativeLayout;
        this.f108333b = button;
        this.f108334c = oVar;
        this.f108335d = editText;
        this.f108336e = editText2;
        this.f108337f = editText3;
        this.f108338g = linearLayout;
        this.f108339h = textView;
        this.f108340i = textView2;
        this.f108341j = relativeLayout2;
        this.f108342k = linearLayout2;
    }

    @androidx.annotation.n0
    public static a3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16656, new Class[]{View.class}, a3.class);
        if (patchProxyResultProxy.isSupported) {
            return (a3) patchProxyResultProxy.result;
        }
        int i10 = R.id.bt_update_pwd;
        Button button = (Button) l3.d.a(view, R.id.bt_update_pwd);
        if (button != null) {
            i10 = R.id.divider_old;
            View viewA = l3.d.a(view, R.id.divider_old);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.et_new;
                EditText editText = (EditText) l3.d.a(view, R.id.et_new);
                if (editText != null) {
                    i10 = R.id.et_old;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_old);
                    if (editText2 != null) {
                        i10 = R.id.et_renew;
                        EditText editText3 = (EditText) l3.d.a(view, R.id.et_renew);
                        if (editText3 != null) {
                            i10 = R.id.ll_number;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_number);
                            if (linearLayout != null) {
                                i10 = R.id.textView;
                                TextView textView = (TextView) l3.d.a(view, R.id.textView);
                                if (textView != null) {
                                    i10 = R.id.tv_current_account;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_account);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_current_account;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_current_account);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_old;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_old);
                                            if (linearLayout2 != null) {
                                                return new a3((RelativeLayout) view, button, oVarA, editText, editText2, editText3, linearLayout, textView, textView2, relativeLayout, linearLayout2);
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
    public static a3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16654, new Class[]{LayoutInflater.class}, a3.class);
        return patchProxyResultProxy.isSupported ? (a3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16655, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a3.class);
        if (patchProxyResultProxy.isSupported) {
            return (a3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_update_pwd, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108332a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16657, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
