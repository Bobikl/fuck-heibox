package com.tencent.thumbplayer.tcmedia.adapter;

import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends com.tencent.thumbplayer.tcmedia.adapter.a.b {
    int a();

    void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.k kVar);

    void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar);

    void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, int i10, long j10);

    void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, Map<String, String> map);

    void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, Map<String, String> map, int i10, long j10);

    void a(TPVideoInfo tPVideoInfo);

    void a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    int b();

    void b(TPVideoInfo tPVideoInfo);

    boolean c();

    int d();

    b e();

    void f();
}
