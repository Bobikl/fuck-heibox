package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.vivo.push.PushClientConstants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f98466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f98467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f98468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ AccsDataListener f98469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f98470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ byte[] f98471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TaoBaseService.ExtraInfo f98472g;

    d(String str, String str2, int i10, AccsDataListener accsDataListener, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        this.f98466a = str;
        this.f98467b = str2;
        this.f98468c = i10;
        this.f98469d = accsDataListener;
        this.f98470e = str3;
        this.f98471f = bArr;
        this.f98472g = extraInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98466a)) {
            ALog.e(a.TAG, "onData start", Constants.KEY_DATA_ID, this.f98467b, Constants.KEY_SERVICE_ID, this.f98466a, "command", Integer.valueOf(this.f98468c), PushClientConstants.TAG_CLASS_NAME, this.f98469d.getClass().getName());
        }
        this.f98469d.onData(this.f98466a, this.f98470e, this.f98467b, this.f98471f, this.f98472g);
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f98466a)) {
            ALog.e(a.TAG, "onData end", Constants.KEY_DATA_ID, this.f98467b);
        }
    }
}
