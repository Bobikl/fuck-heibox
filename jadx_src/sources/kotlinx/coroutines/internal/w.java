package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\n\u0010\u0006\u0012\u0004\b\u000b\u0010\b\"\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000e\u0010\b\" \u0010\u0014\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\u0005\u0010\u0012\" \u0010\u0017\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0010\u0010\u0012*\n\u0010\u0019\"\u00020\u00182\u00020\u0018*\u001c\u0010\u001c\u001a\u0004\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\u0012\u0004\u0012\u00028\u00000\u001b*\f\b\u0002\u0010\u001d\"\u00020\u00012\u00020\u0001*\n\u0010\u001f\"\u00020\u001e2\u00020\u001e*\u001c\u0010!\u001a\u0004\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00028\u00000 2\b\u0012\u0004\u0012\u00028\u00000 ¨\u0006\""}, d2 = {"", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", RXScreenCaptureService.KEY_HEIGHT, "", ak.av, "I", "getUNDECIDED$annotations", "()V", "UNDECIDED", "b", "getSUCCESS$annotations", "SUCCESS", ak.aF, "getFAILURE$annotations", "FAILURE", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "CONDITION_FALSE", "e", "getLIST_EMPTY$annotations", "LIST_EMPTY", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "AbstractAtomicDesc", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$b;", "AddLastDesc", "Node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$d;", "PrepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$e;", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f130202a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f130203b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f130204c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Object f130205d = new o0("CONDITION_FALSE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Object f130206e = new o0("LIST_EMPTY");

    @dl.d
    public static final Object a() {
        return f130205d;
    }

    @kotlin.r0
    public static /* synthetic */ void b() {
    }

    @kotlin.r0
    public static /* synthetic */ void c() {
    }

    @dl.d
    public static final Object d() {
        return f130206e;
    }

    @kotlin.r0
    public static /* synthetic */ void e() {
    }

    @kotlin.r0
    public static /* synthetic */ void f() {
    }

    @kotlin.r0
    public static /* synthetic */ void g() {
    }

    @dl.d
    @kotlin.r0
    public static final LockFreeLinkedListNode h(@dl.d Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        i0 i0Var = obj instanceof i0 ? (i0) obj : null;
        return (i0Var == null || (lockFreeLinkedListNode = i0Var.ref) == null) ? (LockFreeLinkedListNode) obj : lockFreeLinkedListNode;
    }
}
