package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
public final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f16496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ List<u> f16497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ FontListFontFamilyTypefaceAdapter f16498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ q0 f16499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3(List<u> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, q0 q0Var, kotlin.coroutines.c<? super FontListFontFamilyTypefaceAdapter$preload$3> cVar) {
        super(2, cVar);
        this.f16497d = list;
        this.f16498e = fontListFontFamilyTypefaceAdapter;
        this.f16499f = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.f16497d, this.f16498e, this.f16499f, cVar);
        fontListFontFamilyTypefaceAdapter$preload$3.f16496c = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f16495b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f16496c;
            List<u> list = this.f16497d;
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                u uVar = list.get(i11);
                if (hashSet.add(uVar)) {
                    arrayList.add(uVar);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.f16498e;
            q0 q0Var2 = this.f16499f;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(kotlinx.coroutines.k.b(q0Var, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (u) arrayList.get(i12), q0Var2, null), 3, null));
            }
            this.f16495b = 1;
            if (AwaitKt.c(arrayList2, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
