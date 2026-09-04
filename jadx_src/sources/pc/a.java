package pc;

import androidx.annotation.k0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import bb.c;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbexpression.ExpressionAssetManager;
import com.max.hbexpression.RecentEmojiManger;
import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.hbexpression.bean.EmojiItemtObj;
import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbexpression.bean.ExpressionPackViewObj;
import com.max.hbexpression.f;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ExpressionShowFragmentV2ViewModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionShowFragmentV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionShowFragmentV2ViewModel.kt\ncom/max/hbexpression/viewmodel/ExpressionShowFragmentV2ViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n766#2:138\n857#2,2:139\n1855#2:141\n1856#2:143\n1855#2,2:144\n1#3:142\n*S KotlinDebug\n*F\n+ 1 ExpressionShowFragmentV2ViewModel.kt\ncom/max/hbexpression/viewmodel/ExpressionShowFragmentV2ViewModel\n*L\n43#1:138\n43#1:139,2\n52#1:141\n52#1:143\n79#1:144,2\n*E\n"})
public final class a extends BaseViewModel {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    public static final C1253a f138246p = new C1253a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @d
    private static final String f138247q = "ExpressionShowFragmentV2VM-dbg";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f138248r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f138249s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f138250t = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final i0<List<ExpressionPackViewObj>> f138251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final LiveData<List<ExpressionPackViewObj>> f138252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final i0<b> f138253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final LiveData<b> f138254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private final i0<Long> f138255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private final LiveData<Long> f138256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    private final i0<Pair<Boolean, String>> f138257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final LiveData<Pair<Boolean, String>> f138258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final i0<Boolean> f138259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final LiveData<Boolean> f138260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    private final i0<List<ExpressionObj>> f138261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    private final LiveData<List<ExpressionObj>> f138262o;

    /* JADX INFO: renamed from: pc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExpressionShowFragmentV2ViewModel.kt */
    public static final class C1253a {
        private C1253a() {
        }

        public /* synthetic */ C1253a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragmentV2ViewModel.kt */
    public static final class b {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f138263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        private final ExpressionObj f138264b;

        public b(int i10, @d ExpressionObj expressionObj) {
            f0.p(expressionObj, "expressionObj");
            this.f138263a = i10;
            this.f138264b = expressionObj;
        }

        public static /* synthetic */ b d(b bVar, int i10, ExpressionObj expressionObj, int i11, Object obj) {
            Object[] objArr = {bVar, new Integer(i10), expressionObj, new Integer(i11), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.g.f32965m3, new Class[]{b.class, cls, ExpressionObj.class, cls, Object.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            if ((i11 & 1) != 0) {
                i10 = bVar.f138263a;
            }
            if ((i11 & 2) != 0) {
                expressionObj = bVar.f138264b;
            }
            return bVar.c(i10, expressionObj);
        }

        public final int a() {
            return this.f138263a;
        }

        @d
        public final ExpressionObj b() {
            return this.f138264b;
        }

        @d
        public final b c(int i10, @d ExpressionObj expressionObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), expressionObj}, this, changeQuickRedirect, false, c.g.f32945l3, new Class[]{Integer.TYPE, ExpressionObj.class}, b.class);
            if (patchProxyResultProxy.isSupported) {
                return (b) patchProxyResultProxy.result;
            }
            f0.p(expressionObj, "expressionObj");
            return new b(i10, expressionObj);
        }

        public final int e() {
            return this.f138263a;
        }

        public boolean equals(@e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.g.f33025p3, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f138263a == bVar.f138263a && f0.g(this.f138264b, bVar.f138264b);
        }

        @d
        public final ExpressionObj f() {
            return this.f138264b;
        }

        public int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33005o3, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : (this.f138263a * 31) + this.f138264b.hashCode();
        }

