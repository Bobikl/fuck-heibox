package com.taobao.accs.utl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.accs.AgooService;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final String TAG = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f98457a = new Handler(Looper.getMainLooper());

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0091 A[Catch: Exception -> 0x02d3, all -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x0104 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x010e A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0139 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0162 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x016c A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x017c A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0189 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0197 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bf A[Catch: Exception -> 0x02d1, all -> 0x02d5, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01fa A[Catch: Exception -> 0x0209, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0201 A[Catch: Exception -> 0x0209, all -> 0x02d5, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x023f A[Catch: Exception -> 0x02d1, all -> 0x02d5, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0255 A[Catch: Exception -> 0x02af, all -> 0x02d5, TryCatch #0 {Exception -> 0x02af, blocks: (B:64:0x0250, B:65:0x0255, B:67:0x025f), top: B:100:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x025f A[Catch: Exception -> 0x02af, all -> 0x02d5, TRY_LEAVE, TryCatch #0 {Exception -> 0x02af, blocks: (B:64:0x0250, B:65:0x0255, B:67:0x025f), top: B:100:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0271 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0274  */
    /* JADX WARN: Code duplicated, block: B:75:0x0288 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x029e A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x02b5 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02be A[Catch: Exception -> 0x02d1, all -> 0x02d5, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x02c7 A[Catch: Exception -> 0x02d1, all -> 0x02d5, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x0024, B:11:0x0049, B:21:0x0091, B:23:0x00e9, B:36:0x0104, B:37:0x010e, B:38:0x0139, B:41:0x0162, B:42:0x016c, B:43:0x017c, B:45:0x0189, B:47:0x0191, B:50:0x01b9, B:52:0x01bf, B:53:0x01de, B:55:0x01fa, B:57:0x0201, B:61:0x0214, B:60:0x020a, B:49:0x0197, B:62:0x023f, B:64:0x0250, B:93:0x02dd, B:65:0x0255, B:67:0x025f, B:69:0x0269, B:71:0x0271, B:73:0x0278, B:75:0x0288, B:76:0x029e, B:79:0x02b5, B:80:0x02be, B:81:0x02c7, B:18:0x005a), top: B:101:0x0024 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0091, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x010e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0197, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x01bf, please report this as an issue */
    public static int a(Context context, Intent intent, AccsDataListener accsDataListener) {
        String str;
        String str2;
        NetPerformanceMonitor netPerformanceMonitorA;
        long jCurrentTimeMillis;
        byte[] byteArrayExtra;
        boolean booleanExtra;
        TaoBaseService.ExtraInfo extraInfoC;
        NetPerformanceMonitor netPerformanceMonitor;
        boolean booleanExtra2;
        String stringExtra;
        String stringExtra2;
        boolean booleanExtra3;
        boolean booleanExtra4;
        String str3 = BaseMonitor.ALARM_POINT_REQ_ERROR;
        if (accsDataListener == null || context == null) {
            ALog.e(TAG, "onReceiveData listener or context null", new Object[0]);
            return 2;
        }
        if (intent == null) {
            return 2;
        }
        try {
            int intExtra = intent.getIntExtra("command", -1);
            int intExtra2 = intent.getIntExtra(Constants.KEY_ERROR_CODE, 0);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_USER_ID);
            String stringExtra4 = intent.getStringExtra(Constants.KEY_DATA_ID);
            String stringExtra5 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
            str = "1";
            if (ALog.isPrintLog(ALog.Level.I)) {
                str2 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                str3 = TAG;
                ALog.e(str3, "onReceiveData", Constants.KEY_DATA_ID, stringExtra4, Constants.KEY_SERVICE_ID, stringExtra5, "command", Integer.valueOf(intExtra), PushClientConstants.TAG_CLASS_NAME, accsDataListener.getClass().getName());
                if (intExtra > 0) {
                    ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                    return 2;
                }
                UTMini.getInstance().commitEvent(66001, "MsgToBuss5", "commandId=" + intExtra, "serviceId=" + stringExtra5 + " dataId=" + stringExtra4, 221);
                str3 = "onReceiveData";
                k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "3commandId=" + intExtra + "serviceId=" + stringExtra5, 0.0d);
                if (intExtra != 5) {
                    a(stringExtra5, new b(accsDataListener, stringExtra5, intExtra2, intent));
                    return 2;
                }
                if (intExtra != 6) {
                    a(stringExtra5, new c(accsDataListener, stringExtra5, intExtra2, intent));
                    return 2;
                }
                if (intExtra != 100) {
                    netPerformanceMonitorA = a(intent);
                    if (netPerformanceMonitorA != null) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        netPerformanceMonitorA.service_recv = jCurrentTimeMillis;
                        if (netPerformanceMonitorA.start_service == 0) {
                            netPerformanceMonitorA.start_service = jCurrentTimeMillis;
                        }
                    }
                    if (TextUtils.equals(Constants.SEND_TYPE_RES, intent.getStringExtra(Constants.KEY_SEND_TYPE))) {
                        a(stringExtra5, new e(netPerformanceMonitorA, stringExtra5, stringExtra4, accsDataListener, intExtra2, intent.getByteArrayExtra("data"), intent));
                        return 2;
                    }
                    a(stringExtra5, new f(netPerformanceMonitorA, stringExtra5, stringExtra4, accsDataListener, intExtra2, intent));
                    return 2;
                }
                if (intExtra != 101) {
                    if (intExtra != 103) {
                        if (intExtra != 104) {
                            ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                            return 2;
                        }
                        boolean booleanExtra5 = intent.getBooleanExtra(Constants.KEY_ANTI_BRUSH_RET, false);
                        ALog.e(TAG, "onReceiveData anti brush result:" + booleanExtra5, new Object[0]);
                        a(stringExtra5, new g(accsDataListener, booleanExtra5));
                        return 2;
                    }
                    booleanExtra2 = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                    stringExtra = intent.getStringExtra("host");
                    stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                    booleanExtra3 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                    booleanExtra4 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        return 2;
                    }
                    if (booleanExtra2) {
                        a(stringExtra5, new h(accsDataListener, stringExtra, booleanExtra3, booleanExtra4));
                        return 2;
                    }
                    a(stringExtra5, new i(accsDataListener, stringExtra, booleanExtra3, booleanExtra4, intExtra2, stringExtra2));
                    return 2;
                }
                byteArrayExtra = intent.getByteArrayExtra("data");
                booleanExtra = intent.getBooleanExtra(Constants.KEY_NEED_BUSINESS_ACK, false);
                if (byteArrayExtra != null) {
                    ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                    k.a("accs", str2, stringExtra5, str, "COMMAND_RECEIVE_DATA msg null");
                    return 2;
                }
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra4 + " serviceId:" + stringExtra5, new Object[0]);
                } else {
                    ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra4 + " serviceId:" + stringExtra5, new Object[0]);
                }
                extraInfoC = c(intent);
                if (booleanExtra) {
                    ALog.i(TAG, "onReceiveData try to send biz ack dataId " + stringExtra4, new Object[0]);
                    a(context, intent, stringExtra4, extraInfoC.oriExtHeader);
                }
                intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                netPerformanceMonitor = (NetPerformanceMonitor) intent.getExtras().getSerializable(Constants.KEY_MONIROT);
                if (netPerformanceMonitor != null) {
                    netPerformanceMonitor.onToAccsTime();
                    if (!(context instanceof AgooService)) {
                        AppMonitor.getInstance().commitStat(netPerformanceMonitor);
                    }
                }
                k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS_SUCCESS, "1commandId=101serviceId=" + stringExtra5, 0.0d);
                a(stringExtra5, new d(stringExtra5, stringExtra4, intExtra, accsDataListener, stringExtra3, byteArrayExtra, extraInfoC));
                return 2;
            }
            try {
                if ("accs-impaas".equals(stringExtra5)) {
                    str2 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                    try {
                        str3 = TAG;
                        ALog.e(str3, "onReceiveData", Constants.KEY_DATA_ID, stringExtra4, Constants.KEY_SERVICE_ID, stringExtra5, "command", Integer.valueOf(intExtra), PushClientConstants.TAG_CLASS_NAME, accsDataListener.getClass().getName());
                    } catch (Exception e10) {
                        e = e10;
                        str3 = "onReceiveData";
                    }
                } else {
                    str2 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                }
                try {
                    if (intExtra > 0) {
                        ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                        return 2;
                    }
                    UTMini.getInstance().commitEvent(66001, "MsgToBuss5", "commandId=" + intExtra, "serviceId=" + stringExtra5 + " dataId=" + stringExtra4, 221);
                    str3 = "onReceiveData";
                    k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS, "3commandId=" + intExtra + "serviceId=" + stringExtra5, 0.0d);
                    if (intExtra != 5) {
                        a(stringExtra5, new b(accsDataListener, stringExtra5, intExtra2, intent));
                        return 2;
                    }
                    if (intExtra != 6) {
                        a(stringExtra5, new c(accsDataListener, stringExtra5, intExtra2, intent));
                        return 2;
                    }
                    try {
                        if (intExtra != 100) {
                            netPerformanceMonitorA = a(intent);
                            if (netPerformanceMonitorA != null) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                                netPerformanceMonitorA.service_recv = jCurrentTimeMillis;
                                if (netPerformanceMonitorA.start_service == 0) {
                                    netPerformanceMonitorA.start_service = jCurrentTimeMillis;
                                }
                            }
                            if (TextUtils.equals(Constants.SEND_TYPE_RES, intent.getStringExtra(Constants.KEY_SEND_TYPE))) {
                                a(stringExtra5, new e(netPerformanceMonitorA, stringExtra5, stringExtra4, accsDataListener, intExtra2, intent.getByteArrayExtra("data"), intent));
                                return 2;
                            }
                            a(stringExtra5, new f(netPerformanceMonitorA, stringExtra5, stringExtra4, accsDataListener, intExtra2, intent));
                            return 2;
                        }
                        if (intExtra != 101) {
                            if (intExtra != 103) {
                                if (intExtra != 104) {
                                    ALog.w(TAG, "onReceiveData command not handled", new Object[0]);
                                    return 2;
                                }
                                boolean booleanExtra6 = intent.getBooleanExtra(Constants.KEY_ANTI_BRUSH_RET, false);
                                ALog.e(TAG, "onReceiveData anti brush result:" + booleanExtra6, new Object[0]);
                                a(stringExtra5, new g(accsDataListener, booleanExtra6));
                                return 2;
                            }
                            booleanExtra2 = intent.getBooleanExtra(Constants.KEY_CONNECT_AVAILABLE, false);
                            stringExtra = intent.getStringExtra("host");
                            stringExtra2 = intent.getStringExtra(Constants.KEY_ERROR_DETAIL);
                            booleanExtra3 = intent.getBooleanExtra(Constants.KEY_TYPE_INAPP, false);
                            booleanExtra4 = intent.getBooleanExtra(Constants.KEY_CENTER_HOST, false);
                            if (!TextUtils.isEmpty(stringExtra)) {
                                return 2;
                            }
                            if (booleanExtra2) {
                                a(stringExtra5, new h(accsDataListener, stringExtra, booleanExtra3, booleanExtra4));
                                return 2;
                            }
                            a(stringExtra5, new i(accsDataListener, stringExtra, booleanExtra3, booleanExtra4, intExtra2, stringExtra2));
                            return 2;
                        }
                        byteArrayExtra = intent.getByteArrayExtra("data");
                        booleanExtra = intent.getBooleanExtra(Constants.KEY_NEED_BUSINESS_ACK, false);
                        if (byteArrayExtra != null) {
                            ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                            k.a("accs", str2, stringExtra5, str, "COMMAND_RECEIVE_DATA msg null");
                            return 2;
                        }
                        if (ALog.isPrintLog(ALog.Level.D) || "accs-impaas".equals(stringExtra5)) {
                            ALog.e(TAG, "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra4 + " serviceId:" + stringExtra5, new Object[0]);
                        }
                        extraInfoC = c(intent);
                        if (booleanExtra) {
                            ALog.i(TAG, "onReceiveData try to send biz ack dataId " + stringExtra4, new Object[0]);
                            a(context, intent, stringExtra4, extraInfoC.oriExtHeader);
                        }
                        try {
                            intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
                            netPerformanceMonitor = (NetPerformanceMonitor) intent.getExtras().getSerializable(Constants.KEY_MONIROT);
                            if (netPerformanceMonitor != null) {
                                netPerformanceMonitor.onToAccsTime();
                                if (!(context instanceof AgooService)) {
                                    AppMonitor.getInstance().commitStat(netPerformanceMonitor);
                                }
                            }
                        } catch (Exception e11) {
                            ALog.e(TAG, "get NetPerformanceMonitor Error:", e11, new Object[0]);
                        }
                        k.a("accs", BaseMonitor.COUNT_POINT_TO_BUSS_SUCCESS, "1commandId=101serviceId=" + stringExtra5, 0.0d);
                        a(stringExtra5, new d(stringExtra5, stringExtra4, intExtra, accsDataListener, stringExtra3, byteArrayExtra, extraInfoC));
                        return 2;
                    } catch (Exception e12) {
                        e = e12;
                        str2 = null;
                        str = "accs-impaas";
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Exception e14) {
                e = e14;
                str2 = BaseMonitor.ALARM_POINT_REQ_ERROR;
                str3 = "onReceiveData";
            }
        } catch (Exception e15) {
            e = e15;
            str = "1";
        }
        k.a("accs", str2, "", str, "callback error" + e.toString());
        ALog.e(TAG, str3, e, new Object[0]);
        return 2;
    }

    public static NetPerformanceMonitor a(Intent intent) {
        try {
            intent.getExtras().setClassLoader(NetPerformanceMonitor.class.getClassLoader());
            return (NetPerformanceMonitor) intent.getExtras().getSerializable(Constants.KEY_MONIROT);
        } catch (Exception e10) {
            ALog.e(TAG, "get NetPerformanceMonitor Error:", e10, new Object[0]);
            return null;
        }
    }

    private static Map<TaoBaseService.ExtHeaderType, String> a(Map<Integer, String> map) {
        HashMap map2 = null;
        if (map == null) {
            return null;
        }
        try {
            HashMap map3 = new HashMap();
            try {
                for (TaoBaseService.ExtHeaderType extHeaderType : TaoBaseService.ExtHeaderType.values()) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        map3.put(extHeaderType, str);
                    }
                }
                return map3;
            } catch (Exception e10) {
                e = e10;
                map2 = map3;
                ALog.e(TAG, "getExtHeader", e, new Object[0]);
                return map2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    private static void a(Context context, Intent intent, String str, Map<Integer, String> map) {
        try {
            ALog.i(TAG, "sendBusinessAck", Constants.KEY_DATA_ID, str);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("host");
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra("appKey");
                String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                short shortExtra = intent.getShortExtra(Constants.KEY_FLAGS, (short) 0);
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance != null) {
                    accsInstance.a(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                    k.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_SUCC, "", 0.0d);
                } else {
                    k.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr", 0.0d);
                }
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "sendBusinessAck", th2, new Object[0]);
            k.a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th2.toString(), 0.0d);
        }
    }

    private static void a(String str, Runnable runnable) {
        if ("accs-impaas".equals(str) && t.e()) {
            ThreadPoolExecutorFactory.executeCallback(runnable);
        } else {
            f98457a.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TaoBaseService.ExtraInfo c(Intent intent) {
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap map = (HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
            Map<TaoBaseService.ExtHeaderType, String> mapA = a(map);
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("host");
            extraInfo.connType = intent.getIntExtra(Constants.KEY_CONN_TYPE, 0);
            extraInfo.extHeader = mapA;
            extraInfo.oriExtHeader = map;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
        } catch (Throwable th2) {
            ALog.e(TAG, "getExtraInfo", th2, new Object[0]);
        }
        return extraInfo;
    }
}
