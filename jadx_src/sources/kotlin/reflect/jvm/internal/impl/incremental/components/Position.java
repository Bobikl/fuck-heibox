package kotlin.reflect.jvm.internal.impl.incremental.components;

import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: LookupLocation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Position implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final a f125948d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private static final Position f125949e = new Position(-1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125951c;

    /* JADX INFO: compiled from: LookupLocation.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final Position a() {
            return Position.f125949e;
        }
    }

    public Position(int i10, int i11) {
        this.f125950b = i10;
        this.f125951c = i11;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.f125950b == position.f125950b && this.f125951c == position.f125951c;
    }

    public int hashCode() {
        return (this.f125950b * 31) + this.f125951c;
    }

    @d
    public String toString() {
        return "Position(line=" + this.f125950b + ", column=" + this.f125951c + ')';
    }
}
