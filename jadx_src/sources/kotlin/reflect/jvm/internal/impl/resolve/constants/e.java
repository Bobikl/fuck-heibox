package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e extends m<Character> {
    public e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        if (c10 == '\b') {
            return "\\b";
        }
        if (c10 == '\t') {
            return "\\t";
        }
        if (c10 == '\n') {
            return "\\n";
        }
        if (c10 == '\f') {
            return "\\f";
        }
        if (c10 == '\r') {
            return "\\r";
        }
        return e(c10) ? String.valueOf(c10) : "?";
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j0 a(@dl.d d0 module) {
        f0.p(module, "module");
        j0 j0VarU = module.t().u();
        f0.o(j0VarU, "module.builtIns.charType");
        return j0VarU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @dl.d
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        f0.o(str, "format(this, *args)");
        return str;
    }
}
