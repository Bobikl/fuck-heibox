package c7;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lc7/b;", "", "<init>", "()V", ak.av, "b", ak.aF, "ve-entry_release"}, k = 1, mv = {1, 4, 0})
public final class b {

    /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc7/b$a;", "", "<init>", "()V", ak.av, "ve-entry_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final String f35620a = "audio_start";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        public static final String f35621b = "audio_stop";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final String f35622c = "audio_release";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0265a f35623d = new C0265a(null);

        /* JADX INFO: renamed from: c7.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lc7/b$a$a;", "", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lkotlin/b2;", "b", ak.aF, ak.av, "", "RELEASE_AUDIO_RECORD", "Ljava/lang/String;", "START_AUDIO_RECORD", "STOP_AUDIO_RECORD", "<init>", "()V", "ve-entry_release"}, k = 1, mv = {1, 4, 0})
        public static final class C0265a {
            private C0265a() {
            }

            public /* synthetic */ C0265a(u uVar) {
                this();
            }

            @m
            public final void a(@e Cert cert) throws BPEAException {
                d7.a.f108153a.b(cert, a.f35622c);
            }

            @m
            public final void b(@e Cert cert) throws BPEAException {
                d7.a.f108153a.b(cert, a.f35620a);
            }

            @m
            public final void c(@e Cert cert) throws BPEAException {
                d7.a.f108153a.b(cert, a.f35621b);
            }
        }

        @m
        public static final void a(@e Cert cert) throws BPEAException {
            f35623d.a(cert);
        }

        @m
        public static final void b(@e Cert cert) throws BPEAException {
            f35623d.b(cert);
        }

        @m
        public static final void c(@e Cert cert) throws BPEAException {
            f35623d.c(cert);
        }
    }

    /* JADX INFO: renamed from: c7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc7/b$b;", "", "<init>", "()V", ak.av, "ve-entry_release"}, k = 1, mv = {1, 4, 0})
    public static final class C0266b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final String f35624a = "camera_open";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        public static final String f35625b = "camera_close";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f35626c = new a(null);

        /* JADX INFO: renamed from: c7.b$b$a */
        /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lc7/b$b$a;", "", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lkotlin/b2;", "b", ak.av, "", "CLOSE_CAMERA", "Ljava/lang/String;", "OPEN_CAMERA", "<init>", "()V", "ve-entry_release"}, k = 1, mv = {1, 4, 0})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @m
            public final void a(@e Cert cert) throws BPEAException {
                d7.a.f108153a.h(cert, C0266b.f35625b);
            }

            @m
            public final void b(@e Cert cert) throws BPEAException {
                d7.a.f108153a.h(cert, C0266b.f35624a);
            }
        }

        @m
        public static final void a(@e Cert cert) throws BPEAException {
            f35626c.a(cert);
        }

        @m
        public static final void b(@e Cert cert) throws BPEAException {
            f35626c.b(cert);
        }
    }

    /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc7/b$c;", "", "<init>", "()V", ak.av, "ve-entry_release"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        public static final String f35627a = "mediaRecord_start";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        public static final String f35628b = "mediaRecord_stop";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @d
        public static final String f35629c = "mediaRecord_release";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f35630d = new a(null);

        /* JADX INFO: compiled from: VEPrivacyCertCheckEntry.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lc7/b$c$a;", "", "Lcom/bytedance/bpea/basics/Cert;", "cert", "Lkotlin/b2;", "b", ak.aF, ak.av, "", "RELEASE_MEDIA_RECORDER", "Ljava/lang/String;", "START_MEDIA_RECORDER", "STOP_MEDIA_RECORDER", "<init>", "()V", "ve-entry_release"}, k = 1, mv = {1, 4, 0})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }

            @m
            public final void a(@e Cert cert) throws BPEAException {
                d7.a.f108153a.f(cert, c.f35629c);
            }

            @m
            public final void b(@e Cert cert) throws BPEAException {
                d7.a.f108153a.f(cert, c.f35627a);
            }

            @m
            public final void c(@e Cert cert) throws BPEAException {
                d7.a.f108153a.f(cert, c.f35628b);
            }
        }

        @m
        public static final void a(@e Cert cert) throws BPEAException {
            f35630d.a(cert);
        }

        @m
        public static final void b(@e Cert cert) throws BPEAException {
            f35630d.b(cert);
        }

        @m
        public static final void c(@e Cert cert) throws BPEAException {
            f35630d.c(cert);
        }
    }
}
