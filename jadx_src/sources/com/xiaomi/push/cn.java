package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class cn extends cr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f106917a;

    public cn(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f106917a = str3;
    }

    public static cn a(String str) {
        return new cn(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
