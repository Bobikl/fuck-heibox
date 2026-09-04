package com.ss.bytertc.audio.device.hwearback;

import com.ss.bytertc.audio.device.router.device.HWEarBackDeviceSupport;
import com.ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes10.dex */
public class HwEarback implements IHardWareEarback {
    private HWEarBackDeviceSupport hwEarback;

    public HwEarback(WebRtcAudioEarBack webRtcAudioEarBack) {
        this.hwEarback = null;
        this.hwEarback = new HWEarBackDeviceSupport(webRtcAudioEarBack);
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int close() {
        return this.hwEarback.HWEnableKaraoke(false);
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int getLatency() {
        return this.hwEarback.getLatency();
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int init() {
        this.hwEarback.HWEarBack_init();
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        return this.hwEarback.HWGetKaraokeSupport();
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public void onEvent(int i10, int i11) {
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int open() {
        return this.hwEarback.HWEnableKaraoke(true);
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int release() {
        close();
        this.hwEarback.HWDestroy();
        return 0;
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEffect(int i10) {
        return this.hwEarback.HWSetEffectMode(i10);
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setEqualizer(int i10) {
        return this.hwEarback.HWSetEqualizerMode(i10);
    }

    @Override // com.ss.bytertc.audio.device.hwearback.IHardWareEarback
    public int setVolume(int i10) {
        return this.hwEarback.setVolume(i10);
    }
}
