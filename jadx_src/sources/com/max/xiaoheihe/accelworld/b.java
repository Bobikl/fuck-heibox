package com.max.xiaoheihe.accelworld;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.annotation.k1;
import androidx.annotation.w0;
import androidx.fragment.app.FragmentActivity;
import com.max.hbmmkv.MMKVManager;
import com.max.hbpermission.PermissionManager;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Result;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__IndentKt;

/* JADX INFO: compiled from: AccelWordFile.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWordFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWordFile.kt\ncom/max/xiaoheihe/accelworld/AccelWordFileKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n1#2:313\n1855#3,2:314\n1855#3,2:316\n*S KotlinDebug\n*F\n+ 1 AccelWordFile.kt\ncom/max/xiaoheihe/accelworld/AccelWordFileKt\n*L\n261#1:314,2\n293#1:316,2\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f76734a = "AccelWordFile";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: AccelWordFile.kt */
    public static final class a implements com.max.hbpermission.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f76735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f76736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0621b f76737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f76740f;

        a(FragmentActivity fragmentActivity, int i10, C0621b c0621b, boolean z10, boolean z11, boolean z12) {
            this.f76735a = fragmentActivity;
            this.f76736b = i10;
            this.f76737c = c0621b;
            this.f76738d = z10;
            this.f76739e = z11;
            this.f76740f = z12;
        }

        @Override // com.max.hbpermission.c
        public final void onResult() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.cv, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            com.max.mediaselector.e.k(this.f76735a, this.f76736b, this.f76737c, this.f76738d, this.f76739e, false, true, this.f76740f);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.accelworld.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccelWordFile.kt */
    public static final class C0621b implements oe.t<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c<List<? extends LocalMedia>> f76741a;

        /* JADX WARN: Multi-variable type inference failed */
        C0621b(kotlin.coroutines.c<? super List<? extends LocalMedia>> cVar) {
            this.f76741a = cVar;
        }

        @Override // oe.t
        public void onCancel() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ev, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            kotlin.coroutines.c<List<? extends LocalMedia>> cVar = this.f76741a;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(CollectionsKt__CollectionsKt.E()));
        }

        @Override // oe.t
        public void onResult(@dl.e ArrayList<LocalMedia> arrayList) {
            List listE;
            if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, bb.c.m.dv, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
                return;
            }
            if (arrayList == null || (listE = CollectionsKt___CollectionsKt.n2(arrayList)) == null) {
                listE = CollectionsKt__CollectionsKt.E();
            }
            kotlin.coroutines.c<List<? extends LocalMedia>> cVar = this.f76741a;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(listE));
        }
    }

    /* JADX INFO: compiled from: AccelWordFile.kt */
    public static final class c implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c<List<String>> f76742a;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlin.coroutines.c<? super List<String>> cVar) {
            this.f76742a = cVar;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.e String[] strArr, @dl.d String extra) {
            List listE;
            if (PatchProxy.proxy(new Object[]{strArr, extra}, this, changeQuickRedirect, false, bb.c.m.fv, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(extra, "extra");
            kotlin.coroutines.c<List<String>> cVar = this.f76742a;
            if (strArr == null || (listE = ArraysKt___ArraysKt.kz(strArr)) == null) {
                listE = CollectionsKt__CollectionsKt.E();
            }
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(listE));
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.d String error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, bb.c.m.gv, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
            kotlin.coroutines.c<List<String>> cVar = this.f76742a;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(CollectionsKt__CollectionsKt.E()));
            com.max.hbutils.utils.x.p("[上传失败]\n" + error);
        }
    }

    /* JADX INFO: compiled from: AccelWordFile.kt */
    public static final class d implements com.max.xiaoheihe.module.upload.g.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c<List<String>> f76743a;

        /* JADX WARN: Multi-variable type inference failed */
        d(kotlin.coroutines.c<? super List<String>> cVar) {
            this.f76743a = cVar;
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ void a(float f10) {
            com.max.xiaoheihe.module.upload.h.b(this, f10);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean b() {
            return com.max.xiaoheihe.module.upload.h.a(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void c(@dl.e String[] strArr, @dl.d String extra) {
            List listE;
            if (PatchProxy.proxy(new Object[]{strArr, extra}, this, changeQuickRedirect, false, bb.c.m.hv, new Class[]{String[].class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(extra, "extra");
            kotlin.coroutines.c<List<String>> cVar = this.f76743a;
            if (strArr == null || (listE = ArraysKt___ArraysKt.kz(strArr)) == null) {
                listE = CollectionsKt__CollectionsKt.E();
            }
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(listE));
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public /* synthetic */ boolean d() {
            return com.max.xiaoheihe.module.upload.h.c(this);
        }

        @Override // com.max.xiaoheihe.module.upload.g.e
        public void e(@dl.d String error) {
            if (PatchProxy.proxy(new Object[]{error}, this, changeQuickRedirect, false, bb.c.m.iv, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(error, "error");
            kotlin.coroutines.c<List<String>> cVar = this.f76743a;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(CollectionsKt__CollectionsKt.E()));
            com.max.hbutils.utils.x.p("[上传失败]\n" + error);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:41:0x0118, B:43:0x011c, B:45:0x0126), top: B:58:0x0118 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @w0(29)
    private static final void a(ContentResolver contentResolver, InputStream inputStream, String str, String str2, v vVar) {
        Uri uriInsert;
        Object objB;
        Throwable thE;
        Integer numValueOf;
        Uri contentUri;
        b2 b2Var;
        if (PatchProxy.proxy(new Object[]{contentResolver, inputStream, str, str2, vVar}, null, changeQuickRedirect, true, bb.c.m.Tu, new Class[]{ContentResolver.class, InputStream.class, String.class, String.class, v.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            if (f0.g(Environment.getExternalStorageState(), "mounted")) {
                contentUri = Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else {
                contentUri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", com.max.mediaselector.lib.config.h.f75165f);
            contentValues.put("relative_path", l(false, 1, null) + File.separator + str2);
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis()));
            uriInsert = contentResolver.insert(contentUri, contentValues);
            if (uriInsert != null) {
                try {
                    OutputStream outputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStream != null) {
                        try {
                            f0.o(outputStream, "outputStream");
                            m(inputStream, outputStream);
                            b2 b2Var2 = b2.f124493a;
                            kotlin.io.b.a(outputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.b.a(outputStream, th2);
                                throw th3;
                            }
                        }
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(uriInsert, contentValues, null, null);
                } catch (Throwable th4) {
                    th = th4;
                    Result.a aVar2 = Result.f124476c;
                    objB = Result.b(kotlin.t0.a(th));
                    thE = Result.e(objB);
                    if (thE != null) {
                        try {
                            Result.a aVar3 = Result.f124476c;
                            if (uriInsert != null) {
                                numValueOf = Integer.valueOf(contentResolver.delete(uriInsert, null, null));
                            } else {
                                numValueOf = null;
                            }
                            Result.b(numValueOf);
                        } catch (Throwable th5) {
                            Result.a aVar4 = Result.f124476c;
                            Result.b(kotlin.t0.a(th5));
                        }
                        com.max.heybox.hblog.g.f74531b.v(StringsKt__IndentKt.p("\n                [AccelWordFile][copyToDcimHeyboxAfter28]\n                delete uir: " + uriInsert + "\n                fail cause: " + thE + "\n            "));
                        if (vVar != null) {
                            vVar.b(null, thE);
                        }
                    }
                }
            } else {
                uriInsert = null;
            }
            if (vVar != null) {
                vVar.a(uriInsert);
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            objB = Result.b(b2Var);
        } catch (Throwable th6) {
            th = th6;
            uriInsert = null;
        }
        thE = Result.e(objB);
        if (thE != null) {
            Result.a aVar5 = Result.f124476c;
            if (uriInsert != null) {
                numValueOf = Integer.valueOf(contentResolver.delete(uriInsert, null, null));
            } else {
                numValueOf = null;
            }
            Result.b(numValueOf);
            com.max.heybox.hblog.g.f74531b.v(StringsKt__IndentKt.p("\n                [AccelWordFile][copyToDcimHeyboxAfter28]\n                delete uir: " + uriInsert + "\n                fail cause: " + thE + "\n            "));
            if (vVar != null) {
                vVar.b(null, thE);
            }
        }
    }

    static /* synthetic */ void b(ContentResolver contentResolver, InputStream inputStream, String str, String str2, v vVar, int i10, Object obj) {
        String DEFAULT_PATH;
        if (PatchProxy.proxy(new Object[]{contentResolver, inputStream, str, str2, vVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Uu, new Class[]{ContentResolver.class, InputStream.class, String.class, String.class, v.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 8) != 0) {
            DEFAULT_PATH = com.max.hbimage.b.f70378c;
            f0.o(DEFAULT_PATH, "DEFAULT_PATH");
        } else {
            DEFAULT_PATH = str2;
        }
        a(contentResolver, inputStream, str, DEFAULT_PATH, vVar);
    }

    private static final void c(Context context, InputStream inputStream, String str, String str2, v vVar) {
        File file;
        Object objB;
        if (PatchProxy.proxy(new Object[]{context, inputStream, str, str2, vVar}, null, changeQuickRedirect, true, bb.c.m.Vu, new Class[]{Context.class, InputStream.class, String.class, String.class, v.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            Result.a aVar = Result.f124476c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k(true));
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append(str2);
            sb2.append(str3);
            File file2 = new File(sb2.toString());
            if (file2.exists() || file2.mkdirs()) {
                file = new File(file2, str);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        m(inputStream, fileOutputStream);
                        b2 b2Var = b2.f124493a;
                        kotlin.io.b.a(fileOutputStream, null);
                        com.max.hbimage.b.l0(context, file.getAbsolutePath());
                        if (vVar != null) {
                            vVar.a(Uri.fromFile(file));
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Result.a aVar2 = Result.f124476c;
                    objB = Result.b(kotlin.t0.a(th));
                }
            } else {
                com.max.heybox.hblog.g.f74531b.v("[AccelWordFile][copyToDcimHeyboxLegacy] cannot find or mk dir: " + file2);
                if (vVar != null) {
                    vVar.b(null, null);
                }
                file = null;
            }
            objB = Result.b(b2.f124493a);
        } catch (Throwable th5) {
            th = th5;
            file = null;
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            try {
                Result.a aVar3 = Result.f124476c;
                Result.b(file != null ? Boolean.valueOf(file.delete()) : null);
            } catch (Throwable th6) {
                Result.a aVar4 = Result.f124476c;
                Result.b(kotlin.t0.a(th6));
            }
            com.max.heybox.hblog.g.f74531b.v(StringsKt__IndentKt.p("\n                [AccelWordFile][copyToDcimHeyboxLegacy]\n                delete file: " + file + "\n                fail cause: " + thE + "\n            "));
            if (vVar != null) {
                vVar.b(null, thE);
            }
        }
    }

    static /* synthetic */ void d(Context context, InputStream inputStream, String str, String str2, v vVar, int i10, Object obj) {
        String DEFAULT_PATH;
        if (PatchProxy.proxy(new Object[]{context, inputStream, str, str2, vVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Wu, new Class[]{Context.class, InputStream.class, String.class, String.class, v.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 8) != 0) {
            DEFAULT_PATH = com.max.hbimage.b.f70378c;
            f0.o(DEFAULT_PATH, "DEFAULT_PATH");
        } else {
            DEFAULT_PATH = str2;
        }
        c(context, inputStream, str, DEFAULT_PATH, vVar);
    }

    @k1
    public static final void e(@dl.d File imgFileInPrivatePath, @dl.d String relativePathName, @dl.e v vVar) {
        Object objB;
        if (PatchProxy.proxy(new Object[]{imgFileInPrivatePath, relativePathName, vVar}, null, changeQuickRedirect, true, bb.c.m.Ru, new Class[]{File.class, String.class, v.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imgFileInPrivatePath, "imgFileInPrivatePath");
        f0.p(relativePathName, "relativePathName");
        try {
            Result.a aVar = Result.f124476c;
            String str = "heybox_" + System.currentTimeMillis() + '_' + new Random().nextInt() + ".jpg";
            Context contextA = com.max.hbimage.image.l.a();
            if (contextA == null) {
                return;
            }
            f0.o(contextA, "ImageLoaderRefManager.getInstance() ?: return");
            FileInputStream fileInputStream = new FileInputStream(imgFileInPrivatePath);
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    ContentResolver contentResolver = contextA.getContentResolver();
                    f0.o(contentResolver, "imageLoaderContext.contentResolver");
                    a(contentResolver, fileInputStream, str, relativePathName, vVar);
                } else {
                    c(contextA, fileInputStream, str, relativePathName, vVar);
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(fileInputStream, null);
                objB = Result.b(b2Var);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(kotlin.t0.a(th4));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            com.max.heybox.hblog.g.f74531b.v("[AccelWordFile][fastCopyPrivateImgToDCIMHeybox] copy fail, cause: " + thE);
            if (vVar != null) {
                vVar.b(null, thE);
            }
        }
    }

    public static /* synthetic */ void f(File file, String DEFAULT_PATH, v vVar, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{file, DEFAULT_PATH, vVar, new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Su, new Class[]{File.class, String.class, v.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            DEFAULT_PATH = com.max.hbimage.b.f70378c;
            f0.o(DEFAULT_PATH, "DEFAULT_PATH");
        }
        if ((i10 & 4) != 0) {
            vVar = null;
        }
        e(file, DEFAULT_PATH, vVar);
    }

    @dl.e
    public static final Object g(@dl.d FragmentActivity fragmentActivity, int i10, boolean z10, boolean z11, boolean z12, @dl.d kotlin.coroutines.c<? super List<? extends LocalMedia>> cVar) throws Throwable {
        Object[] objArr = {fragmentActivity, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Yu, new Class[]{FragmentActivity.class, Integer.TYPE, cls, cls, cls, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        PermissionManager.f71603a.S(fragmentActivity, new a(fragmentActivity, i10, new C0621b(hVar), z10, z11, z12));
        Object objA = hVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objA;
    }

    public static /* synthetic */ Object h(FragmentActivity fragmentActivity, int i10, boolean z10, boolean z11, boolean z12, kotlin.coroutines.c cVar, int i11, Object obj) {
        Object[] objArr = {fragmentActivity, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), cVar, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.Zu, new Class[]{FragmentActivity.class, cls, cls2, cls2, cls2, kotlin.coroutines.c.class, cls, Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        return g(fragmentActivity, i10, (i11 & 4) != 0 ? true : z10 ? 1 : 0, (i11 & 8) != 0 ? true : z11 ? 1 : 0, (i11 & 16) != 0 ? true : z12 ? 1 : 0, cVar);
    }

    @dl.e
    public static final Object i(@dl.d Context context, @dl.d io.reactivex.disposables.a aVar, @dl.d List<? extends File> list, @dl.d kotlin.coroutines.c<? super List<String>> cVar) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, aVar, list, cVar}, null, changeQuickRedirect, true, bb.c.m.bv, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getPath());
        }
        com.max.xiaoheihe.module.upload.g.h(context, aVar, arrayList, "bbs", new c(hVar));
        Object objA = hVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objA;
    }

    @dl.e
    public static final Object j(@dl.d Context context, @dl.d io.reactivex.disposables.a aVar, @dl.d List<? extends LocalMedia> list, @dl.d kotlin.coroutines.c<? super List<String>> cVar) throws Throwable {
        String realOrCompressPath;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, aVar, list, cVar}, null, changeQuickRedirect, true, bb.c.m.av, new Class[]{Context.class, io.reactivex.disposables.a.class, List.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        ArrayList arrayList = new ArrayList();
        for (LocalMedia localMedia : list) {
            if (!com.max.mediaselector.lib.config.f.i(localMedia.A()) && (realOrCompressPath = localMedia.G()) != null) {
                f0.o(realOrCompressPath, "realOrCompressPath");
                arrayList.add(realOrCompressPath);
            }
        }
        com.max.xiaoheihe.module.upload.g.h(context, aVar, arrayList, "bbs", new d(hVar));
        Object objA = hVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objA;
    }

    @dl.d
    public static final String k(boolean z10) {
        String path;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.Pu, new Class[]{Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (MMKVManager.f71329a.d("common", ad.c.f1229i, false, false)) {
            path = z10 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath() : Environment.DIRECTORY_PICTURES;
            f0.o(path, "{\n        if (isLegacy) …_PICTURES\n        }\n    }");
        } else {
            path = z10 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath() : Environment.DIRECTORY_DCIM;
            f0.o(path, "{\n        if (isLegacy) …TORY_DCIM\n        }\n    }");
        }
        return path;
    }

    public static /* synthetic */ String l(boolean z10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, bb.c.m.Qu, new Class[]{Boolean.TYPE, Integer.TYPE, Object.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return k(z10);
    }

    private static final void m(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, outputStream}, null, changeQuickRedirect, true, bb.c.m.Xu, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        byte[] bArr = new byte[4194304];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }
}
