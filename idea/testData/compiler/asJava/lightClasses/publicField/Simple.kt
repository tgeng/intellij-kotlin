// C
// WITH_RUNTIME

class C {
    @[kotlin.jvm.JvmField] public val foo: String = { "A" }()
}

// FIR_COMPARISON