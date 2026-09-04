package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSuccessToastBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f112539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112540c;

    private kb0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 TextView textView) {
        this.f112538a = cardView;
        this.f112539b = shineButton;
        this.f112540c = textView;
    }

    @androidx.annotation.n0
    public static kb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21249, new Class[]{View.class}, kb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.shine_button;
        ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.shine_button);
        if (shineButton != null) {
            i10 = R.id.tv_toast_text;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_toast_text);
            if (textView != null) {
                return new kb0((CardView) view, shineButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21247, new Class[]{LayoutInflater.class}, kb0.class);
        return patchProxyResultProxy.isSupported ? (kb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21248, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_success_toast, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112538a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21250, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
