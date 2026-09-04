package com.tencent.thumbplayer.tcmedia.tplayer.a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.capability.TPCapability;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j implements com.tencent.thumbplayer.tcmedia.utils.i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f102979a = String.format("android %s", TPSystemInfo.getOsVersion());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f102980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Integer, Integer> f102981d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f102982b;

    static {
        HashMap map = new HashMap();
        f102980c = map;
        map.put(0, -1);
        map.put(1, 0);
        map.put(2, 3);
        map.put(3, 3);
        HashMap map2 = new HashMap();
        f102981d = map2;
        map2.put(-1, -1);
        map2.put(0, 32);
        map2.put(2, 4);
    }

    public j(Context context) {
        this.f102982b = context;
        com.tencent.thumbplayer.tcmedia.utils.i.a().a(this);
    }

    private int a() {
        int iA = 0;
        for (int i10 : TPCapability.getDRMCapabilities()) {
            iA |= a(i10);
        }
        return iA;
    }

    public static int a(@TPCommonEnum.TP_DRM_TYPE int i10) {
        Integer num = f102981d.get(Integer.valueOf(i10));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public static int b(int i10) {
        Integer num = f102980c.get(Integer.valueOf(i10));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.i.b
    public void a(int i10, int i11, int i12, int i13) {
        com.tencent.thumbplayer.tcmedia.utils.h.b(this.f102982b);
    }

    public void a(com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar) {
        aVar.b(TPPlayerConfig.getGuid());
        aVar.b(0);
        aVar.c(0);
        aVar.d(com.tencent.thumbplayer.tcmedia.utils.h.a(this.f102982b));
        aVar.c(TPSystemInfo.getDeviceName());
        aVar.d(f102979a);
        aVar.e(this.f102982b.getPackageName());
        aVar.g(TPPlayerConfig.getAppVersionName(this.f102982b));
        aVar.h("1.0.0");
        aVar.f(TPPlayerConfig.VERSION);
        aVar.m(TPPlayerConfig.getPlatform());
        aVar.a(0);
        aVar.n(a());
    }

    public void b(com.tencent.thumbplayer.tcmedia.tplayer.a.b.a aVar) {
        aVar.d(com.tencent.thumbplayer.tcmedia.utils.h.a(this.f102982b));
    }
}
