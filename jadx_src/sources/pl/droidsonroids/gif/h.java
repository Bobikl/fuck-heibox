package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: GifRenderingExecutor.java */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends ScheduledThreadPoolExecutor {

    /* JADX INFO: compiled from: GifRenderingExecutor.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f138370a = new h();

        private b() {
        }
    }

    private h() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    static h a() {
        return b.f138370a;
    }
}
