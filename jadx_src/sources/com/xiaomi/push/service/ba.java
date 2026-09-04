package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.it;
import com.xiaomi.push.iu;
import com.xiaomi.push.iw;
import com.xiaomi.push.iy;
import com.xiaomi.push.jk;
import com.xiaomi.push.jl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ba {
    public static int a(az azVar, it itVar) {
        return azVar.a(itVar, bb.f107905a[itVar.ordinal()] != 1 ? 0 : 1);
    }

    private static List<Pair<Integer, Object>> a(List<iy> list, boolean z10) {
        Pair pair;
        if (com.xiaomi.push.ac.a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (iy iyVar : list) {
            int iA = iyVar.a();
            iu iuVarA = iu.a(iyVar.b());
            if (iuVarA != null) {
                if (z10 && iyVar.f629a) {
                    arrayList.add(new Pair(Integer.valueOf(iA), null));
                } else {
                    int i10 = bb.f107906b[iuVarA.ordinal()];
                    if (i10 == 1) {
                        pair = new Pair(Integer.valueOf(iA), Integer.valueOf(iyVar.c()));
                    } else if (i10 == 2) {
                        pair = new Pair(Integer.valueOf(iA), Long.valueOf(iyVar.m504a()));
                    } else if (i10 != 3) {
                        pair = i10 != 4 ? null : new Pair(Integer.valueOf(iA), Boolean.valueOf(iyVar.g()));
                    } else {
                        pair = new Pair(Integer.valueOf(iA), iyVar.m505a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }

    public static void a(az azVar, jk jkVar) {
        com.xiaomi.channel.commonutils.logger.b.b("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", azVar, ", configMessage=", jkVar);
        azVar.a(a(jkVar.a(), true));
        azVar.b();
    }

    public static void a(az azVar, jl jlVar) {
        com.xiaomi.channel.commonutils.logger.b.b("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", azVar, ", configMessage=", jlVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (iw iwVar : jlVar.a()) {
            arrayList.add(new Pair<>(iwVar.m500a(), Integer.valueOf(iwVar.a())));
            List<Pair<Integer, Object>> listA = a(iwVar.f621a, false);
            if (!com.xiaomi.push.ac.a(listA)) {
                arrayList2.addAll(listA);
            }
        }
        azVar.a(arrayList, arrayList2);
        azVar.b();
    }
}
