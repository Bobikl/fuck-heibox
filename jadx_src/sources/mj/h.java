package mj;

import java.util.Comparator;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: StringEncoderComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f131914b;

    public h() {
        this.f131914b = null;
    }

    public h(g gVar) {
        this.f131914b = gVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        try {
            return ((Comparable) this.f131914b.encode(obj)).compareTo((Comparable) this.f131914b.encode(obj2));
        } catch (EncoderException unused) {
            return 0;
        }
    }
}
