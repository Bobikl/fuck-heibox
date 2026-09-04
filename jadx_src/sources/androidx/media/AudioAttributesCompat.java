package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.g {
    private static final SparseIntArray A;
    static boolean B = false;
    private static final int[] C;
    public static final int D = 1;
    static final int E = 2;
    static final int F = 4;
    static final int G = 8;
    public static final int H = 16;
    static final int I = 32;
    static final int J = 64;
    static final int K = 128;
    static final int L = 256;
    static final int M = 512;
    static final int N = 1023;
    static final int O = 273;
    static final int P = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f24392b = "AudioAttributesCompat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24393c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24394d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24395e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24396f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24397g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f24398h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f24399i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f24400j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f24401k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f24402l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f24403m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f24404n = 6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f24405o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f24406p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f24407q = 9;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f24408r = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f24409s = 11;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f24410t = 12;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f24411u = 13;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f24412v = 14;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final int f24413w = 15;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f24414x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f24415y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f24416z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImpl f24417a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f24418a = 6;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f24419b = 7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f24420c = 9;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f24421d = 10;

        private c() {
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributesImpl.a f24422a;

        public d() {
            if (AudioAttributesCompat.B) {
                this.f24422a = new AudioAttributesImplBase.a();
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.f24422a = new AudioAttributesImplApi26.a();
            } else {
                this.f24422a = new AudioAttributesImplApi21.a();
            }
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            if (AudioAttributesCompat.B) {
                this.f24422a = new AudioAttributesImplBase.a(audioAttributesCompat);
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.f24422a = new AudioAttributesImplApi26.a(audioAttributesCompat.c());
            } else {
                this.f24422a = new AudioAttributesImplApi21.a(audioAttributesCompat.c());
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f24422a.build());
        }

        public d b(int i10) {
            this.f24422a.c(i10);
            return this;
        }

        public d c(int i10) {
            this.f24422a.setFlags(i10);
            return this;
        }

        public d d(int i10) {
            this.f24422a.b(i10);
            return this;
        }

        public d e(int i10) {
            this.f24422a.a(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f24417a = audioAttributesImpl;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(boolean z10) {
        B = z10;
    }

    static int b(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    static String d(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    @p0
    public static AudioAttributesCompat e(@n0 Object obj) {
        if (B) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    @p0
    public Object c() {
        return this.f24417a.i();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f24417a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f24417a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f24417a);
    }

    public int getContentType() {
        return this.f24417a.getContentType();
    }

    public int getFlags() {
        return this.f24417a.getFlags();
    }

    public int hashCode() {
        return this.f24417a.hashCode();
    }

    public int j() {
        return this.f24417a.j();
    }

    int k() {
        return this.f24417a.k();
    }

    public int l() {
        return this.f24417a.l();
    }

    public int m() {
        return this.f24417a.m();
    }

    public String toString() {
        return this.f24417a.toString();
    }
}
