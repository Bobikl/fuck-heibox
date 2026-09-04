package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNotificationBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class x0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f131824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f131825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131828e;

    private x0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f131824a = relativeLayout;
        this.f131825b = cardView;
        this.f131826c = imageView;
        this.f131827d = textView;
        this.f131828e = textView2;
    }

    @androidx.annotation.n0
    public static x0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f31854j9, new Class[]{View.class}, x0.class);
        if (patchProxyResultProxy.isSupported) {
            return (x0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_icon;
        CardView cardView = (CardView) l3.d.a(view, i10);
        if (cardView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.tv_msg;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    TextView textView2 = (TextView) l3.d.a(view, i10);
                    if (textView2 != null) {
                        return new x0((RelativeLayout) view, cardView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static x0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f31821h9, new Class[]{LayoutInflater.class}, x0.class);
        return patchProxyResultProxy.isSupported ? (x0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f31838i9, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x0.class);
        if (patchProxyResultProxy.isSupported) {
            return (x0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_notification, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f131824a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31871k9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
