package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutTaskDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113380e;

    private mb0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113376a = relativeLayout;
        this.f113377b = recyclerView;
        this.f113378c = textView;
        this.f113379d = view;
        this.f113380e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static mb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21257, new Class[]{View.class}, mb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_dialog;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_dialog);
        if (recyclerView != null) {
            i10 = R.id.tv_dialog_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_dialog_title);
            if (textView != null) {
                i10 = R.id.v_out;
                View viewA = l3.d.a(view, R.id.v_out);
                if (viewA != null) {
                    i10 = R.id.vg_body;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_body);
                    if (relativeLayout != null) {
                        return new mb0((RelativeLayout) view, recyclerView, textView, viewA, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21255, new Class[]{LayoutInflater.class}, mb0.class);
        return patchProxyResultProxy.isSupported ? (mb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21256, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_task_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113376a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21258, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
