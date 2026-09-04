package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutCopyedTokenCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114430j;

    private p30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 CardView cardView) {
        this.f114421a = relativeLayout;
        this.f114422b = qMUIRadiusImageView;
        this.f114423c = qMUIRadiusImageView2;
        this.f114424d = imageView;
        this.f114425e = imageView2;
        this.f114426f = textView;
        this.f114427g = textView2;
        this.f114428h = textView3;
        this.f114429i = textView4;
        this.f114430j = cardView;
    }

    @androidx.annotation.n0
    public static p30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20446, new Class[]{View.class}, p30.class);
        if (patchProxyResultProxy.isSupported) {
            return (p30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_bg;
            QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_bg);
            if (qMUIRadiusImageView2 != null) {
                i10 = R.id.iv_cancel;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_cancel);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.tv_btn;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_btn);
                        if (textView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView2 != null) {
                                i10 = R.id.tv_remark;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_remark);
                                if (textView3 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_card;
                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_card);
                                        if (cardView != null) {
                                            return new p30((RelativeLayout) view, qMUIRadiusImageView, qMUIRadiusImageView2, imageView, imageView2, textView, textView2, textView3, textView4, cardView);
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
    public static p30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20444, new Class[]{LayoutInflater.class}, p30.class);
        return patchProxyResultProxy.isSupported ? (p30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20445, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p30.class);
        if (patchProxyResultProxy.isSupported) {
            return (p30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_copyed_token_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114421a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20447, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
