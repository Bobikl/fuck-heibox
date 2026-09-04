package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShareCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20333a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20334b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20335c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20336d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20337e = ".sharecompat_";

    /* JADX INFO: compiled from: ShareCompat.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @androidx.annotation.u
        static void b(@androidx.annotation.n0 Intent intent, @androidx.annotation.n0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(androidx.core.content.m.f20447b), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i10 = 1; i10 < size; i10++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i10)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* JADX INFO: compiled from: ShareCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final Context f20338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        private final Intent f20339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f20340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f20341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f20342e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<String> f20343f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<Uri> f20344g;

        public b(@androidx.annotation.n0 Context context) {
            Activity activity;
            this.f20338a = (Context) androidx.core.util.o.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f20339b = action;
            action.putExtra(o3.f20333a, context.getPackageName());
            action.putExtra(o3.f20334b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f20339b.putExtra(o3.f20335c, componentName);
                this.f20339b.putExtra(o3.f20336d, componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f20339b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f20339b.putExtra(str, strArr);
        }

        private void i(@androidx.annotation.p0 String str, @androidx.annotation.n0 String[] strArr) {
            Intent intentM = m();
            String[] stringArrayExtra = intentM.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentM.putExtra(str, strArr2);
        }

        @androidx.annotation.n0
        @Deprecated
        public static b k(@androidx.annotation.n0 Activity activity) {
            return new b(activity);
        }

        @androidx.annotation.n0
        public b a(@androidx.annotation.n0 String str) {
            if (this.f20343f == null) {
                this.f20343f = new ArrayList<>();
            }
            this.f20343f.add(str);
            return this;
        }

        @androidx.annotation.n0
        public b b(@androidx.annotation.n0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b c(@androidx.annotation.n0 String str) {
            if (this.f20342e == null) {
                this.f20342e = new ArrayList<>();
            }
            this.f20342e.add(str);
            return this;
        }

        @androidx.annotation.n0
        public b d(@androidx.annotation.n0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b e(@androidx.annotation.n0 String str) {
            if (this.f20341d == null) {
                this.f20341d = new ArrayList<>();
            }
            this.f20341d.add(str);
            return this;
        }

        @androidx.annotation.n0
        public b f(@androidx.annotation.n0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b g(@androidx.annotation.n0 Uri uri) {
            if (this.f20344g == null) {
                this.f20344g = new ArrayList<>();
            }
            this.f20344g.add(uri);
            return this;
        }

        @androidx.annotation.n0
        public Intent j() {
            return Intent.createChooser(m(), this.f20340c);
        }

        @androidx.annotation.n0
        Context l() {
            return this.f20338a;
        }

        @androidx.annotation.n0
        public Intent m() {
            ArrayList<String> arrayList = this.f20341d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f20341d = null;
            }
            ArrayList<String> arrayList2 = this.f20342e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f20342e = null;
            }
            ArrayList<String> arrayList3 = this.f20343f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f20343f = null;
            }
            ArrayList<Uri> arrayList4 = this.f20344g;
            if (arrayList4 != null && arrayList4.size() > 1) {
                this.f20339b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f20339b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f20344g);
                a.b(this.f20339b, this.f20344g);
            } else {
                this.f20339b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f20344g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f20339b.removeExtra("android.intent.extra.STREAM");
                    a.c(this.f20339b);
                } else {
                    this.f20339b.putExtra("android.intent.extra.STREAM", this.f20344g.get(0));
                    a.b(this.f20339b, this.f20344g);
                }
            }
            return this.f20339b;
        }

        @androidx.annotation.n0
        public b n(@androidx.annotation.d1 int i10) {
            return o(this.f20338a.getText(i10));
        }

        @androidx.annotation.n0
        public b o(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20340c = charSequence;
            return this;
        }

        @androidx.annotation.n0
        public b p(@androidx.annotation.p0 String[] strArr) {
            this.f20339b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b q(@androidx.annotation.p0 String[] strArr) {
            this.f20339b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b r(@androidx.annotation.p0 String[] strArr) {
            if (this.f20341d != null) {
                this.f20341d = null;
            }
            this.f20339b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.n0
        public b s(@androidx.annotation.p0 String str) {
            this.f20339b.putExtra(androidx.core.content.m.f20447b, str);
            if (!this.f20339b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @androidx.annotation.n0
        public b t(@androidx.annotation.p0 Uri uri) {
            this.f20344g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @androidx.annotation.n0
        public b u(@androidx.annotation.p0 String str) {
            this.f20339b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @androidx.annotation.n0
        public b v(@androidx.annotation.p0 CharSequence charSequence) {
            this.f20339b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @androidx.annotation.n0
        public b w(@androidx.annotation.p0 String str) {
            this.f20339b.setType(str);
            return this;
        }

        public void x() {
            this.f20338a.startActivity(j());
        }
    }

    /* JADX INFO: compiled from: ShareCompat.java */
    public static class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f20345f = "IntentReader";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.n0
        private final Context f20346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.n0
        private final Intent f20347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final String f20348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private final ComponentName f20349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private ArrayList<Uri> f20350e;

        public c(@androidx.annotation.n0 Activity activity) {
            this((Context) androidx.core.util.o.l(activity), activity.getIntent());
        }

        public c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Intent intent) {
            this.f20346a = (Context) androidx.core.util.o.l(context);
            this.f20347b = (Intent) androidx.core.util.o.l(intent);
            this.f20348c = o3.f(intent);
            this.f20349d = o3.d(intent);
        }

        @androidx.annotation.n0
        @Deprecated
        public static c a(@androidx.annotation.n0 Activity activity) {
            return new c(activity);
        }

        private static void t(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt == '<') {
                    sb2.append("&lt;");
                } else if (cCharAt == '>') {
                    sb2.append("&gt;");
                } else if (cCharAt == '&') {
                    sb2.append("&amp;");
                } else if (cCharAt > '~' || cCharAt < ' ') {
                    sb2.append("&#");
                    sb2.append((int) cCharAt);
                    sb2.append(";");
                } else if (cCharAt == ' ') {
                    while (true) {
                        int i12 = i10 + 1;
                        if (i12 >= i11 || charSequence.charAt(i12) != ' ') {
                            break;
                        }
                        sb2.append("&nbsp;");
                        i10 = i12;
                    }
                    sb2.append(' ');
                } else {
                    sb2.append(cCharAt);
                }
                i10++;
            }
        }

        @androidx.annotation.p0
        public ComponentName b() {
            return this.f20349d;
        }

        @androidx.annotation.p0
        public Drawable c() {
            if (this.f20349d == null) {
                return null;
            }
            try {
                return this.f20346a.getPackageManager().getActivityIcon(this.f20349d);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f20345f, "Could not retrieve icon for calling activity", e10);
                return null;
            }
        }

        @androidx.annotation.p0
        public Drawable d() {
            if (this.f20348c == null) {
                return null;
            }
            try {
                return this.f20346a.getPackageManager().getApplicationIcon(this.f20348c);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f20345f, "Could not retrieve icon for calling application", e10);
                return null;
            }
        }

        @androidx.annotation.p0
        public CharSequence e() {
            if (this.f20348c == null) {
                return null;
            }
            PackageManager packageManager = this.f20346a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f20348c, 0));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e(f20345f, "Could not retrieve label for calling application", e10);
                return null;
            }
        }

        @androidx.annotation.p0
        public String f() {
            return this.f20348c;
        }

        @androidx.annotation.p0
        public String[] g() {
            return this.f20347b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @androidx.annotation.p0
        public String[] h() {
            return this.f20347b.getStringArrayExtra("android.intent.extra.CC");
        }

        @androidx.annotation.p0
        public String[] i() {
            return this.f20347b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @androidx.annotation.p0
        public String j() {
            String stringExtra = this.f20347b.getStringExtra(androidx.core.content.m.f20447b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceO = o();
            if (charSequenceO instanceof Spanned) {
                return Html.toHtml((Spanned) charSequenceO);
            }
            return charSequenceO != null ? a.a(charSequenceO) : stringExtra;
        }

        @androidx.annotation.p0
        public Uri k() {
            return (Uri) this.f20347b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @androidx.annotation.p0
        public Uri l(int i10) {
            if (this.f20350e == null && q()) {
                this.f20350e = this.f20347b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f20350e;
            if (arrayList != null) {
                return arrayList.get(i10);
            }
            if (i10 == 0) {
                return (Uri) this.f20347b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i10);
        }

        public int m() {
            if (this.f20350e == null && q()) {
                this.f20350e = this.f20347b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f20350e;
            return arrayList != null ? arrayList.size() : this.f20347b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @androidx.annotation.p0
        public String n() {
            return this.f20347b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @androidx.annotation.p0
        public CharSequence o() {
            return this.f20347b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @androidx.annotation.p0
        public String p() {
            return this.f20347b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f20347b.getAction());
        }

        public boolean r() {
            String action = this.f20347b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f20347b.getAction());
        }
    }

    private o3() {
    }

    @Deprecated
    public static void a(@androidx.annotation.n0 Menu menu, @androidx.annotation.d0 int i10, @androidx.annotation.n0 b bVar) {
        MenuItem menuItemFindItem = menu.findItem(i10);
        if (menuItemFindItem != null) {
            b(menuItemFindItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i10 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@androidx.annotation.n0 MenuItem menuItem, @androidx.annotation.n0 b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f20337e + bVar.l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @androidx.annotation.p0
    public static ComponentName c(@androidx.annotation.n0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @androidx.annotation.p0
    static ComponentName d(@androidx.annotation.n0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f20335c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f20336d) : componentName;
    }

    @androidx.annotation.p0
    public static String e(@androidx.annotation.n0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @androidx.annotation.p0
    static String f(@androidx.annotation.n0 Intent intent) {
        String stringExtra = intent.getStringExtra(f20333a);
        return stringExtra == null ? intent.getStringExtra(f20334b) : stringExtra;
    }
}
