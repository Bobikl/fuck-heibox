package androidx.core.app;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: Person.java */
/* JADX INFO: loaded from: classes.dex */
public class a3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f19889g = "name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f19890h = "icon";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f19891i = "uri";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f19892j = "key";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f19893k = "isBot";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f19894l = "isImportant";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    CharSequence f19895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    IconCompat f19896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    String f19897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    String f19898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f19899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f19900f;

    /* JADX INFO: compiled from: Person.java */
    @androidx.annotation.w0(22)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static a3 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString(a3.f19891i)).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean(a3.f19893k)).d(persistableBundle.getBoolean(a3.f19894l)).a();
        }

        @androidx.annotation.u
        static PersistableBundle b(a3 a3Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = a3Var.f19895a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString(a3.f19891i, a3Var.f19897c);
            persistableBundle.putString("key", a3Var.f19898d);
            persistableBundle.putBoolean(a3.f19893k, a3Var.f19899e);
            persistableBundle.putBoolean(a3.f19894l, a3Var.f19900f);
            return persistableBundle;
        }
    }

    /* JADX INFO: compiled from: Person.java */
    @androidx.annotation.w0(28)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static a3 a(Person person) {
            return new c().f(person.getName()).c(person.getIcon() != null ? IconCompat.g(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        @androidx.annotation.u
        static Person b(a3 a3Var) {
            return new Object() { // from class: android.app.Person.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                @NonNull
                public native /* synthetic */ Person build();

                @NonNull
                public native /* synthetic */ Builder setBot(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setIcon(@Nullable Icon icon);

                @NonNull
                public native /* synthetic */ Builder setImportant(boolean z10);

                @NonNull
                public native /* synthetic */ Builder setKey(@Nullable String str);

                @NonNull
                public native /* synthetic */ Builder setName(@Nullable CharSequence charSequence);

                @NonNull
                public native /* synthetic */ Builder setUri(@Nullable String str);
            }.setName(a3Var.f()).setIcon(a3Var.d() != null ? a3Var.d().K() : null).setUri(a3Var.g()).setKey(a3Var.e()).setBot(a3Var.h()).setImportant(a3Var.i()).build();
        }
    }

    /* JADX INFO: compiled from: Person.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        CharSequence f19901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        IconCompat f19902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        String f19903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        String f19904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f19905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f19906f;

        public c() {
        }

        c(a3 a3Var) {
            this.f19901a = a3Var.f19895a;
            this.f19902b = a3Var.f19896b;
            this.f19903c = a3Var.f19897c;
            this.f19904d = a3Var.f19898d;
            this.f19905e = a3Var.f19899e;
            this.f19906f = a3Var.f19900f;
        }

        @androidx.annotation.n0
        public a3 a() {
            return new a3(this);
        }

        @androidx.annotation.n0
        public c b(boolean z10) {
            this.f19905e = z10;
            return this;
        }

        @androidx.annotation.n0
        public c c(@androidx.annotation.p0 IconCompat iconCompat) {
            this.f19902b = iconCompat;
            return this;
        }

        @androidx.annotation.n0
        public c d(boolean z10) {
            this.f19906f = z10;
            return this;
        }

        @androidx.annotation.n0
        public c e(@androidx.annotation.p0 String str) {
            this.f19904d = str;
            return this;
        }

        @androidx.annotation.n0
        public c f(@androidx.annotation.p0 CharSequence charSequence) {
            this.f19901a = charSequence;
            return this;
        }

        @androidx.annotation.n0
        public c g(@androidx.annotation.p0 String str) {
            this.f19903c = str;
            return this;
        }
    }

    a3(c cVar) {
        this.f19895a = cVar.f19901a;
        this.f19896b = cVar.f19902b;
        this.f19897c = cVar.f19903c;
        this.f19898d = cVar.f19904d;
        this.f19899e = cVar.f19905e;
        this.f19900f = cVar.f19906f;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static a3 a(@androidx.annotation.n0 Person person) {
        return b.a(person);
    }

    @androidx.annotation.n0
    public static a3 b(@androidx.annotation.n0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new c().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.e(bundle2) : null).g(bundle.getString(f19891i)).e(bundle.getString("key")).b(bundle.getBoolean(f19893k)).d(bundle.getBoolean(f19894l)).a();
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static a3 c(@androidx.annotation.n0 PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @androidx.annotation.p0
    public IconCompat d() {
        return this.f19896b;
    }

    @androidx.annotation.p0
    public String e() {
        return this.f19898d;
    }

    @androidx.annotation.p0
    public CharSequence f() {
        return this.f19895a;
    }

    @androidx.annotation.p0
    public String g() {
        return this.f19897c;
    }

    public boolean h() {
        return this.f19899e;
    }

    public boolean i() {
        return this.f19900f;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String j() {
        String str = this.f19897c;
        if (str != null) {
            return str;
        }
        if (this.f19895a == null) {
            return "";
        }
        return "name:" + ((Object) this.f19895a);
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Person k() {
        return b.b(this);
    }

    @androidx.annotation.n0
    public c l() {
        return new c(this);
    }

    @androidx.annotation.n0
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f19895a);
        IconCompat iconCompat = this.f19896b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.J() : null);
        bundle.putString(f19891i, this.f19897c);
        bundle.putString("key", this.f19898d);
        bundle.putBoolean(f19893k, this.f19899e);
        bundle.putBoolean(f19894l, this.f19900f);
        return bundle;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PersistableBundle n() {
        return a.b(this);
    }
}
