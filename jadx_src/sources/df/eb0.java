package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStorySpeedWatchingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f110124a;

    private eb0(@androidx.annotation.n0 View view) {
        this.f110124a = view;
    }

    @androidx.annotation.n0
    public static eb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21228, new Class[]{View.class}, eb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (eb0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new eb0(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static eb0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21227, new Class[]{LayoutInflater.class, ViewGroup.class}, eb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (eb0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_story_speed_watching, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f110124a;
    }
}
