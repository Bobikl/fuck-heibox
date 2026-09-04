package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.RestrictTo;
import androidx.annotation.f0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.graphics.d1;
import androidx.core.graphics.w0;
import androidx.core.util.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: FontsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f21029a = "font_results";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f21030b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    static final int f21031c = -2;

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static final class a implements BaseColumns {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f21032a = "file_id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f21033b = "font_ttc_index";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f21034c = "font_variation_settings";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f21035d = "font_weight";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f21036e = "font_italic";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f21037f = "result_code";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f21038g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f21039h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f21040i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f21041j = 3;
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f21042c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21043d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f21044e = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c[] f21046b;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i10, @p0 c[] cVarArr) {
            this.f21045a = i10;
            this.f21046b = cVarArr;
        }

        static b a(int i10, @p0 c[] cVarArr) {
            return new b(i10, cVarArr);
        }

        public c[] b() {
            return this.f21046b;
        }

        public int c() {
            return this.f21045a;
        }
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f21047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f21050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f21051e;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@n0 Uri uri, @f0(from = 0) int i10, @f0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            this.f21047a = (Uri) o.l(uri);
            this.f21048b = i10;
            this.f21049c = i11;
            this.f21050d = z10;
            this.f21051e = i12;
        }

        static c a(@n0 Uri uri, @f0(from = 0) int i10, @f0(from = 1, to = 1000) int i11, boolean z10, int i12) {
            return new c(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f21051e;
        }

        @f0(from = 0)
        public int c() {
            return this.f21048b;
        }

        @n0
        public Uri d() {
            return this.f21047a;
        }

        @f0(from = 1, to = 1000)
        public int e() {
            return this.f21049c;
        }

        public boolean f() {
            return this.f21050d;
        }
    }

    /* JADX INFO: compiled from: FontsContractCompat.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f21052a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f21053b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f21054c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f21055d = -2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f21056e = -3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f21057f = -4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f21058g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f21059h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f21060i = 3;

        /* JADX INFO: compiled from: FontsContractCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public @interface a {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface) {
        }
    }

    private j() {
    }

    @p0
    public static Typeface a(@n0 Context context, @p0 CancellationSignal cancellationSignal, @n0 c[] cVarArr) {
        return w0.d(context, cancellationSignal, cVarArr, 0);
    }

    @n0
    public static b b(@n0 Context context, @p0 CancellationSignal cancellationSignal, @n0 h hVar) throws PackageManager.NameNotFoundException {
        return g.e(context, hVar, cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, h hVar, @p0 androidx.core.content.res.i.g gVar, @p0 Handler handler, boolean z10, int i10, int i11) {
        return f(context, hVar, i11, z10, i10, androidx.core.content.res.i.g.e(handler), new w0.a(gVar));
    }

    @Deprecated
    @j1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public static ProviderInfo d(@n0 PackageManager packageManager, @n0 h hVar, @p0 Resources resources) throws PackageManager.NameNotFoundException {
        return g.f(packageManager, hVar, resources);
    }

    @androidx.annotation.w0(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return d1.h(context, cVarArr, cancellationSignal);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @p0
    public static Typeface f(@n0 Context context, @n0 h hVar, int i10, boolean z10, @f0(from = 0) int i11, @n0 Handler handler, @n0 d dVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar, handler);
        return z10 ? i.e(context, hVar, aVar, i10, i11) : i.d(context, hVar, i10, null, aVar);
    }

    public static void g(@n0 Context context, @n0 h hVar, @n0 d dVar, @n0 Handler handler) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(dVar);
        i.d(context.getApplicationContext(), hVar, 0, k.b(handler), aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        i.f();
    }

    @j1
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static void i() {
        i.f();
    }
}
