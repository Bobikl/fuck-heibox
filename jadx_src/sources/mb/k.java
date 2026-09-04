package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogEventLogConfigBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f131595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f131596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f131599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f131600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f131608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131609p;

    private k(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 RadioButton radioButton3, @androidx.annotation.n0 RadioGroup radioGroup, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f131594a = linearLayout;
        this.f131595b = editText;
        this.f131596c = editText2;
        this.f131597d = radioButton;
        this.f131598e = radioButton2;
        this.f131599f = radioButton3;
        this.f131600g = radioGroup;
        this.f131601h = textView;
        this.f131602i = textView2;
        this.f131603j = textView3;
        this.f131604k = textView4;
        this.f131605l = textView5;
        this.f131606m = textView6;
        this.f131607n = textView7;
        this.f131608o = view;
        this.f131609p = linearLayout2;
    }

    @androidx.annotation.n0
    public static k a(@androidx.annotation.n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31885l6, new Class[]{View.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_event_desc;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.et_event_id;
            EditText editText2 = (EditText) l3.d.a(view, i10);
            if (editText2 != null) {
                i10 = R.id.rb_type_click;
                RadioButton radioButton = (RadioButton) l3.d.a(view, i10);
                if (radioButton != null) {
                    i10 = R.id.rb_type_duration;
                    RadioButton radioButton2 = (RadioButton) l3.d.a(view, i10);
                    if (radioButton2 != null) {
                        i10 = R.id.rb_type_show;
                        RadioButton radioButton3 = (RadioButton) l3.d.a(view, i10);
                        if (radioButton3 != null) {
                            i10 = R.id.rg_event_type;
                            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, i10);
                            if (radioGroup != null) {
                                i10 = R.id.tv_cancel;
                                TextView textView = (TextView) l3.d.a(view, i10);
                                if (textView != null) {
                                    i10 = R.id.tv_confirm;
                                    TextView textView2 = (TextView) l3.d.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_copy_key;
                                        TextView textView3 = (TextView) l3.d.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_copy_key2;
                                            TextView textView4 = (TextView) l3.d.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_event_type;
                                                TextView textView5 = (TextView) l3.d.a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = R.id.tv_screen;
                                                    TextView textView6 = (TextView) l3.d.a(view, i10);
                                                    if (textView6 != null) {
                                                        i10 = R.id.tv_view;
                                                        TextView textView7 = (TextView) l3.d.a(view, i10);
                                                        if (textView7 != null && (viewA = l3.d.a(view, (i10 = R.id.v_btn_divider))) != null) {
                                                            i10 = R.id.vg_button_panel;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                            if (linearLayout != null) {
                                                                return new k((LinearLayout) view, editText, editText2, radioButton, radioButton2, radioButton3, radioGroup, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewA, linearLayout);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static k c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31851j6, new Class[]{LayoutInflater.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31868k6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_event_log_config, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131594a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31902m6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
