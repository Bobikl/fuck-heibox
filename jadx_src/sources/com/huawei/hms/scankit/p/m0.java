package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CameraZoomData.java */
/* JADX INFO: loaded from: classes7.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f62078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f62080c;

    public m0(int i10, int i11, List<Integer> list) {
        this.f62078a = i10;
        this.f62079b = i11;
        this.f62080c = new ArrayList(list);
    }

    public List<Integer> a() {
        return this.f62080c;
    }

    public int b() {
        return this.f62079b;
    }

    public int c() {
        return this.f62078a;
    }
}
