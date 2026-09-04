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

/* JADX INFO: compiled from: ItemFavourFolderV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108984k;

    private bj(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f108974a = relativeLayout;
        this.f108975b = imageView;
        this.f108976c = imageView2;
        this.f108977d = imageView3;
        this.f108978e = linearLayout;
        this.f108979f = linearLayout2;
        this.f108980g = textView;
        this.f108981h = textView2;
        this.f108982i = textView3;
        this.f108983j = textView4;
        this.f108984k = textView5;
    }

    @androidx.annotation.n0
    public static bj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18323, new Class[]{View.class}, bj.class);
        if (patchProxyResultProxy.isSupported) {
            return (bj) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_end;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_end);
        if (imageView != null) {
            i10 = R.id.iv_mid;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mid);
            if (imageView2 != null) {
                i10 = R.id.iv_start;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_start);
                if (imageView3 != null) {
                    i10 = R.id.ll_content_desc;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content_desc);
                    if (linearLayout != null) {
                        i10 = R.id.ll_title_container;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_title_container);
                        if (linearLayout2 != null) {
                            i10 = R.id.tv_content_held;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_content_held);
                            if (textView != null) {
                                i10 = R.id.tv_end;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_end);
                                if (textView2 != null) {
                                    i10 = R.id.tv_mid;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mid);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_start;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_start);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_title_w500;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title_w500);
                                            if (textView5 != null) {
                                                return new bj((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18321, new Class[]{LayoutInflater.class}, bj.class);
        return patchProxyResultProxy.isSupported ? (bj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18322, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bj.class);
        if (patchProxyResultProxy.isSupported) {
            return (bj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_favour_folder_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108974a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18324, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
