package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemLinkListSwipeDeletedBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class op implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SwipeMenuLayout f114295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f114296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f114297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwipeMenuLayout f114298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114302h;

    private op(@androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114295a = swipeMenuLayout;
        this.f114296b = checkBox;
        this.f114297c = pVar;
        this.f114298d = swipeMenuLayout2;
        this.f114299e = textView;
        this.f114300f = textView2;
        this.f114301g = relativeLayout;
        this.f114302h = linearLayout;
    }

    @androidx.annotation.n0
    public static op a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18996, new Class[]{View.class}, op.class);
        if (patchProxyResultProxy.isSupported) {
            return (op) patchProxyResultProxy.result;
        }
        int i10 = R.id.f76243cb;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.f76243cb);
        if (checkBox != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                mb.p pVarA = mb.p.a(viewA);
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
                            i10 = R.id.vg_item;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                            if (linearLayout != null) {
                                return new op(swipeMenuLayout, checkBox, pVarA, swipeMenuLayout, textView, textView2, relativeLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static op c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18994, new Class[]{LayoutInflater.class}, op.class);
        return patchProxyResultProxy.isSupported ? (op) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static op d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18995, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, op.class);
        if (patchProxyResultProxy.isSupported) {
            return (op) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_link_list_swipe_deleted, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SwipeMenuLayout b() {
        return this.f114295a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18997, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
