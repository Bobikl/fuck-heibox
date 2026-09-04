package sc;

import bb.c;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.p;
import com.bumptech.glide.load.model.s;
import com.max.hbimage.bean.common.HBLocalThumbModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.io.InputStream;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLocalThumbModelLoader.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements p<HBLocalThumbModel, InputStream> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.bumptech.glide.load.model.p
    public void c() {
    }

    @Override // com.bumptech.glide.load.model.p
    @d
    public o<HBLocalThumbModel, InputStream> d(@d s multiFactory) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{multiFactory}, this, changeQuickRedirect, false, c.g.f33216ye, new Class[]{s.class}, o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        f0.p(multiFactory, "multiFactory");
        return new a();
    }
}
