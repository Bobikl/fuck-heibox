package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f24426a = versionedParcel.M(audioAttributesImplBase.f24426a, 1);
        audioAttributesImplBase.f24427b = versionedParcel.M(audioAttributesImplBase.f24427b, 2);
        audioAttributesImplBase.f24428c = versionedParcel.M(audioAttributesImplBase.f24428c, 3);
        audioAttributesImplBase.f24429d = versionedParcel.M(audioAttributesImplBase.f24429d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.M0(audioAttributesImplBase.f24426a, 1);
        versionedParcel.M0(audioAttributesImplBase.f24427b, 2);
        versionedParcel.M0(audioAttributesImplBase.f24428c, 3);
        versionedParcel.M0(audioAttributesImplBase.f24429d, 4);
    }
}
