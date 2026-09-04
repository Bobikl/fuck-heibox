package com.max.hbcache;

import android.text.TextUtils;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.s;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;

/* JADX INFO: compiled from: CacheUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f66094a = 20971520;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66095b = "http_request_cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66096c = "animations_key";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: CacheUtils.java */
    public class a<T> implements c0<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f66099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f66100d;

        a(String str, String str2, Class cls, Object obj) {
            this.f66097a = str;
            this.f66098b = str2;
            this.f66099c = cls;
            this.f66100d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r4v8, types: [java.io.FileInputStream, java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.io.InputStreamReader, java.io.Reader] */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v18, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
        @Override // io.reactivex.c0
        public void a(@jh.e b0<T> b0Var) throws Exception {
            Exception e10;
            StringBuilder sb2;
            ?? fileInputStream = {b0Var};
            ?? inputStreamReader = this;
            if (PatchProxy.proxy(fileInputStream, inputStreamReader, changeQuickRedirect, false, bb.c.b.Ao, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            BufferedReader bufferedReader = null;
            try {
                try {
                    File file = new File(BaseApplication.a().getCacheDir(), this.f66097a);
                    if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                        fileInputStream = new FileInputStream(new File(file, this.f66098b));
                        try {
                            inputStreamReader = new InputStreamReader(fileInputStream);
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        } else {
                                            sb3.append(line);
                                        }
                                    }
                                    String string = sb3.toString();
                                    if (TextUtils.isEmpty(string)) {
                                        ?? r10 = this.f66100d;
                                        if (r10 != null) {
                                            b0Var.onNext(r10);
                                        }
                                    } else {
                                        ?? A = k.a(string, this.f66099c);
                                        if (A != null) {
                                            b0Var.onNext(A);
                                        }
                                    }
                                    bufferedReader = bufferedReader2;
                                    fileInputStream = fileInputStream;
                                    inputStreamReader = inputStreamReader;
                                } catch (Exception e11) {
                                    e10 = e11;
                                    bufferedReader = bufferedReader2;
                                    g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e10.getMessage());
                                    ?? r11 = this.f66100d;
                                    if (r11 != null) {
                                        b0Var.onNext(r11);
                                        b0Var.onComplete();
                                    } else {
                                        b0Var.onError(e10);
                                    }
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e12) {
                                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e12.getMessage());
                                        }
                                    }
                                    if (inputStreamReader != 0) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e13) {
                                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e13.getMessage());
                                        }
                                    }
                                    if (fileInputStream != 0) {
                                        try {
                                            fileInputStream.close();
                                            return;
                                        } catch (IOException e14) {
                                            e = e14;
                                            sb2 = new StringBuilder();
                                            sb2.append("getCache dir: ");
                                            sb2.append(this.f66097a);
                                            sb2.append("  name: ");
                                            sb2.append(this.f66098b);
                                            sb2.append("  error: ");
                                            sb2.append(e.getMessage());
                                            g.G(sb2.toString());
                                        }
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e15) {
                                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e15.getMessage());
                                        }
                                    }
                                    if (inputStreamReader != 0) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e16) {
                                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e16.getMessage());
                                        }
                                    }
                                    if (fileInputStream == 0) {
                                        throw th;
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (IOException e17) {
                                        g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e17.getMessage());
                                        throw th;
                                    }
                                }
                            } catch (Exception e18) {
                                e10 = e18;
                            }
                        } catch (Exception e19) {
                            e10 = e19;
                            inputStreamReader = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamReader = 0;
                        }
                    } else {
                        fileInputStream = 0;
                        inputStreamReader = 0;
                    }
                    b0Var.onComplete();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e20) {
                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e20.getMessage());
                        }
                    }
                    if (inputStreamReader != 0) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e21) {
                            g.G("getCache dir: " + this.f66097a + "  name: " + this.f66098b + "  error: " + e21.getMessage());
                        }
                    }
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e22) {
                            e = e22;
                            sb2 = new StringBuilder();
                            sb2.append("getCache dir: ");
                            sb2.append(this.f66097a);
                            sb2.append("  name: ");
                            sb2.append(this.f66098b);
                            sb2.append("  error: ");
                            sb2.append(e.getMessage());
                            g.G(sb2.toString());
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e23) {
                inputStreamReader = 0;
                e10 = e23;
                fileInputStream = 0;
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = 0;
                inputStreamReader = 0;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.max.hbcache.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheUtils.java */
    public class C0532b<T> implements c0<List<T>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f66103c;

        C0532b(String str, String str2, Class cls) {
            this.f66101a = str;
            this.f66102b = str2;
            this.f66103c = cls;
        }

        @Override // io.reactivex.c0
        public void a(@jh.e b0<List<T>> b0Var) throws Exception {
            FileInputStream fileInputStream;
            InputStreamReader inputStreamReader;
            Exception e10;
            StringBuilder sb2;
            List<T> listB;
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, bb.c.b.Bo, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            BufferedReader bufferedReader = null;
            try {
                File file = new File(BaseApplication.a().getCacheDir(), this.f66101a);
                if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                    fileInputStream = new FileInputStream(new File(file, this.f66102b));
                    try {
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        try {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                                try {
                                    StringBuilder sb3 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        } else {
                                            sb3.append(line);
                                        }
                                        sb2.append("getCache dir: ");
                                        sb2.append(this.f66101a);
                                        sb2.append("  name: ");
                                        sb2.append(this.f66102b);
                                        sb2.append("  error: ");
                                        sb2.append(e.getMessage());
                                        g.G(sb2.toString());
                                        return;
                                    }
                                    String string = sb3.toString();
                                    if (!TextUtils.isEmpty(string) && (listB = k.b(string, this.f66103c)) != null) {
                                        b0Var.onNext(listB);
                                    }
                                    bufferedReader = bufferedReader2;
                                } catch (Exception e11) {
                                    e10 = e11;
                                    bufferedReader = bufferedReader2;
                                    g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e10.getMessage());
                                    b0Var.b(e10);
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e12) {
                                            g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e12.getMessage());
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e13) {
                                            g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e13.getMessage());
                                        }
                                    }
                                    if (fileInputStream == null) {
                                        return;
                                    }
                                    try {
                                        fileInputStream.close();
                                        return;
                                    } catch (IOException e14) {
                                        e = e14;
                                        sb2 = new StringBuilder();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e15) {
                                            g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e15.getMessage());
                                        }
                                    }
                                    if (inputStreamReader != null) {
                                        try {
                                            inputStreamReader.close();
                                        } catch (IOException e16) {
                                            g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e16.getMessage());
                                        }
                                    }
                                    if (fileInputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th;
                                    } catch (IOException e17) {
                                        g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e17.getMessage());
                                        throw th;
                                    }
                                }
                            } catch (Exception e18) {
                                e10 = e18;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Exception e19) {
                        e10 = e19;
                        inputStreamReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                } else {
                    fileInputStream = null;
                    inputStreamReader = null;
                }
                b0Var.onComplete();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e20) {
                        g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e20.getMessage());
                    }
                }
                if (inputStreamReader != null) {
                    try {
                        inputStreamReader.close();
                    } catch (IOException e21) {
                        g.G("getCache dir: " + this.f66101a + "  name: " + this.f66102b + "  error: " + e21.getMessage());
                    }
                }
                if (fileInputStream == null) {
                    return;
                }
                try {
                    fileInputStream.close();
                } catch (IOException e22) {
                    e = e22;
                    sb2 = new StringBuilder();
                }
            } catch (Exception e23) {
                inputStreamReader = null;
                e10 = e23;
                fileInputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                inputStreamReader = null;
            }
        }
    }

    /* JADX INFO: compiled from: CacheUtils.java */
    public class c extends io.reactivex.observers.d<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void a(@jh.e Class cls) {
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(@jh.e Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(@jh.e Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Co, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Class) obj);
        }
    }

    /* JADX INFO: compiled from: CacheUtils.java */
    public class d implements c0<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f66106c;

        d(String str, String str2, Object obj) {
            this.f66104a = str;
            this.f66105b = str2;
            this.f66106c = obj;
        }

        @Override // io.reactivex.c0
        public void a(@jh.e b0<Class> b0Var) throws Exception {
            FileOutputStream fileOutputStream;
            Exception e10;
            StringBuilder sb2;
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, bb.c.b.Do, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                File file = new File(BaseApplication.a().getCacheDir(), this.f66104a);
                if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                    fileOutputStream = new FileOutputStream(new File(file, this.f66105b));
                    try {
                        try {
                            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream);
                            try {
                                String strP = k.p(this.f66106c);
                                if (!TextUtils.isEmpty(strP)) {
                                    outputStreamWriter2.write(strP);
                                }
                                outputStreamWriter = outputStreamWriter2;
                            } catch (Exception e11) {
                                e10 = e11;
                                outputStreamWriter = outputStreamWriter2;
                                g.G("getCache dir: " + this.f66104a + "  name: " + this.f66105b + "  error: " + e10.getMessage());
                                b0Var.onError(e10);
                                if (outputStreamWriter != null) {
                                    try {
                                        outputStreamWriter.close();
                                    } catch (IOException e12) {
                                        g.G("getCache dir: " + this.f66104a + "  name: " + this.f66105b + "  error: " + e12.getMessage());
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException e13) {
                                        e = e13;
                                        sb2 = new StringBuilder();
                                        sb2.append("getCache dir: ");
                                        sb2.append(this.f66104a);
                                        sb2.append("  name: ");
                                        sb2.append(this.f66105b);
                                        sb2.append("  error: ");
                                        sb2.append(e.getMessage());
                                        g.G(sb2.toString());
                                    }
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                outputStreamWriter = outputStreamWriter2;
                                if (outputStreamWriter != null) {
                                    try {
                                        outputStreamWriter.close();
                                    } catch (IOException e14) {
                                        g.G("getCache dir: " + this.f66104a + "  name: " + this.f66105b + "  error: " + e14.getMessage());
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e15) {
                                    g.G("getCache dir: " + this.f66104a + "  name: " + this.f66105b + "  error: " + e15.getMessage());
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            e10 = e16;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    fileOutputStream = null;
                }
                b0Var.onComplete();
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e17) {
                        g.G("getCache dir: " + this.f66104a + "  name: " + this.f66105b + "  error: " + e17.getMessage());
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e18) {
                        e = e18;
                        sb2 = new StringBuilder();
                        sb2.append("getCache dir: ");
                        sb2.append(this.f66104a);
                        sb2.append("  name: ");
                        sb2.append(this.f66105b);
                        sb2.append("  error: ");
                        sb2.append(e.getMessage());
                        g.G(sb2.toString());
                    }
                }
            } catch (Exception e19) {
                e10 = e19;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
    }

    /* JADX INFO: compiled from: CacheUtils.java */
    public class e extends io.reactivex.observers.d<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        public void a(@jh.e Class cls) {
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(@jh.e Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(@jh.e Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.b.Eo, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Class) obj);
        }
    }

    /* JADX INFO: compiled from: CacheUtils.java */
    public class f implements c0<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f66107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f66108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f66109c;

        f(String str, String str2, List list) {
            this.f66107a = str;
            this.f66108b = str2;
            this.f66109c = list;
        }

        @Override // io.reactivex.c0
        public void a(@jh.e b0<Class> b0Var) throws Exception {
            FileOutputStream fileOutputStream;
            Exception e10;
            StringBuilder sb2;
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, bb.c.b.Fo, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                File file = new File(BaseApplication.a().getCacheDir(), this.f66107a);
                if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                    fileOutputStream = new FileOutputStream(new File(file, this.f66108b));
                    try {
                        try {
                            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream);
                            try {
                                String strR = k.r(this.f66109c);
                                if (!TextUtils.isEmpty(strR)) {
                                    outputStreamWriter2.write(strR);
                                }
                                outputStreamWriter = outputStreamWriter2;
                            } catch (Exception e11) {
                                e10 = e11;
                                outputStreamWriter = outputStreamWriter2;
                                g.G("getCache dir: " + this.f66107a + "  name: " + this.f66108b + "  error: " + e10.getMessage());
                                b0Var.onError(e10);
                                if (outputStreamWriter != null) {
                                    try {
                                        outputStreamWriter.close();
                                    } catch (IOException e12) {
                                        g.G("getCache dir: " + this.f66107a + "  name: " + this.f66108b + "  error: " + e12.getMessage());
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        return;
                                    } catch (IOException e13) {
                                        e = e13;
                                        sb2 = new StringBuilder();
                                        sb2.append("getCache dir: ");
                                        sb2.append(this.f66107a);
                                        sb2.append("  name: ");
                                        sb2.append(this.f66108b);
                                        sb2.append("  error: ");
                                        sb2.append(e.getMessage());
                                        g.G(sb2.toString());
                                    }
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                outputStreamWriter = outputStreamWriter2;
                                if (outputStreamWriter != null) {
                                    try {
                                        outputStreamWriter.close();
                                    } catch (IOException e14) {
                                        g.G("getCache dir: " + this.f66107a + "  name: " + this.f66108b + "  error: " + e14.getMessage());
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e15) {
                                    g.G("getCache dir: " + this.f66107a + "  name: " + this.f66108b + "  error: " + e15.getMessage());
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            e10 = e16;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    fileOutputStream = null;
                }
                b0Var.onComplete();
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e17) {
                        g.G("getCache dir: " + this.f66107a + "  name: " + this.f66108b + "  error: " + e17.getMessage());
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e18) {
                        e = e18;
                        sb2 = new StringBuilder();
                        sb2.append("getCache dir: ");
                        sb2.append(this.f66107a);
                        sb2.append("  name: ");
                        sb2.append(this.f66108b);
                        sb2.append("  error: ");
                        sb2.append(e.getMessage());
                        g.G(sb2.toString());
                    }
                }
            } catch (Exception e19) {
                e10 = e19;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
    }

    public static <T> z<T> a(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, bb.c.b.po, new Class[]{String.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : c(f66095b, e(str), cls);
    }

    public static <T> z<T> b(String str, T t10, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, t10, cls}, null, changeQuickRedirect, true, bb.c.b.qo, new Class[]{String.class, Object.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : d(f66095b, e(str), t10, cls);
    }

    public static <T> z<T> c(String str, String str2, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cls}, null, changeQuickRedirect, true, bb.c.b.ro, new Class[]{String.class, String.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : d(str, str2, null, cls);
    }

    public static <T> z<T> d(String str, String str2, T t10, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, t10, cls}, null, changeQuickRedirect, true, bb.c.b.so, new Class[]{String.class, String.class, Object.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.q1(new a(str, str2, cls, t10));
    }

    public static String e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.zo, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return s.d(str + (-1)) + ".cache";
    }

    public static <T> z<List<T>> f(String str, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, bb.c.b.to, new Class[]{String.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : g(f66095b, e(str), cls);
    }

    public static <T> z<List<T>> g(String str, String str2, Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, cls}, null, changeQuickRedirect, true, bb.c.b.uo, new Class[]{String.class, String.class, Class.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.q1(new C0532b(str, str2, cls));
    }

    public static <T> io.reactivex.disposables.b h(String str, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, t10}, null, changeQuickRedirect, true, bb.c.b.vo, new Class[]{String.class, Object.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : i(f66095b, e(str), t10);
    }

    public static <T> io.reactivex.disposables.b i(String str, String str2, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, t10}, null, changeQuickRedirect, true, bb.c.b.wo, new Class[]{String.class, String.class, Object.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) z.q1(new d(str, str2, t10)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c());
    }

    public static <T> io.reactivex.disposables.b j(String str, String str2, List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list}, null, changeQuickRedirect, true, bb.c.b.yo, new Class[]{String.class, String.class, List.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) z.q1(new f(str, str2, list)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e());
    }

    public static <T> io.reactivex.disposables.b k(String str, List<T> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, null, changeQuickRedirect, true, bb.c.b.xo, new Class[]{String.class, List.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : j(f66095b, e(str), list);
    }
}
