package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f19940h = "android.remoteinput.results";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f19941i = "android.remoteinput.resultsData";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f19942j = "android.remoteinput.dataTypeResultsData";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f19943k = "android.remoteinput.resultsSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f19944l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19945m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19946n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19947o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f19948p = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f19950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence[] f19951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f19954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<String> f19955g;

    /* JADX INFO: compiled from: RemoteInput.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        @androidx.annotation.u
        static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @androidx.annotation.w0(20)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(e3 e3Var) {
            Set<String> setG;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(e3Var.o()).setLabel(e3Var.n()).setChoices(e3Var.h()).setAllowFreeFormInput(e3Var.f()).addExtras(e3Var.m());
            if (Build.VERSION.SDK_INT >= 26 && (setG = e3Var.g()) != null) {
                Iterator<String> it = setG.iterator();
                while (it.hasNext()) {
                    c.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(builderAddExtras, e3Var.k());
            }
            return builderAddExtras.build();
        }

        static e3 c(Object obj) {
            Set<String> setB;
            RemoteInput remoteInput = (RemoteInput) obj;
            f fVarA = new f(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setB = c.b(remoteInput)) != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    fVarA.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                fVarA.g(e.a(remoteInput));
            }
            return fVarA.b();
        }

        @androidx.annotation.u
        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @androidx.annotation.w0(26)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(e3 e3Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(e3.c(e3Var), intent, map);
        }

        @androidx.annotation.u
        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @androidx.annotation.u
        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @androidx.annotation.u
        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @androidx.annotation.w0(28)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        @androidx.annotation.u
        static void b(Intent intent, int i10) {
            RemoteInput.setResultsSource(intent, i10);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @androidx.annotation.w0(29)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @androidx.annotation.u
        static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19956a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f19959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence[] f19960e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<String> f19957b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f19958c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19961f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f19962g = 0;

        public f(@androidx.annotation.n0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f19956a = str;
        }

        @androidx.annotation.n0
        public f a(@androidx.annotation.n0 Bundle bundle) {
            if (bundle != null) {
                this.f19958c.putAll(bundle);
            }
            return this;
        }

        @androidx.annotation.n0
        public e3 b() {
            return new e3(this.f19956a, this.f19959d, this.f19960e, this.f19961f, this.f19962g, this.f19958c, this.f19957b);
        }

        @androidx.annotation.n0
        public Bundle c() {
            return this.f19958c;
        }

        @androidx.annotation.n0
        public f d(@androidx.annotation.n0 String str, boolean z10) {
            if (z10) {
                this.f19957b.add(str);
            } else {
                this.f19957b.remove(str);
            }
            return this;
        }

        @androidx.annotation.n0
        public f e(boolean z10) {
            this.f19961f = z10;
            return this;
        }

        @androidx.annotation.n0
        public f f(@androidx.annotation.p0 CharSequence[] charSequenceArr) {
            this.f19960e = charSequenceArr;
            return this;
        }

        @androidx.annotation.n0
        public f g(int i10) {
            this.f19962g = i10;
            return this;
        }

        @androidx.annotation.n0
        public f h(@androidx.annotation.p0 CharSequence charSequence) {
            this.f19959d = charSequence;
            return this;
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    e3(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f19949a = str;
        this.f19950b = charSequence;
        this.f19951c = charSequenceArr;
        this.f19952d = z10;
        this.f19953e = i10;
        this.f19954f = bundle;
        this.f19955g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@androidx.annotation.n0 e3 e3Var, @androidx.annotation.n0 Intent intent, @androidx.annotation.n0 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(e3Var, intent, map);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentI.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(e3Var.o(), value.toString());
                intentI.putExtra(l(key), bundleExtra);
            }
        }
        a.b(intent, ClipData.newIntent(f19940h, intentI));
    }

    public static void b(@androidx.annotation.n0 e3[] e3VarArr, @androidx.annotation.n0 Intent intent, @androidx.annotation.n0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(d(e3VarArr), intent, bundle);
            return;
        }
        Bundle bundleP = p(intent);
        int iQ = q(intent);
        if (bundleP != null) {
            bundleP.putAll(bundle);
            bundle = bundleP;
        }
        for (e3 e3Var : e3VarArr) {
            Map<String, Uri> mapJ = j(intent, e3Var.o());
            b.a(d(new e3[]{e3Var}), intent, bundle);
            if (mapJ != null) {
                a(e3Var, intent, mapJ);
            }
        }
        s(intent, iQ);
    }

    @androidx.annotation.w0(20)
    static RemoteInput c(e3 e3Var) {
        return b.b(e3Var);
    }

    @androidx.annotation.w0(20)
    static RemoteInput[] d(e3[] e3VarArr) {
        if (e3VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[e3VarArr.length];
        for (int i10 = 0; i10 < e3VarArr.length; i10++) {
            remoteInputArr[i10] = c(e3VarArr[i10]);
        }
        return remoteInputArr;
    }

    @androidx.annotation.w0(20)
    static e3 e(RemoteInput remoteInput) {
        return b.c(remoteInput);
    }

    @androidx.annotation.w0(16)
    private static Intent i(Intent intent) {
        ClipData clipDataA = a.a(intent);
        if (clipDataA == null) {
            return null;
        }
        ClipDescription description = clipDataA.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f19940h)) {
            return clipDataA.getItemAt(0).getIntent();
        }
        return null;
    }

    @androidx.annotation.p0
    public static Map<String, Uri> j(@androidx.annotation.n0 Intent intent, @androidx.annotation.n0 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(intent, str);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentI.getExtras().keySet()) {
            if (str2.startsWith(f19942j)) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentI.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static String l(String str) {
        return f19942j + str;
    }

    @androidx.annotation.p0
    public static Bundle p(@androidx.annotation.n0 Intent intent) {
        return b.d(intent);
    }

    public static int q(@androidx.annotation.n0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(intent);
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            return 0;
        }
        return intentI.getExtras().getInt(f19943k, 0);
    }

    public static void s(@androidx.annotation.n0 Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(intent, i10);
            return;
        }
        Intent intentI = i(intent);
        if (intentI == null) {
            intentI = new Intent();
        }
        intentI.putExtra(f19943k, i10);
        a.b(intent, ClipData.newIntent(f19940h, intentI));
    }

    public boolean f() {
        return this.f19952d;
    }

    @androidx.annotation.p0
    public Set<String> g() {
        return this.f19955g;
    }

    @androidx.annotation.p0
    public CharSequence[] h() {
        return this.f19951c;
    }

    public int k() {
        return this.f19953e;
    }

    @androidx.annotation.n0
    public Bundle m() {
        return this.f19954f;
    }

    @androidx.annotation.p0
    public CharSequence n() {
        return this.f19950b;
    }

    @androidx.annotation.n0
    public String o() {
        return this.f19949a;
    }

    public boolean r() {
        return (f() || (h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}
