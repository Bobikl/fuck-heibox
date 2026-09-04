package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: ActivityNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,499:1\n179#2,2:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n45#1:500,2\n*E\n"})
@Navigator.b(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)
public class ActivityNavigator extends Navigator<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f24706e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f24707f = "android-support-navigation:ActivityNavigator:source";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f24708g = "android-support-navigation:ActivityNavigator:current";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final String f24709h = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f24710i = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f24711j = "ActivityNavigator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f24712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final Activity f24713d;

    /* JADX INFO: compiled from: ActivityNavigator.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public final void a(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(ActivityNavigator.f24709h, -1);
            int intExtra2 = intent.getIntExtra(ActivityNavigator.f24710i, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }
    }

    /* JADX INFO: compiled from: ActivityNavigator.kt */
    @kotlin.jvm.internal.t0({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,499:1\n232#2,3:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n256#1:500,3\n*E\n"})
    @NavDestination.a(Activity.class)
    public static class b extends NavDestination {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private Intent f24714n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.e
        private String f24715o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @dl.e
        private String f24716p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @dl.e
        private ComponentName f24717q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @dl.e
        private String f24718r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @dl.e
        private Uri f24719s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d Navigator<? extends b> activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.f0.p(activityNavigator, "activityNavigator");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@dl.d q0 navigatorProvider) {
            this((Navigator<? extends b>) navigatorProvider.e(ActivityNavigator.class));
            kotlin.jvm.internal.f0.p(navigatorProvider, "navigatorProvider");
        }

        private final String s0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            kotlin.jvm.internal.f0.o(packageName, "context.packageName");
            return kotlin.text.u.l2(str, i0.f25150h, packageName, false, 4, null);
        }

        @dl.d
        public final b A0(@dl.e String str) {
            if (this.f24714n == null) {
                this.f24714n = new Intent();
            }
            Intent intent = this.f24714n;
            kotlin.jvm.internal.f0.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.i
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(attrs, "attrs");
            super.R(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.f24954a);
            kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            A0(s0(context, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                u0(new ComponentName(context, string));
            }
            t0(typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String strS0 = s0(context, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (strS0 != null) {
                v0(Uri.parse(strS0));
            }
            w0(s0(context, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            if (super.equals(obj)) {
                Intent intent = this.f24714n;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) obj).f24714n);
                } else {
                    zFilterEquals = ((b) obj).f24714n == null;
                }
                if (zFilterEquals && kotlin.jvm.internal.f0.g(this.f24715o, ((b) obj).f24715o)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public boolean h0() {
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f24714n;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f24715o;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @dl.e
        public final String i0() {
            Intent intent = this.f24714n;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @dl.e
        public final ComponentName k0() {
            Intent intent = this.f24714n;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @dl.e
        public final Uri l0() {
            Intent intent = this.f24714n;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @dl.e
        public final String n0() {
            return this.f24715o;
        }

        @dl.e
        public final Intent q0() {
            return this.f24714n;
        }

        @dl.e
        public final String r0() {
            Intent intent = this.f24714n;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        @dl.d
        public final b t0(@dl.e String str) {
            if (this.f24714n == null) {
                this.f24714n = new Intent();
            }
            Intent intent = this.f24714n;
            kotlin.jvm.internal.f0.m(intent);
            intent.setAction(str);
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @dl.d
        public String toString() {
            ComponentName componentNameK0 = k0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameK0 != null) {
                sb2.append(" class=");
                sb2.append(componentNameK0.getClassName());
            } else {
                String strI0 = i0();
                if (strI0 != null) {
                    sb2.append(" action=");
                    sb2.append(strI0);
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "sb.toString()");
            return string;
        }

        @dl.d
        public final b u0(@dl.e ComponentName componentName) {
            if (this.f24714n == null) {
                this.f24714n = new Intent();
            }
            Intent intent = this.f24714n;
            kotlin.jvm.internal.f0.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @dl.d
        public final b v0(@dl.e Uri uri) {
            if (this.f24714n == null) {
                this.f24714n = new Intent();
            }
            Intent intent = this.f24714n;
            kotlin.jvm.internal.f0.m(intent);
            intent.setData(uri);
            return this;
        }

        @dl.d
        public final b w0(@dl.e String str) {
            this.f24715o = str;
            return this;
        }

        @dl.d
        public final b y0(@dl.e Intent intent) {
            this.f24714n = intent;
            return this;
        }
    }

    /* JADX INFO: compiled from: ActivityNavigator.kt */
    public static final class c implements Navigator.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final androidx.core.app.i f24721b;

        /* JADX INFO: compiled from: ActivityNavigator.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f24722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.e
            private androidx.core.app.i f24723b;

            @dl.d
            public final a a(int i10) {
                this.f24722a = i10 | this.f24722a;
                return this;
            }

            @dl.d
            public final c b() {
                return new c(this.f24722a, this.f24723b);
            }

            @dl.d
            public final a c(@dl.d androidx.core.app.i activityOptions) {
                kotlin.jvm.internal.f0.p(activityOptions, "activityOptions");
                this.f24723b = activityOptions;
                return this;
            }
        }

        public c(int i10, @dl.e androidx.core.app.i iVar) {
            this.f24720a = i10;
            this.f24721b = iVar;
        }

        @dl.e
        public final androidx.core.app.i a() {
            return this.f24721b;
        }

        public final int b() {
            return this.f24720a;
        }
    }

    public ActivityNavigator(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24712c = context;
        for (Object obj : SequencesKt__SequencesKt.l(context, new yh.l<Context, Context>() { // from class: androidx.navigation.ActivityNavigator$hostActivity$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context it) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f24713d = (Activity) obj;
            }
        }
        obj = null;
        this.f24713d = (Activity) obj;
    }

    @xh.m
    public static final void l(@dl.d Activity activity) {
        f24706e.a(activity);
    }

    @Override // androidx.navigation.Navigator
    public boolean k() {
        Activity activity = this.f24713d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context n() {
        return this.f24712c;
    }

    @Override // androidx.navigation.Navigator
    @dl.e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public NavDestination d(@dl.d b destination, @dl.e Bundle bundle, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        androidx.core.app.i iVarA;
        Intent intent;
        int intExtra;
        kotlin.jvm.internal.f0.p(destination, "destination");
        if (destination.q0() == null) {
            throw new IllegalStateException(("Destination " + destination.A() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.q0());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strN0 = destination.n0();
            if (!(strN0 == null || strN0.length() == 0)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strN0);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strN0);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar instanceof c;
        if (z10) {
            intent2.addFlags(((c) aVar).b());
        }
        if (this.f24713d == null) {
            intent2.addFlags(268435456);
        }
        if (j0Var != null && j0Var.k()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f24713d;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f24708g, 0)) != 0) {
            intent2.putExtra(f24707f, intExtra);
        }
        intent2.putExtra(f24708g, destination.A());
        Resources resources = this.f24712c.getResources();
        if (j0Var != null) {
            int iC = j0Var.c();
            int iD = j0Var.d();
            if ((iC <= 0 || !kotlin.jvm.internal.f0.g(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !kotlin.jvm.internal.f0.g(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra(f24709h, iC);
                intent2.putExtra(f24710i, iD);
            } else {
                Log.w(f24711j, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + " when launching " + destination);
            }
        }
        if (!z10 || (iVarA = ((c) aVar).a()) == null) {
            this.f24712c.startActivity(intent2);
        } else {
            androidx.core.content.d.w(this.f24712c, intent2, iVarA.l());
        }
        if (j0Var == null || this.f24713d == null) {
            return null;
        }
        int iA = j0Var.a();
        int iB = j0Var.b();
        if ((iA <= 0 || !kotlin.jvm.internal.f0.g(resources.getResourceTypeName(iA), "animator")) && (iB <= 0 || !kotlin.jvm.internal.f0.g(resources.getResourceTypeName(iB), "animator"))) {
            if (iA < 0 && iB < 0) {
                return null;
            }
            this.f24713d.overridePendingTransition(fi.u.u(iA, 0), fi.u.u(iB, 0));
            return null;
        }
        Log.w(f24711j, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + destination);
        return null;
    }
}
