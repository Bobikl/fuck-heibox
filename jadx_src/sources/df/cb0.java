package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryFullscreenWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayoutCompat f109282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109284c;

    private cb0(@androidx.annotation.n0 LinearLayoutCompat linearLayoutCompat, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f109282a = linearLayoutCompat;
        this.f109283b = imageView;
        this.f109284c = textView;
    }

    @androidx.annotation.n0
    public static cb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21221, new Class[]{View.class}, cb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_full_screen_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.story_full_screen_icon);
        if (imageView != null) {
            i10 = R.id.story_full_screen_text;
            TextView textView = (TextView) l3.d.a(view, R.id.story_full_screen_text);
            if (textView != null) {
                return new cb0((LinearLayoutCompat) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static cb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21219, new Class[]{LayoutInflater.class}, cb0.class);
        return patchProxyResultProxy.isSupported ? (cb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21220, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (cb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_story_fullscreen_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayoutCompat b() {
        return this.f109282a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21222, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
