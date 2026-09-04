package com.tencent.thumbplayer.tcmedia.adapter.a.a;

import com.tencent.thumbplayer.tcmedia.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.tcmedia.core.common.TPSubtitleFrame;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1010a {
        void a(e eVar);

        void a(TPSubtitleFrame tPSubtitleFrame);

        void a(String str);
    }

    public interface b {
        void a(int i10, int i11);
    }

    public interface c {
        void a(int i10, long j10);

        void a(long j10);
    }

    public interface d {
        long a();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f102157a;

        public e(String str) {
            this.f102157a = str;
        }
    }

    void a();

    void a(int i10);

    void a(InterfaceC1010a interfaceC1010a);

    void a(b bVar);

    void a(c cVar);

    void a(d dVar);

    void a(TPSubtitleRenderModel tPSubtitleRenderModel);

    void a(String str, Map<String, String> map, long j10);

    void b();

    void c();

    void d();

    void e();

    void f();
}
