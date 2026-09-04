package com.ss.bytertc.engine.flutter.screencapture;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.flutter.base.RTCVideoManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseScreenCaptureRequestActivity extends Activity {
    private static final int REQUEST_CODE_SCREEN_CAPTURE = 9679;

    @w0(api = 26)
    private void startRXScreenCaptureService(Intent intent) {
        Intent intent2 = new Intent();
        intent2.putExtra("largei", getLargeIcon());
        intent2.putExtra("largei", getSmallIcon());
        intent2.putExtra(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY, getLaunchActivity().getCanonicalName());
        intent2.putExtra(RXScreenCaptureService.KEY_CONTENT_TEXT, getContextText());
        intent2.putExtra(RXScreenCaptureService.KEY_RESULT_DATA, intent);
        startForegroundService(RXScreenCaptureService.getServiceIntent(this, 0, intent2));
    }

    public abstract String getContextText();

    public abstract int getLargeIcon();

    public abstract Class<? extends Activity> getLaunchActivity();

    public abstract int getSmallIcon();

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 9679) {
            super.onActivityResult(i10, i11, intent);
            return;
        }
        if (i11 == -1) {
            ScreenMediaType screenMediaType = (ScreenMediaType) getIntent().getSerializableExtra("type");
            if (Build.VERSION.SDK_INT >= 26) {
                startRXScreenCaptureService(intent);
            }
            RTCVideoManager.getRTCVideo().startScreenCapture(screenMediaType, intent);
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent(), 9679);
    }
}
