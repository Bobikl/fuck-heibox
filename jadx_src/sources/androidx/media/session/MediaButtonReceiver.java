package androidx.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.core.content.d;
import androidx.media.MediaBrowserServiceCompat;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f24650a = "MediaButtonReceiver";

    public static class a extends MediaBrowserCompat.ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f24652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f24653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private MediaBrowserCompat f24654d;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f24651a = context;
            this.f24652b = intent;
            this.f24653c = pendingResult;
        }

        private void a() {
            this.f24654d.disconnect();
            this.f24653c.finish();
        }

        void b(MediaBrowserCompat mediaBrowserCompat) {
            this.f24654d = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            new MediaControllerCompat(this.f24651a, this.f24654d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f24652b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            a();
        }
    }

    public static PendingIntent a(Context context, long j10) {
        ComponentName componentNameC = c(context);
        if (componentNameC != null) {
            return b(context, componentNameC, j10);
        }
        Log.w(f24650a, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    @SuppressLint({"WrongConstant"})
    public static PendingIntent b(Context context, ComponentName componentName, long j10) {
        if (componentName == null) {
            Log.w(f24650a, "The component name of media button receiver should be provided.");
            return null;
        }
        int keyCode = PlaybackStateCompat.toKeyCode(j10);
        if (keyCode == 0) {
            Log.w(f24650a, "Cannot build a media button pending intent with the given action: " + j10);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, keyCode));
        intent.addFlags(268435456);
        return PendingIntent.getBroadcast(context, keyCode, intent, MediaSessionCompat.PENDING_INTENT_FLAG_MUTABLE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w(f24650a, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    private static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
        return keyEvent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d(f24650a, "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameD = d(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameD != null) {
            intent.setComponent(componentNameD);
            d.x(context, intent);
            return;
        }
        ComponentName componentNameD2 = d(context, MediaBrowserServiceCompat.f24437l);
        if (componentNameD2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        a aVar = new a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameD2, aVar, null);
        aVar.b(mediaBrowserCompat);
        mediaBrowserCompat.connect();
    }
}
