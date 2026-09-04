package com.ss.bytertc.engine.handler;

import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.engine.IMediaPlayerCustomSourceProvider;
import com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import com.ss.bytertc.engine.data.ReturnStatus;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class RTCMediaPlayerCustomSourceProvider {
    private IMediaPlayerCustomSourceProvider mCustomSourceProvider;

    @CalledByNative
    int onReadData(ByteBuffer byteBuffer, int i10) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        return iMediaPlayerCustomSourceProvider != null ? iMediaPlayerCustomSourceProvider.onReadData(byteBuffer, i10) : ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    @CalledByNative
    long onSeek(long j10, int i10) {
        IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider = this.mCustomSourceProvider;
        return iMediaPlayerCustomSourceProvider != null ? iMediaPlayerCustomSourceProvider.onSeek(j10, MediaPlayerCustomSourceSeekWhence.fromId(i10)) : ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
    }

    public void setCustomSourceProvider(IMediaPlayerCustomSourceProvider iMediaPlayerCustomSourceProvider) {
        this.mCustomSourceProvider = iMediaPlayerCustomSourceProvider;
    }
}
