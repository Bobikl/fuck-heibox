package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import y0.DeltaCounter;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0000\u0018\u0000 ;*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001JB)\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\u000e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020P\u0012\b\u0010W\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b]\u0010^B!\b\u0016\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\u000e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020P¢\u0006\u0004\b]\u0010_J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J?\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJG\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0003H\u0002J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J)\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00028\u00002\n\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b3\u0010.J)\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000b\u001a\u00028\u00002\n\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0002¢\u0006\u0004\b4\u00102J,\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u00109\u001a\u0004\u0018\u00010\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010:\u001a\u0004\u0018\u00010\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020\u0003H\u0002J\u0016\u0010<\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b=\u0010>J%\u0010(\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b(\u0010@J6\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\n\u00100\u001a\u0006\u0012\u0002\b\u00030/J2\u0010B\u001a\u0004\u0018\u00010\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\n\u00100\u001a\u0006\u0012\u0002\b\u00030/J2\u0010C\u001a\u0004\u0018\u00010\u00022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\n\u00100\u001a\u0006\u0012\u0002\b\u00030/J\u001c\u0010D\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u0003J+\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ7\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00032\n\u00100\u001a\u0006\u0012\u0002\b\u00030/¢\u0006\u0004\bG\u0010HJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bI\u0010FJ7\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00032\n\u00100\u001a\u0006\u0012\u0002\b\u00030/¢\u0006\u0004\b\u0001\u0010HR\"\u0010O\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", androidx.exifinterface.media.a.S4, "", "", "positionMask", "", "p", UCropPlusActivity.ARG_INDEX, "k", "(I)Ljava/lang/Object;", "J", "element", ak.aF, "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "Ly0/f;", "owner", RXScreenCaptureService.KEY_WIDTH, "(ILjava/lang/Object;Ly0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "nodeIndex", "newNode", "P", "I", "elementIndex", "newElementHash", "newElement", "shift", ak.aB, "(IILjava/lang/Object;ILy0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "t", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "D", "elementHash1", "element1", "elementHash2", "element2", "r", "(ILjava/lang/Object;ILjava/lang/Object;ILy0/f;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "cellIndex", "L", "G", "i", RXScreenCaptureService.KEY_HEIGHT, "B", "f", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;", "mutator", "x", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "g", ak.aD, "otherNode", "Ly0/b;", "intersectionSizeRef", "y", "C", androidx.exifinterface.media.a.W4, "d", "l", "q", "(I)I", "elementHash", "(ILjava/lang/Object;I)Z", "v", "H", "F", "j", "b", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", ak.aG, "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/b;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "K", ak.av, "m", "()I", "M", "(I)V", "bitmap", "", "[Ljava/lang/Object;", "n", "()[Ljava/lang/Object;", "N", "([Ljava/lang/Object;)V", "buffer", "ownedBy", "Ly0/f;", "o", "()Ly0/f;", "O", "(Ly0/f;)V", "<init>", "(I[Ljava/lang/Object;Ly0/f;)V", "(I[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final e f12762e = new e(0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private Object[] buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private y0.f f12765c;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e$a;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", ak.av, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/e;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final e a() {
            return e.f12762e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int i10, @dl.d Object[] buffer) {
        this(i10, buffer, null);
        f0.p(buffer, "buffer");
    }

    public e(int i10, @dl.d Object[] buffer, @dl.e y0.f fVar) {
        f0.p(buffer, "buffer");
        this.bitmap = i10;
        this.buffer = buffer;
        this.f12765c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object A(e<E> otherNode, DeltaCounter intersectionSizeRef, y0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return f12762e;
        }
        Object[] objArr = f0.g(owner, this.f12765c) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            y0.a.a(i11 <= i10);
            if (!otherNode.f(objArr2[i10])) {
                objArr[0 + i11] = objArr2[i10];
                i11++;
                y0.a.a(0 + i11 <= objArr.length);
            }
            i10++;
        }
        intersectionSizeRef.e(this.buffer.length - i11);
        if (i11 == 0) {
            return f12762e;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == objArr.length) {
            return new e(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        return new e(0, objArrCopyOf, owner);
    }

    private final e<E> B(int i10, y0.f owner) {
        if (this.f12765c != owner) {
            return new e<>(0, TrieNodeKt.g(this.buffer, i10), owner);
        }
        this.buffer = TrieNodeKt.g(this.buffer, i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object C(e<E> otherNode, DeltaCounter intersectionSizeRef, y0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return this;
        }
        Object[] objArr = f0.g(owner, this.f12765c) ? this.buffer : new Object[Math.min(this.buffer.length, otherNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= objArr2.length) {
                break;
            }
            y0.a.a(i11 <= i10);
            if (otherNode.f(objArr2[i10])) {
                objArr[0 + i11] = objArr2[i10];
                i11++;
                y0.a.a(0 + i11 <= objArr.length);
            }
            i10++;
        }
        intersectionSizeRef.e(i11);
        if (i11 == 0) {
            return f12762e;
        }
        if (i11 == 1) {
            return objArr[0];
        }
        if (i11 == this.buffer.length) {
            return this;
        }
        if (i11 == otherNode.buffer.length) {
            return otherNode;
        }
        if (i11 == objArr.length) {
            return new e(0, objArr, owner);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        return new e(0, objArrCopyOf, owner);
    }

    private final e<E> D(int elementIndex, int newElementHash, E newElement, int shift, y0.f owner) {
        if (this.f12765c == owner) {
            this.buffer[elementIndex] = s(elementIndex, newElementHash, newElement, shift, owner);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[elementIndex] = s(elementIndex, newElementHash, newElement, shift, owner);
        return new e<>(this.bitmap, objArrCopyOf, owner);
    }

    private final e<E> G(int cellIndex, int positionMask, y0.f owner) {
        if (this.f12765c != owner) {
            return new e<>(positionMask ^ this.bitmap, TrieNodeKt.g(this.buffer, cellIndex), owner);
        }
        this.buffer = TrieNodeKt.g(this.buffer, cellIndex);
        this.bitmap ^= positionMask;
        return this;
    }

    private final e<E> I(int nodeIndex, e<E> newNode, y0.f owner) {
        Object[] objArr = newNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = (e<E>) obj;
            }
        }
        if (this.f12765c == owner) {
            this.buffer[nodeIndex] = newNode;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new e<>(this.bitmap, objArrCopyOf, owner);
    }

    private final e<E> J(int index) {
        Object obj = this.buffer[index];
        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (e) obj;
    }

    private final e<E> L(int cellIndex, int positionMask) {
        return new e<>(positionMask ^ this.bitmap, TrieNodeKt.g(this.buffer, cellIndex));
    }

    private final e<E> P(int nodeIndex, e<E> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.buffer.length == 1) {
                    newNode.bitmap = this.bitmap;
                    return newNode;
                }
                newNode = (e<E>) obj;
            }
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new e<>(this.bitmap, objArrCopyOf);
    }

    private final e<E> c(int positionMask, E element) {
        return new e<>(positionMask | this.bitmap, TrieNodeKt.c(this.buffer, q(positionMask), element));
    }

    private final int d() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iD = 0;
        for (Object obj : this.buffer) {
            iD += obj instanceof e ? ((e) obj).d() : 1;
        }
        return iD;
    }

    private final e<E> e(E element) {
        return f(element) ? this : new e<>(0, TrieNodeKt.c(this.buffer, 0, element));
    }

    private final boolean f(E element) {
        return ArraysKt___ArraysKt.T8(this.buffer, element);
    }

    private final e<E> g(E element) {
        int iJg = ArraysKt___ArraysKt.jg(this.buffer, element);
        return iJg != -1 ? h(iJg) : this;
    }

    private final e<E> h(int i10) {
        return new e<>(0, TrieNodeKt.g(this.buffer, i10));
    }

    private final E k(int index) {
        return (E) this.buffer[index];
    }

    private final boolean l(e<E> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.bitmap != otherNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != otherNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean p(int positionMask) {
        return (positionMask & this.bitmap) == 0;
    }

    private final e<E> r(int elementHash1, E element1, int elementHash2, E element2, int shift, y0.f owner) {
        if (shift > 30) {
            return new e<>(0, new Object[]{element1, element2}, owner);
        }
        int iF = TrieNodeKt.f(elementHash1, shift);
        int iF2 = TrieNodeKt.f(elementHash2, shift);
        if (iF != iF2) {
            return new e<>((1 << iF) | (1 << iF2), iF < iF2 ? new Object[]{element1, element2} : new Object[]{element2, element1}, owner);
        }
        return new e<>(1 << iF, new Object[]{r(elementHash1, element1, elementHash2, element2, shift + 5, owner)}, owner);
    }

    private final e<E> s(int elementIndex, int newElementHash, E newElement, int shift, y0.f owner) {
        E eK = k(elementIndex);
        return r(eK != null ? eK.hashCode() : 0, eK, newElementHash, newElement, shift + 5, owner);
    }

    private final e<E> t(int elementIndex, int newElementHash, E newElement, int shift) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[elementIndex] = s(elementIndex, newElementHash, newElement, shift, null);
        return new e<>(this.bitmap, objArrCopyOf);
    }

    private final e<E> w(int positionMask, E element, y0.f owner) {
        int iQ = q(positionMask);
        if (this.f12765c != owner) {
            return new e<>(positionMask | this.bitmap, TrieNodeKt.c(this.buffer, iQ, element), owner);
        }
        this.buffer = TrieNodeKt.c(this.buffer, iQ, element);
        this.bitmap = positionMask | this.bitmap;
        return this;
    }

    private final e<E> x(E element, b<?> mutator) {
        if (f(element)) {
            return this;
        }
        mutator.i(mutator.size() + 1);
        if (this.f12765c != mutator.getF12750c()) {
            return new e<>(0, TrieNodeKt.c(this.buffer, 0, element), mutator.getF12750c());
        }
        this.buffer = TrieNodeKt.c(this.buffer, 0, element);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final e<E> y(e<E> otherNode, DeltaCounter intersectionSizeRef, y0.f owner) {
        if (this == otherNode) {
            intersectionSizeRef.e(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        f0.o(objArrCopyOf, "copyOf(this, newSize)");
        Object[] objArr2 = otherNode.buffer;
        int length = this.buffer.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < objArr2.length) {
            y0.a.a(i11 <= i10);
            if (!f(objArr2[i10])) {
                objArrCopyOf[length + i11] = objArr2[i10];
                i11++;
                y0.a.a(length + i11 <= objArrCopyOf.length);
            }
            i10++;
        }
        int length2 = i11 + this.buffer.length;
        intersectionSizeRef.e(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == otherNode.buffer.length) {
            return otherNode;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            f0.o(objArrCopyOf, "copyOf(this, newSize)");
        }
        if (!f0.g(this.f12765c, owner)) {
            return new e<>(0, objArrCopyOf, owner);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    private final e<E> z(E element, b<?> mutator) {
        int iJg = ArraysKt___ArraysKt.jg(this.buffer, element);
        if (iJg == -1) {
            return this;
        }
        mutator.i(mutator.size() - 1);
        return B(iJg, mutator.getF12750c());
    }

    @dl.d
    public final e<E> E(int elementHash, E element, int shift, @dl.d b<?> mutator) {
        f0.p(mutator, "mutator");
        int iF = 1 << TrieNodeKt.f(elementHash, shift);
        if (p(iF)) {
            return this;
        }
        int iQ = q(iF);
        Object obj = this.buffer[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarZ = shift == 30 ? eVarJ.z(element, mutator) : eVarJ.E(elementHash, element, shift + 5, mutator);
            return (this.f12765c == mutator.getF12750c() || eVarJ != eVarZ) ? I(iQ, eVarZ, mutator.getF12750c()) : this;
        }
        if (!f0.g(element, obj)) {
            return this;
        }
        mutator.i(mutator.size() - 1);
        return G(iQ, iF, mutator.getF12750c());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Object F(@dl.d e<E> otherNode, int shift, @dl.d DeltaCounter intersectionSizeRef, @dl.d b<?> mutator) {
        e<E> eVar;
        f0.p(otherNode, "otherNode");
        f0.p(intersectionSizeRef, "intersectionSizeRef");
        f0.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.e(d());
            return f12762e;
        }
        if (shift > 30) {
            return A(otherNode, intersectionSizeRef, mutator.getF12750c());
        }
        int i10 = this.bitmap & otherNode.bitmap;
        if (i10 == 0) {
            return this;
        }
        if (f0.g(this.f12765c, mutator.getF12750c())) {
            eVar = this;
        } else {
            int i11 = this.bitmap;
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            f0.o(objArrCopyOf, "copyOf(this, size)");
            eVar = new e<>(i11, objArrCopyOf, mutator.getF12750c());
        }
        int i12 = this.bitmap;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            int iQ = q(iLowestOneBit);
            int iQ2 = otherNode.q(iLowestOneBit);
            Object objF = this.buffer[iQ];
            Object obj = otherNode.buffer[iQ2];
            boolean z10 = objF instanceof e;
            boolean z11 = obj instanceof e;
            if (z10 && z11) {
                f0.n(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                objF = ((e) objF).F((e) obj, shift + 5, intersectionSizeRef, mutator);
            } else if (z10) {
                f0.n(objF, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                e eVar2 = (e) objF;
                int size = mutator.size();
                e eVarE = eVar2.E(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                if (size != mutator.size()) {
                    intersectionSizeRef.e(1);
                    Object[] objArr2 = eVarE.buffer;
                    if (objArr2.length == 1) {
                        objF = objArr2[0];
                        if (objF instanceof e) {
                            objF = eVarE;
                        }
                    } else {
                        objF = eVarE;
                    }
                }
            } else if (z11) {
                f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                if (((e) obj).i(objF != null ? objF.hashCode() : 0, objF, shift + 5)) {
                    intersectionSizeRef.e(1);
                    objF = f12762e;
                }
            } else if (f0.g(objF, obj)) {
                intersectionSizeRef.e(1);
                objF = f12762e;
            }
            if (objF == f12762e) {
                i12 ^= iLowestOneBit;
            }
            eVar.buffer[iQ] = objF;
            i10 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i12);
        if (i12 == 0) {
            return f12762e;
        }
        if (i12 == this.bitmap) {
            return eVar.l(this) ? this : eVar;
        }
        if (iBitCount == 1 && shift != 0) {
            Object obj2 = eVar.buffer[eVar.q(i12)];
            return obj2 instanceof e ? new e(i12, new Object[]{obj2}, mutator.getF12750c()) : obj2;
        }
        Object[] objArr3 = new Object[iBitCount];
        Object[] objArr4 = eVar.buffer;
        int i13 = 0;
        int i14 = 0;
        while (i13 < objArr4.length) {
            y0.a.a(i14 <= i13);
            if (objArr4[i13] != INSTANCE.a()) {
                objArr3[0 + i14] = objArr4[i13];
                i14++;
                y0.a.a(0 + i14 <= iBitCount);
            }
            i13++;
        }
        return new e(i12, objArr3, mutator.getF12750c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.e
    public final Object H(@dl.d e<E> otherNode, int shift, @dl.d DeltaCounter intersectionSizeRef, @dl.d b<?> mutator) {
        e eVar;
        f0.p(otherNode, "otherNode");
        f0.p(intersectionSizeRef, "intersectionSizeRef");
        f0.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.e(d());
            return this;
        }
        if (shift > 30) {
            return C(otherNode, intersectionSizeRef, mutator.getF12750c());
        }
        int i10 = this.bitmap & otherNode.bitmap;
        if (i10 == 0) {
            return f12762e;
        }
        e<E> eVar2 = (f0.g(this.f12765c, mutator.getF12750c()) && i10 == this.bitmap) ? this : new e<>(i10, new Object[Integer.bitCount(i10)], mutator.getF12750c());
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            int iQ = q(iLowestOneBit);
            int iQ2 = otherNode.q(iLowestOneBit);
            Object objH = this.buffer[iQ];
            Object obj = otherNode.buffer[iQ2];
            boolean z10 = objH instanceof e;
            boolean z11 = obj instanceof e;
            if (z10 && z11) {
                f0.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                objH = ((e) objH).H((e) obj, shift + 5, intersectionSizeRef, mutator);
            } else if (z10) {
                f0.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                if (((e) objH).i(obj != null ? obj.hashCode() : 0, obj, shift + 5)) {
                    intersectionSizeRef.e(1);
                    objH = obj;
                } else {
                    objH = f12762e;
                }
            } else if (z11) {
                f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                if (((e) obj).i(objH != null ? objH.hashCode() : 0, objH, shift + 5)) {
                    intersectionSizeRef.e(1);
                } else {
                    objH = f12762e;
                }
            } else if (f0.g(objH, obj)) {
                intersectionSizeRef.e(1);
            } else {
                objH = f12762e;
            }
            if (objH != f12762e) {
                i12 |= iLowestOneBit;
            }
            eVar2.buffer[i13] = objH;
            i13++;
            i11 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i12);
        if (i12 == 0) {
            return f12762e;
        }
        if (i12 == i10) {
            if (eVar2.l(this)) {
                return this;
            }
            return eVar2.l(otherNode) ? otherNode : eVar2;
        }
        if (iBitCount != 1 || shift == 0) {
            Object[] objArr = new Object[iBitCount];
            Object[] objArr2 = eVar2.buffer;
            int i14 = 0;
            int i15 = 0;
            while (i14 < objArr2.length) {
                y0.a.a(i15 <= i14);
                if (objArr2[i14] != INSTANCE.a()) {
                    objArr[0 + i15] = objArr2[i14];
                    i15++;
                    y0.a.a(0 + i15 <= iBitCount);
                }
                i14++;
            }
            eVar = new e(i12, objArr, mutator.getF12750c());
        } else {
            Object obj2 = eVar2.buffer[eVar2.q(i12)];
            if (!(obj2 instanceof e)) {
                return obj2;
            }
            eVar = new e(i12, new Object[]{obj2}, mutator.getF12750c());
        }
        return eVar;
    }

    @dl.d
    public final e<E> K(int elementHash, E element, int shift) {
        int iF = 1 << TrieNodeKt.f(elementHash, shift);
        if (p(iF)) {
            return this;
        }
        int iQ = q(iF);
        Object obj = this.buffer[iQ];
        if (!(obj instanceof e)) {
            return f0.g(element, obj) ? L(iQ, iF) : this;
        }
        e<E> eVarJ = J(iQ);
        e<E> eVarG = shift == 30 ? eVarJ.g(element) : eVarJ.K(elementHash, element, shift + 5);
        return eVarJ == eVarG ? this : P(iQ, eVarG);
    }

    public final void M(int i10) {
        this.bitmap = i10;
    }

    public final void N(@dl.d Object[] objArr) {
        f0.p(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final void O(@dl.e y0.f fVar) {
        this.f12765c = fVar;
    }

    @dl.d
    public final e<E> b(int elementHash, E element, int shift) {
        int iF = 1 << TrieNodeKt.f(elementHash, shift);
        if (p(iF)) {
            return c(iF, element);
        }
        int iQ = q(iF);
        Object obj = this.buffer[iQ];
        if (!(obj instanceof e)) {
            return f0.g(element, obj) ? this : t(iQ, elementHash, element, shift);
        }
        e<E> eVarJ = J(iQ);
        e<E> eVarE = shift == 30 ? eVarJ.e(element) : eVarJ.b(elementHash, element, shift + 5);
        return eVarJ == eVarE ? this : P(iQ, eVarE);
    }

    public final boolean i(int elementHash, E element, int shift) {
        int iF = 1 << TrieNodeKt.f(elementHash, shift);
        if (p(iF)) {
            return false;
        }
        int iQ = q(iF);
        Object obj = this.buffer[iQ];
        if (!(obj instanceof e)) {
            return f0.g(element, obj);
        }
        e<E> eVarJ = J(iQ);
        return shift == 30 ? eVarJ.f(element) : eVarJ.i(elementHash, element, shift + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(@dl.d e<E> otherNode, int shift) {
        f0.p(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (shift > 30) {
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt___ArraysKt.T8(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = this.bitmap;
        int i11 = otherNode.bitmap;
        int i12 = i10 & i11;
        if (i12 != i11) {
            return false;
        }
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iQ = q(iLowestOneBit);
            int iQ2 = otherNode.q(iLowestOneBit);
            Object obj2 = this.buffer[iQ];
            Object obj3 = otherNode.buffer[iQ2];
            boolean z10 = obj2 instanceof e;
            boolean z11 = obj3 instanceof e;
            if (z10 && z11) {
                f0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                f0.n(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                if (!((e) obj2).j((e) obj3, shift + 5)) {
                    return false;
                }
            } else if (z10) {
                f0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                if (!((e) obj2).i(obj3 != null ? obj3.hashCode() : 0, obj3, shift + 5)) {
                    return false;
                }
            } else if (z11 || !f0.g(obj2, obj3)) {
                return false;
            }
            i12 ^= iLowestOneBit;
        }
        return true;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getBitmap() {
        return this.bitmap;
    }

    @dl.d
    /* JADX INFO: renamed from: n, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    @dl.e
    /* JADX INFO: renamed from: o, reason: from getter */
    public final y0.f getF12765c() {
        return this.f12765c;
    }

    public final int q(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.bitmap);
    }

    @dl.d
    public final e<E> u(int elementHash, E element, int shift, @dl.d b<?> mutator) {
        f0.p(mutator, "mutator");
        int iF = 1 << TrieNodeKt.f(elementHash, shift);
        if (p(iF)) {
            mutator.i(mutator.size() + 1);
            return w(iF, element, mutator.getF12750c());
        }
        int iQ = q(iF);
        Object obj = this.buffer[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarX = shift == 30 ? eVarJ.x(element, mutator) : eVarJ.u(elementHash, element, shift + 5, mutator);
            return eVarJ == eVarX ? this : I(iQ, eVarX, mutator.getF12750c());
        }
        if (f0.g(element, obj)) {
            return this;
        }
        mutator.i(mutator.size() + 1);
        return D(iQ, elementHash, element, shift, mutator.getF12750c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final e<E> v(@dl.d e<E> otherNode, int shift, @dl.d DeltaCounter intersectionSizeRef, @dl.d b<?> mutator) {
        Object objR;
        e eVarU;
        f0.p(otherNode, "otherNode");
        f0.p(intersectionSizeRef, "intersectionSizeRef");
        f0.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.f(intersectionSizeRef.d() + d());
            return this;
        }
        if (shift > 30) {
            return y(otherNode, intersectionSizeRef, mutator.getF12750c());
        }
        int i10 = this.bitmap;
        int i11 = otherNode.bitmap | i10;
        e<E> eVar = (i11 == i10 && f0.g(this.f12765c, mutator.getF12750c())) ? this : new e<>(i11, new Object[Integer.bitCount(i11)], mutator.getF12750c());
        int i12 = i11;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iQ = q(iLowestOneBit);
            int iQ2 = otherNode.q(iLowestOneBit);
            Object[] objArr = eVar.buffer;
            if (p(iLowestOneBit)) {
                objR = otherNode.buffer[iQ2];
            } else if (otherNode.p(iLowestOneBit)) {
                objR = this.buffer[iQ];
            } else {
                Object obj = this.buffer[iQ];
                Object obj2 = otherNode.buffer[iQ2];
                boolean z10 = obj instanceof e;
                boolean z11 = obj2 instanceof e;
                if (z10 && z11) {
                    f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    f0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    objR = ((e) obj).v((e) obj2, shift + 5, intersectionSizeRef, mutator);
                } else {
                    if (z10) {
                        f0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        e eVar2 = (e) obj;
                        int size = mutator.size();
                        eVarU = eVar2.u(obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator);
                        if (mutator.size() == size) {
                            intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                        }
                        b2 b2Var = b2.f124493a;
                    } else {
                        if (z11) {
                            f0.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            e eVar3 = (e) obj2;
                            int size2 = mutator.size();
                            eVarU = eVar3.u(obj != null ? obj.hashCode() : 0, obj, shift + 5, mutator);
                            if (mutator.size() == size2) {
                                intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                            }
                            b2 b2Var2 = b2.f124493a;
                        } else if (f0.g(obj, obj2)) {
                            intersectionSizeRef.f(intersectionSizeRef.d() + 1);
                            b2 b2Var3 = b2.f124493a;
                            objR = obj;
                        } else {
                            objR = r(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, shift + 5, mutator.getF12750c());
                        }
                        objArr[i13] = objR;
                        i13++;
                        i12 ^= iLowestOneBit;
                    }
                    objR = eVarU;
                }
            }
            objArr[i13] = objR;
            i13++;
            i12 ^= iLowestOneBit;
        }
        if (l(eVar)) {
            return this;
        }
        return otherNode.l(eVar) ? otherNode : eVar;
    }
}
