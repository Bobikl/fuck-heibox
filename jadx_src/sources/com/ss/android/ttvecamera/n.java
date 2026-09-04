package com.ss.android.ttvecamera;

/* JADX INFO: compiled from: TECameraMonitor.java */
/* JADX INFO: loaded from: classes8.dex */
public class n {
    public static final String A = "te_record_camera_close_in_main_thread";
    public static final String B = "te_record_camera_task_time_out_count";
    public static final String C = "te_record_camera_preview_ret";
    public static final String D = "te_record_camera_depth_capacity";
    public static final String E = "te_record_camera_support_preview_size";
    public static final String F = "te_record_camera_support_fps_range";
    public static final String G = "te_record_camera_manual_3a_capability";
    public static final String H = "te_record_camera_high_speed_video_fps_range";
    public static final String I = "te_record_camera_support_apertures";
    public static final String J = "te_record_camera_logical_multi_camera_capacity";
    public static final String K = "te_record_camera_support_extensions";
    public static final String L = "te_record_camera_front_back_multicam_combos";
    public static final String M = "te_record_camera_is_support_arcore";
    private static volatile a N = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f97637a = "te_record_camera_size";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f97638b = "te_record_camera_direction";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f97639c = "te_record_camera_type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f97640d = "te_record_camera_stabilization";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f97641e = "te_record_camera_frame_rate";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f97642f = "te_record_camera_max_fps";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f97643g = "te_preview_camera_resolution";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f97644h = "te_record_camera_hardware_level";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f97645i = "te_record_camera_push_open_task_time";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f97646j = "te_record_camera_push_close_task_time";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f97647k = "te_record_camera_close_cost";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f97648l = "te_record_camera_open_cost";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f97649m = "te_record_camera_open_ret";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f97650n = "te_record_camera_open_info";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f97651o = "te_record_camera_err_ret";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f97652p = "te_record_camera_preview_first_frame_cost";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f97653q = "te_record_camera2_create_session_ret";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f97654r = "te_record_camera2_create_session_cost";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f97655s = "te_record_camera2_set_repeating_request_cost";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f97656t = "te_record_camera2_close_session_cost";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f97657u = "te_record_send_capture_command_cost";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f97658v = "te_record_camera1_start_preview_cost";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f97659w = "te_record_camera1_stop_preview_cost";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f97660x = "te_record_camera_collect_capbilities_cost";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f97661y = "te_record_camera_max_lag_task_cost";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f97662z = "te_record_camera_task_time_out_count";

    /* JADX INFO: compiled from: TECameraMonitor.java */
    public interface a {
        void a(String str, long j10);

        void b(String str, float f10, float f11);

        void c(String str, String str2);

        void d(String str, double d10);
    }

    public static void a(String str, double d10) {
        if (N != null) {
            N.d(str, d10);
        }
    }

    public static void b(String str, long j10) {
        if (N != null) {
            N.a(str, j10);
        }
    }

    public static void c(String str, float f10, float f11) {
        if (N != null) {
            N.b(str, f10, f11);
        }
    }

    public static void d(String str, String str2) {
        if (N != null) {
            N.c(str, str2);
        }
    }

    public static void e(a aVar) {
        N = aVar;
    }
}
