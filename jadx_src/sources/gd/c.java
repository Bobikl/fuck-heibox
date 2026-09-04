package gd;

import com.max.hbresource.color.ColorUsage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LightColorTransformer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // gd.a
    public int a(@d ColorUsage usage, int i10) {
        Object[] objArr = {usage, new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33745o1, new Class[]{ColorUsage.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(usage, "usage");
        return i10;
    }
}
