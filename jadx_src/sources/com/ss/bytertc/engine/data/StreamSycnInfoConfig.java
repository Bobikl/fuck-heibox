package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class StreamSycnInfoConfig {
    public int repeatCount;
    public StreamIndex streamIndex;
    public SyncInfoStreamType streamType;

    public enum SyncInfoStreamType {
        SYNC_INFO_STREAM_TYPE_AUDIO
    }

    public StreamSycnInfoConfig(StreamIndex streamIndex, int i10, SyncInfoStreamType syncInfoStreamType) {
        this.streamIndex = streamIndex;
        this.repeatCount = i10;
        this.streamType = syncInfoStreamType;
    }

    public String toString() {
        return "StreamSycnInfoConfig{ streamIndex='" + this.streamIndex.toString() + "'repeatCount='" + this.repeatCount + "'streamType=Audio }";
    }
}
