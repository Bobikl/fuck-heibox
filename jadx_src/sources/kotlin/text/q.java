package kotlin.text;

import java.io.IOException;
import kotlin.DeprecationLevel;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.s0;
import kotlin.u0;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public class q extends p {
    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder A(StringBuilder sb2, long j10) {
        f0.p(sb2, "<this>");
        sb2.append(j10);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder B(StringBuilder sb2, StringBuffer stringBuffer) {
        f0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder C(StringBuilder sb2, StringBuilder sb3) {
        f0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder D(StringBuilder sb2, short s10) {
        f0.p(sb2, "<this>");
        sb2.append((int) s10);
        f0.o(sb2, "append(value.toInt())");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder E(StringBuilder sb2, CharSequence value, int i10, int i11) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        sb2.append(value, i10, i11);
        f0.o(sb2, "this.append(value, startIndex, endIndex)");
        return sb2;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder F(StringBuilder sb2, char[] value, int i10, int i11) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        sb2.append(value, i10, i11 - i10);
        f0.o(sb2, "this.append(value, start…x, endIndex - startIndex)");
        return sb2;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine()", imports = {}))
    public static final Appendable G(@dl.d Appendable appendable) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(w.f128591b);
        f0.o(appendableAppend, "append(SystemProperties.LINE_SEPARATOR)");
        return appendableAppend;
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final Appendable H(Appendable appendable, char c10) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        f0.o(appendableAppend, "append(value)");
        return G(appendableAppend);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final Appendable I(Appendable appendable, CharSequence charSequence) throws IOException {
        f0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        f0.o(appendableAppend, "append(value)");
        return G(appendableAppend);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@dl.d StringBuilder sb2) {
        f0.p(sb2, "<this>");
        sb2.append(w.f128591b);
        f0.o(sb2, "append(SystemProperties.LINE_SEPARATOR)");
        return sb2;
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder K(StringBuilder sb2, byte b10) {
        f0.p(sb2, "<this>");
        sb2.append((int) b10);
        f0.o(sb2, "append(value.toInt())");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder L(StringBuilder sb2, char c10) {
        f0.p(sb2, "<this>");
        sb2.append(c10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder M(StringBuilder sb2, double d10) {
        f0.p(sb2, "<this>");
        sb2.append(d10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder N(StringBuilder sb2, float f10) {
        f0.p(sb2, "<this>");
        sb2.append(f10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder O(StringBuilder sb2, int i10) {
        f0.p(sb2, "<this>");
        sb2.append(i10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder P(StringBuilder sb2, long j10) {
        f0.p(sb2, "<this>");
        sb2.append(j10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder Q(StringBuilder sb2, CharSequence charSequence) {
        f0.p(sb2, "<this>");
        sb2.append(charSequence);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder R(StringBuilder sb2, Object obj) {
        f0.p(sb2, "<this>");
        sb2.append(obj);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder S(StringBuilder sb2, String str) {
        f0.p(sb2, "<this>");
        sb2.append(str);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder T(StringBuilder sb2, StringBuffer stringBuffer) {
        f0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder U(StringBuilder sb2, StringBuilder sb3) {
        f0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder V(StringBuilder sb2, short s10) {
        f0.p(sb2, "<this>");
        sb2.append((int) s10);
        f0.o(sb2, "append(value.toInt())");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder W(StringBuilder sb2, boolean z10) {
        f0.p(sb2, "<this>");
        sb2.append(z10);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @kotlin.k(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @s0(expression = "appendLine(value)", imports = {}))
    @sh.f
    private static final StringBuilder X(StringBuilder sb2, char[] value) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        sb2.append(value);
        f0.o(sb2, "append(value)");
        return J(sb2);
    }

    @u0(version = "1.3")
    @dl.d
    public static final StringBuilder Y(@dl.d StringBuilder sb2) {
        f0.p(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder Z(StringBuilder sb2, int i10) {
        f0.p(sb2, "<this>");
        StringBuilder sbDeleteCharAt = sb2.deleteCharAt(i10);
        f0.o(sbDeleteCharAt, "this.deleteCharAt(index)");
        return sbDeleteCharAt;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder a0(StringBuilder sb2, int i10, int i11) {
        f0.p(sb2, "<this>");
        StringBuilder sbDelete = sb2.delete(i10, i11);
        f0.o(sbDelete, "this.delete(startIndex, endIndex)");
        return sbDelete;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder b0(StringBuilder sb2, int i10, CharSequence value, int i11, int i12) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12);
        f0.o(sbInsert, "this.insert(index, value, startIndex, endIndex)");
        return sbInsert;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder c0(StringBuilder sb2, int i10, char[] value, int i11, int i12) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12 - i11);
        f0.o(sbInsert, "this.insert(index, value…x, endIndex - startIndex)");
        return sbInsert;
    }

    @sh.f
    private static final void d0(StringBuilder sb2, int i10, char c10) {
        f0.p(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final StringBuilder e0(StringBuilder sb2, int i10, int i11, String value) {
        f0.p(sb2, "<this>");
        f0.p(value, "value");
        StringBuilder sbReplace = sb2.replace(i10, i11, value);
        f0.o(sbReplace, "this.replace(startIndex, endIndex, value)");
        return sbReplace;
    }

    @u0(version = "1.4")
    @e2(markerClass = {kotlin.q.class})
    @sh.f
    private static final void f0(StringBuilder sb2, char[] destination, int i10, int i11, int i12) {
        f0.p(sb2, "<this>");
        f0.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    static /* synthetic */ void g0(StringBuilder sb2, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        f0.p(sb2, "<this>");
        f0.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder w(StringBuilder sb2, byte b10) {
        f0.p(sb2, "<this>");
        sb2.append((int) b10);
        f0.o(sb2, "append(value.toInt())");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder x(StringBuilder sb2, double d10) {
        f0.p(sb2, "<this>");
        sb2.append(d10);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder y(StringBuilder sb2, float f10) {
        f0.p(sb2, "<this>");
        sb2.append(f10);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }

    @u0(version = "1.4")
    @sh.f
    private static final StringBuilder z(StringBuilder sb2, int i10) {
        f0.p(sb2, "<this>");
        sb2.append(i10);
        f0.o(sb2, "append(value)");
        sb2.append('\n');
        f0.o(sb2, "append('\\n')");
        return sb2;
    }
}
