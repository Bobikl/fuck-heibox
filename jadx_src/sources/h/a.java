package h;

import android.app.Activity;
import android.content.Context;
import org.apache.tools.ant.taskdefs.optional.vss.g;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f119077a;

    /* JADX INFO: compiled from: Platform.java */
    public static class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Class f119078c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Activity f119079b;

        static {
            try {
                f119078c = Class.forName("org.cocos2dx.lib.Cocos2dxActivity");
            } catch (Throwable unused) {
                f119078c = null;
            }
        }

        public b() {
            super();
            this.f119079b = null;
        }

        @Override // h.a
        public Activity a() {
            Activity activity = this.f119079b;
            if (activity != null) {
                return activity;
            }
            try {
                Context context = (Context) f119078c.getMethod("getContext", new Class[0]).invoke(null, new Object[0]);
                if (context instanceof Activity) {
                    this.f119079b = (Activity) context;
                }
            } catch (Throwable th2) {
                f.b.a(3, th2, "Get Activity failed", new Object[0]);
            }
            return this.f119079b;
        }
    }

    /* JADX INFO: compiled from: Platform.java */
    public static class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Class f119080b;

        static {
            try {
                f119080b = Class.forName("com.unity3d.player.UnityPlayer");
            } catch (Throwable unused) {
                f119080b = null;
            }
        }

        public c() {
            super();
        }

        @Override // h.a
        public Activity a() {
            try {
                return (Activity) f119080b.getField("currentActivity").get(null);
            } catch (Throwable th2) {
                f.b.a(3, th2, "Get Activity failed", new Object[0]);
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: Platform.java */
    public static class d extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Class f119081b;

        static {
            try {
                f119081b = Class.forName("com.epicgames.ue4.GameActivity");
            } catch (Throwable unused) {
                f119081b = null;
            }
        }

        public d() {
            super();
        }

        @Override // h.a
        public Activity a() {
            try {
                return (Activity) f119081b.getMethod(g.f135471u2, new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable th2) {
                f.b.a(3, th2, "Get Activity failed", new Object[0]);
                return null;
            }
        }
    }

    static {
        a bVar = b.f119078c == null ? null : new b();
        if (bVar == null) {
            bVar = c.f119080b == null ? null : new c();
            if (bVar == null) {
                d dVar = d.f119081b != null ? new d() : null;
                bVar = dVar != null ? dVar : new a();
            }
        }
        f119077a = bVar;
    }

    public a() {
    }

    public Activity a() {
        return null;
    }
}
