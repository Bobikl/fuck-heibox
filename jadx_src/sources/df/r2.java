package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityTradeAssistantBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MarqueeTextView f115045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f115046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115047d;

    private r2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 MarqueeTextView marqueeTextView, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f115044a = linearLayout;
        this.f115045b = marqueeTextView;
        this.f115046c = qVar;
        this.f115047d = frameLayout;
    }

    @androidx.annotation.n0
    public static r2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16620, new Class[]{View.class}, r2.class);
        if (patchProxyResultProxy.isSupported) {
            return (r2) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_message;
        MarqueeTextView marqueeTextView = (MarqueeTextView) l3.d.a(view, R.id.tv_message);
        if (marqueeTextView != null) {
            i10 = R.id.vg_invntory_empty;
            View viewA = l3.d.a(view, R.id.vg_invntory_empty);
            if (viewA != null) {
                mb.q qVarA = mb.q.a(viewA);
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_message);
                if (frameLayout != null) {
                    return new r2((LinearLayout) view, marqueeTextView, qVarA, frameLayout);
                }
                i10 = R.id.vg_message;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16618, new Class[]{LayoutInflater.class}, r2.class);
        return patchProxyResultProxy.isSupported ? (r2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16619, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r2.class);
        if (patchProxyResultProxy.isSupported) {
            return (r2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_trade_assistant, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115044a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16621, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
