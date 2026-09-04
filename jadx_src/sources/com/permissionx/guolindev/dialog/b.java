package com.permissionx.guolindev.dialog;

import android.annotation.TargetApi;
import com.umeng.analytics.pro.ak;
import eg.s;
import eg.u;
import eg.v;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.d1;
import kotlin.collections.s0;

/* JADX INFO: compiled from: PermissionMap.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004\"&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t\"&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"", "", ak.av, "Ljava/util/Set;", "()Ljava/util/Set;", "allSpecialPermissions", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "permissionMapOnQ", ak.aF, "permissionMapOnR", "d", "permissionMapOnS", "permissionx_release"}, k = 2, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Set<String> f96281a = d1.u(s.f118679f, "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", v.f118685f, u.f118683f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @TargetApi(29)
    private static final Map<String, String> f96282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    @TargetApi(30)
    private static final Map<String, String> f96283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    @TargetApi(31)
    private static final Map<String, String> f96284d;

    static {
        Map<String, String> mapW = s0.W(c1.a("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), c1.a("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), c1.a("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), c1.a("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), c1.a("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), c1.a("android.permission.CAMERA", "android.permission-group.CAMERA"), c1.a("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), c1.a("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), c1.a("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), c1.a("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), c1.a("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), c1.a(s.f118679f, "android.permission-group.LOCATION"), c1.a("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), c1.a("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), c1.a("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), c1.a("android.permission.CALL_PHONE", "android.permission-group.PHONE"), c1.a("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), c1.a("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), c1.a("android.permission.USE_SIP", "android.permission-group.PHONE"), c1.a("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), c1.a("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), c1.a("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), c1.a("android.permission.SEND_SMS", "android.permission-group.SMS"), c1.a("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), c1.a("android.permission.READ_SMS", "android.permission-group.SMS"), c1.a("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), c1.a("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), c1.a("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), c1.a("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), c1.a("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        f96282b = mapW;
        f96283c = mapW;
        Map mapJ0 = s0.J0(s0.W(c1.a("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), c1.a("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), c1.a("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        mapJ0.putAll(c());
        f96284d = s0.D0(mapJ0);
    }

    @dl.d
    public static final Set<String> a() {
        return f96281a;
    }

    @dl.d
    public static final Map<String, String> b() {
        return f96282b;
    }

    @dl.d
    public static final Map<String, String> c() {
        return f96283c;
    }

    @dl.d
    public static final Map<String, String> d() {
        return f96284d;
    }
}
