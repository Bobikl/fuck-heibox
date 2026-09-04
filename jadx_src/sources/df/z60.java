package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHashtagChooseNewEntryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConsecutiveScrollerLayout f118228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f118229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118233f;

    private z60(@androidx.annotation.n0 ConsecutiveScrollerLayout consecutiveScrollerLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f118228a = consecutiveScrollerLayout;
        this.f118229b = frameLayout;
        this.f118230c = recyclerView;
        this.f118231d = recyclerView2;
        this.f118232e = textView;
        this.f118233f = textView2;
    }

    @androidx.annotation.n0
    public static z60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20796, new Class[]{View.class}, z60.class);
        if (patchProxyResultProxy.isSupported) {
            return (z60) patchProxyResultProxy.result;
        }
        int i10 = R.id.fl_search_create_hashtag;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_search_create_hashtag);
        if (frameLayout != null) {
            i10 = R.id.rv_hashtag_recommend;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_hashtag_recommend);
            if (recyclerView != null) {
                i10 = R.id.rv_hashtag_search;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_hashtag_search);
                if (recyclerView2 != null) {
                    i10 = R.id.tv_hashtag_recommend_w500;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_hashtag_recommend_w500);
                    if (textView != null) {
                        i10 = R.id.tv_new_hashtag_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_new_hashtag_name);
                        if (textView2 != null) {
                            return new z60((ConsecutiveScrollerLayout) view, frameLayout, recyclerView, recyclerView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20794, new Class[]{LayoutInflater.class}, z60.class);
        return patchProxyResultProxy.isSupported ? (z60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20795, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z60.class);
        if (patchProxyResultProxy.isSupported) {
            return (z60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_hashtag_choose_new_entry, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConsecutiveScrollerLayout b() {
        return this.f118228a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20797, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
