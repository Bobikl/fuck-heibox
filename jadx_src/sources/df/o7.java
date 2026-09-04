package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentCommonFeedbackDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final f20 f114123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final f20 f114125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f114126e;

    private o7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 f20 f20Var, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 f20 f20Var2, @androidx.annotation.n0 ListSectionHeader listSectionHeader) {
        this.f114122a = relativeLayout;
        this.f114123b = f20Var;
        this.f114124c = linearLayout;
        this.f114125d = f20Var2;
        this.f114126e = listSectionHeader;
    }

    @androidx.annotation.n0
    public static o7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17128, new Class[]{View.class}, o7.class);
        if (patchProxyResultProxy.isSupported) {
            return (o7) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_div;
        View viewA = l3.d.a(view, R.id.bottom_div);
        if (viewA != null) {
            f20 f20VarA = f20.a(viewA);
            i10 = R.id.ll_container;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_container);
            if (linearLayout != null) {
                i10 = R.id.top_div;
                View viewA2 = l3.d.a(view, R.id.top_div);
                if (viewA2 != null) {
                    f20 f20VarA2 = f20.a(viewA2);
                    i10 = R.id.v_lsh;
                    ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.v_lsh);
                    if (listSectionHeader != null) {
                        return new o7((RelativeLayout) view, f20VarA, linearLayout, f20VarA2, listSectionHeader);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17126, new Class[]{LayoutInflater.class}, o7.class);
        return patchProxyResultProxy.isSupported ? (o7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17127, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o7.class);
        if (patchProxyResultProxy.isSupported) {
            return (o7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_common_feedback_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114122a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17129, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
