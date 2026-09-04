package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.MediaPlayerCustomSourceSeekWhence;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface IMediaPlayerCustomSourceProvider {
    int onReadData(ByteBuffer byteBuffer, int i10);

    long onSeek(long j10, MediaPlayerCustomSourceSeekWhence mediaPlayerCustomSourceSeekWhence);
}
