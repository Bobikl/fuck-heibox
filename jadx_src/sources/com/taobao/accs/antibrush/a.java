package com.taobao.accs.antibrush;

import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AntiBrush f98160a;

    a(AntiBrush antiBrush) {
        this.f98160a = antiBrush;
    }

    @Override // java.lang.Runnable
    public void run() {
        ALog.e("AntiBrush", "anti bursh timeout", new Object[0]);
        AntiBrush.onResult(this.f98160a.mContext, false);
    }
}
