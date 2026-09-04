package androidx.media;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f24426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f24427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f24428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f24429d;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f24433d;

        a() {
            this.f24430a = 0;
            this.f24431b = 0;
            this.f24432c = 0;
            this.f24433d = -1;
        }

        a(AudioAttributesCompat audioAttributesCompat) {
            this.f24430a = 0;
            this.f24431b = 0;
            this.f24432c = 0;
            this.f24433d = -1;
            this.f24430a = audioAttributesCompat.l();
            this.f24431b = audioAttributesCompat.getContentType();
            this.f24432c = audioAttributesCompat.getFlags();
            this.f24433d = audioAttributesCompat.k();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private a f(int i10) {
            switch (i10) {
                case 0:
                    this.f24431b = 1;
                    break;
                case 1:
                    this.f24431b = 4;
                    break;
                case 2:
                    this.f24431b = 4;
                    break;
                case 3:
                    this.f24431b = 2;
                    break;
                case 4:
                    this.f24431b = 4;
                    break;
                case 5:
                    this.f24431b = 4;
                    break;
                case 6:
                    this.f24431b = 1;
                    this.f24432c |= 4;
                    break;
                case 7:
                    this.f24432c = 1 | this.f24432c;
                    this.f24431b = 4;
                    break;
                case 8:
                    this.f24431b = 4;
                    break;
                case 9:
                    this.f24431b = 4;
                    break;
                case 10:
                    this.f24431b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                    break;
            }
            this.f24430a = AudioAttributesImplBase.a(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f24431b, this.f24432c, this.f24430a, this.f24433d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                this.f24431b = i10;
            } else {
                this.f24431b = 0;
            }
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a setFlags(int i10) {
            this.f24432c = (i10 & 1023) | this.f24432c;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            if (i10 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f24433d = i10;
            return f(i10);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            switch (i10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f24430a = i10;
                    return this;
                case 16:
                    this.f24430a = 12;
                    return this;
                default:
                    this.f24430a = 0;
                    return this;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
        this.f24426a = 0;
        this.f24427b = 0;
        this.f24428c = 0;
        this.f24429d = -1;
    }

    AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f24427b = i10;
        this.f24428c = i11;
        this.f24426a = i12;
        this.f24429d = i13;
    }

    static int a(int i10) {
        switch (i10) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f24427b == audioAttributesImplBase.getContentType() && this.f24428c == audioAttributesImplBase.getFlags() && this.f24426a == audioAttributesImplBase.l() && this.f24429d == audioAttributesImplBase.f24429d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f24427b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i10 = this.f24428c;
        int iJ = j();
        if (iJ == 6) {
            i10 |= 4;
        } else if (iJ == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24427b), Integer.valueOf(this.f24428c), Integer.valueOf(this.f24426a), Integer.valueOf(this.f24429d)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @p0
    public Object i() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int j() {
        int i10 = this.f24429d;
        return i10 != -1 ? i10 : AudioAttributesCompat.b(false, this.f24428c, this.f24426a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int k() {
        return this.f24429d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int l() {
        return this.f24426a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int m() {
        return AudioAttributesCompat.b(true, this.f24428c, this.f24426a);
    }

    @n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f24429d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f24429d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.d(this.f24426a));
        sb2.append(" content=");
        sb2.append(this.f24427b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f24428c).toUpperCase());
        return sb2.toString();
    }
}
