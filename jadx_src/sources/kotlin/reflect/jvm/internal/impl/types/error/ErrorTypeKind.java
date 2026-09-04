package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.jvm.internal.u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNRESOLVED_TYPE_ALIAS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: ErrorTypeKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ErrorTypeKind {
    public static final ErrorTypeKind AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final ErrorTypeKind CANNOT_COMPUTE_ERASED_BOUND;
    public static final ErrorTypeKind CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final ErrorTypeKind CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME;
    public static final ErrorTypeKind CYCLIC_SUPERTYPES;
    public static final ErrorTypeKind CYCLIC_UPPER_BOUNDS;
    public static final ErrorTypeKind DONT_CARE;
    public static final ErrorTypeKind EMPTY_CALLABLE_REFERENCE;
    public static final ErrorTypeKind ERROR_CLASS;
    public static final ErrorTypeKind ERROR_CONSTANT_VALUE;
    public static final ErrorTypeKind ERROR_DATA_FLOW_TYPE;
    public static final ErrorTypeKind ERROR_ENUM_TYPE;
    public static final ErrorTypeKind ERROR_EXPECTED_TYPE;
    public static final ErrorTypeKind ERROR_EXPRESSION_TYPE;
    public static final ErrorTypeKind ERROR_FLEXIBLE_TYPE;
    public static final ErrorTypeKind ERROR_PROPERTY_TYPE;
    public static final ErrorTypeKind ERROR_RAW_TYPE;
    public static final ErrorTypeKind ERROR_RECEIVER_TYPE;
    public static final ErrorTypeKind ERROR_SUPER_TYPE;
    public static final ErrorTypeKind ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT;
    public static final ErrorTypeKind ERROR_TYPE_PARAMETER;
    public static final ErrorTypeKind ERROR_TYPE_PROJECTION;
    public static final ErrorTypeKind ERROR_WHILE_RECONSTRUCTING_BARE_TYPE;
    public static final ErrorTypeKind FUNCTION_PLACEHOLDER_TYPE;
    public static final ErrorTypeKind ILLEGAL_TYPE_RANGE_FOR_DYNAMIC;
    public static final ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_FUNCTION;
    public static final ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_PROPERTY;
    public static final ErrorTypeKind IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final ErrorTypeKind INCONSISTENT_SUSPEND_FUNCTION;
    public static final ErrorTypeKind INTERSECTION_OF_ERROR_TYPES;
    public static final ErrorTypeKind KAPT_ERROR_TYPE;
    public static final ErrorTypeKind MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
    public static final ErrorTypeKind MISSED_TYPE_FOR_PARAMETER;
    public static final ErrorTypeKind NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT;
    public static final ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_CLASS;
    public static final ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_FUNCTION;
    public static final ErrorTypeKind NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER;
    public static final ErrorTypeKind NOT_FOUND_FQNAME;
    public static final ErrorTypeKind NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
    public static final ErrorTypeKind NOT_FOUND_UNSIGNED_TYPE;
    public static final ErrorTypeKind NO_RECORDED_TYPE;
    public static final ErrorTypeKind NO_TYPE_FOR_LOOP_PARAMETER;
    public static final ErrorTypeKind NO_TYPE_FOR_LOOP_RANGE;
    public static final ErrorTypeKind NO_TYPE_SPECIFIED;
    public static final ErrorTypeKind PARSE_ERROR_ARGUMENT;
    public static final ErrorTypeKind PROHIBITED_DYNAMIC_TYPE;
    public static final ErrorTypeKind RECURSIVE_ANNOTATION_TYPE;
    public static final ErrorTypeKind RECURSIVE_TYPE;
    public static final ErrorTypeKind RECURSIVE_TYPE_ALIAS;
    public static final ErrorTypeKind RESOLUTION_ERROR_TYPE;
    public static final ErrorTypeKind RETURN_NOT_ALLOWED;
    public static final ErrorTypeKind RETURN_TYPE;
    public static final ErrorTypeKind RETURN_TYPE_FOR_CONSTRUCTOR;
    public static final ErrorTypeKind RETURN_TYPE_FOR_FUNCTION;
    public static final ErrorTypeKind RETURN_TYPE_FOR_PROPERTY;
    public static final ErrorTypeKind STAR_PROJECTION_IN_CALL;
    public static final ErrorTypeKind STUB_TYPE;
    public static final ErrorTypeKind SUPER_TYPE_FOR_ERROR_TYPE;
    public static final ErrorTypeKind SYNTHETIC_ELEMENT_ERROR_TYPE;
    public static final ErrorTypeKind TYPE_FOR_COMPILER_EXCEPTION;
    public static final ErrorTypeKind TYPE_FOR_DELEGATION;
    public static final ErrorTypeKind TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
    public static final ErrorTypeKind TYPE_FOR_GENERATED_ERROR_EXPRESSION;
    public static final ErrorTypeKind TYPE_FOR_RESULT;
    public static final ErrorTypeKind TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS;
    public static final ErrorTypeKind UNABLE_TO_SUBSTITUTE_TYPE;
    public static final ErrorTypeKind UNAVAILABLE_TYPE_FOR_DECLARATION;
    public static final ErrorTypeKind UNEXPECTED_FLEXIBLE_TYPE_ID;
    public static final ErrorTypeKind UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE;
    public static final ErrorTypeKind UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final ErrorTypeKind UNINFERRED_TYPE_VARIABLE;
    public static final ErrorTypeKind UNIT_RETURN_TYPE_FOR_INC_DEC;
    public static final ErrorTypeKind UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    public static final ErrorTypeKind UNKNOWN_TYPE;
    public static final ErrorTypeKind UNMAPPED_ANNOTATION_TARGET_TYPE;
    public static final ErrorTypeKind UNRESOLVED_TYPE_ALIAS;
    public static final ErrorTypeKind UNSUPPORTED_CALLABLE_REFERENCE_TYPE;

    @dl.d
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final ErrorTypeKind UNRESOLVED_TYPE = new ErrorTypeKind("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final ErrorTypeKind UNRESOLVED_TYPE_PARAMETER_TYPE = new ErrorTypeKind("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final ErrorTypeKind UNRESOLVED_CLASS_TYPE = new ErrorTypeKind("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final ErrorTypeKind UNRESOLVED_JAVA_CLASS = new ErrorTypeKind("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final ErrorTypeKind UNRESOLVED_DECLARATION = new ErrorTypeKind("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final ErrorTypeKind UNRESOLVED_KCLASS_CONSTANT_VALUE = new ErrorTypeKind("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final ErrorTypeKind UNRESOLVED_PARCEL_TYPE = new ErrorTypeKind("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);
    private static final /* synthetic */ ErrorTypeKind[] $VALUES = $values();

    private static final /* synthetic */ ErrorTypeKind[] $values() {
        return new ErrorTypeKind[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    static {
        boolean z10 = false;
        int i10 = 2;
        u uVar = null;
        UNRESOLVED_TYPE_ALIAS = new ErrorTypeKind("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", z10, i10, uVar);
        boolean z11 = false;
        int i11 = 2;
        u uVar2 = null;
        RETURN_TYPE = new ErrorTypeKind("RETURN_TYPE", 7, "Return type for %s cannot be resolved", z11, i11, uVar2);
        RETURN_TYPE_FOR_FUNCTION = new ErrorTypeKind("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", z10, i10, uVar);
        RETURN_TYPE_FOR_PROPERTY = new ErrorTypeKind("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", z11, i11, uVar2);
        RETURN_TYPE_FOR_CONSTRUCTOR = new ErrorTypeKind("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", z10, i10, uVar);
        IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", z11, i11, uVar2);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", z10, i10, uVar);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", z11, i11, uVar2);
        ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new ErrorTypeKind("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", z10, i10, uVar);
        RECURSIVE_TYPE = new ErrorTypeKind("RECURSIVE_TYPE", 15, "Recursive type", z11, i11, uVar2);
        RECURSIVE_TYPE_ALIAS = new ErrorTypeKind("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", z10, i10, uVar);
        RECURSIVE_ANNOTATION_TYPE = new ErrorTypeKind("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", z11, i11, uVar2);
        CYCLIC_UPPER_BOUNDS = new ErrorTypeKind("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", z10, i10, uVar);
        CYCLIC_SUPERTYPES = new ErrorTypeKind("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", z11, i11, uVar2);
        UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new ErrorTypeKind("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", z10, i10, uVar);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new ErrorTypeKind("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", z11, i11, uVar2);
        UNINFERRED_TYPE_VARIABLE = new ErrorTypeKind("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", z10, i10, uVar);
        RESOLUTION_ERROR_TYPE = new ErrorTypeKind("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", z11, i11, uVar2);
        ERROR_EXPECTED_TYPE = new ErrorTypeKind("ERROR_EXPECTED_TYPE", 24, "Error expected type", z10, i10, uVar);
        ERROR_DATA_FLOW_TYPE = new ErrorTypeKind("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", z11, i11, uVar2);
        ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new ErrorTypeKind("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", z10, i10, uVar);
        UNABLE_TO_SUBSTITUTE_TYPE = new ErrorTypeKind("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", z11, i11, uVar2);
        DONT_CARE = new ErrorTypeKind("DONT_CARE", 28, "Special DONT_CARE type", z10, i10, uVar);
        STUB_TYPE = new ErrorTypeKind("STUB_TYPE", 29, "Stub type %s", z11, i11, uVar2);
        FUNCTION_PLACEHOLDER_TYPE = new ErrorTypeKind("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", z10, i10, uVar);
        TYPE_FOR_RESULT = new ErrorTypeKind("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", z11, i11, uVar2);
        TYPE_FOR_COMPILER_EXCEPTION = new ErrorTypeKind("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", z10, i10, uVar);
        ERROR_FLEXIBLE_TYPE = new ErrorTypeKind("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", z11, i11, uVar2);
        ERROR_RAW_TYPE = new ErrorTypeKind("ERROR_RAW_TYPE", 34, "Error raw type %s", z10, i10, uVar);
        TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new ErrorTypeKind("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", z11, i11, uVar2);
        ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new ErrorTypeKind("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", z10, i10, uVar);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", z11, i11, uVar2);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", z10, i10, uVar);
        INCONSISTENT_SUSPEND_FUNCTION = new ErrorTypeKind("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", z11, i11, uVar2);
        UNEXPECTED_FLEXIBLE_TYPE_ID = new ErrorTypeKind("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", z10, i10, uVar);
        UNKNOWN_TYPE = new ErrorTypeKind("UNKNOWN_TYPE", 41, "Unknown type", z11, i11, uVar2);
        NO_TYPE_SPECIFIED = new ErrorTypeKind("NO_TYPE_SPECIFIED", 42, "No type specified for %s", z10, i10, uVar);
        NO_TYPE_FOR_LOOP_RANGE = new ErrorTypeKind("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", z11, i11, uVar2);
        NO_TYPE_FOR_LOOP_PARAMETER = new ErrorTypeKind("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", z10, i10, uVar);
        MISSED_TYPE_FOR_PARAMETER = new ErrorTypeKind("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", z11, i11, uVar2);
        MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new ErrorTypeKind("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", z10, i10, uVar);
        PARSE_ERROR_ARGUMENT = new ErrorTypeKind("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", z11, i11, uVar2);
        STAR_PROJECTION_IN_CALL = new ErrorTypeKind("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", z10, i10, uVar);
        PROHIBITED_DYNAMIC_TYPE = new ErrorTypeKind("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", z11, i11, uVar2);
        NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new ErrorTypeKind("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", z10, i10, uVar);
        UNIT_RETURN_TYPE_FOR_INC_DEC = new ErrorTypeKind("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", z11, i11, uVar2);
        RETURN_NOT_ALLOWED = new ErrorTypeKind("RETURN_NOT_ALLOWED", 52, "Return not allowed", z10, i10, uVar);
        KAPT_ERROR_TYPE = new ErrorTypeKind("KAPT_ERROR_TYPE", 54, "Kapt error type", z10, i10, uVar);
        SYNTHETIC_ELEMENT_ERROR_TYPE = new ErrorTypeKind("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", z11, i11, uVar2);
        boolean z12 = false;
        int i12 = 2;
        u uVar3 = null;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new ErrorTypeKind("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", z12, i12, uVar3);
        boolean z13 = false;
        int i13 = 2;
        u uVar4 = null;
        ERROR_EXPRESSION_TYPE = new ErrorTypeKind("ERROR_EXPRESSION_TYPE", 57, "Error expression type", z13, i13, uVar4);
        ERROR_RECEIVER_TYPE = new ErrorTypeKind("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", z12, i12, uVar3);
        ERROR_CONSTANT_VALUE = new ErrorTypeKind("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", z13, i13, uVar4);
        EMPTY_CALLABLE_REFERENCE = new ErrorTypeKind("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", z12, i12, uVar3);
        UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new ErrorTypeKind("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", z13, i13, uVar4);
        TYPE_FOR_DELEGATION = new ErrorTypeKind("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", z12, i12, uVar3);
        UNAVAILABLE_TYPE_FOR_DECLARATION = new ErrorTypeKind("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", z13, i13, uVar4);
        ERROR_TYPE_PARAMETER = new ErrorTypeKind("ERROR_TYPE_PARAMETER", 64, "Error type parameter", z12, i12, uVar3);
        ERROR_TYPE_PROJECTION = new ErrorTypeKind("ERROR_TYPE_PROJECTION", 65, "Error type projection", z13, i13, uVar4);
        ERROR_SUPER_TYPE = new ErrorTypeKind("ERROR_SUPER_TYPE", 66, "Error super type", z12, i12, uVar3);
        SUPER_TYPE_FOR_ERROR_TYPE = new ErrorTypeKind("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", z13, i13, uVar4);
        ERROR_PROPERTY_TYPE = new ErrorTypeKind("ERROR_PROPERTY_TYPE", 68, "Error property type", z12, i12, uVar3);
        ERROR_CLASS = new ErrorTypeKind("ERROR_CLASS", 69, "Error class", z13, i13, uVar4);
        TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new ErrorTypeKind("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", z12, i12, uVar3);
        INTERSECTION_OF_ERROR_TYPES = new ErrorTypeKind("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", z13, i13, uVar4);
        CANNOT_COMPUTE_ERASED_BOUND = new ErrorTypeKind("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", z12, i12, uVar3);
        NOT_FOUND_UNSIGNED_TYPE = new ErrorTypeKind("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", z13, i13, uVar4);
        ERROR_ENUM_TYPE = new ErrorTypeKind("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", z12, i12, uVar3);
        NO_RECORDED_TYPE = new ErrorTypeKind("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", z13, i13, uVar4);
        NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", z12, i12, uVar3);
        NOT_FOUND_DESCRIPTOR_FOR_CLASS = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", z13, i13, uVar4);
        NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", z12, i12, uVar3);
        UNMAPPED_ANNOTATION_TARGET_TYPE = new ErrorTypeKind("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", z13, i13, uVar4);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new ErrorTypeKind("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", z12, i12, uVar3);
        NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new ErrorTypeKind("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", z13, i13, uVar4);
        NOT_FOUND_FQNAME = new ErrorTypeKind("NOT_FOUND_FQNAME", 82, "No fqName for %s", z12, i12, uVar3);
        TYPE_FOR_GENERATED_ERROR_EXPRESSION = new ErrorTypeKind("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", z13, i13, uVar4);
    }

    private ErrorTypeKind(String str, int i10, String str2, boolean z10) {
        super(str, i10);
        this.debugMessage = str2;
        this.isUnresolved = z10;
    }

    /* synthetic */ ErrorTypeKind(String str, int i10, String str2, boolean z10, int i11, u uVar) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }

    public static ErrorTypeKind valueOf(String str) {
        return (ErrorTypeKind) Enum.valueOf(ErrorTypeKind.class, str);
    }

    public static ErrorTypeKind[] values() {
        return (ErrorTypeKind[]) $VALUES.clone();
    }

    @dl.d
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final boolean isUnresolved() {
        return this.isUnresolved;
    }
}
