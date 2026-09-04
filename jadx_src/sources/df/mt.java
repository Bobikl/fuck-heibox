package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPostPlanBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f113522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f113526f;

    private mt(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f113521a = constraintLayout;
        this.f113522b = checkBox;
        this.f113523c = oVar;
        this.f113524d = imageView;
        this.f113525e = textView;
        this.f113526f = frameLayout;
    }

    @androidx.annotation.n0
    public static mt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19400, new Class[]{View.class}, mt.class);
        if (patchProxyResultProxy.isSupported) {
            return (mt) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_check;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_check);
        if (checkBox != null) {
            i10 = R.id.divider_post_plan_item;
            View viewA = l3.d.a(view, R.id.divider_post_plan_item);
            if (viewA != null) {
                mb.o oVarA = mb.o.a(viewA);
                i10 = R.id.iv_help;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_help);
                if (imageView != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        i10 = R.id.vg_check;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_check);
                        if (frameLayout != null) {
                            return new mt((ConstraintLayout) view, checkBox, oVarA, imageView, textView, frameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19398, new Class[]{LayoutInflater.class}, mt.class);
        return patchProxyResultProxy.isSupported ? (mt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19399, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mt.class);
        if (patchProxyResultProxy.isSupported) {
            return (mt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_post_plan, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113521a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19401, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
