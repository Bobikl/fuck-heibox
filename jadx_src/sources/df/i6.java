package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogRealNameAuthBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f111645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111653j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111654k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111656m;

    private i6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f111644a = relativeLayout;
        this.f111645b = checkBox;
        this.f111646c = editText;
        this.f111647d = editText2;
        this.f111648e = imageView;
        this.f111649f = textView;
        this.f111650g = textView2;
        this.f111651h = textView3;
        this.f111652i = textView4;
        this.f111653j = textView5;
        this.f111654k = frameLayout;
        this.f111655l = linearLayout;
        this.f111656m = frameLayout2;
    }

    @androidx.annotation.n0
    public static i6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17000, new Class[]{View.class}, i6.class);
        if (patchProxyResultProxy.isSupported) {
            return (i6) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_agreement;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_agreement);
        if (checkBox != null) {
            i10 = R.id.et_id_card;
            EditText editText = (EditText) l3.d.a(view, R.id.et_id_card);
            if (editText != null) {
                i10 = R.id.et_name;
                EditText editText2 = (EditText) l3.d.a(view, R.id.et_name);
                if (editText2 != null) {
                    i10 = R.id.iv_avatar;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
                    if (imageView != null) {
                        i10 = R.id.tv_agreement;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_agreement);
                        if (textView != null) {
                            i10 = R.id.tv_auth_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_auth_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_confirm;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                if (textView3 != null) {
                                    i10 = R.id.tv_faq;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_faq);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_tips;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_tips);
                                        if (textView5 != null) {
                                            i10 = R.id.vg_bg;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                            if (frameLayout != null) {
                                                i10 = R.id.vg_bottom_bar;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_checkbox;
                                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_checkbox);
                                                    if (frameLayout2 != null) {
                                                        return new i6((RelativeLayout) view, checkBox, editText, editText2, imageView, textView, textView2, textView3, textView4, textView5, frameLayout, linearLayout, frameLayout2);
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
    public static i6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16998, new Class[]{LayoutInflater.class}, i6.class);
        return patchProxyResultProxy.isSupported ? (i6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16999, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i6.class);
        if (patchProxyResultProxy.isSupported) {
            return (i6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_real_name_auth, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111644a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17001, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
