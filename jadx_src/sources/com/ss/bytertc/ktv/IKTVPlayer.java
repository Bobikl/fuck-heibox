package com.ss.bytertc.ktv;

import androidx.annotation.n0;
import com.ss.bytertc.ktv.data.AudioPlayType;
import com.ss.bytertc.ktv.data.AudioTrackType;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IKTVPlayer {
    public abstract void pauseMusic(@n0 String str);

    public abstract void playMusic(@n0 String str, @n0 AudioTrackType audioTrackType, @n0 AudioPlayType audioPlayType);

    public abstract void resumeMusic(@n0 String str);

    public abstract void seekMusic(@n0 String str, int i10);

    public abstract void setMusicPitch(@n0 String str, int i10);

    public abstract void setMusicVolume(@n0 String str, int i10);

    public abstract void setPlayerEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler);

    public abstract void stopMusic(@n0 String str);

    public abstract void switchAudioTrackType(@n0 String str);
}
