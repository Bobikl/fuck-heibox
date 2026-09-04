package com.ss.bytertc.base.media.screen;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.w0;
import com.bytedance.realx.base.ContextUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class RXScreenCaptureService extends Service {
    private static final String ACTION = "ACTION";
    public static final int COMMAND_AUDIO_DISPOSE = 8;
    public static final int COMMAND_AUDIO_START = 6;
    public static final int COMMAND_AUDIO_STOP = 7;
    public static final int COMMAND_CHANGE_CAPTURE_FORMAT = 3;
    public static final int COMMAND_DISPOSE = 5;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_LAUNCH = 0;
    public static final int COMMAND_ON_FRAME = 4;
    public static final int COMMAND_START = 1;
    public static final int COMMAND_STOP = 2;
    public static final int COMMAND_STOP_SERVICE = 9;
    private static final String DATA = "DATA";
    public static final String KEY_CONTENT_TEXT = "contentText";
    public static final String KEY_HASHCODE = "hc";
    public static final String KEY_HEIGHT = "h";
    public static final String KEY_IFRAMERATE = "if";
    public static final String KEY_INDEX = "i";
    public static final String KEY_LARGE_ICON = "largei";
    public static final String KEY_LAUNCH_ACTIVITY = "activity";
    public static final String KEY_MIN_FRAMERATE = "minfr";
    public static final String KEY_PICO_CREATE_MEDIA_PROJECTION = "pico_create_media_projection";
    public static final String KEY_PICO_NEED_CAPTURE_2D_TEXTURE = "pico_need_capture_2d_texture";
    public static final String KEY_PICO_NOT_CHECK_ORIENTATION = "pico_not_check_orientation";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_DPI = "pico_virtual_display_dpi";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_FLAG = "pico_virtual_display_flags";
    public static final String KEY_PICO_VIRTUAL_DISPLAY_NAME = "pico_virtual_display_name";
    public static final String KEY_RESULT_DATA = "PermissionResult";
    public static final String KEY_SMALL_ICON = "largei";
    public static final String KEY_WIDTH = "w";
    public static final String METHOD_PICO_CREATE_MEDIA_PROJECTION = "createMediaProjection";
    public static AtomicBoolean serviceStarted = new AtomicBoolean(false);
    String mContentText;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    String mLaunchActivity;
    private MediaProjection mMediaProjection;
    private MediaProjectionManager mMediaProjectionManager;
    private Intent mPermissionReulstData;
    int mLargeIcon = -1;
    int mSmallIcon = -1;
    private boolean mPicoCreateMediaProjection = false;

    private void audioDispose() {
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.e
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$audioDispose$6();
            }
        });
    }

    private void changeCaptureFormat(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra(KEY_WIDTH, 0);
        final int intExtra2 = data.getIntExtra(KEY_HEIGHT, 0);
        final int intExtra3 = data.getIntExtra(KEY_IFRAMERATE, 0);
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.d
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$changeCaptureFormat$2(intExtra, intExtra2, intExtra3);
            }
        });
    }

    @w0(api = 16)
    private void createNotificationChannel() {
        Class<?> cls;
        try {
            cls = Class.forName(this.mLaunchActivity);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            cls = null;
        }
        if (cls == null) {
            return;
        }
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        Intent intent = new Intent(this, cls);
        int i10 = Build.VERSION.SDK_INT;
        builder.setContentIntent(PendingIntent.getActivity(this, 0, intent, i10 > 30 ? 201326592 : 134217728)).setLargeIcon(BitmapFactory.decodeResource(getResources(), this.mLargeIcon)).setSmallIcon(this.mSmallIcon).setContentText(this.mContentText).setWhen(System.currentTimeMillis());
        if (i10 >= 26) {
            builder.setChannelId("notification_id");
        }
        if (i10 >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("notification_id", "notification_name", 2));
        }
        Notification notificationBuild = builder.build();
        notificationBuild.defaults = 1;
        startForeground(110, notificationBuild);
    }

    private void createOrGetMediaProjection() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (this.mMediaProjection == null) {
            if (this.mMediaProjectionManager == null && applicationContext != null) {
                this.mMediaProjectionManager = (MediaProjectionManager) applicationContext.getSystemService("media_projection");
            }
            MediaProjectionManager mediaProjectionManager = this.mMediaProjectionManager;
            if (mediaProjectionManager != null) {
                this.mMediaProjection = mediaProjectionManager.getMediaProjection(-1, this.mPermissionReulstData);
            }
            if (this.mMediaProjection == null && this.mPicoCreateMediaProjection) {
                Log.i("createOrGetMediaProjection", "mediaProjection is null, try to use pico private interface on pico os platform");
                try {
                    this.mMediaProjection = (MediaProjection) MediaProjectionManager.class.getMethod(METHOD_PICO_CREATE_MEDIA_PROJECTION, new Class[0]).invoke(this.mMediaProjectionManager, new Object[0]);
                } catch (Exception e10) {
                    Log.w("createOrGetMediaProjection", "mediaProjection is null, use pico private interface failed", e10);
                    this.mMediaProjection = null;
                }
            }
        }
    }

    private void dispose(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        final int intExtra = data.getIntExtra(KEY_HASHCODE, 0);
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.b
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$dispose$3(intExtra);
            }
        });
    }

    private static int getCommand(Intent intent) {
        if (intent == null) {
            return -1;
        }
        return intent.getIntExtra(ACTION, -1);
    }

    private static Intent getData(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra(DATA);
    }

    public static Intent getServiceIntent(Context context, int i10, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) RXScreenCaptureService.class);
        intent2.putExtra(ACTION, i10);
        if (intent != null) {
            intent2.putExtra(DATA, intent);
        }
        return intent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$audioDispose$6() {
        ScreenAudioCaptureAndroidManager.INSTANCE().dispose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$changeCaptureFormat$2(int i10, int i11, int i12) {
        ScreenCaptureAndroidManager.INSTANCE().changeCaptureFormat(i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispose$3(int i10) {
        ScreenCaptureAndroidManager.INSTANCE().dispose(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAudioCapture$4() {
        ScreenAudioCaptureAndroidManager.INSTANCE().startAudioCapture(this.mMediaProjection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$0(int i10, int i11, int i12, int i13) {
        ScreenCaptureAndroidManager.INSTANCE().startCapture(i10, i11, i12, i13, this.mMediaProjection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$7() {
        stopMediaProjection();
        stopForeground(true);
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopAudioCapture$5() {
        ScreenAudioCaptureAndroidManager.INSTANCE().stopAudioCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopCapture$1() {
        ScreenCaptureAndroidManager.INSTANCE().stopCapture();
    }

    private void startAudioCapture() {
        createOrGetMediaProjection();
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f97915b.lambda$startAudioCapture$4();
            }
        });
    }

    private void startCapture(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        createOrGetMediaProjection();
        final int intExtra = data.getIntExtra(KEY_WIDTH, 0);
        final int intExtra2 = data.getIntExtra(KEY_HEIGHT, 0);
        final int intExtra3 = data.getIntExtra(KEY_IFRAMERATE, 0);
        final int intExtra4 = data.getIntExtra(KEY_MIN_FRAMERATE, 0);
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f97919b.lambda$startCapture$0(intExtra, intExtra2, intExtra3, intExtra4);
            }
        });
    }

    @w0(api = 16)
    private void startLaunch(Intent intent) {
        Intent data = getData(intent);
        if (data == null) {
            return;
        }
        this.mLargeIcon = data.getIntExtra("largei", -1);
        this.mSmallIcon = data.getIntExtra("largei", -1);
        this.mLaunchActivity = data.getStringExtra(KEY_LAUNCH_ACTIVITY);
        this.mContentText = data.getStringExtra(KEY_CONTENT_TEXT);
        this.mPicoCreateMediaProjection = data.getBooleanExtra(KEY_PICO_CREATE_MEDIA_PROJECTION, false);
        if (TextUtils.isEmpty(this.mLaunchActivity)) {
            return;
        }
        int i10 = this.mLargeIcon;
        if (i10 == -1 && this.mSmallIcon == -1) {
            return;
        }
        if (this.mSmallIcon == -1) {
            this.mSmallIcon = i10;
        }
        if (i10 == -1) {
            this.mLargeIcon = this.mSmallIcon;
        }
        this.mPermissionReulstData = (Intent) data.getParcelableExtra(KEY_RESULT_DATA);
        createNotificationChannel();
    }

    @w0(api = 21)
    private void stop() {
        serviceStarted.compareAndSet(true, false);
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f97924b.lambda$stop$7();
            }
        });
    }

    private void stopAudioCapture() {
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.f
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$stopAudioCapture$5();
            }
        });
    }

    private void stopCapture(Intent intent) {
        this.mHandler.post(new Runnable() { // from class: com.ss.bytertc.base.media.screen.a
            @Override // java.lang.Runnable
            public final void run() {
                RXScreenCaptureService.lambda$stopCapture$1();
            }
        });
    }

    @w0(api = 21)
    private void stopMediaProjection() {
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.mMediaProjection = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        serviceStarted.compareAndSet(false, true);
        HandlerThread handlerThread = new HandlerThread("RXScreenCaptureService");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper());
    }

    @Override // android.app.Service
    public void onDestroy() {
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        switch (getCommand(intent)) {
            case 0:
                startLaunch(intent);
                break;
            case 1:
                startCapture(intent);
                break;
            case 2:
                stopCapture(intent);
                break;
            case 3:
                changeCaptureFormat(intent);
                break;
            case 5:
                dispose(intent);
                break;
            case 6:
                startAudioCapture();
                break;
            case 7:
                stopAudioCapture();
                break;
            case 8:
                audioDispose();
                break;
            case 9:
                stop();
                break;
        }
        return 2;
    }
}
