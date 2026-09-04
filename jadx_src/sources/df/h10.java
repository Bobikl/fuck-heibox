package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemVideoCellBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111214l;

    private h10(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6) {
        this.f111203a = constraintLayout;
        this.f111204b = cardView;
        this.f111205c = imageView;
        this.f111206d = imageView2;
        this.f111207e = imageView3;
        this.f111208f = imageView4;
        this.f111209g = textView;
        this.f111210h = textView2;
        this.f111211i = textView3;
        this.f111212j = textView4;
        this.f111213k = textView5;
        this.f111214l = textView6;
    }

    @androidx.annotation.n0
    public static h10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20208, new Class[]{View.class}, h10.class);
        if (patchProxyResultProxy.isSupported) {
            return (h10) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bg;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_bg);
        if (cardView != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_bg;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
                if (imageView2 != null) {
                    i10 = R.id.iv_not_interested;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_not_interested);
                    if (imageView3 != null) {
                        i10 = R.id.iv_scrim;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_scrim);
                        if (imageView4 != null) {
                            i10 = R.id.tv_comment_num;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_comment_num);
                            if (textView != null) {
                                i10 = R.id.tv_name;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView2 != null) {
                                    i10 = R.id.tv_time;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_time);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_topic;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_topic);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_view_num;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_view_num);
                                                if (textView6 != null) {
                                                    return new h10((ConstraintLayout) view, cardView, imageView, imageView2, imageView3, imageView4, textView, textView2, textView3, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20206, new Class[]{LayoutInflater.class}, h10.class);
        return patchProxyResultProxy.isSupported ? (h10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20207, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h10.class);
        if (patchProxyResultProxy.isSupported) {
            return (h10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_video_cell, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111203a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20209, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
