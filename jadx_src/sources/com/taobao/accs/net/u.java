package com.taobao.accs.net;

import android.text.TextUtils;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class u implements RequestCb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ IAuth.AuthCallback f98367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k.a f98368b;

    u(k.a aVar, IAuth.AuthCallback authCallback) {
        this.f98368b = aVar;
        this.f98367a = authCallback;
    }

    @Override // anet.channel.RequestCb
    public void onDataReceive(ByteArray byteArray, boolean z10) {
    }

    @Override // anet.channel.RequestCb
    public void onFinish(int i10, String str, RequestStatistic requestStatistic) {
        if (i10 < 0) {
            ALog.e(this.f98368b.f98345c, "auth onFinish", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10));
            this.f98367a.onAuthFail(i10, "onFinish auth fail");
        }
    }

    @Override // anet.channel.RequestCb
    public void onResponseCode(int i10, Map<String, List<String>> map) {
        ALog.e(this.f98368b.f98345c, "auth", "httpStatusCode", Integer.valueOf(i10));
        if (i10 == 200) {
            this.f98367a.onAuthSuccess();
            if (this.f98368b.f98346d instanceof k) {
                ((k) this.f98368b.f98346d).o();
            }
        } else {
            this.f98367a.onAuthFail(i10, "auth fail");
        }
        Map<String, String> mapA = UtilityImpl.a(map);
        ALog.d(this.f98368b.f98345c, "auth", "header", mapA);
        String str = mapA.get("x-at");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f98368b.f98346d.f98307k = str;
    }
}
