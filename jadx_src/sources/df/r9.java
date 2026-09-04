package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentItemWaitDeliverBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f115145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115146e;

    private r9(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f115142a = linearLayout;
        this.f115143b = editText;
        this.f115144c = imageView;
        this.f115145d = qVar;
        this.f115146e = relativeLayout;
    }

    @androidx.annotation.n0
    public static r9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17348, new Class[]{View.class}, r9.class);
        if (patchProxyResultProxy.isSupported) {
            return (r9) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_item_search;
        EditText editText = (EditText) l3.d.a(view, R.id.et_item_search);
        if (editText != null) {
            i10 = R.id.iv_del;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
            if (imageView != null) {
                i10 = R.id.vg_invntory_empty;
                View viewA = l3.d.a(view, R.id.vg_invntory_empty);
                if (viewA != null) {
                    mb.q qVarA = mb.q.a(viewA);
                    i10 = R.id.vg_search;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search);
                    if (relativeLayout != null) {
                        return new r9((LinearLayout) view, editText, imageView, qVarA, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17346, new Class[]{LayoutInflater.class}, r9.class);
        return patchProxyResultProxy.isSupported ? (r9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17347, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r9.class);
        if (patchProxyResultProxy.isSupported) {
            return (r9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_item_wait_deliver, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115142a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17349, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
