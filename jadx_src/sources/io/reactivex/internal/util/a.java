package io.reactivex.internal.util;

import io.reactivex.g0;
import kh.r;

/* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
/* JADX INFO: loaded from: classes5.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f123865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f123866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f123867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f123868d;

    /* JADX INFO: renamed from: io.reactivex.internal.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AppendOnlyLinkedArrayList.java */
    public interface InterfaceC1112a<T> extends r<T> {
        @Override // kh.r
        boolean test(T t10);
    }

    public a(int i10) {
        this.f123865a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f123866b = objArr;
        this.f123867c = objArr;
    }

    public <U> boolean a(g0<? super U> g0Var) {
        Object[] objArr = this.f123866b;
        int i10 = this.f123865a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr2 = objArr[i11];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, g0Var)) {
                    return true;
                }
            }
            objArr = objArr[i10];
        }
    }

    public <U> boolean b(org.reactivestreams.d<? super U> dVar) {
        Object[] objArr = this.f123866b;
        int i10 = this.f123865a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                Object[] objArr2 = objArr[i11];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, dVar)) {
                    return true;
                }
            }
            objArr = objArr[i10];
        }
    }

    public void c(T t10) {
        int i10 = this.f123865a;
        int i11 = this.f123868d;
        if (i11 == i10) {
            Object[] objArr = new Object[i10 + 1];
            this.f123867c[i10] = objArr;
            this.f123867c = objArr;
            i11 = 0;
        }
        this.f123867c[i11] = t10;
        this.f123868d = i11 + 1;
    }

    public void d(InterfaceC1112a<? super T> interfaceC1112a) {
        int i10 = this.f123865a;
        for (Object[] objArr = this.f123866b; objArr != null; objArr = (Object[]) objArr[i10]) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null) {
                    break;
                } else {
                    if (interfaceC1112a.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public <S> void e(S s10, kh.d<? super S, ? super T> dVar) throws Exception {
        Object[] objArr = this.f123866b;
        int i10 = this.f123865a;
        while (true) {
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = objArr[i11];
                if (obj == null || dVar.test(s10, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }

    public void f(T t10) {
        this.f123866b[0] = t10;
    }
}
