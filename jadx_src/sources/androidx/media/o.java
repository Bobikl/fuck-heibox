package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;

/* JADX INFO: compiled from: MediaSessionManagerImplBase.java */
/* JADX INFO: loaded from: classes6.dex */
public class o implements l.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f24629c = "MediaSessionManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f24630d = l.f24619c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f24631e = "android.permission.STATUS_BAR_SERVICE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f24632f = "android.permission.MEDIA_CONTENT_CONTROL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f24633g = "enabled_notification_listeners";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f24634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ContentResolver f24635b;

    /* JADX INFO: compiled from: MediaSessionManagerImplBase.java */
    public static class a implements l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24638c;

        a(String str, int i10, int i11) {
            this.f24636a = str;
            this.f24637b = i10;
            this.f24638c = i11;
        }

        @Override // androidx.media.l.c
        public int a() {
            return this.f24637b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24637b < 0 || aVar.f24637b < 0) {
                return TextUtils.equals(this.f24636a, aVar.f24636a) && this.f24638c == aVar.f24638c;
            }
            return TextUtils.equals(this.f24636a, aVar.f24636a) && this.f24637b == aVar.f24637b && this.f24638c == aVar.f24638c;
        }

        @Override // androidx.media.l.c
        public String getPackageName() {
            return this.f24636a;
        }

        @Override // androidx.media.l.c
        public int getUid() {
            return this.f24638c;
        }

        public int hashCode() {
            return androidx.core.util.j.b(this.f24636a, Integer.valueOf(this.f24638c));
        }
    }

    o(Context context) {
        this.f24634a = context;
        this.f24635b = context.getContentResolver();
    }

    private boolean c(l.c cVar, String str) {
        if (cVar.a() < 0) {
            return this.f24634a.getPackageManager().checkPermission(str, cVar.getPackageName()) == 0;
        }
        return this.f24634a.checkPermission(str, cVar.a(), cVar.getUid()) == 0;
    }

    @Override // androidx.media.l.a
    public boolean a(@n0 l.c cVar) {
        try {
            if (this.f24634a.getPackageManager().getApplicationInfo(cVar.getPackageName(), 0) == null) {
                return false;
            }
            return c(cVar, f24631e) || c(cVar, f24632f) || cVar.getUid() == 1000 || b(cVar);
        } catch (PackageManager.NameNotFoundException unused) {
            if (f24630d) {
                Log.d(f24629c, "Package " + cVar.getPackageName() + " doesn't exist");
            }
            return false;
        }
    }

    boolean b(@n0 l.c cVar) {
        String string = Settings.Secure.getString(this.f24635b, f24633g);
        if (string != null) {
            for (String str : string.split(":")) {
                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(cVar.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media.l.a
    public Context getContext() {
        return this.f24634a;
    }
}
