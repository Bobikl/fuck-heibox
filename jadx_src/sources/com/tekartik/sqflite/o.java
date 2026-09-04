package com.tekartik.sqflite;

/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o {

    /* JADX INFO: compiled from: DatabaseWorkerPool.java */
    public class a implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f98685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f98686b;

        a(p pVar, j jVar) {
            this.f98686b = pVar;
            this.f98685a = jVar;
        }

        @Override // com.tekartik.sqflite.k
        public int a() {
            return this.f98685a.f98663c;
        }

        @Override // com.tekartik.sqflite.k
        public boolean b() {
            return this.f98685a.G();
        }
    }

    public static void a(p pVar, j jVar, Runnable runnable) {
        pVar.a(new l(jVar == null ? null : new a(pVar, jVar), runnable));
    }

    public static p b(String str, int i10, int i11) {
        return i10 == 1 ? new v(str, i11) : new s(str, i10, i11);
    }
}
