package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.k1;
import androidx.annotation.p0;
import androidx.annotation.u0;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.w;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import org.json.JSONObject;

/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, q<com.airbnb.lottie.g>> f37341a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f37342b = {80, org.apache.tools.tar.c.N, 3, 4};

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class a implements l<com.airbnb.lottie.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37343a;

        a(String str) {
            this.f37343a = str;
        }

        @Override // com.airbnb.lottie.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(com.airbnb.lottie.g gVar) {
            h.f37341a.remove(this.f37343a);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class b implements l<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37344a;

        b(String str) {
            this.f37344a = str;
        }

        @Override // com.airbnb.lottie.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th2) {
            h.f37341a.remove(this.f37344a);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class c implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37347d;

        c(Context context, String str, String str2) {
            this.f37345b = context;
            this.f37346c = str;
            this.f37347d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            p<com.airbnb.lottie.g> pVarC = com.airbnb.lottie.e.d(this.f37345b).c(this.f37346c, this.f37347d);
            if (this.f37347d != null && pVarC.b() != null) {
                com.airbnb.lottie.model.f.c().d(this.f37347d, pVarC.b());
            }
            return pVarC;
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class d implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f37348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37350d;

        d(Context context, String str, String str2) {
            this.f37348b = context;
            this.f37349c = str;
            this.f37350d = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.h(this.f37348b, this.f37349c, this.f37350d);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class e implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference f37351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f37352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f37353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37354e;

        e(WeakReference weakReference, Context context, int i10, String str) {
            this.f37351b = weakReference;
            this.f37352c = context;
            this.f37353d = i10;
            this.f37354e = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            Context context = (Context) this.f37351b.get();
            if (context == null) {
                context = this.f37352c;
            }
            return h.v(context, this.f37353d, this.f37354e);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class f implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f37355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37356c;

        f(InputStream inputStream, String str) {
            this.f37355b = inputStream;
            this.f37356c = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.k(this.f37355b, this.f37356c);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class g implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f37357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37358c;

        g(JSONObject jSONObject, String str) {
            this.f37357b = jSONObject;
            this.f37358c = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.r(this.f37357b, this.f37358c);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class CallableC0284h implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37360c;

        CallableC0284h(String str, String str2) {
            this.f37359b = str;
            this.f37360c = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.q(this.f37359b, this.f37360c);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class i implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonReader f37361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37362c;

        i(JsonReader jsonReader, String str) {
            this.f37361b = jsonReader;
            this.f37362c = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.n(this.f37361b, this.f37362c);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class j implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ZipInputStream f37363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37364c;

        j(ZipInputStream zipInputStream, String str) {
            this.f37363b = zipInputStream;
            this.f37364c = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return h.B(this.f37363b, this.f37364c);
        }
    }

    /* JADX INFO: compiled from: LottieCompositionFactory.java */
    public class k implements Callable<p<com.airbnb.lottie.g>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.g f37365b;

        k(com.airbnb.lottie.g gVar) {
            this.f37365b = gVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            return new p<>(this.f37365b);
        }
    }

    private h() {
    }

    public static q<com.airbnb.lottie.g> A(ZipInputStream zipInputStream, @p0 String str) {
        return b(str, new j(zipInputStream, str));
    }

    @k1
    public static p<com.airbnb.lottie.g> B(ZipInputStream zipInputStream, @p0 String str) {
        try {
            return C(zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.j.c(zipInputStream);
        }
    }

    @k1
    private static p<com.airbnb.lottie.g> C(ZipInputStream zipInputStream, @p0 String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            com.airbnb.lottie.g gVarB = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    gVarB = o(JsonReader.o(Okio.buffer(Okio.source(zipInputStream))), null, false).b();
                } else if (name.contains(com.max.mediaselector.lib.config.f.f75141t) || name.contains(com.max.mediaselector.lib.config.f.f75142u) || name.contains(".jpg") || name.contains(com.max.mediaselector.lib.config.f.f75139r)) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (gVarB == null) {
                return new p<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                com.airbnb.lottie.k kVarD = d(gVarB, (String) entry.getKey());
                if (kVarD != null) {
                    kVarD.h(com.airbnb.lottie.utils.j.m((Bitmap) entry.getValue(), kVarD.f(), kVarD.d()));
                }
            }
            for (Map.Entry<String, com.airbnb.lottie.k> entry2 : gVarB.j().entrySet()) {
                if (entry2.getValue().a() == null) {
                    return new p<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().c()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.c().d(str, gVarB);
            }
            return new p<>(gVarB);
        } catch (IOException e10) {
            return new p<>((Throwable) e10);
        }
    }

    private static boolean D(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean E(BufferedSource bufferedSource) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b10 : f37342b) {
                if (bufferedSourcePeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            com.airbnb.lottie.utils.f.c("Failed to check zip file header", e10);
            return Boolean.FALSE;
        }
    }

    private static String F(Context context, @u0 int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(D(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static void G(int i10) {
        com.airbnb.lottie.model.f.c().e(i10);
    }

    private static q<com.airbnb.lottie.g> b(@p0 String str, Callable<p<com.airbnb.lottie.g>> callable) {
        com.airbnb.lottie.g gVarB = str == null ? null : com.airbnb.lottie.model.f.c().b(str);
        if (gVarB != null) {
            return new q<>(new k(gVarB));
        }
        if (str != null) {
            Map<String, q<com.airbnb.lottie.g>> map = f37341a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        q<com.airbnb.lottie.g> qVar = new q<>(callable);
        if (str != null) {
            qVar.f(new a(str));
            qVar.e(new b(str));
            f37341a.put(str, qVar);
        }
        return qVar;
    }

    public static void c(Context context) {
        f37341a.clear();
        com.airbnb.lottie.model.f.c().a();
        com.airbnb.lottie.e.c(context).a();
    }

    @p0
    private static com.airbnb.lottie.k d(com.airbnb.lottie.g gVar, String str) {
        for (com.airbnb.lottie.k kVar : gVar.j().values()) {
            if (kVar.c().equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public static q<com.airbnb.lottie.g> e(Context context, String str) {
        return f(context, str, "asset_" + str);
    }

    public static q<com.airbnb.lottie.g> f(Context context, String str, @p0 String str2) {
        return b(str2, new d(context.getApplicationContext(), str, str2));
    }

    @k1
    public static p<com.airbnb.lottie.g> g(Context context, String str) {
        return h(context, str, "asset_" + str);
    }

    @k1
    public static p<com.airbnb.lottie.g> h(Context context, String str, @p0 String str2) {
        try {
            if (!str.endsWith(DynamicSoManager.f77249d) && !str.endsWith(".lottie")) {
                return k(context.getAssets().open(str), str2);
            }
            return B(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new p<>((Throwable) e10);
        }
    }

    @Deprecated
    public static q<com.airbnb.lottie.g> i(JSONObject jSONObject, @p0 String str) {
        return b(str, new g(jSONObject, str));
    }

    public static q<com.airbnb.lottie.g> j(InputStream inputStream, @p0 String str) {
        return b(str, new f(inputStream, str));
    }

    @k1
    public static p<com.airbnb.lottie.g> k(InputStream inputStream, @p0 String str) {
        return l(inputStream, str, true);
    }

    @k1
    private static p<com.airbnb.lottie.g> l(InputStream inputStream, @p0 String str, boolean z10) {
        try {
            return n(JsonReader.o(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z10) {
                com.airbnb.lottie.utils.j.c(inputStream);
            }
        }
    }

    public static q<com.airbnb.lottie.g> m(JsonReader jsonReader, @p0 String str) {
        return b(str, new i(jsonReader, str));
    }

    @k1
    public static p<com.airbnb.lottie.g> n(JsonReader jsonReader, @p0 String str) {
        return o(jsonReader, str, true);
    }

    private static p<com.airbnb.lottie.g> o(JsonReader jsonReader, @p0 String str, boolean z10) {
        try {
            com.airbnb.lottie.g gVarA = w.a(jsonReader);
            if (str != null) {
                com.airbnb.lottie.model.f.c().d(str, gVarA);
            }
            return new p<>(gVarA);
        } catch (Exception e10) {
            return new p<>((Throwable) e10);
        } finally {
            if (z10) {
                com.airbnb.lottie.utils.j.c(jsonReader);
            }
        }
    }

    public static q<com.airbnb.lottie.g> p(String str, @p0 String str2) {
        return b(str2, new CallableC0284h(str, str2));
    }

    @k1
    public static p<com.airbnb.lottie.g> q(String str, @p0 String str2) {
        return n(JsonReader.o(Okio.buffer(Okio.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @k1
    @Deprecated
    public static p<com.airbnb.lottie.g> r(JSONObject jSONObject, @p0 String str) {
        return q(jSONObject.toString(), str);
    }

    public static q<com.airbnb.lottie.g> s(Context context, @u0 int i10) {
        return t(context, i10, F(context, i10));
    }

    public static q<com.airbnb.lottie.g> t(Context context, @u0 int i10, @p0 String str) {
        return b(str, new e(new WeakReference(context), context.getApplicationContext(), i10, str));
    }

    @k1
    public static p<com.airbnb.lottie.g> u(Context context, @u0 int i10) {
        return v(context, i10, F(context, i10));
    }

    @k1
    public static p<com.airbnb.lottie.g> v(Context context, @u0 int i10, @p0 String str) {
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i10)));
            return E(bufferedSourceBuffer).booleanValue() ? B(new ZipInputStream(bufferedSourceBuffer.inputStream()), str) : k(bufferedSourceBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e10) {
            return new p<>((Throwable) e10);
        }
    }

    public static q<com.airbnb.lottie.g> w(Context context, String str) {
        return x(context, str, "url_" + str);
    }

    public static q<com.airbnb.lottie.g> x(Context context, String str, @p0 String str2) {
        return b(str2, new c(context, str, str2));
    }

    @k1
    public static p<com.airbnb.lottie.g> y(Context context, String str) {
        return z(context, str, str);
    }

    @k1
    public static p<com.airbnb.lottie.g> z(Context context, String str, @p0 String str2) {
        p<com.airbnb.lottie.g> pVarC = com.airbnb.lottie.e.d(context).c(str, str2);
        if (str2 != null && pVarC.b() != null) {
            com.airbnb.lottie.model.f.c().d(str2, pVarC.b());
        }
        return pVarC;
    }
}
