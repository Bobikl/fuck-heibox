package com.max.mediaselector.utils;

import android.util.Log;
import com.max.hbutils.core.BaseApplication;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.util.IUCropServiceImpl;
import dl.d;
import dl.e;
import java.io.File;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import pb.f;

/* JADX INFO: compiled from: PictureCacheManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@t0({"SMAP\nPictureCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PictureCacheManager.kt\ncom/max/mediaselector/utils/PictureCacheManager\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,148:1\n49#2,4:149\n*S KotlinDebug\n*F\n+ 1 PictureCacheManager.kt\ncom/max/mediaselector/utils/PictureCacheManager\n*L\n26#1:149,4\n*E\n"})
public final class PictureCacheManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f75669b = "PictureCacheManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f75670c = "disable_picture_cache_manager_use_external_cache";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f75673f = "optimizer_output";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final PictureCacheManager f75668a = new PictureCacheManager();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private static final q0 f75671d = r0.a(e1.c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final l0 f75672e = new a(l0.INSTANCE);

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @t0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 PictureCacheManager.kt\ncom/max/mediaselector/utils/PictureCacheManager\n*L\n1#1,110:1\n27#2,5:111\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements l0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(l0.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.l0
        public void C(@d CoroutineContext coroutineContext, @d Throwable th2) {
            if (PatchProxy.proxy(new Object[]{coroutineContext, th2}, this, changeQuickRedirect, false, bb.c.m.Rc, new Class[]{CoroutineContext.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            g.a aVar = g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PictureCacheManagerCoroutineExceptionHandler got ");
            sb2.append(th2);
            sb2.append(" with suppressed ");
            String string = Arrays.toString(th2.getSuppressed());
            f0.o(string, "toString(...)");
            sb2.append(string);
            aVar.q(sb2.toString());
        }
    }

    private PictureCacheManager() {
    }

    private final File i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.f35088vc, new Class[]{String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        File cacheDir = m() ? BaseApplication.a().getCacheDir() : BaseApplication.a().getExternalCacheDir();
        if (cacheDir == null) {
            if (Log.isLoggable(f75669b, 6)) {
                Log.e(f75669b, "default disk cache dir is null");
            }
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            return file;
        }
        return null;
    }

    private final boolean m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35110wc, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f fVarI = ob.a.i();
        if (fVarI != null) {
            return fVarI.p(f75670c, false);
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34909nc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(f75671d, f75672e, null, new PictureCacheManager$clearCompressCache$1(null), 2, null);
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34955pc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(f75671d, f75672e, null, new PictureCacheManager$clearEditDraftFile$1(null), 2, null);
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34886mc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(f75671d, f75672e, null, new PictureCacheManager$clearProcessingCache$1(null), 2, null);
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34978qc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(f75671d, f75672e, null, new PictureCacheManager$clearRubbish$1(null), 2, null);
    }

    public final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34932oc, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(f75671d, f75672e, null, new PictureCacheManager$clearUCropCache$1(null), 2, null);
    }

    @d
    public final File f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35022sc, new Class[0], File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        return new File(BaseApplication.a().getCacheDir().getPath() + File.separator + PictureVideoEditPostFragment.Y3);
    }

    @d
    public final l0 g() {
        return f75672e;
    }

    @e
    public final File h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35000rc, new Class[0], File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : i(f75673f);
    }

    @d
    public final q0 j() {
        return f75671d;
    }

    @d
    public final File k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35044tc, new Class[0], File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : new File(l());
    }

    @d
    public final String l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35066uc, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return BaseApplication.a().getCacheDir().getPath() + File.separator + IUCropServiceImpl.UCROP_OUTPUT_PATH;
    }
}
