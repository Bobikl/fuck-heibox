package com.max.xiaoheihe.module.game.dota2;

import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.bumptech.glide.Glide;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.bbs.ImageCacheObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.module.bbs.LikeAnimResourceManager;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: ImageCacheManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class ImageCacheManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f87355b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f87356c = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f87357d = "ImageCacheManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f87358e = "dota2_hero";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f87359f = "dota2_item";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final String f87360g = "sp_like";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private static final String f87361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private static ImageCacheManager f87362i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final HashMap<String, String> f87363a;

    /* JADX INFO: compiled from: ImageCacheManager.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37456, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : ImageCacheManager.f87361h;
        }

        @d
        @m
        public final ImageCacheManager b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37457, new Class[0], ImageCacheManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (ImageCacheManager) patchProxyResultProxy.result;
            }
            if (ImageCacheManager.f87362i == null) {
                synchronized (this) {
                    if (ImageCacheManager.f87362i == null) {
                        a aVar = ImageCacheManager.f87355b;
                        ImageCacheManager.f87362i = new ImageCacheManager(null);
                    }
                    b2 b2Var = b2.f124493a;
                }
            }
            ImageCacheManager imageCacheManager = ImageCacheManager.f87362i;
            f0.m(imageCacheManager);
            return imageCacheManager;
        }
    }

    /* JADX INFO: compiled from: ImageCacheManager.kt */
    @t0({"SMAP\nImageCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCacheManager.kt\ncom/max/xiaoheihe/module/game/dota2/ImageCacheManager$downloadImageCacheZip$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class b implements kh.o<String, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @e
        public File a(@d String s10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 37458, new Class[]{String.class}, File.class);
            if (patchProxyResultProxy.isSupported) {
                return (File) patchProxyResultProxy.result;
            }
            f0.p(s10, "s");
            try {
                com.bumptech.glide.request.d<File> dVarV1 = Glide.F(HeyBoxApplication.C()).u().load(s10).V1();
                f0.o(dVarV1, "with(HeyBoxApplication.g…        .load(s).submit()");
                File file = dVarV1.get(60L, TimeUnit.SECONDS);
                if (file == null) {
                    return null;
                }
                File file2 = new File(ImageCacheManager.f87355b.a());
                if (!file2.exists() && !file2.mkdirs()) {
                    return null;
                }
                File file3 = new File(file2, "dota2_image_cache_" + System.currentTimeMillis() + DynamicSoManager.f77249d);
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 <= 0) {
                        fileInputStream.close();
                        fileOutputStream.close();
                        return file3;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Exception e10) {
                Log.e(ImageCacheManager.f87357d, "downloadPatch apply error: " + e10.getMessage());
                return null;
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37459, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    /* JADX INFO: compiled from: ImageCacheManager.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<ImageCacheObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f87365c;

        /* JADX INFO: compiled from: ImageCacheManager.kt */
        public static final class a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f87366a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ImageCacheObj f87367b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ImageCacheManager f87368c;

            a(String str, ImageCacheObj imageCacheObj, ImageCacheManager imageCacheManager) {
                this.f87366a = str;
                this.f87367b = imageCacheObj;
                this.f87368c = imageCacheManager;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37470, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcache.c.z(this.f87366a, this.f87367b.getVersion());
                ImageCacheManager.c(this.f87368c);
            }
        }

        c(String str) {
            this.f87365c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 37467, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            ImageCacheManager.c(ImageCacheManager.this);
        }

        public void onNext(@d Result<ImageCacheObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 37468, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            ImageCacheObj result2 = result.getResult();
            if (result2 != null) {
                ImageCacheManager imageCacheManager = ImageCacheManager.this;
                a aVar = new a(this.f87365c, result2, imageCacheManager);
                if (!com.max.hbcommon.utils.c.u(result2.getAll_zip_url())) {
                    imageCacheManager.e(result2.getAll_zip_url(), aVar);
                } else if (com.max.hbcommon.utils.c.u(result2.getAdditional_url())) {
                    ImageCacheManager.c(imageCacheManager);
                } else {
                    imageCacheManager.e(result2.getAdditional_url(), aVar);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37469, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ImageCacheObj>) obj);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(HeyBoxApplication.C().getFilesDir().toString());
        String str = File.separator;
        sb2.append(str);
        sb2.append("image_cache");
        sb2.append(str);
        f87361h = sb2.toString();
    }

    private ImageCacheManager() {
        this.f87363a = new HashMap<>();
    }

    public /* synthetic */ ImageCacheManager(u uVar) {
        this();
    }

    public static final /* synthetic */ void c(ImageCacheManager imageCacheManager) {
        if (PatchProxy.proxy(new Object[]{imageCacheManager}, null, changeQuickRedirect, true, 37455, new Class[]{ImageCacheManager.class}, Void.TYPE).isSupported) {
            return;
        }
        imageCacheManager.j();
    }

    @d
    @m
    public static final ImageCacheManager i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 37454, new Class[0], ImageCacheManager.class);
        return patchProxyResultProxy.isSupported ? (ImageCacheManager) patchProxyResultProxy.result : f87355b.b();
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37451, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k(new File(f87361h));
    }

    private final void k(File file) {
        if (!PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 37452, new Class[]{File.class}, Void.TYPE).isSupported && file.exists()) {
            if (!file.isDirectory()) {
                HashMap<String, String> map = this.f87363a;
                String strA0 = FilesKt__UtilsKt.a0(file);
                String absolutePath = file.getAbsolutePath();
                f0.o(absolutePath, "file.absolutePath");
                map.put(strA0, absolutePath);
                return;
            }
            if (f0.g(file.getName(), f87360g)) {
                LikeAnimResourceManager.f79963a.n();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File childFile : fileArrListFiles) {
                    f0.o(childFile, "childFile");
                    k(childFile);
                }
            }
        }
    }

    public final void e(@e String str, @e final l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, gVar}, this, changeQuickRedirect, false, 37453, new Class[]{String.class, l0.g.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        Log.d(f87357d, "downloadPatch start: " + str);
    }

    @e
    public final String f(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37449, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        String strA1 = com.max.xiaoheihe.utils.d.a1(str);
        String str2 = this.f87363a.get(strA1);
        Log.d(f87357d, "url: " + str + "   md5: " + strA1 + "  cachePathByUrl: " + str2);
        return str2;
    }

    public final void g(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37450, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        String str2 = com.max.hbcache.c.C0 + str;
    }

    @d
    public final HashMap<String, String> h() {
        return this.f87363a;
    }
}
