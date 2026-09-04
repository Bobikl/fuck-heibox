package com.bytedance.realx.video;

import androidx.annotation.p0;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes6.dex */
public class RXVideoCodecDesc {
    public final RXVideoCodecProfile profile;
    public final RXVideoCodecStandard standard;

    @CalledByNative
    public RXVideoCodecDesc(int i10, int i11) {
        this.standard = RXVideoCodecStandard.fromValue(i10);
        this.profile = RXVideoCodecProfile.fromValue(i11);
    }

    public RXVideoCodecDesc(RXVideoCodecStandard rXVideoCodecStandard, RXVideoCodecProfile rXVideoCodecProfile) {
        this.standard = rXVideoCodecStandard;
        this.profile = rXVideoCodecProfile;
    }

    @CalledByNative
    int GetProfileInt() {
        return this.profile.toInt();
    }

    @CalledByNative
    int GetStandardInt() {
        return this.standard.toInt();
    }

    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RXVideoCodecDesc)) {
            return false;
        }
        RXVideoCodecDesc rXVideoCodecDesc = (RXVideoCodecDesc) obj;
        return this.standard == rXVideoCodecDesc.standard && this.profile == rXVideoCodecDesc.profile;
    }

    @CalledByNative
    String getName() {
        return this.standard.mimeType();
    }

    RXVideoCodecProfile getProfile() {
        return this.profile;
    }

    RXVideoCodecStandard getStandard() {
        return this.standard;
    }
}
