package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import kotlin.b2;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: NavInflater.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,365:1\n1#2:366\n232#3,3:367\n232#3,3:370\n232#3,3:373\n232#3,3:376\n55#4,6:379\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n110#1:367,3\n128#1:370,3\n144#1:373,3\n261#1:376,3\n295#1:379,6\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f25146d = "argument";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String f25147e = "deepLink";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String f25148f = "action";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final String f25149g = "include";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f25150h = "${applicationId}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f25152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q0 f25153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f25145c = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final ThreadLocal<TypedValue> f25151i = new ThreadLocal<>();

    /* JADX INFO: compiled from: NavInflater.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final m0<?> a(@dl.d TypedValue value, @dl.e m0<?> m0Var, @dl.d m0<?> expectedNavType, @dl.e String str, @dl.d String foundType) throws XmlPullParserException {
            kotlin.jvm.internal.f0.p(value, "value");
            kotlin.jvm.internal.f0.p(expectedNavType, "expectedNavType");
            kotlin.jvm.internal.f0.p(foundType, "foundType");
            if (m0Var == null || m0Var == expectedNavType) {
                return m0Var == null ? expectedNavType : m0Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }
    }

    public i0(@dl.d Context context, @dl.d q0 navigatorProvider) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(navigatorProvider, "navigatorProvider");
        this.f25152a = context;
        this.f25153b = navigatorProvider;
    }

    private final NavDestination a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        q0 q0Var = this.f25153b;
        String name = xmlResourceParser.getName();
        kotlin.jvm.internal.f0.o(name, "parser.name");
        NavDestination navDestinationA = q0Var.f(name).a();
        navDestinationA.R(this.f25152a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (kotlin.jvm.internal.f0.g(f25146d, name2)) {
                    f(resources, navDestinationA, attributeSet, i10);
                } else if (kotlin.jvm.internal.f0.g(f25147e, name2)) {
                    g(resources, navDestinationA, attributeSet);
                } else if (kotlin.jvm.internal.f0.g("action", name2)) {
                    c(resources, navDestinationA, attributeSet, xmlResourceParser, i10);
                } else if (kotlin.jvm.internal.f0.g(f25149g, name2) && (navDestinationA instanceof NavGraph)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.f24956c);
                    kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((NavGraph) navDestinationA).k0(b(typedArrayObtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    b2 b2Var = b2.f124493a;
                    typedArrayObtainAttributes.recycle();
                } else if (navDestinationA instanceof NavGraph) {
                    ((NavGraph) navDestinationA).k0(a(resources, xmlResourceParser, attributeSet, i10));
                }
            }
        }
        return navDestinationA;
    }

    private final void c(Resources resources, NavDestination navDestination, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.f25152a;
        int[] NavAction = androidx.navigation.common.R.styleable.f24965a;
        kotlin.jvm.internal.f0.o(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_android_id, 0);
        k kVar = new k(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_destination, 0), null, null, 6, null);
        j0.a aVar = new j0.a();
        aVar.d(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_launchSingleTop, false));
        aVar.u(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_restoreState, false));
        aVar.h(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R.styleable.NavAction_popUpToSaveState, false));
        aVar.b(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_enterAnim, -1));
        aVar.c(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_exitAnim, -1));
        aVar.e(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popEnterAnim, -1));
        aVar.f(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R.styleable.NavAction_popExitAnim, -1));
        kVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && kotlin.jvm.internal.f0.g(f25146d, xmlResourceParser.getName())) {
                e(resources, bundle, attributeSet, i10);
            }
        }
        if (!bundle.isEmpty()) {
            kVar.d(bundle);
        }
        navDestination.W(resourceId, kVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final p d(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        p.a aVar = new p.a();
        int i11 = 0;
        aVar.c(typedArray.getBoolean(androidx.navigation.common.R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = f25151i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.common.R.styleable.NavArgument_argType);
        Object objO = null;
        m0<Object> m0VarA = string != null ? m0.f25184c.a(string, resources.getResourcePackageName(i10)) : null;
        int i12 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i12, typedValue)) {
            m0<Object> m0Var = m0.f25186e;
            if (m0VarA == m0Var) {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    i11 = i13;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m0VarA.c() + ". Must be a reference to a resource.");
                }
                objO = Integer.valueOf(i11);
            } else {
                int i14 = typedValue.resourceId;
                if (i14 != 0) {
                    if (m0VarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + m0VarA.c() + ". You must use a \"" + m0Var.c() + "\" type to reference other resources.");
                    }
                    m0VarA = m0Var;
                    objO = Integer.valueOf(i14);
                } else if (m0VarA == m0.f25198q) {
                    objO = typedArray.getString(i12);
                } else {
                    int i15 = typedValue.type;
                    if (i15 == 3) {
                        String string2 = typedValue.string.toString();
                        if (m0VarA == null) {
                            m0VarA = m0.f25184c.b(string2);
                        }
                        objO = m0VarA.o(string2);
                    } else if (i15 == 4) {
                        m0VarA = f25145c.a(typedValue, m0VarA, m0.f25192k, string, "float");
                        objO = Float.valueOf(typedValue.getFloat());
                    } else if (i15 == 5) {
                        m0VarA = f25145c.a(typedValue, m0VarA, m0.f25185d, string, androidx.constraintlayout.core.motion.utils.w.b.f17897g);
                        objO = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i15 == 18) {
                        m0VarA = f25145c.a(typedValue, m0VarA, m0.f25195n, string, "boolean");
                        objO = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i15 < 16 || i15 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        m0<Object> m0Var2 = m0.f25192k;
                        if (m0VarA == m0Var2) {
                            m0VarA = f25145c.a(typedValue, m0VarA, m0Var2, string, "float");
                            objO = Float.valueOf(typedValue.data);
                        } else {
                            m0VarA = f25145c.a(typedValue, m0VarA, m0.f25185d, string, androidx.constraintlayout.core.motion.utils.w.b.f17892b);
                            objO = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objO != null) {
            aVar.b(objO);
        }
        if (m0VarA != null) {
            aVar.d(m0VarA);
        }
        return aVar.a();
    }

    private final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.f24966b);
        kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        kotlin.jvm.internal.f0.o(string, "array.getString(R.stylea…uments must have a name\")");
        p pVarD = d(typedArrayObtainAttributes, resources, i10);
        if (pVarD.c()) {
            pVarD.f(string, bundle);
        }
        b2 b2Var = b2.f124493a;
        typedArrayObtainAttributes.recycle();
    }

    private final void f(Resources resources, NavDestination navDestination, AttributeSet attributeSet, int i10) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.f24966b);
        kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        kotlin.jvm.internal.f0.o(string, "array.getString(R.stylea…uments must have a name\")");
        navDestination.e(string, d(typedArrayObtainAttributes, resources, i10));
        b2 b2Var = b2.f124493a;
        typedArrayObtainAttributes.recycle();
    }

    private final void g(Resources resources, NavDestination navDestination, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R.styleable.f24967c);
        kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.NavDeepLink_mimeType);
        if (string == null || string.length() == 0) {
            if (string2 == null || string2.length() == 0) {
                if (string3 == null || string3.length() == 0) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.a aVar = new NavDeepLink.a();
        if (string != null) {
            String packageName = this.f25152a.getPackageName();
            kotlin.jvm.internal.f0.o(packageName, "context.packageName");
            aVar.g(kotlin.text.u.l2(string, f25150h, packageName, false, 4, null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.f25152a.getPackageName();
            kotlin.jvm.internal.f0.o(packageName2, "context.packageName");
            aVar.e(kotlin.text.u.l2(string2, f25150h, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f25152a.getPackageName();
            kotlin.jvm.internal.f0.o(packageName3, "context.packageName");
            aVar.f(kotlin.text.u.l2(string3, f25150h, packageName3, false, 4, null));
        }
        navDestination.g(aVar.a());
        b2 b2Var = b2.f124493a;
        typedArrayObtainAttributes.recycle();
    }

    @dl.d
    @SuppressLint({"ResourceType"})
    public final NavGraph b(@androidx.annotation.m0 int i10) {
        int next;
        Resources res = this.f25152a.getResources();
        XmlResourceParser xml = res.getXml(i10);
        kotlin.jvm.internal.f0.o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        kotlin.jvm.internal.f0.o(res, "res");
        kotlin.jvm.internal.f0.o(attrs, "attrs");
        NavDestination navDestinationA = a(res, xml, attrs, i10);
        if (navDestinationA instanceof NavGraph) {
            NavGraph navGraph = (NavGraph) navDestinationA;
            xml.close();
            return navGraph;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
