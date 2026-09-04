package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutConceptFeedsItemBottombarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113281g;

    private m30(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f113275a = constraintLayout;
        this.f113276b = imageView;
        this.f113277c = imageView2;
        this.f113278d = linearLayout;
        this.f113279e = linearLayout2;
        this.f113280f = textView;
        this.f113281g = textView2;
    }

    @androidx.annotation.n0
    public static m30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20434, new Class[]{View.class}, m30.class);
        if (patchProxyResultProxy.isSupported) {
            return (m30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_comment;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_comment);
        if (imageView != null) {
            i10 = R.id.iv_not_interested;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_not_interested);
            if (imageView2 != null) {
                i10 = R.id.ll_comment;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_comment);
                if (linearLayout != null) {
                    i10 = R.id.ll_rich_tags;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_rich_tags);
                    if (linearLayout2 != null) {
                        i10 = R.id.tv_comment;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_comment);
                        if (textView != null) {
                            i10 = R.id.tv_desc;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                            if (textView2 != null) {
                                return new m30((ConstraintLayout) view, imageView, imageView2, linearLayout, linearLayout2, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20432, new Class[]{LayoutInflater.class}, m30.class);
        return patchProxyResultProxy.isSupported ? (m30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20433, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m30.class);
        if (patchProxyResultProxy.isSupported) {
            return (m30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_concept_feeds_item_bottombar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113275a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20435, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
