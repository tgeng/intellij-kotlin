// PSI_ELEMENT: org.jetbrains.kotlin.psi.KtNamedFunction
// OPTIONS: usages
// FIR_COMPARISON

package anonymousUnused

fun main(args: Array<String>) {
    fun localObject() = object : Any() {
        fun <caret>f() {
        }
    }

    localObject().f()
}