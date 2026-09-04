package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecLinkInFeedBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f113960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f113961h;

    private nv(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f113954a = cardView;
        this.f113955b = imageView;
        this.f113956c = imageView2;
        this.f113957d = imageView3;
        this.f113958e = textView;
        this.f113959f = textView2;
        this.f113960g = hBLineHeightTextView;
        this.f113961h = constraintLayout;
    }

    @androidx.annotation.n0
    public static nv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19612, new Class[]{View.class}, nv.class);
        if (patchProxyResultProxy.isSupported) {
            return (nv) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_comment;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_comment);
        if (imageView != null) {
            i10 = R.id.iv_image;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_image);
            if (imageView2 != null) {
                i10 = R.id.iv_video_play;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_video_play);
                if (imageView3 != null) {
                    i10 = R.id.tv_comment;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_comment);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_title);
                            if (hBLineHeightTextView != null) {
                                i10 = R.id.vg_content;
                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                if (constraintLayout != null) {
                                    return new nv((CardView) view, imageView, imageView2, imageView3, textView, textView2, hBLineHeightTextView, constraintLayout);
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
    public static nv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19610, new Class[]{LayoutInflater.class}, nv.class);
        return patchProxyResultProxy.isSupported ? (nv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19611, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nv.class);
        if (patchProxyResultProxy.isSupported) {
            return (nv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rec_link_in_feed, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113954a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19613, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
