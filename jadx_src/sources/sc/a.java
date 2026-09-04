package sc;

import bb.c;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.signature.e;
import com.max.hbimage.bean.common.HBLocalThumbModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.io.InputStream;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLocalThumbModelLoader.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements o<HBLocalThumbModel, InputStream> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.bumptech.glide.load.model.o
    public /* bridge */ /* synthetic */ o.a<InputStream> a(HBLocalThumbModel hBLocalThumbModel, int i10, int i11, f fVar) {
        Object[] objArr = {hBLocalThumbModel, new Integer(i10), new Integer(i11), fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f33176we, new Class[]{Object.class, cls, cls, f.class}, o.a.class);
        return patchProxyResultProxy.isSupported ? (o.a) patchProxyResultProxy.result : c(hBLocalThumbModel, i10, i11, fVar);
    }

    @Override // com.bumptech.glide.load.model.o
    public /* bridge */ /* synthetic */ boolean b(HBLocalThumbModel hBLocalThumbModel) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBLocalThumbModel}, this, changeQuickRedirect, false, c.g.f33196xe, new Class[]{Object.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : d(hBLocalThumbModel);
    }

    @d
    public o.a<InputStream> c(@d HBLocalThumbModel model, int i10, int i11, @d f options) {
        Object[] objArr = {model, new Integer(i10), new Integer(i11), options};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.f33136ue, new Class[]{HBLocalThumbModel.class, cls, cls, f.class}, o.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (o.a) patchProxyResultProxy.result;
        }
        f0.p(model, "model");
        f0.p(options, "options");
        return new o.a<>(new e(model), new rc.b(model, i10, i11));
    }

    public boolean d(@d HBLocalThumbModel model) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{model}, this, changeQuickRedirect, false, c.g.f33156ve, new Class[]{HBLocalThumbModel.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(model, "model");
        return true;
    }
}
