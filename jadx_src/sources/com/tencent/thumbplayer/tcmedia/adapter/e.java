package com.tencent.thumbplayer.tcmedia.adapter;

import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    public static a a(com.tencent.thumbplayer.tcmedia.e.b bVar, com.tencent.thumbplayer.tcmedia.tplayer.a aVar) {
        return TPPlayerConfig.getNewReportEnable() ? (a) new f(new d(aVar.a(), bVar), aVar).a() : new d(aVar.a(), bVar);
    }
}
