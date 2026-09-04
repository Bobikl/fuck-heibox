package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.hbcommon.component.ExpandMoreButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameDetailOfficialReplyCommentTipBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f115622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpandMoreButton f115623b;

    private sf0(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ExpandMoreButton expandMoreButton) {
        this.f115622a = frameLayout;
        this.f115623b = expandMoreButton;
    }

    @androidx.annotation.n0
    public static sf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21694, new Class[]{View.class}, sf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sf0) patchProxyResultProxy.result;
        }
        ExpandMoreButton expandMoreButton = (ExpandMoreButton) l3.d.a(view, R.id.emb);
        if (expandMoreButton != null) {
            return new sf0((FrameLayout) view, expandMoreButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.emb)));
    }

    @androidx.annotation.n0
    public static sf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21692, new Class[]{LayoutInflater.class}, sf0.class);
        return patchProxyResultProxy.isSupported ? (sf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21693, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (sf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_detail_official_reply_comment_tip, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f115622a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21695, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
