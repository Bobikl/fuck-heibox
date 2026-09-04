package ia;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import okhttp3.c0;

/* JADX INFO: compiled from: BitmapCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b extends a<Bitmap> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.lzy.okgo.convert.a f119330a;

    public b() {
        this.f119330a = new com.lzy.okgo.convert.a();
    }

    public b(int i10, int i11) {
        this.f119330a = new com.lzy.okgo.convert.a(i10, i11);
    }

    public b(int i10, int i11, Bitmap.Config config, ImageView.ScaleType scaleType) {
        this.f119330a = new com.lzy.okgo.convert.a(i10, i11, config, scaleType);
    }

    @Override // com.lzy.okgo.convert.b
    public /* bridge */ /* synthetic */ Object g(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 406, new Class[]{c0.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h(c0Var);
    }

    public Bitmap h(c0 c0Var) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{c0Var}, this, changeQuickRedirect, false, 405, new Class[]{c0.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmapH = this.f119330a.h(c0Var);
        c0Var.close();
        return bitmapH;
    }
}
