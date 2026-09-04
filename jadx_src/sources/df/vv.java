package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendFollowingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116942g;

    private vv(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f116936a = linearLayout;
        this.f116937b = imageView;
        this.f116938c = imageView2;
        this.f116939d = textView;
        this.f116940e = textView2;
        this.f116941f = textView3;
        this.f116942g = linearLayout2;
    }

    @androidx.annotation.n0
    public static vv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19644, new Class[]{View.class}, vv.class);
        if (patchProxyResultProxy.isSupported) {
            return (vv) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_action);
        if (imageView != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView2 != null) {
                i10 = R.id.tv_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView3 != null) {
                            i10 = R.id.vg_action;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_action);
                            if (linearLayout != null) {
                                return new vv((LinearLayout) view, imageView, imageView2, textView, textView2, textView3, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19642, new Class[]{LayoutInflater.class}, vv.class);
        return patchProxyResultProxy.isSupported ? (vv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19643, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vv.class);
        if (patchProxyResultProxy.isSupported) {
            return (vv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_following, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116936a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19645, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
