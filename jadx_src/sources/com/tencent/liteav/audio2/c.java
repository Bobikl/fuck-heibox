package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AudioManager$AudioPlaybackCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile a f99533a;

    public interface a {
        void a();
    }

    public c() {
        AudioManager audioManager;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 26 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioPlaybackCallback(this, null);
                Log.i("LiteavAudioPlaybackCallback", "register audio playback callback", new Object[0]);
            } catch (Throwable th2) {
                Log.e("LiteavAudioPlaybackCallback", "register audio playback callback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    public final void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> list) {
        a aVar = this.f99533a;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
