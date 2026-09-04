package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameAccountManagerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f115096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115102h;

    private r50(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f115095a = constraintLayout;
        this.f115096b = oVar;
        this.f115097c = imageView;
        this.f115098d = textView;
        this.f115099e = textView2;
        this.f115100f = textView3;
        this.f115101g = textView4;
        this.f115102h = textView5;
    }

    @androidx.annotation.n0
    public static r50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20660, new Class[]{View.class}, r50.class);
        if (patchProxyResultProxy.isSupported) {
            return (r50) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.tv_change_bind;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_change_bind);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_show_friend_code;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_show_friend_code);
                        if (textView3 != null) {
                            i10 = R.id.tv_show_or_hide;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_show_or_hide);
                            if (textView4 != null) {
                                i10 = R.id.tv_title;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                                if (textView5 != null) {
                                    return new r50((ConstraintLayout) view, oVarA, imageView, textView, textView2, textView3, textView4, textView5);
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
    public static r50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20658, new Class[]{LayoutInflater.class}, r50.class);
        return patchProxyResultProxy.isSupported ? (r50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20659, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r50.class);
        if (patchProxyResultProxy.isSupported) {
            return (r50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_account_manager, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115095a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20661, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
