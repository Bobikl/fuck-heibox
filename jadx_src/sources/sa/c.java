package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.component.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemComponentMethodBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f139357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final EditText f139358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final RadioButton f139359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final RadioButton f139360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RadioGroup f139361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f139362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f139363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f139364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f139365i;

    private c(@n0 RelativeLayout relativeLayout, @n0 EditText editText, @n0 RadioButton radioButton, @n0 RadioButton radioButton2, @n0 RadioGroup radioGroup, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout) {
        this.f139357a = relativeLayout;
        this.f139358b = editText;
        this.f139359c = radioButton;
        this.f139360d = radioButton2;
        this.f139361e = radioGroup;
        this.f139362f = textView;
        this.f139363g = textView2;
        this.f139364h = textView3;
        this.f139365i = linearLayout;
    }

    @n0
    public static c a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.ym, new Class[]{View.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_value;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.rb_false;
            RadioButton radioButton = (RadioButton) l3.d.a(view, i10);
            if (radioButton != null) {
                i10 = R.id.rb_true;
                RadioButton radioButton2 = (RadioButton) l3.d.a(view, i10);
                if (radioButton2 != null) {
                    i10 = R.id.f65397rg;
                    RadioGroup radioGroup = (RadioGroup) l3.d.a(view, i10);
                    if (radioGroup != null) {
                        i10 = R.id.tv_method_name;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_note;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_set;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.vg_name;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout != null) {
                                        return new c((RelativeLayout) view, editText, radioButton, radioButton2, radioGroup, textView, textView2, textView3, linearLayout);
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

    @n0
    public static c c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.b.wm, new Class[]{LayoutInflater.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static c d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.xm, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_component_method, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f139357a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.zm, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
