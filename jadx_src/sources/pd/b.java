package pd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbstory.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: StoryPictureBannerItemBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ImageView f138267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f138268b;

    private b(@n0 ImageView imageView, @n0 ImageView imageView2) {
        this.f138267a = imageView;
        this.f138268b = imageView2;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Ze, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new b(imageView, imageView);
    }

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Xe, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Ye, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.story_picture_banner_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ImageView b() {
        return this.f138267a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33436af, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
