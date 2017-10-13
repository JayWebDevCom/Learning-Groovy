/**
 is compiled, not interpreted, then runs on the jvm
 dynamic - add and modify behaviour at runtime
 type checking
 JDK is underlying groovy class library is the JDK
 in the terminal write groovyConsole !

 Where to use groovy:
 process json data
 process jackson data
 incorporate libraries
 process xml
 testing!

 */

class Main {

    static void main(String[] args) {
        def result = "OK"
        println "Result: ${result}"
        println "Result: $result"

        // it keyword is an implicit variable if no arguments then can be referenced with it or i
        (0..10).collect { 2 ** it }.forEach { print it + ' ' }
        println()
        (0..10).stream().map { 2 ** it }.forEach { print it + ' ' }
        println()


    }
}