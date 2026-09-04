package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityChooseTopicsV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f113556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f113557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final la0 f113561g;

    private n(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 la0 la0Var) {
        this.f113555a = relativeLayout;
        this.f113556b = bottomButtonLeftItemView;
        this.f113557c = listSectionHeader;
        this.f113558d = recyclerView;
        this.f113559e = recyclerView2;
        this.f113560f = oVar;
        this.f113561g = la0Var;
    }

    @androidx.annotation.n0
    public static n a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16292, new Class[]{View.class}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.lsh_checked;
            ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_checked);
            if (listSectionHeader != null) {
                i10 = R.id.rv_checked;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_checked);
                if (recyclerView != null) {
                    i10 = R.id.rv_topics;
                    RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_topics);
                    if (recyclerView2 != null) {
                        i10 = R.id.v_divider;
                        View viewA = l3.d.a(view, R.id.v_divider);
                        if (viewA != null) {
                            mb.o oVarA = mb.o.a(viewA);
                            i10 = R.id.vg_et;
                            View viewA2 = l3.d.a(view, R.id.vg_et);
                            if (viewA2 != null) {
                                return new n((RelativeLayout) view, bottomButtonLeftItemView, listSectionHeader, recyclerView, recyclerView2, oVarA, la0.a(viewA2));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16290, new Class[]{LayoutInflater.class}, n.class);
        return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16291, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_choose_topics_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113555a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16293, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
