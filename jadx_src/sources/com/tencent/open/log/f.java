package com.tencent.open.log;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f implements Iterable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f101142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f101143b;

    public f() {
        this.f101142a = null;
        this.f101143b = null;
        this.f101142a = new ConcurrentLinkedQueue<>();
        this.f101143b = new AtomicInteger(0);
    }

    public int a() {
        return this.f101143b.get();
    }

    public int a(String str) {
        int length = str.length();
        this.f101142a.add(str);
        return this.f101143b.addAndGet(length);
    }

    public void a(Writer writer, char[] cArr) throws IOException {
        if (writer == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i10 = length;
        int i11 = 0;
        for (String str : this) {
            int length2 = str.length();
            int i12 = 0;
            while (length2 > 0) {
                int i13 = i10 > length2 ? length2 : i10;
                int i14 = i12 + i13;
                str.getChars(i12, i14, cArr, i11);
                i10 -= i13;
                i11 += i13;
                length2 -= i13;
                if (i10 == 0) {
                    try {
                        writer.write(cArr, 0, length);
                    } catch (Exception unused) {
                    }
                    i10 = length;
                    i11 = 0;
                }
                i12 = i14;
            }
        }
        if (i11 > 0) {
            try {
                writer.write(cArr, 0, i11);
            } catch (Exception unused2) {
            }
        }
        try {
            writer.flush();
        } catch (Exception unused3) {
        }
    }

    public void b() {
        this.f101142a.clear();
        this.f101143b.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f101142a.iterator();
    }
}
