package com.ss.bytertc.engine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class AudioFocusManager {
    private boolean isAudioFocusLoss = false;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallback = new Application.ActivityLifecycleCallbacks() { // from class: com.ss.bytertc.engine.AudioFocusManager.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@n0 Activity activity, @p0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@n0 Activity activity) {
            AudioManager audioManager = AudioFocusManager.this.getAudioManager();
            if (!AudioFocusManager.this.isAudioFocusLoss || audioManager == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT < 26 ? audioManager.requestAudioFocus(AudioFocusManager.this.onAudioFocusChangeListener, 3, 1) : audioManager.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(AudioFocusManager.this.onAudioFocusChangeListener).build())) == 1) {
                AudioFocusManager.this.mCallback.startMicrophone();
                AudioFocusManager.this.mCallback.startSpeakerphone();
            }
            AudioFocusManager.this.isAudioFocusLoss = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@n0 Activity activity, @n0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@n0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@n0 Activity activity) {
        }
    };
    private AudioManager mAudioManager;
    private Callback mCallback;
    private Context mContext;
    private AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;

    public interface Callback {
        void higherVolume();

        void lowerVolume();

        void startMicrophone();

        void startSpeakerphone();

        void stopMicrophone();

        void stopSpeakerphone();
    }

    public AudioFocusManager(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(context) { // from class: com.ss.bytertc.engine.AudioFocusManager.1
            AudioManager audioManager;
            final /* synthetic */ Context val$context;

            {
                this.val$context = context;
                this.audioManager = (AudioManager) context.getSystemService("audio");
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i10) {
                if (i10 == -2) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    return;
                }
                if (i10 == 1) {
                    AudioFocusManager.this.mCallback.higherVolume();
                    AudioFocusManager.this.mCallback.startSpeakerphone();
                    AudioFocusManager.this.mCallback.startMicrophone();
                } else if (i10 == -1) {
                    AudioFocusManager.this.mCallback.stopSpeakerphone();
                    AudioFocusManager.this.mCallback.stopMicrophone();
                    AudioFocusManager.this.releaseAudioFocus(true);
                } else if (i10 == -3) {
                    AudioFocusManager.this.mCallback.lowerVolume();
                }
            }
        };
        Context context2 = this.mContext;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio");
        }
        return this.mAudioManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseAudioFocus(boolean z10) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                audioManager.abandonAudioFocus(this.onAudioFocusChangeListener);
            } else {
                audioManager.abandonAudioFocusRequest(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = z10;
        }
    }

    public void release() {
        Context context = this.mContext;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallback);
        }
        releaseAudioFocus();
    }

    public void releaseAudioFocus() {
        releaseAudioFocus(false);
    }

    public void requestAudioFocus() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 26) {
                audioManager.requestAudioFocus(this.onAudioFocusChangeListener, 3, 1);
            } else {
                audioManager.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.onAudioFocusChangeListener).build());
            }
            this.isAudioFocusLoss = false;
        }
    }
}
