package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.w1;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: RawWorkInfoDao_Impl.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RoomDatabase f29096a;

    /* JADX INFO: compiled from: RawWorkInfoDao_Impl.java */
    public class a implements Callable<List<u.WorkInfoPojo>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j3.j f29097b;

        a(j3.j jVar) {
            this.f29097b = jVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u.WorkInfoPojo> call() throws Exception {
            WorkInfo.State stateF;
            androidx.work.e eVarM;
            Cursor cursorF = androidx.room.util.b.f(h.this.f29096a, this.f29097b, true, null);
            try {
                int iD = androidx.room.util.a.d(cursorF, "id");
                int iD2 = androidx.room.util.a.d(cursorF, "state");
                int iD3 = androidx.room.util.a.d(cursorF, "output");
                int iD4 = androidx.room.util.a.d(cursorF, "run_attempt_count");
                int iD5 = androidx.room.util.a.d(cursorF, "generation");
                androidx.collection.a aVar = new androidx.collection.a();
                androidx.collection.a aVar2 = new androidx.collection.a();
                while (cursorF.moveToNext()) {
                    String string = cursorF.getString(iD);
                    if (((ArrayList) aVar.get(string)) == null) {
                        aVar.put(string, new ArrayList());
                    }
                    String string2 = cursorF.getString(iD);
                    if (((ArrayList) aVar2.get(string2)) == null) {
                        aVar2.put(string2, new ArrayList());
                    }
                }
                cursorF.moveToPosition(-1);
                h.this.d(aVar);
                h.this.c(aVar2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = (iD == -1 || cursorF.isNull(iD)) ? null : cursorF.getString(iD);
                    if (iD2 == -1) {
                        stateF = null;
                    } else {
                        int i10 = cursorF.getInt(iD2);
                        b0 b0Var = b0.f29060a;
                        stateF = b0.f(i10);
                    }
                    if (iD3 == -1) {
                        eVarM = null;
                    } else {
                        eVarM = androidx.work.e.m(cursorF.isNull(iD3) ? null : cursorF.getBlob(iD3));
                    }
                    int i11 = iD4 == -1 ? 0 : cursorF.getInt(iD4);
                    int i12 = iD5 != -1 ? cursorF.getInt(iD5) : 0;
                    ArrayList arrayList2 = (ArrayList) aVar.get(cursorF.getString(iD));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) aVar2.get(cursorF.getString(iD));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
                }
                return arrayList;
            } finally {
                cursorF.close();
            }
        }
    }

    public h(RoomDatabase roomDatabase) {
        this.f29096a = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(androidx.collection.a<String, ArrayList<androidx.work.e>> aVar) {
        Set<String> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.g(i10), aVar.k(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    c(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                c(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        androidx.room.util.e.a(sbD, size2);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size2 + 0);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                w1VarD.r0(i12);
            } else {
                w1VarD.X(i12, str);
            }
            i12++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f29096a, w1VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<androidx.work.e> arrayList = aVar.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(androidx.work.e.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(androidx.collection.a<String, ArrayList<String>> aVar) {
        Set<String> setKeySet = aVar.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (aVar.size() > 999) {
            androidx.collection.a<String, ArrayList<String>> aVar2 = new androidx.collection.a<>(999);
            int size = aVar.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                aVar2.put(aVar.g(i10), aVar.k(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    d(aVar2);
                    aVar2 = new androidx.collection.a<>(999);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                d(aVar2);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.e.d();
        sbD.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        androidx.room.util.e.a(sbD, size2);
        sbD.append(")");
        w1 w1VarD = w1.d(sbD.toString(), size2 + 0);
        int i12 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                w1VarD.r0(i12);
            } else {
                w1VarD.X(i12, str);
            }
            i12++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f29096a, w1VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<String> arrayList = aVar.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // androidx.work.impl.model.g
    public LiveData<List<u.WorkInfoPojo>> a(j3.j jVar) {
        return this.f29096a.getInvalidationTracker().e(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(jVar));
    }

    @Override // androidx.work.impl.model.g
    public List<u.WorkInfoPojo> b(j3.j jVar) {
        WorkInfo.State stateF;
        androidx.work.e eVarM;
        this.f29096a.d();
        Cursor cursorF = androidx.room.util.b.f(this.f29096a, jVar, true, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "id");
            int iD2 = androidx.room.util.a.d(cursorF, "state");
            int iD3 = androidx.room.util.a.d(cursorF, "output");
            int iD4 = androidx.room.util.a.d(cursorF, "run_attempt_count");
            int iD5 = androidx.room.util.a.d(cursorF, "generation");
            androidx.collection.a<String, ArrayList<String>> aVar = new androidx.collection.a<>();
            androidx.collection.a<String, ArrayList<androidx.work.e>> aVar2 = new androidx.collection.a<>();
            while (cursorF.moveToNext()) {
                String string = cursorF.getString(iD);
                if (aVar.get(string) == null) {
                    aVar.put(string, new ArrayList<>());
                }
                String string2 = cursorF.getString(iD);
                if (aVar2.get(string2) == null) {
                    aVar2.put(string2, new ArrayList<>());
                }
            }
            cursorF.moveToPosition(-1);
            d(aVar);
            c(aVar2);
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String string3 = (iD == -1 || cursorF.isNull(iD)) ? null : cursorF.getString(iD);
                if (iD2 == -1) {
                    stateF = null;
                } else {
                    int i10 = cursorF.getInt(iD2);
                    b0 b0Var = b0.f29060a;
                    stateF = b0.f(i10);
                }
                if (iD3 == -1) {
                    eVarM = null;
                } else {
                    eVarM = androidx.work.e.m(cursorF.isNull(iD3) ? null : cursorF.getBlob(iD3));
                }
                int i11 = iD4 == -1 ? 0 : cursorF.getInt(iD4);
                int i12 = iD5 != -1 ? cursorF.getInt(iD5) : 0;
                ArrayList<String> arrayList2 = aVar.get(cursorF.getString(iD));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<String> arrayList3 = arrayList2;
                ArrayList<androidx.work.e> arrayList4 = aVar2.get(cursorF.getString(iD));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                }
                arrayList.add(new u.WorkInfoPojo(string3, stateF, eVarM, i11, i12, arrayList3, arrayList4));
            }
            return arrayList;
        } finally {
            cursorF.close();
        }
    }
}
