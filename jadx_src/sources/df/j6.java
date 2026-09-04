package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogRealNameAuthLandscapeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f112025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f112026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112033j;

    private j6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f112024a = relativeLayout;
        this.f112025b = checkBox;
        this.f112026c = cardView;
        this.f112027d = editText;
        this.f112028e = editText2;
        this.f112029f = relativeLayout2;
        this.f112030g = textView;
        this.f112031h = textView2;
        this.f112032i = linearLayout;
        this.f112033j = frameLayout;
    }

    @androidx.annotation.n0
    public static j6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17004, new Class[]{View.class}, j6.class);
        if (patchProxyResultProxy.isSupported) {
            return (j6) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_agreement;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_agreement);
        if (checkBox != null) {
            i10 = R.id.cv_bg;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_bg);
            if (cardView != null) {
                i10 = R.id.et_id_card;
                EditText editText = (EditText) l3.d.a(view, R.id.et_id_card);
                if (editText != null) {
                    i10 = R.id.et_name;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_name);
                    if (editText2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i10 = R.id.tv_agreement;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_agreement);
                        if (textView != null) {
                            i10 = R.id.tv_confirm;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm);
                            if (textView2 != null) {
                                i10 = R.id.vg_bottom_bar;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_checkbox;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_checkbox);
                                    if (frameLayout != null) {
                                        return new j6(relativeLayout, checkBox, cardView, editText, editText2, relativeLayout, textView, textView2, linearLayout, frameLayout);
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
    public static j6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17002, new Class[]{LayoutInflater.class}, j6.class);
        return patchProxyResultProxy.isSupported ? (j6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static j6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17003, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, j6.class);
        if (patchProxyResultProxy.isSupported) {
            return (j6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_real_name_auth_landscape, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112024a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17005, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
