package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes6.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    public static final String f26721a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public static final String f26722b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public static final String f26723c = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public static final String f26724d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private static final String f26725e = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    private static final String f26726f = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private static final String f26727g = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    private static final String f26728h = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    private static final String f26729i = "DROP_SHADER_CACHE";

    public class a implements i.d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
            i.f26772h.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
            i.f26772h.b(i10, obj);
        }
    }

    static void a(@n0 i.d dVar) {
        if (Build.VERSION.SDK_INT < 24) {
            dVar.a(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            dVar.a(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@n0 Context context, @p0 Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f26721a.equals(action)) {
            i.n(context, new f(), new a(), true);
            return;
        }
        if (f26723c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f26725e);
                if (f26726f.equals(string)) {
                    i.o(context, new f(), new a());
                    return;
                } else {
                    if (f26727g.equals(string)) {
                        i.d(context, new f(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f26722b.equals(action)) {
            a(new a());
            return;
        }
        if (!f26724d.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(f26728h);
        a aVar = new a();
        if (f26729i.equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
