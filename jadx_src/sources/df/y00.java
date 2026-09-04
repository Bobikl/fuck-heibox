package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.flyco.tablayout.widget.MsgView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserMsgMenuBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final MsgView f117695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117697d;

    private y00(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 MsgView msgView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f117694a = relativeLayout;
        this.f117695b = msgView;
        this.f117696c = imageView;
        this.f117697d = textView;
    }

    @androidx.annotation.n0
    public static y00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20172, new Class[]{View.class}, y00.class);
        if (patchProxyResultProxy.isSupported) {
            return (y00) patchProxyResultProxy.result;
        }
        int i10 = R.id.badge;
        MsgView msgView = (MsgView) l3.d.a(view, R.id.badge);
        if (msgView != null) {
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView != null) {
                    return new y00((RelativeLayout) view, msgView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20170, new Class[]{LayoutInflater.class}, y00.class);
        return patchProxyResultProxy.isSupported ? (y00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20171, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y00.class);
        if (patchProxyResultProxy.isSupported) {
            return (y00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_msg_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117694a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20173, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
