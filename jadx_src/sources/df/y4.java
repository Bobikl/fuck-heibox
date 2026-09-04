package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: DialogFragmentAddFriendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f117763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f117768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final pi f117770h;

    private y4(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 pi piVar) {
        this.f117763a = frameLayout;
        this.f117764b = editText;
        this.f117765c = imageView;
        this.f117766d = recyclerView;
        this.f117767e = recyclerView2;
        this.f117768f = smartRefreshLayout;
        this.f117769g = textView;
        this.f117770h = piVar;
    }

    @androidx.annotation.n0
    public static y4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16856, new Class[]{View.class}, y4.class);
        if (patchProxyResultProxy.isSupported) {
            return (y4) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search_friend;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search_friend);
        if (editText != null) {
            i10 = R.id.iv_top_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_top_icon);
            if (imageView != null) {
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                if (recyclerView != null) {
                    i10 = R.id.rv_search;
                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_search);
                    if (recyclerView2 != null) {
                        i10 = R.id.srl;
                        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) l3.d.a(view, R.id.srl);
                        if (smartRefreshLayout != null) {
                            i10 = R.id.tv_add_friend_desc;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_add_friend_desc);
                            if (textView != null) {
                                i10 = R.id.vg_search_empty;
                                View viewA = l3.d.a(view, R.id.vg_search_empty);
                                if (viewA != null) {
                                    return new y4((FrameLayout) view, editText, imageView, recyclerView, recyclerView2, smartRefreshLayout, textView, pi.a(viewA));
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
    public static y4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16854, new Class[]{LayoutInflater.class}, y4.class);
        return patchProxyResultProxy.isSupported ? (y4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16855, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y4.class);
        if (patchProxyResultProxy.isSupported) {
            return (y4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_add_friend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f117763a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16857, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
