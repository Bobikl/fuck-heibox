package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCheckedConceptFeedsLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class df implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SwipeMenuLayout f109775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f109776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwipeMenuLayout f109778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109781g;

    private df(@androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f109775a = swipeMenuLayout;
        this.f109776b = checkBox;
        this.f109777c = frameLayout;
        this.f109778d = swipeMenuLayout2;
        this.f109779e = textView;
        this.f109780f = textView2;
        this.f109781g = relativeLayout;
    }

    @androidx.annotation.n0
    public static df a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17916, new Class[]{View.class}, df.class);
        if (patchProxyResultProxy.isSupported) {
            return (df) patchProxyResultProxy.result;
        }
        int i10 = R.id.f76243cb;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.f76243cb);
        if (checkBox != null) {
            i10 = R.id.fl_link_container;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_link_container);
            if (frameLayout != null) {
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
                            return new df(swipeMenuLayout, checkBox, frameLayout, swipeMenuLayout, textView, textView2, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static df c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17914, new Class[]{LayoutInflater.class}, df.class);
        return patchProxyResultProxy.isSupported ? (df) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static df d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17915, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, df.class);
        if (patchProxyResultProxy.isSupported) {
            return (df) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_checked_concept_feeds_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SwipeMenuLayout b() {
        return this.f109775a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17917, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
