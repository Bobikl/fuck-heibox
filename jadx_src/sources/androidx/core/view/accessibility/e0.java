package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: AccessibilityViewCommand.java */
/* JADX INFO: loaded from: classes.dex */
public interface e0 {

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Bundle f21443a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public void a(@p0 Bundle bundle) {
            this.f21443a = bundle;
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class b extends a {
        public boolean b() {
            return this.f21443a.getBoolean(a0.T);
        }

        public int c() {
            return this.f21443a.getInt(a0.R);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class c extends a {
        @p0
        public String b() {
            return this.f21443a.getString(a0.S);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class d extends a {
        public int b() {
            return this.f21443a.getInt(a0.f21334a0);
        }

        public int c() {
            return this.f21443a.getInt(a0.f21335b0);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class e extends a {
        public int b() {
            return this.f21443a.getInt(a0.Y);
        }

        public int c() {
            return this.f21443a.getInt(a0.X);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class f extends a {
        public float b() {
            return this.f21443a.getFloat(a0.Z);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class g extends a {
        public int b() {
            return this.f21443a.getInt(a0.V);
        }

        public int c() {
            return this.f21443a.getInt(a0.U);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class h extends a {
        @p0
        public CharSequence b() {
            return this.f21443a.getCharSequence(a0.W);
        }
    }

    boolean perform(@n0 View view, @p0 a aVar);
}
