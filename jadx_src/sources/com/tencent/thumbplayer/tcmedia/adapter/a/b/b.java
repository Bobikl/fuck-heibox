package com.tencent.thumbplayer.tcmedia.adapter.a.b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.adapter.g;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.TPAudioAttributes;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDashFormat;
import com.tencent.thumbplayer.tcmedia.api.TPHlsTag;
import com.tencent.thumbplayer.tcmedia.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMsg;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.core.common.TPAudioFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPDetailInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackHlsTag;
import com.tencent.thumbplayer.tcmedia.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPPostProcessFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.tcmedia.core.common.TPVideoFrame;
import com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback;
import com.tencent.thumbplayer.tcmedia.core.demuxer.TPNativeRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerAudioFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerEventRecordCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerPostProcessFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSubtitleFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerVideoFrameCallback;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayer;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerInitConfig;
import com.tencent.thumbplayer.tcmedia.core.player.TPNativePlayerProgramInfo;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.tencent.thumbplayer.tcmedia.adapter.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Set<Integer> f102268a = new HashSet<Integer>() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.8
        {
            add(503);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TPNativePlayer f102269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TPNativePlayerInitConfig f102270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f102271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f102272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.a f102273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.e.a f102274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ITPNativePlayerMessageCallback f102275h = new ITPNativePlayerMessageCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.1
        private void a(int i10, Object obj) {
            if (b.this.f102271d != null) {
                Message.obtain(b.this.f102271d, i10, obj).sendToTarget();
            }
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onASyncCallResult(int i10, long j10, int i11, int i12) {
            b.this.f102274g.b("onASyncCallResult, callType:" + i10 + ", opaque:" + j10 + ", errorType:" + i11 + ", errorCode:" + i12);
            C1012b c1012b = new C1012b();
            c1012b.f102291a = i10;
            c1012b.f102292b = j10;
            c1012b.f102293c = i11;
            c1012b.f102294d = i12;
            a(1, c1012b);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onDetailInfo(TPDetailInfo tPDetailInfo) {
            b.this.f102274g.b("onDetailInfo, type:" + tPDetailInfo.type + ", time:" + tPDetailInfo.timeSince1970Us);
            a(5, tPDetailInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onError(int i10, int i11) {
            b.this.f102274g.c("onError, msgType:" + i10 + ", errorCode:" + i11);
            c cVar = new c();
            cVar.f102295a = i10;
            cVar.f102296b = i11;
            a(4, cVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onInfoLong(int i10, long j10, long j11) {
            if (i10 == 253) {
                com.tencent.thumbplayer.tcmedia.adapter.a.b.a.b(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, (int) j10));
                return;
            }
            d dVar = new d();
            dVar.f102297a = i10;
            dVar.f102298b = j10;
            dVar.f102299c = j11;
            a(2, dVar);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback
        public void onInfoObject(int i10, Object obj, long j10, long j11) {
            if (!b.this.d(i10)) {
                b.this.f102274g.b("onInfoObject, infoType:" + i10 + ", objParam:" + obj);
            }
            e eVar = new e();
            eVar.f102300a = i10;
            eVar.f102301b = obj;
            eVar.f102302c = j10;
            eVar.f102303d = j11;
            a(3, eVar);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ITPNativePlayerAudioFrameCallback f102276i = new ITPNativePlayerAudioFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.2
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerAudioFrameCallback
        public void onAudioFrame(TPAudioFrame tPAudioFrame, int i10) {
            b.this.f102272e.a(com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPAudioFrame));
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ITPNativePlayerVideoFrameCallback f102277j = new ITPNativePlayerVideoFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.3
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerVideoFrameCallback
        public void onVideoFrame(TPVideoFrame tPVideoFrame, int i10) {
            b.this.f102272e.a(com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPVideoFrame));
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ITPNativePlayerSubtitleFrameCallback f102278k = new ITPNativePlayerSubtitleFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.4
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerSubtitleFrameCallback
        public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame, int i10) {
            b.this.f102272e.a(com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPSubtitleFrame));
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ITPNativePlayerPostProcessFrameCallback f102279l = new ITPNativePlayerPostProcessFrameCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.5
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerPostProcessFrameCallback
        public TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i10) {
            TPPostProcessFrameBuffer tPPostProcessFrameBufferB;
            TPPostProcessFrameBuffer tPPostProcessFrameBufferA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPPostProcessFrame);
            tPPostProcessFrameBufferA.eventFlag = i10;
            int i11 = tPPostProcessFrame.mediaType;
            if (i11 == 0) {
                tPPostProcessFrameBufferB = b.this.f102272e.a(tPPostProcessFrameBufferA);
            } else {
                if (i11 != 1) {
                    return null;
                }
                tPPostProcessFrameBufferB = b.this.f102272e.b(tPPostProcessFrameBufferA);
            }
            return com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPPostProcessFrameBufferB);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ITPNativeDemuxerCallback f102280m = new ITPNativeDemuxerCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.6
        @Override // com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback
        public void onDurationUpdated() {
            b.this.f102272e.d();
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.demuxer.ITPNativeDemuxerCallback
        public TPNativeRemoteSdpInfo onSdpExchange(String str, int i10) {
            return com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(b.this.f102272e.a(str, i10));
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITPNativePlayerEventRecordCallback f102281n = new ITPNativePlayerEventRecordCallback() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.b.7
        @Override // com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerEventRecordCallback
        public void onDrmInfo(TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
            if (tPPlayerDrmParams == null) {
                b.this.f102274g.e("Native DrmInfo is null!");
                return;
            }
            b.this.f102274g.c("onDrmInfo");
            b.this.f102272e.a(com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPPlayerDrmParams));
        }
    };

    public class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<b> f102290b;

        public a(Looper looper, b bVar) {
            super(looper);
            this.f102290b = new WeakReference<>(bVar);
        }

        private void a(@TPCommonEnum.NativeErrorType int i10, int i11) {
            b.this.f102272e.a(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapErrorType.class, i10), i11, 0L, 0L);
        }

        private void a(C1012b c1012b) {
            int i10 = c1012b.f102291a;
            if (i10 == 1) {
                b.this.b();
            } else if (i10 != 2) {
                b.this.a(c1012b);
            } else {
                b.this.c();
            }
        }

        private void a(d dVar) {
            int i10 = dVar.f102297a;
            if (i10 == 154) {
                b.this.d();
            } else if (i10 != 250) {
                b.this.a(i10, dVar);
            } else {
                b.this.a(dVar.f102298b, dVar.f102299c);
            }
        }

        private void a(e eVar) {
            int i10 = eVar.f102300a;
            if (i10 != 502) {
                b.this.a(i10, eVar);
            } else if (eVar.f102301b instanceof String) {
                TPSubtitleData tPSubtitleData = new TPSubtitleData();
                tPSubtitleData.subtitleData = (String) eVar.f102301b;
                tPSubtitleData.trackIndex = eVar.f102302c;
                b.this.f102272e.a(tPSubtitleData);
            }
        }

        private void a(TPDetailInfo tPDetailInfo) {
            b.this.f102272e.a(com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPDetailInfo));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f102290b.get() == null) {
                b.this.f102274g.e("mWeakRef is null");
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                a((C1012b) message.obj);
                return;
            }
            if (i10 == 2) {
                a((d) message.obj);
                return;
            }
            if (i10 == 3) {
                a((e) message.obj);
                return;
            }
            if (i10 == 4) {
                c cVar = (c) message.obj;
                a(cVar.f102295a, cVar.f102296b);
            } else {
                if (i10 == 5) {
                    a((TPDetailInfo) message.obj);
                    return;
                }
                b.this.f102274g.d("message :" + message.what + "  not recognition");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.b$b, reason: collision with other inner class name */
    public static class C1012b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @TPCommonEnum.NativeMsgInfo
        int f102291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f102292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f102293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f102294d;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102296b;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f102298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f102299c;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f102301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f102302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f102303d;
    }

    public b(Context context, com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102274g = new com.tencent.thumbplayer.tcmedia.e.a(bVar, "TPThumbPlayer");
        TPNativePlayer tPNativePlayer = new TPNativePlayer(context);
        this.f102269b = tPNativePlayer;
        tPNativePlayer.setMessageCallback(this.f102275h);
        this.f102269b.setAudioFrameCallback(this.f102276i);
        this.f102269b.setVideoFrameCallback(this.f102277j);
        this.f102269b.setSubtitleFrameCallback(this.f102278k);
        this.f102269b.setPostProcessFrameCallback(this.f102279l);
        this.f102269b.setDemuxerCallback(this.f102280m);
        this.f102269b.setEventRecordCallback(this.f102281n);
        this.f102270c = new TPNativePlayerInitConfig();
        this.f102272e = new g(this.f102274g.b());
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f102271d = new a(looperMyLooper, this);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.f102271d = new a(mainLooper, this);
        } else {
            this.f102271d = null;
        }
    }

    private TPProgramInfo a(TPNativePlayerProgramInfo tPNativePlayerProgramInfo) {
        if (tPNativePlayerProgramInfo == null) {
            return null;
        }
        TPProgramInfo tPProgramInfo = new TPProgramInfo();
        tPProgramInfo.url = tPNativePlayerProgramInfo.url;
        tPProgramInfo.bandwidth = tPNativePlayerProgramInfo.bandwidth;
        tPProgramInfo.resolution = tPNativePlayerProgramInfo.resolution;
        tPProgramInfo.programId = tPNativePlayerProgramInfo.programId;
        tPProgramInfo.actived = tPNativePlayerProgramInfo.actived;
        return tPProgramInfo;
    }

    private TPTrackInfo a(TPMediaTrackInfo tPMediaTrackInfo) {
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = tPMediaTrackInfo.trackName;
        tPTrackInfo.trackType = tPMediaTrackInfo.trackType;
        int i10 = tPMediaTrackInfo.contianerType;
        tPTrackInfo.containerType = i10;
        if (i10 == 1) {
            TPHlsTag tPHlsTag = tPTrackInfo.hlsTag;
            TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfo.hlsTag;
            tPHlsTag.name = tPMediaTrackHlsTag.name;
            tPHlsTag.bandwidth = tPMediaTrackHlsTag.bandwidth;
            tPHlsTag.resolution = tPMediaTrackHlsTag.resolution;
            tPHlsTag.framerate = tPMediaTrackHlsTag.framerate;
            tPHlsTag.codecs = tPMediaTrackHlsTag.codecs;
            tPHlsTag.groupId = tPMediaTrackHlsTag.groupId;
            String str = tPMediaTrackHlsTag.language;
            tPHlsTag.language = str;
            tPTrackInfo.language = str;
        } else if (i10 == 2) {
            TPDashFormat tPDashFormatA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a(tPMediaTrackInfo.dashFormat);
            tPTrackInfo.dashFormat = tPDashFormatA;
            tPTrackInfo.language = tPDashFormatA.language;
        }
        tPTrackInfo.isExclusive = tPMediaTrackInfo.isExclusive;
        tPTrackInfo.isSelected = tPMediaTrackInfo.isSelected;
        tPTrackInfo.isInternal = tPMediaTrackInfo.isInternal;
        return tPTrackInfo;
    }

    private void a() {
        if (this.f102269b == null) {
            throw new IllegalStateException("player has release");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@TPCommonEnum.NativeErrorType int i10, d dVar) {
        Class cls;
        long tPIntValue;
        int tPIntValue2 = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, i10);
        if (tPIntValue2 < 0) {
            this.f102274g.d("msgType:" + i10 + ", cannot convert to thumbPlayer Info");
            return;
        }
        long j10 = dVar.f102298b;
        long j11 = dVar.f102299c;
        if (tPIntValue2 != 203) {
            if (tPIntValue2 != 204) {
                this.f102274g.d("unhandled thumbPlayerInfo=".concat(String.valueOf(tPIntValue2)));
                tPIntValue = j10;
            } else {
                cls = TPNativeKeyMap.MapVideoDecoderType.class;
            }
            this.f102272e.a(tPIntValue2, tPIntValue, j11, (Object) null);
        }
        cls = TPNativeKeyMap.MapAudioDecoderType.class;
        tPIntValue = TPNativeKeyMapUtil.toTPIntValue(cls, (int) j10);
        this.f102272e.a(tPIntValue2, tPIntValue, j11, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(@TPCommonEnum.NativeMsgInfo int i10, e eVar) {
        Object obj;
        Object objA;
        Object obj2;
        int tPIntValue = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, i10);
        if (tPIntValue < 0 || (obj = eVar.f102301b) == null) {
            this.f102274g.d("msgType:" + i10 + ", cannot convert to thumbPlayer Info");
            return;
        }
        switch (tPIntValue) {
            case 500:
                objA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((ITPNativePlayerMessageCallback.VideoCropInfo) obj);
                obj2 = objA;
                break;
            case 501:
            case 504:
            default:
                obj2 = obj;
                break;
            case 502:
                objA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((ITPNativePlayerMessageCallback.MediaCodecInfo) obj);
                obj2 = objA;
                break;
            case 503:
                objA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((ITPNativePlayerMessageCallback.VideoSeiInfo) obj);
                obj2 = objA;
                break;
            case 505:
                objA = com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((ITPNativePlayerMessageCallback.MediaDrmInfo) obj);
                obj2 = objA;
                break;
            case 506:
                obj = (String) obj;
                this.f102274g.b("TP_PLAYER_INFO_OBJECT_SUBTITLE_NOTE:".concat(String.valueOf(obj)));
                obj2 = obj;
                break;
        }
        this.f102272e.a(tPIntValue, 0L, 0L, obj2);
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping boolean is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.b() == 3) {
            this.f102270c.setBool(aVarConvertToNativeOptionalId.c(), optionalParamBoolean.value);
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamFloat optionalParamFloat) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping float is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (7 == aVarConvertToNativeOptionalId.b()) {
            this.f102270c.setFloat(aVarConvertToNativeOptionalId.c(), optionalParamFloat.value);
            return;
        }
        this.f102274g.e("optionID:" + aVarConvertToNativeOptionalId.c() + " is not float");
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamLong optionalParamLong) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping long is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        int iB = aVarConvertToNativeOptionalId.b();
        if (iB == 1) {
            this.f102270c.setLong(aVarConvertToNativeOptionalId.c(), optionalParamLong.value);
            return;
        }
        if (iB == 3) {
            this.f102270c.setBool(aVarConvertToNativeOptionalId.c(), optionalParamLong.value > 0);
            return;
        }
        if (iB == 4) {
            this.f102270c.setInt(aVarConvertToNativeOptionalId.c(), (int) optionalParamLong.value);
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamObject optionalParamObject) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId == null) {
            this.f102274g.e("convertToNativeOptionalId failed, key: ".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping object is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        int iC = aVarConvertToNativeOptionalId.c();
        if (iC == 126) {
            this.f102270c.setObject(aVarConvertToNativeOptionalId.c(), com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((TPJitterBufferConfig) optionalParamObject.objectValue));
        } else {
            if (iC == 414) {
                this.f102270c.setObject(aVarConvertToNativeOptionalId.c(), com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((TPAudioAttributes) optionalParamObject.objectValue));
                return;
            }
            this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
        }
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping queue_int is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        int[] iArr = optionalParamQueueInt.queueValue;
        if (iArr == null || iArr.length == 0) {
            this.f102274g.e("queueint params is empty in".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.b() == 5) {
            for (int i11 = 0; i11 < optionalParamQueueInt.queueValue.length; i11++) {
                this.f102270c.addQueueInt(aVarConvertToNativeOptionalId.c(), optionalParamQueueInt.queueValue[i11]);
            }
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void a(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamQueueString optionalParamQueueString) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping queue_string is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        String[] strArr = optionalParamQueueString.queueValue;
        if (strArr == null || strArr.length == 0) {
            this.f102274g.e("queue String params is empty in".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.b() == 6) {
            for (int i11 = 0; i11 < optionalParamQueueString.queueValue.length; i11++) {
                this.f102270c.addQueueString(aVarConvertToNativeOptionalId.c(), optionalParamQueueString.queueValue[i11]);
            }
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void a(int i10, TPOptionalParam.OptionalParamString optionalParamString) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (2 == aVarConvertToNativeOptionalId.b()) {
            this.f102270c.setString(aVarConvertToNativeOptionalId.c(), optionalParamString.value);
            return;
        }
        this.f102274g.e("optionID:" + aVarConvertToNativeOptionalId.c() + " is not string");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10, long j11) {
        this.f102272e.a(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(C1012b c1012b) {
        this.f102272e.a(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, c1012b.f102291a), c1012b.f102293c, c1012b.f102294d, Long.valueOf(c1012b.f102292b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f102272e.a();
    }

    private void b(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.b() == 3) {
            this.f102269b.setOptionLong(aVarConvertToNativeOptionalId.c(), optionalParamBoolean.value ? 1L : 0L, 0L);
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void b(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamLong optionalParamLong) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping long is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        int iB = aVarConvertToNativeOptionalId.b();
        if (iB == 1 || iB == 3 || iB == 4) {
            this.f102269b.setOptionLong(aVarConvertToNativeOptionalId.c(), optionalParamLong.value, optionalParamLong.param1);
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void b(int i10, TPOptionalParam.OptionalParamObject optionalParamObject) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId == null) {
            this.f102274g.e("player optionaIdMapping object is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.c() == 1001) {
            this.f102269b.setOptionObject(aVarConvertToNativeOptionalId.c(), com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a((TPSubtitleRenderModel) optionalParamObject.objectValue));
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    private void b(@TPCommonEnum.TPOptionalId int i10, TPOptionalParam.OptionalParamString optionalParamString) {
        com.tencent.thumbplayer.tcmedia.adapter.a.b.c.a aVarConvertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i10);
        if (aVarConvertToNativeOptionalId.a()) {
            this.f102274g.e("player optionalIdMapping string is invalid, not found in array, id: ".concat(String.valueOf(i10)));
            return;
        }
        if (aVarConvertToNativeOptionalId.b() == 2) {
            this.f102269b.setOptionObject(aVarConvertToNativeOptionalId.c(), optionalParamString.value);
            return;
        }
        this.f102274g.e("optionID type:" + aVarConvertToNativeOptionalId.b() + " is not implement");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f102272e.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f102272e.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i10) {
        return f102268a.contains(Integer.valueOf(i10));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(float f10) {
        this.f102274g.c("setAudioGainRatio:".concat(String.valueOf(f10)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.setAudioVolume(f10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10) {
        this.f102274g.c("seekTo:".concat(String.valueOf(i10)));
        a();
        if (this.f102269b.seekToAsync(i10, 1, 0L) == 0) {
            return;
        }
        throw new IllegalStateException("seek to position:" + i10 + " failed!!");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, @TPCommonEnum.TPSeekMode int i11) {
        this.f102274g.c("seekTo:" + i10 + " mode:" + i11);
        a();
        if (this.f102269b.seekToAsync(i10, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSeekMode.class, i11), 0L) == 0) {
            return;
        }
        throw new IllegalStateException("seek to position:" + i10 + " failed!!");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(int i10, long j10) {
        this.f102274g.c("selectTrack");
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.selectTrackAsync(i10, j10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(AssetFileDescriptor assetFileDescriptor) throws IOException {
        if (assetFileDescriptor == null) {
            throw new IllegalStateException("setDataSource url afd is null!!");
        }
        int iDetachFd = assetFileDescriptor.getParcelFileDescriptor().detachFd();
        long startOffset = assetFileDescriptor.getStartOffset();
        long length = assetFileDescriptor.getLength();
        ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(iDetachFd);
        int iDetachFd2 = parcelFileDescriptorFromFd.detachFd();
        parcelFileDescriptorFromFd.close();
        assetFileDescriptor.close();
        this.f102274g.c("setDataSource: " + assetFileDescriptor + ", playFd: " + iDetachFd + ", offset: " + startOffset + ", length: " + length + ", captureFd: " + iDetachFd2);
        a();
        if (this.f102269b.setDataSource(iDetachFd, startOffset, length) != 0) {
            throw new IllegalStateException("setDataSource url afd failed!!");
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(iDetachFd2, startOffset, length);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor == null) {
            throw new IllegalStateException("setDataSource url pfd is null!!");
        }
        int iDetachFd = parcelFileDescriptor.detachFd();
        ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(iDetachFd);
        int iDetachFd2 = parcelFileDescriptorFromFd.detachFd();
        parcelFileDescriptorFromFd.close();
        parcelFileDescriptor.close();
        this.f102274g.c("setDataSource: " + parcelFileDescriptor + ", playFd:" + iDetachFd + ", captureFd: " + iDetachFd2);
        a();
        if (this.f102269b.setDataSource(iDetachFd, 0L, 0L) != 0) {
            throw new IllegalStateException("setDataSource url pfd failed!!");
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(iDetachFd2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(Surface surface) {
        com.tencent.thumbplayer.tcmedia.e.a aVar = this.f102274g;
        StringBuilder sb2 = new StringBuilder("setSurface, surface is null ? : ");
        sb2.append(surface == null);
        aVar.c(sb2.toString());
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else if (tPNativePlayer.setVideoSurface(surface) != 0) {
            throw new IllegalStateException("setSurface failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(SurfaceHolder surfaceHolder) {
        com.tencent.thumbplayer.tcmedia.e.a aVar = this.f102274g;
        StringBuilder sb2 = new StringBuilder("SurfaceHolder, surfaceHolder is null ? : ");
        sb2.append(surfaceHolder == null);
        aVar.c(sb2.toString());
        if (this.f102269b == null) {
            this.f102274g.d("player has released, return");
        } else if (surfaceHolder != null && surfaceHolder.getSurface() == null) {
            this.f102274g.e("SurfaceHolder，err.");
        } else {
            if (this.f102269b.setVideoSurface(surfaceHolder == null ? null : surfaceHolder.getSurface()) != 0) {
                throw new IllegalStateException("setSurface failed!!");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.a aVar) {
        this.f102272e.a(aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.b bVar) {
        this.f102272e.a(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.InterfaceC1013c interfaceC1013c) {
        this.f102272e.a(interfaceC1013c);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.d dVar) {
        this.f102272e.a(dVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.e eVar) {
        this.f102272e.a(eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.f fVar) {
        this.f102272e.a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.g gVar) {
        this.f102272e.a(gVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.h hVar) {
        this.f102272e.a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.i iVar) {
        this.f102272e.a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.j jVar) {
        this.f102272e.a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.l lVar) {
        this.f102272e.a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.m mVar) {
        this.f102272e.a(mVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.n nVar) {
        this.f102272e.a(nVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.o oVar) {
        this.f102272e.a(oVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.c.p pVar) {
        this.f102272e.a(pVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        this.f102274g.c("captureVideo, params".concat(String.valueOf(tPCaptureParams)));
        if (this.f102273f == null) {
            tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
            return;
        }
        TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        this.f102273f.a(o(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(TPOptionalParam tPOptionalParam) {
        this.f102274g.b("setPlayerOptionalParam:".concat(String.valueOf(tPOptionalParam)));
        if (this.f102269b == null) {
            this.f102274g.d("player has released, return");
            return;
        }
        if (tPOptionalParam.getParamType() == 1) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            } else {
                b(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 2) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            } else {
                b(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 6) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamFloat());
                return;
            }
            return;
        }
        if (tPOptionalParam.getParamType() == 3) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            } else {
                b(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
                return;
            }
        }
        if (tPOptionalParam.getParamType() == 4) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueInt());
            }
        } else if (tPOptionalParam.getParamType() == 5) {
            if (tPOptionalParam.getKey() < 500) {
                a(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueString());
            }
        } else if (tPOptionalParam.getParamType() != 7) {
            this.f102274g.d("optionalParam param type is unknown, return");
        } else if (tPOptionalParam.getKey() < 500) {
            a(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        } else {
            b(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset) {
        this.f102274g.c("setDataSource: ".concat(String.valueOf(iTPMediaAsset)));
        a();
        if (iTPMediaAsset == null) {
            throw new IllegalStateException("media asset is null!");
        }
        String url = iTPMediaAsset.getUrl();
        Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
        if ((httpHeader == null ? this.f102269b.setDataSource(url) : this.f102269b.setDataSource(url, httpHeader)) != 0) {
            throw new IllegalStateException("setDataSource mediaAsset failed!!");
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(url);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        this.f102274g.c("switchDefinition mediaAsset:" + iTPMediaAsset + " opaque:" + j10);
        a();
        if (iTPMediaAsset != null) {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i10);
            Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
            if ((httpHeader == null ? this.f102269b.switchDefinitionAsync(iTPMediaAsset.getUrl(), nativeIntValue, j10) : this.f102269b.switchDefinitionAsync(iTPMediaAsset.getUrl(), httpHeader, nativeIntValue, j10)) != 0) {
                throw new IllegalStateException("switchDefinition in invalid state");
            }
            this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(iTPMediaAsset.getUrl());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(com.tencent.thumbplayer.tcmedia.e.b bVar) {
        this.f102274g.a(new com.tencent.thumbplayer.tcmedia.e.b(bVar, "TPThumbPlayer"));
        if (bVar != null) {
            this.f102272e.a(this.f102274g.a().a());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str) {
        this.f102274g.c("setAudioNormalizeVolumeParams:".concat(String.valueOf(str)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.setAudioNormalizeVolumeParams(str);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        this.f102274g.c("switchDefinition url:" + str + " opaque:" + j10);
        a();
        if (this.f102269b.switchDefinitionAsync(str, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i10), j10) != 0) {
            throw new IllegalStateException("switchDefinition in invalid state");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.a aVar = this.f102273f;
        if (aVar != null) {
            aVar.a();
            this.f102273f = null;
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map) {
        this.f102274g.c("setDataSource: ".concat(String.valueOf(str)));
        a();
        if (this.f102269b.setDataSource(str, map) != 0) {
            throw new IllegalStateException("setDataSource url and header failed!!");
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i10, long j10) {
        this.f102274g.c("switchDefinition url:" + str + "httpHeader:" + map + " opaque:" + j10);
        a();
        if (this.f102269b.switchDefinitionAsync(str, map, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i10), j10) != 0) {
            throw new IllegalStateException("switchDefinition in invalid state");
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.a aVar = this.f102273f;
        if (aVar != null) {
            aVar.a();
            this.f102273f = null;
        }
        this.f102273f = new com.tencent.thumbplayer.tcmedia.a.d(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, String str3) {
        this.f102274g.c("addSubtitleSource");
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.addSubtitleTrackSource(str, str3, map);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.f102274g.c("addAudioTrackSource");
        if (this.f102269b == null) {
            this.f102274g.d("player has released, return");
            return;
        }
        TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
        tPAudioTrackInfo.audioTrackUrl = str;
        tPAudioTrackInfo.paramData = list;
        g gVar = this.f102272e;
        if (gVar != null) {
            gVar.a(1012, 0L, 0L, tPAudioTrackInfo);
        }
        if (TextUtils.isEmpty(tPAudioTrackInfo.proxyUrl)) {
            this.f102269b.addAudioTrackSource(tPAudioTrackInfo.audioTrackUrl, str2, tPAudioTrackInfo.httpHeader);
        } else {
            this.f102269b.addAudioTrackSource(tPAudioTrackInfo.proxyUrl, str2, tPAudioTrackInfo.httpHeader);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10) {
        this.f102274g.c("setOutputMute:".concat(String.valueOf(z10)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.setAudioMute(z10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void a(boolean z10, long j10, long j11) {
        this.f102274g.c("setLoopback:" + z10 + " loopStartPositionMs:" + j10 + " loopEndPositionMs:" + j11);
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else if (tPNativePlayer.setLoopback(z10, j10, j11) != 0) {
            throw new IllegalStateException("set loopback failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long b(int i10) {
        a();
        int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i10);
        if (nativeIntValue >= 0) {
            return this.f102269b.getPropertyLong(nativeIntValue);
        }
        this.f102274g.d("paramId not found, return -1");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(float f10) {
        this.f102274g.c("setPlaySpeedRatio:".concat(String.valueOf(f10)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.setPlaybackRate(f10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(int i10, long j10) {
        this.f102274g.c("selectTrack");
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.deselectTrackAsync(i10, j10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void b(boolean z10) {
        this.f102274g.c("setLoopback:".concat(String.valueOf(z10)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.setLoopback(z10, 0L, -1L);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPDynamicStatisticParams c(boolean z10) {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getDynamicStatisticParams(z10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public String c(int i10) {
        this.f102274g.b("getPropertyString:".concat(String.valueOf(i10)));
        a();
        try {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i10);
            if (nativeIntValue >= 0) {
                return this.f102269b.getPropertyString(nativeIntValue);
            }
            this.f102274g.d("getPropertyString, tpToNativeValue(TPNativeKeyMap.MapPropertyId.class," + i10 + "), return" + nativeIntValue);
            return "";
        } catch (IllegalArgumentException unused) {
            this.f102274g.d("paramId not found, return");
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void c(int i10, long j10) {
        this.f102274g.c("selectProgram, programIndex:".concat(String.valueOf(i10)));
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            this.f102274g.d("player has released, return");
        } else {
            tPNativePlayer.selectProgramAsync(i10, j10);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void g() {
        this.f102274g.c("prepare");
        a();
        this.f102269b.setInitConfig(this.f102270c);
        if (this.f102269b.prepare() != 0) {
            throw new IllegalStateException("prepare failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void h() {
        this.f102274g.c("prepareAsync");
        a();
        this.f102269b.setInitConfig(this.f102270c);
        if (this.f102269b.prepareAsync() != 0) {
            throw new IllegalStateException("prepareAsync failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void i() {
        this.f102274g.c(com.google.android.exoplayer2.text.ttml.d.f49798o0);
        a();
        if (this.f102269b.start() != 0) {
            throw new IllegalStateException("start failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void j() {
        this.f102274g.c("pause");
        a();
        if (this.f102269b.pause() != 0) {
            throw new IllegalStateException("pause failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void k() {
        this.f102274g.c("stop");
        a();
        this.f102274g.c("stop before");
        int iStop = this.f102269b.stop();
        this.f102274g.c("stop after");
        if (iStop != 0) {
            throw new IllegalStateException("stop failed!!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void l() {
        this.f102274g.c("reset");
        if (this.f102269b == null) {
            this.f102274g.d("reset, player has released.");
            return;
        }
        this.f102274g.c("reset before");
        this.f102269b.reset();
        a aVar = this.f102271d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
        this.f102274g.c("reset after");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public void m() {
        this.f102274g.c("release");
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            tPNativePlayer.release();
            this.f102269b = null;
        }
        com.tencent.thumbplayer.tcmedia.adapter.a.a aVar = this.f102273f;
        if (aVar != null) {
            aVar.a();
            this.f102273f = null;
        }
        a aVar2 = this.f102271d;
        if (aVar2 != null) {
            aVar2.removeCallbacksAndMessages(null);
            this.f102271d = null;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long n() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDurationMs();
        }
        this.f102274g.c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long o() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getCurrentPositionMs();
        }
        this.f102274g.c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long p() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedDurationMs() + this.f102269b.getCurrentPositionMs();
        }
        this.f102274g.c("player has released, return 0");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int q() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoWidth();
        }
        this.f102274g.c("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public int r() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoHeight();
        }
        this.f102274g.c("player has released, return 0");
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPTrackInfo[] s() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        TPTrackInfo[] tPTrackInfoArr = null;
        if (tPNativePlayer == null) {
            this.f102274g.c("player has released, return 0");
            return null;
        }
        TPMediaTrackInfo[] trackInfo = tPNativePlayer.getTrackInfo();
        if (trackInfo != null && trackInfo.length > 0) {
            tPTrackInfoArr = new TPTrackInfo[trackInfo.length];
            for (int i10 = 0; i10 < trackInfo.length; i10++) {
                tPTrackInfoArr[i10] = a(trackInfo[i10]);
            }
        }
        return tPTrackInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPProgramInfo[] t() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        TPProgramInfo[] tPProgramInfoArr = null;
        if (tPNativePlayer == null) {
            this.f102274g.c("player has released, return 0");
            return null;
        }
        TPNativePlayerProgramInfo[] programInfo = tPNativePlayer.getProgramInfo();
        if (programInfo != null && programInfo.length > 0) {
            tPProgramInfoArr = new TPProgramInfo[programInfo.length];
            for (int i10 = 0; i10 < programInfo.length; i10++) {
                tPProgramInfoArr[i10] = a(programInfo[i10]);
            }
        }
        return tPProgramInfoArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public long[] u() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDemuxerOffsetInFile();
        }
        this.f102274g.c("player has released, return -1");
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.a.b
    public TPGeneralPlayFlowParams v() {
        TPNativePlayer tPNativePlayer = this.f102269b;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getGeneralPlayFlowParams();
    }
}
