package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityCouponGivingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f114335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f114338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114342i;

    private p(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114334a = relativeLayout;
        this.f114335b = editText;
        this.f114336c = imageView;
        this.f114337d = recyclerView;
        this.f114338e = smartRefreshLayout;
        this.f114339f = textView;
        this.f114340g = textView2;
        this.f114341h = linearLayout;
        this.f114342i = relativeLayout2;
    }

    @androidx.annotation.n0
    public static p a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16300, new Class[]{View.class}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search_friend;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search_friend);
        if (editText != null) {
            i10 = R.id.iv_empty;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_empty);
            if (imageView != null) {
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                if (recyclerView != null) {
                    i10 = R.id.srl;
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                    if (smartRefreshLayout != null) {
                        i10 = R.id.tv_confirm;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                        if (textView != null) {
                            i10 = R.id.tv_empty;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_empty);
                            if (textView2 != null) {
                                i10 = R.id.vg_empty;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_empty);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_search;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search);
                                    if (relativeLayout != null) {
                                        return new p((RelativeLayout) view, editText, imageView, recyclerView, smartRefreshLayout, textView, textView2, linearLayout, relativeLayout);
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
    public static p c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16298, new Class[]{LayoutInflater.class}, p.class);
        return patchProxyResultProxy.isSupported ? (p) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16299, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p.class);
        if (patchProxyResultProxy.isSupported) {
            return (p) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_coupon_giving, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114334a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16301, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
