package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowMoreCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class od0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpandMoreButton f114202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114204d;

    private od0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ExpandMoreButton expandMoreButton, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 View view) {
        this.f114201a = relativeLayout;
        this.f114202b = expandMoreButton;
        this.f114203c = relativeLayout2;
        this.f114204d = view;
    }

    @androidx.annotation.n0
    public static od0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21472, new Class[]{View.class}, od0.class);
        if (patchProxyResultProxy.isSupported) {
            return (od0) patchProxyResultProxy.result;
        }
        int i10 = R.id.emb;
        ExpandMoreButton expandMoreButton = (ExpandMoreButton) l3.d.a(view, R.id.emb);
        if (expandMoreButton != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            View viewA = l3.d.a(view, R.id.v_divider);
            if (viewA != null) {
                return new od0(relativeLayout, expandMoreButton, relativeLayout, viewA);
            }
            i10 = R.id.v_divider;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static od0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21470, new Class[]{LayoutInflater.class}, od0.class);
        return patchProxyResultProxy.isSupported ? (od0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static od0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21471, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, od0.class);
        if (patchProxyResultProxy.isSupported) {
            return (od0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_more_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114201a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21473, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
