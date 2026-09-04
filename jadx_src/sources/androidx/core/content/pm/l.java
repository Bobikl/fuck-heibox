package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.app.a3;
import androidx.core.content.m0;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ShortcutInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class l {
    private static final String C = "extraPersonCount";
    private static final String D = "extraPerson_";
    private static final String E = "extraLocusId";
    private static final String F = "extraLongLived";
    private static final String G = "extraSliceUri";
    public static final int H = 1;
    int A;
    int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f20502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f20503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f20504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Intent[] f20505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ComponentName f20506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    CharSequence f20507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    CharSequence f20508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    CharSequence f20509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    IconCompat f20510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f20511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    a3[] f20512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Set<String> f20513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    m0 f20514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f20515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f20516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    PersistableBundle f20517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Bundle f20518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f20519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    UserHandle f20520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f20521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f20522u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f20523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f20524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f20525x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f20526y = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f20527z;

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    @w0(33)
    public static class a {
        private a() {
        }

        static void a(@n0 ShortcutInfo.Builder builder, int i10) {
            builder.setExcludedFromSurfaces(i10);
        }
    }

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f20528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<String> f20530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f20531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Uri f20532e;

        @w0(25)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public b(@n0 Context context, @n0 ShortcutInfo shortcutInfo) {
            l lVar = new l();
            this.f20528a = lVar;
            lVar.f20502a = context;
            lVar.f20503b = shortcutInfo.getId();
            lVar.f20504c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            lVar.f20505d = (Intent[]) Arrays.copyOf(intents, intents.length);
            lVar.f20506e = shortcutInfo.getActivity();
            lVar.f20507f = shortcutInfo.getShortLabel();
            lVar.f20508g = shortcutInfo.getLongLabel();
            lVar.f20509h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                lVar.A = shortcutInfo.getDisabledReason();
            } else {
                lVar.A = shortcutInfo.isEnabled() ? 0 : 3;
            }
            lVar.f20513l = shortcutInfo.getCategories();
            lVar.f20512k = l.u(shortcutInfo.getExtras());
            lVar.f20520s = shortcutInfo.getUserHandle();
            lVar.f20519r = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                lVar.f20521t = shortcutInfo.isCached();
            }
            lVar.f20522u = shortcutInfo.isDynamic();
            lVar.f20523v = shortcutInfo.isPinned();
            lVar.f20524w = shortcutInfo.isDeclaredInManifest();
            lVar.f20525x = shortcutInfo.isImmutable();
            lVar.f20526y = shortcutInfo.isEnabled();
            lVar.f20527z = shortcutInfo.hasKeyFieldsOnly();
            lVar.f20514m = l.p(shortcutInfo);
            lVar.f20516o = shortcutInfo.getRank();
            lVar.f20517p = shortcutInfo.getExtras();
        }

        public b(@n0 Context context, @n0 String str) {
            l lVar = new l();
            this.f20528a = lVar;
            lVar.f20502a = context;
            lVar.f20503b = str;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public b(@n0 l lVar) {
            l lVar2 = new l();
            this.f20528a = lVar2;
            lVar2.f20502a = lVar.f20502a;
            lVar2.f20503b = lVar.f20503b;
            lVar2.f20504c = lVar.f20504c;
            Intent[] intentArr = lVar.f20505d;
            lVar2.f20505d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            lVar2.f20506e = lVar.f20506e;
            lVar2.f20507f = lVar.f20507f;
            lVar2.f20508g = lVar.f20508g;
            lVar2.f20509h = lVar.f20509h;
            lVar2.A = lVar.A;
            lVar2.f20510i = lVar.f20510i;
            lVar2.f20511j = lVar.f20511j;
            lVar2.f20520s = lVar.f20520s;
            lVar2.f20519r = lVar.f20519r;
            lVar2.f20521t = lVar.f20521t;
            lVar2.f20522u = lVar.f20522u;
            lVar2.f20523v = lVar.f20523v;
            lVar2.f20524w = lVar.f20524w;
            lVar2.f20525x = lVar.f20525x;
            lVar2.f20526y = lVar.f20526y;
            lVar2.f20514m = lVar.f20514m;
            lVar2.f20515n = lVar.f20515n;
            lVar2.f20527z = lVar.f20527z;
            lVar2.f20516o = lVar.f20516o;
            a3[] a3VarArr = lVar.f20512k;
            if (a3VarArr != null) {
                lVar2.f20512k = (a3[]) Arrays.copyOf(a3VarArr, a3VarArr.length);
            }
            if (lVar.f20513l != null) {
                lVar2.f20513l = new HashSet(lVar.f20513l);
            }
            PersistableBundle persistableBundle = lVar.f20517p;
            if (persistableBundle != null) {
                lVar2.f20517p = persistableBundle;
            }
            lVar2.B = lVar.B;
        }

        @n0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b a(@n0 String str) {
            if (this.f20530c == null) {
                this.f20530c = new HashSet();
            }
            this.f20530c.add(str);
            return this;
        }

        @n0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b b(@n0 String str, @n0 String str2, @n0 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f20531d == null) {
                    this.f20531d = new HashMap();
                }
                if (this.f20531d.get(str) == null) {
                    this.f20531d.put(str, new HashMap());
                }
                this.f20531d.get(str).put(str2, list);
            }
            return this;
        }

        @n0
        public l c() {
            if (TextUtils.isEmpty(this.f20528a.f20507f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            l lVar = this.f20528a;
            Intent[] intentArr = lVar.f20505d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f20529b) {
                if (lVar.f20514m == null) {
                    lVar.f20514m = new m0(lVar.f20503b);
                }
                this.f20528a.f20515n = true;
            }
            if (this.f20530c != null) {
                l lVar2 = this.f20528a;
                if (lVar2.f20513l == null) {
                    lVar2.f20513l = new HashSet();
                }
                this.f20528a.f20513l.addAll(this.f20530c);
            }
            if (this.f20531d != null) {
                l lVar3 = this.f20528a;
                if (lVar3.f20517p == null) {
                    lVar3.f20517p = new PersistableBundle();
                }
                for (String str : this.f20531d.keySet()) {
                    Map<String, List<String>> map = this.f20531d.get(str);
                    this.f20528a.f20517p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f20528a.f20517p.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f20532e != null) {
                l lVar4 = this.f20528a;
                if (lVar4.f20517p == null) {
                    lVar4.f20517p = new PersistableBundle();
                }
                this.f20528a.f20517p.putString(l.G, androidx.core.net.h.a(this.f20532e));
            }
            return this.f20528a;
        }

        @n0
        public b d(@n0 ComponentName componentName) {
            this.f20528a.f20506e = componentName;
            return this;
        }

        @n0
        public b e() {
            this.f20528a.f20511j = true;
            return this;
        }

        @n0
        public b f(@n0 Set<String> set) {
            this.f20528a.f20513l = set;
            return this;
        }

        @n0
        public b g(@n0 CharSequence charSequence) {
            this.f20528a.f20509h = charSequence;
            return this;
        }

        @n0
        public b h(int i10) {
            this.f20528a.B = i10;
            return this;
        }

        @n0
        public b i(@n0 PersistableBundle persistableBundle) {
            this.f20528a.f20517p = persistableBundle;
            return this;
        }

        @n0
        public b j(IconCompat iconCompat) {
            this.f20528a.f20510i = iconCompat;
            return this;
        }

        @n0
        public b k(@n0 Intent intent) {
            return l(new Intent[]{intent});
        }

        @n0
        public b l(@n0 Intent[] intentArr) {
            this.f20528a.f20505d = intentArr;
            return this;
        }

        @n0
        public b m() {
            this.f20529b = true;
            return this;
        }

        @n0
        public b n(@p0 m0 m0Var) {
            this.f20528a.f20514m = m0Var;
            return this;
        }

        @n0
        public b o(@n0 CharSequence charSequence) {
            this.f20528a.f20508g = charSequence;
            return this;
        }

        @n0
        @Deprecated
        public b p() {
            this.f20528a.f20515n = true;
            return this;
        }

        @n0
        public b q(boolean z10) {
            this.f20528a.f20515n = z10;
            return this;
        }

        @n0
        public b r(@n0 a3 a3Var) {
            return s(new a3[]{a3Var});
        }

        @n0
        public b s(@n0 a3[] a3VarArr) {
            this.f20528a.f20512k = a3VarArr;
            return this;
        }

        @n0
        public b t(int i10) {
            this.f20528a.f20516o = i10;
            return this;
        }

        @n0
        public b u(@n0 CharSequence charSequence) {
            this.f20528a.f20507f = charSequence;
            return this;
        }

        @n0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b v(@n0 Uri uri) {
            this.f20532e = uri;
            return this;
        }

        @n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public b w(@n0 Bundle bundle) {
            this.f20528a.f20518q = (Bundle) androidx.core.util.o.l(bundle);
            return this;
        }
    }

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    l() {
    }

    @w0(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private PersistableBundle b() {
        if (this.f20517p == null) {
            this.f20517p = new PersistableBundle();
        }
        a3[] a3VarArr = this.f20512k;
        if (a3VarArr != null && a3VarArr.length > 0) {
            this.f20517p.putInt(C, a3VarArr.length);
            int i10 = 0;
            while (i10 < this.f20512k.length) {
                PersistableBundle persistableBundle = this.f20517p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(D);
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f20512k[i10].n());
                i10 = i11;
            }
        }
        m0 m0Var = this.f20514m;
        if (m0Var != null) {
            this.f20517p.putString(E, m0Var.a());
        }
        this.f20517p.putBoolean(F, this.f20515n);
        return this.f20517p;
    }

    @w0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static List<l> c(@n0 Context context, @n0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).c());
        }
        return arrayList;
    }

    @w0(25)
    @p0
    static m0 p(@n0 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return q(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return m0.d(shortcutInfo.getLocusId());
    }

    @w0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    private static m0 q(@p0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(E)) == null) {
            return null;
        }
        return new m0(string);
    }

    @j1
    @w0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    static boolean s(@p0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(F)) {
            return false;
        }
        return persistableBundle.getBoolean(F);
    }

    @j1
    @w0(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    static a3[] u(@n0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(C)) {
            return null;
        }
        int i10 = persistableBundle.getInt(C);
        a3[] a3VarArr = new a3[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(D);
            int i12 = i11 + 1;
            sb2.append(i12);
            a3VarArr[i11] = a3.c(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return a3VarArr;
    }

    public boolean A() {
        return this.f20521t;
    }

    public boolean B() {
        return this.f20524w;
    }

    public boolean C() {
        return this.f20522u;
    }

    public boolean D() {
        return this.f20526y;
    }

    public boolean E(int i10) {
        return (i10 & this.B) != 0;
    }

    public boolean F() {
        return this.f20525x;
    }

    public boolean G() {
        return this.f20523v;
    }

    @w0(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f20502a, this.f20503b).setShortLabel(this.f20507f).setIntents(this.f20505d);
        IconCompat iconCompat = this.f20510i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.L(this.f20502a));
        }
        if (!TextUtils.isEmpty(this.f20508g)) {
            intents.setLongLabel(this.f20508g);
        }
        if (!TextUtils.isEmpty(this.f20509h)) {
            intents.setDisabledMessage(this.f20509h);
        }
        ComponentName componentName = this.f20506e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f20513l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f20516o);
        PersistableBundle persistableBundle = this.f20517p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            a3[] a3VarArr = this.f20512k;
            if (a3VarArr != null && a3VarArr.length > 0) {
                int length = a3VarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f20512k[i10].k();
                }
                intents.setPersons(personArr);
            }
            m0 m0Var = this.f20514m;
            if (m0Var != null) {
                intents.setLocusId(m0Var.c());
            }
            intents.setLongLived(this.f20515n);
        } else {
            intents.setExtras(b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.B);
        }
        return intents.build();
    }

    Intent a(Intent intent) {
        Intent[] intentArr = this.f20505d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f20507f.toString());
        if (this.f20510i != null) {
            Drawable activityIcon = null;
            if (this.f20511j) {
                PackageManager packageManager = this.f20502a.getPackageManager();
                ComponentName componentName = this.f20506e;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f20502a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f20510i.c(intent, activityIcon, this.f20502a);
        }
        return intent;
    }

    @p0
    public ComponentName d() {
        return this.f20506e;
    }

    @p0
    public Set<String> e() {
        return this.f20513l;
    }

    @p0
    public CharSequence f() {
        return this.f20509h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    @p0
    public PersistableBundle i() {
        return this.f20517p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f20510i;
    }

    @n0
    public String k() {
        return this.f20503b;
    }

    @n0
    public Intent l() {
        Intent[] intentArr = this.f20505d;
        return intentArr[intentArr.length - 1];
    }

    @n0
    public Intent[] m() {
        Intent[] intentArr = this.f20505d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f20519r;
    }

    @p0
    public m0 o() {
        return this.f20514m;
    }

    @p0
    public CharSequence r() {
        return this.f20508g;
    }

    @n0
    public String t() {
        return this.f20504c;
    }

    public int v() {
        return this.f20516o;
    }

    @n0
    public CharSequence w() {
        return this.f20507f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p0
    public Bundle x() {
        return this.f20518q;
    }

    @p0
    public UserHandle y() {
        return this.f20520s;
    }

    public boolean z() {
        return this.f20527z;
    }
}
