package com.tencent.trtcplugin.listener;

import android.os.Handler;
import android.os.Looper;
import com.max.xiaoheihe.module.bbs.utils.b;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AudioFrameListener implements TRTCCloudListener.TRTCAudioFrameListener {
    private BasicMessageChannel mBasicChannel;
    private Handler mUIHandler = new Handler(Looper.getMainLooper());

    public AudioFrameListener(BasicMessageChannel basicMessageChannel) {
        this.mBasicChannel = basicMessageChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCapturedAudioFrame$0(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        HashMap map = new HashMap();
        map.put("data", tRTCAudioFrame.data);
        map.put("sampleRate", Integer.valueOf(tRTCAudioFrame.sampleRate));
        map.put(b.f83401f, Integer.valueOf(tRTCAudioFrame.channel));
        map.put("timestamp", Long.valueOf(tRTCAudioFrame.timestamp));
        map.put("extraData", tRTCAudioFrame.extraData);
        HashMap map2 = new HashMap();
        map2.put("method", "onCapturedAudioFrame");
        map2.put("params", map);
        this.mBasicChannel.send(map2);
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onCapturedAudioFrame(final TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mUIHandler.post(new Runnable() { // from class: yg.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f141805b.lambda$onCapturedAudioFrame$0(tRTCAudioFrame);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onLocalProcessedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedAllAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedPlayAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onRemoteUserAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, String str) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onVoiceEarMonitorAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }
}
