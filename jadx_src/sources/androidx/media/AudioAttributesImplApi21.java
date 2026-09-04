package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes6.dex */
@w0(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributes f24423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f24424b;

    @w0(21)
    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AudioAttributes.Builder f24425a;

        a() {
            this.f24425a = new AudioAttributes.Builder();
        }

        a(Object obj) {
            this.f24425a = new AudioAttributes.Builder((AudioAttributes) obj);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f24425a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f24425a.setContentType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a setFlags(int i10) {
            this.f24425a.setFlags(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f24425a.setLegacyStreamType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @n0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            if (i10 == 16) {
                i10 = 12;
            }
            this.f24425a.setUsage(i10);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f24424b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f24423a = audioAttributes;
        this.f24424b = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f24423a.equals(((AudioAttributesImplApi21) obj).f24423a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f24423a.getContentType();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return this.f24423a.getFlags();
    }

    public int hashCode() {
        return this.f24423a.hashCode();
    }

    @Override // androidx.media.AudioAttributesImpl
    @p0
    public Object i() {
        return this.f24423a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int j() {
        int i10 = this.f24424b;
        return i10 != -1 ? i10 : AudioAttributesCompat.b(false, getFlags(), l());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int k() {
        return this.f24424b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int l() {
        return this.f24423a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int m() {
        return AudioAttributesCompat.b(true, getFlags(), l());
    }

    @n0
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f24423a;
    }
}
