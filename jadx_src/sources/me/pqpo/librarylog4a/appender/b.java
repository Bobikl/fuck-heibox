package me.pqpo.librarylog4a.appender;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AndroidAppender.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends me.pqpo.librarylog4a.appender.a {

    /* JADX INFO: compiled from: AndroidAppender.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f131887a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<jj.a> f131888b;

        public a c(jj.a aVar) {
            if (this.f131888b == null) {
                this.f131888b = new ArrayList();
            }
            this.f131888b.add(aVar);
            return this;
        }

        public b d() {
            return new b(this);
        }

        public a e(int i10) {
            this.f131887a = i10;
            return this;
        }
    }

    protected b(a aVar) {
        f(aVar.f131887a);
        b(aVar.f131888b);
    }

    @Override // me.pqpo.librarylog4a.appender.a
    protected void e(int i10, String str, String str2) {
        Log.println(i10, str, str2);
    }
}
