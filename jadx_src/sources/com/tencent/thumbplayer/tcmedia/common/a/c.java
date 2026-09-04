package com.tencent.thumbplayer.tcmedia.common.a;

import com.tencent.thumbplayer.tcmedia.api.TPNativeException;
import com.tencent.thumbplayer.tcmedia.api.capability.TPCapability;
import com.tencent.thumbplayer.tcmedia.api.capability.TPVCodecCapabilityForGet;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.l;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private void a(d.a aVar, a aVar2) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetB = b();
        if (tPVCodecCapabilityForGetB != null) {
            aVar.f102563a = tPVCodecCapabilityForGetB.getMaxProfile();
            aVar.f102564b = tPVCodecCapabilityForGetB.getMaxLevel();
        }
        aVar.a(aVar2);
    }

    private void a(d.b bVar, a aVar) {
        bVar.f102568c = TPSystemInfo.SDK_INT;
        bVar.f102566a = UUID.randomUUID().toString() + System.nanoTime() + lg.a.f131412e + TPPlayerConfig.getPlatform();
        bVar.f102567b = TPPlayerConfig.getPlatform();
        bVar.f102569d = String.format("Android %s", TPSystemInfo.getOsVersion());
        bVar.f102570e = String.format("%s_%s", TPSystemInfo.getDeviceManufacturer(), TPSystemInfo.getDeviceName());
        bVar.f102572g = TPSystemInfo.getCpuHarewareName();
        bVar.a(aVar);
    }

    private void a(d.c cVar, a aVar) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetE = e();
        if (tPVCodecCapabilityForGetE != null) {
            cVar.f102574a = tPVCodecCapabilityForGetE.getMaxProfile();
            cVar.f102575b = tPVCodecCapabilityForGetE.getMaxLevel();
        }
        cVar.a(aVar);
    }

    private void a(d.C1017d c1017d, a aVar) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetD = d();
        if (tPVCodecCapabilityForGetD != null) {
            c1017d.f102577a = tPVCodecCapabilityForGetD.getMaxProfile();
            c1017d.f102578b = tPVCodecCapabilityForGetD.getMaxLevel();
        }
        c1017d.a(aVar);
    }

    private void a(d.e eVar, a aVar) {
        TPVCodecCapabilityForGet tPVCodecCapabilityForGetC = c();
        if (tPVCodecCapabilityForGetC != null) {
            eVar.f102580a = tPVCodecCapabilityForGetC.getMaxProfile();
            eVar.f102581b = tPVCodecCapabilityForGetC.getMaxLevel();
        }
        eVar.a(aVar);
    }

    private static TPVCodecCapabilityForGet b() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(1029, 102);
        } catch (TPNativeException e10) {
            TPLogUtil.e("TPDeviceCapabilityReportManager", e10);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    private static TPVCodecCapabilityForGet c() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(166, 102);
        } catch (TPNativeException e10) {
            TPLogUtil.e("TPDeviceCapabilityReportManager", e10);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    private static TPVCodecCapabilityForGet d() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(138, 102);
        } catch (TPNativeException e10) {
            TPLogUtil.e("TPDeviceCapabilityReportManager", e10);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    private static TPVCodecCapabilityForGet e() {
        TPVCodecCapabilityForGet thumbPlayerVCodecTypeMaxCapability;
        try {
            thumbPlayerVCodecTypeMaxCapability = TPCapability.getThumbPlayerVCodecTypeMaxCapability(172, 102);
        } catch (TPNativeException e10) {
            TPLogUtil.e("TPDeviceCapabilityReportManager", e10);
            thumbPlayerVCodecTypeMaxCapability = null;
        }
        if (thumbPlayerVCodecTypeMaxCapability == TPVCodecCapabilityForGet.mDefaultVCodecCapability) {
            return null;
        }
        return thumbPlayerVCodecTypeMaxCapability;
    }

    private void f() {
        d dVar = new d();
        l lVar = new l();
        a(dVar.a(), lVar);
        a(dVar.b(), lVar);
        a(dVar.c(), lVar);
        a(dVar.d(), lVar);
        a(dVar.e(), lVar);
    }

    public void a() {
        f();
    }
}