        @d
        public String toString() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32985n3, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            return "ExpressionClickEvent(clickType=" + this.f138263a + ", expressionObj=" + this.f138264b + ')';
        }
    }

    public a() {
        i0<List<ExpressionPackViewObj>> i0Var = new i0<>();
        this.f138251d = i0Var;
        this.f138252e = i0Var;
        i0<b> i0Var2 = new i0<>();
        this.f138253f = i0Var2;
        this.f138254g = i0Var2;
        i0<Long> i0Var3 = new i0<>();
        this.f138255h = i0Var3;
        this.f138256i = i0Var3;
        i0<Pair<Boolean, String>> i0Var4 = new i0<>(new Pair(Boolean.FALSE, null));
        this.f138257j = i0Var4;
        this.f138258k = i0Var4;
        i0<Boolean> i0Var5 = new i0<>();
        this.f138259l = i0Var5;
        this.f138260m = i0Var5;
        i0<List<ExpressionObj>> i0Var6 = new i0<>();
        this.f138261n = i0Var6;
        this.f138262o = i0Var6;
    }

    public static /* synthetic */ void v(a aVar, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, c.g.f32826f3, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.u(z10);
    }

    @d
    public final LiveData<Pair<Boolean, String>> g() {
        return this.f138258k;
    }

    @d
    public final LiveData<Long> h() {
        return this.f138256i;
    }

    @d
    public final LiveData<b> i() {
        return this.f138254g;
    }

    @d
    public final LiveData<List<ExpressionPackViewObj>> k() {
        return this.f138252e;
    }

    @d
    public final LiveData<Boolean> m() {
        return this.f138260m;
    }

    @d
    public final LiveData<List<ExpressionObj>> n() {
        return this.f138262o;
    }

    @k0
    public final void o(boolean z10, @e String str) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, c.g.f32886i3, new Class[]{Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f138257j.r(new Pair<>(Boolean.valueOf(z10), str));
    }

    @k0
    public final void p(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.g.f32905j3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f138259l.r(Boolean.valueOf(z10));
    }

    @k0
    public final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32866h3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f138255h.r(Long.valueOf(System.currentTimeMillis()));
    }

    @k0
    public final void s(@d b clickEvent) {
        if (PatchProxy.proxy(new Object[]{clickEvent}, this, changeQuickRedirect, false, c.g.f32846g3, new Class[]{b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(clickEvent, "clickEvent");
        this.f138253f.r(clickEvent);
    }

    @k0
    public final void t() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f32925k3, new Class[0], Void.TYPE).isSupported && this.f138262o.f() == null) {
            this.f138261n.r(CollectionsKt___CollectionsKt.E5(RecentEmojiManger.f70167a.c(), 7));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void u(boolean z10) {
        List listN2;
        ?? r10;
        List<EmojiGroupObj> emoji_groups;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.g.f32806e3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        EmojisListResultObj emojisListResultObj = f.f70195a;
        List listN3 = (emojisListResultObj == null || (emoji_groups = emojisListResultObj.getEmoji_groups()) == null) ? null : CollectionsKt___CollectionsKt.n2(emoji_groups);
        if ((listN3 == null || listN3.isEmpty()) == true) {
            g.f74531b.v("[ExpressionShowFragmentV2VM-dbg][triggerLoadData] emoji_groups is null or empty: " + listN3);
            return;
        }
        ArrayList<EmojiGroupObj> arrayList = new ArrayList();
        for (Object obj : listN3) {
            EmojiGroupObj emojiGroupObj = (EmojiGroupObj) obj;
            List<EmojiItemtObj> emojis = emojiGroupObj.getEmojis();
            if ((emojis == null || emojis.isEmpty()) == true) {
                r10 = false;
            } else {
                String group_code = emojiGroupObj.getGroup_code();
                if ((group_code == null || group_code.length() == 0) == true) {
                    r10 = false;
                } else {
                    r10 = true;
                }
            }
            if (r10 != false) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != listN3.size()) {
            g.f74531b.v("[ExpressionShowFragmentV2VM-dbg][triggerLoadData] invalid emojiGroup filter out\nemojiGroupObj: " + listN3 + "\nvalidEmojiGroups: " + arrayList);
        }
        ArrayList<ExpressionPackViewObj> arrayList2 = new ArrayList();
        for (EmojiGroupObj emojiGroupObj2 : arrayList) {
            if (!z10 || !f0.g(emojiGroupObj2.getType(), "2")) {
                List<EmojiItemtObj> emojis2 = emojiGroupObj2.getEmojis();
                if (emojis2 != null) {
                    f0.m(emojis2);
                    listN2 = CollectionsKt___CollectionsKt.n2(emojis2);
                } else {
                    listN2 = null;
                }
                if (((listN2 == null || listN2.isEmpty()) ^ true) == false) {
                    listN2 = null;
                }
                if (listN2 == null) {
                    g.f74531b.v("[ExpressionShowFragmentV2VM-dbg][triggerLoadData] emojiGroup.emojis is null or empty\nemojiGroup: " + emojiGroupObj2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = listN2.iterator();
                    int type = 1;
                    while (it.hasNext()) {
                        ExpressionObj expressionObjC = f.c(emojiGroupObj2, (EmojiItemtObj) it.next());
                        f0.o(expressionObjC, "getExpressByConfig(...)");
                        arrayList3.add(expressionObjC);
                        type = expressionObjC.getType();
                    }
                    String group_code2 = emojiGroupObj2.getGroup_code();
                    f0.o(group_code2, "getGroup_code(...)");
                    arrayList2.add(new ExpressionPackViewObj(arrayList3, type, group_code2, emojiGroupObj2.getExpression_pack_name(), emojiGroupObj2.getGroup_img()));
                }
            }
        }
        this.f138251d.o(arrayList2);
        for (ExpressionPackViewObj expressionPackViewObj : arrayList2) {
            if (!ExpressionAssetManager.f69919a.t(expressionPackViewObj.getPackGroupCode())) {
                f.h(expressionPackViewObj.getPackGroupCode(), expressionPackViewObj.getPackGroupCode(), expressionPackViewObj.getPackGroupImg());
            }
        }
    }
}
