package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchHashtagBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class px implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f114625g;

    private px(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view2) {
        this.f114619a = relativeLayout;
        this.f114620b = view;
        this.f114621c = textView;
        this.f114622d = textView2;
        this.f114623e = relativeLayout2;
        this.f114624f = linearLayout;
        this.f114625g = view2;
    }

    @androidx.annotation.n0
    public static px a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19828, new Class[]{View.class}, px.class);
        if (patchProxyResultProxy.isSupported) {
            return (px) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_name;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView2 != null) {
                    i10 = R.id.vg_content;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                    if (relativeLayout != null) {
                        i10 = R.id.vg_detail;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_detail);
                        if (linearLayout != null) {
                            i10 = R.id.view_line;
                            View viewA2 = l3.d.a(view, R.id.view_line);
                            if (viewA2 != null) {
                                return new px((RelativeLayout) view, viewA, textView, textView2, relativeLayout, linearLayout, viewA2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static px c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19826, new Class[]{LayoutInflater.class}, px.class);
        return patchProxyResultProxy.isSupported ? (px) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static px d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19827, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, px.class);
        if (patchProxyResultProxy.isSupported) {
            return (px) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_hashtag, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114619a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19829, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
