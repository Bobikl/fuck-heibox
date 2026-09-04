package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemWikiItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f117710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117714f;

    private y10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f117709a = relativeLayout;
        this.f117710b = pVar;
        this.f117711c = imageView;
        this.f117712d = imageView2;
        this.f117713e = textView;
        this.f117714f = textView2;
    }

    @androidx.annotation.n0
    public static y10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20276, new Class[]{View.class}, y10.class);
        if (patchProxyResultProxy.isSupported) {
            return (y10) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.p pVarA = mb.p.a(viewA);
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.iv_more;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
                if (imageView2 != null) {
                    i10 = R.id.tv_content;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_content);
                    if (textView != null) {
                        i10 = R.id.tv_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView2 != null) {
                            return new y10((RelativeLayout) view, pVarA, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20274, new Class[]{LayoutInflater.class}, y10.class);
        return patchProxyResultProxy.isSupported ? (y10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20275, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y10.class);
        if (patchProxyResultProxy.isSupported) {
            return (y10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_wiki_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117709a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20277, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
