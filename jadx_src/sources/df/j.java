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

/* JADX INFO: compiled from: ActivityChangePhoneBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111932l;

    private j(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111921a = relativeLayout;
        this.f111922b = editText;
        this.f111923c = editText2;
        this.f111924d = linearLayout;
        this.f111925e = textView;
        this.f111926f = textView2;
        this.f111927g = textView3;
        this.f111928h = textView4;
        this.f111929i = textView5;
        this.f111930j = linearLayout2;
        this.f111931k = relativeLayout2;
        this.f111932l = linearLayout3;
    }

    @androidx.annotation.n0
    public static j a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16276, new Class[]{View.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_code;
        EditText editText = (EditText) l3.d.a(view, R.id.et_code);
        if (editText != null) {
            i10 = R.id.et_new;
            EditText editText2 = (EditText) l3.d.a(view, R.id.et_new);
            if (editText2 != null) {
                i10 = R.id.ll_number;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_number);
                if (linearLayout != null) {
                    i10 = R.id.textView;
                    TextView textView = (TextView) l3.d.a(view, R.id.textView);
                    if (textView != null) {
                        i10 = R.id.tv_area_code;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_area_code);
                        if (textView2 != null) {
                            i10 = R.id.tv_current_account;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_current_account);
                            if (textView3 != null) {
                                i10 = R.id.tv_finish;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_finish);
                                if (textView4 != null) {
                                    i10 = R.id.tv_get_code;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_get_code);
                                    if (textView5 != null) {
                                        i10 = R.id.vg_area_code;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_area_code);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_current_account;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_current_account);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_new_phone;
                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_new_phone);
                                                if (linearLayout3 != null) {
                                                    return new j((RelativeLayout) view, editText, editText2, linearLayout, textView, textView2, textView3, textView4, textView5, linearLayout2, relativeLayout, linearLayout3);
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
    public static j c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16274, new Class[]{LayoutInflater.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16275, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_phone, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111921a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16277, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
