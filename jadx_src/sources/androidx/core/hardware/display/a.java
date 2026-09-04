package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DisplayManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, a> f20795b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20796c = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20797a;

    /* JADX INFO: renamed from: androidx.core.hardware.display.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DisplayManagerCompat.java */
    @w0(17)
    public static class C0131a {
        private C0131a() {
        }

        @u
        static Display a(DisplayManager displayManager, int i10) {
            return displayManager.getDisplay(i10);
        }

        @u
        static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    private a(Context context) {
        this.f20797a = context;
    }

    @n0
    public static a d(@n0 Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f20795b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @p0
    public Display a(int i10) {
        return C0131a.a((DisplayManager) this.f20797a.getSystemService("display"), i10);
    }

    @n0
    public Display[] b() {
        return C0131a.b((DisplayManager) this.f20797a.getSystemService("display"));
    }

    @n0
    public Display[] c(@p0 String str) {
        return C0131a.b((DisplayManager) this.f20797a.getSystemService("display"));
    }
}
