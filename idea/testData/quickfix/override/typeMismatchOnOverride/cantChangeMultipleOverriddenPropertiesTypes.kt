// "Change type of overriden property 'A.x' to '(Int) -> Int'" "false"
// ACTION: Add full qualifier
// ACTION: Change type to '(String) -> Int'
// ACTION: Go To Super Property
// ACTION: Introduce import alias
// ERROR: Type of 'x' is not a subtype of the overridden property 'public abstract val x: (String) -> Int defined in A'
interface A {
    val x: (String) -> Int
}

interface B {
    val x: (String) -> Any
}

interface C : A, B {
    override val x: (Int) -> Int<caret>
}
/* FIR_COMPARISON */