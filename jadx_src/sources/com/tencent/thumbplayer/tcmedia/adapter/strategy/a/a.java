package com.tencent.thumbplayer.tcmedia.adapter.strategy.a;

import com.tencent.thumbplayer.tcmedia.adapter.c;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPStrategyUtils;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f102410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f102411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f102412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f102413d;

    public a(c cVar) {
        this.f102413d = false;
        this.f102410a = 2;
        this.f102411b = 2;
        if (TPStrategyUtils.isTVPlatform()) {
            this.f102411b = 4;
            this.f102410a = 2;
        }
        if (cVar == null) {
            return;
        }
        TPOptionalParam tPOptionalParamB = cVar.b(210);
        if (tPOptionalParamB != null && tPOptionalParamB.getParamType() == 4) {
            this.f102412c = tPOptionalParamB.getParamQueueInt().queueValue;
            this.f102413d = true;
            return;
        }
        TPOptionalParam tPOptionalParamB2 = cVar.b(202);
        if (tPOptionalParamB2 != null && tPOptionalParamB2.getParamType() == 2 && a(tPOptionalParamB2.getParamLong().value)) {
            this.f102411b = (int) tPOptionalParamB2.getParamLong().value;
        }
        TPOptionalParam tPOptionalParamB3 = cVar.b(203);
        if (tPOptionalParamB3 != null && tPOptionalParamB3.getParamType() == 2 && b(tPOptionalParamB3.getParamLong().value)) {
            this.f102410a = (int) tPOptionalParamB3.getParamLong().value;
        }
        a(this.f102411b, this.f102410a);
    }

    private void a(int i10, int i11) {
        if (i10 == 3 && i11 == 3) {
            throw new IllegalArgumentException("can not soft with systemplayer");
        }
    }

    private boolean a(long j10) {
        return j10 > 0 && j10 < 5;
    }

    private boolean b(long j10) {
        return j10 > 0 && j10 < 5;
    }

    public int a() {
        return this.f102411b;
    }

    public int b() {
        return this.f102410a;
    }

    public int[] c() {
        return this.f102412c;
    }

    public boolean d() {
        return this.f102413d;
    }
}
