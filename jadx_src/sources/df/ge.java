package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBottomEditorButtonBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ge implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f110952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110953d;

    private ge(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 TextView textView) {
        this.f110950a = linearLayout;
        this.f110951b = imageView;
        this.f110952c = shineButton;
        this.f110953d = textView;
    }

    @androidx.annotation.n0
    public static ge a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17824, new Class[]{View.class}, ge.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge) patchProxyResultProxy.result;
        }
        int i10 = R.id.img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.img);
        if (imageView != null) {
            i10 = R.id.shine_button;
            ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.shine_button);
            if (shineButton != null) {
                i10 = R.id.text;
                TextView textView = (TextView) l3.d.a(view, R.id.text);
                if (textView != null) {
                    return new ge((LinearLayout) view, imageView, shineButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ge c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17822, new Class[]{LayoutInflater.class}, ge.class);
        return patchProxyResultProxy.isSupported ? (ge) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ge d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17823, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ge.class);
        if (patchProxyResultProxy.isSupported) {
            return (ge) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_bottom_editor_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110950a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17825, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
