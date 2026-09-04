package com.ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes4.dex */
public enum AudioScenarioType {
    AUDIO_SCENARIO_MUSIC(0),
    AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION(1),
    AUDIO_SCENARIO_COMMUNICATION(2),
    AUDIO_SCENARIO_MEDIA(3),
    AUDIO_SCENARIO_GAME_STREAMING(4),
    AUDIO_SCENARIO_HIGHQUALITY_CHAT(5);

    private final int value;

    AudioScenarioType(int i10) {
        this.value = i10;
    }

    public static AudioScenarioType fromId(int i10) {
        for (AudioScenarioType audioScenarioType : values()) {
            if (audioScenarioType.value() == i10) {
                return audioScenarioType;
            }
        }
        return AUDIO_SCENARIO_MUSIC;
    }

    public int value() {
        return this.value;
    }
}
