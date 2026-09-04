package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTemplateHashtagGroupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112318f;

    private jz(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 View view) {
        this.f112313a = relativeLayout;
        this.f112314b = linearLayout;
        this.f112315c = recyclerView;
        this.f112316d = textView;
        this.f112317e = textView2;
        this.f112318f = view;
    }

    @androidx.annotation.n0
    public static jz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20008, new Class[]{View.class}, jz.class);
        if (patchProxyResultProxy.isSupported) {
            return (jz) patchProxyResultProxy.result;
        }
        int i10 = R.id.check_more;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.check_more);
        if (linearLayout != null) {
            i10 = R.id.rv_group;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_group);
            if (recyclerView != null) {
                i10 = R.id.tv_check_more;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_check_more);
                if (textView != null) {
                    i10 = R.id.tv_group_name;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_group_name);
                    if (textView2 != null) {
                        i10 = R.id.v_space;
                        View viewA = l3.d.a(view, R.id.v_space);
                        if (viewA != null) {
                            return new jz((RelativeLayout) view, linearLayout, recyclerView, textView, textView2, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20006, new Class[]{LayoutInflater.class}, jz.class);
        return patchProxyResultProxy.isSupported ? (jz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20007, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jz.class);
        if (patchProxyResultProxy.isSupported) {
            return (jz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_template_hashtag_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112313a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20009, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
