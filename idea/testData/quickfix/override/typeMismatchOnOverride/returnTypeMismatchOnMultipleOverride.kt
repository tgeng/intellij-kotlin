// "Change return type to 'T'" "true"
open class S {}
open class T : S() {}

abstract class A {
    abstract fun foo() : S;
}

interface X {
    fun foo() : T;
}

abstract class B : A(), X {
    override abstract fun foo(): Int<caret>
}

/* FIR_COMPARISON */