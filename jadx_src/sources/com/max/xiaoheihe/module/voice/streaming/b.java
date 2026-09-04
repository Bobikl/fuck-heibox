package com.max.xiaoheihe.module.voice.streaming;

import com.max.xiaoheihe.module.voice.audio.AudioBuffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;

/* JADX INFO: compiled from: Streamer.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final a f94167a = a.f94171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final String f94168b = "AndroidMicCheck";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final String f94169c = "AndroidMicCheckAck";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94170d = 1024;

    /* JADX INFO: compiled from: Streamer.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f94171a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        public static final String f94172b = "AndroidMicCheck";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final String f94173c = "AndroidMicCheckAck";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f94174d = 1024;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.voice.streaming.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Streamer.kt */
    public static final class C0889b {
        public static ChangeQuickRedirect changeQuickRedirect;

        @e
        public static Boolean a(@d b bVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, null, changeQuickRedirect, true, 46822, new Class[]{b.class}, Boolean.class);
            return patchProxyResultProxy.isSupported ? (Boolean) patchProxyResultProxy.result : Boolean.FALSE;
        }

        public static void b(@d b bVar) {
        }

        @e
        public static Object c(@d b bVar, @d AudioBuffer audioBuffer, @d c<? super b2> cVar) {
            return b2.f124493a;
        }
    }

    void close();

    boolean connect();

    boolean disconnect();

    @e
    Object h(@d c<? super String> cVar);

    @e
    Boolean i();

    @d
    String j();

    @e
    Object k(@d AudioBuffer audioBuffer, @d c<? super b2> cVar);

    @e
    Object l(@d short[] sArr, @d c<? super b2> cVar);

    boolean m();

    @e
    Object n(@d AudioBuffer audioBuffer, @d String str, @d c<? super b2> cVar);

    @e
    Object o(@d AudioBuffer audioBuffer, @d c<? super b2> cVar);

    void shutdown();
}
