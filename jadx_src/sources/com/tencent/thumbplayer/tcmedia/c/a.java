package com.tencent.thumbplayer.tcmedia.c;

import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface a extends ITPPlayerProxy {
    com.tencent.thumbplayer.tcmedia.adapter.a.e a(long j10, String str, TPVideoInfo tPVideoInfo, Map<String, String> map);

    com.tencent.thumbplayer.tcmedia.adapter.a.e a(String str, Map<String, String> map);

    ITPMediaAsset a(ITPMediaAsset iTPMediaAsset);

    ITPMediaAsset a(ITPMediaAsset iTPMediaAsset, long j10, TPVideoInfo tPVideoInfo);

    String a(int i10, String str, TPDownloadParamData tPDownloadParamData);

    void a(float f10);

    void a(int i10);

    void a(long j10);

    void a(long j10, long j11);

    void a(TPOptionalParam tPOptionalParam);

    void a(TPVideoInfo tPVideoInfo);

    void a(ITPPlayListener iTPPlayListener);

    void a(String str, Object obj);

    void a(String str, String str2);

    void a(boolean z10);

    boolean a();

    byte[] a(String str, String str2, String str3);

    void b();

    boolean c();

    void d();

    void e();

    boolean f();

    String g();

    void h();

    void i();

    ITPPlayerProxyListener j();

    TPDLProxyMsg.TPPDTInfo[] k();
}
