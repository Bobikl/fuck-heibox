package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f21439b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Object f21440a;

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @w0(16)
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c0 f21441a;

        a(c0 c0Var) {
            this.f21441a = c0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            a0 a0VarB = this.f21441a.b(i10);
            if (a0VarB == null) {
                return null;
            }
            return a0VarB.f2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<a0> listC = this.f21441a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listC.get(i11).f2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f21441a.f(i10, i11, bundle);
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @w0(19)
    public static class b extends a {
        b(c0 c0Var) {
            super(c0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            a0 a0VarD = this.f21441a.d(i10);
            if (a0VarD == null) {
                return null;
            }
            return a0VarD.f2();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeProviderCompat.java */
    @w0(26)
    public static class c extends b {
        c(c0 c0Var) {
            super(c0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f21441a.a(i10, a0.g2(accessibilityNodeInfo), str, bundle);
        }
    }

    public c0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21440a = new c(this);
        } else {
            this.f21440a = new b(this);
        }
    }

    public c0(@p0 Object obj) {
        this.f21440a = obj;
    }

    public void a(int i10, @n0 a0 a0Var, @n0 String str, @p0 Bundle bundle) {
    }

    @p0
    public a0 b(int i10) {
        return null;
    }

    @p0
    public List<a0> c(@n0 String str, int i10) {
        return null;
    }

    @p0
    public a0 d(int i10) {
        return null;
    }

    @p0
    public Object e() {
        return this.f21440a;
    }

    public boolean f(int i10, int i11, @p0 Bundle bundle) {
        return false;
    }
}
