package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0146c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f21437b;

        AccessibilityManagerAccessibilityStateChangeListenerC0146c(@n0 a aVar) {
            this.f21437b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0146c) {
                return this.f21437b.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0146c) obj).f21437b);
            }
            return false;
        }

        public int hashCode() {
            return this.f21437b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            this.f21437b.onAccessibilityStateChanged(z10);
        }
    }

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @w0(19)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static boolean a(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
        }

        @androidx.annotation.u
        static boolean b(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
        }
    }

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    public interface e {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @w0(19)
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f21438a;

        f(@n0 e eVar) {
            this.f21438a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f21438a.equals(((f) obj).f21438a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21438a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f21438a.onTouchExplorationStateChanged(z10);
        }
    }

    private c() {
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0146c(aVar));
    }

    public static boolean b(@n0 AccessibilityManager accessibilityManager, @n0 e eVar) {
        return d.a(accessibilityManager, eVar);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0146c(aVar));
    }

    public static boolean g(@n0 AccessibilityManager accessibilityManager, @n0 e eVar) {
        return d.b(accessibilityManager, eVar);
    }
}
