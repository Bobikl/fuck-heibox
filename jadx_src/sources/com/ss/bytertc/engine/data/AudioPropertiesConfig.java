package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class AudioPropertiesConfig {
    public AudioPropertiesMode audioReportMode;
    public boolean enableDeviceLoopDelay;
    public boolean enableSpectrum;
    public boolean enableVad;
    public boolean enableVoicePitch;
    public int interval;
    public AudioReportMode localMainReportMode;
    public float smooth;

    public AudioPropertiesConfig(int i10) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.enableDeviceLoopDelay = true;
        this.interval = i10;
    }

    public AudioPropertiesConfig(int i10, boolean z10, boolean z11) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.enableDeviceLoopDelay = true;
        this.interval = i10;
        this.enableSpectrum = z10;
        this.enableVad = z11;
        this.audioReportMode = audioPropertiesMode;
    }

    public AudioPropertiesConfig(int i10, boolean z10, boolean z11, AudioReportMode audioReportMode) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.enableVoicePitch = false;
        this.enableDeviceLoopDelay = true;
        this.interval = i10;
        this.enableSpectrum = z10;
        this.enableVad = z11;
        this.localMainReportMode = audioReportMode;
    }

    public AudioPropertiesConfig(int i10, boolean z10, boolean z11, AudioReportMode audioReportMode, float f10) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.enableVoicePitch = false;
        this.enableDeviceLoopDelay = true;
        this.interval = i10;
        this.enableSpectrum = z10;
        this.enableVad = z11;
        this.localMainReportMode = audioReportMode;
        this.smooth = f10;
    }

    public AudioPropertiesConfig(int i10, boolean z10, boolean z11, AudioReportMode audioReportMode, float f10, AudioPropertiesMode audioPropertiesMode) {
        this.enableSpectrum = false;
        this.enableVad = false;
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode2 = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.enableVoicePitch = false;
        this.enableDeviceLoopDelay = true;
        this.interval = i10;
        this.enableSpectrum = z10;
        this.enableVad = z11;
        this.localMainReportMode = audioReportMode;
        this.smooth = f10;
        this.audioReportMode = audioPropertiesMode;
    }

    public String toString() {
        return "AudioPropertiesConfig{interval='" + this.interval + "'enable_spectrum='" + this.enableSpectrum + "'enable_vad='" + this.enableVad + "'local_main_report_mode='" + this.localMainReportMode + "'audio_report_mode='" + this.audioReportMode.toString() + "'enable_voice_pitch='" + this.enableVoicePitch + "'enable_device_loop_delay='" + this.enableDeviceLoopDelay + "'}";
    }
}
