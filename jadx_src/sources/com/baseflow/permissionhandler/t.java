package com.baseflow.permissionhandler;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.core.app.l2;
import androidx.core.app.o0;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PermissionManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private final Context f40296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private b f40297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Activity f40298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<Integer, Integer> f40300f;

    /* JADX INFO: compiled from: PermissionManager.java */
    @FunctionalInterface
    public interface a {
        void a(int i10);
    }

    /* JADX INFO: compiled from: PermissionManager.java */
    @FunctionalInterface
    public interface b {
        void a(Map<Integer, Integer> map);
    }

    /* JADX INFO: compiled from: PermissionManager.java */
    @FunctionalInterface
    public interface c {
        void onSuccess(boolean z10);
    }

    public t(@n0 Context context) {
        this.f40296b = context;
    }

    private int a() {
        List<String> listC = v.c(this.f40296b, 21);
        if (!(listC == null || listC.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b() {
        if (Build.VERSION.SDK_INT < 33) {
            return l2.p(this.f40296b).a() ? 1 : 0;
        }
        if (this.f40296b.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return v.b(this.f40298d, "android.permission.POST_NOTIFICATIONS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int d(int i10) {
        if (i10 == 17) {
            return b();
        }
        if (i10 == 21) {
            return a();
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a();
        }
        if ((i10 == 37 || i10 == 0) && !e()) {
            return 0;
        }
        List<String> listC = v.c(this.f40296b, i10);
        if (listC == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (listC.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + listC + i10);
            return (i10 != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
        }
        if ((this.f40296b.getApplicationInfo().targetSdkVersion >= 23) != false) {
            HashSet hashSet = new HashSet();
            for (String str : listC) {
                if (i10 == 16) {
                    String packageName = this.f40296b.getPackageName();
                    PowerManager powerManager = (PowerManager) this.f40296b.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        hashSet.add(0);
                    } else {
                        hashSet.add(1);
                    }
                } else if (i10 == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        hashSet.add(2);
                    }
                    hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                } else if (i10 == 23) {
                    hashSet.add(Integer.valueOf(Settings.canDrawOverlays(this.f40296b) ? 1 : 0));
                } else if (i10 == 24) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        hashSet.add(Integer.valueOf(this.f40296b.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                    }
                } else if (i10 == 27) {
                    hashSet.add(Integer.valueOf(((NotificationManager) this.f40296b.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                } else if (i10 == 34) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        hashSet.add(Integer.valueOf(((AlarmManager) this.f40296b.getSystemService(o0.K0)).canScheduleExactAlarms() ? 1 : 0));
                    } else {
                        hashSet.add(1);
                    }
                } else if (i10 == 9 || i10 == 32) {
                    int iA = androidx.core.content.d.a(this.f40296b, str);
                    if ((Build.VERSION.SDK_INT >= 34 ? androidx.core.content.d.a(this.f40296b, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") : iA) == 0 && iA == -1) {
                        hashSet.add(3);
                    } else if (iA == 0) {
                        hashSet.add(1);
                    } else {
                        hashSet.add(Integer.valueOf(v.b(this.f40298d, str)));
                    }
                } else if (androidx.core.content.d.a(this.f40296b, str) != 0) {
                    hashSet.add(Integer.valueOf(v.b(this.f40298d, str)));
                }
            }
            if (!hashSet.isEmpty()) {
                return v.j(hashSet).intValue();
            }
        }
        return 1;
    }

    private boolean e() {
        List<String> listC = v.c(this.f40296b, 37);
        boolean z10 = listC != null && listC.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = listC != null && listC.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    private void f(String str, int i10) {
        if (this.f40298d == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f40298d.getPackageName()));
        }
        this.f40298d.startActivityForResult(intent, i10);
        this.f40299e++;
    }

    void c(int i10, a aVar) {
        aVar.a(d(i10));
    }

    void g(List<Integer> list, b bVar, com.baseflow.permissionhandler.c cVar) {
        if (this.f40299e > 0) {
            cVar.a("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
            return;
        }
        if (this.f40298d == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            cVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        this.f40297c = bVar;
        this.f40300f = new HashMap();
        this.f40299e = 0;
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (d(num.intValue()) != 1) {
                List<String> listC = v.c(this.f40298d, num.intValue());
                if (listC != null && !listC.isEmpty()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (num.intValue() == 16) {
                        f("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                    } else if (i10 >= 30 && num.intValue() == 22) {
                        f("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                    } else if (num.intValue() == 23) {
                        f("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                    } else if (i10 >= 26 && num.intValue() == 24) {
                        f("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                    } else if (num.intValue() == 27) {
                        f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                    } else if (i10 >= 31 && num.intValue() == 34) {
                        f("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", bb.c.b.f30645g1);
                    } else if (num.intValue() != 37 && num.intValue() != 0) {
                        arrayList.addAll(listC);
                        this.f40299e += listC.size();
                    } else if (e()) {
                        arrayList.add("android.permission.WRITE_CALENDAR");
                        arrayList.add("android.permission.READ_CALENDAR");
                        this.f40299e += 2;
                    } else {
                        this.f40300f.put(num, 0);
                    }
                } else if (!this.f40300f.containsKey(num)) {
                    num.intValue();
                    this.f40300f.put(num, 0);
                    if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                        this.f40300f.put(num, 0);
                    } else {
                        this.f40300f.put(num, 2);
                    }
                }
            } else if (!this.f40300f.containsKey(num)) {
                this.f40300f.put(num, 1);
            }
        }
        if (arrayList.size() > 0) {
            androidx.core.app.b.J(this.f40298d, (String[]) arrayList.toArray(new String[0]), 24);
        }
        b bVar2 = this.f40297c;
        if (bVar2 == null || this.f40299e != 0) {
            return;
        }
        bVar2.a(this.f40300f);
    }

    public void h(@p0 Activity activity) {
        this.f40298d = activity;
    }

    void i(int i10, c cVar, com.baseflow.permissionhandler.c cVar2) {
        Activity activity = this.f40298d;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            cVar2.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> listC = v.c(activity, i10);
        if (listC == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.onSuccess(false);
            return;
        }
        if (!listC.isEmpty()) {
            cVar.onSuccess(androidx.core.app.b.P(this.f40298d, listC.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.onSuccess(false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c A[PHI: r4
  0x002c: PHI (r4v17 int) = (r4v1 int), (r4v18 int) binds: [B:37:0x0086, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        int i12;
        Activity activity = this.f40298d;
        ?? CanScheduleExactAlarms = 0;
        CanScheduleExactAlarms = 0;
        if (activity == null) {
            return false;
        }
        if (this.f40300f == null) {
            this.f40299e = 0;
            return false;
        }
        if (i10 == 209) {
            i12 = 16;
            String packageName = this.f40296b.getPackageName();
            PowerManager powerManager = (PowerManager) this.f40296b.getSystemService("power");
            if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                CanScheduleExactAlarms = 1;
            }
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            i12 = 22;
            CanScheduleExactAlarms = Environment.isExternalStorageManager();
        } else if (i10 == 211) {
            i12 = 23;
            CanScheduleExactAlarms = Settings.canDrawOverlays(activity);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            i12 = 24;
            CanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
        } else if (i10 == 213) {
            i12 = 27;
            CanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
        } else {
            if (i10 != 214) {
                return false;
            }
            i12 = 34;
            AlarmManager alarmManager = (AlarmManager) activity.getSystemService(o0.K0);
            if (Build.VERSION.SDK_INT >= 31) {
                CanScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            } else {
                CanScheduleExactAlarms = 1;
            }
        }
        this.f40300f.put(Integer.valueOf(i12), Integer.valueOf((int) CanScheduleExactAlarms));
        int i13 = this.f40299e - 1;
        this.f40299e = i13;
        b bVar = this.f40297c;
        if (bVar != null && i13 == 0) {
            bVar.a(this.f40300f);
        }
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        int iG;
        if (i10 != 24) {
            this.f40299e = 0;
            return false;
        }
        if (this.f40300f == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List listAsList = Arrays.asList(strArr);
        int iIndexOf = listAsList.indexOf("android.permission.WRITE_CALENDAR");
        if (iIndexOf >= 0) {
            int iK = v.k(this.f40298d, "android.permission.WRITE_CALENDAR", iArr[iIndexOf]);
            this.f40300f.put(36, Integer.valueOf(iK));
            int iIndexOf2 = listAsList.indexOf("android.permission.READ_CALENDAR");
            if (iIndexOf2 >= 0) {
                int iIntValue = v.i(Integer.valueOf(iK), Integer.valueOf(v.k(this.f40298d, "android.permission.READ_CALENDAR", iArr[iIndexOf2]))).intValue();
                this.f40300f.put(37, Integer.valueOf(iIntValue));
                this.f40300f.put(0, Integer.valueOf(iIntValue));
            }
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR") && (iG = v.g(str)) != 20) {
                int i12 = iArr[i11];
                if (iG == 8) {
                    this.f40300f.put(8, v.i(this.f40300f.get(8), Integer.valueOf(v.k(this.f40298d, str, i12))));
                } else if (iG == 7) {
                    if (!this.f40300f.containsKey(7)) {
                        this.f40300f.put(7, Integer.valueOf(v.k(this.f40298d, str, i12)));
                    }
                    if (!this.f40300f.containsKey(14)) {
                        this.f40300f.put(14, Integer.valueOf(v.k(this.f40298d, str, i12)));
                    }
                } else if (iG == 4) {
                    int iK2 = v.k(this.f40298d, str, i12);
                    if (!this.f40300f.containsKey(4)) {
                        this.f40300f.put(4, Integer.valueOf(iK2));
                    }
                } else if (iG == 3) {
                    int iK3 = v.k(this.f40298d, str, i12);
                    if (Build.VERSION.SDK_INT < 29 && !this.f40300f.containsKey(4)) {
                        this.f40300f.put(4, Integer.valueOf(iK3));
                    }
                    if (!this.f40300f.containsKey(5)) {
                        this.f40300f.put(5, Integer.valueOf(iK3));
                    }
                    this.f40300f.put(Integer.valueOf(iG), Integer.valueOf(iK3));
                } else if (iG == 9 || iG == 32) {
                    this.f40300f.put(Integer.valueOf(iG), Integer.valueOf(d(iG)));
                } else if (!this.f40300f.containsKey(Integer.valueOf(iG))) {
                    this.f40300f.put(Integer.valueOf(iG), Integer.valueOf(v.k(this.f40298d, str, i12)));
                }
            }
        }
        int length = this.f40299e - iArr.length;
        this.f40299e = length;
        b bVar = this.f40297c;
        if (bVar == null || length != 0) {
            return true;
        }
        bVar.a(this.f40300f);
        return true;
    }
}
