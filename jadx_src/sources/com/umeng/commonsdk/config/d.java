package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: FieldTable.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f105068a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f105069b = "_LAST_FIELD";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f105070c = "3758096383";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f105071d = "2147483647";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f105072e = "262143";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f105073f = "2047";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f105074g = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, String[]> f105079l = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String[] f105075h = new String[a.values().length];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String[] f105076i = new String[b.values().length];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String[] f105077j = new String[c.values().length];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String[] f105078k = new String[EnumC1040d.values().length];

    /* JADX INFO: compiled from: FieldTable.java */
    public enum a {
        header_utoken,
        header_cpu,
        header_mccmnc,
        header_sub_os_name,
        header_sub_os_version,
        header_device_type,
        header_device_id_imei,
        header_device_id_mac,
        header_device_id_android_id,
        header_device_id_serialNo,
        header_bulid,
        header_os_version,
        header_resolution,
        header_mc,
        header_timezone,
        header_local_info,
        header_carrier,
        header_access,
        header_tracking_imei,
        header_tracking_android_id,
        header_tracking_utdid,
        header_tracking_idmd5,
        header_tracking_idfa,
        header_tracking_mac,
        header_tracking_serial,
        header_tracking_uuid,
        header_tracking_uop,
        header_tracking_oldumid,
        header_tracking_newumid,
        header_ekv_send_on_exit,
        header_device_oaid,
        header_local_ip,
        header_foreground_count,
        header_first_resume,
        _LAST_FIELD
    }

    /* JADX INFO: compiled from: FieldTable.java */
    public enum b {
        inner_rs,
        inner_by,
        inner_gp,
        inner_to,
        inner_mo,
        inner_ca,
        inner_fl,
        inner_gdf_r,
        inner_thm_z,
        inner_dsk_s,
        inner_sd,
        inner_build,
        inner_sr,
        inner_scr,
        inner_sinfo,
        inner_winfo,
        inner_input,
        inner_bt,
        inner_mem,
        inner_cpu,
        inner_rom,
        inner_bstn,
        inner_cam,
        inner_appls,
        inner_lbs,
        internal_run_server,
        internal_imsi,
        internal_meid,
        tp_tp,
        inner_imei2,
        inner_iccid,
        _LAST_FIELD
    }

    /* JADX INFO: compiled from: FieldTable.java */
    public enum c {
        push_cpu,
        push_imei,
        push_mac,
        push_android_id,
        push_serialNo,
        push_settings_android_id,
        push_network_access_mode,
        push_on_line,
        push_time_zone,
        push_locale_info,
        push_resolution,
        push_operator,
        push_utdid,
        push_service_work,
        push_service_name,
        push_intent_exist,
        push_data_data,
        push_notification_enabled,
        _LAST_FIELD
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FieldTable.java */
    public enum EnumC1040d {
        share_device_id,
        share_imsi,
        share_iccid,
        share_sn,
        share_net_accmode,
        share_android_id,
        share_wifi_mac,
        share_sd_size,
        share_ssid,
        share_resolution,
        share_conn_type,
        _LAST_FIELD
    }

    static {
        String[] strArr = f105075h;
        if (strArr != null && strArr.length > 0) {
            for (int i10 = 0; i10 < a.values().length; i10++) {
                f105075h[i10] = a.values()[i10].toString();
            }
            Map<String, String[]> map = f105079l;
            if (map != null) {
                map.put(a.class.getName(), f105075h);
            }
        }
        String[] strArr2 = f105076i;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i11 = 0; i11 < b.values().length; i11++) {
                f105076i[i11] = b.values()[i11].toString();
            }
            Map<String, String[]> map2 = f105079l;
            if (map2 != null) {
                map2.put(b.class.getName(), f105076i);
            }
        }
        String[] strArr3 = f105077j;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i12 = 0; i12 < c.values().length; i12++) {
                f105077j[i12] = c.values()[i12].toString();
            }
            Map<String, String[]> map3 = f105079l;
            if (map3 != null) {
                map3.put(c.class.getName(), f105077j);
            }
        }
        String[] strArr4 = f105078k;
        if (strArr4 == null || strArr4.length <= 0) {
            return;
        }
        for (int i13 = 0; i13 < EnumC1040d.values().length; i13++) {
            f105078k[i13] = EnumC1040d.values()[i13].toString();
        }
        Map<String, String[]> map4 = f105079l;
        if (map4 != null) {
            map4.put(EnumC1040d.class.getName(), f105078k);
        }
    }

    public static boolean a(String str) {
        return (str == null || str.length() <= 0 || f105069b.equalsIgnoreCase(str)) ? false : true;
    }

    public static String[] b(String str) {
        if (str == null || str.length() <= 0 || !f105079l.containsKey(str)) {
            return null;
        }
        return f105079l.get(str);
    }
}
