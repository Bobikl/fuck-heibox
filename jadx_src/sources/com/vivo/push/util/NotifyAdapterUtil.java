package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.vivo.push.model.InsideNotificationItem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class NotifyAdapterUtil {
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }

    private static boolean cancelNotify(Context context, int i10) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i10);
        return true;
    }

    private static synchronized void initAdapter(Context context) {
        NotificationManager notificationManager;
        if (sNotificationManager == null) {
            sNotificationManager = (NotificationManager) context.getSystemService("notification");
        }
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = sNotificationManager) != null) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("default");
            if (notificationChannel != null) {
                CharSequence name = notificationChannel.getName();
                if (PUSH_ZH.equals(name) || "PUSH".equals(name)) {
                    sNotificationManager.deleteNotificationChannel("default");
                }
            }
            NotificationChannel notificationChannel2 = new NotificationChannel(PRIMARY_CHANNEL, isZh(context) ? PUSH_ZH : "PUSH", 4);
            notificationChannel2.setLightColor(-16711936);
            notificationChannel2.enableVibration(true);
            notificationChannel2.setLockscreenVisibility(1);
            sNotificationManager.createNotificationChannel(notificationChannel2);
        }
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j10, int i10, com.vivo.push.d.r.a aVar) {
        p.d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j10, i10, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j10, aVar);
        }
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j10, com.vivo.push.d.r.a aVar) {
        Notification notificationBuild;
        int i10;
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i11 = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong(PUSH_ID, j10);
        if (Build.VERSION.SDK_INT >= 26) {
            Notification.Builder builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            builder.setExtras(bundle);
            notificationBuild = builder.build();
        } else {
            Notification.Builder builder2 = new Notification.Builder(context);
            builder2.setExtras(bundle);
            notificationBuild = builder2.build();
        }
        notificationBuild.priority = 2;
        notificationBuild.flags = 16;
        notificationBuild.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i11;
        }
        notificationBuild.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            i10 = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            i10 = 0;
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, i10);
        if (list == null || list.isEmpty() || (bitmap = list.get(i10)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i11;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = null;
        if (list != null && list.size() > 1) {
            bitmap2 = list.get(1);
        }
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        }
        notificationBuild.contentView = remoteViews;
        if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            notificationBuild.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        p.d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        notificationBuild.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        notificationBuild.defaults |= 2;
                        notificationBuild.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                notificationBuild.defaults = 2;
                notificationBuild.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            notificationBuild.defaults = 1;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
        } catch (Exception e10) {
            p.a(TAG, "pushNotificationByCustom encrypt ：" + e10.getMessage());
        }
        new com.vivo.push.b.p(packageName, j10, insideNotificationItem).b(intent);
        notificationBuild.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456);
        if (sNotificationManager != null) {
            int iK = com.vivo.push.e.a().k();
            try {
                if (iK == 0) {
                    sNotificationManager.notify(sNotifyId, notificationBuild);
                    if (aVar != null) {
                        aVar.a();
                        return;
                    }
                    return;
                }
                if (iK != 1) {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(iK)));
                    return;
                }
                sNotificationManager.notify((int) j10, notificationBuild);
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Exception e11) {
                p.a(TAG, e11);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    private static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j10, int i10, com.vivo.push.d.r.a aVar) {
        Bitmap bitmapA;
        Notification.Builder builder;
        Bitmap bitmapDecodeResource;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int i11 = context.getApplicationInfo().icon;
        boolean zIsShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        if (list == null || list.isEmpty()) {
            bitmapA = null;
        } else {
            bitmapA = list.get(0);
            if (bitmapA != null && defaultNotifyIcon > 0 && (bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), defaultNotifyIcon)) != null) {
                int width = bitmapDecodeResource.getWidth();
                int height = bitmapDecodeResource.getHeight();
                bitmapDecodeResource.recycle();
                bitmapA = c.a(bitmapA, width, height);
            }
        }
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, PRIMARY_CHANNEL);
            if (defaultNotifyIcon > 0) {
                bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
            }
            if (bitmapA != null) {
                builder.setLargeIcon(bitmapA);
            }
        } else {
            builder = new Notification.Builder(context);
            if (bitmapA != null) {
                builder.setLargeIcon(bitmapA);
            }
        }
        bundle.putLong(PUSH_ID, j10);
        builder.setExtras(bundle);
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i11;
        }
        builder.setSmallIcon(defaultSmallIconId);
        if (insideNotificationItem.getCompatibleType() != 1) {
            builder.setContentTitle(title);
        }
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(zIsShowTime ? System.currentTimeMillis() : 0L);
        builder.setShowWhen(zIsShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        builder.setDefaults(3);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    }
                }
            } else if (ringerMode == 2) {
                builder.setDefaults(2);
                builder.setVibrate(new long[]{0, 100, 200, 300});
            }
        } else if (ringerMode == 2) {
            builder.setDefaults(1);
        }
        Bitmap bitmap = (list == null || list.size() <= 1) ? null : list.get(1);
        if (i10 != 1) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(content);
            builder.setStyle(bigTextStyle);
        }
        if (bitmap != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            intent.putExtra("security_avoid_pull", a.a(context).a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_pull_rsa", com.vivo.push.c.d.a(context).a().a("com.vivo.pushservice"));
            intent.putExtra("security_avoid_rsa_public_key", u.a(com.vivo.push.c.d.a(context).a().a()));
        } catch (Exception e10) {
            p.a(TAG, "pushNotificationBySystem encrypt ：" + e10.getMessage());
        }
        new com.vivo.push.b.p(packageName, j10, insideNotificationItem).b(intent);
        builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), intent, 268435456));
        Notification notificationBuild = builder.build();
        int iK = com.vivo.push.e.a().k();
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager != null) {
            try {
                if (iK == 0) {
                    notificationManager.notify(sNotifyId, notificationBuild);
                    if (aVar != null) {
                        aVar.a();
                        return;
                    }
                    return;
                }
                if (iK != 1) {
                    p.a(TAG, "unknow notify style ".concat(String.valueOf(iK)));
                    return;
                }
                notificationManager.notify((int) j10, notificationBuild);
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Exception e11) {
                p.a(TAG, e11);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public static boolean repealNotifyById(Context context, long j10) {
        int iK = com.vivo.push.e.a().k();
        if (iK != 0) {
            if (iK == 1) {
                return cancelNotify(context, (int) j10);
            }
            p.a(TAG, "unknow cancle notify style ".concat(String.valueOf(iK)));
            return false;
        }
        long jB = w.b().b("com.vivo.push.notify_key", -1L);
        if (jB == j10) {
            p.d(TAG, "undo showed message ".concat(String.valueOf(j10)));
            p.a(context, "回收已展示的通知： ".concat(String.valueOf(j10)));
            return cancelNotify(context, sNotifyId);
        }
        p.d(TAG, "current showing message id " + jB + " not match " + j10);
        p.a(context, "与已展示的通知" + jB + "与待回收的通知" + j10 + "不匹配");
        return false;
    }

    public static void setNotifyId(int i10) {
        sNotifyId = i10;
    }
}
