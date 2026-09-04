package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewAvatarBannerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ke0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f112595a;

    private ke0(@androidx.annotation.n0 View view) {
        this.f112595a = view;
    }

    @androidx.annotation.n0
    public static ke0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21559, new Class[]{View.class}, ke0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ke0) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new ke0(view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static ke0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21558, new Class[]{LayoutInflater.class, ViewGroup.class}, ke0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ke0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_avatar_banner, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f112595a;
    }
}
