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

/* JADX INFO: compiled from: ViewGameConsecutiveWinBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114882e;

    private qf0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114878a = relativeLayout;
        this.f114879b = imageView;
        this.f114880c = textView;
        this.f114881d = textView2;
        this.f114882e = linearLayout;
    }

    @androidx.annotation.n0
    public static qf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21686, new Class[]{View.class}, qf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_num;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_num);
                if (textView2 != null) {
                    i10 = R.id.vg_rect;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_rect);
                    if (linearLayout != null) {
                        return new qf0((RelativeLayout) view, imageView, textView, textView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21684, new Class[]{LayoutInflater.class}, qf0.class);
        return patchProxyResultProxy.isSupported ? (qf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21685, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (qf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_game_consecutive_win, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114878a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21687, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
