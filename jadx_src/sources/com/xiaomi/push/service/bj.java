package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bj {
    public static String A = "ext_auth_method";
    public static String B = "ext_security";
    public static String C = "ext_kick";
    public static String D = "ext_client_attr";
    public static String E = "ext_cloud_attr";
    public static String F = "ext_pkg_name";
    public static String G = "ext_notify_id";
    public static String H = "ext_clicked_button";
    public static String I = "ext_notify_type";
    public static String J = "ext_session";
    public static String K = "sig";
    public static String L = "ext_notify_title";
    public static String M = "ext_notify_description";
    public static String N = "ext_messenger";
    public static String O = "title";
    public static String P = "description";
    public static String Q = "notifyId";
    public static String R = "dump";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f107931a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f107932b = "2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f107933c = "3";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f107934d = "com.xiaomi.push.OPEN_CHANNEL";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f107935e = "com.xiaomi.push.SEND_MESSAGE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f107936f = "com.xiaomi.push.SEND_IQ";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f107937g = "com.xiaomi.push.BATCH_SEND_MESSAGE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f107938h = "com.xiaomi.push.SEND_PRES";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f107939i = "com.xiaomi.push.CLOSE_CHANNEL";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f107940j = "com.xiaomi.push.FORCE_RECONN";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f107941k = "com.xiaomi.push.RESET_CONN";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f107942l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f107943m = "com.xiaomi.push.SEND_STATS";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static String f107944n = "com.xiaomi.push.HANDLE_FCM_MSG";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f107945o = "com.xiaomi.push.APP_NOTIFY_MSG";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static String f107946p = "com.xiaomi.push.CHANGE_HOST";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static String f107947q = "com.xiaomi.push.PING_TIMER";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f107948r = "com.xiaomi.push.APP_CHANNEL_SWITCH";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static String f107949s = "ext_user_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String f107950t = "ext_user_server";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static String f107951u = "ext_user_res";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f107952v = "ext_chid";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f107953w = "ext_receive_time";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f107954x = "ext_broadcast_time";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f107955y = "ext_sid";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static String f107956z = "ext_token";

    public static String a(int i10) {
        switch (i10) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i10);
        }
    }
}
