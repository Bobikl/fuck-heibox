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

/* JADX INFO: compiled from: ItemPostToolsV2TemplateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class qt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114973e;

    private qt(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f114969a = constraintLayout;
        this.f114970b = cardView;
        this.f114971c = imageView;
        this.f114972d = textView;
        this.f114973e = textView2;
    }

    @androidx.annotation.n0
    public static qt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19416, new Class[]{View.class}, qt.class);
        if (patchProxyResultProxy.isSupported) {
            return (qt) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_content;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_content);
        if (cardView != null) {
            i10 = R.id.iv_template_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_template_img);
            if (imageView != null) {
                i10 = R.id.tv_icon_label;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_icon_label);
                if (textView != null) {
                    i10 = R.id.tv_template_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_template_name);
                    if (textView2 != null) {
                        return new qt((ConstraintLayout) view, cardView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static qt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19414, new Class[]{LayoutInflater.class}, qt.class);
        return patchProxyResultProxy.isSupported ? (qt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static qt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19415, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, qt.class);
        if (patchProxyResultProxy.isSupported) {
            return (qt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_post_tools_v2_template, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114969a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19417, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
