package com.umeng.message;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.UPushNotificationChannel;
import com.umeng.message.component.UmengNotificationClickActivity;
import com.umeng.message.component.UmengNotificationReceiver;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.a;
import com.umeng.message.proguard.ac;
import com.umeng.message.proguard.am;
import com.umeng.message.proguard.an;
import com.umeng.message.proguard.aw;
import com.umeng.message.proguard.bb;
import com.umeng.message.proguard.d;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.t;
import com.umeng.message.proguard.w;
import com.umeng.message.proguard.x;
import com.umeng.message.proguard.y;
import com.umeng.message.push.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class UmengMessageHandler implements UPushMessageHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Date f105564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f105565b;

    private Notification a(Context context, UMessage uMessage) {
        Bitmap bitmap;
        String str;
        String str2;
        int i10;
        Notification.Builder builder = new Notification.Builder(context);
        String category = uMessage.getCategory();
        int i11 = Build.VERSION.SDK_INT;
        if (!TextUtils.isEmpty(category)) {
            builder.setCategory(category);
        }
        if (i11 >= 26) {
            NotificationChannel notificationChannel = getNotificationChannel(context, uMessage);
            if (notificationChannel == null) {
                notificationChannel = ((uMessage.getImportance() == 1 && d.g()) || isInNoDisturbTime(context)) ? UPushNotificationChannel.getSilenceMode(context) : UPushNotificationChannel.getDefaultMode(context);
            }
            if (notificationChannel == null) {
                UPLog.e("MsgHandler", "notification channel null!");
                return null;
            }
            builder.setChannelId(notificationChannel.getId());
        }
        int smallIconId = getSmallIconId(context, uMessage);
        if (smallIconId < 0) {
            UPLog.e("MsgHandler", "notification small icon error!");
            return null;
        }
        Bitmap largeIcon = getLargeIcon(context, uMessage);
        Bitmap expandImage = getExpandImage(context, uMessage);
        CharSequence title = uMessage.getTitle();
        CharSequence content = uMessage.getContent();
        String titleColor = uMessage.getTitleColor();
        if (!TextUtils.isEmpty(titleColor) && !TextUtils.isEmpty(title)) {
            try {
                int color = Color.parseColor(titleColor);
                SpannableString spannableString = new SpannableString(title);
                spannableString.setSpan(new ForegroundColorSpan(color), 0, title.length(), 34);
                title = spannableString;
            } catch (Exception unused) {
            }
        }
        String textColor = uMessage.getTextColor();
        if (!TextUtils.isEmpty(textColor) && !TextUtils.isEmpty(content)) {
            try {
                int color2 = Color.parseColor(textColor);
                SpannableString spannableString2 = new SpannableString(content);
                spannableString2.setSpan(new ForegroundColorSpan(color2), 0, content.length(), 34);
                content = spannableString2;
            } catch (Exception unused2) {
            }
        }
        builder.setTicker(uMessage.getTicker());
        builder.setSmallIcon(smallIconId);
        builder.setContentTitle(title);
        builder.setContentText(content);
        builder.setAutoCancel(true);
        int i12 = Build.VERSION.SDK_INT;
        Bitmap backgroundImage = (i12 < 26 || !uMessage.hasBackgroundImage()) ? null : getBackgroundImage(context, uMessage);
        if (i12 < 26 || backgroundImage == null) {
            bitmap = expandImage;
            str = titleColor;
            str2 = textColor;
            if (!TextUtils.isEmpty(uMessage.getBarImageUrl())) {
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.upush_notification_banner_layout);
                remoteViews.setImageViewBitmap(R.id.upush_notification_banner, getBarImage(context, uMessage));
                if (i12 >= 24) {
                    builder.setCustomContentView(remoteViews);
                } else {
                    builder.setContent(remoteViews);
                }
            } else if (largeIcon != null) {
                builder.setLargeIcon(largeIcon);
            }
        } else {
            builder.setGroupSummary(d.h());
            builder.setGroup(uMessage.msg_id);
            int i13 = R.layout.upush_notification_shade_layout;
            int i14 = R.id.upush_notification_small_icon;
            int i15 = R.id.upush_notification_app_name;
            int i16 = R.id.upush_notification_date;
            int i17 = R.id.upush_notification_title;
            int i18 = R.id.upush_notification_content;
            int i19 = R.id.upush_notification_shade_iv;
            str2 = textColor;
            int i20 = R.id.upush_notification_large_iv;
            str = titleColor;
            bitmap = expandImage;
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i13);
            remoteViews2.setImageViewResource(i14, smallIconId);
            remoteViews2.setTextViewText(i15, UMUtils.getAppName(context));
            long msgTime = uMessage.getMsgTime();
            remoteViews2.setTextViewText(i16, (f.a(msgTime) ? new SimpleDateFormat("HH:mm", Locale.getDefault()) : new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault())).format(Long.valueOf(msgTime)));
            remoteViews2.setTextViewText(i17, title);
            if (TextUtils.isEmpty(content)) {
                remoteViews2.setViewVisibility(i18, 8);
                i10 = 0;
            } else {
                i10 = 0;
                remoteViews2.setViewVisibility(i18, 0);
                remoteViews2.setTextViewText(i18, content);
            }
            if (largeIcon != null) {
                remoteViews2.setViewVisibility(i20, i10);
                remoteViews2.setImageViewBitmap(i20, largeIcon);
            } else {
                remoteViews2.setViewVisibility(i20, 8);
            }
            remoteViews2.setViewVisibility(i19, i10);
            remoteViews2.setImageViewBitmap(i19, backgroundImage);
            builder.setCustomContentView(remoteViews2);
        }
        if (bitmap != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.bigPicture(bitmap);
            bigPictureStyle.bigLargeIcon(largeIcon);
            builder.setStyle(bigPictureStyle);
        } else if (!TextUtils.isEmpty(uMessage.getBigBody())) {
            CharSequence bigTitle = uMessage.getBigTitle();
            if (bigTitle != null && bigTitle.length() != 0) {
                title = bigTitle;
            }
            CharSequence bigBody = uMessage.getBigBody();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(title)) {
                try {
                    int color3 = Color.parseColor(str);
                    SpannableString spannableString3 = new SpannableString(title);
                    spannableString3.setSpan(new ForegroundColorSpan(color3), 0, title.length(), 34);
                    title = spannableString3;
                } catch (Exception unused3) {
                }
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(bigBody)) {
                try {
                    int color4 = Color.parseColor(str2);
                    SpannableString spannableString4 = new SpannableString(bigBody);
                    spannableString4.setSpan(new ForegroundColorSpan(color4), 0, bigBody.length(), 34);
                    bigBody = spannableString4;
                } catch (Exception unused4) {
                }
            }
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(bigBody);
            builder.setStyle(bigTextStyle);
        }
        return builder.getNotification();
    }

    public void dealWithCustomMessage(Context context, UMessage uMessage) {
    }

    public void dealWithNotificationMessage(Context context, UMessage uMessage) {
        UPLog.i("MsgHandler", "notification:", uMessage.getRaw());
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(context);
        boolean z10 = uMessage.getMsgTime() >= messageSharedPrefs.f105562b.b("last_msg_time", 0L);
        messageSharedPrefs.f105562b.a("last_msg_time", uMessage.getMsgTime());
        Notification notification = getNotification(context, uMessage);
        int notificationDefaults = getNotificationDefaults(context, uMessage);
        if (notification == null) {
            notification = a(context, uMessage);
        }
        if (notification == null) {
            UPLog.e("MsgHandler", "notification null");
            return;
        }
        int i10 = this.f105565b;
        if (i10 == 0) {
            this.f105565b = (int) SystemClock.elapsedRealtime();
        } else {
            this.f105565b = i10 + 1;
        }
        notification.deleteIntent = getDismissPendingIntent(context, uMessage);
        notification.contentIntent = getClickPendingIntent(context, uMessage);
        if ((notificationDefaults & 1) != 0) {
            Uri sound = getSound(context, uMessage);
            if (sound != null) {
                notification.sound = getSound(context, uMessage);
            }
            if (sound != null) {
                notificationDefaults ^= 1;
            }
        }
        notification.defaults = notificationDefaults;
        int i11 = this.f105565b;
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (PushAgent.getInstance(context).getNotificationOnForeground() || !t.c()) {
                int iB = MessageSharedPrefs.getInstance(context).b();
                if (iB != 1 || z10) {
                    w wVarA = w.a();
                    if (iB > 0) {
                        while (wVarA.c() >= iB) {
                            ac acVarB = wVarA.b();
                            if (acVarB != null) {
                                if (notificationManager != null) {
                                    notificationManager.cancel("um", acVarB.f105669a);
                                }
                                UTrack.getInstance().trackMsgDismissed(acVarB.f105670b);
                                am.a(acVarB);
                            }
                        }
                    }
                    ac acVar = new ac(i11, uMessage);
                    wVarA.a(acVar);
                    if (notificationManager != null) {
                        notificationManager.notify("um", i11, notification);
                        UTrack.getInstance().trackMsgShow(uMessage, notification);
                    }
                    UMessage uMessage2 = acVar.f105670b;
                    if (uMessage2 != null && acVar.f105671c == null && uMessage2.isRepost()) {
                        MessageSharedPrefs.getInstance(x.a()).f105562b.a("re_pop_cfg", uMessage2.getRepostCount());
                        acVar.f105671c = new an(acVar).a();
                    }
                } else {
                    UTrack.getInstance().trackMsgDismissed(uMessage);
                }
            } else {
                UPLog.i("MsgHandler", "foreground notification dismiss. msgId:", uMessage.getMsgId());
                UTrack.getInstance().trackMsgDismissed(uMessage);
            }
        } catch (Exception e10) {
            UPLog.e("MsgHandler", e10);
        }
        setBadgeNum(context, uMessage);
    }

    public Bitmap getBackgroundImage(Context context, UMessage uMessage) {
        try {
            String backgroundImageUrl = uMessage.getBackgroundImageUrl();
            if (TextUtils.isEmpty(backgroundImageUrl)) {
                return null;
            }
            return f.a(new File(f.g(context), UMUtils.MD5(backgroundImageUrl)), bb.a(), bb.a(64.0f));
        } catch (Throwable th2) {
            UPLog.e("MsgHandler", th2);
            return null;
        }
    }

    public Bitmap getBarImage(Context context, UMessage uMessage) {
        try {
            String barImageUrl = uMessage.getBarImageUrl();
            if (TextUtils.isEmpty(barImageUrl)) {
                return null;
            }
            return f.a(new File(f.g(context), UMUtils.MD5(barImageUrl)), bb.a(), bb.a(64.0f));
        } catch (Throwable th2) {
            UPLog.e("MsgHandler", th2);
            return null;
        }
    }

    public PendingIntent getClickPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setFlags(335544320);
        intent.setClass(context, UmengNotificationClickActivity.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("NOTIFICATION_ID", this.f105565b);
        return PendingIntent.getActivity(context, (int) System.currentTimeMillis(), intent, 335544320);
    }

    public PendingIntent getDismissPendingIntent(Context context, UMessage uMessage) {
        Intent intent = new Intent();
        intent.setClass(context, UmengNotificationReceiver.class);
        intent.putExtra("MSG", uMessage.getRaw().toString());
        intent.putExtra("ACTION", 11);
        intent.putExtra("NOTIFICATION_ID", this.f105565b);
        return PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() + 1), intent, 335544320);
    }

    public Bitmap getExpandImage(Context context, UMessage uMessage) {
        try {
            String bigImage = uMessage.getBigImage();
            if (TextUtils.isEmpty(bigImage)) {
                return null;
            }
            return f.a(new File(f.g(context), UMUtils.MD5(bigImage)), bb.a(), bb.a(256.0f));
        } catch (Throwable th2) {
            UPLog.e("MsgHandler", th2);
            return null;
        }
    }

    public Bitmap getLargeIcon(Context context, UMessage uMessage) {
        Bitmap bitmapA;
        try {
            if (uMessage.isLargeIconFromInternet()) {
                String largeIconUrl = uMessage.getLargeIconUrl();
                if (TextUtils.isEmpty(largeIconUrl)) {
                    return null;
                }
                bitmapA = f.a(new File(f.g(context), UMUtils.MD5(largeIconUrl)), bb.a(48.0f), bb.a(48.0f));
            } else {
                bitmapA = null;
            }
            if (bitmapA != null) {
                return bitmapA;
            }
            int iB = -1;
            String largeIconDrawableName = uMessage.getLargeIconDrawableName();
            if (TextUtils.isEmpty(largeIconDrawableName)) {
                try {
                    iB = a.a().b("umeng_push_notification_default_large_icon");
                } catch (Exception e10) {
                    UPLog.w("MsgHandler", e10);
                }
            } else {
                try {
                    iB = a.a().b(largeIconDrawableName);
                } catch (Exception e11) {
                    UPLog.e("MsgHandler", e11);
                }
            }
            return iB > 0 ? BitmapFactory.decodeResource(context.getResources(), iB) : bitmapA;
        } catch (Throwable th2) {
            UPLog.e("MsgHandler", th2);
            return null;
        }
    }

    public Notification getNotification(Context context, UMessage uMessage) {
        return null;
    }

    public NotificationChannel getNotificationChannel() {
        return null;
    }

    public NotificationChannel getNotificationChannel(Context context, UMessage uMessage) {
        return getNotificationChannel();
    }

    public int getNotificationDefaults(Context context, UMessage uMessage) {
        Calendar calendar = Calendar.getInstance();
        if (isInNoDisturbTime(context)) {
            return 0;
        }
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(context);
        long jG = ((long) messageSharedPrefs.g()) * 1000;
        if (f105564a != null && calendar.getTimeInMillis() - f105564a.getTime() < jG) {
            return 0;
        }
        int iH = messageSharedPrefs.h();
        UPLog.i("MsgHandler", "vibrate:", Integer.valueOf(iH));
        int i10 = (iH != 1 && (iH == 2 || !uMessage.isVibrate())) ? 0 : 2;
        int i11 = messageSharedPrefs.i();
        UPLog.i("MsgHandler", "lights:", Integer.valueOf(i11));
        if (i11 == 1 || (i11 != 2 && uMessage.isLights())) {
            i10 |= 4;
        }
        int iJ = messageSharedPrefs.j();
        UPLog.i("MsgHandler", "sound:", Integer.valueOf(iJ));
        if (iJ == 1 || (iJ != 2 && uMessage.isSound())) {
            i10 |= 1;
        }
        f105564a = calendar.getTime();
        if (uMessage.isScreenOn()) {
            try {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                boolean zIsScreenOn = powerManager.isScreenOn();
                UPLog.i("MsgHandler", "screen on:".concat(String.valueOf(zIsScreenOn)));
                if (!zIsScreenOn) {
                    powerManager.newWakeLock(805306374, "UPush:NTF").acquire(10000L);
                }
            } catch (Throwable th2) {
                UPLog.e("MsgHandler", th2);
            }
        }
        return i10;
    }

    public int getSmallIconId(Context context, UMessage uMessage) {
        int iB = -1;
        try {
            String smallIconDrawableName = uMessage.getSmallIconDrawableName();
            if (TextUtils.isEmpty(smallIconDrawableName)) {
                try {
                    iB = a.a().b("umeng_push_notification_default_small_icon");
                } catch (Exception e10) {
                    UPLog.w("MsgHandler", e10);
                }
            } else {
                try {
                    iB = a.a().b(smallIconDrawableName);
                } catch (Exception e11) {
                    UPLog.e("MsgHandler", e11);
                }
            }
            if (iB < 0) {
                UPLog.i("MsgHandler", "no custom notification small icon! change to use app icon");
                iB = context.getApplicationInfo().icon;
            }
            if (iB < 0) {
                UPLog.e("MsgHandler", "can't find notification small icon");
            }
        } catch (Throwable th2) {
            UPLog.e("MsgHandler", th2);
        }
        return iB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public Uri getSound(Context context, UMessage uMessage) {
        String path;
        try {
            if (uMessage.isSoundFromInternet()) {
                File file = new File(f.g(context), UMUtils.MD5(uMessage.getSoundUri()));
                path = file.getPath();
                if (!file.exists()) {
                    path = null;
                }
            } else {
                path = null;
            }
            if (path == null) {
                int iC = -1;
                if (!TextUtils.isEmpty(uMessage.getSoundUri())) {
                    iC = a.a().c(uMessage.getSoundUri());
                }
                if (iC < 0) {
                    iC = a.a().c("umeng_push_notification_default_sound");
                }
                if (iC > 0) {
                    path = "android.resource://" + context.getPackageName() + "/" + iC;
                }
            }
            if (path != null) {
                return Uri.parse(path);
            }
        } catch (Throwable th2) {
            UPLog.w("MsgHandler", th2);
        }
        return null;
    }

    @Override // com.umeng.message.api.UPushMessageHandler
    public void handleMessage(Context context, UMessage uMessage) {
        if ("notification".equals(uMessage.getDisplayType())) {
            dealWithNotificationMessage(context, uMessage);
            return;
        }
        if ("custom".equals(uMessage.getDisplayType())) {
            if (TextUtils.isEmpty(uMessage.getRecallMsgId())) {
                dealWithCustomMessage(context, uMessage);
                return;
            }
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager == null) {
                    return;
                }
                w wVarA = w.a();
                ac acVarA = wVarA.a(uMessage.getRecallMsgId());
                if (acVarA == null) {
                    y.a().a(uMessage.getRecallMsgId(), 5);
                    return;
                }
                notificationManager.cancel("um", acVarA.f105669a);
                wVarA.b(acVarA);
                am.a(acVarA);
                y.a().a(uMessage.getRecallMsgId(), 4);
            } catch (Throwable th2) {
                UPLog.e("MsgHandler", th2);
            }
        }
    }

    public boolean isInNoDisturbTime(Context context) {
        Calendar calendar = Calendar.getInstance();
        int i10 = (calendar.get(11) * 60) + calendar.get(12);
        boolean z10 = i10 >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute();
        boolean z11 = i10 <= (PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute();
        if ((PushAgent.getInstance(context).getNoDisturbEndHour() * 60) + PushAgent.getInstance(context).getNoDisturbEndMinute() >= (PushAgent.getInstance(context).getNoDisturbStartHour() * 60) + PushAgent.getInstance(context).getNoDisturbStartMinute()) {
            return z10 && z11;
        }
        return z10 || z11;
    }

    public void setBadgeNum(Context context, UMessage uMessage) {
        if (uMessage.getBadgeSet() >= 0) {
            aw.a(context, uMessage.getBadgeSet());
            UPLog.d("MsgHandler", "setBadgeNum:", Integer.valueOf(uMessage.getBadgeSet()));
        } else if (uMessage.getBadgeAdd() != 0) {
            aw.b(context, uMessage.getBadgeAdd());
            UPLog.d("MsgHandler", "changeBadgeNum:", Integer.valueOf(uMessage.getBadgeAdd()));
        }
    }
}
