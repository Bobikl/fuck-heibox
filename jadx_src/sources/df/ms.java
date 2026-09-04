package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlatformBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ms implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113520e;

    private ms(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f113516a = cardView;
        this.f113517b = cardView2;
        this.f113518c = imageView;
        this.f113519d = textView;
        this.f113520e = linearLayout;
    }

    @androidx.annotation.n0
    public static ms a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19300, new Class[]{View.class}, ms.class);
        if (patchProxyResultProxy.isSupported) {
            return (ms) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.tv_name;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
            if (textView != null) {
                i10 = R.id.vg_drag;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_drag);
                if (linearLayout != null) {
                    return new ms(cardView, cardView, imageView, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ms c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19298, new Class[]{LayoutInflater.class}, ms.class);
        return patchProxyResultProxy.isSupported ? (ms) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ms d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19299, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ms.class);
        if (patchProxyResultProxy.isSupported) {
            return (ms) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_platform, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113516a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19301, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
