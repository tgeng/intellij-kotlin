// "Replace with safe (?.) call" "true"
// WITH_RUNTIME
class T {
    fun foo(s: String?) = s<caret>.length
}
/* FIR_COMPARISON */