package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: IntentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20446a = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20447b = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20448c = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f20449d = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20450e = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: compiled from: IntentCompat.java */
    @androidx.annotation.w0(15)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Intent a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    /* JADX INFO: compiled from: IntentCompat.java */
    @androidx.annotation.w0(33)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static <T> T[] a(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        @androidx.annotation.u
        static <T> ArrayList<T> b(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        @androidx.annotation.u
        static <T> T c(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }
    }

    private m() {
    }

    @androidx.annotation.n0
    public static Intent a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        if (!s0.a(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent(s0.f20615b).setData(Uri.fromParts("package", str, null));
        return i10 >= 30 ? data : data.setPackage((String) androidx.core.util.o.l(s0.b(context.getPackageManager())));
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @androidx.annotation.p0
    public static Parcelable[] b(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<? extends Parcelable> cls) {
        return androidx.core.os.a.l() ? (Parcelable[]) b.a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @androidx.annotation.p0
    public static <T> ArrayList<T> c(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<? extends T> cls) {
        return androidx.core.os.a.l() ? b.b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @androidx.annotation.r0(markerClass = {androidx.core.os.a.b.class})
    @androidx.annotation.p0
    public static <T> T d(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 String str, @androidx.annotation.n0 Class<T> cls) {
        if (androidx.core.os.a.l()) {
            return (T) b.c(intent, str, cls);
        }
        T t10 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @androidx.annotation.n0
    public static Intent e(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2) {
        return a.a(str, str2);
    }
}
