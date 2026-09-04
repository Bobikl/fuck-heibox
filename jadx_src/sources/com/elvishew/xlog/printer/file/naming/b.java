package com.elvishew.xlog.printer.file.naming;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: DateFileNameGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadLocal<SimpleDateFormat> f42945a = new a();

    /* JADX INFO: compiled from: DateFileNameGenerator.java */
    public class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        }
    }

    @Override // com.elvishew.xlog.printer.file.naming.c
    public boolean a() {
        return true;
    }

    @Override // com.elvishew.xlog.printer.file.naming.c
    public String b(int i10, long j10) {
        SimpleDateFormat simpleDateFormat = this.f42945a.get();
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date(j10));
    }
}
