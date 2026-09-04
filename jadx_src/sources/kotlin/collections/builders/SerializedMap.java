package kotlin.collections.builders;

import dl.d;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final a f124610c = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private Map<?, ?> f124611b;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public SerializedMap() {
        this(s0.z());
    }

    public SerializedMap(@d Map<?, ?> map) {
        f0.p(map, "map");
        this.f124611b = map;
    }

    private final Object a() {
        return this.f124611b;
    }

    @Override // java.io.Externalizable
    public void readExternal(@d ObjectInput input) throws IOException {
        f0.p(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + lg.a.f131414g);
        }
        Map mapH = r0.h(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapH.put(input.readObject(), input.readObject());
        }
        this.f124611b = r0.d(mapH);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@d ObjectOutput output) throws IOException {
        f0.p(output, "output");
        output.writeByte(0);
        output.writeInt(this.f124611b.size());
        for (Map.Entry<?, ?> entry : this.f124611b.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
