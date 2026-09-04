package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgFriendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111343f;

    private h90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111338a = linearLayout;
        this.f111339b = recyclerView;
        this.f111340c = textView;
        this.f111341d = textView2;
        this.f111342e = textView3;
        this.f111343f = linearLayout2;
    }

    @androidx.annotation.n0
    public static h90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21034, new Class[]{View.class}, h90.class);
        if (patchProxyResultProxy.isSupported) {
            return (h90) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_friend;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_friend);
        if (recyclerView != null) {
            i10 = R.id.tv_all_friend_expand;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_all_friend_expand);
            if (textView != null) {
                i10 = R.id.tv_col_friend;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_col_friend);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView3 != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        return new h90(linearLayout, recyclerView, textView, textView2, textView3, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21032, new Class[]{LayoutInflater.class}, h90.class);
        return patchProxyResultProxy.isSupported ? (h90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21033, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h90.class);
        if (patchProxyResultProxy.isSupported) {
            return (h90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_friend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111338a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21035, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
