package com.google.common.escape;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b(emulated = true)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<char[]> f58270a = new a();

    /* JADX INFO: compiled from: Platform.java */
    public class a extends ThreadLocal<char[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public char[] initialValue() {
            return new char[1024];
        }
    }

    private k() {
    }

    static char[] a() {
        return f58270a.get();
    }
}
