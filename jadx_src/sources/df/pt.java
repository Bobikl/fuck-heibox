package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcommon.component.NumberCheckView;
import com.max.mediaselector.lib.widget.MediumBoldTextView;
import com.max.mediaselector.lib.widget.SquareRelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPostToolsV2GalleryMediaBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SquareRelativeLayout f114607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final NumberCheckView f114609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final MediumBoldTextView f114611e;

    private pt(@androidx.annotation.n0 SquareRelativeLayout squareRelativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 NumberCheckView numberCheckView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 MediumBoldTextView mediumBoldTextView) {
        this.f114607a = squareRelativeLayout;
        this.f114608b = imageView;
        this.f114609c = numberCheckView;
        this.f114610d = textView;
        this.f114611e = mediumBoldTextView;
    }

    @androidx.annotation.n0
    public static pt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19412, new Class[]{View.class}, pt.class);
        if (patchProxyResultProxy.isSupported) {
            return (pt) patchProxyResultProxy.result;
        }
        int i10 = R.id.ivPicture;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.ivPicture);
        if (imageView != null) {
            i10 = R.id.ncv_check;
            NumberCheckView numberCheckView = (NumberCheckView) l3.d.a(view, R.id.ncv_check);
            if (numberCheckView != null) {
                i10 = R.id.tv_duration_v2;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_duration_v2);
                if (textView != null) {
                    i10 = R.id.tv_media_tag;
                    MediumBoldTextView mediumBoldTextView = (MediumBoldTextView) l3.d.a(view, R.id.tv_media_tag);
                    if (mediumBoldTextView != null) {
                        return new pt((SquareRelativeLayout) view, imageView, numberCheckView, textView, mediumBoldTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19410, new Class[]{LayoutInflater.class}, pt.class);
        return patchProxyResultProxy.isSupported ? (pt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19411, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pt.class);
        if (patchProxyResultProxy.isSupported) {
            return (pt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_post_tools_v2_gallery_media, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SquareRelativeLayout b() {
        return this.f114607a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19413, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
