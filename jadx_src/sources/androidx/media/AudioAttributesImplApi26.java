package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes6.dex */
@w0(26)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    @w0(26)
    public static class a extends AudioAttributesImplApi21.a {
        a() {
        }

        a(Object obj) {
            super(obj);
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        @n0
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f24425a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        @n0
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f24425a.setUsage(i10);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int m() {
        return this.f24423a.getVolumeControlStream();
    }
}
