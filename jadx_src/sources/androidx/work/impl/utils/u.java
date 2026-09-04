package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: RawQueries.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "RawQueries")
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Landroidx/work/x;", "Lj3/j;", "b", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "Lkotlin/b2;", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class u {
    private static final void a(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb2.append(CollectionsKt___CollectionsKt.h3(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null));
    }

    @dl.d
    public static final j3.j b(@dl.d androidx.work.x xVar) {
        kotlin.jvm.internal.f0.p(xVar, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<WorkInfo.State> states = xVar.j();
        kotlin.jvm.internal.f0.o(states, "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!states.isEmpty()) {
            List<WorkInfo.State> states2 = xVar.j();
            kotlin.jvm.internal.f0.o(states2, "states");
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(states2, 10));
            for (WorkInfo.State state : states2) {
                kotlin.jvm.internal.f0.m(state);
                arrayList2.add(Integer.valueOf(androidx.work.impl.model.b0.j(state)));
            }
            sb2.append(" WHERE state IN (");
            a(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> ids = xVar.i();
        kotlin.jvm.internal.f0.o(ids, "ids");
        if (!ids.isEmpty()) {
            List<UUID> ids2 = xVar.i();
            kotlin.jvm.internal.f0.o(ids2, "ids");
            ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(ids2, 10));
            Iterator<T> it = ids2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            a(sb2, xVar.i().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> tags = xVar.k();
        kotlin.jvm.internal.f0.o(tags, "tags");
        if (!tags.isEmpty()) {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, xVar.k().size());
            sb2.append("))");
            List<String> tags2 = xVar.k();
            kotlin.jvm.internal.f0.o(tags2, "tags");
            arrayList.addAll(tags2);
        } else {
            str = str2;
        }
        List<String> uniqueWorkNames = xVar.l();
        kotlin.jvm.internal.f0.o(uniqueWorkNames, "uniqueWorkNames");
        if (!uniqueWorkNames.isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, xVar.l().size());
            sb2.append("))");
            List<String> uniqueWorkNames2 = xVar.l();
            kotlin.jvm.internal.f0.o(uniqueWorkNames2, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames2);
        }
        sb2.append(";");
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "builder.toString()");
        return new j3.b(string, arrayList.toArray(new Object[0]));
    }
}
