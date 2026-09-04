package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.SourceWantedData;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IRTCVideoEventHandlerEx {
    public void onAudioFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState) {
    }

    public void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
    }

    public void onPerformanceAlarms(StreamIndex streamIndex, PerformanceAlarmMode performanceAlarmMode, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
    }

    public void onSimulcastSubscribeFallback(StreamKey streamKey, RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onVideoFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(StreamKey streamKey, String str, FirstFrameSendState firstFrameSendState) {
    }
}
