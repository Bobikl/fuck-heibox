package com.google.thirdparty.publicsuffix;

import com.google.common.base.p;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.a2;
import java.util.Deque;

/* JADX INFO: compiled from: TrieParser.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f59593a = p.p("");

    b() {
    }

    private static int a(Deque<CharSequence> deque, CharSequence charSequence, int i10, ImmutableMap.b<String, PublicSuffixType> bVar) {
        int length = charSequence.length();
        char cCharAt = 0;
        int i11 = i10;
        while (i11 < length && (cCharAt = charSequence.charAt(i11)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i11++;
        }
        deque.push(c(charSequence.subSequence(i10, i11)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strK = f59593a.k(deque);
            if (strK.length() > 0) {
                bVar.i(strK, PublicSuffixType.fromCode(cCharAt));
            }
        }
        int iA = i11 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(deque, charSequence, iA, bVar);
                if (charSequence.charAt(iA) == '?' || charSequence.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        deque.pop();
        return iA - i10;
    }

    static ImmutableMap<String, PublicSuffixType> b(CharSequence charSequence) {
        ImmutableMap.b bVarB = ImmutableMap.b();
        int length = charSequence.length();
        int iA = 0;
        while (iA < length) {
            iA += a(a2.d(), charSequence, iA, bVarB);
        }
        return bVarB.d();
    }

    private static CharSequence c(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
