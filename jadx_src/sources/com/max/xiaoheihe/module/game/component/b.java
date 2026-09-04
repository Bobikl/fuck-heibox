package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import com.max.component.g;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShineMvpView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
@n9.a({g.class})
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f87030a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.component.g
    @d
    public View a(@d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 37019, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        ShineMvpView shineMvpView = new ShineMvpView(context);
        int iF = ViewUtils.f(context, 100.0f);
        shineMvpView.setLayoutParams(new ViewGroup.LayoutParams(iF, iF * 2));
        return shineMvpView;
    }

    @Override // com.max.component.g
    @e
    public String b() {
        return "https://imgheybox.max-c.com/oa/2024/10/18/a1e0a2d97e404a6539d0d53056c266eb.png";
    }

    @Override // com.max.component.g
    @d
    public String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37018, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = ShineMvpView.class.getSimpleName();
        f0.o(simpleName, "ShineMvpView::class.java.simpleName");
        return simpleName;
    }

    @Override // com.max.component.g
    @d
    public String d() {
        return com.max.component.b.f65477d;
    }

    @Override // com.max.component.g
    @d
    public String e() {
        return "MVP";
    }
}
