package com.max.xiaoheihe.module.hotfix;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.compose.runtime.internal.o;
import com.bumptech.glide.Glide;
import com.max.hbcache.c;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.n;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.hotfix.HotFixPatchObj;
import com.max.xiaoheihe.bean.hotfix.HotFixPatchResultObj;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.max.xiaoheihe.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import io.reactivex.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;
import xh.m;

/* JADX INFO: compiled from: HotFixManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class HotFixManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f88631b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88632c = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f88633d = "HotFixManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f88634e = "patch.jar";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final String f88635f = "KEY_INSTALL_PATCH_VERSION";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private static HotFixManager f88636g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private String f88637a;

    /* JADX INFO: compiled from: HotFixManager.kt */
    @t0({"SMAP\nHotFixManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotFixManager.kt\ncom/max/xiaoheihe/module/hotfix/HotFixManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        @m
        public final String a(@d String filePath) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filePath}, this, changeQuickRedirect, false, 38534, new Class[]{String.class}, String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            f0.p(filePath, "filePath");
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(filePath);
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
                fileInputStream.close();
                byte[] mdBytes = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                f0.o(mdBytes, "mdBytes");
                for (byte b10 : mdBytes) {
                    String string = Integer.toString((b10 & 255) + 256, 16);
                    f0.o(string, "toString((mdByte.toInt() and 0xff) + 0x100, 16)");
                    String strSubstring = string.substring(1);
                    f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                }
                return sb2.toString();
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            } catch (NoSuchAlgorithmException e11) {
                e11.printStackTrace();
                return null;
            }
        }

        @d
        @m
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38533, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(BaseApplication.a().getFilesDir().toString());
            String str = File.separator;
            sb2.append(str);
            sb2.append("hotfix");
            sb2.append(str);
            return sb2.toString();
        }

        @e
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38535, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return c.j(HotFixManager.f88635f + l.i());
        }

        @d
        @m
        public final HotFixManager d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38532, new Class[0], HotFixManager.class);
            if (patchProxyResultProxy.isSupported) {
                return (HotFixManager) patchProxyResultProxy.result;
            }
            if (e() == null) {
                synchronized (HotFixManager.class) {
                    a aVar = HotFixManager.f88631b;
                    if (aVar.e() == null) {
                        aVar.g(new HotFixManager(null));
                    }
                    b2 b2Var = b2.f124493a;
                }
            }
            HotFixManager hotFixManagerE = e();
            f0.m(hotFixManagerE);
            return hotFixManagerE;
        }

        @e
        public final HotFixManager e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38530, new Class[0], HotFixManager.class);
            return patchProxyResultProxy.isSupported ? (HotFixManager) patchProxyResultProxy.result : HotFixManager.f88636g;
        }

        @m
        public final void f(@e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38536, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            c.z(HotFixManager.f88635f + l.i(), str);
        }

        public final void g(@e HotFixManager hotFixManager) {
            if (PatchProxy.proxy(new Object[]{hotFixManager}, this, changeQuickRedirect, false, 38531, new Class[]{HotFixManager.class}, Void.TYPE).isSupported) {
                return;
            }
            HotFixManager.f88636g = hotFixManager;
        }
    }

    /* JADX INFO: compiled from: HotFixManager.kt */
    @t0({"SMAP\nHotFixManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotFixManager.kt\ncom/max/xiaoheihe/module/hotfix/HotFixManager$downloadPatch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
    public static final class b implements kh.o<String, File> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @e
        public File a(@d String s10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 38537, new Class[]{String.class}, File.class);
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
                File file2 = new File(HotFixManager.f88631b.b());
                if (!file2.exists() && !file2.mkdirs()) {
                    return null;
                }
                File file3 = new File(file2, "hotfix" + System.currentTimeMillis() + DynamicSoManager.f77249d);
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
                g.f74531b.v("HotFixManager downloadPatch apply error: " + e10.getMessage());
                return null;
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File, java.lang.Object] */
        @Override // kh.o
        public /* bridge */ /* synthetic */ File apply(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 38538, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
        }
    }

    private HotFixManager() {
    }

    public /* synthetic */ HotFixManager(u uVar) {
        this();
    }

    public static final /* synthetic */ void b(HotFixManager hotFixManager) {
        if (PatchProxy.proxy(new Object[]{hotFixManager}, null, changeQuickRedirect, true, 38529, new Class[]{HotFixManager.class}, Void.TYPE).isSupported) {
            return;
        }
        hotFixManager.i();
    }

    @e
    @m
    public static final String e(@d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38527, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f88631b.a(str);
    }

    @d
    @m
    public static final String f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38526, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f88631b.b();
    }

    @d
    @m
    public static final HotFixManager g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38525, new Class[0], HotFixManager.class);
        return patchProxyResultProxy.isSupported ? (HotFixManager) patchProxyResultProxy.result : f88631b.d();
    }

    private final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38524, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new PatchExecutor(BaseApplication.a(), new com.max.xiaoheihe.module.hotfix.a(), new com.max.xiaoheihe.module.hotfix.b()).start();
    }

    @m
    public static final void j(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 38528, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f88631b.f(str);
    }

    public final void d(@e String str, @e final String str2, @e final String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 38523, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        z.I2(str).z3(new b()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<File>() { // from class: com.max.xiaoheihe.module.hotfix.HotFixManager$downloadPatch$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 38539, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                Log.e(HotFixManager.f88633d, "download failed");
            }

            @SuppressLint({"CheckResult"})
            public void onNext(@d File file) {
                if (PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, 38540, new Class[]{File.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(file, "file");
                super.onNext(file);
                if (file.exists()) {
                    k.f(r0.a(e1.c()), null, null, new HotFixManager$downloadPatch$2$onNext$1(file, str2, this, str3, null), 3, null);
                } else {
                    g.f74531b.v("HotFixManager 下载的文件不存在");
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38541, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((File) obj);
            }
        });
    }

    @e
    public final String h() {
        return this.f88637a;
    }

    public final void k(@e String str) {
        this.f88637a = str;
    }

    public final void l(@e HotFixPatchResultObj hotFixPatchResultObj) {
        HotFixPatchObj patch_bit;
        if (PatchProxy.proxy(new Object[]{hotFixPatchResultObj}, this, changeQuickRedirect, false, 38522, new Class[]{HotFixPatchResultObj.class}, Void.TYPE).isSupported || hotFixPatchResultObj == null || (patch_bit = hotFixPatchResultObj.getPatch_bit()) == null) {
            return;
        }
        if (patch_bit.getInstall() == null || f0.g(patch_bit.getInstall(), Boolean.TRUE)) {
            a aVar = f88631b;
            String strC = aVar.c();
            int iQ = n.q(patch_bit.getFix_package_version());
            int iQ2 = n.q(strC);
            g.f74531b.M("HotFixManager  installVersionNum: " + iQ2 + "  originVersionNum: " + iQ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aVar.b());
            sb2.append("patch.jar");
            File file = new File(sb2.toString());
            if (iQ <= iQ2 && file.exists()) {
                if (iQ == iQ2) {
                    i();
                    return;
                }
                return;
            }
            EncryptionParamsObj fix_package_url = patch_bit.getFix_package_url();
            if (fix_package_url != null) {
                String strC2 = com.max.hbcommon.utils.e.c(fix_package_url.getP1(), w.c(fix_package_url.getP3()));
                if (f0.g(com.max.xiaoheihe.utils.d.a1(strC2), fix_package_url.getP2())) {
                    d(strC2, patch_bit.getMd5(), patch_bit.getFix_package_version());
                }
            }
        }
    }
}
