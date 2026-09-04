package ni;

import dl.d;
import fi.l;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.e;

/* JADX INFO: compiled from: BuiltInsBinaryVersion.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final C1209a f132102g = new C1209a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    @e
    public static final a f132103h = new a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    @e
    public static final a f132104i = new a(new int[0]);

    /* JADX INFO: renamed from: ni.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BuiltInsBinaryVersion.kt */
    public static final class C1209a {
        private C1209a() {
        }

        public /* synthetic */ C1209a(u uVar) {
            this();
        }

        @d
        public final a a(@d InputStream stream) {
            f0.p(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            l lVar = new l(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(t.Y(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (it.hasNext()) {
                ((k0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrP5 = CollectionsKt___CollectionsKt.P5(arrayList);
            return new a(Arrays.copyOf(iArrP5, iArrP5.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@d int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        f0.p(numbers, "numbers");
    }

    public boolean h() {
        return f(f132103h);
    }
}
