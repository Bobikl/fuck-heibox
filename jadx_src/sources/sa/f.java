package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.component.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSampleRvWithTitleBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class f implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final DrawerLayout f139370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final DrawerLayout f139371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final EditText f139372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f139373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f139374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final RecyclerView f139375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final RecyclerView f139376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f139377h;

    private f(@n0 DrawerLayout drawerLayout, @n0 DrawerLayout drawerLayout2, @n0 EditText editText, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2, @n0 TextView textView) {
        this.f139370a = drawerLayout;
        this.f139371b = drawerLayout2;
        this.f139372c = editText;
        this.f139373d = imageView;
        this.f139374e = imageView2;
        this.f139375f = recyclerView;
        this.f139376g = recyclerView2;
        this.f139377h = textView;
    }

    @n0
    public static f a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.b.Km, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        DrawerLayout drawerLayout = (DrawerLayout) view;
        int i10 = R.id.et_search;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.iv_back;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_menu;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                    if (recyclerView != null) {
                        i10 = R.id.rv_component_tree;
                        RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, i10);
                        if (recyclerView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView = (TextView) l3.d.a(view, i10);
                            if (textView != null) {
                                return new f(drawerLayout, drawerLayout, editText, imageView, imageView2, recyclerView, recyclerView2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static f c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.b.Im, new Class[]{LayoutInflater.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static f d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.b.Jm, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_sample_rv_with_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public DrawerLayout b() {
        return this.f139370a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Lm, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
