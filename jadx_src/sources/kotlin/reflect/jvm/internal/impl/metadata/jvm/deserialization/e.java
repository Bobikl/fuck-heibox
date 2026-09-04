package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JvmMetadataVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f127168h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final e f127169i = new e(1, 8, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final e f127170j = new e(new int[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f127171g;

    /* JADX INFO: compiled from: JvmMetadataVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@dl.d int... numbers) {
        this(numbers, false);
        f0.p(numbers, "numbers");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d int[] versionArray, boolean z10) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        f0.p(versionArray, "versionArray");
        this.f127171g = z10;
    }

    public boolean h() {
        boolean zF;
        if (a() == 1 && b() == 0) {
            return false;
        }
        if (this.f127171g) {
            zF = f(f127169i);
        } else {
            int iA = a();
            e eVar = f127169i;
            zF = iA == eVar.a() && b() <= eVar.b() + 1;
        }
        return zF;
    }
}
