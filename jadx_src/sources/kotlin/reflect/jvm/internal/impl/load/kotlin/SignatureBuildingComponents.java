package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.meituan.robust.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SignatureBuildingComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SignatureBuildingComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final SignatureBuildingComponents f126464a = new SignatureBuildingComponents();

    private SignatureBuildingComponents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return Constants.OBJECT_TYPE + str + ';';
    }

    @dl.d
    public final String[] b(@dl.d String... signatures) {
        f0.p(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @dl.d
    public final Set<String> d(@dl.d String internalName, @dl.d String... signatures) {
        f0.p(internalName, "internalName");
        f0.p(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + lg.a.f131414g + str);
        }
        return linkedHashSet;
    }

    @dl.d
    public final Set<String> e(@dl.d String name, @dl.d String... signatures) {
        f0.p(name, "name");
        f0.p(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @dl.d
    public final Set<String> f(@dl.d String name, @dl.d String... signatures) {
        f0.p(name, "name");
        f0.p(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @dl.d
    public final String g(@dl.d String name) {
        f0.p(name, "name");
        return "java/util/function/" + name;
    }

    @dl.d
    public final String h(@dl.d String name) {
        f0.p(name, "name");
        return "java/lang/" + name;
    }

    @dl.d
    public final String i(@dl.d String name) {
        f0.p(name, "name");
        return "java/util/" + name;
    }

    @dl.d
    public final String j(@dl.d String name, @dl.d List<String> parameters, @dl.d String ret) {
        f0.p(name, "name");
        f0.p(parameters, "parameters");
        f0.p(ret, "ret");
        return name + '(' + CollectionsKt___CollectionsKt.h3(parameters, "", null, null, 0, null, new yh.l<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@dl.d String it) {
                f0.p(it, "it");
                return SignatureBuildingComponents.f126464a.c(it);
            }
        }, 30, null) + ')' + c(ret);
    }

    @dl.d
    public final String k(@dl.d String internalName, @dl.d String jvmDescriptor) {
        f0.p(internalName, "internalName");
        f0.p(jvmDescriptor, "jvmDescriptor");
        return internalName + lg.a.f131414g + jvmDescriptor;
    }
}
