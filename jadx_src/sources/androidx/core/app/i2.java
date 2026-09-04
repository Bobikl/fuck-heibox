package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.igexin.assist.sdk.AssistPushConsts;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: NotificationCompatJellybean.java */
/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(16)
public class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f19973a = "NotificationCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f19974b = "android.support.dataRemoteInputs";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f19975c = "android.support.allowGeneratedReplies";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f19976d = "icon";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f19977e = "title";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f19978f = "actionIntent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f19979g = "extras";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f19980h = "remoteInputs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f19981i = "dataOnlyRemoteInputs";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f19982j = "resultKey";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f19983k = "label";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f19984l = "choices";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f19985m = "allowFreeFormInput";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f19986n = "allowedDataTypes";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f19987o = "semanticAction";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f19988p = "showsUserInterface";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Field f19990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f19991s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Field f19993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Field f19994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Field f19995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Field f19996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f19997y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f19989q = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f19992t = new Object();

    private i2() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (f19997y) {
            return false;
        }
        try {
            if (f19993u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f19994v = cls.getDeclaredField("icon");
                f19995w = cls.getDeclaredField("title");
                f19996x = cls.getDeclaredField(f19978f);
                Field declaredField = Notification.class.getDeclaredField(AssistPushConsts.MSG_TYPE_ACTIONS);
                f19993u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e10) {
            Log.e(f19973a, "Unable to access notification actions", e10);
            f19997y = true;
        } catch (NoSuchFieldException e11) {
            Log.e(f19973a, "Unable to access notification actions", e11);
            f19997y = true;
        }
        return !f19997y;
    }

    private static e3 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f19986n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new e3(bundle.getString(f19982j), bundle.getCharSequence("label"), bundle.getCharSequenceArray(f19984l), bundle.getBoolean(f19985m), 0, bundle.getBundle(f19979g), hashSet);
    }

    private static e3[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        e3[] e3VarArr = new e3[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            e3VarArr[i10] = c(bundleArr[i10]);
        }
        return e3VarArr;
    }

    public static o0.b e(Notification notification, int i10) {
        SparseArray sparseParcelableArray;
        synchronized (f19992t) {
            try {
                try {
                    Object[] objArrH = h(notification);
                    if (objArrH != null) {
                        Object obj = objArrH[i10];
                        Bundle bundleK = k(notification);
                        return l(f19994v.getInt(obj), (CharSequence) f19995w.get(obj), (PendingIntent) f19996x.get(obj), (bundleK == null || (sparseParcelableArray = bundleK.getSparseParcelableArray(h2.f19968e)) == null) ? null : (Bundle) sparseParcelableArray.get(i10));
                    }
                } catch (IllegalAccessException e10) {
                    Log.e(f19973a, "Unable to access notification actions", e10);
                    f19997y = true;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f19992t) {
            Object[] objArrH = h(notification);
            length = objArrH != null ? objArrH.length : 0;
        }
        return length;
    }

    static o0.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f19979g);
        return new o0.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable(f19978f), bundle.getBundle(f19979g), d(i(bundle, f19980h)), d(i(bundle, f19981i)), bundle2 != null ? bundle2.getBoolean(f19975c, false) : false, bundle.getInt(f19987o), bundle.getBoolean(f19988p), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (f19992t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f19993u.get(notification);
            } catch (IllegalAccessException e10) {
                Log.e(f19973a, "Unable to access notification actions", e10);
                f19997y = true;
                return null;
            }
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle j(o0.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatF = bVar.f();
        bundle.putInt("icon", iconCompatF != null ? iconCompatF.y() : 0);
        bundle.putCharSequence("title", bVar.j());
        bundle.putParcelable(f19978f, bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean(f19975c, bVar.b());
        bundle.putBundle(f19979g, bundle2);
        bundle.putParcelableArray(f19980h, n(bVar.g()));
        bundle.putBoolean(f19988p, bVar.i());
        bundle.putInt(f19987o, bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f19989q) {
            if (f19991s) {
                return null;
            }
            try {
                if (f19990r == null) {
                    Field declaredField = Notification.class.getDeclaredField(f19979g);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f19973a, "Notification.extras field is not of type Bundle");
                        f19991s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f19990r = declaredField;
                }
                Bundle bundle = (Bundle) f19990r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f19990r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                Log.e(f19973a, "Unable to access notification extras", e10);
                f19991s = true;
                return null;
            } catch (NoSuchFieldException e11) {
                Log.e(f19973a, "Unable to access notification extras", e11);
                f19991s = true;
                return null;
            }
        }
    }

    public static o0.b l(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        e3[] e3VarArrD;
        e3[] e3VarArrD2;
        boolean z10;
        if (bundle != null) {
            e3VarArrD = d(i(bundle, h2.f19969f));
            e3VarArrD2 = d(i(bundle, f19974b));
            z10 = bundle.getBoolean(f19975c);
        } else {
            e3VarArrD = null;
            e3VarArrD2 = null;
            z10 = false;
        }
        return new o0.b(i10, charSequence, pendingIntent, bundle, e3VarArrD, e3VarArrD2, z10, 0, true, false, false);
    }

    private static Bundle m(e3 e3Var) {
        Bundle bundle = new Bundle();
        bundle.putString(f19982j, e3Var.o());
        bundle.putCharSequence("label", e3Var.n());
        bundle.putCharSequenceArray(f19984l, e3Var.h());
        bundle.putBoolean(f19985m, e3Var.f());
        bundle.putBundle(f19979g, e3Var.m());
        Set<String> setG = e3Var.g();
        if (setG != null && !setG.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setG.size());
            Iterator<String> it = setG.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(f19986n, arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(e3[] e3VarArr) {
        if (e3VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[e3VarArr.length];
        for (int i10 = 0; i10 < e3VarArr.length; i10++) {
            bundleArr[i10] = m(e3VarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, o0.b bVar) {
        IconCompat iconCompatF = bVar.f();
        builder.addAction(iconCompatF != null ? iconCompatF.y() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(h2.f19969f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f19974b, n(bVar.c()));
        }
        bundle.putBoolean(f19975c, bVar.b());
        return bundle;
    }
}
