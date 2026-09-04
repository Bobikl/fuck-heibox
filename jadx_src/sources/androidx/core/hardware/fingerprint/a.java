package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.annotation.z0;
import androidx.core.os.f;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: FingerprintManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20798a;

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public class C0132a extends FingerprintManager.AuthenticationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f20799a;

        C0132a(c cVar) {
            this.f20799a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f20799a.a(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f20799a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f20799a.c(i10, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f20799a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    @w0(23)
    public static class b {
        private b() {
        }

        @u
        @z0("android.permission.USE_FINGERPRINT")
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @u
        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @u
        public static FingerprintManager c(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 23) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            if (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @u
        @z0("android.permission.USE_FINGERPRINT")
        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @u
        @z0("android.permission.USE_FINGERPRINT")
        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @u
        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        @u
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static abstract class c {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i10, CharSequence charSequence) {
        }

        public void d(d dVar) {
        }
    }

    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f20800a;

        public d(e eVar) {
            this.f20800a = eVar;
        }

        public e a() {
            return this.f20800a;
        }
    }

    /* JADX INFO: compiled from: FingerprintManagerCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f20801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f20802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f20803c;

        public e(@n0 Signature signature) {
            this.f20801a = signature;
            this.f20802b = null;
            this.f20803c = null;
        }

        public e(@n0 Cipher cipher) {
            this.f20802b = cipher;
            this.f20801a = null;
            this.f20803c = null;
        }

        public e(@n0 Mac mac) {
            this.f20803c = mac;
            this.f20802b = null;
            this.f20801a = null;
        }

        @p0
        public Cipher a() {
            return this.f20802b;
        }

        @p0
        public Mac b() {
            return this.f20803c;
        }

        @p0
        public Signature c() {
            return this.f20801a;
        }
    }

    private a(Context context) {
        this.f20798a = context;
    }

    @n0
    public static a b(@n0 Context context) {
        return new a(context);
    }

    @w0(23)
    @p0
    private static FingerprintManager c(@n0 Context context) {
        return b.c(context);
    }

    @w0(23)
    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @w0(23)
    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0132a(cVar);
    }

    @w0(23)
    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    @z0("android.permission.USE_FINGERPRINT")
    public void a(@p0 e eVar, int i10, @p0 f fVar, @n0 c cVar, @p0 Handler handler) {
        FingerprintManager fingerprintManagerC = c(this.f20798a);
        if (fingerprintManagerC != null) {
            b.a(fingerprintManagerC, h(eVar), fVar != null ? (CancellationSignal) fVar.b() : null, i10, g(cVar), handler);
        }
    }

    @z0("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager fingerprintManagerC = c(this.f20798a);
        return fingerprintManagerC != null && b.d(fingerprintManagerC);
    }

    @z0("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager fingerprintManagerC = c(this.f20798a);
        return fingerprintManagerC != null && b.e(fingerprintManagerC);
    }
}
