package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemActivityDetailBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class u implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131774c;

    private u(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f131772a = constraintLayout;
        this.f131773b = textView;
        this.f131774c = linearLayout;
    }

    @androidx.annotation.n0
    public static u a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.X6, new Class[]{View.class}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_text;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.vg_more;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
            if (linearLayout != null) {
                return new u((ConstraintLayout) view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.V6, new Class[]{LayoutInflater.class}, u.class);
        return patchProxyResultProxy.isSupported ? (u) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.W6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u.class);
        if (patchProxyResultProxy.isSupported) {
            return (u) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_activity_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131772a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Y6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
