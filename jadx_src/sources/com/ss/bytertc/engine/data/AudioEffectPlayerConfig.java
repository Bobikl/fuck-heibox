package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioEffectPlayerConfig {
    public int pitch;
    public int playCount;
    public int startPos;
    public AudioMixingType type;

    public AudioEffectPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
        this.startPos = 0;
        this.pitch = 0;
    }

    public AudioEffectPlayerConfig(AudioMixingType audioMixingType, int i10, int i11, int i12) {
        AudioMixingType audioMixingType2 = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.type = audioMixingType;
        this.playCount = i10;
        this.startPos = i11;
        this.pitch = i12;
    }

    public String toString() {
        return "AudioEffectPlayerConfig{type='" + this.type + "', playCount='" + this.playCount + "', startPos='" + this.startPos + "', pitch='" + this.pitch + "'}";
    }
}
