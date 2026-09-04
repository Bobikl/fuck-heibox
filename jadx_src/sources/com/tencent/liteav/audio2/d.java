package com.tencent.liteav.audio2;

import android.media.AudioManager;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AudioManager$AudioRecordingCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile a f99534a;

    public interface a {
        void OnRecordingConfigChanged(List<AudioRecordingConfiguration> list);
    }

    public d() {
        AudioManager audioManager;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24 && (audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio")) != null) {
            try {
                audioManager.registerAudioRecordingCallback(this, null);
                Log.i("LiteavAudioRecordingCallback", "register audio recording callback", new Object[0]);
            } catch (Throwable th2) {
                Log.e("LiteavAudioRecordingCallback", "register audio recording callback exception " + th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // android.media.AudioManager$AudioRecordingCallback
    public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
        a aVar = this.f99534a;
        if (aVar == null) {
            return;
        }
        aVar.OnRecordingConfigChanged(list);
    }
}
