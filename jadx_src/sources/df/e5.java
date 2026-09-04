package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentLinkEditBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f110033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f110034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Button f110035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f110036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f110038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f110040h;

    private e5(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 Button button, @androidx.annotation.n0 Button button2, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view) {
        this.f110033a = frameLayout;
        this.f110034b = button;
        this.f110035c = button2;
        this.f110036d = constraintLayout;
        this.f110037e = editText;
        this.f110038f = editText2;
        this.f110039g = textView;
        this.f110040h = view;
    }

    @androidx.annotation.n0
    public static e5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16880, new Class[]{View.class}, e5.class);
        if (patchProxyResultProxy.isSupported) {
            return (e5) patchProxyResultProxy.result;
        }
        int i10 = R.id.btn_left;
        Button button = (Button) l3.d.a(view, R.id.btn_left);
        if (button != null) {
            i10 = R.id.btn_right;
            Button button2 = (Button) l3.d.a(view, R.id.btn_right);
            if (button2 != null) {
                i10 = R.id.dialog_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.dialog_content);
                if (constraintLayout != null) {
                    i10 = R.id.et_input_text;
                    EditText editText = (EditText) l3.d.a(view, R.id.et_input_text);
                    if (editText != null) {
                        i10 = R.id.et_input_url;
                        EditText editText2 = (EditText) l3.d.a(view, R.id.et_input_url);
                        if (editText2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView != null) {
                                i10 = R.id.v_input_background;
                                View viewA = l3.d.a(view, R.id.v_input_background);
                                if (viewA != null) {
                                    return new e5((FrameLayout) view, button, button2, constraintLayout, editText, editText2, textView, viewA);
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
    public static e5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16878, new Class[]{LayoutInflater.class}, e5.class);
        return patchProxyResultProxy.isSupported ? (e5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16879, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e5.class);
        if (patchProxyResultProxy.isSupported) {
            return (e5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_link_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f110033a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16881, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
