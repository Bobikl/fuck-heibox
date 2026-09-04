package com.tencent.beacon.a.d;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DBConst.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f98833a;

    static {
        ArrayList arrayList = new ArrayList();
        f98833a = arrayList;
        arrayList.add("CREATE TABLE t_r_e ( _id INTEGER PRIMARY KEY AUTOINCREMENT, _appKey text ,_time int ,_length int ,_data  blob)");
        arrayList.add("CREATE TABLE t_n_e ( _id INTEGER PRIMARY KEY AUTOINCREMENT, _appKey text ,_time int ,_length int ,_data  blob)");
    }
}
