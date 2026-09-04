package kotlin.collections.builders;

import dl.d;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SerializedCollection implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final a f124605d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f124606e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124607f = 1;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Collection<?> f124608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f124609c;

    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.E(), 0);
    }

    public SerializedCollection(@d Collection<?> collection, int i10) {
        f0.p(collection, "collection");
        this.f124608b = collection;
        this.f124609c = i10;
    }

    private final Object a() {
        return this.f124608b;
    }

    @Override // java.io.Externalizable
    public void readExternal(@d ObjectInput input) throws IOException {
        Collection<?> collectionA;
        f0.p(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + lg.a.f131414g);
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + lg.a.f131414g);
        }
        int i12 = 0;
        if (i10 == 0) {
            List listJ = s.j(i11);
            while (i12 < i11) {
                listJ.add(input.readObject());
                i12++;
            }
            collectionA = s.a(listJ);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + lg.a.f131414g);
            }
            Set setE = c1.e(i11);
            while (i12 < i11) {
                setE.add(input.readObject());
                i12++;
            }
            collectionA = c1.a(setE);
        }
        this.f124608b = collectionA;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@d ObjectOutput output) throws IOException {
        f0.p(output, "output");
        output.writeByte(this.f124609c);
        output.writeInt(this.f124608b.size());
        Iterator<?> it = this.f124608b.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
