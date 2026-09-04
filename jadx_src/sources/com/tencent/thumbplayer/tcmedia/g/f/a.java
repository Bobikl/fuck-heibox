package com.tencent.thumbplayer.tcmedia.g.f;

import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.y;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.g.b.e;
import com.tencent.thumbplayer.tcmedia.g.b.f;
import com.tencent.thumbplayer.tcmedia.g.b.g;
import com.tencent.thumbplayer.tcmedia.g.h.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.f.a$a, reason: collision with other inner class name */
    public enum EnumC1024a {
        ADAPTATION_WORKAROUND_MODE_NEVER,
        ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION,
        ADAPTATION_WORKAROUND_MODE_ALWAYS
    }

    public enum b {
        KEEP_CODEC_RESULT_NO,
        KEEP_CODEC_RESULT_YES_WITH_FLUSH,
        KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION,
        KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION
    }

    public static EnumC1024a a(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (TPSystemInfo.getDeviceName().startsWith("SM-T585") || TPSystemInfo.getDeviceName().startsWith("SM-A510") || TPSystemInfo.getDeviceName().startsWith("SM-A520") || TPSystemInfo.getDeviceName().startsWith("SM-J700"))) {
            return EnumC1024a.ADAPTATION_WORKAROUND_MODE_ALWAYS;
        }
        if (i10 < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
            String str2 = Build.DEVICE;
            if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                return EnumC1024a.ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION;
            }
        }
        return EnumC1024a.ADAPTATION_WORKAROUND_MODE_NEVER;
    }

    public static void a(e eVar, MediaFormat mediaFormat) {
        com.tencent.thumbplayer.tcmedia.g.f.b bVarD = com.tencent.thumbplayer.tcmedia.g.a.a().d();
        int iMax = Math.max(bVarD.f102774b, eVar.f102679b);
        int iMax2 = Math.max(bVarD.f102775c, eVar.f102680c);
        if (bVarD.f102773a) {
            bVarD.f102774b = iMax;
            bVarD.f102775c = iMax2;
        }
        int iMax3 = Math.max(0, c.a(eVar.f102687j, iMax, iMax2, false));
        if (com.tencent.thumbplayer.tcmedia.g.h.b.a()) {
            com.tencent.thumbplayer.tcmedia.g.h.b.b("ReuseHelper", "initFormatWrapper initWidth:" + iMax + " initHeight:" + iMax2 + " initMaxInputSize:" + iMax3 + " reusePolicy:" + bVarD);
        }
        eVar.f102684g = iMax;
        eVar.f102685h = iMax2;
        eVar.f102686i = iMax3;
        mediaFormat.setInteger("max-input-size", Math.max(iMax3, 0));
        if (eVar.a()) {
            mediaFormat.setInteger("max-width", iMax);
            mediaFormat.setInteger("max-height", iMax2);
        }
    }

    public static boolean a(f fVar, e eVar) {
        return a(fVar, eVar, false);
    }

    public static boolean a(f fVar, e eVar, boolean z10) {
        e eVar2 = fVar.f102695e;
        if (fVar instanceof g) {
            return TextUtils.equals(eVar2.f102687j, eVar.f102687j) && eVar2.f102681d == eVar.f102681d && (fVar.f102693c || (eVar2.f102679b == eVar.f102679b && eVar2.f102680c == eVar.f102680c));
        }
        if (!(fVar instanceof com.tencent.thumbplayer.tcmedia.g.b.a)) {
            return true;
        }
        if (TextUtils.equals(y.A, eVar2.f102687j)) {
            TextUtils.equals(eVar2.f102687j, eVar.f102687j);
        }
        return false;
    }
}
