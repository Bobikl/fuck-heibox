package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes5.dex */
public interface n extends o {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface a extends Cloneable, o {
        a I(e eVar, f fVar) throws IOException;

        n build();
    }

    void a(CodedOutputStream codedOutputStream) throws IOException;

    a t();

    int u();

    a v();

    p<? extends n> w();
}
