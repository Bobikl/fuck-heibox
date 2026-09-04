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

/* JADX INFO: compiled from: ItemPostCompilationBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111105g;

    private gt(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3) {
        this.f111099a = constraintLayout;
        this.f111100b = cardView;
        this.f111101c = oVar;
        this.f111102d = imageView;
        this.f111103e = textView;
        this.f111104f = textView2;
        this.f111105g = textView3;
    }

    @androidx.annotation.n0
    public static gt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19380, new Class[]{View.class}, gt.class);
        if (patchProxyResultProxy.isSupported) {
            return (gt) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_compilation_icon;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_compilation_icon);
        if (cardView != null) {
            i10 = R.id.divider_bottom;
            View viewA = l3.d.a(view, R.id.divider_bottom);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.iv_compilation;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_compilation);
                if (imageView != null) {
                    i10 = R.id.tv_add_in_w500;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_add_in_w500);
                    if (textView != null) {
                        i10 = R.id.tv_compilation_count_desc;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_compilation_count_desc);
                        if (textView2 != null) {
                            i10 = R.id.tv_compilation_name_w500;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_compilation_name_w500);
                            if (textView3 != null) {
                                return new gt((ConstraintLayout) view, cardView, oVarA, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static gt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19378, new Class[]{LayoutInflater.class}, gt.class);
        return patchProxyResultProxy.isSupported ? (gt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19379, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gt.class);
        if (patchProxyResultProxy.isSupported) {
            return (gt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_post_compilation, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111099a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19381, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
