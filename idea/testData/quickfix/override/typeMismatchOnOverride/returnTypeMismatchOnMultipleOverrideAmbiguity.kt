// "Change 'B.foo' function return type to 'Int'" "false"
// "Change 'B.foo' function return type to 'Long'" "false"
// "Remove explicitly specified return type" "false"
// ACTION: Add full qualifier
// ACTION: Go To Super Method
// ACTION: Introduce import alias
// ERROR: Return type of 'foo' is not a subtype of the return type of the overridden member 'public abstract fun foo(): Int defined in A'
abstract class A {
    abstract fun foo() : Int;
}

interface X {
    fun foo() : Long;
}

abstract class B : A(), X {
    abstract override fun foo() : String<caret>
}
/* FIR_COMPARISON */