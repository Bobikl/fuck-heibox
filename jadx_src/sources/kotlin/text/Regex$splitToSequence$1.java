package kotlin.text;

import java.util.regex.Matcher;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.t0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.coroutines.jvm.internal.d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {bb.c.b.f30876q2, bb.c.b.f31052y2, bb.c.b.C2}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements yh.p<kotlin.sequences.o<? super String>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f128536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f128538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Regex f128539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ CharSequence f128540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f128541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i10, kotlin.coroutines.c<? super Regex$splitToSequence$1> cVar) {
        super(2, cVar);
        this.f128539g = regex;
        this.f128540h = charSequence;
        this.f128541i = i10;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.sequences.o<? super String> oVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((Regex$splitToSequence$1) create(oVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.f128539g, this.f128540h, this.f128541i, cVar);
        regex$splitToSequence$1.f128538f = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Matcher matcher;
        Regex$splitToSequence$1 regex$splitToSequence$1;
        kotlin.sequences.o oVar;
        int i10;
        String string;
        String string2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = this.f128537e;
        int iEnd = 0;
        if (i11 == 0) {
            t0.n(obj);
            kotlin.sequences.o oVar2 = (kotlin.sequences.o) this.f128538f;
            matcher = this.f128539g.f128525b.matcher(this.f128540h);
            if (this.f128541i != 1 && matcher.find()) {
                regex$splitToSequence$1 = this;
                oVar = oVar2;
                i10 = 0;
                string = regex$splitToSequence$1.f128540h.subSequence(iEnd, matcher.start()).toString();
                regex$splitToSequence$1.f128538f = oVar;
                regex$splitToSequence$1.f128535c = matcher;
                regex$splitToSequence$1.f128536d = i10;
                regex$splitToSequence$1.f128537e = 2;
                if (oVar.a(string, regex$splitToSequence$1) == objH) {
                    return objH;
                }
                iEnd = matcher.end();
                i10++;
                if (i10 != regex$splitToSequence$1.f128541i - 1) {
                }
                CharSequence charSequence = regex$splitToSequence$1.f128540h;
                string2 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                regex$splitToSequence$1.f128538f = null;
                regex$splitToSequence$1.f128535c = null;
                regex$splitToSequence$1.f128537e = 3;
                if (oVar.a(string2, regex$splitToSequence$1) == objH) {
                    return objH;
                }
                return b2.f124493a;
            }
            String string3 = this.f128540h.toString();
            this.f128537e = 1;
            if (oVar2.a(string3, this) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = this.f128536d;
                    Matcher matcher2 = (Matcher) this.f128535c;
                    oVar = (kotlin.sequences.o) this.f128538f;
                    t0.n(obj);
                    regex$splitToSequence$1 = this;
                    i10 = i12;
                    matcher = matcher2;
                    iEnd = matcher.end();
                    i10++;
                    if (i10 != regex$splitToSequence$1.f128541i - 1 || !matcher.find()) {
                        CharSequence charSequence2 = regex$splitToSequence$1.f128540h;
                        string2 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                        regex$splitToSequence$1.f128538f = null;
                        regex$splitToSequence$1.f128535c = null;
                        regex$splitToSequence$1.f128537e = 3;
                        if (oVar.a(string2, regex$splitToSequence$1) == objH) {
                            return objH;
                        }
                    }
                    string = regex$splitToSequence$1.f128540h.subSequence(iEnd, matcher.start()).toString();
                    regex$splitToSequence$1.f128538f = oVar;
                    regex$splitToSequence$1.f128535c = matcher;
                    regex$splitToSequence$1.f128536d = i10;
                    regex$splitToSequence$1.f128537e = 2;
                    if (oVar.a(string, regex$splitToSequence$1) == objH) {
                        return objH;
                    }
                    iEnd = matcher.end();
                    i10++;
                    if (i10 != regex$splitToSequence$1.f128541i - 1) {
                    }
                    CharSequence charSequence3 = regex$splitToSequence$1.f128540h;
                    string2 = charSequence3.subSequence(iEnd, charSequence3.length()).toString();
                    regex$splitToSequence$1.f128538f = null;
                    regex$splitToSequence$1.f128535c = null;
                    regex$splitToSequence$1.f128537e = 3;
                    if (oVar.a(string2, regex$splitToSequence$1) == objH) {
                        return objH;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
