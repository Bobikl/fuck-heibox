package me.pqpo.librarylog4a.logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AppenderLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<me.pqpo.librarylog4a.appender.c> f131900a = new ArrayList();

    /* JADX INFO: compiled from: AppenderLogger.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f131901a = new b();

        public a a(me.pqpo.librarylog4a.appender.c cVar) {
            this.f131901a.b(cVar);
            return this;
        }

        public b b() {
            return this.f131901a;
        }
    }

    protected b() {
    }

    @Override // me.pqpo.librarylog4a.logger.c
    public void a(int i10, String str, String str2) {
        List<me.pqpo.librarylog4a.appender.c> list = this.f131900a;
        if (list == null) {
            return;
        }
        Iterator<me.pqpo.librarylog4a.appender.c> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(i10, str, str2);
        }
    }

    public void b(me.pqpo.librarylog4a.appender.c cVar) {
        if (cVar != null) {
            this.f131900a.add(cVar);
        }
    }

    public List<me.pqpo.librarylog4a.appender.c> c() {
        return this.f131900a;
    }

    @Override // me.pqpo.librarylog4a.logger.c
    public void flush() {
        Iterator<me.pqpo.librarylog4a.appender.c> it = this.f131900a.iterator();
        while (it.hasNext()) {
            it.next().flush();
        }
    }

    @Override // me.pqpo.librarylog4a.logger.c
    public void release() {
        Iterator<me.pqpo.librarylog4a.appender.c> it = this.f131900a.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f131900a.clear();
    }
}
