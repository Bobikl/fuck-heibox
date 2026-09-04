package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f24423a = (AudioAttributes) versionedParcel.W(audioAttributesImplApi21.f24423a, 1);
        audioAttributesImplApi21.f24424b = versionedParcel.M(audioAttributesImplApi21.f24424b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.X0(audioAttributesImplApi21.f24423a, 1);
        versionedParcel.M0(audioAttributesImplApi21.f24424b, 2);
    }
}
