package androidx.compose.runtime;

import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-0'j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-`)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u00066"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "key", "dataKey", "Landroidx/compose/runtime/s0;", "d", "keyInfo", "", RXScreenCaptureService.KEY_HEIGHT, "from", "to", "Lkotlin/b2;", "k", "count", "j", "insertIndex", "i", MallPurchaseDetailDialogFragment.f89681y1, "newCount", "n", "m", "g", "o", "", ak.av, "Ljava/util/List;", "b", "()Ljava/util/List;", "keyInfos", "I", "e", "()I", SpellCheckPlugin.START_INDEX_KEY, ak.aF, "l", "(I)V", "groupIndex", "usedKeys", "Ljava/util/HashMap;", "Landroidx/compose/runtime/j0;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "groupInfos", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Lkotlin/z;", "()Ljava/util/HashMap;", "keyMap", "", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class Pending {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<s0> keyInfos;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<s0> usedKeys;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final HashMap<Integer, j0> groupInfos;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.z keyMap;

    public Pending(@dl.d List<s0> keyInfos, int i10) {
        kotlin.jvm.internal.f0.p(keyInfos, "keyInfos");
        this.keyInfos = keyInfos;
        this.startIndex = i10;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, j0> map = new HashMap<>();
        int size = keyInfos.size();
        int nodes = 0;
        for (int i11 = 0; i11 < size; i11++) {
            s0 s0Var = this.keyInfos.get(i11);
            map.put(Integer.valueOf(s0Var.getLocation()), new j0(i11, nodes, s0Var.getNodes()));
            nodes += s0Var.getNodes();
        }
        this.groupInfos = map;
        this.keyMap = kotlin.b0.c(new yh.a<HashMap<Object, LinkedHashSet<s0>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HashMap<Object, LinkedHashSet<s0>> invoke() {
                HashMap<Object, LinkedHashSet<s0>> mapH0 = ComposerKt.h0();
                Pending pending = this.f12423b;
                int size2 = pending.b().size();
                for (int i12 = 0; i12 < size2; i12++) {
                    s0 s0Var2 = pending.b().get(i12);
                    ComposerKt.l0(mapH0, ComposerKt.P(s0Var2), s0Var2);
                }
                return mapH0;
            }
        });
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @dl.d
    public final List<s0> b() {
        return this.keyInfos;
    }

    @dl.d
    public final HashMap<Object, LinkedHashSet<s0>> c() {
        return (HashMap) this.keyMap.getValue();
    }

    @dl.e
    public final s0 d(int key, @dl.e Object dataKey) {
        return (s0) ComposerKt.k0(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    @dl.d
    public final List<s0> f() {
        return this.usedKeys;
    }

    public final int g(@dl.d s0 keyInfo) {
        kotlin.jvm.internal.f0.p(keyInfo, "keyInfo");
        j0 j0Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (j0Var != null) {
            return j0Var.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(@dl.d s0 keyInfo) {
        kotlin.jvm.internal.f0.p(keyInfo, "keyInfo");
        return this.usedKeys.add(keyInfo);
    }

    public final void i(@dl.d s0 keyInfo, int i10) {
        kotlin.jvm.internal.f0.p(keyInfo, "keyInfo");
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new j0(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        if (i10 > i11) {
            Collection<j0> collectionValues = this.groupInfos.values();
            kotlin.jvm.internal.f0.o(collectionValues, "groupInfos.values");
            for (j0 j0Var : collectionValues) {
                int nodeIndex = j0Var.getNodeIndex();
                if (i10 <= nodeIndex && nodeIndex < i10 + i12) {
                    j0Var.e((nodeIndex - i10) + i11);
                } else if (i11 <= nodeIndex && nodeIndex < i10) {
                    j0Var.e(nodeIndex + i12);
                }
            }
            return;
        }
        if (i11 > i10) {
            Collection<j0> collectionValues2 = this.groupInfos.values();
            kotlin.jvm.internal.f0.o(collectionValues2, "groupInfos.values");
            for (j0 j0Var2 : collectionValues2) {
                int nodeIndex2 = j0Var2.getNodeIndex();
                if (i10 <= nodeIndex2 && nodeIndex2 < i10 + i12) {
                    j0Var2.e((nodeIndex2 - i10) + i11);
                } else if (i10 + 1 <= nodeIndex2 && nodeIndex2 < i11) {
                    j0Var2.e(nodeIndex2 - i12);
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        if (i10 > i11) {
            Collection<j0> collectionValues = this.groupInfos.values();
            kotlin.jvm.internal.f0.o(collectionValues, "groupInfos.values");
            for (j0 j0Var : collectionValues) {
                int slotIndex = j0Var.getSlotIndex();
                if (slotIndex == i10) {
                    j0Var.f(i11);
                } else if (i11 <= slotIndex && slotIndex < i10) {
                    j0Var.f(slotIndex + 1);
                }
            }
            return;
        }
        if (i11 > i10) {
            Collection<j0> collectionValues2 = this.groupInfos.values();
            kotlin.jvm.internal.f0.o(collectionValues2, "groupInfos.values");
            for (j0 j0Var2 : collectionValues2) {
                int slotIndex2 = j0Var2.getSlotIndex();
                if (slotIndex2 == i10) {
                    j0Var2.f(i11);
                } else if (i10 + 1 <= slotIndex2 && slotIndex2 < i11) {
                    j0Var2.f(slotIndex2 - 1);
                }
            }
        }
    }

    public final void l(int i10) {
        this.groupIndex = i10;
    }

    public final int m(@dl.d s0 keyInfo) {
        kotlin.jvm.internal.f0.p(keyInfo, "keyInfo");
        j0 j0Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (j0Var != null) {
            return j0Var.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        j0 j0Var = this.groupInfos.get(Integer.valueOf(group));
        if (j0Var == null) {
            return false;
        }
        int nodeIndex2 = j0Var.getNodeIndex();
        int nodeCount = newCount - j0Var.getNodeCount();
        j0Var.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        Collection<j0> collectionValues = this.groupInfos.values();
        kotlin.jvm.internal.f0.o(collectionValues, "groupInfos.values");
        for (j0 j0Var2 : collectionValues) {
            if (j0Var2.getNodeIndex() >= nodeIndex2 && !kotlin.jvm.internal.f0.g(j0Var2, j0Var) && (nodeIndex = j0Var2.getNodeIndex() + nodeCount) >= 0) {
                j0Var2.e(nodeIndex);
            }
        }
        return true;
    }

    public final int o(@dl.d s0 keyInfo) {
        kotlin.jvm.internal.f0.p(keyInfo, "keyInfo");
        j0 j0Var = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        return j0Var != null ? j0Var.getNodeCount() : keyInfo.getNodes();
    }
}
