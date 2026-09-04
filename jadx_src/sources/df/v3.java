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

/* JADX INFO: compiled from: ComponentGameLargeSaleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final z3 f116604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final z3 f116605j;

    private v3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 z3 z3Var, @androidx.annotation.n0 z3 z3Var2) {
        this.f116596a = relativeLayout;
        this.f116597b = imageView;
        this.f116598c = textView;
        this.f116599d = textView2;
        this.f116600e = textView3;
        this.f116601f = textView4;
        this.f116602g = textView5;
        this.f116603h = linearLayout;
        this.f116604i = z3Var;
        this.f116605j = z3Var2;
    }

    @androidx.annotation.n0
    public static v3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16740, new Class[]{View.class}, v3.class);
        if (patchProxyResultProxy.isSupported) {
            return (v3) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_hour_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_hour_desc);
            if (textView != null) {
                i10 = R.id.tv_minute_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_minute_desc);
                if (textView2 != null) {
                    i10 = R.id.tv_second_desc;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_second_desc);
                    if (textView3 != null) {
                        i10 = R.id.tv_state_desc;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state_desc);
                        if (textView4 != null) {
                            i10 = R.id.tv_title;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView5 != null) {
                                i10 = R.id.vg_count_down;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_count_down);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_game_0;
                                    View viewA = l3.d.a(view, R.id.vg_game_0);
                                    if (viewA != null) {
                                        z3 z3VarA = z3.a(viewA);
                                        i10 = R.id.vg_game_1;
                                        View viewA2 = l3.d.a(view, R.id.vg_game_1);
                                        if (viewA2 != null) {
                                            return new v3((RelativeLayout) view, imageView, textView, textView2, textView3, textView4, textView5, linearLayout, z3VarA, z3.a(viewA2));
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
    public static v3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16738, new Class[]{LayoutInflater.class}, v3.class);
        return patchProxyResultProxy.isSupported ? (v3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16739, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v3.class);
        if (patchProxyResultProxy.isSupported) {
            return (v3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_large_sale, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116596a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16741, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
