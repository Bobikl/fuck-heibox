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

/* JADX INFO: compiled from: MaxIncludeFindpwdOneBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f115597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115599e;

    private sc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f115595a = relativeLayout;
        this.f115596b = linearLayout;
        this.f115597c = button;
        this.f115598d = editText;
        this.f115599e = linearLayout2;
    }

    @androidx.annotation.n0
    public static sc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21385, new Class[]{View.class}, sc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.activePart;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.activePart);
        if (linearLayout != null) {
            i10 = R.id.bt_submit;
            Button button = (Button) l3.d.a(view, R.id.bt_submit);
            if (button != null) {
                i10 = R.id.et_number;
                EditText editText = (EditText) l3.d.a(view, R.id.et_number);
                if (editText != null) {
                    i10 = R.id.ll_number;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_number);
                    if (linearLayout2 != null) {
                        return new sc0((RelativeLayout) view, linearLayout, button, editText, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static sc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21383, new Class[]{LayoutInflater.class}, sc0.class);
        return patchProxyResultProxy.isSupported ? (sc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21384, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.max_include_findpwd_one, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115595a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21386, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
