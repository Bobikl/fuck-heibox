package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDestinyGuardianHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vh implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116858e;

    private vh(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116854a = constraintLayout;
        this.f116855b = textView;
        this.f116856c = view;
        this.f116857d = relativeLayout;
        this.f116858e = linearLayout;
    }

    @androidx.annotation.n0
    public static vh a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18195, new Class[]{View.class}, vh.class);
        if (patchProxyResultProxy.isSupported) {
            return (vh) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_light;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_light);
        if (textView != null) {
            i10 = R.id.v_divider;
            View viewA = l3.d.a(view, R.id.v_divider);
            if (viewA != null) {
                i10 = R.id.vg_name;
                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_name);
                if (relativeLayout != null) {
                    i10 = R.id.vg_skill;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_skill);
                    if (linearLayout != null) {
                        return new vh((ConstraintLayout) view, textView, viewA, relativeLayout, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vh c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18193, new Class[]{LayoutInflater.class}, vh.class);
        return patchProxyResultProxy.isSupported ? (vh) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vh d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18194, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vh.class);
        if (patchProxyResultProxy.isSupported) {
            return (vh) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_destiny_guardian_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116854a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18196, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
