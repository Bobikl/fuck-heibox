package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityDebugSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ComposeView f115350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115352d;

    private s(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ComposeView composeView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f115349a = constraintLayout;
        this.f115350b = composeView;
        this.f115351c = editText;
        this.f115352d = recyclerView;
    }

    @androidx.annotation.n0
    public static s a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16312, new Class[]{View.class}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        int i10 = R.id.compose_view;
        ComposeView composeView = (ComposeView) l3.d.a(view, R.id.compose_view);
        if (composeView != null) {
            i10 = R.id.editor;
            EditText editText = (EditText) l3.d.a(view, R.id.editor);
            if (editText != null) {
                i10 = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                if (recyclerView != null) {
                    return new s((ConstraintLayout) view, composeView, editText, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16310, new Class[]{LayoutInflater.class}, s.class);
        return patchProxyResultProxy.isSupported ? (s) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16311, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_debug_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115349a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16313, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
