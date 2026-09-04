package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogCoffeeBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f115839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115842e;

    private t4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView) {
        this.f115838a = relativeLayout;
        this.f115839b = progressBar;
        this.f115840c = recyclerView;
        this.f115841d = textView;
        this.f115842e = bottomButtonLeftItemView;
    }

    @androidx.annotation.n0
    public static t4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16836, new Class[]{View.class}, t4.class);
        if (patchProxyResultProxy.isSupported) {
            return (t4) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_title;
        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_title);
        if (progressBar != null) {
            i10 = R.id.rv_progress;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_progress);
            if (recyclerView != null) {
                i10 = R.id.tv_title;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                if (textView != null) {
                    i10 = R.id.vg_button_panel;
                    BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_button_panel);
                    if (bottomButtonLeftItemView != null) {
                        return new t4((RelativeLayout) view, progressBar, recyclerView, textView, bottomButtonLeftItemView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static t4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16834, new Class[]{LayoutInflater.class}, t4.class);
        return patchProxyResultProxy.isSupported ? (t4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16835, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t4.class);
        if (patchProxyResultProxy.isSupported) {
            return (t4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_coffee, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115838a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16837, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
