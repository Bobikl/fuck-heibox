package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameReleaseDateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wm implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117216c;

    private wm(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f117214a = relativeLayout;
        this.f117215b = textView;
        this.f117216c = textView2;
    }

    @androidx.annotation.n0
    public static wm a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18716, new Class[]{View.class}, wm.class);
        if (patchProxyResultProxy.isSupported) {
            return (wm) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_cnt;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_cnt);
        if (textView != null) {
            i10 = R.id.tv_date;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_date);
            if (textView2 != null) {
                return new wm((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wm c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18714, new Class[]{LayoutInflater.class}, wm.class);
        return patchProxyResultProxy.isSupported ? (wm) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wm d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18715, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wm.class);
        if (patchProxyResultProxy.isSupported) {
            return (wm) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_release_date, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117214a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18717, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
