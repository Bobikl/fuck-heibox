package com.tencent.thumbplayer.tcmedia.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaDRMAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxyListener;
import com.tencent.thumbplayer.tcmedia.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.tcmedia.b.l;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyMsg;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.thumbplayer.tcmedia.c.a, com.tencent.thumbplayer.tcmedia.utils.f.a, com.tencent.thumbplayer.tcmedia.utils.i.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f102502g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f102503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f102504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ITPDownloadProxy f102505c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f102507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ITPPlayListener f102508f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<TPDownloadParamData> f102510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f102511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f102512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TPVideoInfo f102513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f102514m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinkedList<c> f102516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private HashMap<String, Integer> f102517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f102518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f102519r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m f102527z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102506d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f102509h = f102502g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITPPlayerProxyListener f102515n = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f102520s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f102521t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f102522u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f102523v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f102524w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f102525x = 100000000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f102526y = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (e.this.f102508f == null) {
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "handleMessage failed, mPlayListener is null and return");
            }
            int i10 = message.what;
            if (i10 == 4196) {
                e.this.g(message.arg1);
                return;
            }
            if (i10 == 4197) {
                e.this.h(message.arg1);
                return;
            }
            switch (i10) {
                case 4097:
                    e.this.f102508f.onDownloadFinish();
                    break;
                case 4098:
                    e.this.f102508f.onDownloadError(message.arg1, message.arg2, (String) message.obj);
                    break;
                case 4099:
                    e.this.f102508f.onDownloadCdnUrlUpdate((String) message.obj);
                    break;
                case 4100:
                    TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = (TPPlayerMsg.TPCDNURLInfo) message.obj;
                    e.this.f102508f.onDownloadCdnUrlInfoUpdate(tPCDNURLInfo.url, tPCDNURLInfo.cdnIp, tPCDNURLInfo.uIp, tPCDNURLInfo.errorStr);
                    break;
                case 4101:
                    e.this.f102508f.onDownloadStatusUpdate(message.arg1);
                    break;
                case 4102:
                    TPPlayerMsg.TPProtocolInfo tPProtocolInfo = (TPPlayerMsg.TPProtocolInfo) message.obj;
                    e.this.f102508f.onDownloadProtocolUpdate(tPProtocolInfo.protocolName, tPProtocolInfo.protocolVersion);
                    break;
                case 4103:
                    e.this.f102508f.onDownloadCdnUrlExpired((Map) message.obj);
                    break;
                case 4104:
                    C1016e c1016e = (C1016e) message.obj;
                    f fVar = (f) c1016e.f102534a;
                    c1016e.f102535b.a(e.this.f102508f.onPlayCallback(fVar.f102536a, fVar.f102537b, fVar.f102538c, fVar.f102539d, fVar.f102540e));
                    break;
                case 4105:
                    C1016e c1016e2 = (C1016e) message.obj;
                    c1016e2.f102535b.a(e.this.f102508f.getPlayInfo(((Long) c1016e2.f102534a).longValue()));
                    break;
                case 4106:
                    TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = (TPPlayerMsg.TPDownLoadProgressInfo) message.obj;
                    e.this.f102508f.onDownloadProgressUpdate((int) tPDownLoadProgressInfo.playableDurationMS, tPDownLoadProgressInfo.downloadSpeedKBps, tPDownLoadProgressInfo.currentDownloadSize, tPDownLoadProgressInfo.totalFileSize, tPDownLoadProgressInfo.extraInfo);
                    break;
                case bb.c.e.f31923na /* 4107 */:
                    C1016e c1016e3 = (C1016e) message.obj;
                    c1016e3.f102535b.a(e.this.f102508f.getPlayInfo((String) c1016e3.f102534a));
                    break;
            }
        }
    }

    public class b implements ITPPlayListener {
        private b() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getAdvRemainTime() {
            return e.this.f102508f.getAdvRemainTime();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getContentType(int i10, String str) {
            return e.this.f102508f.getContentType(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int getCurrentPlayClipNo() {
            return e.this.f102508f.getCurrentPlayClipNo();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long[] getCurrentPlayOffset() {
            return e.this.f102508f.getCurrentPlayOffset();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getCurrentPosition() {
            return e.this.f102508f.getCurrentPosition();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public String getDataFilePath(int i10, String str) {
            return e.this.f102508f.getDataFilePath(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getDataTotalSize(int i10, String str) {
            return e.this.f102508f.getDataTotalSize(i10, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(long j10) {
            com.tencent.thumbplayer.tcmedia.utils.e eVar = new com.tencent.thumbplayer.tcmedia.utils.e();
            C1016e c1016e = new C1016e();
            c1016e.f102534a = Long.valueOf(j10);
            c1016e.f102535b = eVar;
            e.this.a(4105, c1016e);
            return e.this.a(eVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object getPlayInfo(String str) {
            com.tencent.thumbplayer.tcmedia.utils.e eVar = new com.tencent.thumbplayer.tcmedia.utils.e();
            C1016e c1016e = new C1016e();
            c1016e.f102534a = str;
            c1016e.f102535b = eVar;
            e.this.a(bb.c.e.f31923na, c1016e);
            return e.this.a(eVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public long getPlayerBufferLength() {
            return e.this.f102508f.getPlayerBufferLength();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            e.this.a(4103, map);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            TPPlayerMsg.TPCDNURLInfo tPCDNURLInfo = new TPPlayerMsg.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.cdnIp = str2;
            tPCDNURLInfo.uIp = str3;
            tPCDNURLInfo.errorStr = str4;
            e.this.a(4100, tPCDNURLInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadCdnUrlUpdate(String str) {
            e.this.a(4099, str);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadError(int i10, int i11, String str) {
            e.this.a(4098, i10, i11, str, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadFinish() {
            e.this.a(4097, (Object) null);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) {
            TPPlayerMsg.TPDownLoadProgressInfo tPDownLoadProgressInfo = new TPPlayerMsg.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.playableDurationMS = i10;
            tPDownLoadProgressInfo.downloadSpeedKBps = i11;
            tPDownLoadProgressInfo.currentDownloadSize = j10;
            tPDownLoadProgressInfo.totalFileSize = j11;
            tPDownLoadProgressInfo.extraInfo = str;
            e.this.a(4106, tPDownLoadProgressInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadProtocolUpdate(String str, String str2) {
            TPPlayerMsg.TPProtocolInfo tPProtocolInfo = new TPPlayerMsg.TPProtocolInfo();
            tPProtocolInfo.protocolVersion = str2;
            tPProtocolInfo.protocolName = str;
            e.this.a(4102, tPProtocolInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public void onDownloadStatusUpdate(int i10) {
            e.this.a(4101, i10, 0, null, false, false, 0L);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public Object onPlayCallback(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
            f fVar = new f();
            fVar.f102536a = i10;
            fVar.f102537b = obj;
            fVar.f102538c = obj2;
            fVar.f102539d = obj3;
            fVar.f102540e = obj4;
            com.tencent.thumbplayer.tcmedia.utils.e eVar = new com.tencent.thumbplayer.tcmedia.utils.e();
            C1016e c1016e = new C1016e();
            c1016e.f102534a = fVar;
            c1016e.f102535b = eVar;
            e.this.a(4104, c1016e);
            return e.this.a(eVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onReadData(int i10, String str, long j10, long j11) {
            return e.this.f102508f.onReadData(i10, str, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStartReadData(int i10, String str, long j10, long j11) {
            return e.this.f102508f.onStartReadData(i10, str, j10, j11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPPlayListener
        public int onStopReadData(int i10, String str, int i11) {
            return e.this.f102508f.onStopReadData(i10, str, i11);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f102530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102531b;

        c(long j10, int i10) {
            this.f102530a = j10;
            this.f102531b = i10;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102533b;

        d(int i10, int i11) {
            this.f102532a = i10;
            this.f102533b = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.e$e, reason: collision with other inner class name */
    public static class C1016e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f102534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.tencent.thumbplayer.tcmedia.utils.e f102535b;

        private C1016e() {
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f102537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f102538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f102539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102540e;

        private f() {
        }
    }

    public e(Context context, Looper looper) {
        this.f102503a = context;
        this.f102504b = new a(looper);
        com.tencent.thumbplayer.tcmedia.utils.f.a(this);
        com.tencent.thumbplayer.tcmedia.utils.i.a().a(this);
        this.f102507e = new b();
        this.f102508f = new com.tencent.thumbplayer.tcmedia.c.f("TPThumbPlayer[TPPlayManagerImpl.java]");
        this.f102517p = new HashMap<>();
        this.f102510i = new ArrayList<>();
        this.f102527z = new m();
    }

    private int a(List<ITPMediaTrackClip> list, String str, ArrayList<TPDownloadParamData> arrayList) {
        int i10 = -1;
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(list)) {
            TPLogUtil.w("TPThumbPlayer[TPPlayManagerImpl.java]", "clipList is empty, return");
            return -1;
        }
        int size = list.size();
        HashMap map = new HashMap();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            ITPMediaTrackClip iTPMediaTrackClip = list.get(i12);
            if ((iTPMediaTrackClip instanceof com.tencent.thumbplayer.tcmedia.b.h) && com.tencent.thumbplayer.tcmedia.utils.b.b(((com.tencent.thumbplayer.tcmedia.b.h) iTPMediaTrackClip).getFilePath())) {
                map.put(iTPMediaTrackClip, new d(i11, i12));
                i11++;
            }
        }
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(map)) {
            TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "all urls is local file url, return");
            return -1;
        }
        try {
            int iStartClipPlay = this.f102505c.startClipPlay(str, map.size(), this.f102507e);
            try {
                if (iStartClipPlay <= 0) {
                    TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start clip play failed, cause : playId < 0");
                    return iStartClipPlay;
                }
                for (Map.Entry entry : map.entrySet()) {
                    ITPMediaTrackClip iTPMediaTrackClip2 = (ITPMediaTrackClip) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (iTPMediaTrackClip2 instanceof com.tencent.thumbplayer.tcmedia.b.h) {
                        com.tencent.thumbplayer.tcmedia.b.h hVar = (com.tencent.thumbplayer.tcmedia.b.h) iTPMediaTrackClip2;
                        TPDownloadParamData tPDownloadParamDataA = a(arrayList, dVar.f102533b);
                        if (tPDownloadParamDataA == null) {
                            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "fatal err, paramData is null.");
                            return -1;
                        }
                        TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "multi trackClipIndex:" + dVar.f102533b + ", download seq:" + dVar.f102532a + ", clip.url:" + hVar.getUrl() + ", clip.getFilePath:" + hVar.getFilePath() + ", paramData.savePath:" + tPDownloadParamDataA.getSavePath() + ", paramData.DownloadFileID:" + tPDownloadParamDataA.getDownloadFileID());
                        if (this.f102505c.setClipInfo(iStartClipPlay, dVar.f102532a, tPDownloadParamDataA.getDownloadFileID(), a(hVar.getFilePath(), tPDownloadParamDataA, hVar.getHttpHeader(), s()))) {
                            hVar.a(this.f102505c.getClipPlayUrl(iStartClipPlay, dVar.f102532a, 1));
                        }
                    }
                }
                return iStartClipPlay;
            } catch (Throwable th2) {
                th = th2;
                i10 = iStartClipPlay;
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th);
                return i10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private com.tencent.thumbplayer.tcmedia.adapter.a.e a(long j10, String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.b(str) || p()) {
            return eVar;
        }
        if (this.f102516o == null) {
            this.f102516o = new LinkedList<>();
        }
        String downloadFileID = null;
        TPDownloadParam tPDownloadParamA = tPDownloadParamData != null ? a(str, tPDownloadParamData, map, s()) : null;
        if (tPDownloadParamData != null) {
            try {
                downloadFileID = tPDownloadParamData.getDownloadFileID();
            } catch (Throwable th2) {
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy switch def failed");
            }
        }
        int iStartPlay = this.f102505c.startPlay(downloadFileID, tPDownloadParamA, this.f102507e);
        if (iStartPlay <= 0) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def failed, cause : playId <= 0");
            return eVar;
        }
        String playUrl = this.f102505c.getPlayUrl(iStartPlay, 1);
        if (TextUtils.isEmpty(playUrl)) {
            playUrl = str;
        }
        eVar.b(playUrl);
        String playUrl2 = this.f102505c.getPlayUrl(iStartPlay, 0);
        if (!TextUtils.isEmpty(playUrl2)) {
            str = playUrl2;
        }
        eVar.a(str);
        this.f102516o.offer(new c(j10, iStartPlay));
        TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def sucess, defId:" + j10 + ",playId:" + iStartPlay);
        return eVar;
    }

    private ITPMediaAsset a(ITPMediaDRMAsset iTPMediaDRMAsset, long j10, TPVideoInfo tPVideoInfo) {
        iTPMediaDRMAsset.setDrmPlayUrl(a(j10, iTPMediaDRMAsset.getDrmPlayUrl(), (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) ? null : tPVideoInfo.getDownloadPraramList().get(0), iTPMediaDRMAsset.getHttpHeader()).b());
        return iTPMediaDRMAsset;
    }

    private ITPMediaAsset a(com.tencent.thumbplayer.tcmedia.b.j jVar) {
        jVar.setDrmPlayUrl(a(jVar.getDrmPlayUrl(), jVar.getHttpHeader()).b());
        return jVar;
    }

    private ITPMediaAsset a(l lVar) {
        lVar.setStreamUrl(a(lVar.getStreamUrl(), lVar.getHttpHeader()).b());
        return lVar;
    }

    private ITPMediaAsset a(l lVar, long j10, TPVideoInfo tPVideoInfo) {
        lVar.setStreamUrl(a(j10, lVar.getStreamUrl(), tPVideoInfo, lVar.getHttpHeader()).b());
        return lVar;
    }

    private TPDownloadParamData a(ArrayList<TPDownloadParamData> arrayList, int i10) {
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(arrayList) || i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    private TPDownloadParam a(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map, Map<String, Object> map2) {
        return k.a(str, tPDownloadParamData, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(com.tencent.thumbplayer.tcmedia.utils.e eVar) {
        try {
            return eVar.a(500L);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "onPlayCallback getResult has exception:" + th2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, int i12, Object obj, boolean z10, boolean z11, long j10) {
        StringBuilder sb2;
        String str;
        this.f102527z.readLock().lock();
        a aVar = this.f102504b;
        if (aVar != null) {
            if (z10 && obj == null) {
                sb2 = new StringBuilder();
                sb2.append(f(i10));
                str = ", send failed , params null";
            } else {
                if (z11) {
                    aVar.removeMessages(i10);
                }
                Message messageObtainMessage = this.f102504b.obtainMessage();
                messageObtainMessage.what = i10;
                messageObtainMessage.arg1 = i11;
                messageObtainMessage.arg2 = i12;
                messageObtainMessage.obj = obj;
                this.f102504b.sendMessageDelayed(messageObtainMessage, j10);
            }
            this.f102527z.readLock().unlock();
        }
        sb2 = new StringBuilder();
        sb2.append(f(i10));
        str = " , send failed , handler null";
        sb2.append(str);
        TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", sb2.toString());
        this.f102527z.readLock().unlock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object obj) {
        a(i10, 0, 0, obj, false, false, 0L);
    }

    private ITPMediaAsset b(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> listC = c(iTPMediaAsset);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(listC)) {
            this.f102512k = a(listC, q(), this.f102510i);
            m();
            n();
        }
        return iTPMediaAsset;
    }

    private ITPMediaAsset b(ITPMediaAsset iTPMediaAsset, long j10, TPVideoInfo tPVideoInfo) {
        List<ITPMediaTrackClip> listC = c(iTPMediaAsset);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(listC) && tPVideoInfo != null) {
            int iA = a(listC, tPVideoInfo.getProxyFileID(), tPVideoInfo.getDownloadPraramList());
            if (iA > 0) {
                this.f102516o.offer(new c(j10, iA));
                TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch def sucess, defId:" + j10 + ",playId:" + iA);
                return iTPMediaAsset;
            }
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy switch clip def failed, cause : playId < 0");
        }
        return iTPMediaAsset;
    }

    private void b(TPVideoInfo tPVideoInfo) {
        String str;
        if (p()) {
            return;
        }
        this.f102513l = tPVideoInfo;
        if (tPVideoInfo == null || tPVideoInfo.getDownloadPraramList() == null) {
            str = "video or downloadParamList is null, return";
        } else {
            if (this.f102512k > 0) {
                try {
                    ArrayList<TPDownloadParamData> downloadPraramList = tPVideoInfo.getDownloadPraramList();
                    for (int i10 = 0; i10 < downloadPraramList.size(); i10++) {
                        TPDownloadParamData tPDownloadParamData = downloadPraramList.get(i10);
                        if (!this.f102505c.setClipInfo(this.f102512k, tPDownloadParamData.getClipNo(), tPDownloadParamData.getDownloadFileID(), a(tPDownloadParamData.getUrl(), tPDownloadParamData, (Map<String, String>) null, s()))) {
                            TPLogUtil.w("TPThumbPlayer[TPPlayManagerImpl.java]", "setClipInfo failed, playID:" + this.f102512k + ", clipNo:" + tPDownloadParamData.getClipNo() + ", downloadFileID:" + tPDownloadParamData.getDownloadFileID());
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
                    return;
                }
            }
            str = "p2p proxy not start, return";
        }
        TPLogUtil.w("TPThumbPlayer[TPPlayManagerImpl.java]", str);
    }

    private boolean b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap map = new HashMap();
        map.put(TPDownloadProxyEnum.DLPARAM_DATA_TRANSFER_MODE, 1);
        try {
            return this.f102505c.setClipInfo(this.f102512k, 2, str2, new TPDownloadParam(arrayList, 3, map));
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return false;
        }
    }

    private List<ITPMediaTrackClip> c(ITPMediaAsset iTPMediaAsset) {
        ITPMediaTrack iTPMediaTrack;
        if (iTPMediaAsset instanceof com.tencent.thumbplayer.tcmedia.b.e) {
            List<ITPMediaTrack> allAVTracks = ((com.tencent.thumbplayer.tcmedia.b.e) iTPMediaAsset).getAllAVTracks();
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(allAVTracks) || (iTPMediaTrack = allAVTracks.get(0)) == null || com.tencent.thumbplayer.tcmedia.utils.b.a(iTPMediaTrack.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack.getAllTrackClips();
        }
        if (iTPMediaAsset instanceof ITPMediaTrack) {
            ITPMediaTrack iTPMediaTrack2 = (ITPMediaTrack) iTPMediaAsset;
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(iTPMediaTrack2.getAllTrackClips())) {
                return null;
            }
            return iTPMediaTrack2.getAllTrackClips();
        }
        if (!(iTPMediaAsset instanceof ITPMediaTrackClip)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
        return arrayList;
    }

    private void c(int i10) {
        try {
            this.f102505c.pauseDownload(i10);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy pause download failed, taskId:".concat(String.valueOf(i10)));
        }
    }

    private void d(int i10) {
        try {
            this.f102505c.resumeDownload(this.f102512k);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy resume download failed, taskId:".concat(String.valueOf(i10)));
        }
    }

    private void e(int i10) {
        if (p()) {
            return;
        }
        try {
            this.f102505c.stopPlay(i10);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy stop play failed, taskID:".concat(String.valueOf(i10)));
        }
    }

    private String f(int i10) {
        switch (i10) {
            case 4097:
                return "onDownloadFinish";
            case 4098:
                return "onDownloadError";
            case 4099:
                return "onDownloadCdnUrlUpdate";
            case 4100:
                return "onDownloadCdnUrlInfoUpdate";
            case 4101:
                return "onDownloadStatusUpdate";
            case 4102:
                return "onDownloadProtocolUpdate";
            case 4103:
                return "onDownloadCdnUrlExpired";
            case 4104:
                return "onPlayCallback";
            case 4105:
            case bb.c.e.f31923na /* 4107 */:
                return "getPlayInfo";
            case 4106:
                return "onDownloadProgressUpdate";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        switch (i10) {
            case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                b(13);
                break;
            case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                b(14);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i10) {
        if (i10 == 1) {
            b(1);
            b(10);
        } else if (i10 == 2) {
            b(2);
            b(9);
        } else {
            if (i10 != 3) {
                return;
            }
            b(2);
            b(10);
        }
    }

    private boolean l() {
        if (this.f102509h == f102502g) {
            this.f102509h = TPPlayerConfig.getProxyServiceType();
        }
        com.tencent.thumbplayer.tcmedia.c.b bVarA = i.a().a(this.f102509h);
        if (bVarA == null || bVarA.a() == null) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "initProxy failed, serviceType:" + this.f102509h + ", playProxyManager:" + bVarA);
            return false;
        }
        try {
            ITPDownloadProxy iTPDownloadProxyA = bVarA.a();
            this.f102505c = iTPDownloadProxyA;
            iTPDownloadProxyA.setUserData(TPDownloadProxyEnum.USER_IS_VIP, Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
            if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
                this.f102505c.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
            }
            if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.f102503a))) {
                this.f102505c.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.f102503a));
            }
            if (TPPlayerConfig.getBuildNumber(this.f102503a) != -1) {
                this.f102505c.setUserData("app_version_code", String.valueOf(TPPlayerConfig.getBuildNumber(this.f102503a)));
            }
            this.f102505c.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
            this.f102505c.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
            this.f102505c.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
            this.f102505c.setUserData(TPDownloadProxyEnum.TAB_ABUSERID, TPPlayerConfig.getAbUserId());
            return true;
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return false;
        }
    }

    private void m() {
        try {
            this.f102505c.setPlayState(this.f102512k, this.f102521t ? 101 : 100);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    private void n() {
        int i10 = this.f102512k;
        if (i10 > 0) {
            this.f102505c.updateTaskInfo(i10, TPDownloadProxyEnum.TASKINFO_ADAPTIVE_DYNAMIC_SWITCH, Integer.valueOf((this.f102522u || this.f102523v) ? 1 : 0));
            this.f102505c.updateTaskInfo(this.f102512k, TPDownloadProxyEnum.TASKINFO_MAX_BITRATE, Long.valueOf(this.f102525x));
            this.f102505c.updateTaskInfo(this.f102512k, TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.f102524w ? 1 : 0));
        }
    }

    private void o() {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "reset");
        this.f102511j = "";
        this.f102514m = "";
        this.f102513l = null;
        this.f102518q = 0L;
        this.f102519r = 0L;
        this.f102520s = false;
        this.f102521t = true;
        this.f102522u = false;
        this.f102523v = false;
        this.f102524w = false;
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102510i)) {
            this.f102510i.clear();
        }
        this.f102506d = 0;
        this.f102509h = f102502g;
        this.f102505c = null;
        this.f102525x = 100000000L;
    }

    private boolean p() {
        if (!TPPlayerConfig.isUseP2P()) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "config set don't use download proxy!");
            return true;
        }
        if (this.f102506d == 0) {
            this.f102506d = l() ? 2 : 1;
        }
        return this.f102506d == 1;
    }

    private String q() {
        return this.f102511j;
    }

    private void r() {
        try {
            this.f102505c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, Long.valueOf(this.f102518q));
            this.f102505c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(this.f102519r));
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    private Map<String, Object> s() {
        HashMap map = new HashMap();
        map.put(TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE, Integer.valueOf((this.f102523v || this.f102522u) ? 1 : 0));
        map.put(TPDownloadProxyEnum.DLPARAM_MULTI_NETWORK, Integer.valueOf(this.f102524w ? 1 : 0));
        return map;
    }

    private void t() {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "inner event : release handler");
        this.f102527z.writeLock().lock();
        a aVar = this.f102504b;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f102504b = null;
        }
        this.f102527z.writeLock().unlock();
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public com.tencent.thumbplayer.tcmedia.adapter.a.e a(long j10, String str, TPVideoInfo tPVideoInfo, Map<String, String> map) {
        if (tPVideoInfo == null) {
            return new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        }
        TPDownloadParamData tPDownloadParamData = null;
        if (tPVideoInfo.getDownloadPraramList() != null && tPVideoInfo.getDownloadPraramList().size() > 0) {
            tPDownloadParamData = tPVideoInfo.getDownloadPraramList().get(0);
        }
        return a(j10, str, tPDownloadParamData, map);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public com.tencent.thumbplayer.tcmedia.adapter.a.e a(String str, Map<String, String> map) {
        com.tencent.thumbplayer.tcmedia.adapter.a.e eVar = new com.tencent.thumbplayer.tcmedia.adapter.a.e(str);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.b(str) || p()) {
            return eVar;
        }
        r();
        this.f102514m = str;
        TPDownloadParamData tPDownloadParamDataA = a(this.f102510i, 0);
        if (this.f102526y && tPDownloadParamDataA != null && tPDownloadParamDataA.getDlType() == 1) {
            tPDownloadParamDataA = new TPDownloadParamData(11);
        }
        TPDownloadParam tPDownloadParamA = tPDownloadParamDataA != null ? a(str, tPDownloadParamDataA, map, s()) : null;
        try {
            StringBuilder sb2 = new StringBuilder("single url:");
            sb2.append(str);
            sb2.append(", paramData.savePath:");
            sb2.append(tPDownloadParamDataA != null ? tPDownloadParamDataA.getSavePath() : "null");
            sb2.append(", paramData.DownloadFileID:");
            sb2.append(tPDownloadParamDataA != null ? tPDownloadParamDataA.getDownloadFileID() : "null");
            TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", sb2.toString());
            int iStartPlay = this.f102505c.startPlay(q(), tPDownloadParamA, this.f102507e);
            if (iStartPlay > 0) {
                String playUrl = this.f102505c.getPlayUrl(iStartPlay, 0);
                if (TextUtils.isEmpty(playUrl)) {
                    playUrl = str;
                }
                TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "startDownloadPlay, playId:".concat(String.valueOf(iStartPlay)));
                eVar.b(playUrl);
                String playUrl2 = this.f102505c.getPlayUrl(iStartPlay, 1);
                if (!TextUtils.isEmpty(playUrl2)) {
                    str = playUrl2;
                }
                eVar.a(str);
                this.f102512k = iStartPlay;
                m();
                n();
            } else {
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed, cause : playId <= 0");
            }
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy start play failed");
        }
        return eVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public ITPMediaAsset a(ITPMediaAsset iTPMediaAsset) {
        if (p()) {
            return iTPMediaAsset;
        }
        r();
        if (iTPMediaAsset instanceof com.tencent.thumbplayer.tcmedia.b.j) {
            return a((com.tencent.thumbplayer.tcmedia.b.j) iTPMediaAsset);
        }
        return iTPMediaAsset instanceof l ? a((l) iTPMediaAsset) : b(iTPMediaAsset);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public ITPMediaAsset a(ITPMediaAsset iTPMediaAsset, long j10, TPVideoInfo tPVideoInfo) {
        if (p() || iTPMediaAsset == null) {
            return iTPMediaAsset;
        }
        if (this.f102516o == null) {
            this.f102516o = new LinkedList<>();
        }
        if (tPVideoInfo == null) {
            return iTPMediaAsset;
        }
        if (iTPMediaAsset instanceof ITPMediaDRMAsset) {
            return a((ITPMediaDRMAsset) iTPMediaAsset, j10, tPVideoInfo);
        }
        return iTPMediaAsset instanceof l ? a((l) iTPMediaAsset, j10, tPVideoInfo) : b(iTPMediaAsset, j10, tPVideoInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public String a(int i10, String str, TPDownloadParamData tPDownloadParamData) {
        TPDownloadParam tPDownloadParam;
        String strA;
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "return coz url is empty";
        } else if (!com.tencent.thumbplayer.tcmedia.utils.b.b(str)) {
            str2 = "return coz url is locol url, not need use proxy";
        } else {
            if (!p()) {
                int i11 = 2;
                int i12 = 1;
                try {
                    if (tPDownloadParamData != null) {
                        tPDownloadParam = k.a(str, tPDownloadParamData, null, null);
                        if (tPDownloadParamData.getTaskType() != 1) {
                            i11 = 1;
                        }
                        strA = tPDownloadParamData.getDownloadFileID();
                        if (TextUtils.isEmpty(strA)) {
                            strA = com.tencent.thumbplayer.tcmedia.utils.b.a(str);
                        }
                        i12 = i11;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        tPDownloadParam = new TPDownloadParam(arrayList, i10 == 2 ? 3 : 0, null);
                        strA = com.tencent.thumbplayer.tcmedia.utils.b.a(str);
                    }
                    int iStartPlay = this.f102505c.startPlay(strA, tPDownloadParam, this.f102507e);
                    if (iStartPlay <= 0) {
                        TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed, cause : playId <= 0");
                        return str;
                    }
                    TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play, url type".concat(String.valueOf(i12)));
                    String playUrl = this.f102505c.getPlayUrl(iStartPlay, i12);
                    this.f102517p.put(playUrl, Integer.valueOf(iStartPlay));
                    return playUrl;
                } catch (Throwable th2) {
                    TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "p2p proxy start play failed:".concat(String.valueOf(th2)));
                    return str;
                }
            }
            str2 = "return coz download proxy init failed";
        }
        TPLogUtil.w("TPThumbPlayer[TPPlayManagerImpl.java]", str2);
        return str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(float f10) {
        if (p()) {
            return;
        }
        if (f10 <= 0.0f) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "set play speed ratio, value invalid:".concat(String.valueOf(f10)));
        } else {
            TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "set play speed value to proxy:".concat(String.valueOf(f10)));
            this.f102505c.updateTaskInfo(this.f102512k, TPDownloadProxyEnum.TASKINFO_SPEED_RATIO, Float.valueOf(f10));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(int i10) {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "setProxyPlayState: ".concat(String.valueOf(i10)));
        if (p()) {
            return;
        }
        try {
            this.f102505c.setPlayState(this.f102512k, i10);
            if ((i10 == 5 || i10 == 0) && !com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102516o)) {
                for (c cVar : this.f102516o) {
                    if (cVar != null) {
                        TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "setProxyPlayState definitionID:" + cVar.f102530a + ", taskID:" + cVar.f102531b + ", state:" + i10);
                        this.f102505c.setPlayState(cVar.f102531b, i10);
                    }
                }
            }
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.i.b
    public void a(int i10, int i11, int i12, int i13) {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "onNetworkStatusChanged oldNetStatus: " + i10 + ", netStatus: " + i11);
        a(bb.c.e.Zb, i11, 0, null, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.f.a
    public void a(int i10, int i11, int i12, Object obj) {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "onEvent eventId: " + i10 + ", arg1: " + i11 + ", arg2: " + i12 + ", object" + obj);
        a(4196, i10, 0, null, false, false, 0L);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(long j10) {
        c cVar;
        if (p()) {
            return;
        }
        try {
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102516o)) {
                return;
            }
            c cVarPeek = this.f102516o.peek();
            while (true) {
                cVar = cVarPeek;
                if (cVar == null || cVar.f102530a == j10) {
                    break;
                }
                TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "stop proxy definitionID:" + cVar.f102530a + ", taskID:" + cVar.f102531b);
                e(cVar.f102531b);
                this.f102516o.removeFirst();
                cVarPeek = this.f102516o.peek();
            }
            if (cVar != null) {
                TPLogUtil.i("TPThumbPlayer[TPPlayManagerImpl.java]", "stop proxy task id:" + cVar.f102531b);
                e(this.f102512k);
                this.f102512k = cVar.f102531b;
                m();
                n();
                this.f102516o.remove(cVar);
            }
        } catch (Exception e10) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", e10, "playerSwitchDefComplete exception");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(long j10, long j11) {
        ITPDownloadProxy iTPDownloadProxy;
        if (p() || (iTPDownloadProxy = this.f102505c) == null) {
            return;
        }
        iTPDownloadProxy.switchToResolution(this.f102512k, (int) j10, (int) j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(TPOptionalParam tPOptionalParam) {
        if (p() || tPOptionalParam == null) {
            return;
        }
        if (tPOptionalParam.getKey() == 100) {
            this.f102518q = tPOptionalParam.getParamLong().value;
            return;
        }
        if (tPOptionalParam.getKey() == 500) {
            try {
                long j10 = tPOptionalParam.getParamLong().value;
                this.f102519r = j10;
                if (this.f102512k > 0) {
                    this.f102505c.setUserData(TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, Long.valueOf(j10));
                    return;
                }
                return;
            } catch (Throwable th2) {
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
                return;
            }
        }
        if (tPOptionalParam.getKey() == 503) {
            this.f102525x = tPOptionalParam.getParamLong().param1;
            n();
            return;
        }
        if (tPOptionalParam.getKey() == 508) {
            this.f102522u = tPOptionalParam.getParamBoolean().value;
            n();
        } else if (tPOptionalParam.getKey() == 504) {
            this.f102523v = tPOptionalParam.getParamLong().value != 0;
            n();
        } else if (tPOptionalParam.getKey() == 509) {
            this.f102524w = tPOptionalParam.getParamBoolean().value;
            n();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(TPVideoInfo tPVideoInfo) {
        if (tPVideoInfo == null) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "setVideoInfo, param is null ");
            return;
        }
        if (this.f102513l != null) {
            b(tPVideoInfo);
        }
        this.f102513l = tPVideoInfo;
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "setVideoInfo, enter");
        this.f102511j = tPVideoInfo.getProxyFileID();
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102510i)) {
            this.f102510i.clear();
        }
        if (tPVideoInfo.getDownloadPraramList() == null || tPVideoInfo.getDownloadPraramList().size() <= 0) {
            return;
        }
        this.f102510i.addAll(tPVideoInfo.getDownloadPraramList());
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(ITPPlayListener iTPPlayListener) {
        if (iTPPlayListener == null) {
            this.f102508f = new com.tencent.thumbplayer.tcmedia.c.f("TPThumbPlayer[TPPlayManagerImpl.java]");
        } else {
            this.f102508f = iTPPlayListener;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(String str, Object obj) {
        ITPDownloadProxy iTPDownloadProxy = this.f102505c;
        if (iTPDownloadProxy != null) {
            iTPDownloadProxy.updateTaskInfo(this.f102512k, str, obj);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(String str, String str2) {
        if (!com.tencent.thumbplayer.tcmedia.utils.b.b(str) || TextUtils.isEmpty(str2)) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, audioTrackUrl:" + str + ", keyId:" + str2);
            return;
        }
        if (p()) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, download proxy init failed.");
            return;
        }
        if (this.f102520s) {
            int i10 = this.f102512k;
            if (i10 > 0) {
                e(i10);
            }
            this.f102512k = 0;
            a(this.f102514m, (Map<String, String>) null);
            if (!b(str, str2)) {
                TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, addAudioTrack err.");
                return;
            }
        } else if (!b(str, str2)) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "startRemuxer, addAudioTrack err.");
            return;
        }
        this.f102520s = true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void a(boolean z10) {
        this.f102526y = z10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public boolean a() {
        return this.f102526y;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public byte[] a(String str, String str2, String str3) {
        ITPDownloadProxy iTPDownloadProxy;
        if (p() || (iTPDownloadProxy = this.f102505c) == null) {
            return null;
        }
        return iTPDownloadProxy.getOfflineLicenseKeySetId(str, str2, str3);
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void b() {
        if (p()) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", "stopRemuxer, download proxy init failed.");
            return;
        }
        if (this.f102520s) {
            int i10 = this.f102512k;
            if (i10 > 0) {
                e(i10);
            }
            this.f102512k = 0;
            a(this.f102514m, (Map<String, String>) null);
        }
        this.f102520s = false;
    }

    public void b(int i10) {
        if (p()) {
            return;
        }
        try {
            this.f102505c.pushEvent(i10);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2, "p2p proxy pushEvent failed, event:".concat(String.valueOf(i10)));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public boolean c() {
        LinkedList<c> linkedList;
        return (p() || (linkedList = this.f102516o) == null || linkedList.size() <= 0) ? false : true;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void d() {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "stopDownload, playId:" + this.f102512k);
        int i10 = this.f102512k;
        if (i10 > 0) {
            e(i10);
        }
        this.f102512k = 0;
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102516o)) {
            for (c cVar : this.f102516o) {
                if (cVar != null) {
                    e(cVar.f102531b);
                }
            }
            this.f102516o.clear();
        }
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102517p)) {
            Iterator<Integer> it = this.f102517p.values().iterator();
            while (it.hasNext()) {
                e(it.next().intValue());
            }
            this.f102517p.clear();
        }
        o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void e() {
        d();
        com.tencent.thumbplayer.tcmedia.utils.i.a().b(this);
        com.tencent.thumbplayer.tcmedia.utils.f.b(this);
        t();
        this.f102515n = null;
        this.f102508f = new com.tencent.thumbplayer.tcmedia.c.f("TPThumbPlayer[TPPlayManagerImpl.java]");
        this.f102507e = null;
        this.f102505c = null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public boolean f() {
        return !p();
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public String g() {
        if (p()) {
            return null;
        }
        try {
            return this.f102505c.getPlayErrorCodeStr(this.f102512k);
        } catch (Throwable th2) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", th2);
            return null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void h() {
        if (p()) {
            return;
        }
        c(this.f102512k);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102516o)) {
            for (c cVar : this.f102516o) {
                if (cVar != null) {
                    c(cVar.f102531b);
                }
            }
        }
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102517p)) {
            return;
        }
        Iterator<Integer> it = this.f102517p.values().iterator();
        while (it.hasNext()) {
            c(it.next().intValue());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public void i() {
        if (p()) {
            return;
        }
        d(this.f102512k);
        if (!com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102516o)) {
            for (c cVar : this.f102516o) {
                if (cVar != null) {
                    d(cVar.f102531b);
                }
            }
        }
        if (com.tencent.thumbplayer.tcmedia.utils.b.a(this.f102517p)) {
            return;
        }
        Iterator<Integer> it = this.f102517p.values().iterator();
        while (it.hasNext()) {
            d(it.next().intValue());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public ITPPlayerProxyListener j() {
        return this.f102515n;
    }

    @Override // com.tencent.thumbplayer.tcmedia.c.a
    public TPDLProxyMsg.TPPDTInfo[] k() {
        ITPDownloadProxy iTPDownloadProxy;
        if (p() || (iTPDownloadProxy = this.f102505c) == null) {
            return null;
        }
        return iTPDownloadProxy.getPDTInfos(this.f102512k);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void pushEvent(int i10) {
        if (p()) {
            return;
        }
        try {
            b(h.b(i10));
        } catch (IllegalArgumentException e10) {
            TPLogUtil.e("TPThumbPlayer[TPPlayManagerImpl.java]", e10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setIsActive(boolean z10) {
        TPLogUtil.d("TPThumbPlayer[TPPlayManagerImpl.java]", "setIsActive: ".concat(String.valueOf(z10)));
        this.f102521t = z10;
        if (p()) {
            return;
        }
        m();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setProxyServiceType(int i10) {
        this.f102509h = i10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.proxy.ITPPlayerProxy
    public void setTPPlayerProxyListener(ITPPlayerProxyListener iTPPlayerProxyListener) {
        this.f102515n = iTPPlayerProxyListener;
    }
}
