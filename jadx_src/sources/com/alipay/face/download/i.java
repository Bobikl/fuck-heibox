package com.alipay.face.download;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;

/* JADX INFO: compiled from: BioRuntimeDependency.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<c> f38760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<d> f38761b;

    public static i a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (i) JSON.parseObject(str, i.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public ArrayList<c> b() {
        if (this.f38760a == null) {
            this.f38760a = new ArrayList<>();
        }
        return this.f38760a;
    }

    public ArrayList<d> c() {
        if (this.f38761b == null) {
            this.f38761b = new ArrayList<>();
        }
        return this.f38761b;
    }

    public void d(ArrayList<c> arrayList) {
        this.f38760a = arrayList;
    }

    public void e(ArrayList<d> arrayList) {
        this.f38761b = arrayList;
    }
}
