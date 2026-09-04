package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptHashtagFavourListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118359c;

    private zf(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f118357a = linearLayout;
        this.f118358b = textView;
        this.f118359c = textView2;
    }

    @androidx.annotation.n0
    public static zf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18004, new Class[]{View.class}, zf.class);
        if (patchProxyResultProxy.isSupported) {
            return (zf) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
        if (textView != null) {
            i10 = R.id.tv_title;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView2 != null) {
                return new zf((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, org.apache.tools.bzip2.a.f137133y3, new Class[]{LayoutInflater.class}, zf.class);
        return patchProxyResultProxy.isSupported ? (zf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18003, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zf.class);
        if (patchProxyResultProxy.isSupported) {
            return (zf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_hashtag_favour_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118357a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18005, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
