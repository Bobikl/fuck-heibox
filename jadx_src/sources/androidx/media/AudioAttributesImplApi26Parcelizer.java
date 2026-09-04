package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f24423a = (AudioAttributes) versionedParcel.W(audioAttributesImplApi26.f24423a, 1);
        audioAttributesImplApi26.f24424b = versionedParcel.M(audioAttributesImplApi26.f24424b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.X0(audioAttributesImplApi26.f24423a, 1);
        versionedParcel.M0(audioAttributesImplApi26.f24424b, 2);
    }
}
