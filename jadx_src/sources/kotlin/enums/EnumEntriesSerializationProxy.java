package kotlin.enums;

import dl.d;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private static final a f124732c = new a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Class<E> f124733b;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(@d E[] entries) {
        f0.p(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        f0.m(cls);
        this.f124733b = cls;
    }

    private final Object a() {
        E[] enumConstants = this.f124733b.getEnumConstants();
        f0.o(enumConstants, "c.enumConstants");
        return EnumEntriesKt.b(enumConstants);
    }
}
