package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemLinkListSwipeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class np implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SwipeMenuLayout f113929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f113930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwipeMenuLayout f113931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113934f;

    private np(@androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113929a = swipeMenuLayout;
        this.f113930b = checkBox;
        this.f113931c = swipeMenuLayout2;
        this.f113932d = textView;
        this.f113933e = textView2;
        this.f113934f = relativeLayout;
    }

    @androidx.annotation.n0
    public static np a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18992, new Class[]{View.class}, np.class);
        if (patchProxyResultProxy.isSupported) {
            return (np) patchProxyResultProxy.result;
        }
        int i10 = R.id.f76243cb;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.f76243cb);
        if (checkBox != null) {
            SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
            i10 = R.id.tv_del;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_del);
            if (textView != null) {
                i10 = R.id.tv_move;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_move);
                if (textView2 != null) {
                    i10 = R.id.vg_checkbox;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_checkbox);
                    if (relativeLayout != null) {
                        return new np(swipeMenuLayout, checkBox, swipeMenuLayout, textView, textView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static np c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18990, new Class[]{LayoutInflater.class}, np.class);
        return patchProxyResultProxy.isSupported ? (np) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static np d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18991, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, np.class);
        if (patchProxyResultProxy.isSupported) {
            return (np) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_link_list_swipe, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SwipeMenuLayout b() {
        return this.f113929a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18993, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
