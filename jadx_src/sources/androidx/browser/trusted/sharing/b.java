package androidx.browser.trusted.sharing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShareTarget.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"IntentName"})
    public static final String f3301e = "androidx.browser.trusted.sharing.KEY_ACTION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3302f = "androidx.browser.trusted.sharing.KEY_METHOD";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3303g = "androidx.browser.trusted.sharing.KEY_ENCTYPE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3304h = "androidx.browser.trusted.sharing.KEY_PARAMS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f3305i = "GET";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3306j = "POST";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3307k = "application/x-www-form-urlencoded";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f3308l = "multipart/form-data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    public final String f3309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f3310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f3311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final c f3312d;

    /* JADX INFO: compiled from: ShareTarget.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: renamed from: androidx.browser.trusted.sharing.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShareTarget.java */
    public static final class C0027b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f3313c = "androidx.browser.trusted.sharing.KEY_FILE_NAME";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f3314d = "androidx.browser.trusted.sharing.KEY_ACCEPTED_TYPES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n0
        public final String f3315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        public final List<String> f3316b;

        public C0027b(@n0 String str, @n0 List<String> list) {
            this.f3315a = str;
            this.f3316b = Collections.unmodifiableList(list);
        }

        @p0
        static C0027b a(@p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString(f3313c);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(f3314d);
            if (string == null || stringArrayList == null) {
                return null;
            }
            return new C0027b(string, stringArrayList);
        }

        @n0
        Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(f3313c, this.f3315a);
            bundle.putStringArrayList(f3314d, new ArrayList<>(this.f3316b));
            return bundle;
        }
    }

    /* JADX INFO: compiled from: ShareTarget.java */
    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f3317d = "androidx.browser.trusted.sharing.KEY_TITLE";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f3318e = "androidx.browser.trusted.sharing.KEY_TEXT";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f3319f = "androidx.browser.trusted.sharing.KEY_FILES";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final String f3320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final String f3321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final List<C0027b> f3322c;

        public c(@p0 String str, @p0 String str2, @p0 List<C0027b> list) {
            this.f3320a = str;
            this.f3321b = str2;
            this.f3322c = list;
        }

        @p0
        static c a(@p0 Bundle bundle) {
            ArrayList arrayList = null;
            if (bundle == null) {
                return null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f3319f);
            if (parcelableArrayList != null) {
                arrayList = new ArrayList();
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C0027b.a((Bundle) it.next()));
                }
            }
            return new c(bundle.getString("androidx.browser.trusted.sharing.KEY_TITLE"), bundle.getString("androidx.browser.trusted.sharing.KEY_TEXT"), arrayList);
        }

        @n0
        Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.browser.trusted.sharing.KEY_TITLE", this.f3320a);
            bundle.putString("androidx.browser.trusted.sharing.KEY_TEXT", this.f3321b);
            if (this.f3322c != null) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator<C0027b> it = this.f3322c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().b());
                }
                bundle.putParcelableArrayList(f3319f, arrayList);
            }
            return bundle;
        }
    }

    /* JADX INFO: compiled from: ShareTarget.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface d {
    }

    public b(@n0 String str, @p0 String str2, @p0 String str3, @n0 c cVar) {
        this.f3309a = str;
        this.f3310b = str2;
        this.f3311c = str3;
        this.f3312d = cVar;
    }

    @p0
    public static b a(@n0 Bundle bundle) {
        String string = bundle.getString(f3301e);
        String string2 = bundle.getString(f3302f);
        String string3 = bundle.getString(f3303g);
        c cVarA = c.a(bundle.getBundle(f3304h));
        if (string == null || cVarA == null) {
            return null;
        }
        return new b(string, string2, string3, cVarA);
    }

    @n0
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f3301e, this.f3309a);
        bundle.putString(f3302f, this.f3310b);
        bundle.putString(f3303g, this.f3311c);
        bundle.putBundle(f3304h, this.f3312d.b());
        return bundle;
    }
}
