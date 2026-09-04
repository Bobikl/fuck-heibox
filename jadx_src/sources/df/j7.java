package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentBindPhoneBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112055i;

    private j7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f112047a = relativeLayout;
        this.f112048b = editText;
        this.f112049c = editText2;
        this.f112050d = linearLayout;
        this.f112051e = textView;
        this.f112052f = textView2;
        this.f112053g = textView3;
        this.f112054h = linearLayout2;
        this.f112055i = linearLayout3;
    }

    @androidx.annotation.n0
    public static j7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17108, new Class[]{View.class}, j7.class);
        if (patchProxyResultProxy.isSupported) {
            return (j7) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_code;
        EditText editText = (EditText) l3.d.a(view, R.id.et_code);
        if (editText != null) {
            i10 = R.id.et_phone;
            EditText editText2 = (EditText) l3.d.a(view, R.id.et_phone);
            if (editText2 != null) {
                i10 = R.id.ll_number;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_number);
                if (linearLayout != null) {
                    i10 = R.id.tv_area_code;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_area_code);
                    if (textView != null) {
                        i10 = R.id.tv_finish;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_finish);
                        if (textView2 != null) {
                            i10 = R.id.tv_get_code;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_get_code);
                            if (textView3 != null) {
                                i10 = R.id.vg_area_code;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_area_code);
                                if (linearLayout2 != null) {
                                    i10 = R.id.vg_phone;
                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_phone);
                                    if (linearLayout3 != null) {
                                        return new j7((RelativeLayout) view, editText, editText2, linearLayout, textView, textView2, textView3, linearLayout2, linearLayout3);
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
    public static j7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17106, new Class[]{LayoutInflater.class}, j7.class);
        return patchProxyResultProxy.isSupported ? (j7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17107, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j7.class);
        if (patchProxyResultProxy.isSupported) {
            return (j7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bind_phone, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112047a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17109, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
