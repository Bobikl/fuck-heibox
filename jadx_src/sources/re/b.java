package re;

import android.os.Build;

/* JADX INFO: compiled from: PermissionConfig.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f138888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f138889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f138890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f138891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f138892e;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f138889b = i10 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        f138890c = i10 >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES"} : new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        f138891d = new String[]{"android.permission.CAMERA"};
        f138892e = new String[]{"android.permission.RECORD_AUDIO"};
    }
}
