package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.push.ja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f107881a = Log.isLoggable("NCHelper", 3);

    private static int a(NotificationChannel notificationChannel) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) com.xiaomi.push.bk.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f107881a) {
                a("isUserLockedChannel:" + iIntValue + " " + notificationChannel);
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m63a("NCHelper", "is user locked error" + e10);
        }
        return iIntValue;
    }

    @TargetApi(26)
    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    public static String a(aw awVar, String str, CharSequence charSequence, String str2, int i10, int i11, String str3, String str4) {
        String strM717a = awVar.m717a(str);
        boolean z10 = f107881a;
        if (z10) {
            a("createChannel: appChannelId:" + strM717a + " serverChannelId:" + str + " serverChannelName:" + ((Object) charSequence) + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i10 + " serverChannelName:" + ((Object) charSequence) + " serverChannelImportance:" + i11 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(strM717a, charSequence, i11);
        notificationChannel.setDescription(str2);
        notificationChannel.enableVibration((i10 & 2) != 0);
        notificationChannel.enableLights((i10 & 4) != 0);
        if ((i10 & 1) == 0) {
            notificationChannel.setSound(null, null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + awVar.m716a())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z10) {
            a("create channel:" + notificationChannel);
        }
        a(awVar, notificationChannel, str4);
        return strM717a;
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    static void a(Context context, aw awVar, NotificationChannel notificationChannel, int i10, String str) {
        if (i10 <= 0) {
            awVar.a(notificationChannel);
            return;
        }
        int iA = com.xiaomi.push.g.a(context) >= 2 ? f.a(context.getPackageName(), str) : 0;
        NotificationChannel notificationChannelA = a(notificationChannel.getId(), notificationChannel);
        if ((i10 & 32) != 0) {
            if (notificationChannel.getSound() != null) {
                notificationChannelA.setSound(null, null);
            } else {
                notificationChannelA.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if ((i10 & 16) != 0) {
            if (notificationChannel.shouldVibrate()) {
                notificationChannelA.enableVibration(false);
            } else {
                notificationChannelA.enableVibration(true);
            }
        }
        if ((i10 & 8) != 0) {
            if (notificationChannel.shouldShowLights()) {
                notificationChannelA.enableLights(false);
            } else {
                notificationChannelA.enableLights(true);
            }
        }
        if ((i10 & 4) != 0) {
            int importance = notificationChannel.getImportance() - 1;
            if (importance <= 0) {
                importance = 2;
            }
            notificationChannelA.setImportance(importance);
        }
        if ((i10 & 2) != 0) {
            notificationChannelA.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
        }
        awVar.a(notificationChannelA);
        awVar.a(notificationChannel, true);
        f.a(awVar.m716a(), notificationChannel.getId(), iA, 0);
    }

    public static void a(Context context, String str) {
        if (!com.xiaomi.push.j.m521a(context) || TextUtils.isEmpty(str)) {
            return;
        }
        c(context, str);
        f.a(context, str);
    }

    private static void a(Context context, List<String> list) {
        if (f107881a) {
            a("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = a(context).edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    static void a(ja jaVar) {
        Map<String, String> map;
        if (jaVar == null || (map = jaVar.f659a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        jaVar.f655a = 0;
        jaVar.f659a.remove("channel_id");
        jaVar.f659a.remove("channel_importance");
        jaVar.f659a.remove("channel_name");
        jaVar.f659a.remove("channel_description");
        jaVar.f659a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.b.m62a("delete channel info by:" + jaVar.f659a.get("REMOVE_CHANNEL_MARK"));
        jaVar.f659a.remove("REMOVE_CHANNEL_MARK");
    }

    @TargetApi(26)
    private static void a(aw awVar, NotificationChannel notificationChannel, String str) {
        int i10;
        char c10;
        int iA;
        Context contextM715a = awVar.m715a();
        String id2 = notificationChannel.getId();
        String strA = aw.a(id2, awVar.m716a());
        boolean z10 = f107881a;
        if (z10) {
            a("appChannelId:" + id2 + " oldChannelId:" + strA);
        }
        if (!com.xiaomi.push.j.m521a(contextM715a) || TextUtils.equals(id2, strA)) {
            NotificationChannel notificationChannelM714a = awVar.m714a(id2);
            if (z10) {
                a("elseLogic getNotificationChannel:" + notificationChannelM714a);
            }
            if (notificationChannelM714a == null) {
                awVar.a(notificationChannel);
            }
            i10 = 0;
            c10 = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) contextM715a.getSystemService("notification");
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(strA);
            NotificationChannel notificationChannelM714a2 = awVar.m714a(id2);
            if (z10) {
                a("xmsfChannel:" + notificationChannel2);
                a("appChannel:" + notificationChannelM714a2);
            }
            if (notificationChannel2 != null) {
                NotificationChannel notificationChannelA = a(id2, notificationChannel2);
                if (z10) {
                    a("copyXmsf copyXmsfChannel:" + notificationChannelA);
                }
                if (notificationChannelM714a2 != null) {
                    iA = a(notificationChannelM714a2);
                    awVar.a(notificationChannelA, iA == 0);
                    c10 = 3;
                } else {
                    iA = a(notificationChannel2);
                    a(contextM715a, awVar, notificationChannelA, iA, notificationChannel2.getId());
                    c10 = 4;
                }
                b(contextM715a, id2);
                notificationManager.deleteNotificationChannel(strA);
            } else if (notificationChannelM714a2 == null) {
                if (z10) {
                    a("appHack createNotificationChannel:" + notificationChannel);
                }
                awVar.a(notificationChannel);
                c10 = 1;
                iA = 0;
            } else if (m706a(contextM715a, id2) || !a(notificationChannel, notificationChannelM714a2)) {
                iA = 0;
                c10 = 0;
            } else {
                if (z10) {
                    a("appHack updateNotificationChannel:" + notificationChannel);
                }
                iA = a(notificationChannelM714a2);
                awVar.a(notificationChannel, iA == 0);
                c10 = 2;
            }
            i10 = iA;
        }
        f.a(awVar.m715a(), awVar.m716a(), id2, notificationChannel.getImportance(), str, c10 == 1 || c10 == 4 || c10 == 3, i10);
    }

    private static void a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m63a("NCHelper", str);
    }

    @TargetApi(26)
    private static boolean a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z10;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z11 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z10 = false;
        } else {
            if (f107881a) {
                a("appHack channelConfigLowerCompare:getName");
            }
            z10 = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f107881a) {
                a("appHack channelConfigLowerCompare:getDescription");
            }
            z10 = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f107881a) {
                a("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z10 = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f107881a) {
                a("appHack channelConfigLowerCompare:enableVibration");
            }
            z10 = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f107881a) {
                a("appHack channelConfigLowerCompare:enableLights");
            }
            z10 = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (f107881a) {
                a("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z11 = z10;
        }
        if (f107881a) {
            a("appHack channelConfigLowerCompare:isDifferent:" + z11);
        }
        return z11;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m706a(Context context, String str) {
        if (f107881a) {
            a("checkCopeidChannel:newFullChannelId:" + str + "  " + a(context).getBoolean(str, false));
        }
        return a(context).getBoolean(str, false);
    }

    private static void b(Context context, String str) {
        if (f107881a) {
            a("recordCopiedChannel:" + str);
        }
        a(context).edit().putBoolean(str, true).apply();
    }

    private static void c(Context context, String str) {
        try {
            aw awVarA = aw.a(context, str);
            Set<String> setKeySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : setKeySet) {
                if (awVarA.m719a(str2)) {
                    arrayList.add(str2);
                    if (f107881a) {
                        a("delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
    }
}
