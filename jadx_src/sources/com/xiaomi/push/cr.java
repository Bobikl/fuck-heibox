package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile cr f106919a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f242a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private cq f243a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final HashMap<String, cp> f245a = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ThreadPoolExecutor f246a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ArrayList<a> f244a = new ArrayList<>();

    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private a f248a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f249a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private WeakReference<Context> f250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f106921b;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        protected cp f247a = null;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private Random f251a = new Random();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f106920a = 0;

        public a(String str) {
            this.f249a = str;
        }

        public SQLiteDatabase a() {
            return this.f247a.getWritableDatabase();
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public Object mo226a() {
            return null;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public String m227a() {
            return this.f249a;
        }

        void a(Context context) {
            a aVar = this.f248a;
            if (aVar != null) {
                aVar.a(context, mo226a());
            }
            b(context);
        }

        public abstract void a(Context context, SQLiteDatabase sQLiteDatabase);

        public void a(Context context, Object obj) {
            cr.a(context).a(this);
        }

        void a(cp cpVar, Context context) {
            this.f247a = cpVar;
            this.f106921b = cpVar.a();
            this.f250a = new WeakReference<>(context);
        }

        public void a(a aVar) {
            this.f248a = aVar;
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m228a() {
            return this.f247a == null || TextUtils.isEmpty(this.f106921b) || this.f250a == null;
        }

        public void b(Context context) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f250a;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f247a == null || TextUtils.isEmpty(this.f249a)) {
                return;
            }
            File file = new File(this.f249a);
            u.a(context, new File(file.getParentFile(), bo.b(file.getAbsolutePath())), new ct(this, context));
        }
    }

    public static abstract class b<T> extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f106922a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f252a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private List<String> f253a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String[] f254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<T> f106923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f106924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f106925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f106926e;

        public b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i10) {
            super(str);
            this.f106923b = new ArrayList();
            this.f253a = list;
            this.f252a = str2;
            this.f254a = strArr;
            this.f106924c = str3;
            this.f106925d = str4;
            this.f106926e = str5;
            this.f106922a = i10;
        }

        @Override // com.xiaomi.push.cr.a
        public SQLiteDatabase a() {
            return ((a) this).f247a.getReadableDatabase();
        }

        public abstract T a(Context context, Cursor cursor);

        @Override // com.xiaomi.push.cr.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f106923b.clear();
            List<String> list = this.f253a;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f253a.size()];
                this.f253a.toArray(strArr2);
                strArr = strArr2;
            }
            int i10 = this.f106922a;
            Cursor cursorQuery = sQLiteDatabase.query(super.f106921b, strArr, this.f252a, this.f254a, this.f106924c, this.f106925d, this.f106926e, i10 > 0 ? String.valueOf(i10) : null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    T tA = a(context, cursorQuery);
                    if (tA != null) {
                        this.f106923b.add(tA);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            a(context, (List) this.f106923b);
        }

        public abstract void a(Context context, List<T> list);
    }

    public static class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<a> f106927a;

        public c(String str, ArrayList<a> arrayList) {
            super(str);
            ArrayList<a> arrayList2 = new ArrayList<>();
            this.f106927a = arrayList2;
            arrayList2.addAll(arrayList);
        }

        @Override // com.xiaomi.push.cr.a
        public final void a(Context context) {
            super.a(context);
            for (a aVar : this.f106927a) {
                if (aVar != null) {
                    aVar.a(context);
                }
            }
        }

        @Override // com.xiaomi.push.cr.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            for (a aVar : this.f106927a) {
                if (aVar != null) {
                    aVar.a(context, sQLiteDatabase);
                }
            }
        }
    }

    public static class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f106928a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        protected String[] f255a;

        public d(String str, String str2, String[] strArr) {
            super(str);
            this.f106928a = str2;
            this.f255a = strArr;
        }

        @Override // com.xiaomi.push.cr.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f106921b, this.f106928a, this.f255a);
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ContentValues f106929a;

        public e(String str, ContentValues contentValues) {
            super(str);
            this.f106929a = contentValues;
        }

        @Override // com.xiaomi.push.cr.a
        public void a(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f106921b, null, this.f106929a);
        }
    }

    private cr(Context context) {
        this.f242a = context;
    }

    private cp a(String str) {
        cp cpVarA = this.f245a.get(str);
        if (cpVarA == null) {
            synchronized (this.f245a) {
                if (cpVarA == null) {
                    cpVarA = this.f243a.a(this.f242a, str);
                    this.f245a.put(str, cpVarA);
                }
            }
        }
        return cpVarA;
    }

    public static cr a(Context context) {
        if (f106919a == null) {
            synchronized (cr.class) {
                if (f106919a == null) {
                    f106919a = new cr(context);
                }
            }
        }
        return f106919a;
    }

    private void a() {
        ah.a(this.f242a).b(new cs(this), com.xiaomi.push.service.az.a(this.f242a).a(is.StatDataProcessFrequency.a(), 5));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m225a(String str) {
        return a(str).a();
    }

    public void a(a aVar) {
        cp cpVarA;
        if (aVar == null) {
            return;
        }
        if (this.f243a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String strM227a = aVar.m227a();
        synchronized (this.f245a) {
            cpVarA = this.f245a.get(strM227a);
            if (cpVarA == null) {
                cpVarA = this.f243a.a(this.f242a, strM227a);
                this.f245a.put(strM227a, cpVarA);
            }
        }
        if (this.f246a.isShutdown()) {
            return;
        }
        aVar.a(cpVarA, this.f242a);
        synchronized (this.f244a) {
            this.f244a.add(aVar);
            a();
        }
    }

    public void a(Runnable runnable) {
        if (this.f246a.isShutdown()) {
            return;
        }
        this.f246a.execute(runnable);
    }

    public void a(ArrayList<a> arrayList) {
        if (this.f243a == null) {
            throw new IllegalStateException("should exec setDbHelperFactory method first!");
        }
        HashMap map = new HashMap();
        if (this.f246a.isShutdown()) {
            return;
        }
        for (a aVar : arrayList) {
            if (aVar.m228a()) {
                aVar.a(a(aVar.m227a()), this.f242a);
            }
            ArrayList arrayList2 = (ArrayList) map.get(aVar.m227a());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(aVar.m227a(), arrayList2);
            }
            arrayList2.add(aVar);
        }
        for (String str : map.keySet()) {
            ArrayList arrayList3 = (ArrayList) map.get(str);
            if (arrayList3 != null && arrayList3.size() > 0) {
                c cVar = new c(str, arrayList3);
                cVar.a(((a) arrayList3.get(0)).f247a, this.f242a);
                this.f246a.execute(cVar);
            }
        }
    }

    public void b(a aVar) {
        cp cpVarA;
        if (aVar == null) {
            return;
        }
        if (this.f243a == null) {
            throw new IllegalStateException("should exec init method first!");
        }
        String strM227a = aVar.m227a();
        synchronized (this.f245a) {
            cpVarA = this.f245a.get(strM227a);
            if (cpVarA == null) {
                cpVarA = this.f243a.a(this.f242a, strM227a);
                this.f245a.put(strM227a, cpVarA);
            }
        }
        if (this.f246a.isShutdown()) {
            return;
        }
        aVar.a(cpVarA, this.f242a);
        a((Runnable) aVar);
    }
}
