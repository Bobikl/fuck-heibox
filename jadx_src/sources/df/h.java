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

/* JADX INFO: compiled from: ActivityBindPhoneBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111139k;

    private h(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 EditText editText4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111129a = relativeLayout;
        this.f111130b = editText;
        this.f111131c = editText2;
        this.f111132d = editText3;
        this.f111133e = editText4;
        this.f111134f = linearLayout;
        this.f111135g = textView;
        this.f111136h = textView2;
        this.f111137i = textView3;
        this.f111138j = linearLayout2;
        this.f111139k = linearLayout3;
    }

    @androidx.annotation.n0
    public static h a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16268, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_code;
        EditText editText = (EditText) l3.d.a(view, R.id.et_code);
        if (editText != null) {
            i10 = R.id.et_confirm;
            EditText editText2 = (EditText) l3.d.a(view, R.id.et_confirm);
            if (editText2 != null) {
                i10 = R.id.et_phone;
                EditText editText3 = (EditText) l3.d.a(view, R.id.et_phone);
                if (editText3 != null) {
                    i10 = R.id.et_pwd;
                    EditText editText4 = (EditText) l3.d.a(view, R.id.et_pwd);
                    if (editText4 != null) {
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
                                                return new h((RelativeLayout) view, editText, editText2, editText3, editText4, linearLayout, textView, textView2, textView3, linearLayout2, linearLayout3);
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
    public static h c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16266, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16267, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_bind_phone, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111129a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16269, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
