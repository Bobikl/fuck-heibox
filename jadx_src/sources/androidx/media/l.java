package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: MediaSessionManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f24618b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f24619c = Log.isLoggable(f24618b, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f24620d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile l f24621e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f24622a;

    /* JADX INFO: compiled from: MediaSessionManager.java */
    public interface a {
        boolean a(c cVar);

        Context getContext();
    }

    /* JADX INFO: compiled from: MediaSessionManager.java */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f24623b = "android.media.session.MediaController";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int f24624c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final int f24625d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f24626a;

        @w0(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public b(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            String strB = n.a.b(mediaSessionManager$RemoteUserInfo);
            if (strB == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(strB)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            this.f24626a = new n.a(mediaSessionManager$RemoteUserInfo);
        }

        public b(@n0 String str, int i10, int i11) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.f24626a = new n.a(str, i10, i11);
            } else {
                this.f24626a = new o.a(str, i10, i11);
            }
        }

        @n0
        public String a() {
            return this.f24626a.getPackageName();
        }

        public int b() {
            return this.f24626a.a();
        }

        public int c() {
            return this.f24626a.getUid();
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f24626a.equals(((b) obj).f24626a);
            }
            return false;
        }

        public int hashCode() {
            return this.f24626a.hashCode();
        }
    }

    /* JADX INFO: compiled from: MediaSessionManager.java */
    public interface c {
        int a();

        String getPackageName();

        int getUid();
    }

    private l(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24622a = new n(context);
        } else {
            this.f24622a = new m(context);
        }
    }

    @n0
    public static l b(@n0 Context context) {
        l lVar;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f24620d) {
            if (f24621e == null) {
                f24621e = new l(context.getApplicationContext());
            }
            lVar = f24621e;
        }
        return lVar;
    }

    Context a() {
        return this.f24622a.getContext();
    }

    public boolean c(@n0 b bVar) {
        if (bVar != null) {
            return this.f24622a.a(bVar.f24626a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
