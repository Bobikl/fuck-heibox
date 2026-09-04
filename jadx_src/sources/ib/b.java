package ib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HBDialogSpace.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements com.max.hbcommon.view.a.h {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f119337a;

    public b(float f10) {
        this.f119337a = f10;
    }

    @Override // com.max.hbcommon.view.a.h
    public /* synthetic */ ViewGroup.LayoutParams a(Context context) {
        return com.max.hbcommon.view.b.a(this, context);
    }

    @Override // com.max.hbcommon.view.a.h
    @dl.d
    public View b(@dl.e Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Ip, new Class[]{Context.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, ViewUtils.f(context, this.f119337a)));
        return view;
    }
}
