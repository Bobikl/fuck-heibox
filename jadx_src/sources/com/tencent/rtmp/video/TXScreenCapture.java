package com.tencent.rtmp.video;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.c;
import com.tencent.liteav.videoproducer.capture.VirtualDisplayManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TXScreenCapture {

    public static class TXScreenCaptureAssistantActivity extends Activity {
        private static final String FINISH_ACTIVITY_ACTION = "com.tencent.liteav.video.action.FINISH_SCREEN_CAPTURE_ACTIVITY";
        private static final int REQUEST_CODE = 100;
        private static final String TAG = "TXScreenCaptureAssistantActivity";
        private final BroadcastReceiver mFinishReceiver = new BroadcastReceiver() { // from class: com.tencent.rtmp.video.TXScreenCapture.TXScreenCaptureAssistantActivity.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                TXScreenCaptureAssistantActivity.this.finish();
            }
        };
        private MediaProjectionManager mMediaProjectionManager;

        @Override // android.app.Activity
        public void onActivityResult(int i10, int i11, Intent intent) {
            LiteavLog.i(TAG, "onActivityResult " + this + ", resultCode:" + i11 + ", data:" + intent);
            MediaProjection mediaProjection = null;
            if (intent == null) {
                VirtualDisplayManager.a(this).a((MediaProjection) null);
                finish();
                return;
            }
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 26) {
                LiteavLog.i(TAG, "startForegroundService");
                Intent intent2 = new Intent(this, (Class<?>) ScreenCaptureService.class);
                intent2.putExtra("code", i11);
                intent2.putExtra("data", intent);
                startForegroundService(intent2);
            } else {
                try {
                    mediaProjection = this.mMediaProjectionManager.getMediaProjection(i11, intent);
                } catch (Throwable th2) {
                    LiteavLog.e(TAG, "onActivityResult mMediaProjectionManager.getMediaProjection fail.", th2);
                }
                LiteavLog.i(TAG, "ProjectionManger get mediaProjection:".concat(String.valueOf(mediaProjection)));
                VirtualDisplayManager.a(this).a(mediaProjection);
            }
            finish();
        }

        @Override // android.app.Activity
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            LiteavLog.i(TAG, "onCreate ".concat(String.valueOf(this)));
            requestWindowFeature(1);
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            this.mMediaProjectionManager = mediaProjectionManager;
            try {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 100);
            } catch (Throwable th2) {
                LiteavLog.e(TAG, "Start permission activity failed. ".concat(String.valueOf(th2)));
                VirtualDisplayManager.a(this).a((MediaProjection) null);
                finish();
            }
            c.a().a(this.mFinishReceiver, new IntentFilter(FINISH_ACTIVITY_ACTION));
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            super.onDestroy();
            LiteavLog.i(TAG, "onDestroy ".concat(String.valueOf(this)));
            c cVarA = c.a();
            BroadcastReceiver broadcastReceiver = this.mFinishReceiver;
            synchronized (cVarA.f100421b) {
                ArrayList<c.b> arrayListRemove = cVarA.f100421b.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    c.b bVar = arrayListRemove.get(size);
                    bVar.f100431d = true;
                    for (int i10 = 0; i10 < bVar.f100428a.countActions(); i10++) {
                        String action = bVar.f100428a.getAction(i10);
                        ArrayList<c.b> arrayList = cVarA.f100422c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c.b bVar2 = arrayList.get(size2);
                                if (bVar2.f100429b == broadcastReceiver) {
                                    bVar2.f100431d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                cVarA.f100422c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
