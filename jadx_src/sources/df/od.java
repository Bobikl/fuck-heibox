package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemBadgesListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class od implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f114199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114200g;

    private od(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f114194a = cardView;
        this.f114195b = imageView;
        this.f114196c = textView;
        this.f114197d = textView2;
        this.f114198e = textView3;
        this.f114199f = h20Var;
        this.f114200g = relativeLayout;
    }

    @androidx.annotation.n0
    public static od a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17752, new Class[]{View.class}, od.class);
        if (patchProxyResultProxy.isSupported) {
            return (od) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.tv_level;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_level);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.tv_time;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_time);
                    if (textView3 != null) {
                        i10 = R.id.view_header;
                        View viewA = l3.d.a(view, R.id.view_header);
                        if (viewA != null) {
                            h20 h20VarA = h20.a(viewA);
                            i10 = R.id.wrapper;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.wrapper);
                            if (relativeLayout != null) {
                                return new od((CardView) view, imageView, textView, textView2, textView3, h20VarA, relativeLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static od c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17750, new Class[]{LayoutInflater.class}, od.class);
        return patchProxyResultProxy.isSupported ? (od) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static od d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17751, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, od.class);
        if (patchProxyResultProxy.isSupported) {
            return (od) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_badges_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114194a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17753, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
