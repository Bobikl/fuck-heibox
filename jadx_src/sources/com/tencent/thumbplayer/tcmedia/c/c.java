package com.tencent.thumbplayer.tcmedia.c;

import android.os.Looper;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static a a(Looper looper, com.tencent.thumbplayer.tcmedia.tplayer.a aVar) {
        return TPPlayerConfig.getNewReportEnable() ? (a) new d(new e(aVar.a(), looper), aVar).a() : new e(aVar.a(), looper);
    }
}
