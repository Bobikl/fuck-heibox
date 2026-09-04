package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.meituan.robust.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: ActivityChooserModel.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends DataSetObservable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final boolean f2702n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f2704p = "historical-records";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f2705q = "historical-record";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f2706r = "activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f2707s = "time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f2708t = "weight";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f2709u = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f2710v = 50;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f2711w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final float f2712x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f2713y = ".xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f2714z = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Context f2718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f2719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f2720f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f2727m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f2703o = b.class.getSimpleName();
    private static final Object A = new Object();
    private static final Map<String, b> B = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2715a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C0018b> f2716b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f2717c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f2721g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2722h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f2723i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2724j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2725k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2726l = false;

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface a {
        void setActivityChooserModel(b bVar);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public static final class C0018b implements Comparable<C0018b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResolveInfo f2728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2729c;

        public C0018b(ResolveInfo resolveInfo) {
            this.f2728b = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0018b c0018b) {
            return Float.floatToIntBits(c0018b.f2729c) - Float.floatToIntBits(this.f2729c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && C0018b.class == obj.getClass() && Float.floatToIntBits(this.f2729c) == Float.floatToIntBits(((C0018b) obj).f2729c);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f2729c) + 31;
        }

        public String toString() {
            return Constants.ARRAY_TYPE + "resolveInfo:" + this.f2728b.toString() + "; weight:" + new BigDecimal(this.f2729c) + "]";
        }
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface c {
        void a(Intent intent, List<C0018b> list, List<e> list2);
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public static final class d implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f2730b = 0.95f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, C0018b> f2731a = new HashMap();

        d() {
        }

        @Override // androidx.appcompat.widget.b.c
        public void a(Intent intent, List<C0018b> list, List<e> list2) {
            Map<ComponentName, C0018b> map = this.f2731a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0018b c0018b = list.get(i10);
                c0018b.f2729c = 0.0f;
                ActivityInfo activityInfo = c0018b.f2728b.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), c0018b);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                C0018b c0018b2 = map.get(eVar.f2732a);
                if (c0018b2 != null) {
                    c0018b2.f2729c += eVar.f2734c * f10;
                    f10 *= f2730b;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f2732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f2734c;

        public e(ComponentName componentName, long j10, float f10) {
            this.f2732a = componentName;
            this.f2733b = j10;
            this.f2734c = f10;
        }

        public e(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f2732a;
            if (componentName == null) {
                if (eVar.f2732a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f2732a)) {
                return false;
            }
            return this.f2733b == eVar.f2733b && Float.floatToIntBits(this.f2734c) == Float.floatToIntBits(eVar.f2734c);
        }

        public int hashCode() {
            ComponentName componentName = this.f2732a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f2733b;
            return ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f2734c);
        }

        public String toString() {
            return Constants.ARRAY_TYPE + "; activity:" + this.f2732a + "; time:" + this.f2733b + "; weight:" + new BigDecimal(this.f2734c) + "]";
        }
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public interface f {
        boolean a(b bVar, Intent intent);
    }

    /* JADX INFO: compiled from: ActivityChooserModel.java */
    public final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        /* JADX WARN: Code duplicated, block: B:43:0x006d A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = b.this.f2718d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, b.f2704p);
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e eVar = (e) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, b.f2705q);
                        xmlSerializerNewSerializer.attribute(null, "activity", eVar.f2732a.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(eVar.f2733b));
                        xmlSerializerNewSerializer.attribute(null, b.f2708t, String.valueOf(eVar.f2734c));
                        xmlSerializerNewSerializer.endTag(null, b.f2705q);
                    }
                    xmlSerializerNewSerializer.endTag(null, b.f2704p);
                    xmlSerializerNewSerializer.endDocument();
                } catch (IOException e10) {
                    Log.e(b.f2703o, "Error writing historical record file: " + b.this.f2719e, e10);
                } catch (IllegalArgumentException e11) {
                    Log.e(b.f2703o, "Error writing historical record file: " + b.this.f2719e, e11);
                } catch (IllegalStateException e12) {
                    Log.e(b.f2703o, "Error writing historical record file: " + b.this.f2719e, e12);
                } finally {
                    b.this.f2723i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                }
                return null;
            } catch (FileNotFoundException e13) {
                Log.e(b.f2703o, "Error writing historical record file: " + str, e13);
                return null;
            }
        }
    }

    private b(Context context, String str) {
        this.f2718d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f2713y)) {
            this.f2719e = str;
            return;
        }
        this.f2719e = str + f2713y;
    }

    private boolean a(e eVar) {
        boolean zAdd = this.f2717c.add(eVar);
        if (zAdd) {
            this.f2725k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    private void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public static b d(Context context, String str) {
        b bVar;
        synchronized (A) {
            Map<String, b> map = B;
            bVar = map.get(str);
            if (bVar == null) {
                bVar = new b(context, str);
                map.put(str, bVar);
            }
        }
        return bVar;
    }

    private boolean l() {
        if (!this.f2726l || this.f2720f == null) {
            return false;
        }
        this.f2726l = false;
        this.f2716b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f2718d.getPackageManager().queryIntentActivities(this.f2720f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2716b.add(new C0018b(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    private void m() {
        if (!this.f2724j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f2725k) {
            this.f2725k = false;
            if (TextUtils.isEmpty(this.f2719e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f2717c), this.f2719e);
        }
    }

    private void n() {
        int size = this.f2717c.size() - this.f2722h;
        if (size <= 0) {
            return;
        }
        this.f2725k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f2717c.remove(0);
        }
    }

    private boolean o() {
        if (!this.f2723i || !this.f2725k || TextUtils.isEmpty(this.f2719e)) {
            return false;
        }
        this.f2723i = false;
        this.f2724j = true;
        p();
        return true;
    }

    private void p() {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f2718d.openFileInput(this.f2719e);
            try {
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                        }
                        if (!f2704p.equals(xmlPullParserNewPullParser.getName())) {
                            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                        }
                        List<e> list = this.f2717c;
                        list.clear();
                        while (true) {
                            int next2 = xmlPullParserNewPullParser.next();
                            if (next2 == 1) {
                                if (fileInputStreamOpenFileInput != null) {
                                    break;
                                } else {
                                    return;
                                }
                            } else if (next2 != 3 && next2 != 4) {
                                if (!f2705q.equals(xmlPullParserNewPullParser.getName())) {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                                list.add(new e(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, f2708t))));
                            }
                        }
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException e10) {
                        Log.e(f2703o, "Error reading historical recrod file: " + this.f2719e, e10);
                        if (fileInputStreamOpenFileInput == null) {
                        }
                    }
                } catch (XmlPullParserException e11) {
                    Log.e(f2703o, "Error reading historical recrod file: " + this.f2719e, e11);
                    if (fileInputStreamOpenFileInput == null) {
                    }
                }
            } catch (Throwable th2) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    private boolean v() {
        if (this.f2721g == null || this.f2720f == null || this.f2716b.isEmpty() || this.f2717c.isEmpty()) {
            return false;
        }
        this.f2721g.a(this.f2720f, this.f2716b, Collections.unmodifiableList(this.f2717c));
        return true;
    }

    public Intent b(int i10) {
        synchronized (this.f2715a) {
            if (this.f2720f == null) {
                return null;
            }
            c();
            ActivityInfo activityInfo = this.f2716b.get(i10).f2728b.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f2720f);
            intent.setComponent(componentName);
            if (this.f2727m != null) {
                if (this.f2727m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f2715a) {
            c();
            resolveInfo = this.f2716b.get(i10).f2728b;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f2715a) {
            c();
            size = this.f2716b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f2715a) {
            c();
            List<C0018b> list = this.f2716b;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (list.get(i10).f2728b == resolveInfo) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f2715a) {
            c();
            if (this.f2716b.isEmpty()) {
                return null;
            }
            return this.f2716b.get(0).f2728b;
        }
    }

    public int i() {
        int i10;
        synchronized (this.f2715a) {
            i10 = this.f2722h;
        }
        return i10;
    }

    public int j() {
        int size;
        synchronized (this.f2715a) {
            c();
            size = this.f2717c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f2715a) {
            intent = this.f2720f;
        }
        return intent;
    }

    public void q(c cVar) {
        synchronized (this.f2715a) {
            if (this.f2721g == cVar) {
                return;
            }
            this.f2721g = cVar;
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void r(int i10) {
        synchronized (this.f2715a) {
            c();
            C0018b c0018b = this.f2716b.get(i10);
            C0018b c0018b2 = this.f2716b.get(0);
            float f10 = c0018b2 != null ? (c0018b2.f2729c - c0018b.f2729c) + 5.0f : 1.0f;
            ActivityInfo activityInfo = c0018b.f2728b.activityInfo;
            a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
        }
    }

    public void s(int i10) {
        synchronized (this.f2715a) {
            if (this.f2722h == i10) {
                return;
            }
            this.f2722h = i10;
            n();
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f2715a) {
            if (this.f2720f == intent) {
                return;
            }
            this.f2720f = intent;
            this.f2726l = true;
            c();
        }
    }

    public void u(f fVar) {
        synchronized (this.f2715a) {
            this.f2727m = fVar;
        }
    }
}
