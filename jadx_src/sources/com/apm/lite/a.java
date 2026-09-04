package com.apm.lite;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f39828a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f39829b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f39830c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ICrashFilter f39831d = null;

    public List<AttachUserData> a(CrashType crashType) {
        return this.f39828a.get(crashType);
    }

    public Map<String, String> b() {
        return this.f39830c;
    }

    public ICrashFilter c() {
        return this.f39831d;
    }

    public List<AttachUserData> d(CrashType crashType) {
        return this.f39829b.get(crashType);
    }
}
