package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentGameGlobalPriceV3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109696g;

    private d9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f109690a = relativeLayout;
        this.f109691b = imageView;
        this.f109692c = recyclerView;
        this.f109693d = textView;
        this.f109694e = textView2;
        this.f109695f = textView3;
        this.f109696g = linearLayout;
    }

    @androidx.annotation.n0
    public static d9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17292, new Class[]{View.class}, d9.class);
        if (patchProxyResultProxy.isSupported) {
            return (d9) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_logo);
        if (imageView != null) {
            i10 = R.id.rv;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
            if (recyclerView != null) {
                i10 = R.id.tv_discount_title;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_discount_title);
                if (textView != null) {
                    i10 = R.id.tv_price_title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_price_title);
                    if (textView2 != null) {
                        i10 = R.id.tv_version;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_version);
                        if (textView3 != null) {
                            i10 = R.id.vg_version;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_version);
                            if (linearLayout != null) {
                                return new d9((RelativeLayout) view, imageView, recyclerView, textView, textView2, textView3, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17290, new Class[]{LayoutInflater.class}, d9.class);
        return patchProxyResultProxy.isSupported ? (d9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17291, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d9.class);
        if (patchProxyResultProxy.isSupported) {
            return (d9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_game_global_price_v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109690a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17293, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
