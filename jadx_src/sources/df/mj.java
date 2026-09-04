package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFollowingUserHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterButtonView f113485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113486d;

    private mj(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 FilterButtonView filterButtonView, @androidx.annotation.n0 ImageView imageView) {
        this.f113483a = relativeLayout;
        this.f113484b = editText;
        this.f113485c = filterButtonView;
        this.f113486d = imageView;
    }

    @androidx.annotation.n0
    public static mj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18367, new Class[]{View.class}, mj.class);
        if (patchProxyResultProxy.isSupported) {
            return (mj) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search);
        if (editText != null) {
            i10 = R.id.fbv_sort;
            FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, R.id.fbv_sort);
            if (filterButtonView != null) {
                i10 = R.id.iv_del;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
                if (imageView != null) {
                    return new mj((RelativeLayout) view, editText, filterButtonView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18365, new Class[]{LayoutInflater.class}, mj.class);
        return patchProxyResultProxy.isSupported ? (mj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18366, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mj.class);
        if (patchProxyResultProxy.isSupported) {
            return (mj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_following_user_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113483a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18368, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
