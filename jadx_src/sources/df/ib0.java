package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSubscribeGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ib0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f111750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f111751c;

    private ib0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 EditText editText) {
        this.f111749a = linearLayout;
        this.f111750b = checkBox;
        this.f111751c = editText;
    }

    @androidx.annotation.n0
    public static ib0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21241, new Class[]{View.class}, ib0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ib0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_check;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_check);
        if (checkBox != null) {
            i10 = R.id.et_number;
            EditText editText = (EditText) l3.d.a(view, R.id.et_number);
            if (editText != null) {
                return new ib0((LinearLayout) view, checkBox, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ib0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21239, new Class[]{LayoutInflater.class}, ib0.class);
        return patchProxyResultProxy.isSupported ? (ib0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ib0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21240, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ib0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ib0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_subscribe_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111749a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21242, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
