package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityAddHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109551c;

    private d(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f109549a = linearLayout;
        this.f109550b = editText;
        this.f109551c = recyclerView;
    }

    @androidx.annotation.n0
    public static d a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16252, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_hashtag;
        EditText editText = (EditText) l3.d.a(view, R.id.et_hashtag);
        if (editText != null) {
            i10 = R.id.rv_list;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_list);
            if (recyclerView != null) {
                return new d((LinearLayout) view, editText, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static d c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16250, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static d d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16251, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_add_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109549a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16253, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
