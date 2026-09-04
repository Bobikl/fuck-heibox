package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityStrangerMsgSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112814d;

    private l2(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView) {
        this.f112811a = linearLayout;
        this.f112812b = imageView;
        this.f112813c = relativeLayout;
        this.f112814d = textView;
    }

    @androidx.annotation.n0
    public static l2 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16596, new Class[]{View.class}, l2.class);
        if (patchProxyResultProxy.isSupported) {
            return (l2) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_level_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_level_arrow);
        if (imageView != null) {
            i10 = R.id.rl_msg_level;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_msg_level);
            if (relativeLayout != null) {
                i10 = R.id.tv_level;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_level);
                if (textView != null) {
                    return new l2((LinearLayout) view, imageView, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l2 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16594, new Class[]{LayoutInflater.class}, l2.class);
        return patchProxyResultProxy.isSupported ? (l2) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l2 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16595, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l2.class);
        if (patchProxyResultProxy.isSupported) {
            return (l2) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_stranger_msg_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112811a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16597, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
