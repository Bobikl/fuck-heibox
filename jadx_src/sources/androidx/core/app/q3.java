package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TaskStackBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements Iterable<Intent> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f20369d = "TaskStackBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f20370b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f20371c;

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static PendingIntent a(Context context, int i10, Intent[] intentArr, int i11, Bundle bundle) {
            return PendingIntent.getActivities(context, i10, intentArr, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    public interface b {
        @androidx.annotation.p0
        Intent getSupportParentActivityIntent();
    }

    private q3(Context context) {
        this.f20371c = context;
    }

    @androidx.annotation.n0
    public static q3 i(@androidx.annotation.n0 Context context) {
        return new q3(context);
    }

    @Deprecated
    public static q3 l(Context context) {
        return i(context);
    }

    @androidx.annotation.n0
    public q3 a(@androidx.annotation.n0 Intent intent) {
        this.f20370b.add(intent);
        return this;
    }

    @androidx.annotation.n0
    public q3 b(@androidx.annotation.n0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f20371c.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.n0
    public q3 e(@androidx.annotation.n0 Activity activity) {
        Intent supportParentActivityIntent = activity instanceof b ? ((b) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = c0.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f20371c.getPackageManager());
            }
            g(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    @androidx.annotation.n0
    public q3 g(@androidx.annotation.n0 ComponentName componentName) {
        int size = this.f20370b.size();
        try {
            Intent intentB = c0.b(this.f20371c, componentName);
            while (intentB != null) {
                this.f20370b.add(size, intentB);
                intentB = c0.b(this.f20371c, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f20369d, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @androidx.annotation.n0
    public q3 h(@androidx.annotation.n0 Class<?> cls) {
        return g(new ComponentName(this.f20371c, cls));
    }

    @Override // java.lang.Iterable
    @androidx.annotation.n0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f20370b.iterator();
    }

    @androidx.annotation.p0
    public Intent j(int i10) {
        return this.f20370b.get(i10);
    }

    @Deprecated
    public Intent m(int i10) {
        return j(i10);
    }

    public int o() {
        return this.f20370b.size();
    }

    @androidx.annotation.n0
    public Intent[] q() {
        int size = this.f20370b.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f20370b.get(0)).addFlags(268484608);
        for (int i10 = 1; i10 < size; i10++) {
            intentArr[i10] = new Intent(this.f20370b.get(i10));
        }
        return intentArr;
    }

    @androidx.annotation.p0
    public PendingIntent s(int i10, int i11) {
        return t(i10, i11, null);
    }

    @androidx.annotation.p0
    public PendingIntent t(int i10, int i11, @androidx.annotation.p0 Bundle bundle) {
        if (this.f20370b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f20370b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.f20371c, i10, intentArr, i11, bundle);
    }

    public void u() {
        v(null);
    }

    public void v(@androidx.annotation.p0 Bundle bundle) {
        if (this.f20370b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f20370b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.d.v(this.f20371c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f20371c.startActivity(intent);
    }
}
