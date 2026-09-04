package com.tencent.beacon.a.c;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f98803a;

    d(e eVar) {
        this.f98803a = eVar;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
